package com.huaweicloud.sdk.vpn.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpn.v5.model.AddVpnUserToGroupRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.AddVpnUsersToGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.AddVpnUsersToGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.CheckClientCaCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.CheckClientCaCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.CountResourcesByTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.CountResourcesByTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateResourcesTagsRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateServerRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnAccessPolicyRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnAccessPolicyRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnAccessPolicyResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnGatewayCertificateRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnServerRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnServerResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserGroupRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteClientCaRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteClientCaResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteResourcesTagsRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnAccessPolicyRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnAccessPolicyResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnUserGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnUserGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnUserRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnUserResponse;
import com.huaweicloud.sdk.vpn.v5.model.ExportClientConfigRequest;
import com.huaweicloud.sdk.vpn.v5.model.ExportClientConfigResponse;
import com.huaweicloud.sdk.vpn.v5.model.ImportClientCaCertificateRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.ImportClientCaRequest;
import com.huaweicloud.sdk.vpn.v5.model.ImportClientCaResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListCgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListCgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListConnectionMonitorsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListConnectionMonitorsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwAvailabilityZonesRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwAvailabilityZonesResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwConnectionsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwConnectionsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListResourcesByTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListResourcesByTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnAccessPoliciesRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnAccessPoliciesResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnServersByProjectRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnServersByProjectResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnServersByVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnServersByVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUserGroupsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUserGroupsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUsersInGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUsersInGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUsersRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUsersResponse;
import com.huaweicloud.sdk.vpn.v5.model.QueryResourcesRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.RemoveVpnUserFromGroupRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.RemoveVpnUsersFromGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.RemoveVpnUsersFromGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.ResetVpnUserPasswordRequest;
import com.huaweicloud.sdk.vpn.v5.model.ResetVpnUserPasswordRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.ResetVpnUserPasswordResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowClientCaRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowClientCaResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowP2cVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowP2cVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnAccessPolicyRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnAccessPolicyResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnUserGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnUserGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnUserRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnUserResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateClientCaCertificateRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateClientCaRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateClientCaResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateP2cVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateP2cVgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateP2cVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdatePostpaidVgwSpecificationRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdatePostpaidVgwSpecificationResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateServerRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwSpecificationRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnAccessPolicyRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnAccessPolicyRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnAccessPolicyResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnGatewayCertificateRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnServerRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnServerResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserGroupRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserPasswordRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserPasswordRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserPasswordResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class VpnMeta {

    public static final HttpRequestDef<CheckClientCaCertificateRequest, CheckClientCaCertificateResponse> checkClientCaCertificate =
        genForCheckClientCaCertificate();

    private static HttpRequestDef<CheckClientCaCertificateRequest, CheckClientCaCertificateResponse> genForCheckClientCaCertificate() {
        // basic
        HttpRequestDef.Builder<CheckClientCaCertificateRequest, CheckClientCaCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CheckClientCaCertificateRequest.class, CheckClientCaCertificateResponse.class)
                .withName("CheckClientCaCertificate")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/client-ca-certificates/check")
                .withContentType("application/json");

        // requests
        builder.<ImportClientCaCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportClientCaCertificateRequestBody.class),
            f -> f.withMarshaller(CheckClientCaCertificateRequest::getBody, CheckClientCaCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClientCaRequest, DeleteClientCaResponse> deleteClientCa =
        genForDeleteClientCa();

    private static HttpRequestDef<DeleteClientCaRequest, DeleteClientCaResponse> genForDeleteClientCa() {
        // basic
        HttpRequestDef.Builder<DeleteClientCaRequest, DeleteClientCaResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteClientCaRequest.class, DeleteClientCaResponse.class)
            .withName("DeleteClientCa")
            .withUri(
                "/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/client-ca-certificates/{client_ca_certificate_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClientCaRequest::getVpnServerId, DeleteClientCaRequest::setVpnServerId));
        builder.<String>withRequestField("client_ca_certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClientCaRequest::getClientCaCertificateId,
                DeleteClientCaRequest::setClientCaCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportClientCaRequest, ImportClientCaResponse> importClientCa =
        genForImportClientCa();

    private static HttpRequestDef<ImportClientCaRequest, ImportClientCaResponse> genForImportClientCa() {
        // basic
        HttpRequestDef.Builder<ImportClientCaRequest, ImportClientCaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportClientCaRequest.class, ImportClientCaResponse.class)
                .withName("ImportClientCa")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/client-ca-certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportClientCaRequest::getVpnServerId, ImportClientCaRequest::setVpnServerId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportClientCaRequest::getXClientToken, ImportClientCaRequest::setXClientToken));
        builder.<ImportClientCaCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportClientCaCertificateRequestBody.class),
            f -> f.withMarshaller(ImportClientCaRequest::getBody, ImportClientCaRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ImportClientCaResponse::getHeaderResponseToken,
                ImportClientCaResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<ShowClientCaRequest, ShowClientCaResponse> showClientCa = genForShowClientCa();

    private static HttpRequestDef<ShowClientCaRequest, ShowClientCaResponse> genForShowClientCa() {
        // basic
        HttpRequestDef.Builder<ShowClientCaRequest, ShowClientCaResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowClientCaRequest.class, ShowClientCaResponse.class)
            .withName("ShowClientCa")
            .withUri(
                "/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/client-ca-certificates/{client_ca_certificate_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClientCaRequest::getVpnServerId, ShowClientCaRequest::setVpnServerId));
        builder.<String>withRequestField("client_ca_certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClientCaRequest::getClientCaCertificateId,
                ShowClientCaRequest::setClientCaCertificateId));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowClientCaResponse::getHeaderResponseToken,
                ShowClientCaResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateClientCaRequest, UpdateClientCaResponse> updateClientCa =
        genForUpdateClientCa();

    private static HttpRequestDef<UpdateClientCaRequest, UpdateClientCaResponse> genForUpdateClientCa() {
        // basic
        HttpRequestDef.Builder<UpdateClientCaRequest, UpdateClientCaResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateClientCaRequest.class, UpdateClientCaResponse.class)
            .withName("UpdateClientCa")
            .withUri(
                "/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/client-ca-certificates/{client_ca_certificate_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClientCaRequest::getVpnServerId, UpdateClientCaRequest::setVpnServerId));
        builder.<String>withRequestField("client_ca_certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClientCaRequest::getClientCaCertificateId,
                UpdateClientCaRequest::setClientCaCertificateId));
        builder.<UpdateClientCaCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClientCaCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateClientCaRequest::getBody, UpdateClientCaRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateClientCaResponse::getHeaderResponseToken,
                UpdateClientCaResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse> createConnectionMonitor =
        genForCreateConnectionMonitor();

    private static HttpRequestDef<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse> genForCreateConnectionMonitor() {
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
            f -> f.withMarshaller(CreateConnectionMonitorRequest::getBody, CreateConnectionMonitorRequest::setBody));

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
        genForDeleteConnectionMonitor();

    private static HttpRequestDef<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse> genForDeleteConnectionMonitor() {
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
            f -> f.withMarshaller(DeleteConnectionMonitorRequest::getConnectionMonitorId,
                DeleteConnectionMonitorRequest::setConnectionMonitorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse> listConnectionMonitors =
        genForListConnectionMonitors();

    private static HttpRequestDef<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse> genForListConnectionMonitors() {
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
            f -> f.withMarshaller(ListConnectionMonitorsRequest::getVpnConnectionId,
                ListConnectionMonitorsRequest::setVpnConnectionId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListConnectionMonitorsRequest::getEnterpriseProjectId,
                ListConnectionMonitorsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse> showConnectionMonitor =
        genForShowConnectionMonitor();

    private static HttpRequestDef<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse> genForShowConnectionMonitor() {
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
            f -> f.withMarshaller(ShowConnectionMonitorRequest::getConnectionMonitorId,
                ShowConnectionMonitorRequest::setConnectionMonitorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCgwRequest, CreateCgwResponse> createCgw = genForCreateCgw();

    private static HttpRequestDef<CreateCgwRequest, CreateCgwResponse> genForCreateCgw() {
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
            f -> f.withMarshaller(CreateCgwRequest::getBody, CreateCgwRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCgwResponse::getHeaderResponseToken,
                CreateCgwResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteCgwRequest, DeleteCgwResponse> deleteCgw = genForDeleteCgw();

    private static HttpRequestDef<DeleteCgwRequest, DeleteCgwResponse> genForDeleteCgw() {
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
            f -> f.withMarshaller(DeleteCgwRequest::getCustomerGatewayId, DeleteCgwRequest::setCustomerGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCgwsRequest, ListCgwsResponse> listCgws = genForListCgws();

    private static HttpRequestDef<ListCgwsRequest, ListCgwsResponse> genForListCgws() {
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
            f -> f.withMarshaller(ListCgwsRequest::getCgwId, ListCgwsRequest::setCgwId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCgwsRequest::getLimit, ListCgwsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCgwsRequest::getMarker, ListCgwsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCgwRequest, ShowCgwResponse> showCgw = genForShowCgw();

    private static HttpRequestDef<ShowCgwRequest, ShowCgwResponse> genForShowCgw() {
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
            f -> f.withMarshaller(ShowCgwRequest::getCustomerGatewayId, ShowCgwRequest::setCustomerGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCgwRequest, UpdateCgwResponse> updateCgw = genForUpdateCgw();

    private static HttpRequestDef<UpdateCgwRequest, UpdateCgwResponse> genForUpdateCgw() {
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
            f -> f.withMarshaller(UpdateCgwRequest::getCustomerGatewayId, UpdateCgwRequest::setCustomerGatewayId));
        builder.<UpdateCgwRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCgwRequestBody.class),
            f -> f.withMarshaller(UpdateCgwRequest::getBody, UpdateCgwRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListP2cVgwAvailabilityZonesRequest, ListP2cVgwAvailabilityZonesResponse> listP2cVgwAvailabilityZones =
        genForListP2cVgwAvailabilityZones();

    private static HttpRequestDef<ListP2cVgwAvailabilityZonesRequest, ListP2cVgwAvailabilityZonesResponse> genForListP2cVgwAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListP2cVgwAvailabilityZonesRequest, ListP2cVgwAvailabilityZonesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListP2cVgwAvailabilityZonesRequest.class,
                    ListP2cVgwAvailabilityZonesResponse.class)
                .withName("ListP2cVgwAvailabilityZones")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/availability-zones")
                .withContentType("application/json");

        // requests
        builder.<ListP2cVgwAvailabilityZonesRequest.FlavorEnum>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListP2cVgwAvailabilityZonesRequest.FlavorEnum.class),
            f -> f.withMarshaller(ListP2cVgwAvailabilityZonesRequest::getFlavor,
                ListP2cVgwAvailabilityZonesRequest::setFlavor));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListP2cVgwConnectionsRequest, ListP2cVgwConnectionsResponse> listP2cVgwConnections =
        genForListP2cVgwConnections();

    private static HttpRequestDef<ListP2cVgwConnectionsRequest, ListP2cVgwConnectionsResponse> genForListP2cVgwConnections() {
        // basic
        HttpRequestDef.Builder<ListP2cVgwConnectionsRequest, ListP2cVgwConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListP2cVgwConnectionsRequest.class, ListP2cVgwConnectionsResponse.class)
            .withName("ListP2cVgwConnections")
            .withUri("/v5/{project_id}/p2c-vpn-gateways/{p2c_vgw_id}/connections")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("p2c_vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListP2cVgwConnectionsRequest::getP2cVgwId,
                ListP2cVgwConnectionsRequest::setP2cVgwId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListP2cVgwConnectionsRequest::getLimit, ListP2cVgwConnectionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListP2cVgwConnectionsRequest::getOffset, ListP2cVgwConnectionsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListP2cVgwsRequest, ListP2cVgwsResponse> listP2cVgws = genForListP2cVgws();

    private static HttpRequestDef<ListP2cVgwsRequest, ListP2cVgwsResponse> genForListP2cVgws() {
        // basic
        HttpRequestDef.Builder<ListP2cVgwsRequest, ListP2cVgwsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListP2cVgwsRequest.class, ListP2cVgwsResponse.class)
                .withName("ListP2cVgws")
                .withUri("/v5/{project_id}/p2c-vpn-gateways")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowP2cVgwRequest, ShowP2cVgwResponse> showP2cVgw = genForShowP2cVgw();

    private static HttpRequestDef<ShowP2cVgwRequest, ShowP2cVgwResponse> genForShowP2cVgw() {
        // basic
        HttpRequestDef.Builder<ShowP2cVgwRequest, ShowP2cVgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowP2cVgwRequest.class, ShowP2cVgwResponse.class)
                .withName("ShowP2cVgw")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/{p2c_vgw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("p2c_vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowP2cVgwRequest::getP2cVgwId, ShowP2cVgwRequest::setP2cVgwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateP2cVgwRequest, UpdateP2cVgwResponse> updateP2cVgw = genForUpdateP2cVgw();

    private static HttpRequestDef<UpdateP2cVgwRequest, UpdateP2cVgwResponse> genForUpdateP2cVgw() {
        // basic
        HttpRequestDef.Builder<UpdateP2cVgwRequest, UpdateP2cVgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateP2cVgwRequest.class, UpdateP2cVgwResponse.class)
                .withName("UpdateP2cVgw")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/{p2c_vgw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("p2c_vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateP2cVgwRequest::getP2cVgwId, UpdateP2cVgwRequest::setP2cVgwId));
        builder.<UpdateP2cVgwRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateP2cVgwRequestBody.class),
            f -> f.withMarshaller(UpdateP2cVgwRequest::getBody, UpdateP2cVgwRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateP2cVgwResponse::getHeaderResponseToken,
                UpdateP2cVgwResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTags =
        genForBatchCreateResourceTags();

    private static HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> genForBatchCreateResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateResourceTagsRequest.class, BatchCreateResourceTagsResponse.class)
            .withName("BatchCreateResourceTags")
            .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags/create")
            .withContentType("application/json");

        // requests
        builder.<BatchCreateResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceType,
                BatchCreateResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceId,
                BatchCreateResourceTagsRequest::setResourceId));
        builder.<CreateResourcesTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourcesTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getBody, BatchCreateResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> batchDeleteResourceTags =
        genForBatchDeleteResourceTags();

    private static HttpRequestDef<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> genForBatchDeleteResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteResourceTagsRequest.class, BatchDeleteResourceTagsResponse.class)
            .withName("BatchDeleteResourceTags")
            .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchDeleteResourceTagsRequest::getResourceType,
                BatchDeleteResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceTagsRequest::getResourceId,
                BatchDeleteResourceTagsRequest::setResourceId));
        builder.<DeleteResourcesTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourcesTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteResourceTagsRequest::getBody, BatchDeleteResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountResourcesByTagsRequest, CountResourcesByTagsResponse> countResourcesByTags =
        genForCountResourcesByTags();

    private static HttpRequestDef<CountResourcesByTagsRequest, CountResourcesByTagsResponse> genForCountResourcesByTags() {
        // basic
        HttpRequestDef.Builder<CountResourcesByTagsRequest, CountResourcesByTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CountResourcesByTagsRequest.class, CountResourcesByTagsResponse.class)
            .withName("CountResourcesByTags")
            .withUri("/v5/{project_id}/{resource_type}/resource-instances/count")
            .withContentType("application/json");

        // requests
        builder.<CountResourcesByTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CountResourcesByTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CountResourcesByTagsRequest::getResourceType,
                CountResourcesByTagsRequest::setResourceType));
        builder.<QueryResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourcesRequestBody.class),
            f -> f.withMarshaller(CountResourcesByTagsRequest::getBody, CountResourcesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v5/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListProjectTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProjectTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, ListProjectTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTags =
        genForListResourcesByTags();

    private static HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> genForListResourcesByTags() {
        // basic
        HttpRequestDef.Builder<ListResourcesByTagsRequest, ListResourcesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourcesByTagsRequest.class, ListResourcesByTagsResponse.class)
                .withName("ListResourcesByTags")
                .withUri("/v5/{project_id}/{resource_type}/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<ListResourcesByTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourcesByTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getResourceType,
                ListResourcesByTagsRequest::setResourceType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getLimit, ListResourcesByTagsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getOffset, ListResourcesByTagsRequest::setOffset));
        builder.<QueryResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourcesRequestBody.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getBody, ListResourcesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTags =
        genForShowResourceTags();

    private static HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> genForShowResourceTags() {
        // basic
        HttpRequestDef.Builder<ShowResourceTagsRequest, ShowResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceTagsRequest.class, ShowResourceTagsResponse.class)
                .withName("ShowResourceTags")
                .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ShowResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceType, ShowResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceId, ShowResourceTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpnAccessPolicyRequest, CreateVpnAccessPolicyResponse> createVpnAccessPolicy =
        genForCreateVpnAccessPolicy();

    private static HttpRequestDef<CreateVpnAccessPolicyRequest, CreateVpnAccessPolicyResponse> genForCreateVpnAccessPolicy() {
        // basic
        HttpRequestDef.Builder<CreateVpnAccessPolicyRequest, CreateVpnAccessPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVpnAccessPolicyRequest.class, CreateVpnAccessPolicyResponse.class)
            .withName("CreateVpnAccessPolicy")
            .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/access-policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpnAccessPolicyRequest::getVpnServerId,
                CreateVpnAccessPolicyRequest::setVpnServerId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpnAccessPolicyRequest::getXClientToken,
                CreateVpnAccessPolicyRequest::setXClientToken));
        builder.<CreateVpnAccessPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpnAccessPolicyRequestBody.class),
            f -> f.withMarshaller(CreateVpnAccessPolicyRequest::getBody, CreateVpnAccessPolicyRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVpnAccessPolicyResponse::getHeaderResponseToken,
                CreateVpnAccessPolicyResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpnAccessPolicyRequest, DeleteVpnAccessPolicyResponse> deleteVpnAccessPolicy =
        genForDeleteVpnAccessPolicy();

    private static HttpRequestDef<DeleteVpnAccessPolicyRequest, DeleteVpnAccessPolicyResponse> genForDeleteVpnAccessPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteVpnAccessPolicyRequest, DeleteVpnAccessPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVpnAccessPolicyRequest.class, DeleteVpnAccessPolicyResponse.class)
            .withName("DeleteVpnAccessPolicy")
            .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/access-policies/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpnAccessPolicyRequest::getVpnServerId,
                DeleteVpnAccessPolicyRequest::setVpnServerId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpnAccessPolicyRequest::getPolicyId,
                DeleteVpnAccessPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpnAccessPoliciesRequest, ListVpnAccessPoliciesResponse> listVpnAccessPolicies =
        genForListVpnAccessPolicies();

    private static HttpRequestDef<ListVpnAccessPoliciesRequest, ListVpnAccessPoliciesResponse> genForListVpnAccessPolicies() {
        // basic
        HttpRequestDef.Builder<ListVpnAccessPoliciesRequest, ListVpnAccessPoliciesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVpnAccessPoliciesRequest.class, ListVpnAccessPoliciesResponse.class)
            .withName("ListVpnAccessPolicies")
            .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/access-policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnAccessPoliciesRequest::getVpnServerId,
                ListVpnAccessPoliciesRequest::setVpnServerId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpnAccessPoliciesRequest::getLimit, ListVpnAccessPoliciesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnAccessPoliciesRequest::getMarker, ListVpnAccessPoliciesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpnAccessPolicyRequest, ShowVpnAccessPolicyResponse> showVpnAccessPolicy =
        genForShowVpnAccessPolicy();

    private static HttpRequestDef<ShowVpnAccessPolicyRequest, ShowVpnAccessPolicyResponse> genForShowVpnAccessPolicy() {
        // basic
        HttpRequestDef.Builder<ShowVpnAccessPolicyRequest, ShowVpnAccessPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpnAccessPolicyRequest.class, ShowVpnAccessPolicyResponse.class)
                .withName("ShowVpnAccessPolicy")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/access-policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpnAccessPolicyRequest::getVpnServerId,
                ShowVpnAccessPolicyRequest::setVpnServerId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpnAccessPolicyRequest::getPolicyId, ShowVpnAccessPolicyRequest::setPolicyId));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVpnAccessPolicyResponse::getHeaderResponseToken,
                ShowVpnAccessPolicyResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpnAccessPolicyRequest, UpdateVpnAccessPolicyResponse> updateVpnAccessPolicy =
        genForUpdateVpnAccessPolicy();

    private static HttpRequestDef<UpdateVpnAccessPolicyRequest, UpdateVpnAccessPolicyResponse> genForUpdateVpnAccessPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateVpnAccessPolicyRequest, UpdateVpnAccessPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateVpnAccessPolicyRequest.class, UpdateVpnAccessPolicyResponse.class)
            .withName("UpdateVpnAccessPolicy")
            .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/access-policies/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnAccessPolicyRequest::getVpnServerId,
                UpdateVpnAccessPolicyRequest::setVpnServerId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnAccessPolicyRequest::getPolicyId,
                UpdateVpnAccessPolicyRequest::setPolicyId));
        builder.<UpdateVpnAccessPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpnAccessPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateVpnAccessPolicyRequest::getBody, UpdateVpnAccessPolicyRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVpnAccessPolicyResponse::getHeaderResponseToken,
                UpdateVpnAccessPolicyResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVpnConnectionRequest, CreateVpnConnectionResponse> createVpnConnection =
        genForCreateVpnConnection();

    private static HttpRequestDef<CreateVpnConnectionRequest, CreateVpnConnectionResponse> genForCreateVpnConnection() {
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
            f -> f.withMarshaller(CreateVpnConnectionRequest::getBody, CreateVpnConnectionRequest::setBody));

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
        genForDeleteVpnConnection();

    private static HttpRequestDef<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse> genForDeleteVpnConnection() {
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
            f -> f.withMarshaller(DeleteVpnConnectionRequest::getVpnConnectionId,
                DeleteVpnConnectionRequest::setVpnConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpnConnectionsRequest, ListVpnConnectionsResponse> listVpnConnections =
        genForListVpnConnections();

    private static HttpRequestDef<ListVpnConnectionsRequest, ListVpnConnectionsResponse> genForListVpnConnections() {
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
            f -> f.withMarshaller(ListVpnConnectionsRequest::getVpnId, ListVpnConnectionsRequest::setVpnId));
        builder.<String>withRequestField("eip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getEipId, ListVpnConnectionsRequest::setEipId));
        builder.<String>withRequestField("vgw_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getVgwIp, ListVpnConnectionsRequest::setVgwIp));
        builder.<String>withRequestField("vgw_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getVgwId, ListVpnConnectionsRequest::setVgwId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getEnterpriseProjectId,
                ListVpnConnectionsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getLimit, ListVpnConnectionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getMarker, ListVpnConnectionsRequest::setMarker));

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
        genForShowVpnConnection();

    private static HttpRequestDef<ShowVpnConnectionRequest, ShowVpnConnectionResponse> genForShowVpnConnection() {
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
            f -> f.withMarshaller(ShowVpnConnectionRequest::getVpnConnectionId,
                ShowVpnConnectionRequest::setVpnConnectionId));

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
        genForUpdateVpnConnection();

    private static HttpRequestDef<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse> genForUpdateVpnConnection() {
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
            f -> f.withMarshaller(UpdateVpnConnectionRequest::getVpnConnectionId,
                UpdateVpnConnectionRequest::setVpnConnectionId));
        builder.<UpdateVpnConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpnConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateVpnConnectionRequest::getBody, UpdateVpnConnectionRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVpnConnectionResponse::getHeaderResponseToken,
                UpdateVpnConnectionResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVgwRequest, CreateVgwResponse> createVgw = genForCreateVgw();

    private static HttpRequestDef<CreateVgwRequest, CreateVgwResponse> genForCreateVgw() {
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
            f -> f.withMarshaller(CreateVgwRequest::getBody, CreateVgwRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVgwResponse::getHeaderResponseToken,
                CreateVgwResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteVgwRequest, DeleteVgwResponse> deleteVgw = genForDeleteVgw();

    private static HttpRequestDef<DeleteVgwRequest, DeleteVgwResponse> genForDeleteVgw() {
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
            f -> f.withMarshaller(DeleteVgwRequest::getVgwId, DeleteVgwRequest::setVgwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForListAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForListAvailabilityZones() {
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

    public static final HttpRequestDef<ListVgwsRequest, ListVgwsResponse> listVgws = genForListVgws();

    private static HttpRequestDef<ListVgwsRequest, ListVgwsResponse> genForListVgws() {
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
            f -> f.withMarshaller(ListVgwsRequest::getVgwId, ListVgwsRequest::setVgwId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVgwsRequest::getEnterpriseProjectId, ListVgwsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVgwRequest, ShowVgwResponse> showVgw = genForShowVgw();

    private static HttpRequestDef<ShowVgwRequest, ShowVgwResponse> genForShowVgw() {
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
            f -> f.withMarshaller(ShowVgwRequest::getVgwId, ShowVgwRequest::setVgwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostpaidVgwSpecificationRequest, UpdatePostpaidVgwSpecificationResponse> updatePostpaidVgwSpecification =
        genForUpdatePostpaidVgwSpecification();

    private static HttpRequestDef<UpdatePostpaidVgwSpecificationRequest, UpdatePostpaidVgwSpecificationResponse> genForUpdatePostpaidVgwSpecification() {
        // basic
        HttpRequestDef.Builder<UpdatePostpaidVgwSpecificationRequest, UpdatePostpaidVgwSpecificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdatePostpaidVgwSpecificationRequest.class,
                    UpdatePostpaidVgwSpecificationResponse.class)
                .withName("UpdatePostpaidVgwSpecification")
                .withUri("/v5/{project_id}/vpn-gateways/{vgw_id}/update-specification")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostpaidVgwSpecificationRequest::getVgwId,
                UpdatePostpaidVgwSpecificationRequest::setVgwId));
        builder.<UpdateVgwSpecificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVgwSpecificationRequestBody.class),
            f -> f.withMarshaller(UpdatePostpaidVgwSpecificationRequest::getBody,
                UpdatePostpaidVgwSpecificationRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePostpaidVgwSpecificationResponse::getHeaderResponseToken,
                UpdatePostpaidVgwSpecificationResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateVgwRequest, UpdateVgwResponse> updateVgw = genForUpdateVgw();

    private static HttpRequestDef<UpdateVgwRequest, UpdateVgwResponse> genForUpdateVgw() {
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
            f -> f.withMarshaller(UpdateVgwRequest::getVgwId, UpdateVgwRequest::setVgwId));
        builder.<UpdateVgwRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVgwRequestBody.class),
            f -> f.withMarshaller(UpdateVgwRequest::getBody, UpdateVgwRequest::setBody));

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
        genForCreateVgwCertificate();

    private static HttpRequestDef<CreateVgwCertificateRequest, CreateVgwCertificateResponse> genForCreateVgwCertificate() {
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
            f -> f.withMarshaller(CreateVgwCertificateRequest::getVgwId, CreateVgwCertificateRequest::setVgwId));
        builder.<CreateVpnGatewayCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpnGatewayCertificateRequestBody.class),
            f -> f.withMarshaller(CreateVgwCertificateRequest::getBody, CreateVgwCertificateRequest::setBody));

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
        genForShowVpnGatewayCertificate();

    private static HttpRequestDef<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse> genForShowVpnGatewayCertificate() {
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
            f -> f.withMarshaller(ShowVpnGatewayCertificateRequest::getVgwId,
                ShowVpnGatewayCertificateRequest::setVgwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse> updateVgwCertificate =
        genForUpdateVgwCertificate();

    private static HttpRequestDef<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse> genForUpdateVgwCertificate() {
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
            f -> f.withMarshaller(UpdateVgwCertificateRequest::getVgwId, UpdateVgwCertificateRequest::setVgwId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVgwCertificateRequest::getCertificateId,
                UpdateVgwCertificateRequest::setCertificateId));
        builder.<UpdateVpnGatewayCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpnGatewayCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateVgwCertificateRequest::getBody, UpdateVgwCertificateRequest::setBody));

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
        genForShowQuotasInfo();

    private static HttpRequestDef<ShowQuotasInfoRequest, ShowQuotasInfoResponse> genForShowQuotasInfo() {
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

    public static final HttpRequestDef<CreateVpnServerRequest, CreateVpnServerResponse> createVpnServer =
        genForCreateVpnServer();

    private static HttpRequestDef<CreateVpnServerRequest, CreateVpnServerResponse> genForCreateVpnServer() {
        // basic
        HttpRequestDef.Builder<CreateVpnServerRequest, CreateVpnServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpnServerRequest.class, CreateVpnServerResponse.class)
                .withName("CreateVpnServer")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/{p2c_vgw_id}/vpn-servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("p2c_vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpnServerRequest::getP2cVgwId, CreateVpnServerRequest::setP2cVgwId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpnServerRequest::getXClientToken, CreateVpnServerRequest::setXClientToken));
        builder.<CreateServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServerRequestBody.class),
            f -> f.withMarshaller(CreateVpnServerRequest::getBody, CreateVpnServerRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVpnServerResponse::getHeaderResponseToken,
                CreateVpnServerResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<ExportClientConfigRequest, ExportClientConfigResponse> exportClientConfig =
        genForExportClientConfig();

    private static HttpRequestDef<ExportClientConfigRequest, ExportClientConfigResponse> genForExportClientConfig() {
        // basic
        HttpRequestDef.Builder<ExportClientConfigRequest, ExportClientConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportClientConfigRequest.class, ExportClientConfigResponse.class)
                .withName("ExportClientConfig")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/client-config/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportClientConfigRequest::getVpnServerId,
                ExportClientConfigRequest::setVpnServerId));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExportClientConfigResponse::getHeaderResponseToken,
                ExportClientConfigResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<ListVpnServersByProjectRequest, ListVpnServersByProjectResponse> listVpnServersByProject =
        genForListVpnServersByProject();

    private static HttpRequestDef<ListVpnServersByProjectRequest, ListVpnServersByProjectResponse> genForListVpnServersByProject() {
        // basic
        HttpRequestDef.Builder<ListVpnServersByProjectRequest, ListVpnServersByProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVpnServersByProjectRequest.class, ListVpnServersByProjectResponse.class)
            .withName("ListVpnServersByProject")
            .withUri("/v5/{project_id}/vpn-servers")
            .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpnServersByProjectResponse::getHeaderResponseToken,
                ListVpnServersByProjectResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<ListVpnServersByVgwRequest, ListVpnServersByVgwResponse> listVpnServersByVgw =
        genForListVpnServersByVgw();

    private static HttpRequestDef<ListVpnServersByVgwRequest, ListVpnServersByVgwResponse> genForListVpnServersByVgw() {
        // basic
        HttpRequestDef.Builder<ListVpnServersByVgwRequest, ListVpnServersByVgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpnServersByVgwRequest.class, ListVpnServersByVgwResponse.class)
                .withName("ListVpnServersByVgw")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/{p2c_vgw_id}/vpn-servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("p2c_vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnServersByVgwRequest::getP2cVgwId, ListVpnServersByVgwRequest::setP2cVgwId));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpnServersByVgwResponse::getHeaderResponseToken,
                ListVpnServersByVgwResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpnServerRequest, UpdateVpnServerResponse> updateVpnServer =
        genForUpdateVpnServer();

    private static HttpRequestDef<UpdateVpnServerRequest, UpdateVpnServerResponse> genForUpdateVpnServer() {
        // basic
        HttpRequestDef.Builder<UpdateVpnServerRequest, UpdateVpnServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpnServerRequest.class, UpdateVpnServerResponse.class)
                .withName("UpdateVpnServer")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnServerRequest::getVpnServerId, UpdateVpnServerRequest::setVpnServerId));
        builder.<UpdateServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerRequestBody.class),
            f -> f.withMarshaller(UpdateVpnServerRequest::getBody, UpdateVpnServerRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVpnServerResponse::getHeaderResponseToken,
                UpdateVpnServerResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVpnUserRequest, CreateVpnUserResponse> createVpnUser =
        genForCreateVpnUser();

    private static HttpRequestDef<CreateVpnUserRequest, CreateVpnUserResponse> genForCreateVpnUser() {
        // basic
        HttpRequestDef.Builder<CreateVpnUserRequest, CreateVpnUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpnUserRequest.class, CreateVpnUserResponse.class)
                .withName("CreateVpnUser")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpnUserRequest::getVpnServerId, CreateVpnUserRequest::setVpnServerId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpnUserRequest::getXClientToken, CreateVpnUserRequest::setXClientToken));
        builder.<CreateVpnUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpnUserRequestBody.class),
            f -> f.withMarshaller(CreateVpnUserRequest::getBody, CreateVpnUserRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVpnUserResponse::getHeaderResponseToken,
                CreateVpnUserResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpnUserRequest, DeleteVpnUserResponse> deleteVpnUser =
        genForDeleteVpnUser();

    private static HttpRequestDef<DeleteVpnUserRequest, DeleteVpnUserResponse> genForDeleteVpnUser() {
        // basic
        HttpRequestDef.Builder<DeleteVpnUserRequest, DeleteVpnUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpnUserRequest.class, DeleteVpnUserResponse.class)
                .withName("DeleteVpnUser")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpnUserRequest::getVpnServerId, DeleteVpnUserRequest::setVpnServerId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpnUserRequest::getUserId, DeleteVpnUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpnUsersRequest, ListVpnUsersResponse> listVpnUsers = genForListVpnUsers();

    private static HttpRequestDef<ListVpnUsersRequest, ListVpnUsersResponse> genForListVpnUsers() {
        // basic
        HttpRequestDef.Builder<ListVpnUsersRequest, ListVpnUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpnUsersRequest.class, ListVpnUsersResponse.class)
                .withName("ListVpnUsers")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnUsersRequest::getVpnServerId, ListVpnUsersRequest::setVpnServerId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpnUsersRequest::getLimit, ListVpnUsersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnUsersRequest::getMarker, ListVpnUsersRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetVpnUserPasswordRequest, ResetVpnUserPasswordResponse> resetVpnUserPassword =
        genForResetVpnUserPassword();

    private static HttpRequestDef<ResetVpnUserPasswordRequest, ResetVpnUserPasswordResponse> genForResetVpnUserPassword() {
        // basic
        HttpRequestDef.Builder<ResetVpnUserPasswordRequest, ResetVpnUserPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResetVpnUserPasswordRequest.class, ResetVpnUserPasswordResponse.class)
            .withName("ResetVpnUserPassword")
            .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/users/{user_id}/reset-password")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetVpnUserPasswordRequest::getVpnServerId,
                ResetVpnUserPasswordRequest::setVpnServerId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetVpnUserPasswordRequest::getUserId, ResetVpnUserPasswordRequest::setUserId));
        builder.<ResetVpnUserPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetVpnUserPasswordRequestBody.class),
            f -> f.withMarshaller(ResetVpnUserPasswordRequest::getBody, ResetVpnUserPasswordRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetVpnUserPasswordResponse::getHeaderResponseToken,
                ResetVpnUserPasswordResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVpnUserRequest, ShowVpnUserResponse> showVpnUser = genForShowVpnUser();

    private static HttpRequestDef<ShowVpnUserRequest, ShowVpnUserResponse> genForShowVpnUser() {
        // basic
        HttpRequestDef.Builder<ShowVpnUserRequest, ShowVpnUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpnUserRequest.class, ShowVpnUserResponse.class)
                .withName("ShowVpnUser")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpnUserRequest::getVpnServerId, ShowVpnUserRequest::setVpnServerId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpnUserRequest::getUserId, ShowVpnUserRequest::setUserId));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVpnUserResponse::getHeaderResponseToken,
                ShowVpnUserResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpnUserRequest, UpdateVpnUserResponse> updateVpnUser =
        genForUpdateVpnUser();

    private static HttpRequestDef<UpdateVpnUserRequest, UpdateVpnUserResponse> genForUpdateVpnUser() {
        // basic
        HttpRequestDef.Builder<UpdateVpnUserRequest, UpdateVpnUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpnUserRequest.class, UpdateVpnUserResponse.class)
                .withName("UpdateVpnUser")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnUserRequest::getVpnServerId, UpdateVpnUserRequest::setVpnServerId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnUserRequest::getUserId, UpdateVpnUserRequest::setUserId));
        builder.<UpdateVpnUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpnUserRequestBody.class),
            f -> f.withMarshaller(UpdateVpnUserRequest::getBody, UpdateVpnUserRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVpnUserResponse::getHeaderResponseToken,
                UpdateVpnUserResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpnUserPasswordRequest, UpdateVpnUserPasswordResponse> updateVpnUserPassword =
        genForUpdateVpnUserPassword();

    private static HttpRequestDef<UpdateVpnUserPasswordRequest, UpdateVpnUserPasswordResponse> genForUpdateVpnUserPassword() {
        // basic
        HttpRequestDef.Builder<UpdateVpnUserPasswordRequest, UpdateVpnUserPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateVpnUserPasswordRequest.class, UpdateVpnUserPasswordResponse.class)
            .withName("UpdateVpnUserPassword")
            .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/users/{user_id}/password")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnUserPasswordRequest::getVpnServerId,
                UpdateVpnUserPasswordRequest::setVpnServerId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnUserPasswordRequest::getUserId, UpdateVpnUserPasswordRequest::setUserId));
        builder.<UpdateVpnUserPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpnUserPasswordRequestBody.class),
            f -> f.withMarshaller(UpdateVpnUserPasswordRequest::getBody, UpdateVpnUserPasswordRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVpnUserPasswordResponse::getHeaderResponseToken,
                UpdateVpnUserPasswordResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<AddVpnUsersToGroupRequest, AddVpnUsersToGroupResponse> addVpnUsersToGroup =
        genForAddVpnUsersToGroup();

    private static HttpRequestDef<AddVpnUsersToGroupRequest, AddVpnUsersToGroupResponse> genForAddVpnUsersToGroup() {
        // basic
        HttpRequestDef.Builder<AddVpnUsersToGroupRequest, AddVpnUsersToGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddVpnUsersToGroupRequest.class, AddVpnUsersToGroupResponse.class)
                .withName("AddVpnUsersToGroup")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/groups/{group_id}/add-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddVpnUsersToGroupRequest::getVpnServerId,
                AddVpnUsersToGroupRequest::setVpnServerId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddVpnUsersToGroupRequest::getGroupId, AddVpnUsersToGroupRequest::setGroupId));
        builder.<AddVpnUserToGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddVpnUserToGroupRequestBody.class),
            f -> f.withMarshaller(AddVpnUsersToGroupRequest::getBody, AddVpnUsersToGroupRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddVpnUsersToGroupResponse::getHeaderResponseToken,
                AddVpnUsersToGroupResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVpnUserGroupRequest, CreateVpnUserGroupResponse> createVpnUserGroup =
        genForCreateVpnUserGroup();

    private static HttpRequestDef<CreateVpnUserGroupRequest, CreateVpnUserGroupResponse> genForCreateVpnUserGroup() {
        // basic
        HttpRequestDef.Builder<CreateVpnUserGroupRequest, CreateVpnUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpnUserGroupRequest.class, CreateVpnUserGroupResponse.class)
                .withName("CreateVpnUserGroup")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpnUserGroupRequest::getVpnServerId,
                CreateVpnUserGroupRequest::setVpnServerId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpnUserGroupRequest::getXClientToken,
                CreateVpnUserGroupRequest::setXClientToken));
        builder.<CreateVpnUserGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpnUserGroupRequestBody.class),
            f -> f.withMarshaller(CreateVpnUserGroupRequest::getBody, CreateVpnUserGroupRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVpnUserGroupResponse::getHeaderResponseToken,
                CreateVpnUserGroupResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpnUserGroupRequest, DeleteVpnUserGroupResponse> deleteVpnUserGroup =
        genForDeleteVpnUserGroup();

    private static HttpRequestDef<DeleteVpnUserGroupRequest, DeleteVpnUserGroupResponse> genForDeleteVpnUserGroup() {
        // basic
        HttpRequestDef.Builder<DeleteVpnUserGroupRequest, DeleteVpnUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpnUserGroupRequest.class, DeleteVpnUserGroupResponse.class)
                .withName("DeleteVpnUserGroup")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpnUserGroupRequest::getVpnServerId,
                DeleteVpnUserGroupRequest::setVpnServerId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpnUserGroupRequest::getGroupId, DeleteVpnUserGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpnUserGroupsRequest, ListVpnUserGroupsResponse> listVpnUserGroups =
        genForListVpnUserGroups();

    private static HttpRequestDef<ListVpnUserGroupsRequest, ListVpnUserGroupsResponse> genForListVpnUserGroups() {
        // basic
        HttpRequestDef.Builder<ListVpnUserGroupsRequest, ListVpnUserGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpnUserGroupsRequest.class, ListVpnUserGroupsResponse.class)
                .withName("ListVpnUserGroups")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnUserGroupsRequest::getVpnServerId, ListVpnUserGroupsRequest::setVpnServerId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpnUserGroupsRequest::getLimit, ListVpnUserGroupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnUserGroupsRequest::getMarker, ListVpnUserGroupsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpnUsersInGroupRequest, ListVpnUsersInGroupResponse> listVpnUsersInGroup =
        genForListVpnUsersInGroup();

    private static HttpRequestDef<ListVpnUsersInGroupRequest, ListVpnUsersInGroupResponse> genForListVpnUsersInGroup() {
        // basic
        HttpRequestDef.Builder<ListVpnUsersInGroupRequest, ListVpnUsersInGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpnUsersInGroupRequest.class, ListVpnUsersInGroupResponse.class)
                .withName("ListVpnUsersInGroup")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/groups/{group_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnUsersInGroupRequest::getVpnServerId,
                ListVpnUsersInGroupRequest::setVpnServerId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnUsersInGroupRequest::getGroupId, ListVpnUsersInGroupRequest::setGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpnUsersInGroupRequest::getLimit, ListVpnUsersInGroupRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnUsersInGroupRequest::getMarker, ListVpnUsersInGroupRequest::setMarker));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpnUsersInGroupResponse::getHeaderResponseToken,
                ListVpnUsersInGroupResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<RemoveVpnUsersFromGroupRequest, RemoveVpnUsersFromGroupResponse> removeVpnUsersFromGroup =
        genForRemoveVpnUsersFromGroup();

    private static HttpRequestDef<RemoveVpnUsersFromGroupRequest, RemoveVpnUsersFromGroupResponse> genForRemoveVpnUsersFromGroup() {
        // basic
        HttpRequestDef.Builder<RemoveVpnUsersFromGroupRequest, RemoveVpnUsersFromGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RemoveVpnUsersFromGroupRequest.class, RemoveVpnUsersFromGroupResponse.class)
            .withName("RemoveVpnUsersFromGroup")
            .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/groups/{group_id}/remove-users")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveVpnUsersFromGroupRequest::getVpnServerId,
                RemoveVpnUsersFromGroupRequest::setVpnServerId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveVpnUsersFromGroupRequest::getGroupId,
                RemoveVpnUsersFromGroupRequest::setGroupId));
        builder.<RemoveVpnUserFromGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveVpnUserFromGroupRequestBody.class),
            f -> f.withMarshaller(RemoveVpnUsersFromGroupRequest::getBody, RemoveVpnUsersFromGroupRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RemoveVpnUsersFromGroupResponse::getHeaderResponseToken,
                RemoveVpnUsersFromGroupResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVpnUserGroupRequest, ShowVpnUserGroupResponse> showVpnUserGroup =
        genForShowVpnUserGroup();

    private static HttpRequestDef<ShowVpnUserGroupRequest, ShowVpnUserGroupResponse> genForShowVpnUserGroup() {
        // basic
        HttpRequestDef.Builder<ShowVpnUserGroupRequest, ShowVpnUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpnUserGroupRequest.class, ShowVpnUserGroupResponse.class)
                .withName("ShowVpnUserGroup")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpnUserGroupRequest::getVpnServerId, ShowVpnUserGroupRequest::setVpnServerId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpnUserGroupRequest::getGroupId, ShowVpnUserGroupRequest::setGroupId));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVpnUserGroupResponse::getHeaderResponseToken,
                ShowVpnUserGroupResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpnUserGroupRequest, UpdateVpnUserGroupResponse> updateVpnUserGroup =
        genForUpdateVpnUserGroup();

    private static HttpRequestDef<UpdateVpnUserGroupRequest, UpdateVpnUserGroupResponse> genForUpdateVpnUserGroup() {
        // basic
        HttpRequestDef.Builder<UpdateVpnUserGroupRequest, UpdateVpnUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpnUserGroupRequest.class, UpdateVpnUserGroupResponse.class)
                .withName("UpdateVpnUserGroup")
                .withUri("/v5/{project_id}/p2c-vpn-gateways/vpn-servers/{vpn_server_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnUserGroupRequest::getVpnServerId,
                UpdateVpnUserGroupRequest::setVpnServerId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnUserGroupRequest::getGroupId, UpdateVpnUserGroupRequest::setGroupId));
        builder.<UpdateVpnUserGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpnUserGroupRequestBody.class),
            f -> f.withMarshaller(UpdateVpnUserGroupRequest::getBody, UpdateVpnUserGroupRequest::setBody));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVpnUserGroupResponse::getHeaderResponseToken,
                UpdateVpnUserGroupResponse::setHeaderResponseToken));
        return builder.build();
    }

}

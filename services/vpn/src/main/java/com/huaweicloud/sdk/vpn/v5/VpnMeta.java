package com.huaweicloud.sdk.vpn.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.CountResourcesByTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.CountResourcesByTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateResourcesTagsRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnGatewayCertificateRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteResourcesTagsRequestBody;
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
import com.huaweicloud.sdk.vpn.v5.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListResourcesByTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListResourcesByTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsResponse;
import com.huaweicloud.sdk.vpn.v5.model.QueryResourcesRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowResourceTagsResponse;
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
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnGatewayCertificateRequestBody;

import java.util.List;

@SuppressWarnings("unchecked")
public class VpnMeta {

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

}

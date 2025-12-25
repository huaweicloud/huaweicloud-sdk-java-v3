package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dc.v3.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.dc.v3.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.dc.v3.model.BatchOperateResourceTagsRequestBody;
import com.huaweicloud.sdk.dc.v3.model.BindGlobalEipsRequest;
import com.huaweicloud.sdk.dc.v3.model.BindGlobalEipsResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateBindingGeipRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateConnectGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateConnectGatewayRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateConnectGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateExternalPeerLinkRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateGlobalDcGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateGlobalDcGatewayRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateGlobalDcGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.CreatePeerLinkRequest;
import com.huaweicloud.sdk.dc.v3.model.CreatePeerLinkResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateSwitchoverTestRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateUnbindingGeipRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerDetectionRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerDetectionRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerDetectionResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteConnectGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteConnectGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteGlobalDcGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteGlobalDcGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.DeletePeerLinkRequest;
import com.huaweicloud.sdk.dc.v3.model.DeletePeerLinkResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerDetectionRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerDetectionResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.ListConnectGatewaysRequest;
import com.huaweicloud.sdk.dc.v3.model.ListConnectGatewaysResponse;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectLocationsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectLocationsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListGdgwRouteTablesRequest;
import com.huaweicloud.sdk.dc.v3.model.ListGdgwRouteTablesResponse;
import com.huaweicloud.sdk.dc.v3.model.ListGlobalDcGatewaysRequest;
import com.huaweicloud.sdk.dc.v3.model.ListGlobalDcGatewaysResponse;
import com.huaweicloud.sdk.dc.v3.model.ListGlobalEipsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListGlobalEipsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListHostedDirectConnectsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListHostedDirectConnectsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListPeerLinksRequest;
import com.huaweicloud.sdk.dc.v3.model.ListPeerLinksResponse;
import com.huaweicloud.sdk.dc.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListSwitchoverTestRecordsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListSwitchoverTestRecordsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListTagResourceInstancesRequest;
import com.huaweicloud.sdk.dc.v3.model.ListTagResourceInstancesRequestBody;
import com.huaweicloud.sdk.dc.v3.model.ListTagResourceInstancesResponse;
import com.huaweicloud.sdk.dc.v3.model.ListVifPeerDetectionsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListVifPeerDetectionsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualGatewaysRequest;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualGatewaysResponse;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualInterfacesRequest;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualInterfacesResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowConnectGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowConnectGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectLocationRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectLocationResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowGlobalDcGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowGlobalDcGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowPeerLinkRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowPeerLinkResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowVifPeerDetectionRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowVifPeerDetectionResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.SwitchoverTestRequest;
import com.huaweicloud.sdk.dc.v3.model.SwitchoverTestResponse;
import com.huaweicloud.sdk.dc.v3.model.UnbindGlobalEipsRequest;
import com.huaweicloud.sdk.dc.v3.model.UnbindGlobalEipsResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateConnectGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateConnectGatewayRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateConnectGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateExtendAttributeRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateExtendAttributeRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateExtendAttributeResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateExternalPeerLinkRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateGdgwRouteTableRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateGdgwRouteTableResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateGdgwRoutetableRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateGlobalDcGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateGlobalDcGatewayRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateGlobalDcGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdatePeerLinkRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdatePeerLinkResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class DcMeta {

    public static final HttpRequestDef<BindGlobalEipsRequest, BindGlobalEipsResponse> bindGlobalEips =
        genForBindGlobalEips();

    private static HttpRequestDef<BindGlobalEipsRequest, BindGlobalEipsResponse> genForBindGlobalEips() {
        // basic
        HttpRequestDef.Builder<BindGlobalEipsRequest, BindGlobalEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BindGlobalEipsRequest.class, BindGlobalEipsResponse.class)
                .withName("BindGlobalEips")
                .withUri("/v3/{project_id}/dcaas/connect-gateways/{connect_gateway_id}/binding-global-eips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connect_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindGlobalEipsRequest::getConnectGatewayId,
                BindGlobalEipsRequest::setConnectGatewayId));
        builder.<CreateBindingGeipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBindingGeipRequestBody.class),
            f -> f.withMarshaller(BindGlobalEipsRequest::getBody, BindGlobalEipsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalEipsRequest, ListGlobalEipsResponse> listGlobalEips =
        genForListGlobalEips();

    private static HttpRequestDef<ListGlobalEipsRequest, ListGlobalEipsResponse> genForListGlobalEips() {
        // basic
        HttpRequestDef.Builder<ListGlobalEipsRequest, ListGlobalEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGlobalEipsRequest.class, ListGlobalEipsResponse.class)
                .withName("ListGlobalEips")
                .withUri("/v3/{project_id}/dcaas/connect-gateways/{connect_gateway_id}/binding-global-eips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connect_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getConnectGatewayId,
                ListGlobalEipsRequest::setConnectGatewayId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getLimit, ListGlobalEipsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getOffset, ListGlobalEipsRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getMarker, ListGlobalEipsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getPageReverse, ListGlobalEipsRequest::setPageReverse));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getFields, ListGlobalEipsRequest::setFields));
        builder.<List<String>>withRequestField("ext_fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getExtFields, ListGlobalEipsRequest::setExtFields));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getSortKey, ListGlobalEipsRequest::setSortKey));
        builder.<List<ListGlobalEipsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getSortDir, ListGlobalEipsRequest::setSortDir));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getStatus, ListGlobalEipsRequest::setStatus));
        builder.<List<String>>withRequestField("global_eip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getGlobalEipId, ListGlobalEipsRequest::setGlobalEipId));
        builder.<List<String>>withRequestField("global_eip_segment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getGlobalEipSegmentId,
                ListGlobalEipsRequest::setGlobalEipSegmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnbindGlobalEipsRequest, UnbindGlobalEipsResponse> unbindGlobalEips =
        genForUnbindGlobalEips();

    private static HttpRequestDef<UnbindGlobalEipsRequest, UnbindGlobalEipsResponse> genForUnbindGlobalEips() {
        // basic
        HttpRequestDef.Builder<UnbindGlobalEipsRequest, UnbindGlobalEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnbindGlobalEipsRequest.class, UnbindGlobalEipsResponse.class)
                .withName("UnbindGlobalEips")
                .withUri("/v3/{project_id}/dcaas/connect-gateways/{connect_gateway_id}/unbinding-global-eips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connect_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindGlobalEipsRequest::getConnectGatewayId,
                UnbindGlobalEipsRequest::setConnectGatewayId));
        builder.<CreateUnbindingGeipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUnbindingGeipRequestBody.class),
            f -> f.withMarshaller(UnbindGlobalEipsRequest::getBody, UnbindGlobalEipsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectGatewayRequest, CreateConnectGatewayResponse> createConnectGateway =
        genForCreateConnectGateway();

    private static HttpRequestDef<CreateConnectGatewayRequest, CreateConnectGatewayResponse> genForCreateConnectGateway() {
        // basic
        HttpRequestDef.Builder<CreateConnectGatewayRequest, CreateConnectGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateConnectGatewayRequest.class, CreateConnectGatewayResponse.class)
            .withName("CreateConnectGateway")
            .withUri("/v3/{project_id}/dcaas/connect-gateways")
            .withContentType("application/json");

        // requests
        builder.<CreateConnectGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConnectGatewayRequestBody.class),
            f -> f.withMarshaller(CreateConnectGatewayRequest::getBody, CreateConnectGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectGatewayRequest, DeleteConnectGatewayResponse> deleteConnectGateway =
        genForDeleteConnectGateway();

    private static HttpRequestDef<DeleteConnectGatewayRequest, DeleteConnectGatewayResponse> genForDeleteConnectGateway() {
        // basic
        HttpRequestDef.Builder<DeleteConnectGatewayRequest, DeleteConnectGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConnectGatewayRequest.class, DeleteConnectGatewayResponse.class)
            .withName("DeleteConnectGateway")
            .withUri("/v3/{project_id}/dcaas/connect-gateways/{connect_gateway_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connect_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectGatewayRequest::getConnectGatewayId,
                DeleteConnectGatewayRequest::setConnectGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectGatewaysRequest, ListConnectGatewaysResponse> listConnectGateways =
        genForListConnectGateways();

    private static HttpRequestDef<ListConnectGatewaysRequest, ListConnectGatewaysResponse> genForListConnectGateways() {
        // basic
        HttpRequestDef.Builder<ListConnectGatewaysRequest, ListConnectGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectGatewaysRequest.class, ListConnectGatewaysResponse.class)
                .withName("ListConnectGateways")
                .withUri("/v3/{project_id}/dcaas/connect-gateways")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getLimit, ListConnectGatewaysRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getOffset, ListConnectGatewaysRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getMarker, ListConnectGatewaysRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getPageReverse,
                ListConnectGatewaysRequest::setPageReverse));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getFields, ListConnectGatewaysRequest::setFields));
        builder.<List<String>>withRequestField("ext_fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getExtFields, ListConnectGatewaysRequest::setExtFields));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getSortKey, ListConnectGatewaysRequest::setSortKey));
        builder.<List<ListConnectGatewaysRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getSortDir, ListConnectGatewaysRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getId, ListConnectGatewaysRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getName, ListConnectGatewaysRequest::setName));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListConnectGatewaysRequest::getStatus, ListConnectGatewaysRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectGatewayRequest, ShowConnectGatewayResponse> showConnectGateway =
        genForShowConnectGateway();

    private static HttpRequestDef<ShowConnectGatewayRequest, ShowConnectGatewayResponse> genForShowConnectGateway() {
        // basic
        HttpRequestDef.Builder<ShowConnectGatewayRequest, ShowConnectGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectGatewayRequest.class, ShowConnectGatewayResponse.class)
                .withName("ShowConnectGateway")
                .withUri("/v3/{project_id}/dcaas/connect-gateways/{connect_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connect_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectGatewayRequest::getConnectGatewayId,
                ShowConnectGatewayRequest::setConnectGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectGatewayRequest, UpdateConnectGatewayResponse> updateConnectGateway =
        genForUpdateConnectGateway();

    private static HttpRequestDef<UpdateConnectGatewayRequest, UpdateConnectGatewayResponse> genForUpdateConnectGateway() {
        // basic
        HttpRequestDef.Builder<UpdateConnectGatewayRequest, UpdateConnectGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateConnectGatewayRequest.class, UpdateConnectGatewayResponse.class)
            .withName("UpdateConnectGateway")
            .withUri("/v3/{project_id}/dcaas/connect-gateways/{connect_gateway_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connect_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectGatewayRequest::getConnectGatewayId,
                UpdateConnectGatewayRequest::setConnectGatewayId));
        builder.<UpdateConnectGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConnectGatewayRequestBody.class),
            f -> f.withMarshaller(UpdateConnectGatewayRequest::getBody, UpdateConnectGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> createHostedDirectConnect =
        genForCreateHostedDirectConnect();

    private static HttpRequestDef<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> genForCreateHostedDirectConnect() {
        // basic
        HttpRequestDef.Builder<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateHostedDirectConnectRequest.class,
                    CreateHostedDirectConnectResponse.class)
                .withName("CreateHostedDirectConnect")
                .withUri("/v3/{project_id}/dcaas/hosted-connects")
                .withContentType("application/json");

        // requests
        builder.<CreateHostedDirectConnectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHostedDirectConnectRequestBody.class),
            f -> f.withMarshaller(CreateHostedDirectConnectRequest::getBody,
                CreateHostedDirectConnectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDirectConnectRequest, DeleteDirectConnectResponse> deleteDirectConnect =
        genForDeleteDirectConnect();

    private static HttpRequestDef<DeleteDirectConnectRequest, DeleteDirectConnectResponse> genForDeleteDirectConnect() {
        // basic
        HttpRequestDef.Builder<DeleteDirectConnectRequest, DeleteDirectConnectResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDirectConnectRequest.class, DeleteDirectConnectResponse.class)
            .withName("DeleteDirectConnect")
            .withUri("/v3/{project_id}/dcaas/direct-connects/{direct_connect_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("direct_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDirectConnectRequest::getDirectConnectId,
                DeleteDirectConnectRequest::setDirectConnectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> deleteHostedDirectConnect =
        genForDeleteHostedDirectConnect();

    private static HttpRequestDef<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> genForDeleteHostedDirectConnect() {
        // basic
        HttpRequestDef.Builder<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteHostedDirectConnectRequest.class,
                    DeleteHostedDirectConnectResponse.class)
                .withName("DeleteHostedDirectConnect")
                .withUri("/v3/{project_id}/dcaas/hosted-connects/{hosted_connect_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hosted_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostedDirectConnectRequest::getHostedConnectId,
                DeleteHostedDirectConnectRequest::setHostedConnectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectConnectsRequest, ListDirectConnectsResponse> listDirectConnects =
        genForListDirectConnects();

    private static HttpRequestDef<ListDirectConnectsRequest, ListDirectConnectsResponse> genForListDirectConnects() {
        // basic
        HttpRequestDef.Builder<ListDirectConnectsRequest, ListDirectConnectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDirectConnectsRequest.class, ListDirectConnectsResponse.class)
                .withName("ListDirectConnects")
                .withUri("/v3/{project_id}/dcaas/direct-connects")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getLimit, ListDirectConnectsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getMarker, ListDirectConnectsRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getFields, ListDirectConnectsRequest::setFields));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getSortKey, ListDirectConnectsRequest::setSortKey));
        builder.<List<ListDirectConnectsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getSortDir, ListDirectConnectsRequest::setSortDir));
        builder.<List<String>>withRequestField("hosting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getHostingId, ListDirectConnectsRequest::setHostingId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getEnterpriseProjectId,
                ListDirectConnectsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getId, ListDirectConnectsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getName, ListDirectConnectsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> listHostedDirectConnects =
        genForListHostedDirectConnects();

    private static HttpRequestDef<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> genForListHostedDirectConnects() {
        // basic
        HttpRequestDef.Builder<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListHostedDirectConnectsRequest.class, ListHostedDirectConnectsResponse.class)
                .withName("ListHostedDirectConnects")
                .withUri("/v3/{project_id}/dcaas/hosted-connects")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getLimit,
                ListHostedDirectConnectsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getMarker,
                ListHostedDirectConnectsRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getFields,
                ListHostedDirectConnectsRequest::setFields));
        builder.<List<ListHostedDirectConnectsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getSortDir,
                ListHostedDirectConnectsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getSortKey,
                ListHostedDirectConnectsRequest::setSortKey));
        builder.<List<String>>withRequestField("hosting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getHostingId,
                ListHostedDirectConnectsRequest::setHostingId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getId, ListHostedDirectConnectsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getName, ListHostedDirectConnectsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnect =
        genForShowDirectConnect();

    private static HttpRequestDef<ShowDirectConnectRequest, ShowDirectConnectResponse> genForShowDirectConnect() {
        // basic
        HttpRequestDef.Builder<ShowDirectConnectRequest, ShowDirectConnectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDirectConnectRequest.class, ShowDirectConnectResponse.class)
                .withName("ShowDirectConnect")
                .withUri("/v3/{project_id}/dcaas/direct-connects/{direct_connect_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("direct_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirectConnectRequest::getDirectConnectId,
                ShowDirectConnectRequest::setDirectConnectId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDirectConnectRequest::getFields, ShowDirectConnectRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> showHostedDirectConnect =
        genForShowHostedDirectConnect();

    private static HttpRequestDef<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> genForShowHostedDirectConnect() {
        // basic
        HttpRequestDef.Builder<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHostedDirectConnectRequest.class, ShowHostedDirectConnectResponse.class)
            .withName("ShowHostedDirectConnect")
            .withUri("/v3/{project_id}/dcaas/hosted-connects/{hosted_connect_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hosted_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getHostedConnectId,
                ShowHostedDirectConnectRequest::setHostedConnectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getLimit, ShowHostedDirectConnectRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getMarker,
                ShowHostedDirectConnectRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getFields,
                ShowHostedDirectConnectRequest::setFields));
        builder.<List<ShowHostedDirectConnectRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getSortDir,
                ShowHostedDirectConnectRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getSortKey,
                ShowHostedDirectConnectRequest::setSortKey));
        builder.<List<String>>withRequestField("hosting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getHostingId,
                ShowHostedDirectConnectRequest::setHostingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDirectConnectRequest, UpdateDirectConnectResponse> updateDirectConnect =
        genForUpdateDirectConnect();

    private static HttpRequestDef<UpdateDirectConnectRequest, UpdateDirectConnectResponse> genForUpdateDirectConnect() {
        // basic
        HttpRequestDef.Builder<UpdateDirectConnectRequest, UpdateDirectConnectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDirectConnectRequest.class, UpdateDirectConnectResponse.class)
                .withName("UpdateDirectConnect")
                .withUri("/v3/{project_id}/dcaas/direct-connects/{direct_connect_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("direct_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDirectConnectRequest::getDirectConnectId,
                UpdateDirectConnectRequest::setDirectConnectId));
        builder.<UpdateDirectConnectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDirectConnectRequestBody.class),
            f -> f.withMarshaller(UpdateDirectConnectRequest::getBody, UpdateDirectConnectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> updateHostedDirectConnect =
        genForUpdateHostedDirectConnect();

    private static HttpRequestDef<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> genForUpdateHostedDirectConnect() {
        // basic
        HttpRequestDef.Builder<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHostedDirectConnectRequest.class,
                    UpdateHostedDirectConnectResponse.class)
                .withName("UpdateHostedDirectConnect")
                .withUri("/v3/{project_id}/dcaas/hosted-connects/{hosted_connect_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hosted_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostedDirectConnectRequest::getHostedConnectId,
                UpdateHostedDirectConnectRequest::setHostedConnectId));
        builder.<UpdateHostedDirectConnectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostedDirectConnectRequestBody.class),
            f -> f.withMarshaller(UpdateHostedDirectConnectRequest::getBody,
                UpdateHostedDirectConnectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectConnectLocationsRequest, ListDirectConnectLocationsResponse> listDirectConnectLocations =
        genForListDirectConnectLocations();

    private static HttpRequestDef<ListDirectConnectLocationsRequest, ListDirectConnectLocationsResponse> genForListDirectConnectLocations() {
        // basic
        HttpRequestDef.Builder<ListDirectConnectLocationsRequest, ListDirectConnectLocationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDirectConnectLocationsRequest.class,
                    ListDirectConnectLocationsResponse.class)
                .withName("ListDirectConnectLocations")
                .withUri("/v3/{project_id}/dcaas/direct-connect-locations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDirectConnectLocationsRequest::getLimit,
                ListDirectConnectLocationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectConnectLocationsRequest::getMarker,
                ListDirectConnectLocationsRequest::setMarker));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectConnectLocationsRequest::getSortKey,
                ListDirectConnectLocationsRequest::setSortKey));
        builder.<List<ListDirectConnectLocationsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectLocationsRequest::getSortDir,
                ListDirectConnectLocationsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectLocationsRequest::getId, ListDirectConnectLocationsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectLocationsRequest::getName,
                ListDirectConnectLocationsRequest::setName));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectLocationsRequest::getStatus,
                ListDirectConnectLocationsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDirectConnectLocationRequest, ShowDirectConnectLocationResponse> showDirectConnectLocation =
        genForShowDirectConnectLocation();

    private static HttpRequestDef<ShowDirectConnectLocationRequest, ShowDirectConnectLocationResponse> genForShowDirectConnectLocation() {
        // basic
        HttpRequestDef.Builder<ShowDirectConnectLocationRequest, ShowDirectConnectLocationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDirectConnectLocationRequest.class,
                    ShowDirectConnectLocationResponse.class)
                .withName("ShowDirectConnectLocation")
                .withUri("/v3/{project_id}/dcaas/direct-connect-locations/{direct_connect_location_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("direct_connect_location_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirectConnectLocationRequest::getDirectConnectLocationId,
                ShowDirectConnectLocationRequest::setDirectConnectLocationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGdgwRouteTablesRequest, ListGdgwRouteTablesResponse> listGdgwRouteTables =
        genForListGdgwRouteTables();

    private static HttpRequestDef<ListGdgwRouteTablesRequest, ListGdgwRouteTablesResponse> genForListGdgwRouteTables() {
        // basic
        HttpRequestDef.Builder<ListGdgwRouteTablesRequest, ListGdgwRouteTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGdgwRouteTablesRequest.class, ListGdgwRouteTablesResponse.class)
                .withName("ListGdgwRouteTables")
                .withUri("/v3/{project_id}/dcaas/gdgw/{gdgw_id}/routetables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gdgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGdgwRouteTablesRequest::getGdgwId, ListGdgwRouteTablesRequest::setGdgwId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGdgwRouteTablesRequest::getFields, ListGdgwRouteTablesRequest::setFields));
        builder.<List<String>>withRequestField("ext_fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGdgwRouteTablesRequest::getExtFields, ListGdgwRouteTablesRequest::setExtFields));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGdgwRouteTablesRequest::getLimit, ListGdgwRouteTablesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGdgwRouteTablesRequest::getMarker, ListGdgwRouteTablesRequest::setMarker));
        builder.<List<String>>withRequestField("nexthop",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGdgwRouteTablesRequest::getNexthop, ListGdgwRouteTablesRequest::setNexthop));
        builder.<List<String>>withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGdgwRouteTablesRequest::getDestination,
                ListGdgwRouteTablesRequest::setDestination));
        builder.<List<ListGdgwRouteTablesRequest.AddressFamilyEnum>>withRequestField("address_family",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGdgwRouteTablesRequest::getAddressFamily,
                ListGdgwRouteTablesRequest::setAddressFamily));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGdgwRouteTableRequest, UpdateGdgwRouteTableResponse> updateGdgwRouteTable =
        genForUpdateGdgwRouteTable();

    private static HttpRequestDef<UpdateGdgwRouteTableRequest, UpdateGdgwRouteTableResponse> genForUpdateGdgwRouteTable() {
        // basic
        HttpRequestDef.Builder<UpdateGdgwRouteTableRequest, UpdateGdgwRouteTableResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGdgwRouteTableRequest.class, UpdateGdgwRouteTableResponse.class)
            .withName("UpdateGdgwRouteTable")
            .withUri("/v3/{project_id}/dcaas/gdgw/{gdgw_id}/routetables")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gdgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGdgwRouteTableRequest::getGdgwId, UpdateGdgwRouteTableRequest::setGdgwId));
        builder.<UpdateGdgwRoutetableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGdgwRoutetableRequestBody.class),
            f -> f.withMarshaller(UpdateGdgwRouteTableRequest::getBody, UpdateGdgwRouteTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGlobalDcGatewayRequest, CreateGlobalDcGatewayResponse> createGlobalDcGateway =
        genForCreateGlobalDcGateway();

    private static HttpRequestDef<CreateGlobalDcGatewayRequest, CreateGlobalDcGatewayResponse> genForCreateGlobalDcGateway() {
        // basic
        HttpRequestDef.Builder<CreateGlobalDcGatewayRequest, CreateGlobalDcGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGlobalDcGatewayRequest.class, CreateGlobalDcGatewayResponse.class)
            .withName("CreateGlobalDcGateway")
            .withUri("/v3/{project_id}/dcaas/global-dc-gateways")
            .withContentType("application/json");

        // requests
        builder.<CreateGlobalDcGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGlobalDcGatewayRequestBody.class),
            f -> f.withMarshaller(CreateGlobalDcGatewayRequest::getBody, CreateGlobalDcGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGlobalDcGatewayRequest, DeleteGlobalDcGatewayResponse> deleteGlobalDcGateway =
        genForDeleteGlobalDcGateway();

    private static HttpRequestDef<DeleteGlobalDcGatewayRequest, DeleteGlobalDcGatewayResponse> genForDeleteGlobalDcGateway() {
        // basic
        HttpRequestDef.Builder<DeleteGlobalDcGatewayRequest, DeleteGlobalDcGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGlobalDcGatewayRequest.class, DeleteGlobalDcGatewayResponse.class)
            .withName("DeleteGlobalDcGateway")
            .withUri("/v3/{project_id}/dcaas/global-dc-gateways/{global_dc_gateway_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_dc_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGlobalDcGatewayRequest::getGlobalDcGatewayId,
                DeleteGlobalDcGatewayRequest::setGlobalDcGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalDcGatewaysRequest, ListGlobalDcGatewaysResponse> listGlobalDcGateways =
        genForListGlobalDcGateways();

    private static HttpRequestDef<ListGlobalDcGatewaysRequest, ListGlobalDcGatewaysResponse> genForListGlobalDcGateways() {
        // basic
        HttpRequestDef.Builder<ListGlobalDcGatewaysRequest, ListGlobalDcGatewaysResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGlobalDcGatewaysRequest.class, ListGlobalDcGatewaysResponse.class)
            .withName("ListGlobalDcGateways")
            .withUri("/v3/{project_id}/dcaas/global-dc-gateways")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getLimit, ListGlobalDcGatewaysRequest::setLimit));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getFields, ListGlobalDcGatewaysRequest::setFields));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getMarker, ListGlobalDcGatewaysRequest::setMarker));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getSortKey, ListGlobalDcGatewaysRequest::setSortKey));
        builder.<List<ListGlobalDcGatewaysRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getSortDir, ListGlobalDcGatewaysRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getId, ListGlobalDcGatewaysRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getName, ListGlobalDcGatewaysRequest::setName));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getEnterpriseProjectId,
                ListGlobalDcGatewaysRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("site_network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getSiteNetworkId,
                ListGlobalDcGatewaysRequest::setSiteNetworkId));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getCloudConnectionId,
                ListGlobalDcGatewaysRequest::setCloudConnectionId));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getStatus, ListGlobalDcGatewaysRequest::setStatus));
        builder.<List<String>>withRequestField("global_center_network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalDcGatewaysRequest::getGlobalCenterNetworkId,
                ListGlobalDcGatewaysRequest::setGlobalCenterNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGlobalDcGatewayRequest, ShowGlobalDcGatewayResponse> showGlobalDcGateway =
        genForShowGlobalDcGateway();

    private static HttpRequestDef<ShowGlobalDcGatewayRequest, ShowGlobalDcGatewayResponse> genForShowGlobalDcGateway() {
        // basic
        HttpRequestDef.Builder<ShowGlobalDcGatewayRequest, ShowGlobalDcGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGlobalDcGatewayRequest.class, ShowGlobalDcGatewayResponse.class)
                .withName("ShowGlobalDcGateway")
                .withUri("/v3/{project_id}/dcaas/global-dc-gateways/{global_dc_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_dc_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlobalDcGatewayRequest::getGlobalDcGatewayId,
                ShowGlobalDcGatewayRequest::setGlobalDcGatewayId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGlobalDcGatewayRequest::getLimit, ShowGlobalDcGatewayRequest::setLimit));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowGlobalDcGatewayRequest::getFields, ShowGlobalDcGatewayRequest::setFields));
        builder.<List<String>>withRequestField("ext_fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowGlobalDcGatewayRequest::getExtFields, ShowGlobalDcGatewayRequest::setExtFields));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowGlobalDcGatewayRequest::getEnterpriseProjectId,
                ShowGlobalDcGatewayRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGlobalDcGatewayRequest, UpdateGlobalDcGatewayResponse> updateGlobalDcGateway =
        genForUpdateGlobalDcGateway();

    private static HttpRequestDef<UpdateGlobalDcGatewayRequest, UpdateGlobalDcGatewayResponse> genForUpdateGlobalDcGateway() {
        // basic
        HttpRequestDef.Builder<UpdateGlobalDcGatewayRequest, UpdateGlobalDcGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGlobalDcGatewayRequest.class, UpdateGlobalDcGatewayResponse.class)
            .withName("UpdateGlobalDcGateway")
            .withUri("/v3/{project_id}/dcaas/global-dc-gateways/{global_dc_gateway_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_dc_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGlobalDcGatewayRequest::getGlobalDcGatewayId,
                UpdateGlobalDcGatewayRequest::setGlobalDcGatewayId));
        builder.<UpdateGlobalDcGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGlobalDcGatewayRequestBody.class),
            f -> f.withMarshaller(UpdateGlobalDcGatewayRequest::getBody, UpdateGlobalDcGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePeerLinkRequest, CreatePeerLinkResponse> createPeerLink =
        genForCreatePeerLink();

    private static HttpRequestDef<CreatePeerLinkRequest, CreatePeerLinkResponse> genForCreatePeerLink() {
        // basic
        HttpRequestDef.Builder<CreatePeerLinkRequest, CreatePeerLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePeerLinkRequest.class, CreatePeerLinkResponse.class)
                .withName("CreatePeerLink")
                .withUri("/v3/{project_id}/dcaas/global-dc-gateways/{global_dc_gateway_id}/peer-links")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_dc_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePeerLinkRequest::getGlobalDcGatewayId,
                CreatePeerLinkRequest::setGlobalDcGatewayId));
        builder.<CreateExternalPeerLinkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExternalPeerLinkRequestBody.class),
            f -> f.withMarshaller(CreatePeerLinkRequest::getBody, CreatePeerLinkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePeerLinkRequest, DeletePeerLinkResponse> deletePeerLink =
        genForDeletePeerLink();

    private static HttpRequestDef<DeletePeerLinkRequest, DeletePeerLinkResponse> genForDeletePeerLink() {
        // basic
        HttpRequestDef.Builder<DeletePeerLinkRequest, DeletePeerLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePeerLinkRequest.class, DeletePeerLinkResponse.class)
                .withName("DeletePeerLink")
                .withUri("/v3/{project_id}/dcaas/global-dc-gateways/{global_dc_gateway_id}/peer-links/{peer_link_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_dc_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePeerLinkRequest::getGlobalDcGatewayId,
                DeletePeerLinkRequest::setGlobalDcGatewayId));
        builder.<String>withRequestField("peer_link_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePeerLinkRequest::getPeerLinkId, DeletePeerLinkRequest::setPeerLinkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPeerLinksRequest, ListPeerLinksResponse> listPeerLinks =
        genForListPeerLinks();

    private static HttpRequestDef<ListPeerLinksRequest, ListPeerLinksResponse> genForListPeerLinks() {
        // basic
        HttpRequestDef.Builder<ListPeerLinksRequest, ListPeerLinksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPeerLinksRequest.class, ListPeerLinksResponse.class)
                .withName("ListPeerLinks")
                .withUri("/v3/{project_id}/dcaas/global-dc-gateways/{global_dc_gateway_id}/peer-links")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_dc_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getGlobalDcGatewayId,
                ListPeerLinksRequest::setGlobalDcGatewayId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getLimit, ListPeerLinksRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getOffset, ListPeerLinksRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getMarker, ListPeerLinksRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getPageReverse, ListPeerLinksRequest::setPageReverse));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getFields, ListPeerLinksRequest::setFields));
        builder.<List<String>>withRequestField("ext_fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getExtFields, ListPeerLinksRequest::setExtFields));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getSortKey, ListPeerLinksRequest::setSortKey));
        builder.<List<ListPeerLinksRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getSortDir, ListPeerLinksRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getId, ListPeerLinksRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPeerLinksRequest::getName, ListPeerLinksRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPeerLinkRequest, ShowPeerLinkResponse> showPeerLink = genForShowPeerLink();

    private static HttpRequestDef<ShowPeerLinkRequest, ShowPeerLinkResponse> genForShowPeerLink() {
        // basic
        HttpRequestDef.Builder<ShowPeerLinkRequest, ShowPeerLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPeerLinkRequest.class, ShowPeerLinkResponse.class)
                .withName("ShowPeerLink")
                .withUri("/v3/{project_id}/dcaas/global-dc-gateways/{global_dc_gateway_id}/peer-links/{peer_link_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_dc_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPeerLinkRequest::getGlobalDcGatewayId,
                ShowPeerLinkRequest::setGlobalDcGatewayId));
        builder.<String>withRequestField("peer_link_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPeerLinkRequest::getPeerLinkId, ShowPeerLinkRequest::setPeerLinkId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPeerLinkRequest::getFields, ShowPeerLinkRequest::setFields));
        builder.<List<String>>withRequestField("ext_fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPeerLinkRequest::getExtFields, ShowPeerLinkRequest::setExtFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePeerLinkRequest, UpdatePeerLinkResponse> updatePeerLink =
        genForUpdatePeerLink();

    private static HttpRequestDef<UpdatePeerLinkRequest, UpdatePeerLinkResponse> genForUpdatePeerLink() {
        // basic
        HttpRequestDef.Builder<UpdatePeerLinkRequest, UpdatePeerLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePeerLinkRequest.class, UpdatePeerLinkResponse.class)
                .withName("UpdatePeerLink")
                .withUri("/v3/{project_id}/dcaas/global-dc-gateways/{global_dc_gateway_id}/peer-links/{peer_link_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_dc_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePeerLinkRequest::getGlobalDcGatewayId,
                UpdatePeerLinkRequest::setGlobalDcGatewayId));
        builder.<String>withRequestField("peer_link_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePeerLinkRequest::getPeerLinkId, UpdatePeerLinkRequest::setPeerLinkId));
        builder.<UpdateExternalPeerLinkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateExternalPeerLinkRequestBody.class),
            f -> f.withMarshaller(UpdatePeerLinkRequest::getBody, UpdatePeerLinkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v3/{project_id}/dcaas/quotas")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowQuotasRequest::getType, ShowQuotasRequest::setType));

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
            .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceId,
                BatchCreateResourceTagsRequest::setResourceId));
        builder.<BatchCreateResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceType,
                BatchCreateResourceTagsRequest::setResourceType));
        builder.<BatchOperateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getBody, BatchCreateResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTag =
        genForCreateResourceTag();

    private static HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> genForCreateResourceTag() {
        // basic
        HttpRequestDef.Builder<CreateResourceTagRequest, CreateResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceTagRequest.class, CreateResourceTagResponse.class)
                .withName("CreateResourceTag")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceId, CreateResourceTagRequest::setResourceId));
        builder.<CreateResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceType,
                CreateResourceTagRequest::setResourceType));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getBody, CreateResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genForDeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genForDeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<DeleteResourceTagRequest, DeleteResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceTagRequest.class, DeleteResourceTagResponse.class)
                .withName("DeleteResourceTag")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, DeleteResourceTagRequest::setKey));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, DeleteResourceTagRequest::setResourceId));
        builder.<DeleteResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType,
                DeleteResourceTagRequest::setResourceType));

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
                .withUri("/v3/{project_id}/{resource_type}/tags")
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

    public static final HttpRequestDef<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> listTagResourceInstances =
        genForListTagResourceInstances();

    private static HttpRequestDef<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> genForListTagResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListTagResourceInstancesRequest.class, ListTagResourceInstancesResponse.class)
                .withName("ListTagResourceInstances")
                .withUri("/v3/{project_id}/{resource_type}/resource-instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListTagResourceInstancesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourceInstancesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListTagResourceInstancesRequest::getResourceType,
                ListTagResourceInstancesRequest::setResourceType));
        builder.<ListTagResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListTagResourceInstancesRequest::getBody, ListTagResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTag =
        genForShowResourceTag();

    private static HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> genForShowResourceTag() {
        // basic
        HttpRequestDef.Builder<ShowResourceTagRequest, ShowResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceTagRequest.class, ShowResourceTagResponse.class)
                .withName("ShowResourceTag")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ShowResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceType, ShowResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceId, ShowResourceTagRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVifPeerDetectionRequest, CreateVifPeerDetectionResponse> createVifPeerDetection =
        genForCreateVifPeerDetection();

    private static HttpRequestDef<CreateVifPeerDetectionRequest, CreateVifPeerDetectionResponse> genForCreateVifPeerDetection() {
        // basic
        HttpRequestDef.Builder<CreateVifPeerDetectionRequest, CreateVifPeerDetectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVifPeerDetectionRequest.class, CreateVifPeerDetectionResponse.class)
            .withName("CreateVifPeerDetection")
            .withUri("/v3/{project_id}/dcaas/vif-peer-detections")
            .withContentType("application/json; charset=utf-8");

        // requests
        builder.<CreateVifPeerDetectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVifPeerDetectionRequestBody.class),
            f -> f.withMarshaller(CreateVifPeerDetectionRequest::getBody, CreateVifPeerDetectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVifPeerDetectionRequest, DeleteVifPeerDetectionResponse> deleteVifPeerDetection =
        genForDeleteVifPeerDetection();

    private static HttpRequestDef<DeleteVifPeerDetectionRequest, DeleteVifPeerDetectionResponse> genForDeleteVifPeerDetection() {
        // basic
        HttpRequestDef.Builder<DeleteVifPeerDetectionRequest, DeleteVifPeerDetectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVifPeerDetectionRequest.class, DeleteVifPeerDetectionResponse.class)
            .withName("DeleteVifPeerDetection")
            .withUri("/v3/{project_id}/dcaas/vif-peer-detections/{vif_peer_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vif_peer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVifPeerDetectionRequest::getVifPeerId,
                DeleteVifPeerDetectionRequest::setVifPeerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVifPeerDetectionsRequest, ListVifPeerDetectionsResponse> listVifPeerDetections =
        genForListVifPeerDetections();

    private static HttpRequestDef<ListVifPeerDetectionsRequest, ListVifPeerDetectionsResponse> genForListVifPeerDetections() {
        // basic
        HttpRequestDef.Builder<ListVifPeerDetectionsRequest, ListVifPeerDetectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVifPeerDetectionsRequest.class, ListVifPeerDetectionsResponse.class)
            .withName("ListVifPeerDetections")
            .withUri("/v3/{project_id}/dcaas/vif-peer-detections")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vif_peer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVifPeerDetectionsRequest::getVifPeerId,
                ListVifPeerDetectionsRequest::setVifPeerId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVifPeerDetectionsRequest::getMarker, ListVifPeerDetectionsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVifPeerDetectionsRequest::getLimit, ListVifPeerDetectionsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVifPeerDetectionsRequest::getSortKey, ListVifPeerDetectionsRequest::setSortKey));
        builder.<List<ListVifPeerDetectionsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVifPeerDetectionsRequest::getSortDir, ListVifPeerDetectionsRequest::setSortDir));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVifPeerDetectionsRequest::getOffset, ListVifPeerDetectionsRequest::setOffset));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVifPeerDetectionsRequest::getPageReverse,
                ListVifPeerDetectionsRequest::setPageReverse));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVifPeerDetectionRequest, ShowVifPeerDetectionResponse> showVifPeerDetection =
        genForShowVifPeerDetection();

    private static HttpRequestDef<ShowVifPeerDetectionRequest, ShowVifPeerDetectionResponse> genForShowVifPeerDetection() {
        // basic
        HttpRequestDef.Builder<ShowVifPeerDetectionRequest, ShowVifPeerDetectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVifPeerDetectionRequest.class, ShowVifPeerDetectionResponse.class)
            .withName("ShowVifPeerDetection")
            .withUri("/v3/{project_id}/dcaas/vif-peer-detections/{vif_peer_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vif_peer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVifPeerDetectionRequest::getVifPeerId,
                ShowVifPeerDetectionRequest::setVifPeerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> createVirtualGateway =
        genForCreateVirtualGateway();

    private static HttpRequestDef<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> genForCreateVirtualGateway() {
        // basic
        HttpRequestDef.Builder<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVirtualGatewayRequest.class, CreateVirtualGatewayResponse.class)
            .withName("CreateVirtualGateway")
            .withUri("/v3/{project_id}/dcaas/virtual-gateways")
            .withContentType("application/json");

        // requests
        builder.<CreateVirtualGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateVirtualGatewayRequestBody.class),
            f -> f.withMarshaller(CreateVirtualGatewayRequest::getBody, CreateVirtualGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> deleteVirtualGateway =
        genForDeleteVirtualGateway();

    private static HttpRequestDef<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> genForDeleteVirtualGateway() {
        // basic
        HttpRequestDef.Builder<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVirtualGatewayRequest.class, DeleteVirtualGatewayResponse.class)
            .withName("DeleteVirtualGateway")
            .withUri("/v3/{project_id}/dcaas/virtual-gateways/{virtual_gateway_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVirtualGatewayRequest::getVirtualGatewayId,
                DeleteVirtualGatewayRequest::setVirtualGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGateways =
        genForListVirtualGateways();

    private static HttpRequestDef<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> genForListVirtualGateways() {
        // basic
        HttpRequestDef.Builder<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVirtualGatewaysRequest.class, ListVirtualGatewaysResponse.class)
                .withName("ListVirtualGateways")
                .withUri("/v3/{project_id}/dcaas/virtual-gateways")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getLimit, ListVirtualGatewaysRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getMarker, ListVirtualGatewaysRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getFields, ListVirtualGatewaysRequest::setFields));
        builder.<List<ListVirtualGatewaysRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getSortDir, ListVirtualGatewaysRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getSortKey, ListVirtualGatewaysRequest::setSortKey));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getId, ListVirtualGatewaysRequest::setId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getEnterpriseProjectId,
                ListVirtualGatewaysRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getVpcId, ListVirtualGatewaysRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> showVirtualGateway =
        genForShowVirtualGateway();

    private static HttpRequestDef<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> genForShowVirtualGateway() {
        // basic
        HttpRequestDef.Builder<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVirtualGatewayRequest.class, ShowVirtualGatewayResponse.class)
                .withName("ShowVirtualGateway")
                .withUri("/v3/{project_id}/dcaas/virtual-gateways/{virtual_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVirtualGatewayRequest::getVirtualGatewayId,
                ShowVirtualGatewayRequest::setVirtualGatewayId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowVirtualGatewayRequest::getFields, ShowVirtualGatewayRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> updateVirtualGateway =
        genForUpdateVirtualGateway();

    private static HttpRequestDef<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> genForUpdateVirtualGateway() {
        // basic
        HttpRequestDef.Builder<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateVirtualGatewayRequest.class, UpdateVirtualGatewayResponse.class)
            .withName("UpdateVirtualGateway")
            .withUri("/v3/{project_id}/dcaas/virtual-gateways/{virtual_gateway_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVirtualGatewayRequest::getVirtualGatewayId,
                UpdateVirtualGatewayRequest::setVirtualGatewayId));
        builder.<UpdateVirtualGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateVirtualGatewayRequestBody.class),
            f -> f.withMarshaller(UpdateVirtualGatewayRequest::getBody, UpdateVirtualGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVifPeerRequest, CreateVifPeerResponse> createVifPeer =
        genForCreateVifPeer();

    private static HttpRequestDef<CreateVifPeerRequest, CreateVifPeerResponse> genForCreateVifPeer() {
        // basic
        HttpRequestDef.Builder<CreateVifPeerRequest, CreateVifPeerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVifPeerRequest.class, CreateVifPeerResponse.class)
                .withName("CreateVifPeer")
                .withUri("/v3/{project_id}/dcaas/vif-peers")
                .withContentType("application/json");

        // requests
        builder.<CreateVifPeerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateVifPeerRequestBody.class),
            f -> f.withMarshaller(CreateVifPeerRequest::getBody, CreateVifPeerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> createVirtualInterface =
        genForCreateVirtualInterface();

    private static HttpRequestDef<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> genForCreateVirtualInterface() {
        // basic
        HttpRequestDef.Builder<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVirtualInterfaceRequest.class, CreateVirtualInterfaceResponse.class)
            .withName("CreateVirtualInterface")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces")
            .withContentType("application/json");

        // requests
        builder.<CreateVirtualInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVirtualInterfaceRequestBody.class),
            f -> f.withMarshaller(CreateVirtualInterfaceRequest::getBody, CreateVirtualInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVifPeerRequest, DeleteVifPeerResponse> deleteVifPeer =
        genForDeleteVifPeer();

    private static HttpRequestDef<DeleteVifPeerRequest, DeleteVifPeerResponse> genForDeleteVifPeer() {
        // basic
        HttpRequestDef.Builder<DeleteVifPeerRequest, DeleteVifPeerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVifPeerRequest.class, DeleteVifPeerResponse.class)
                .withName("DeleteVifPeer")
                .withUri("/v3/{project_id}/dcaas/vif-peers/{vif_peer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vif_peer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVifPeerRequest::getVifPeerId, DeleteVifPeerRequest::setVifPeerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> deleteVirtualInterface =
        genForDeleteVirtualInterface();

    private static HttpRequestDef<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> genForDeleteVirtualInterface() {
        // basic
        HttpRequestDef.Builder<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVirtualInterfaceRequest.class, DeleteVirtualInterfaceResponse.class)
            .withName("DeleteVirtualInterface")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{virtual_interface_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVirtualInterfaceRequest::getVirtualInterfaceId,
                DeleteVirtualInterfaceRequest::setVirtualInterfaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse> listSwitchoverTestRecords =
        genForListSwitchoverTestRecords();

    private static HttpRequestDef<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse> genForListSwitchoverTestRecords() {
        // basic
        HttpRequestDef.Builder<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSwitchoverTestRecordsRequest.class,
                    ListSwitchoverTestRecordsResponse.class)
                .withName("ListSwitchoverTestRecords")
                .withUri("/v3/{project_id}/dcaas/switchover-test")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getLimit,
                ListSwitchoverTestRecordsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getMarker,
                ListSwitchoverTestRecordsRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getFields,
                ListSwitchoverTestRecordsRequest::setFields));
        builder.<List<ListSwitchoverTestRecordsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getSortDir,
                ListSwitchoverTestRecordsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getSortKey,
                ListSwitchoverTestRecordsRequest::setSortKey));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getResourceId,
                ListSwitchoverTestRecordsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> listVirtualInterfaces =
        genForListVirtualInterfaces();

    private static HttpRequestDef<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> genForListVirtualInterfaces() {
        // basic
        HttpRequestDef.Builder<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVirtualInterfacesRequest.class, ListVirtualInterfacesResponse.class)
            .withName("ListVirtualInterfaces")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getLimit, ListVirtualInterfacesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getMarker, ListVirtualInterfacesRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getFields, ListVirtualInterfacesRequest::setFields));
        builder.<List<ListVirtualInterfacesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getSortDir, ListVirtualInterfacesRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getSortKey, ListVirtualInterfacesRequest::setSortKey));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getEnterpriseProjectId,
                ListVirtualInterfacesRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getId, ListVirtualInterfacesRequest::setId));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getStatus, ListVirtualInterfacesRequest::setStatus));
        builder.<List<String>>withRequestField("direct_connect_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getDirectConnectId,
                ListVirtualInterfacesRequest::setDirectConnectId));
        builder.<List<String>>withRequestField("vgw_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getVgwId, ListVirtualInterfacesRequest::setVgwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterface =
        genForShowVirtualInterface();

    private static HttpRequestDef<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> genForShowVirtualInterface() {
        // basic
        HttpRequestDef.Builder<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVirtualInterfaceRequest.class, ShowVirtualInterfaceResponse.class)
            .withName("ShowVirtualInterface")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{virtual_interface_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVirtualInterfaceRequest::getVirtualInterfaceId,
                ShowVirtualInterfaceRequest::setVirtualInterfaceId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowVirtualInterfaceRequest::getFields, ShowVirtualInterfaceRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchoverTestRequest, SwitchoverTestResponse> switchoverTest =
        genForSwitchoverTest();

    private static HttpRequestDef<SwitchoverTestRequest, SwitchoverTestResponse> genForSwitchoverTest() {
        // basic
        HttpRequestDef.Builder<SwitchoverTestRequest, SwitchoverTestResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchoverTestRequest.class, SwitchoverTestResponse.class)
                .withName("SwitchoverTest")
                .withUri("/v3/{project_id}/dcaas/switchover-test")
                .withContentType("application/json");

        // requests
        builder.<CreateSwitchoverTestRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSwitchoverTestRequestBody.class),
            f -> f.withMarshaller(SwitchoverTestRequest::getBody, SwitchoverTestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateExtendAttributeRequest, UpdateExtendAttributeResponse> updateExtendAttribute =
        genForUpdateExtendAttribute();

    private static HttpRequestDef<UpdateExtendAttributeRequest, UpdateExtendAttributeResponse> genForUpdateExtendAttribute() {
        // basic
        HttpRequestDef.Builder<UpdateExtendAttributeRequest, UpdateExtendAttributeResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateExtendAttributeRequest.class, UpdateExtendAttributeResponse.class)
            .withName("UpdateExtendAttribute")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{virtual_interface_id}/extend-attributes")
            .withContentType("application/json; charset=utf-8");

        // requests
        builder.<String>withRequestField("virtual_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExtendAttributeRequest::getVirtualInterfaceId,
                UpdateExtendAttributeRequest::setVirtualInterfaceId));
        builder.<UpdateExtendAttributeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateExtendAttributeRequestBody.class),
            f -> f.withMarshaller(UpdateExtendAttributeRequest::getBody, UpdateExtendAttributeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVifPeerRequest, UpdateVifPeerResponse> updateVifPeer =
        genForUpdateVifPeer();

    private static HttpRequestDef<UpdateVifPeerRequest, UpdateVifPeerResponse> genForUpdateVifPeer() {
        // basic
        HttpRequestDef.Builder<UpdateVifPeerRequest, UpdateVifPeerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVifPeerRequest.class, UpdateVifPeerResponse.class)
                .withName("UpdateVifPeer")
                .withUri("/v3/{project_id}/dcaas/vif-peers/{vif_peer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vif_peer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVifPeerRequest::getVifPeerId, UpdateVifPeerRequest::setVifPeerId));
        builder.<UpdateVifPeerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateVifPeerRequestBody.class),
            f -> f.withMarshaller(UpdateVifPeerRequest::getBody, UpdateVifPeerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> updateVirtualInterface =
        genForUpdateVirtualInterface();

    private static HttpRequestDef<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> genForUpdateVirtualInterface() {
        // basic
        HttpRequestDef.Builder<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateVirtualInterfaceRequest.class, UpdateVirtualInterfaceResponse.class)
            .withName("UpdateVirtualInterface")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{virtual_interface_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVirtualInterfaceRequest::getVirtualInterfaceId,
                UpdateVirtualInterfaceRequest::setVirtualInterfaceId));
        builder.<UpdateVirtualInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVirtualInterfaceRequestBody.class),
            f -> f.withMarshaller(UpdateVirtualInterfaceRequest::getBody, UpdateVirtualInterfaceRequest::setBody));

        // response

        return builder.build();
    }

}

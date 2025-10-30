package com.huaweicloud.sdk.cloudpond.v2;

import com.huaweicloud.sdk.cloudpond.v2.model.ListNetworkDeviceOfferingsRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListNetworkDeviceOfferingsResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListNetworkDevicesRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListNetworkDevicesResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListSaleCyclesRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListSaleCyclesResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListServerOfferingsRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListServerOfferingsResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListServersRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListServersResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStorageGearsRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStorageGearsResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStoragePoolsRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStoragePoolsResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStorageTypesRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStorageTypesResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.NetworkDeviceStatus;
import com.huaweicloud.sdk.cloudpond.v2.model.PayMode;
import com.huaweicloud.sdk.cloudpond.v2.model.ServerStatus;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowNetworkDeviceRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowNetworkDeviceResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowServerRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowServerResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowStoragePoolRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowStoragePoolResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.StoragePoolStatus;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CloudPondMeta {

    public static final HttpRequestDef<ListNetworkDevicesRequest, ListNetworkDevicesResponse> listNetworkDevices =
        genForListNetworkDevices();

    private static HttpRequestDef<ListNetworkDevicesRequest, ListNetworkDevicesResponse> genForListNetworkDevices() {
        // basic
        HttpRequestDef.Builder<ListNetworkDevicesRequest, ListNetworkDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNetworkDevicesRequest.class, ListNetworkDevicesResponse.class)
                .withName("ListNetworkDevices")
                .withUri("/v2/{domain_id}/network-devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDevicesRequest::getEdgeSiteId, ListNetworkDevicesRequest::setEdgeSiteId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkDevicesRequest::getLimit, ListNetworkDevicesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDevicesRequest::getMarker, ListNetworkDevicesRequest::setMarker));
        builder.<List<NetworkDeviceStatus>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkDevicesRequest::getStatus, ListNetworkDevicesRequest::setStatus));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkDevicesRequest::getId, ListNetworkDevicesRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkDeviceRequest, ShowNetworkDeviceResponse> showNetworkDevice =
        genForShowNetworkDevice();

    private static HttpRequestDef<ShowNetworkDeviceRequest, ShowNetworkDeviceResponse> genForShowNetworkDevice() {
        // basic
        HttpRequestDef.Builder<ShowNetworkDeviceRequest, ShowNetworkDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNetworkDeviceRequest.class, ShowNetworkDeviceResponse.class)
                .withName("ShowNetworkDevice")
                .withUri("/v2/{domain_id}/network-devices/{network_device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("network_device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkDeviceRequest::getNetworkDeviceId,
                ShowNetworkDeviceRequest::setNetworkDeviceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkDeviceOfferingsRequest, ListNetworkDeviceOfferingsResponse> listNetworkDeviceOfferings =
        genForListNetworkDeviceOfferings();

    private static HttpRequestDef<ListNetworkDeviceOfferingsRequest, ListNetworkDeviceOfferingsResponse> genForListNetworkDeviceOfferings() {
        // basic
        HttpRequestDef.Builder<ListNetworkDeviceOfferingsRequest, ListNetworkDeviceOfferingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNetworkDeviceOfferingsRequest.class,
                    ListNetworkDeviceOfferingsResponse.class)
                .withName("ListNetworkDeviceOfferings")
                .withUri("/v2/{domain_id}/network-device-offerings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDeviceOfferingsRequest::getZoneCode,
                ListNetworkDeviceOfferingsRequest::setZoneCode));
        builder.<List<String>>withRequestField("storage_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkDeviceOfferingsRequest::getStorageType,
                ListNetworkDeviceOfferingsRequest::setStorageType));
        builder.<List<PayMode>>withRequestField("pay_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkDeviceOfferingsRequest::getPayMode,
                ListNetworkDeviceOfferingsRequest::setPayMode));
        builder.<List<Integer>>withRequestField("period_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkDeviceOfferingsRequest::getPeriodNum,
                ListNetworkDeviceOfferingsRequest::setPeriodNum));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkDeviceOfferingsRequest::getLimit,
                ListNetworkDeviceOfferingsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDeviceOfferingsRequest::getMarker,
                ListNetworkDeviceOfferingsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerOfferingsRequest, ListServerOfferingsResponse> listServerOfferings =
        genForListServerOfferings();

    private static HttpRequestDef<ListServerOfferingsRequest, ListServerOfferingsResponse> genForListServerOfferings() {
        // basic
        HttpRequestDef.Builder<ListServerOfferingsRequest, ListServerOfferingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServerOfferingsRequest.class, ListServerOfferingsResponse.class)
                .withName("ListServerOfferings")
                .withUri("/v2/{domain_id}/server-offerings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerOfferingsRequest::getZoneCode, ListServerOfferingsRequest::setZoneCode));
        builder.<List<PayMode>>withRequestField("pay_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListServerOfferingsRequest::getPayMode, ListServerOfferingsRequest::setPayMode));
        builder.<List<Integer>>withRequestField("period_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListServerOfferingsRequest::getPeriodNum, ListServerOfferingsRequest::setPeriodNum));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerOfferingsRequest::getLimit, ListServerOfferingsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerOfferingsRequest::getMarker, ListServerOfferingsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSaleCyclesRequest, ListSaleCyclesResponse> listSaleCycles =
        genForListSaleCycles();

    private static HttpRequestDef<ListSaleCyclesRequest, ListSaleCyclesResponse> genForListSaleCycles() {
        // basic
        HttpRequestDef.Builder<ListSaleCyclesRequest, ListSaleCyclesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSaleCyclesRequest.class, ListSaleCyclesResponse.class)
                .withName("ListSaleCycles")
                .withUri("/v2/{domain_id}/sale-cycles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSaleCyclesRequest::getZoneCode, ListSaleCyclesRequest::setZoneCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersRequest, ListServersResponse> listServers = genForListServers();

    private static HttpRequestDef<ListServersRequest, ListServersResponse> genForListServers() {
        // basic
        HttpRequestDef.Builder<ListServersRequest, ListServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersRequest.class, ListServersResponse.class)
                .withName("ListServers")
                .withUri("/v2/{domain_id}/servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getEdgeSiteId, ListServersRequest::setEdgeSiteId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getLimit, ListServersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getMarker, ListServersRequest::setMarker));
        builder.<List<ServerStatus>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListServersRequest::getStatus, ListServersRequest::setStatus));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListServersRequest::getId, ListServersRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRequest, ShowServerResponse> showServer = genForShowServer();

    private static HttpRequestDef<ShowServerRequest, ShowServerResponse> genForShowServer() {
        // basic
        HttpRequestDef.Builder<ShowServerRequest, ShowServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerRequest.class, ShowServerResponse.class)
                .withName("ShowServer")
                .withUri("/v2/{domain_id}/servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerRequest::getServerId, ShowServerRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageGearsRequest, ListStorageGearsResponse> listStorageGears =
        genForListStorageGears();

    private static HttpRequestDef<ListStorageGearsRequest, ListStorageGearsResponse> genForListStorageGears() {
        // basic
        HttpRequestDef.Builder<ListStorageGearsRequest, ListStorageGearsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStorageGearsRequest.class, ListStorageGearsResponse.class)
                .withName("ListStorageGears")
                .withUri("/v2/{domain_id}/storage-gears")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageGearsRequest::getZoneCode, ListStorageGearsRequest::setZoneCode));
        builder.<List<PayMode>>withRequestField("pay_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStorageGearsRequest::getPayMode, ListStorageGearsRequest::setPayMode));
        builder.<List<Integer>>withRequestField("period_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStorageGearsRequest::getPeriodNum, ListStorageGearsRequest::setPeriodNum));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStorageGearsRequest::getLimit, ListStorageGearsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageGearsRequest::getMarker, ListStorageGearsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoragePoolsRequest, ListStoragePoolsResponse> listStoragePools =
        genForListStoragePools();

    private static HttpRequestDef<ListStoragePoolsRequest, ListStoragePoolsResponse> genForListStoragePools() {
        // basic
        HttpRequestDef.Builder<ListStoragePoolsRequest, ListStoragePoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStoragePoolsRequest.class, ListStoragePoolsResponse.class)
                .withName("ListStoragePools")
                .withUri("/v2/{domain_id}/storage-pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getEdgeSiteId, ListStoragePoolsRequest::setEdgeSiteId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getLimit, ListStoragePoolsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getMarker, ListStoragePoolsRequest::setMarker));
        builder.<List<StoragePoolStatus>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStoragePoolsRequest::getStatus, ListStoragePoolsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStoragePoolRequest, ShowStoragePoolResponse> showStoragePool =
        genForShowStoragePool();

    private static HttpRequestDef<ShowStoragePoolRequest, ShowStoragePoolResponse> genForShowStoragePool() {
        // basic
        HttpRequestDef.Builder<ShowStoragePoolRequest, ShowStoragePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStoragePoolRequest.class, ShowStoragePoolResponse.class)
                .withName("ShowStoragePool")
                .withUri("/v2/{domain_id}/storage-pools/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStoragePoolRequest::getId, ShowStoragePoolRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypes =
        genForListStorageTypes();

    private static HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> genForListStorageTypes() {
        // basic
        HttpRequestDef.Builder<ListStorageTypesRequest, ListStorageTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStorageTypesRequest.class, ListStorageTypesResponse.class)
                .withName("ListStorageTypes")
                .withUri("/v2/{domain_id}/storage-types")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getZoneCode, ListStorageTypesRequest::setZoneCode));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getName, ListStorageTypesRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getLimit, ListStorageTypesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getMarker, ListStorageTypesRequest::setMarker));

        // response

        return builder.build();
    }

}

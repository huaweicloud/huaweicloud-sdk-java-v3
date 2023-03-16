package com.huaweicloud.sdk.eip.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eip.v3.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class EipMeta {

    public static final HttpRequestDef<ListCommonPoolsRequest, ListCommonPoolsResponse> listCommonPools =
        genForlistCommonPools();

    private static HttpRequestDef<ListCommonPoolsRequest, ListCommonPoolsResponse> genForlistCommonPools() {
        // basic
        HttpRequestDef.Builder<ListCommonPoolsRequest, ListCommonPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommonPoolsRequest.class, ListCommonPoolsResponse.class)
                .withName("ListCommonPools")
                .withUri("/v3/{project_id}/eip/publicip-pools/common-pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getPublicBorderGroup, (req, v) -> {
                req.setPublicBorderGroup(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse> listPublicBorderGroups =
        genForlistPublicBorderGroups();

    private static HttpRequestDef<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse> genForlistPublicBorderGroups() {
        // basic
        HttpRequestDef.Builder<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPublicBorderGroupsRequest.class, ListPublicBorderGroupsResponse.class)
            .withName("ListPublicBorderGroups")
            .withUri("/v3/{project_id}/eip/public-border-groups")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicBorderGroupsRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipPoolRequest, ListPublicipPoolResponse> listPublicipPool =
        genForlistPublicipPool();

    private static HttpRequestDef<ListPublicipPoolRequest, ListPublicipPoolResponse> genForlistPublicipPool() {
        // basic
        HttpRequestDef.Builder<ListPublicipPoolRequest, ListPublicipPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicipPoolRequest.class, ListPublicipPoolResponse.class)
                .withName("ListPublicipPool")
                .withUri("/v3/{project_id}/eip/publicip-pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getPublicBorderGroup, (req, v) -> {
                req.setPublicBorderGroup(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> listShareBandwidthTypes =
        genForlistShareBandwidthTypes();

    private static HttpRequestDef<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> genForlistShareBandwidthTypes() {
        // basic
        HttpRequestDef.Builder<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListShareBandwidthTypesRequest.class, ListShareBandwidthTypesResponse.class)
            .withName("ListShareBandwidthTypes")
            .withUri("/v3/{project_id}/eip/share-bandwidth-types")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("bandwidth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getBandwidthType, (req, v) -> {
                req.setBandwidthType(v);
            }));
        builder.<String>withRequestField("name_en",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getNameEn, (req, v) -> {
                req.setNameEn(v);
            }));
        builder.<String>withRequestField("name_zh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getNameZh, (req, v) -> {
                req.setNameZh(v);
            }));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getPublicBorderGroup, (req, v) -> {
                req.setPublicBorderGroup(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipPoolRequest, ShowPublicipPoolResponse> showPublicipPool =
        genForshowPublicipPool();

    private static HttpRequestDef<ShowPublicipPoolRequest, ShowPublicipPoolResponse> genForshowPublicipPool() {
        // basic
        HttpRequestDef.Builder<ShowPublicipPoolRequest, ShowPublicipPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicipPoolRequest.class, ShowPublicipPoolResponse.class)
                .withName("ShowPublicipPool")
                .withUri("/v3/{project_id}/eip/publicip-pools/{publicip_pool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolRequest::getPublicipPoolId, (req, v) -> {
                req.setPublicipPoolId(v);
            }));
        builder.<String>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociatePublicipsRequest, AssociatePublicipsResponse> associatePublicips =
        genForassociatePublicips();

    private static HttpRequestDef<AssociatePublicipsRequest, AssociatePublicipsResponse> genForassociatePublicips() {
        // basic
        HttpRequestDef.Builder<AssociatePublicipsRequest, AssociatePublicipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociatePublicipsRequest.class, AssociatePublicipsResponse.class)
                .withName("AssociatePublicips")
                .withUri("/v3/{project_id}/eip/publicips/{publicip_id}/associate-instance")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociatePublicipsRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<AssociatePublicipsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociatePublicipsRequestBody.class),
            f -> f.withMarshaller(AssociatePublicipsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse> countEipAvailableResources =
        genForcountEipAvailableResources();

    private static HttpRequestDef<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse> genForcountEipAvailableResources() {
        // basic
        HttpRequestDef.Builder<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CountEipAvailableResourcesRequest.class,
                    CountEipAvailableResourcesResponse.class)
                .withName("CountEipAvailableResources")
                .withUri("/v3/{project_id}/eip/resources/available")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<EipResourcesAvailableV3RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EipResourcesAvailableV3RequestBody.class),
            f -> f.withMarshaller(CountEipAvailableResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociatePublicipsRequest, DisassociatePublicipsResponse> disassociatePublicips =
        genFordisassociatePublicips();

    private static HttpRequestDef<DisassociatePublicipsRequest, DisassociatePublicipsResponse> genFordisassociatePublicips() {
        // basic
        HttpRequestDef.Builder<DisassociatePublicipsRequest, DisassociatePublicipsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisassociatePublicipsRequest.class, DisassociatePublicipsResponse.class)
            .withName("DisassociatePublicips")
            .withUri("/v3/{project_id}/eip/publicips/{publicip_id}/disassociate-instance")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociatePublicipsRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipsRequest, ListPublicipsResponse> listPublicips =
        genForlistPublicips();

    private static HttpRequestDef<ListPublicipsRequest, ListPublicipsResponse> genForlistPublicips() {
        // basic
        HttpRequestDef.Builder<ListPublicipsRequest, ListPublicipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicipsRequest.class, ListPublicipsResponse.class)
                .withName("ListPublicips")
                .withUri("/v3/{project_id}/eip/publicips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));
        builder.<ListPublicipsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicipsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListPublicipsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListPublicipsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicipsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListPublicipsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<ListPublicipsRequest.IpVersionEnum>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            }));
        builder.<List<String>>withRequestField("public_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpAddress, (req, v) -> {
                req.setPublicIpAddress(v);
            }));
        builder.<String>withRequestField("public_ip_address_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpAddressLike, (req, v) -> {
                req.setPublicIpAddressLike(v);
            }));
        builder.<List<String>>withRequestField("public_ipv6_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpv6Address, (req, v) -> {
                req.setPublicIpv6Address(v);
            }));
        builder.<String>withRequestField("public_ipv6_address_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpv6AddressLike, (req, v) -> {
                req.setPublicIpv6AddressLike(v);
            }));
        builder.<List<ListPublicipsRequest.TypeEnum>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<ListPublicipsRequest.NetworkTypeEnum>>withRequestField("network_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getNetworkType, (req, v) -> {
                req.setNetworkType(v);
            }));
        builder.<List<String>>withRequestField("publicip_pool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicipPoolName, (req, v) -> {
                req.setPublicipPoolName(v);
            }));
        builder.<List<ListPublicipsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("alias_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAliasLike, (req, v) -> {
                req.setAliasLike(v);
            }));
        builder.<List<String>>withRequestField("alias",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAlias, (req, v) -> {
                req.setAlias(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("vnic.private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicPrivateIpAddress, (req, v) -> {
                req.setVnicPrivateIpAddress(v);
            }));
        builder.<String>withRequestField("vnic.private_ip_address_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicPrivateIpAddressLike, (req, v) -> {
                req.setVnicPrivateIpAddressLike(v);
            }));
        builder.<List<String>>withRequestField("vnic.device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicDeviceId, (req, v) -> {
                req.setVnicDeviceId(v);
            }));
        builder.<List<String>>withRequestField("vnic.device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicDeviceOwner, (req, v) -> {
                req.setVnicDeviceOwner(v);
            }));
        builder.<List<String>>withRequestField("vnic.vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicVpcId, (req, v) -> {
                req.setVnicVpcId(v);
            }));
        builder.<List<String>>withRequestField("vnic.port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicPortId, (req, v) -> {
                req.setVnicPortId(v);
            }));
        builder.<String>withRequestField("vnic.device_owner_prefixlike",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicDeviceOwnerPrefixlike, (req, v) -> {
                req.setVnicDeviceOwnerPrefixlike(v);
            }));
        builder.<List<String>>withRequestField("vnic.instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicInstanceType, (req, v) -> {
                req.setVnicInstanceType(v);
            }));
        builder.<List<String>>withRequestField("vnic.instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicInstanceId, (req, v) -> {
                req.setVnicInstanceId(v);
            }));
        builder.<List<String>>withRequestField("bandwidth.id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));
        builder.<List<String>>withRequestField("bandwidth.name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthName, (req, v) -> {
                req.setBandwidthName(v);
            }));
        builder.<List<String>>withRequestField("bandwidth.name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthNameLike, (req, v) -> {
                req.setBandwidthNameLike(v);
            }));
        builder.<List<Integer>>withRequestField("bandwidth.size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthSize, (req, v) -> {
                req.setBandwidthSize(v);
            }));
        builder.<List<ListPublicipsRequest.BandwidthShareTypeEnum>>withRequestField("bandwidth.share_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthShareType, (req, v) -> {
                req.setBandwidthShareType(v);
            }));
        builder.<List<ListPublicipsRequest.BandwidthChargeModeEnum>>withRequestField("bandwidth.charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthChargeMode, (req, v) -> {
                req.setBandwidthChargeMode(v);
            }));
        builder.<List<String>>withRequestField("billing_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBillingInfo, (req, v) -> {
                req.setBillingInfo(v);
            }));
        builder.<ListPublicipsRequest.BillingModeEnum>withRequestField("billing_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicipsRequest.BillingModeEnum.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBillingMode, (req, v) -> {
                req.setBillingMode(v);
            }));
        builder.<List<ListPublicipsRequest.AssociateInstanceTypeEnum>>withRequestField("associate_instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAssociateInstanceType, (req, v) -> {
                req.setAssociateInstanceType(v);
            }));
        builder.<List<String>>withRequestField("associate_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAssociateInstanceId, (req, v) -> {
                req.setAssociateInstanceId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicBorderGroup, (req, v) -> {
                req.setPublicBorderGroup(v);
            }));
        builder.<List<String>>withRequestField("allow_share_bandwidth_type_any",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAllowShareBandwidthTypeAny, (req, v) -> {
                req.setAllowShareBandwidthTypeAny(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipRequest, ShowPublicipResponse> showPublicip = genForshowPublicip();

    private static HttpRequestDef<ShowPublicipRequest, ShowPublicipResponse> genForshowPublicip() {
        // basic
        HttpRequestDef.Builder<ShowPublicipRequest, ShowPublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicipRequest.class, ShowPublicipResponse.class)
                .withName("ShowPublicip")
                .withUri("/v3/{project_id}/eip/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPublicipRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssociatePublicipRequest, UpdateAssociatePublicipResponse> updateAssociatePublicip =
        genForupdateAssociatePublicip();

    private static HttpRequestDef<UpdateAssociatePublicipRequest, UpdateAssociatePublicipResponse> genForupdateAssociatePublicip() {
        // basic
        HttpRequestDef.Builder<UpdateAssociatePublicipRequest, UpdateAssociatePublicipResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAssociatePublicipRequest.class, UpdateAssociatePublicipResponse.class)
            .withName("UpdateAssociatePublicip")
            .withUri("/v3/{project_id}/eip/publicips/{publicip_id}/associate-instance")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssociatePublicipRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<AssociatePublicipsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociatePublicipsRequestBody.class),
            f -> f.withMarshaller(UpdateAssociatePublicipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDisassociatePublicipRequest, UpdateDisassociatePublicipResponse> updateDisassociatePublicip =
        genForupdateDisassociatePublicip();

    private static HttpRequestDef<UpdateDisassociatePublicipRequest, UpdateDisassociatePublicipResponse> genForupdateDisassociatePublicip() {
        // basic
        HttpRequestDef.Builder<UpdateDisassociatePublicipRequest, UpdateDisassociatePublicipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDisassociatePublicipRequest.class,
                    UpdateDisassociatePublicipResponse.class)
                .withName("UpdateDisassociatePublicip")
                .withUri("/v3/{project_id}/eip/publicips/{publicip_id}/disassociate-instance")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDisassociatePublicipRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<DisassociatePublicipsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociatePublicipsRequestBody.class),
            f -> f.withMarshaller(UpdateDisassociatePublicipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

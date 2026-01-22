package com.huaweicloud.sdk.eip.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eip.v3.model.AssociatePublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.AssociatePublicipsRequestBody;
import com.huaweicloud.sdk.eip.v3.model.AssociatePublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.AttachBatchPublicIpRequest;
import com.huaweicloud.sdk.eip.v3.model.AttachBatchPublicIpResponse;
import com.huaweicloud.sdk.eip.v3.model.AttachShareBandwidthRequest;
import com.huaweicloud.sdk.eip.v3.model.AttachShareBandwidthResponse;
import com.huaweicloud.sdk.eip.v3.model.AttachSharebwReq;
import com.huaweicloud.sdk.eip.v3.model.BatchAttachSharebwReq;
import com.huaweicloud.sdk.eip.v3.model.CountEipAvailableResourcesRequest;
import com.huaweicloud.sdk.eip.v3.model.CountEipAvailableResourcesResponse;
import com.huaweicloud.sdk.eip.v3.model.CreateTenantVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.CreateTenantVpcIgwRequestBody;
import com.huaweicloud.sdk.eip.v3.model.CreateTenantVpcIgwResponse;
import com.huaweicloud.sdk.eip.v3.model.DeleteTenantVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.DeleteTenantVpcIgwResponse;
import com.huaweicloud.sdk.eip.v3.model.DetachBatchPublicIpRequest;
import com.huaweicloud.sdk.eip.v3.model.DetachBatchPublicIpResponse;
import com.huaweicloud.sdk.eip.v3.model.DetachBatchSharedbwReq;
import com.huaweicloud.sdk.eip.v3.model.DetachShareBandwidthRequest;
import com.huaweicloud.sdk.eip.v3.model.DetachShareBandwidthResponse;
import com.huaweicloud.sdk.eip.v3.model.DetachSharedbwReq;
import com.huaweicloud.sdk.eip.v3.model.DisableNat64Request;
import com.huaweicloud.sdk.eip.v3.model.DisableNat64Response;
import com.huaweicloud.sdk.eip.v3.model.DisassociatePublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.DisassociatePublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.EipResourcesAvailableV3RequestBody;
import com.huaweicloud.sdk.eip.v3.model.EnableNat64Request;
import com.huaweicloud.sdk.eip.v3.model.EnableNat64Response;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthRequest;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthResponse;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthsLimitRequest;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthsLimitResponse;
import com.huaweicloud.sdk.eip.v3.model.ListCommonPoolsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListCommonPoolsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListEipBandwidthsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListEipBandwidthsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListProjectGeipBindingsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListProjectGeipBindingsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicBorderGroupsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicBorderGroupsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipPoolRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipPoolResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListShareBandwidthTypesRequest;
import com.huaweicloud.sdk.eip.v3.model.ListShareBandwidthTypesResponse;
import com.huaweicloud.sdk.eip.v3.model.ListTenantVpcIgwsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListTenantVpcIgwsResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowInternalVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowInternalVpcIgwResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolTypesRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolTypesResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipResponse;
import com.huaweicloud.sdk.eip.v3.model.UpdatePublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.UpdatePublicipResponse;
import com.huaweicloud.sdk.eip.v3.model.UpdatePublicipsRequestBody;
import com.huaweicloud.sdk.eip.v3.model.UpdateTenantVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.UpdateTenantVpcIgwRequestBody;
import com.huaweicloud.sdk.eip.v3.model.UpdateTenantVpcIgwResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class EipMeta {

    public static final HttpRequestDef<ListBandwidthRequest, ListBandwidthResponse> listBandwidth =
        genForListBandwidth();

    private static HttpRequestDef<ListBandwidthRequest, ListBandwidthResponse> genForListBandwidth() {
        // basic
        HttpRequestDef.Builder<ListBandwidthRequest, ListBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthRequest.class, ListBandwidthResponse.class)
                .withName("ListBandwidth")
                .withUri("/v3/{project_id}/eip/bandwidths")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getLimit, ListBandwidthRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getMarker, ListBandwidthRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getId, ListBandwidthRequest::setId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthRequest::getFields, ListBandwidthRequest::setFields));
        builder.<String>withRequestField("bandwidth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getBandwidthType, ListBandwidthRequest::setBandwidthType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getName, ListBandwidthRequest::setName));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getNameLike, ListBandwidthRequest::setNameLike));
        builder.<String>withRequestField("ingress_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getIngressSize, ListBandwidthRequest::setIngressSize));
        builder.<String>withRequestField("admin_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getAdminState, ListBandwidthRequest::setAdminState));
        builder.<String>withRequestField("billing_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getBillingInfo, ListBandwidthRequest::setBillingInfo));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getTags, ListBandwidthRequest::setTags));
        builder.<String>withRequestField("enable_bandwidth_rules",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getEnableBandwidthRules,
                ListBandwidthRequest::setEnableBandwidthRules));
        builder.<Integer>withRequestField("rule_quota",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthRequest::getRuleQuota, ListBandwidthRequest::setRuleQuota));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getPublicBorderGroup,
                ListBandwidthRequest::setPublicBorderGroup));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getChargeMode, ListBandwidthRequest::setChargeMode));
        builder.<String>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getSize, ListBandwidthRequest::setSize));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthRequest::getType, ListBandwidthRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse> listBandwidthsLimit =
        genForListBandwidthsLimit();

    private static HttpRequestDef<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse> genForListBandwidthsLimit() {
        // basic
        HttpRequestDef.Builder<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthsLimitRequest.class, ListBandwidthsLimitResponse.class)
                .withName("ListBandwidthsLimit")
                .withUri("/v3/{project_id}/eip/eip-bandwidth-limits")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthsLimitRequest::getLimit, ListBandwidthsLimitRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthsLimitRequest::getOffset, ListBandwidthsLimitRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthsLimitRequest::getMarker, ListBandwidthsLimitRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListBandwidthsLimitRequest::getPageReverse,
                ListBandwidthsLimitRequest::setPageReverse));
        builder.<List<ListBandwidthsLimitRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthsLimitRequest::getFields, ListBandwidthsLimitRequest::setFields));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthsLimitRequest::getChargeMode,
                ListBandwidthsLimitRequest::setChargeMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommonPoolsRequest, ListCommonPoolsResponse> listCommonPools =
        genForListCommonPools();

    private static HttpRequestDef<ListCommonPoolsRequest, ListCommonPoolsResponse> genForListCommonPools() {
        // basic
        HttpRequestDef.Builder<ListCommonPoolsRequest, ListCommonPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommonPoolsRequest.class, ListCommonPoolsResponse.class)
                .withName("ListCommonPools")
                .withUri("/v3/{project_id}/eip/publicip-pools/common-pools")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getFields, ListCommonPoolsRequest::setFields));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getLimit, ListCommonPoolsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getOffset, ListCommonPoolsRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getName, ListCommonPoolsRequest::setName));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonPoolsRequest::getPublicBorderGroup,
                ListCommonPoolsRequest::setPublicBorderGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEipBandwidthsRequest, ListEipBandwidthsResponse> listEipBandwidths =
        genForListEipBandwidths();

    private static HttpRequestDef<ListEipBandwidthsRequest, ListEipBandwidthsResponse> genForListEipBandwidths() {
        // basic
        HttpRequestDef.Builder<ListEipBandwidthsRequest, ListEipBandwidthsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEipBandwidthsRequest.class, ListEipBandwidthsResponse.class)
                .withName("ListEipBandwidths")
                .withUri("/v3/{project_id}/eip-bandwidths")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getLimit, ListEipBandwidthsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getMarker, ListEipBandwidthsRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getFields, ListEipBandwidthsRequest::setFields));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getId, ListEipBandwidthsRequest::setId));
        builder.<String>withRequestField("bandwidth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getBandwidthType,
                ListEipBandwidthsRequest::setBandwidthType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getName, ListEipBandwidthsRequest::setName));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getNameLike, ListEipBandwidthsRequest::setNameLike));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getTenantId, ListEipBandwidthsRequest::setTenantId));
        builder.<String>withRequestField("ingress_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getIngressSize, ListEipBandwidthsRequest::setIngressSize));
        builder.<String>withRequestField("admin_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getAdminState, ListEipBandwidthsRequest::setAdminState));
        builder.<String>withRequestField("billing_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getBillingInfo, ListEipBandwidthsRequest::setBillingInfo));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getTags, ListEipBandwidthsRequest::setTags));
        builder.<String>withRequestField("enable_bandwidth_rules",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getEnableBandwidthRules,
                ListEipBandwidthsRequest::setEnableBandwidthRules));
        builder.<Integer>withRequestField("rule_quota",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getRuleQuota, ListEipBandwidthsRequest::setRuleQuota));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getPublicBorderGroup,
                ListEipBandwidthsRequest::setPublicBorderGroup));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getChargeMode, ListEipBandwidthsRequest::setChargeMode));
        builder.<String>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getSize, ListEipBandwidthsRequest::setSize));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipBandwidthsRequest::getType, ListEipBandwidthsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse> listPublicBorderGroups =
        genForListPublicBorderGroups();

    private static HttpRequestDef<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse> genForListPublicBorderGroups() {
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
            f -> f.withMarshaller(ListPublicBorderGroupsRequest::getFields, ListPublicBorderGroupsRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipPoolRequest, ListPublicipPoolResponse> listPublicipPool =
        genForListPublicipPool();

    private static HttpRequestDef<ListPublicipPoolRequest, ListPublicipPoolResponse> genForListPublicipPool() {
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
            f -> f.withMarshaller(ListPublicipPoolRequest::getMarker, ListPublicipPoolRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getLimit, ListPublicipPoolRequest::setLimit));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getFields, ListPublicipPoolRequest::setFields));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getSortKey, ListPublicipPoolRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getSortDir, ListPublicipPoolRequest::setSortDir));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getId, ListPublicipPoolRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getName, ListPublicipPoolRequest::setName));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getSize, ListPublicipPoolRequest::setSize));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getStatus, ListPublicipPoolRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getType, ListPublicipPoolRequest::setType));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getDescription, ListPublicipPoolRequest::setDescription));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipPoolRequest::getPublicBorderGroup,
                ListPublicipPoolRequest::setPublicBorderGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> listShareBandwidthTypes =
        genForListShareBandwidthTypes();

    private static HttpRequestDef<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> genForListShareBandwidthTypes() {
        // basic
        HttpRequestDef.Builder<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListShareBandwidthTypesRequest.class, ListShareBandwidthTypesResponse.class)
            .withName("ListShareBandwidthTypes")
            .withUri("/v3/{project_id}/eip/share-bandwidth-types")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getFields,
                ListShareBandwidthTypesRequest::setFields));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getId, ListShareBandwidthTypesRequest::setId));
        builder.<String>withRequestField("bandwidth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getBandwidthType,
                ListShareBandwidthTypesRequest::setBandwidthType));
        builder.<String>withRequestField("name_en",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getNameEn,
                ListShareBandwidthTypesRequest::setNameEn));
        builder.<String>withRequestField("name_zh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getNameZh,
                ListShareBandwidthTypesRequest::setNameZh));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getPublicBorderGroup,
                ListShareBandwidthTypesRequest::setPublicBorderGroup));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getSortKey,
                ListShareBandwidthTypesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getSortDir,
                ListShareBandwidthTypesRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getLimit, ListShareBandwidthTypesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getMarker,
                ListShareBandwidthTypesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareBandwidthTypesRequest::getOffset,
                ListShareBandwidthTypesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipPoolRequest, ShowPublicipPoolResponse> showPublicipPool =
        genForShowPublicipPool();

    private static HttpRequestDef<ShowPublicipPoolRequest, ShowPublicipPoolResponse> genForShowPublicipPool() {
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
            f -> f.withMarshaller(ShowPublicipPoolRequest::getPublicipPoolId,
                ShowPublicipPoolRequest::setPublicipPoolId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPublicipPoolRequest::getFields, ShowPublicipPoolRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipPoolTypesRequest, ShowPublicipPoolTypesResponse> showPublicipPoolTypes =
        genForShowPublicipPoolTypes();

    private static HttpRequestDef<ShowPublicipPoolTypesRequest, ShowPublicipPoolTypesResponse> genForShowPublicipPoolTypes() {
        // basic
        HttpRequestDef.Builder<ShowPublicipPoolTypesRequest, ShowPublicipPoolTypesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPublicipPoolTypesRequest.class, ShowPublicipPoolTypesResponse.class)
            .withName("ShowPublicipPoolTypes")
            .withUri("/v3/{project_id}/eip/publicip-pool-types")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getMarker, ShowPublicipPoolTypesRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getLimit, ShowPublicipPoolTypesRequest::setLimit));
        builder.<String>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getFields, ShowPublicipPoolTypesRequest::setFields));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getSortKey, ShowPublicipPoolTypesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getSortDir, ShowPublicipPoolTypesRequest::setSortDir));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getId, ShowPublicipPoolTypesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getName, ShowPublicipPoolTypesRequest::setName));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getSize, ShowPublicipPoolTypesRequest::setSize));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getStatus, ShowPublicipPoolTypesRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getType, ShowPublicipPoolTypesRequest::setType));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getDescription,
                ShowPublicipPoolTypesRequest::setDescription));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipPoolTypesRequest::getPublicBorderGroup,
                ShowPublicipPoolTypesRequest::setPublicBorderGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectGeipBindingsRequest, ListProjectGeipBindingsResponse> listProjectGeipBindings =
        genForListProjectGeipBindings();

    private static HttpRequestDef<ListProjectGeipBindingsRequest, ListProjectGeipBindingsResponse> genForListProjectGeipBindings() {
        // basic
        HttpRequestDef.Builder<ListProjectGeipBindingsRequest, ListProjectGeipBindingsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectGeipBindingsRequest.class, ListProjectGeipBindingsResponse.class)
            .withName("ListProjectGeipBindings")
            .withUri("/v3/{project_id}/geip/bindings")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getFields,
                ListProjectGeipBindingsRequest::setFields));
        builder.<String>withRequestField("geip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getGeipId,
                ListProjectGeipBindingsRequest::setGeipId));
        builder.<String>withRequestField("geip_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getGeipIpAddress,
                ListProjectGeipBindingsRequest::setGeipIpAddress));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getPublicBorderGroup,
                ListProjectGeipBindingsRequest::setPublicBorderGroup));
        builder.<String>withRequestField("instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getInstanceType,
                ListProjectGeipBindingsRequest::setInstanceType));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getInstanceId,
                ListProjectGeipBindingsRequest::setInstanceId));
        builder.<String>withRequestField("instance_vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getInstanceVpcId,
                ListProjectGeipBindingsRequest::setInstanceVpcId));
        builder.<String>withRequestField("gcbandwidth.id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getGcbandwidthId,
                ListProjectGeipBindingsRequest::setGcbandwidthId));
        builder.<String>withRequestField("gcbandwidth.admin_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getGcbandwidthAdminStatus,
                ListProjectGeipBindingsRequest::setGcbandwidthAdminStatus));
        builder.<Integer>withRequestField("gcbandwidth.size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getGcbandwidthSize,
                ListProjectGeipBindingsRequest::setGcbandwidthSize));
        builder.<String>withRequestField("gcbandwidth.sla_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getGcbandwidthSlaLevel,
                ListProjectGeipBindingsRequest::setGcbandwidthSlaLevel));
        builder.<Integer>withRequestField("gcbandwidth.dscp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getGcbandwidthDscp,
                ListProjectGeipBindingsRequest::setGcbandwidthDscp));
        builder.<String>withRequestField("vnic.private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getVnicPrivateIpAddress,
                ListProjectGeipBindingsRequest::setVnicPrivateIpAddress));
        builder.<String>withRequestField("vnic.vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getVnicVpcId,
                ListProjectGeipBindingsRequest::setVnicVpcId));
        builder.<String>withRequestField("vnic.port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getVnicPortId,
                ListProjectGeipBindingsRequest::setVnicPortId));
        builder.<String>withRequestField("vnic.device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getVnicDeviceId,
                ListProjectGeipBindingsRequest::setVnicDeviceId));
        builder.<String>withRequestField("vnic.device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getVnicDeviceOwner,
                ListProjectGeipBindingsRequest::setVnicDeviceOwner));
        builder.<String>withRequestField("vnic.device_owner_prefixlike",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getVnicDeviceOwnerPrefixlike,
                ListProjectGeipBindingsRequest::setVnicDeviceOwnerPrefixlike));
        builder.<String>withRequestField("vnic.instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getVnicInstanceType,
                ListProjectGeipBindingsRequest::setVnicInstanceType));
        builder.<String>withRequestField("vnic.instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getVnicInstanceId,
                ListProjectGeipBindingsRequest::setVnicInstanceId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getSortKey,
                ListProjectGeipBindingsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getSortDir,
                ListProjectGeipBindingsRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getLimit, ListProjectGeipBindingsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getOffset,
                ListProjectGeipBindingsRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectGeipBindingsRequest::getMarker,
                ListProjectGeipBindingsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTenantVpcIgwRequest, CreateTenantVpcIgwResponse> createTenantVpcIgw =
        genForCreateTenantVpcIgw();

    private static HttpRequestDef<CreateTenantVpcIgwRequest, CreateTenantVpcIgwResponse> genForCreateTenantVpcIgw() {
        // basic
        HttpRequestDef.Builder<CreateTenantVpcIgwRequest, CreateTenantVpcIgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTenantVpcIgwRequest.class, CreateTenantVpcIgwResponse.class)
                .withName("CreateTenantVpcIgw")
                .withUri("/v3/{project_id}/geip/vpc-igws")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateTenantVpcIgwRequest::getFields, CreateTenantVpcIgwRequest::setFields));
        builder.<CreateTenantVpcIgwRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTenantVpcIgwRequestBody.class),
            f -> f.withMarshaller(CreateTenantVpcIgwRequest::getBody, CreateTenantVpcIgwRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTenantVpcIgwRequest, DeleteTenantVpcIgwResponse> deleteTenantVpcIgw =
        genForDeleteTenantVpcIgw();

    private static HttpRequestDef<DeleteTenantVpcIgwRequest, DeleteTenantVpcIgwResponse> genForDeleteTenantVpcIgw() {
        // basic
        HttpRequestDef.Builder<DeleteTenantVpcIgwRequest, DeleteTenantVpcIgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTenantVpcIgwRequest.class, DeleteTenantVpcIgwResponse.class)
                .withName("DeleteTenantVpcIgw")
                .withUri("/v3/{project_id}/geip/vpc-igws/{vpc_igw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_igw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTenantVpcIgwRequest::getVpcIgwId, DeleteTenantVpcIgwRequest::setVpcIgwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTenantVpcIgwsRequest, ListTenantVpcIgwsResponse> listTenantVpcIgws =
        genForListTenantVpcIgws();

    private static HttpRequestDef<ListTenantVpcIgwsRequest, ListTenantVpcIgwsResponse> genForListTenantVpcIgws() {
        // basic
        HttpRequestDef.Builder<ListTenantVpcIgwsRequest, ListTenantVpcIgwsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTenantVpcIgwsRequest.class, ListTenantVpcIgwsResponse.class)
                .withName("ListTenantVpcIgws")
                .withUri("/v3/{project_id}/geip/vpc-igws")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTenantVpcIgwsRequest::getFields, ListTenantVpcIgwsRequest::setFields));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantVpcIgwsRequest::getId, ListTenantVpcIgwsRequest::setId));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantVpcIgwsRequest::getVpcId, ListTenantVpcIgwsRequest::setVpcId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantVpcIgwsRequest::getName, ListTenantVpcIgwsRequest::setName));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantVpcIgwsRequest::getSortKey, ListTenantVpcIgwsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantVpcIgwsRequest::getSortDir, ListTenantVpcIgwsRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantVpcIgwsRequest::getLimit, ListTenantVpcIgwsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantVpcIgwsRequest::getOffset, ListTenantVpcIgwsRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantVpcIgwsRequest::getMarker, ListTenantVpcIgwsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInternalVpcIgwRequest, ShowInternalVpcIgwResponse> showInternalVpcIgw =
        genForShowInternalVpcIgw();

    private static HttpRequestDef<ShowInternalVpcIgwRequest, ShowInternalVpcIgwResponse> genForShowInternalVpcIgw() {
        // basic
        HttpRequestDef.Builder<ShowInternalVpcIgwRequest, ShowInternalVpcIgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInternalVpcIgwRequest.class, ShowInternalVpcIgwResponse.class)
                .withName("ShowInternalVpcIgw")
                .withUri("/v3/{project_id}/geip/vpc-igws/{vpc_igw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_igw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInternalVpcIgwRequest::getVpcIgwId, ShowInternalVpcIgwRequest::setVpcIgwId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowInternalVpcIgwRequest::getFields, ShowInternalVpcIgwRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTenantVpcIgwRequest, UpdateTenantVpcIgwResponse> updateTenantVpcIgw =
        genForUpdateTenantVpcIgw();

    private static HttpRequestDef<UpdateTenantVpcIgwRequest, UpdateTenantVpcIgwResponse> genForUpdateTenantVpcIgw() {
        // basic
        HttpRequestDef.Builder<UpdateTenantVpcIgwRequest, UpdateTenantVpcIgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTenantVpcIgwRequest.class, UpdateTenantVpcIgwResponse.class)
                .withName("UpdateTenantVpcIgw")
                .withUri("/v3/{project_id}/geip/vpc-igws/{vpc_igw_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_igw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTenantVpcIgwRequest::getVpcIgwId, UpdateTenantVpcIgwRequest::setVpcIgwId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateTenantVpcIgwRequest::getFields, UpdateTenantVpcIgwRequest::setFields));
        builder.<UpdateTenantVpcIgwRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTenantVpcIgwRequestBody.class),
            f -> f.withMarshaller(UpdateTenantVpcIgwRequest::getBody, UpdateTenantVpcIgwRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociatePublicipsRequest, AssociatePublicipsResponse> associatePublicips =
        genForAssociatePublicips();

    private static HttpRequestDef<AssociatePublicipsRequest, AssociatePublicipsResponse> genForAssociatePublicips() {
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
            f -> f.withMarshaller(AssociatePublicipsRequest::getPublicipId, AssociatePublicipsRequest::setPublicipId));
        builder.<AssociatePublicipsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociatePublicipsRequestBody.class),
            f -> f.withMarshaller(AssociatePublicipsRequest::getBody, AssociatePublicipsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse> attachBatchPublicIp =
        genForAttachBatchPublicIp();

    private static HttpRequestDef<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse> genForAttachBatchPublicIp() {
        // basic
        HttpRequestDef.Builder<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachBatchPublicIpRequest.class, AttachBatchPublicIpResponse.class)
                .withName("AttachBatchPublicIp")
                .withUri("/v3/{project_id}/eip/publicips/attach-share-bandwidth")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchAttachSharebwReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAttachSharebwReq.class),
            f -> f.withMarshaller(AttachBatchPublicIpRequest::getBody, AttachBatchPublicIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachShareBandwidthRequest, AttachShareBandwidthResponse> attachShareBandwidth =
        genForAttachShareBandwidth();

    private static HttpRequestDef<AttachShareBandwidthRequest, AttachShareBandwidthResponse> genForAttachShareBandwidth() {
        // basic
        HttpRequestDef.Builder<AttachShareBandwidthRequest, AttachShareBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AttachShareBandwidthRequest.class, AttachShareBandwidthResponse.class)
            .withName("AttachShareBandwidth")
            .withUri("/v3/{project_id}/eip/publicips/{publicip_id}/attach-share-bandwidth")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachShareBandwidthRequest::getPublicipId,
                AttachShareBandwidthRequest::setPublicipId));
        builder.<AttachSharebwReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachSharebwReq.class),
            f -> f.withMarshaller(AttachShareBandwidthRequest::getBody, AttachShareBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse> countEipAvailableResources =
        genForCountEipAvailableResources();

    private static HttpRequestDef<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse> genForCountEipAvailableResources() {
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
            f -> f.withMarshaller(CountEipAvailableResourcesRequest::getBody,
                CountEipAvailableResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse> detachBatchPublicIp =
        genForDetachBatchPublicIp();

    private static HttpRequestDef<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse> genForDetachBatchPublicIp() {
        // basic
        HttpRequestDef.Builder<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetachBatchPublicIpRequest.class, DetachBatchPublicIpResponse.class)
                .withName("DetachBatchPublicIp")
                .withUri("/v3/{project_id}/eip/publicips/detach-share-bandwidth")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DetachBatchSharedbwReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachBatchSharedbwReq.class),
            f -> f.withMarshaller(DetachBatchPublicIpRequest::getBody, DetachBatchPublicIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachShareBandwidthRequest, DetachShareBandwidthResponse> detachShareBandwidth =
        genForDetachShareBandwidth();

    private static HttpRequestDef<DetachShareBandwidthRequest, DetachShareBandwidthResponse> genForDetachShareBandwidth() {
        // basic
        HttpRequestDef.Builder<DetachShareBandwidthRequest, DetachShareBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DetachShareBandwidthRequest.class, DetachShareBandwidthResponse.class)
            .withName("DetachShareBandwidth")
            .withUri("/v3/{project_id}/eip/publicips/{publicip_id}/detach-share-bandwidth")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachShareBandwidthRequest::getPublicipId,
                DetachShareBandwidthRequest::setPublicipId));
        builder.<DetachSharedbwReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachSharedbwReq.class),
            f -> f.withMarshaller(DetachShareBandwidthRequest::getBody, DetachShareBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableNat64Request, DisableNat64Response> disableNat64 = genForDisableNat64();

    private static HttpRequestDef<DisableNat64Request, DisableNat64Response> genForDisableNat64() {
        // basic
        HttpRequestDef.Builder<DisableNat64Request, DisableNat64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableNat64Request.class, DisableNat64Response.class)
                .withName("DisableNat64")
                .withUri("/v3/{project_id}/eip/publicips/{publicip_id}/disable-nat64")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableNat64Request::getPublicipId, DisableNat64Request::setPublicipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociatePublicipsRequest, DisassociatePublicipsResponse> disassociatePublicips =
        genForDisassociatePublicips();

    private static HttpRequestDef<DisassociatePublicipsRequest, DisassociatePublicipsResponse> genForDisassociatePublicips() {
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
            f -> f.withMarshaller(DisassociatePublicipsRequest::getPublicipId,
                DisassociatePublicipsRequest::setPublicipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableNat64Request, EnableNat64Response> enableNat64 = genForEnableNat64();

    private static HttpRequestDef<EnableNat64Request, EnableNat64Response> genForEnableNat64() {
        // basic
        HttpRequestDef.Builder<EnableNat64Request, EnableNat64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableNat64Request.class, EnableNat64Response.class)
                .withName("EnableNat64")
                .withUri("/v3/{project_id}/eip/publicips/{publicip_id}/enable-nat64")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableNat64Request::getPublicipId, EnableNat64Request::setPublicipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipsRequest, ListPublicipsResponse> listPublicips =
        genForListPublicips();

    private static HttpRequestDef<ListPublicipsRequest, ListPublicipsResponse> genForListPublicips() {
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
            f -> f.withMarshaller(ListPublicipsRequest::getMarker, ListPublicipsRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipsRequest::getOffset, ListPublicipsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipsRequest::getLimit, ListPublicipsRequest::setLimit));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getFields, ListPublicipsRequest::setFields));
        builder.<ListPublicipsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicipsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListPublicipsRequest::getSortKey, ListPublicipsRequest::setSortKey));
        builder.<ListPublicipsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicipsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListPublicipsRequest::getSortDir, ListPublicipsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getId, ListPublicipsRequest::setId));
        builder.<List<ListPublicipsRequest.IpVersionEnum>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getIpVersion, ListPublicipsRequest::setIpVersion));
        builder.<List<String>>withRequestField("public_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpAddress, ListPublicipsRequest::setPublicIpAddress));
        builder.<String>withRequestField("public_ip_address_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpAddressLike,
                ListPublicipsRequest::setPublicIpAddressLike));
        builder.<List<String>>withRequestField("public_ipv6_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpv6Address,
                ListPublicipsRequest::setPublicIpv6Address));
        builder.<String>withRequestField("public_ipv6_address_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpv6AddressLike,
                ListPublicipsRequest::setPublicIpv6AddressLike));
        builder.<List<ListPublicipsRequest.TypeEnum>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getType, ListPublicipsRequest::setType));
        builder.<List<ListPublicipsRequest.NetworkTypeEnum>>withRequestField("network_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getNetworkType, ListPublicipsRequest::setNetworkType));
        builder.<List<String>>withRequestField("publicip_pool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicipPoolName,
                ListPublicipsRequest::setPublicipPoolName));
        builder.<List<ListPublicipsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getStatus, ListPublicipsRequest::setStatus));
        builder.<String>withRequestField("alias_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAliasLike, ListPublicipsRequest::setAliasLike));
        builder.<List<String>>withRequestField("alias",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAlias, ListPublicipsRequest::setAlias));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getDescription, ListPublicipsRequest::setDescription));
        builder.<List<String>>withRequestField("vnic.private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicPrivateIpAddress,
                ListPublicipsRequest::setVnicPrivateIpAddress));
        builder.<String>withRequestField("vnic.private_ip_address_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicPrivateIpAddressLike,
                ListPublicipsRequest::setVnicPrivateIpAddressLike));
        builder.<List<String>>withRequestField("vnic.device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicDeviceId, ListPublicipsRequest::setVnicDeviceId));
        builder.<List<String>>withRequestField("vnic.device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicDeviceOwner, ListPublicipsRequest::setVnicDeviceOwner));
        builder.<List<String>>withRequestField("vnic.vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicVpcId, ListPublicipsRequest::setVnicVpcId));
        builder.<List<String>>withRequestField("vnic.port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicPortId, ListPublicipsRequest::setVnicPortId));
        builder.<String>withRequestField("vnic.device_owner_prefixlike",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicDeviceOwnerPrefixlike,
                ListPublicipsRequest::setVnicDeviceOwnerPrefixlike));
        builder.<List<String>>withRequestField("vnic.instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicInstanceType,
                ListPublicipsRequest::setVnicInstanceType));
        builder.<List<String>>withRequestField("vnic.instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getVnicInstanceId, ListPublicipsRequest::setVnicInstanceId));
        builder.<List<String>>withRequestField("bandwidth.id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthId, ListPublicipsRequest::setBandwidthId));
        builder.<List<String>>withRequestField("bandwidth.name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthName, ListPublicipsRequest::setBandwidthName));
        builder.<List<String>>withRequestField("bandwidth.name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthNameLike,
                ListPublicipsRequest::setBandwidthNameLike));
        builder.<List<Integer>>withRequestField("bandwidth.size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthSize, ListPublicipsRequest::setBandwidthSize));
        builder.<List<ListPublicipsRequest.BandwidthShareTypeEnum>>withRequestField("bandwidth.share_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthShareType,
                ListPublicipsRequest::setBandwidthShareType));
        builder.<List<ListPublicipsRequest.BandwidthChargeModeEnum>>withRequestField("bandwidth.charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBandwidthChargeMode,
                ListPublicipsRequest::setBandwidthChargeMode));
        builder.<List<String>>withRequestField("billing_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBillingInfo, ListPublicipsRequest::setBillingInfo));
        builder.<ListPublicipsRequest.BillingModeEnum>withRequestField("billing_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicipsRequest.BillingModeEnum.class),
            f -> f.withMarshaller(ListPublicipsRequest::getBillingMode, ListPublicipsRequest::setBillingMode));
        builder.<List<ListPublicipsRequest.AssociateInstanceTypeEnum>>withRequestField("associate_instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAssociateInstanceType,
                ListPublicipsRequest::setAssociateInstanceType));
        builder.<List<String>>withRequestField("associate_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAssociateInstanceId,
                ListPublicipsRequest::setAssociateInstanceId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getEnterpriseProjectId,
                ListPublicipsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicBorderGroup,
                ListPublicipsRequest::setPublicBorderGroup));
        builder.<List<String>>withRequestField("allow_share_bandwidth_type_any",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAllowShareBandwidthTypeAny,
                ListPublicipsRequest::setAllowShareBandwidthTypeAny));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipRequest, ShowPublicipResponse> showPublicip = genForShowPublicip();

    private static HttpRequestDef<ShowPublicipRequest, ShowPublicipResponse> genForShowPublicip() {
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
            f -> f.withMarshaller(ShowPublicipRequest::getPublicipId, ShowPublicipRequest::setPublicipId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPublicipRequest::getFields, ShowPublicipRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicip =
        genForUpdatePublicip();

    private static HttpRequestDef<UpdatePublicipRequest, UpdatePublicipResponse> genForUpdatePublicip() {
        // basic
        HttpRequestDef.Builder<UpdatePublicipRequest, UpdatePublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePublicipRequest.class, UpdatePublicipResponse.class)
                .withName("UpdatePublicip")
                .withUri("/v3/{project_id}/eip/publicips/{publicip_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicipRequest::getPublicipId, UpdatePublicipRequest::setPublicipId));
        builder.<UpdatePublicipsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicipsRequestBody.class),
            f -> f.withMarshaller(UpdatePublicipRequest::getBody, UpdatePublicipRequest::setBody));

        // response

        return builder.build();
    }

}

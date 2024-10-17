package com.huaweicloud.sdk.gsl.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gsl.v3.model.AddNetworkSwitchPolicyRequest;
import com.huaweicloud.sdk.gsl.v3.model.AddNetworkSwitchPolicyResponse;
import com.huaweicloud.sdk.gsl.v3.model.AddOrModifyAttributeReq;
import com.huaweicloud.sdk.gsl.v3.model.AddOrModifyTagReq;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetAttributesReq;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetAttributesRequest;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetAttributesResponse;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetTagsReq;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetTagsRequest;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetTagsResponse;
import com.huaweicloud.sdk.gsl.v3.model.CreateAttributeRequest;
import com.huaweicloud.sdk.gsl.v3.model.CreateAttributeResponse;
import com.huaweicloud.sdk.gsl.v3.model.CreateSendSmsReq;
import com.huaweicloud.sdk.gsl.v3.model.CreateTagRequest;
import com.huaweicloud.sdk.gsl.v3.model.CreateTagResponse;
import com.huaweicloud.sdk.gsl.v3.model.CutNetReq;
import com.huaweicloud.sdk.gsl.v3.model.DeleteRealNameRequest;
import com.huaweicloud.sdk.gsl.v3.model.DeleteRealNameResponse;
import com.huaweicloud.sdk.gsl.v3.model.DeleteTagRequest;
import com.huaweicloud.sdk.gsl.v3.model.DeleteTagResponse;
import com.huaweicloud.sdk.gsl.v3.model.DisableAttributeRequest;
import com.huaweicloud.sdk.gsl.v3.model.DisableAttributeResponse;
import com.huaweicloud.sdk.gsl.v3.model.DownUpTimeForSimCardReq;
import com.huaweicloud.sdk.gsl.v3.model.EnableAttributeRequest;
import com.huaweicloud.sdk.gsl.v3.model.EnableAttributeResponse;
import com.huaweicloud.sdk.gsl.v3.model.EnableSimCardRequest;
import com.huaweicloud.sdk.gsl.v3.model.EnableSimCardResponse;
import com.huaweicloud.sdk.gsl.v3.model.ExceedCutNetReq;
import com.huaweicloud.sdk.gsl.v3.model.ListAttributesRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListAttributesResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListBackPoolMembersRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListBackPoolMembersResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListBackPoolsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListBackPoolsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListFlowBySimCardsReq;
import com.huaweicloud.sdk.gsl.v3.model.ListFlowBySimCardsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListFlowBySimCardsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListNetworkSwitchPoliciesRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListNetworkSwitchPoliciesResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListProPricePlansRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListProPricePlansResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimCardFlowPerDayRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimCardFlowPerDayResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimCardsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimCardsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimDeviceMultiplyRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimDeviceMultiplyResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPoolMembersRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPoolMembersResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPoolsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPoolsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPricePlansRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPricePlansResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSmsDetailsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSmsDetailsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListTagsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListTagsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListWorkOrderDetailsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListWorkOrderDetailsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListWorkOrdersRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListWorkOrdersResponse;
import com.huaweicloud.sdk.gsl.v3.model.NetworkSwitchPolicyDTO;
import com.huaweicloud.sdk.gsl.v3.model.NetworkSwitchPolicyReq;
import com.huaweicloud.sdk.gsl.v3.model.NetworkSwitchReq;
import com.huaweicloud.sdk.gsl.v3.model.RegisterImeiReq;
import com.huaweicloud.sdk.gsl.v3.model.RegisterImeiRequest;
import com.huaweicloud.sdk.gsl.v3.model.RegisterImeiResponse;
import com.huaweicloud.sdk.gsl.v3.model.ResetSimCardRequest;
import com.huaweicloud.sdk.gsl.v3.model.ResetSimCardResponse;
import com.huaweicloud.sdk.gsl.v3.model.SendSmsRequest;
import com.huaweicloud.sdk.gsl.v3.model.SendSmsResponse;
import com.huaweicloud.sdk.gsl.v3.model.SetExceedCutNetRequest;
import com.huaweicloud.sdk.gsl.v3.model.SetExceedCutNetResponse;
import com.huaweicloud.sdk.gsl.v3.model.SetNetworkSwitchPolicyRequest;
import com.huaweicloud.sdk.gsl.v3.model.SetNetworkSwitchPolicyResponse;
import com.huaweicloud.sdk.gsl.v3.model.SetSpeedValueReq;
import com.huaweicloud.sdk.gsl.v3.model.SetSpeedValueRequest;
import com.huaweicloud.sdk.gsl.v3.model.SetSpeedValueResponse;
import com.huaweicloud.sdk.gsl.v3.model.ShowMonthUsageReq;
import com.huaweicloud.sdk.gsl.v3.model.ShowMonthUsagesRequest;
import com.huaweicloud.sdk.gsl.v3.model.ShowMonthUsagesResponse;
import com.huaweicloud.sdk.gsl.v3.model.ShowRealNamedRequest;
import com.huaweicloud.sdk.gsl.v3.model.ShowRealNamedResponse;
import com.huaweicloud.sdk.gsl.v3.model.ShowSimCardRequest;
import com.huaweicloud.sdk.gsl.v3.model.ShowSimCardResponse;
import com.huaweicloud.sdk.gsl.v3.model.SimCardFlowPerDayReq;
import com.huaweicloud.sdk.gsl.v3.model.SimCardFlowPerDayRsp;
import com.huaweicloud.sdk.gsl.v3.model.SimCardsFlowVO;
import com.huaweicloud.sdk.gsl.v3.model.SimPricePlanVO;
import com.huaweicloud.sdk.gsl.v3.model.StartStopNetRequest;
import com.huaweicloud.sdk.gsl.v3.model.StartStopNetResponse;
import com.huaweicloud.sdk.gsl.v3.model.StopSimCardRequest;
import com.huaweicloud.sdk.gsl.v3.model.StopSimCardResponse;
import com.huaweicloud.sdk.gsl.v3.model.SwitchNetworkRequest;
import com.huaweicloud.sdk.gsl.v3.model.SwitchNetworkResponse;
import com.huaweicloud.sdk.gsl.v3.model.UpdateAttributeRequest;
import com.huaweicloud.sdk.gsl.v3.model.UpdateAttributeResponse;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unchecked")
public class GslMeta {

    public static final HttpRequestDef<BatchSetAttributesRequest, BatchSetAttributesResponse> batchSetAttributes =
        genForBatchSetAttributes();

    private static HttpRequestDef<BatchSetAttributesRequest, BatchSetAttributesResponse> genForBatchSetAttributes() {
        // basic
        HttpRequestDef.Builder<BatchSetAttributesRequest, BatchSetAttributesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSetAttributesRequest.class, BatchSetAttributesResponse.class)
                .withName("BatchSetAttributes")
                .withUri("/v1/sim-cards/attributes/batch-set")
                .withContentType("application/json");

        // requests
        builder.<BatchSetAttributesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSetAttributesReq.class),
            f -> f.withMarshaller(BatchSetAttributesRequest::getBody, BatchSetAttributesRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchSetAttributesResponse::getBody, BatchSetAttributesResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateAttributeRequest, CreateAttributeResponse> createAttribute =
        genForCreateAttribute();

    private static HttpRequestDef<CreateAttributeRequest, CreateAttributeResponse> genForCreateAttribute() {
        // basic
        HttpRequestDef.Builder<CreateAttributeRequest, CreateAttributeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAttributeRequest.class, CreateAttributeResponse.class)
                .withName("CreateAttribute")
                .withUri("/v1/attributes")
                .withContentType("application/json");

        // requests
        builder.<AddOrModifyAttributeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddOrModifyAttributeReq.class),
            f -> f.withMarshaller(CreateAttributeRequest::getBody, CreateAttributeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableAttributeRequest, DisableAttributeResponse> disableAttribute =
        genForDisableAttribute();

    private static HttpRequestDef<DisableAttributeRequest, DisableAttributeResponse> genForDisableAttribute() {
        // basic
        HttpRequestDef.Builder<DisableAttributeRequest, DisableAttributeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableAttributeRequest.class, DisableAttributeResponse.class)
                .withName("DisableAttribute")
                .withUri("/v1/attributes/{attribute_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("attribute_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DisableAttributeRequest::getAttributeId, DisableAttributeRequest::setAttributeId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisableAttributeResponse::getBody, DisableAttributeResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<EnableAttributeRequest, EnableAttributeResponse> enableAttribute =
        genForEnableAttribute();

    private static HttpRequestDef<EnableAttributeRequest, EnableAttributeResponse> genForEnableAttribute() {
        // basic
        HttpRequestDef.Builder<EnableAttributeRequest, EnableAttributeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableAttributeRequest.class, EnableAttributeResponse.class)
                .withName("EnableAttribute")
                .withUri("/v1/attributes/{attribute_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("attribute_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(EnableAttributeRequest::getAttributeId, EnableAttributeRequest::setAttributeId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(EnableAttributeResponse::getBody, EnableAttributeResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAttributesRequest, ListAttributesResponse> listAttributes =
        genForListAttributes();

    private static HttpRequestDef<ListAttributesRequest, ListAttributesResponse> genForListAttributes() {
        // basic
        HttpRequestDef.Builder<ListAttributesRequest, ListAttributesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAttributesRequest.class, ListAttributesResponse.class)
                .withName("ListAttributes")
                .withUri("/v1/attributes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cust_attr_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttributesRequest::getCustAttrName, ListAttributesRequest::setCustAttrName));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttributesRequest::getLimit, ListAttributesRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttributesRequest::getOffset, ListAttributesRequest::setOffset));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttributesRequest::getStatus, ListAttributesRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAttributeRequest, UpdateAttributeResponse> updateAttribute =
        genForUpdateAttribute();

    private static HttpRequestDef<UpdateAttributeRequest, UpdateAttributeResponse> genForUpdateAttribute() {
        // basic
        HttpRequestDef.Builder<UpdateAttributeRequest, UpdateAttributeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAttributeRequest.class, UpdateAttributeResponse.class)
                .withName("UpdateAttribute")
                .withUri("/v1/attributes/{attribute_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("attribute_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateAttributeRequest::getAttributeId, UpdateAttributeRequest::setAttributeId));
        builder.<AddOrModifyAttributeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddOrModifyAttributeReq.class),
            f -> f.withMarshaller(UpdateAttributeRequest::getBody, UpdateAttributeRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAttributeResponse::getBody, UpdateAttributeResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListBackPoolMembersRequest, ListBackPoolMembersResponse> listBackPoolMembers =
        genForListBackPoolMembers();

    private static HttpRequestDef<ListBackPoolMembersRequest, ListBackPoolMembersResponse> genForListBackPoolMembers() {
        // basic
        HttpRequestDef.Builder<ListBackPoolMembersRequest, ListBackPoolMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackPoolMembersRequest.class, ListBackPoolMembersResponse.class)
                .withName("ListBackPoolMembers")
                .withUri("/v1/back-pools/{back_pool_id}/members")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("back_pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBackPoolMembersRequest::getBackPoolId,
                ListBackPoolMembersRequest::setBackPoolId));
        builder.<String>withRequestField("cid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackPoolMembersRequest::getCid, ListBackPoolMembersRequest::setCid));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBackPoolMembersRequest::getLimit, ListBackPoolMembersRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBackPoolMembersRequest::getOffset, ListBackPoolMembersRequest::setOffset));
        builder.<String>withRequestField("billing_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackPoolMembersRequest::getBillingCycle,
                ListBackPoolMembersRequest::setBillingCycle));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackPoolsRequest, ListBackPoolsResponse> listBackPools =
        genForListBackPools();

    private static HttpRequestDef<ListBackPoolsRequest, ListBackPoolsResponse> genForListBackPools() {
        // basic
        HttpRequestDef.Builder<ListBackPoolsRequest, ListBackPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackPoolsRequest.class, ListBackPoolsResponse.class)
                .withName("ListBackPools")
                .withUri("/v1/back-pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackPoolsRequest::getPoolName, ListBackPoolsRequest::setPoolName));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBackPoolsRequest::getLimit, ListBackPoolsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBackPoolsRequest::getOffset, ListBackPoolsRequest::setOffset));
        builder.<String>withRequestField("billing_cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackPoolsRequest::getBillingCycle, ListBackPoolsRequest::setBillingCycle));
        builder.<Boolean>withRequestField("all_billing_cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListBackPoolsRequest::getAllBillingCycle, ListBackPoolsRequest::setAllBillingCycle));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddNetworkSwitchPolicyRequest, AddNetworkSwitchPolicyResponse> addNetworkSwitchPolicy =
        genForAddNetworkSwitchPolicy();

    private static HttpRequestDef<AddNetworkSwitchPolicyRequest, AddNetworkSwitchPolicyResponse> genForAddNetworkSwitchPolicy() {
        // basic
        HttpRequestDef.Builder<AddNetworkSwitchPolicyRequest, AddNetworkSwitchPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddNetworkSwitchPolicyRequest.class, AddNetworkSwitchPolicyResponse.class)
            .withName("AddNetworkSwitchPolicy")
            .withUri("/v1/network-switch-policies")
            .withContentType("application/json");

        // requests
        builder.<NetworkSwitchPolicyDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NetworkSwitchPolicyDTO.class),
            f -> f.withMarshaller(AddNetworkSwitchPolicyRequest::getBody, AddNetworkSwitchPolicyRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddNetworkSwitchPolicyResponse::getBody, AddNetworkSwitchPolicyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkSwitchPoliciesRequest, ListNetworkSwitchPoliciesResponse> listNetworkSwitchPolicies =
        genForListNetworkSwitchPolicies();

    private static HttpRequestDef<ListNetworkSwitchPoliciesRequest, ListNetworkSwitchPoliciesResponse> genForListNetworkSwitchPolicies() {
        // basic
        HttpRequestDef.Builder<ListNetworkSwitchPoliciesRequest, ListNetworkSwitchPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNetworkSwitchPoliciesRequest.class,
                    ListNetworkSwitchPoliciesResponse.class)
                .withName("ListNetworkSwitchPolicies")
                .withUri("/v1/network-switch-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkSwitchPoliciesRequest::getPolicyName,
                ListNetworkSwitchPoliciesRequest::setPolicyName));
        builder.<Integer>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkSwitchPoliciesRequest::getVersion,
                ListNetworkSwitchPoliciesRequest::setVersion));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNetworkSwitchPoliciesRequest::getLimit,
                ListNetworkSwitchPoliciesRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNetworkSwitchPoliciesRequest::getOffset,
                ListNetworkSwitchPoliciesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProPricePlansRequest, ListProPricePlansResponse> listProPricePlans =
        genForListProPricePlans();

    private static HttpRequestDef<ListProPricePlansRequest, ListProPricePlansResponse> genForListProPricePlans() {
        // basic
        HttpRequestDef.Builder<ListProPricePlansRequest, ListProPricePlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProPricePlansRequest.class, ListProPricePlansResponse.class)
                .withName("ListProPricePlans")
                .withUri("/v1/price-plans")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getLimit, ListProPricePlansRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getOffset, ListProPricePlansRequest::setOffset));
        builder.<String>withRequestField("main_search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getMainSearchKey,
                ListProPricePlansRequest::setMainSearchKey));
        builder.<Long>withRequestField("flow_total",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getFlowTotal, ListProPricePlansRequest::setFlowTotal));
        builder.<Long>withRequestField("network_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getNetworkType, ListProPricePlansRequest::setNetworkType));
        builder.<Long>withRequestField("location_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getLocationType,
                ListProPricePlansRequest::setLocationType));
        builder.<Integer>withRequestField("carrier_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getCarrierType, ListProPricePlansRequest::setCarrierType));
        builder.<Long>withRequestField("country_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getCountryType, ListProPricePlansRequest::setCountryType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRealNameRequest, DeleteRealNameResponse> deleteRealName =
        genForDeleteRealName();

    private static HttpRequestDef<DeleteRealNameRequest, DeleteRealNameResponse> genForDeleteRealName() {
        // basic
        HttpRequestDef.Builder<DeleteRealNameRequest, DeleteRealNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteRealNameRequest.class, DeleteRealNameResponse.class)
                .withName("DeleteRealName")
                .withUri("/v1/sim-cards/{sim_card_id}/clear-real-name")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteRealNameRequest::getSimCardId, DeleteRealNameRequest::setSimCardId));
        builder.<String>withRequestField("iccid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRealNameRequest::getIccid, DeleteRealNameRequest::setIccid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableSimCardRequest, EnableSimCardResponse> enableSimCard =
        genForEnableSimCard();

    private static HttpRequestDef<EnableSimCardRequest, EnableSimCardResponse> genForEnableSimCard() {
        // basic
        HttpRequestDef.Builder<EnableSimCardRequest, EnableSimCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableSimCardRequest.class, EnableSimCardResponse.class)
                .withName("EnableSimCard")
                .withUri("/v1/sim-cards/{sim_card_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(EnableSimCardRequest::getSimCardId, EnableSimCardRequest::setSimCardId));
        builder.<String>withRequestField("iccid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableSimCardRequest::getIccid, EnableSimCardRequest::setIccid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSimCardFlowPerDayRequest, ListSimCardFlowPerDayResponse> listSimCardFlowPerDay =
        genForListSimCardFlowPerDay();

    private static HttpRequestDef<ListSimCardFlowPerDayRequest, ListSimCardFlowPerDayResponse> genForListSimCardFlowPerDay() {
        // basic
        HttpRequestDef.Builder<ListSimCardFlowPerDayRequest, ListSimCardFlowPerDayResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListSimCardFlowPerDayRequest.class, ListSimCardFlowPerDayResponse.class)
            .withName("ListSimCardFlowPerDay")
            .withUri("/v1/sim-cards/batch-daily-flow")
            .withContentType("application/json");

        // requests
        builder.<SimCardFlowPerDayReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SimCardFlowPerDayReq.class),
            f -> f.withMarshaller(ListSimCardFlowPerDayRequest::getBody, ListSimCardFlowPerDayRequest::setBody));

        // response
        builder.<List<SimCardFlowPerDayRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSimCardFlowPerDayResponse::getBody, ListSimCardFlowPerDayResponse::setBody)
                .withInnerContainerType(SimCardFlowPerDayRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSimCardsRequest, ListSimCardsResponse> listSimCards = genForListSimCards();

    private static HttpRequestDef<ListSimCardsRequest, ListSimCardsResponse> genForListSimCards() {
        // basic
        HttpRequestDef.Builder<ListSimCardsRequest, ListSimCardsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSimCardsRequest.class, ListSimCardsResponse.class)
                .withName("ListSimCards")
                .withUri("/v1/sim-cards")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("main_search_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMainSearchType, ListSimCardsRequest::setMainSearchType));
        builder.<String>withRequestField("main_search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMainSearchKey, ListSimCardsRequest::setMainSearchKey));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getLimit, ListSimCardsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getOffset, ListSimCardsRequest::setOffset));
        builder.<Integer>withRequestField("sim_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSimCardsRequest::getSimStatus, ListSimCardsRequest::setSimStatus));
        builder.<Integer>withRequestField("device_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSimCardsRequest::getDeviceStatus, ListSimCardsRequest::setDeviceStatus));
        builder.<List<Long>>withRequestField("tag_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSimCardsRequest::getTagId, ListSimCardsRequest::setTagId));
        builder.<Integer>withRequestField("sim_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSimCardsRequest::getSimType, ListSimCardsRequest::setSimType));
        builder.<ListSimCardsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSimCardsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListSimCardsRequest::getOrder, ListSimCardsRequest::setOrder));
        builder.<ListSimCardsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSimCardsRequest.SortEnum.class),
            f -> f.withMarshaller(ListSimCardsRequest::getSort, ListSimCardsRequest::setSort));
        builder.<String>withRequestField("msisdn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMsisdn, ListSimCardsRequest::setMsisdn));
        builder.<String>withRequestField("customer_attribute1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute1,
                ListSimCardsRequest::setCustomerAttribute1));
        builder.<String>withRequestField("customer_attribute2",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute2,
                ListSimCardsRequest::setCustomerAttribute2));
        builder.<String>withRequestField("customer_attribute3",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute3,
                ListSimCardsRequest::setCustomerAttribute3));
        builder.<String>withRequestField("customer_attribute4",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute4,
                ListSimCardsRequest::setCustomerAttribute4));
        builder.<String>withRequestField("customer_attribute5",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute5,
                ListSimCardsRequest::setCustomerAttribute5));
        builder.<String>withRequestField("customer_attribute6",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute6,
                ListSimCardsRequest::setCustomerAttribute6));
        builder.<Long>withRequestField("min_used_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMinUsedFlow, ListSimCardsRequest::setMinUsedFlow));
        builder.<Long>withRequestField("max_used_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMaxUsedFlow, ListSimCardsRequest::setMaxUsedFlow));
        builder.<Long>withRequestField("min_left_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMinLeftFlow, ListSimCardsRequest::setMinLeftFlow));
        builder.<Long>withRequestField("max_left_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMaxLeftFlow, ListSimCardsRequest::setMaxLeftFlow));
        builder.<Boolean>withRequestField("real_named",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSimCardsRequest::getRealNamed, ListSimCardsRequest::setRealNamed));
        builder.<Long>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getOrderId, ListSimCardsRequest::setOrderId));
        builder.<Boolean>withRequestField("filter_downtime_period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSimCardsRequest::getFilterDowntimePeriod,
                ListSimCardsRequest::setFilterDowntimePeriod));
        builder.<List<Long>>withRequestField("order_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSimCardsRequest::getOrderIds, ListSimCardsRequest::setOrderIds));
        builder.<List<String>>withRequestField("price_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSimCardsRequest::getPricePlanId, ListSimCardsRequest::setPricePlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterImeiRequest, RegisterImeiResponse> registerImei = genForRegisterImei();

    private static HttpRequestDef<RegisterImeiRequest, RegisterImeiResponse> genForRegisterImei() {
        // basic
        HttpRequestDef.Builder<RegisterImeiRequest, RegisterImeiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterImeiRequest.class, RegisterImeiResponse.class)
                .withName("RegisterImei")
                .withUri("/v1/sim-cards/{sim_card_id}/bind-device")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(RegisterImeiRequest::getSimCardId, RegisterImeiRequest::setSimCardId));
        builder.<RegisterImeiReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RegisterImeiReq.class),
            f -> f.withMarshaller(RegisterImeiRequest::getBody, RegisterImeiRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetSimCardRequest, ResetSimCardResponse> resetSimCard = genForResetSimCard();

    private static HttpRequestDef<ResetSimCardRequest, ResetSimCardResponse> genForResetSimCard() {
        // basic
        HttpRequestDef.Builder<ResetSimCardRequest, ResetSimCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetSimCardRequest.class, ResetSimCardResponse.class)
                .withName("ResetSimCard")
                .withUri("/v1/sim-cards/{sim_card_id}/reset")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ResetSimCardRequest::getSimCardId, ResetSimCardRequest::setSimCardId));
        builder.<DownUpTimeForSimCardReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownUpTimeForSimCardReq.class),
            f -> f.withMarshaller(ResetSimCardRequest::getBody, ResetSimCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetExceedCutNetRequest, SetExceedCutNetResponse> setExceedCutNet =
        genForSetExceedCutNet();

    private static HttpRequestDef<SetExceedCutNetRequest, SetExceedCutNetResponse> genForSetExceedCutNet() {
        // basic
        HttpRequestDef.Builder<SetExceedCutNetRequest, SetExceedCutNetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetExceedCutNetRequest.class, SetExceedCutNetResponse.class)
                .withName("SetExceedCutNet")
                .withUri("/v1/sim-cards/{sim_card_id}/exceed-cut-net")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SetExceedCutNetRequest::getSimCardId, SetExceedCutNetRequest::setSimCardId));
        builder.<ExceedCutNetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExceedCutNetReq.class),
            f -> f.withMarshaller(SetExceedCutNetRequest::getBody, SetExceedCutNetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSpeedValueRequest, SetSpeedValueResponse> setSpeedValue =
        genForSetSpeedValue();

    private static HttpRequestDef<SetSpeedValueRequest, SetSpeedValueResponse> genForSetSpeedValue() {
        // basic
        HttpRequestDef.Builder<SetSpeedValueRequest, SetSpeedValueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetSpeedValueRequest.class, SetSpeedValueResponse.class)
                .withName("SetSpeedValue")
                .withUri("/v1/sim-cards/{sim_card_id}/speed-limit")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SetSpeedValueRequest::getSimCardId, SetSpeedValueRequest::setSimCardId));
        builder.<SetSpeedValueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetSpeedValueReq.class),
            f -> f.withMarshaller(SetSpeedValueRequest::getBody, SetSpeedValueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonthUsagesRequest, ShowMonthUsagesResponse> showMonthUsages =
        genForShowMonthUsages();

    private static HttpRequestDef<ShowMonthUsagesRequest, ShowMonthUsagesResponse> genForShowMonthUsages() {
        // basic
        HttpRequestDef.Builder<ShowMonthUsagesRequest, ShowMonthUsagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMonthUsagesRequest.class, ShowMonthUsagesResponse.class)
                .withName("ShowMonthUsages")
                .withUri("/v1/sim-cards/month-usages")
                .withContentType("application/json");

        // requests
        builder.<ShowMonthUsageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowMonthUsageReq.class),
            f -> f.withMarshaller(ShowMonthUsagesRequest::getBody, ShowMonthUsagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRealNamedRequest, ShowRealNamedResponse> showRealNamed =
        genForShowRealNamed();

    private static HttpRequestDef<ShowRealNamedRequest, ShowRealNamedResponse> genForShowRealNamed() {
        // basic
        HttpRequestDef.Builder<ShowRealNamedRequest, ShowRealNamedResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRealNamedRequest.class, ShowRealNamedResponse.class)
                .withName("ShowRealNamed")
                .withUri("/v1/sim-cards/{sim_card_id}/real-named")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowRealNamedRequest::getSimCardId, ShowRealNamedRequest::setSimCardId));
        builder.<String>withRequestField("iccid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRealNamedRequest::getIccid, ShowRealNamedRequest::setIccid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSimCardRequest, ShowSimCardResponse> showSimCard = genForShowSimCard();

    private static HttpRequestDef<ShowSimCardRequest, ShowSimCardResponse> genForShowSimCard() {
        // basic
        HttpRequestDef.Builder<ShowSimCardRequest, ShowSimCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSimCardRequest.class, ShowSimCardResponse.class)
                .withName("ShowSimCard")
                .withUri("/v1/sim-cards/{sim_card_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSimCardRequest::getSimCardId, ShowSimCardRequest::setSimCardId));
        builder.<String>withRequestField("iccid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSimCardRequest::getIccid, ShowSimCardRequest::setIccid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartStopNetRequest, StartStopNetResponse> startStopNet = genForStartStopNet();

    private static HttpRequestDef<StartStopNetRequest, StartStopNetResponse> genForStartStopNet() {
        // basic
        HttpRequestDef.Builder<StartStopNetRequest, StartStopNetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartStopNetRequest.class, StartStopNetResponse.class)
                .withName("StartStopNet")
                .withUri("/v1/sim-cards/{sim_card_id}/cut-net")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(StartStopNetRequest::getSimCardId, StartStopNetRequest::setSimCardId));
        builder.<CutNetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CutNetReq.class),
            f -> f.withMarshaller(StartStopNetRequest::getBody, StartStopNetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopSimCardRequest, StopSimCardResponse> stopSimCard = genForStopSimCard();

    private static HttpRequestDef<StopSimCardRequest, StopSimCardResponse> genForStopSimCard() {
        // basic
        HttpRequestDef.Builder<StopSimCardRequest, StopSimCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopSimCardRequest.class, StopSimCardResponse.class)
                .withName("StopSimCard")
                .withUri("/v1/sim-cards/{sim_card_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(StopSimCardRequest::getSimCardId, StopSimCardRequest::setSimCardId));
        builder.<DownUpTimeForSimCardReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownUpTimeForSimCardReq.class),
            f -> f.withMarshaller(StopSimCardRequest::getBody, StopSimCardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSimDeviceMultiplyRequest, ListSimDeviceMultiplyResponse> listSimDeviceMultiply =
        genForListSimDeviceMultiply();

    private static HttpRequestDef<ListSimDeviceMultiplyRequest, ListSimDeviceMultiplyResponse> genForListSimDeviceMultiply() {
        // basic
        HttpRequestDef.Builder<ListSimDeviceMultiplyRequest, ListSimDeviceMultiplyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSimDeviceMultiplyRequest.class, ListSimDeviceMultiplyResponse.class)
            .withName("ListSimDeviceMultiply")
            .withUri("/v1/sim-cards-multiply")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimDeviceMultiplyRequest::getCid, ListSimDeviceMultiplyRequest::setCid));
        builder.<Integer>withRequestField("online_carrier",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSimDeviceMultiplyRequest::getOnlineCarrier,
                ListSimDeviceMultiplyRequest::setOnlineCarrier));
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimDeviceMultiplyRequest::getSimCardId,
                ListSimDeviceMultiplyRequest::setSimCardId));
        builder.<Integer>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSimDeviceMultiplyRequest::getVersion, ListSimDeviceMultiplyRequest::setVersion));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimDeviceMultiplyRequest::getLimit, ListSimDeviceMultiplyRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimDeviceMultiplyRequest::getOffset, ListSimDeviceMultiplyRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetNetworkSwitchPolicyRequest, SetNetworkSwitchPolicyResponse> setNetworkSwitchPolicy =
        genForSetNetworkSwitchPolicy();

    private static HttpRequestDef<SetNetworkSwitchPolicyRequest, SetNetworkSwitchPolicyResponse> genForSetNetworkSwitchPolicy() {
        // basic
        HttpRequestDef.Builder<SetNetworkSwitchPolicyRequest, SetNetworkSwitchPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetNetworkSwitchPolicyRequest.class, SetNetworkSwitchPolicyResponse.class)
            .withName("SetNetworkSwitchPolicy")
            .withUri("/v1/sim-cards/{sim_card_id}/network-switch-policy/set")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SetNetworkSwitchPolicyRequest::getSimCardId,
                SetNetworkSwitchPolicyRequest::setSimCardId));
        builder.<NetworkSwitchPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NetworkSwitchPolicyReq.class),
            f -> f.withMarshaller(SetNetworkSwitchPolicyRequest::getBody, SetNetworkSwitchPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchNetworkRequest, SwitchNetworkResponse> switchNetwork =
        genForSwitchNetwork();

    private static HttpRequestDef<SwitchNetworkRequest, SwitchNetworkResponse> genForSwitchNetwork() {
        // basic
        HttpRequestDef.Builder<SwitchNetworkRequest, SwitchNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchNetworkRequest.class, SwitchNetworkResponse.class)
                .withName("SwitchNetwork")
                .withUri("/v1/sim-cards-multiply/{sim_card_id}/switch-network")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SwitchNetworkRequest::getSimCardId, SwitchNetworkRequest::setSimCardId));
        builder.<NetworkSwitchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(NetworkSwitchReq.class),
            f -> f.withMarshaller(SwitchNetworkRequest::getBody, SwitchNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSimPoolMembersRequest, ListSimPoolMembersResponse> listSimPoolMembers =
        genForListSimPoolMembers();

    private static HttpRequestDef<ListSimPoolMembersRequest, ListSimPoolMembersResponse> genForListSimPoolMembers() {
        // basic
        HttpRequestDef.Builder<ListSimPoolMembersRequest, ListSimPoolMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSimPoolMembersRequest.class, ListSimPoolMembersResponse.class)
                .withName("ListSimPoolMembers")
                .withUri("/v1/sim-pools/{sim_pool_id}/members")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPoolMembersRequest::getSimPoolId, ListSimPoolMembersRequest::setSimPoolId));
        builder.<String>withRequestField("cid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimPoolMembersRequest::getCid, ListSimPoolMembersRequest::setCid));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPoolMembersRequest::getLimit, ListSimPoolMembersRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPoolMembersRequest::getOffset, ListSimPoolMembersRequest::setOffset));
        builder.<String>withRequestField("billing_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimPoolMembersRequest::getBillingCycle,
                ListSimPoolMembersRequest::setBillingCycle));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSimPoolsRequest, ListSimPoolsResponse> listSimPools = genForListSimPools();

    private static HttpRequestDef<ListSimPoolsRequest, ListSimPoolsResponse> genForListSimPools() {
        // basic
        HttpRequestDef.Builder<ListSimPoolsRequest, ListSimPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSimPoolsRequest.class, ListSimPoolsResponse.class)
                .withName("ListSimPools")
                .withUri("/v1/sim-pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimPoolsRequest::getPoolName, ListSimPoolsRequest::setPoolName));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPoolsRequest::getLimit, ListSimPoolsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPoolsRequest::getOffset, ListSimPoolsRequest::setOffset));
        builder.<String>withRequestField("billing_cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimPoolsRequest::getBillingCycle, ListSimPoolsRequest::setBillingCycle));
        builder.<Boolean>withRequestField("all_billing_cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSimPoolsRequest::getAllBillingCycle, ListSimPoolsRequest::setAllBillingCycle));
        builder.<List<Integer>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSimPoolsRequest::getStatus, ListSimPoolsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> listFlowBySimCards =
        genForListFlowBySimCards();

    private static HttpRequestDef<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> genForListFlowBySimCards() {
        // basic
        HttpRequestDef.Builder<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListFlowBySimCardsRequest.class, ListFlowBySimCardsResponse.class)
                .withName("ListFlowBySimCards")
                .withUri("/v1/sim-price-plans/usage/batch-query")
                .withContentType("application/json");

        // requests
        builder.<ListFlowBySimCardsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFlowBySimCardsReq.class),
            f -> f.withMarshaller(ListFlowBySimCardsRequest::getBody, ListFlowBySimCardsRequest::setBody));

        // response
        builder.<List<SimCardsFlowVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlowBySimCardsResponse::getBody, ListFlowBySimCardsResponse::setBody)
                .withInnerContainerType(SimCardsFlowVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSimPricePlansRequest, ListSimPricePlansResponse> listSimPricePlans =
        genForListSimPricePlans();

    private static HttpRequestDef<ListSimPricePlansRequest, ListSimPricePlansResponse> genForListSimPricePlans() {
        // basic
        HttpRequestDef.Builder<ListSimPricePlansRequest, ListSimPricePlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSimPricePlansRequest.class, ListSimPricePlansResponse.class)
                .withName("ListSimPricePlans")
                .withUri("/v1/sim-price-plans")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sim_card_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPricePlansRequest::getSimCardId, ListSimPricePlansRequest::setSimCardId));
        builder.<String>withRequestField("iccid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimPricePlansRequest::getIccid, ListSimPricePlansRequest::setIccid));
        builder.<Boolean>withRequestField("real_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSimPricePlansRequest::getRealTime, ListSimPricePlansRequest::setRealTime));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPricePlansRequest::getLimit, ListSimPricePlansRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPricePlansRequest::getOffset, ListSimPricePlansRequest::setOffset));

        // response
        builder.<List<SimPricePlanVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSimPricePlansResponse::getBody, ListSimPricePlansResponse::setBody)
                .withInnerContainerType(SimPricePlanVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSmsDetailsRequest, ListSmsDetailsResponse> listSmsDetails =
        genForListSmsDetails();

    private static HttpRequestDef<ListSmsDetailsRequest, ListSmsDetailsResponse> genForListSmsDetails() {
        // basic
        HttpRequestDef.Builder<ListSmsDetailsRequest, ListSmsDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSmsDetailsRequest.class, ListSmsDetailsResponse.class)
                .withName("ListSmsDetails")
                .withUri("/v1/sms-send-infos/details")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSmsDetailsRequest::getLimit, ListSmsDetailsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSmsDetailsRequest::getOffset, ListSmsDetailsRequest::setOffset));
        builder.<String>withRequestField("cid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmsDetailsRequest::getCid, ListSmsDetailsRequest::setCid));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListSmsDetailsRequest::getStartTime, ListSmsDetailsRequest::setStartTime));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListSmsDetailsRequest::getEndTime, ListSmsDetailsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendSmsRequest, SendSmsResponse> sendSms = genForSendSms();

    private static HttpRequestDef<SendSmsRequest, SendSmsResponse> genForSendSms() {
        // basic
        HttpRequestDef.Builder<SendSmsRequest, SendSmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendSmsRequest.class, SendSmsResponse.class)
                .withName("SendSms")
                .withUri("/v1/sms-send-infos")
                .withContentType("application/json");

        // requests
        builder.<CreateSendSmsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSendSmsReq.class),
            f -> f.withMarshaller(SendSmsRequest::getBody, SendSmsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendSmsResponse::getBody, SendSmsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetTagsRequest, BatchSetTagsResponse> batchSetTags = genForBatchSetTags();

    private static HttpRequestDef<BatchSetTagsRequest, BatchSetTagsResponse> genForBatchSetTags() {
        // basic
        HttpRequestDef.Builder<BatchSetTagsRequest, BatchSetTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSetTagsRequest.class, BatchSetTagsResponse.class)
                .withName("BatchSetTags")
                .withUri("/v1/sim-tags/batch-set")
                .withContentType("application/json");

        // requests
        builder.<BatchSetTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSetTagsReq.class),
            f -> f.withMarshaller(BatchSetTagsRequest::getBody, BatchSetTagsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchSetTagsResponse::getBody, BatchSetTagsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v1/tags")
                .withContentType("application/json");

        // requests
        builder.<AddOrModifyTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddOrModifyTagReq.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v1/tags/{tag_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("tag_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteTagRequest::getTagId, DeleteTagRequest::setTagId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTagResponse::getBody, DeleteTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v1/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tag_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getTagName, ListTagsRequest::setTagName));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTagsRequest::getLimit, ListTagsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTagsRequest::getOffset, ListTagsRequest::setOffset));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getStatus, ListTagsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkOrderDetailsRequest, ListWorkOrderDetailsResponse> listWorkOrderDetails =
        genForListWorkOrderDetails();

    private static HttpRequestDef<ListWorkOrderDetailsRequest, ListWorkOrderDetailsResponse> genForListWorkOrderDetails() {
        // basic
        HttpRequestDef.Builder<ListWorkOrderDetailsRequest, ListWorkOrderDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWorkOrderDetailsRequest.class, ListWorkOrderDetailsResponse.class)
            .withName("ListWorkOrderDetails")
            .withUri("/v1/work-orders/{work_order_id}/details")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("work_order_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListWorkOrderDetailsRequest::getWorkOrderId,
                ListWorkOrderDetailsRequest::setWorkOrderId));
        builder.<String>withRequestField("main_search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkOrderDetailsRequest::getMainSearchKey,
                ListWorkOrderDetailsRequest::setMainSearchKey));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListWorkOrderDetailsRequest::getLimit, ListWorkOrderDetailsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListWorkOrderDetailsRequest::getOffset, ListWorkOrderDetailsRequest::setOffset));
        builder.<Integer>withRequestField("sim_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkOrderDetailsRequest::getSimType, ListWorkOrderDetailsRequest::setSimType));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkOrderDetailsRequest::getStatus, ListWorkOrderDetailsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkOrdersRequest, ListWorkOrdersResponse> listWorkOrders =
        genForListWorkOrders();

    private static HttpRequestDef<ListWorkOrdersRequest, ListWorkOrdersResponse> genForListWorkOrders() {
        // basic
        HttpRequestDef.Builder<ListWorkOrdersRequest, ListWorkOrdersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkOrdersRequest.class, ListWorkOrdersResponse.class)
                .withName("ListWorkOrders")
                .withUri("/v1/work-orders")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("main_search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkOrdersRequest::getMainSearchKey, ListWorkOrdersRequest::setMainSearchKey));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListWorkOrdersRequest::getLimit, ListWorkOrdersRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListWorkOrdersRequest::getOffset, ListWorkOrdersRequest::setOffset));
        builder.<Integer>withRequestField("sim_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkOrdersRequest::getSimType, ListWorkOrdersRequest::setSimType));
        builder.<Integer>withRequestField("work_order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkOrdersRequest::getWorkOrderType, ListWorkOrdersRequest::setWorkOrderType));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkOrdersRequest::getStatus, ListWorkOrdersRequest::setStatus));

        // response

        return builder.build();
    }

}

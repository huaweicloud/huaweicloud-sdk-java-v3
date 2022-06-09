package com.huaweicloud.sdk.gsl.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gsl.v3.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class GslMeta {

    public static final HttpRequestDef<ListProPricePlansRequest, ListProPricePlansResponse> listProPricePlans =
        genForlistProPricePlans();

    private static HttpRequestDef<ListProPricePlansRequest, ListProPricePlansResponse> genForlistProPricePlans() {
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
            f -> f.withMarshaller(ListProPricePlansRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("main_search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getMainSearchKey, (req, v) -> {
                req.setMainSearchKey(v);
            }));
        builder.<Long>withRequestField("flow_total",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getFlowTotal, (req, v) -> {
                req.setFlowTotal(v);
            }));
        builder.<Long>withRequestField("network_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getNetworkType, (req, v) -> {
                req.setNetworkType(v);
            }));
        builder.<Long>withRequestField("location_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getLocationType, (req, v) -> {
                req.setLocationType(v);
            }));
        builder.<Integer>withRequestField("carrier_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getCarrierType, (req, v) -> {
                req.setCarrierType(v);
            }));
        builder.<Long>withRequestField("country_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProPricePlansRequest::getCountryType, (req, v) -> {
                req.setCountryType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetAttributesRequest, BatchSetAttributesResponse> batchSetAttributes =
        genForbatchSetAttributes();

    private static HttpRequestDef<BatchSetAttributesRequest, BatchSetAttributesResponse> genForbatchSetAttributes() {
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
            f -> f.withMarshaller(BatchSetAttributesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchSetAttributesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateAttributeRequest, CreateAttributeResponse> createAttribute =
        genForcreateAttribute();

    private static HttpRequestDef<CreateAttributeRequest, CreateAttributeResponse> genForcreateAttribute() {
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
            f -> f.withMarshaller(CreateAttributeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAttributeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DisableAttributeRequest, DisableAttributeResponse> disableAttribute =
        genFordisableAttribute();

    private static HttpRequestDef<DisableAttributeRequest, DisableAttributeResponse> genFordisableAttribute() {
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
            f -> f.withMarshaller(DisableAttributeRequest::getAttributeId, (req, v) -> {
                req.setAttributeId(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisableAttributeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<EnableAttributeRequest, EnableAttributeResponse> enableAttribute =
        genForenableAttribute();

    private static HttpRequestDef<EnableAttributeRequest, EnableAttributeResponse> genForenableAttribute() {
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
            f -> f.withMarshaller(EnableAttributeRequest::getAttributeId, (req, v) -> {
                req.setAttributeId(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(EnableAttributeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListAttributesRequest, ListAttributesResponse> listAttributes =
        genForlistAttributes();

    private static HttpRequestDef<ListAttributesRequest, ListAttributesResponse> genForlistAttributes() {
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
            f -> f.withMarshaller(ListAttributesRequest::getCustAttrName, (req, v) -> {
                req.setCustAttrName(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttributesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttributesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttributesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAttributeRequest, UpdateAttributeResponse> updateAttribute =
        genForupdateAttribute();

    private static HttpRequestDef<UpdateAttributeRequest, UpdateAttributeResponse> genForupdateAttribute() {
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
            f -> f.withMarshaller(UpdateAttributeRequest::getAttributeId, (req, v) -> {
                req.setAttributeId(v);
            }));
        builder.<AddOrModifyAttributeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddOrModifyAttributeReq.class),
            f -> f.withMarshaller(UpdateAttributeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAttributeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRealNameRequest, DeleteRealNameResponse> deleteRealName =
        genFordeleteRealName();

    private static HttpRequestDef<DeleteRealNameRequest, DeleteRealNameResponse> genFordeleteRealName() {
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
            f -> f.withMarshaller(DeleteRealNameRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableSimCardRequest, EnableSimCardResponse> enableSimCard =
        genForenableSimCard();

    private static HttpRequestDef<EnableSimCardRequest, EnableSimCardResponse> genForenableSimCard() {
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
            f -> f.withMarshaller(EnableSimCardRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSimCardsRequest, ListSimCardsResponse> listSimCards = genForlistSimCards();

    private static HttpRequestDef<ListSimCardsRequest, ListSimCardsResponse> genForlistSimCards() {
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
            f -> f.withMarshaller(ListSimCardsRequest::getMainSearchType, (req, v) -> {
                req.setMainSearchType(v);
            }));
        builder.<String>withRequestField("main_search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMainSearchKey, (req, v) -> {
                req.setMainSearchKey(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("sim_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSimCardsRequest::getSimStatus, (req, v) -> {
                req.setSimStatus(v);
            }));
        builder.<Integer>withRequestField("device_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSimCardsRequest::getDeviceStatus, (req, v) -> {
                req.setDeviceStatus(v);
            }));
        builder.<List<Long>>withRequestField("tag_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSimCardsRequest::getTagId, (req, v) -> {
                req.setTagId(v);
            }));
        builder.<Integer>withRequestField("sim_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSimCardsRequest::getSimType, (req, v) -> {
                req.setSimType(v);
            }));
        builder.<ListSimCardsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSimCardsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListSimCardsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<ListSimCardsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSimCardsRequest.SortEnum.class),
            f -> f.withMarshaller(ListSimCardsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("msisdn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMsisdn, (req, v) -> {
                req.setMsisdn(v);
            }));
        builder.<String>withRequestField("customer_attribute1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute1, (req, v) -> {
                req.setCustomerAttribute1(v);
            }));
        builder.<String>withRequestField("customer_attribute2",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute2, (req, v) -> {
                req.setCustomerAttribute2(v);
            }));
        builder.<String>withRequestField("customer_attribute3",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute3, (req, v) -> {
                req.setCustomerAttribute3(v);
            }));
        builder.<String>withRequestField("customer_attribute4",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute4, (req, v) -> {
                req.setCustomerAttribute4(v);
            }));
        builder.<String>withRequestField("customer_attribute5",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute5, (req, v) -> {
                req.setCustomerAttribute5(v);
            }));
        builder.<String>withRequestField("customer_attribute6",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimCardsRequest::getCustomerAttribute6, (req, v) -> {
                req.setCustomerAttribute6(v);
            }));
        builder.<Long>withRequestField("min_used_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMinUsedFlow, (req, v) -> {
                req.setMinUsedFlow(v);
            }));
        builder.<Long>withRequestField("max_used_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMaxUsedFlow, (req, v) -> {
                req.setMaxUsedFlow(v);
            }));
        builder.<Long>withRequestField("min_left_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMinLeftFlow, (req, v) -> {
                req.setMinLeftFlow(v);
            }));
        builder.<Long>withRequestField("max_left_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getMaxLeftFlow, (req, v) -> {
                req.setMaxLeftFlow(v);
            }));
        builder.<Boolean>withRequestField("real_named",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSimCardsRequest::getRealNamed, (req, v) -> {
                req.setRealNamed(v);
            }));
        builder.<Long>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimCardsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            }));
        builder.<Boolean>withRequestField("filter_downtime_period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSimCardsRequest::getFilterDowntimePeriod, (req, v) -> {
                req.setFilterDowntimePeriod(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterImeiRequest, RegisterImeiResponse> registerImei = genForregisterImei();

    private static HttpRequestDef<RegisterImeiRequest, RegisterImeiResponse> genForregisterImei() {
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
            f -> f.withMarshaller(RegisterImeiRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));
        builder.<RegisterImeiReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RegisterImeiReq.class),
            f -> f.withMarshaller(RegisterImeiRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetSimCardRequest, ResetSimCardResponse> resetSimCard = genForresetSimCard();

    private static HttpRequestDef<ResetSimCardRequest, ResetSimCardResponse> genForresetSimCard() {
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
            f -> f.withMarshaller(ResetSimCardRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));
        builder.<DownUpTimeForSimCardReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownUpTimeForSimCardReq.class),
            f -> f.withMarshaller(ResetSimCardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetExceedCutNetRequest, SetExceedCutNetResponse> setExceedCutNet =
        genForsetExceedCutNet();

    private static HttpRequestDef<SetExceedCutNetRequest, SetExceedCutNetResponse> genForsetExceedCutNet() {
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
            f -> f.withMarshaller(SetExceedCutNetRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));
        builder.<ExceedCutNetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExceedCutNetReq.class),
            f -> f.withMarshaller(SetExceedCutNetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSpeedValueRequest, SetSpeedValueResponse> setSpeedValue =
        genForsetSpeedValue();

    private static HttpRequestDef<SetSpeedValueRequest, SetSpeedValueResponse> genForsetSpeedValue() {
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
            f -> f.withMarshaller(SetSpeedValueRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));
        builder.<SetSpeedValueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetSpeedValueReq.class),
            f -> f.withMarshaller(SetSpeedValueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRealNamedRequest, ShowRealNamedResponse> showRealNamed =
        genForshowRealNamed();

    private static HttpRequestDef<ShowRealNamedRequest, ShowRealNamedResponse> genForshowRealNamed() {
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
            f -> f.withMarshaller(ShowRealNamedRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSimCardRequest, ShowSimCardResponse> showSimCard = genForshowSimCard();

    private static HttpRequestDef<ShowSimCardRequest, ShowSimCardResponse> genForshowSimCard() {
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
            f -> f.withMarshaller(ShowSimCardRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartStopNetRequest, StartStopNetResponse> startStopNet = genForstartStopNet();

    private static HttpRequestDef<StartStopNetRequest, StartStopNetResponse> genForstartStopNet() {
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
            f -> f.withMarshaller(StartStopNetRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));
        builder.<CutNetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CutNetReq.class),
            f -> f.withMarshaller(StartStopNetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopSimCardRequest, StopSimCardResponse> stopSimCard = genForstopSimCard();

    private static HttpRequestDef<StopSimCardRequest, StopSimCardResponse> genForstopSimCard() {
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
            f -> f.withMarshaller(StopSimCardRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));
        builder.<DownUpTimeForSimCardReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownUpTimeForSimCardReq.class),
            f -> f.withMarshaller(StopSimCardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSimPoolMembersRequest, ListSimPoolMembersResponse> listSimPoolMembers =
        genForlistSimPoolMembers();

    private static HttpRequestDef<ListSimPoolMembersRequest, ListSimPoolMembersResponse> genForlistSimPoolMembers() {
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
            f -> f.withMarshaller(ListSimPoolMembersRequest::getSimPoolId, (req, v) -> {
                req.setSimPoolId(v);
            }));
        builder.<String>withRequestField("cid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimPoolMembersRequest::getCid, (req, v) -> {
                req.setCid(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPoolMembersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPoolMembersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("billing_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimPoolMembersRequest::getBillingCycle, (req, v) -> {
                req.setBillingCycle(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSimPoolsRequest, ListSimPoolsResponse> listSimPools = genForlistSimPools();

    private static HttpRequestDef<ListSimPoolsRequest, ListSimPoolsResponse> genForlistSimPools() {
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
            f -> f.withMarshaller(ListSimPoolsRequest::getPoolName, (req, v) -> {
                req.setPoolName(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPoolsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("billing_cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSimPoolsRequest::getBillingCycle, (req, v) -> {
                req.setBillingCycle(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> listFlowBySimCards =
        genForlistFlowBySimCards();

    private static HttpRequestDef<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> genForlistFlowBySimCards() {
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
            f -> f.withMarshaller(ListFlowBySimCardsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<List<SimCardsFlowVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlowBySimCardsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(SimCardsFlowVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSimPricePlansRequest, ListSimPricePlansResponse> listSimPricePlans =
        genForlistSimPricePlans();

    private static HttpRequestDef<ListSimPricePlansRequest, ListSimPricePlansResponse> genForlistSimPricePlans() {
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
            f -> f.withMarshaller(ListSimPricePlansRequest::getSimCardId, (req, v) -> {
                req.setSimCardId(v);
            }));
        builder.<Boolean>withRequestField("real_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSimPricePlansRequest::getRealTime, (req, v) -> {
                req.setRealTime(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPricePlansRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSimPricePlansRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        builder.<List<SimPricePlanVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSimPricePlansResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(SimPricePlanVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetTagsRequest, BatchSetTagsResponse> batchSetTags = genForbatchSetTags();

    private static HttpRequestDef<BatchSetTagsRequest, BatchSetTagsResponse> genForbatchSetTags() {
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
            f -> f.withMarshaller(BatchSetTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchSetTagsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForcreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForcreateTag() {
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
            f -> f.withMarshaller(CreateTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genFordeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genFordeleteTag() {
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
            f -> f.withMarshaller(DeleteTagRequest::getTagId, (req, v) -> {
                req.setTagId(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
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
            f -> f.withMarshaller(ListTagsRequest::getTagName, (req, v) -> {
                req.setTagName(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

}

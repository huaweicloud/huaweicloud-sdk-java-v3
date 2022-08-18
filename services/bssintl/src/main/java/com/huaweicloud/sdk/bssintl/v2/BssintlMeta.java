package com.huaweicloud.sdk.bssintl.v2;

import com.huaweicloud.sdk.bssintl.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class BssintlMeta {

    public static final HttpRequestDef<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> autoRenewalResources =
        genForautoRenewalResources();

    private static HttpRequestDef<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> genForautoRenewalResources() {
        // basic
        HttpRequestDef.Builder<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AutoRenewalResourcesRequest.class, AutoRenewalResourcesResponse.class)
            .withName("AutoRenewalResources")
            .withUri("/v2/orders/subscriptions/resources/autorenew/{resource_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AutoRenewalResourcesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> cancelAutoRenewalResources =
        genForcancelAutoRenewalResources();

    private static HttpRequestDef<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> genForcancelAutoRenewalResources() {
        // basic
        HttpRequestDef.Builder<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    CancelAutoRenewalResourcesRequest.class,
                    CancelAutoRenewalResourcesResponse.class)
                .withName("CancelAutoRenewalResources")
                .withUri("/v2/orders/subscriptions/resources/autorenew/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAutoRenewalResourcesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelCustomerOrderRequest, CancelCustomerOrderResponse> cancelCustomerOrder =
        genForcancelCustomerOrder();

    private static HttpRequestDef<CancelCustomerOrderRequest, CancelCustomerOrderResponse> genForcancelCustomerOrder() {
        // basic
        HttpRequestDef.Builder<CancelCustomerOrderRequest, CancelCustomerOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CancelCustomerOrderRequest.class, CancelCustomerOrderResponse.class)
                .withName("CancelCustomerOrder")
                .withUri("/v2/orders/customer-orders/cancel")
                .withContentType("application/json");

        // requests
        builder.<CancelCustomerOrderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelCustomerOrderReq.class),
            f -> f.withMarshaller(CancelCustomerOrderRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> cancelResourcesSubscription =
        genForcancelResourcesSubscription();

    private static HttpRequestDef<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> genForcancelResourcesSubscription() {
        // basic
        HttpRequestDef.Builder<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CancelResourcesSubscriptionRequest.class,
                    CancelResourcesSubscriptionResponse.class)
                .withName("CancelResourcesSubscription")
                .withUri("/v2/orders/subscriptions/resources/unsubscribe")
                .withContentType("application/json");

        // requests
        builder.<UnsubscribeResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnsubscribeResourcesReq.class),
            f -> f.withMarshaller(CancelResourcesSubscriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthentication =
        genForchangeEnterpriseRealnameAuthentication();

    private static HttpRequestDef<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> genForchangeEnterpriseRealnameAuthentication() {
        // basic
        HttpRequestDef.Builder<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeEnterpriseRealnameAuthenticationRequest.class,
                    ChangeEnterpriseRealnameAuthenticationResponse.class)
                .withName("ChangeEnterpriseRealnameAuthentication")
                .withUri("/v2/customers/realname-auths/enterprise")
                .withContentType("application/json");

        // requests
        builder.<ChangeEnterpriseRealnameAuthsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeEnterpriseRealnameAuthsReq.class),
            f -> f.withMarshaller(ChangeEnterpriseRealnameAuthenticationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckUserIdentityRequest, CheckUserIdentityResponse> checkUserIdentity =
        genForcheckUserIdentity();

    private static HttpRequestDef<CheckUserIdentityRequest, CheckUserIdentityResponse> genForcheckUserIdentity() {
        // basic
        HttpRequestDef.Builder<CheckUserIdentityRequest, CheckUserIdentityResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckUserIdentityRequest.class, CheckUserIdentityResponse.class)
                .withName("CheckUserIdentity")
                .withUri("/v2/partners/sub-customers/users/check-identity")
                .withContentType("application/json");

        // requests
        builder.<CheckSubcustomerUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckSubcustomerUserReq.class),
            f -> f.withMarshaller(CheckUserIdentityRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthentication =
        genForcreateEnterpriseRealnameAuthentication();

    private static HttpRequestDef<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> genForcreateEnterpriseRealnameAuthentication() {
        // basic
        HttpRequestDef.Builder<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateEnterpriseRealnameAuthenticationRequest.class,
                    CreateEnterpriseRealnameAuthenticationResponse.class)
                .withName("CreateEnterpriseRealnameAuthentication")
                .withUri("/v2/customers/realname-auths/enterprise")
                .withContentType("application/json");

        // requests
        builder.<ApplyEnterpriseRealnameAuthsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyEnterpriseRealnameAuthsReq.class),
            f -> f.withMarshaller(CreateEnterpriseRealnameAuthenticationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> createPersonalRealnameAuth =
        genForcreatePersonalRealnameAuth();

    private static HttpRequestDef<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> genForcreatePersonalRealnameAuth() {
        // basic
        HttpRequestDef.Builder<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePersonalRealnameAuthRequest.class,
                    CreatePersonalRealnameAuthResponse.class)
                .withName("CreatePersonalRealnameAuth")
                .withUri("/v2/customers/realname-auths/individual")
                .withContentType("application/json");

        // requests
        builder.<ApplyIndividualRealnameAuthsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyIndividualRealnameAuthsReq.class),
            f -> f.withMarshaller(CreatePersonalRealnameAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubCustomerRequest, CreateSubCustomerResponse> createSubCustomer =
        genForcreateSubCustomer();

    private static HttpRequestDef<CreateSubCustomerRequest, CreateSubCustomerResponse> genForcreateSubCustomer() {
        // basic
        HttpRequestDef.Builder<CreateSubCustomerRequest, CreateSubCustomerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubCustomerRequest.class, CreateSubCustomerResponse.class)
                .withName("CreateSubCustomer")
                .withUri("/v2/partners/sub-customers")
                .withContentType("application/json");

        // requests
        builder.<CreateCustomerV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCustomerV2Req.class),
            f -> f.withMarshaller(CreateSubCustomerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<FreezeSubCustomersRequest, FreezeSubCustomersResponse> freezeSubCustomers =
        genForfreezeSubCustomers();

    private static HttpRequestDef<FreezeSubCustomersRequest, FreezeSubCustomersResponse> genForfreezeSubCustomers() {
        // basic
        HttpRequestDef.Builder<FreezeSubCustomersRequest, FreezeSubCustomersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, FreezeSubCustomersRequest.class, FreezeSubCustomersResponse.class)
                .withName("FreezeSubCustomers")
                .withUri("/v2/partners/sub-customers/freeze")
                .withContentType("application/json");

        // requests
        builder.<FreezeSubCustomersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FreezeSubCustomersReq.class),
            f -> f.withMarshaller(FreezeSubCustomersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConversionsRequest, ListConversionsResponse> listConversions =
        genForlistConversions();

    private static HttpRequestDef<ListConversionsRequest, ListConversionsResponse> genForlistConversions() {
        // basic
        HttpRequestDef.Builder<ListConversionsRequest, ListConversionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConversionsRequest.class, ListConversionsResponse.class)
                .withName("ListConversions")
                .withUri("/v2/bases/conversions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("measure_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConversionsRequest::getMeasureType, (req, v) -> {
                req.setMeasureType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConversionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCostsRequest, ListCostsResponse> listCosts = genForlistCosts();

    private static HttpRequestDef<ListCostsRequest, ListCostsResponse> genForlistCosts() {
        // basic
        HttpRequestDef.Builder<ListCostsRequest, ListCostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCostsRequest.class, ListCostsResponse.class)
                .withName("ListCosts")
                .withUri("/v4/costs/cost-analysed-bills/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCostsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ListCostsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCostsReq.class),
            f -> f.withMarshaller(ListCostsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResources =
        genForlistCustomerOnDemandResources();

    private static HttpRequestDef<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> genForlistCustomerOnDemandResources() {
        // basic
        HttpRequestDef.Builder<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCustomerOnDemandResourcesRequest.class,
                    ListCustomerOnDemandResourcesResponse.class)
                .withName("ListCustomerOnDemandResources")
                .withUri("/v2/partners/sub-customers/on-demand-resources/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOnDemandResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QueryCustomerOnDemandResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryCustomerOnDemandResourcesReq.class),
            f -> f.withMarshaller(ListCustomerOnDemandResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerOrdersRequest, ListCustomerOrdersResponse> listCustomerOrders =
        genForlistCustomerOrders();

    private static HttpRequestDef<ListCustomerOrdersRequest, ListCustomerOrdersResponse> genForlistCustomerOrders() {
        // basic
        HttpRequestDef.Builder<ListCustomerOrdersRequest, ListCustomerOrdersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomerOrdersRequest.class, ListCustomerOrdersResponse.class)
                .withName("ListCustomerOrders")
                .withUri("/v2/orders/customer-orders")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            }));
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            }));
        builder.<String>withRequestField("create_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getCreateTimeBegin, (req, v) -> {
                req.setCreateTimeBegin(v);
            }));
        builder.<String>withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getCreateTimeEnd, (req, v) -> {
                req.setCreateTimeEnd(v);
            }));
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getServiceTypeCode, (req, v) -> {
                req.setServiceTypeCode(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOrderType, (req, v) -> {
                req.setOrderType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<String>withRequestField("payment_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getPaymentTimeBegin, (req, v) -> {
                req.setPaymentTimeBegin(v);
            }));
        builder.<String>withRequestField("payment_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getPaymentTimeEnd, (req, v) -> {
                req.setPaymentTimeEnd(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetails =
        genForlistCustomerselfResourceRecordDetails();

    private static HttpRequestDef<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> genForlistCustomerselfResourceRecordDetails() {
        // basic
        HttpRequestDef.Builder<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCustomerselfResourceRecordDetailsRequest.class,
                    ListCustomerselfResourceRecordDetailsResponse.class)
                .withName("ListCustomerselfResourceRecordDetails")
                .withUri("/v2/bills/customer-bills/res-records/query")
                .withContentType("application/json");

        // requests
        builder.<QueryResRecordsDetailReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResRecordsDetailReq.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordDetailsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecords =
        genForlistCustomerselfResourceRecords();

    private static HttpRequestDef<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> genForlistCustomerselfResourceRecords() {
        // basic
        HttpRequestDef.Builder<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCustomerselfResourceRecordsRequest.class,
                    ListCustomerselfResourceRecordsResponse.class)
                .withName("ListCustomerselfResourceRecords")
                .withUri("/v2/bills/customer-bills/res-fee-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            }));
        builder.<String>withRequestField("cloud_service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getCloudServiceType, (req, v) -> {
                req.setCloudServiceType(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getChargeMode, (req, v) -> {
                req.setChargeMode(v);
            }));
        builder.<Integer>withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getBillType, (req, v) -> {
                req.setBillType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Boolean>withRequestField("include_zero_record",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getIncludeZeroRecord, (req, v) -> {
                req.setIncludeZeroRecord(v);
            }));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getMethod, (req, v) -> {
                req.setMethod(v);
            }));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            }));
        builder.<String>withRequestField("trade_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getTradeId, (req, v) -> {
                req.setTradeId(v);
            }));
        builder.<String>withRequestField("bill_date_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getBillDateBegin, (req, v) -> {
                req.setBillDateBegin(v);
            }));
        builder.<String>withRequestField("bill_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getBillDateEnd, (req, v) -> {
                req.setBillDateEnd(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse> listFreeResourceInfos =
        genForlistFreeResourceInfos();

    private static HttpRequestDef<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse> genForlistFreeResourceInfos() {
        // basic
        HttpRequestDef.Builder<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListFreeResourceInfosRequest.class, ListFreeResourceInfosResponse.class)
            .withName("ListFreeResourceInfos")
            .withUri("/v3/payments/free-resources/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFreeResourceInfosRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ListFreeResourceInfosReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFreeResourceInfosReq.class),
            f -> f.withMarshaller(ListFreeResourceInfosRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> listFreeResourceUsages =
        genForlistFreeResourceUsages();

    private static HttpRequestDef<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> genForlistFreeResourceUsages() {
        // basic
        HttpRequestDef.Builder<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListFreeResourceUsagesRequest.class, ListFreeResourceUsagesResponse.class)
            .withName("ListFreeResourceUsages")
            .withUri("/v2/payments/free-resources/usages/details/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFreeResourceUsagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ListFreeResourceUsagesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFreeResourceUsagesReq.class),
            f -> f.withMarshaller(ListFreeResourceUsagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIndirectPartnersRequest, ListIndirectPartnersResponse> listIndirectPartners =
        genForlistIndirectPartners();

    private static HttpRequestDef<ListIndirectPartnersRequest, ListIndirectPartnersResponse> genForlistIndirectPartners() {
        // basic
        HttpRequestDef.Builder<ListIndirectPartnersRequest, ListIndirectPartnersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListIndirectPartnersRequest.class, ListIndirectPartnersResponse.class)
            .withName("ListIndirectPartners")
            .withUri("/v2/partners/indirect-partners/query")
            .withContentType("application/json");

        // requests
        builder.<QueryIndirectPartnersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryIndirectPartnersReq.class),
            f -> f.withMarshaller(ListIndirectPartnersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInvoicesRequest, ListInvoicesResponse> listInvoices = genForlistInvoices();

    private static HttpRequestDef<ListInvoicesRequest, ListInvoicesResponse> genForlistInvoices() {
        // basic
        HttpRequestDef.Builder<ListInvoicesRequest, ListInvoicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInvoicesRequest.class, ListInvoicesResponse.class)
                .withName("ListInvoices")
                .withUri("/v1.0/{domain_id}/payments/intl-invoices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInvoicesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInvoicesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInvoicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInvoicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMeasureUnitsRequest, ListMeasureUnitsResponse> listMeasureUnits =
        genForlistMeasureUnits();

    private static HttpRequestDef<ListMeasureUnitsRequest, ListMeasureUnitsResponse> genForlistMeasureUnits() {
        // basic
        HttpRequestDef.Builder<ListMeasureUnitsRequest, ListMeasureUnitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMeasureUnitsRequest.class, ListMeasureUnitsResponse.class)
                .withName("ListMeasureUnits")
                .withUri("/v2/bases/measurements")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMeasureUnitsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonthlyExpendituresRequest, ListMonthlyExpendituresResponse> listMonthlyExpenditures =
        genForlistMonthlyExpenditures();

    private static HttpRequestDef<ListMonthlyExpendituresRequest, ListMonthlyExpendituresResponse> genForlistMonthlyExpenditures() {
        // basic
        HttpRequestDef.Builder<ListMonthlyExpendituresRequest, ListMonthlyExpendituresResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMonthlyExpendituresRequest.class, ListMonthlyExpendituresResponse.class)
            .withName("ListMonthlyExpenditures")
            .withUri("/v1.0/{domain_id}/customer/account-mgr/bill/monthly-sum")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonthlyExpendituresRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            }));
        builder.<String>withRequestField("cloud_service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonthlyExpendituresRequest::getCloudServiceTypeCode, (req, v) -> {
                req.setCloudServiceTypeCode(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonthlyExpendituresRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("enterpriseProjectId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonthlyExpendituresRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> listOnDemandResourceRatings =
        genForlistOnDemandResourceRatings();

    private static HttpRequestDef<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> genForlistOnDemandResourceRatings() {
        // basic
        HttpRequestDef.Builder<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListOnDemandResourceRatingsRequest.class,
                    ListOnDemandResourceRatingsResponse.class)
                .withName("ListOnDemandResourceRatings")
                .withUri("/v2/bills/ratings/on-demand-resources")
                .withContentType("application/json");

        // requests
        builder.<RateOnDemandReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RateOnDemandReq.class),
            f -> f.withMarshaller(ListOnDemandResourceRatingsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrderDiscountsRequest, ListOrderDiscountsResponse> listOrderDiscounts =
        genForlistOrderDiscounts();

    private static HttpRequestDef<ListOrderDiscountsRequest, ListOrderDiscountsResponse> genForlistOrderDiscounts() {
        // basic
        HttpRequestDef.Builder<ListOrderDiscountsRequest, ListOrderDiscountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOrderDiscountsRequest.class, ListOrderDiscountsResponse.class)
                .withName("ListOrderDiscounts")
                .withUri("/v2/orders/customer-orders/order-discounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderDiscountsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResources =
        genForlistPayPerUseCustomerResources();

    private static HttpRequestDef<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> genForlistPayPerUseCustomerResources() {
        // basic
        HttpRequestDef.Builder<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListPayPerUseCustomerResourcesRequest.class,
                    ListPayPerUseCustomerResourcesResponse.class)
                .withName("ListPayPerUseCustomerResources")
                .withUri("/v2/orders/suscriptions/resources/query")
                .withContentType("application/json");

        // requests
        builder.<QueryResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourcesReq.class),
            f -> f.withMarshaller(ListPayPerUseCustomerResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostpaidBillSumRequest, ListPostpaidBillSumResponse> listPostpaidBillSum =
        genForlistPostpaidBillSum();

    private static HttpRequestDef<ListPostpaidBillSumRequest, ListPostpaidBillSumResponse> genForlistPostpaidBillSum() {
        // basic
        HttpRequestDef.Builder<ListPostpaidBillSumRequest, ListPostpaidBillSumResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPostpaidBillSumRequest.class, ListPostpaidBillSumResponse.class)
                .withName("ListPostpaidBillSum")
                .withUri("/v2/bills/partner-bills/postpaid-bill-summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bill_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostpaidBillSumRequest::getBillCycle, (req, v) -> {
                req.setBillCycle(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> listRateOnPeriodDetail =
        genForlistRateOnPeriodDetail();

    private static HttpRequestDef<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> genForlistRateOnPeriodDetail() {
        // basic
        HttpRequestDef.Builder<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListRateOnPeriodDetailRequest.class, ListRateOnPeriodDetailResponse.class)
            .withName("ListRateOnPeriodDetail")
            .withUri("/v2/bills/ratings/period-resources/subscribe-rate")
            .withContentType("application/json");

        // requests
        builder.<RateOnPeriodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RateOnPeriodReq.class),
            f -> f.withMarshaller(ListRateOnPeriodDetailRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTypesRequest, ListResourceTypesResponse> listResourceTypes =
        genForlistResourceTypes();

    private static HttpRequestDef<ListResourceTypesRequest, ListResourceTypesResponse> genForlistResourceTypes() {
        // basic
        HttpRequestDef.Builder<ListResourceTypesRequest, ListResourceTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTypesRequest.class, ListResourceTypesResponse.class)
                .withName("ListResourceTypes")
                .withUri("/v2/products/resource-types")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceTypesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceTypesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceResourcesRequest, ListServiceResourcesResponse> listServiceResources =
        genForlistServiceResources();

    private static HttpRequestDef<ListServiceResourcesRequest, ListServiceResourcesResponse> genForlistServiceResources() {
        // basic
        HttpRequestDef.Builder<ListServiceResourcesRequest, ListServiceResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServiceResourcesRequest.class, ListServiceResourcesResponse.class)
            .withName("ListServiceResources")
            .withUri("/v2/products/service-resources")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceResourcesRequest::getServiceTypeCode, (req, v) -> {
                req.setServiceTypeCode(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceTypesRequest, ListServiceTypesResponse> listServiceTypes =
        genForlistServiceTypes();

    private static HttpRequestDef<ListServiceTypesRequest, ListServiceTypesResponse> genForlistServiceTypes() {
        // basic
        HttpRequestDef.Builder<ListServiceTypesRequest, ListServiceTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceTypesRequest.class, ListServiceTypesResponse.class)
                .withName("ListServiceTypes")
                .withUri("/v2/products/service-types")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceTypesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceTypesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> listSubCustomerCoupons =
        genForlistSubCustomerCoupons();

    private static HttpRequestDef<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> genForlistSubCustomerCoupons() {
        // basic
        HttpRequestDef.Builder<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSubCustomerCouponsRequest.class, ListSubCustomerCouponsResponse.class)
            .withName("ListSubCustomerCoupons")
            .withUri("/v2/promotions/benefits/coupons")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("coupon_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getCouponId, (req, v) -> {
                req.setCouponId(v);
            }));
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            }));
        builder.<String>withRequestField("promotion_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getPromotionPlanId, (req, v) -> {
                req.setPromotionPlanId(v);
            }));
        builder.<Integer>withRequestField("coupon_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getCouponType, (req, v) -> {
                req.setCouponType(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("active_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getActiveStartTime, (req, v) -> {
                req.setActiveStartTime(v);
            }));
        builder.<String>withRequestField("active_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getActiveEndTime, (req, v) -> {
                req.setActiveEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("source_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomers =
        genForlistSubCustomers();

    private static HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> genForlistSubCustomers() {
        // basic
        HttpRequestDef.Builder<ListSubCustomersRequest, ListSubCustomersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSubCustomersRequest.class, ListSubCustomersResponse.class)
                .withName("ListSubCustomers")
                .withUri("/v2/partners/sub-customers/query")
                .withContentType("application/json");

        // requests
        builder.<QuerySubCustomerListReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySubCustomerListReq.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsageTypesRequest, ListUsageTypesResponse> listUsageTypes =
        genForlistUsageTypes();

    private static HttpRequestDef<ListUsageTypesRequest, ListUsageTypesResponse> genForlistUsageTypes() {
        // basic
        HttpRequestDef.Builder<ListUsageTypesRequest, ListUsageTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsageTypesRequest.class, ListUsageTypesResponse.class)
                .withName("ListUsageTypes")
                .withUri("/v2/products/usage-types")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsageTypesRequest::getResourceTypeCode, (req, v) -> {
                req.setResourceTypeCode(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageTypesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageTypesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsageTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PayOrdersRequest, PayOrdersResponse> payOrders = genForpayOrders();

    private static HttpRequestDef<PayOrdersRequest, PayOrdersResponse> genForpayOrders() {
        // basic
        HttpRequestDef.Builder<PayOrdersRequest, PayOrdersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PayOrdersRequest.class, PayOrdersResponse.class)
                .withName("PayOrders")
                .withUri("/v2/orders/customer-orders/pay")
                .withContentType("application/json");

        // requests
        builder.<PayCustomerOrderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PayCustomerOrderReq.class),
            f -> f.withMarshaller(PayOrdersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenewalResourcesRequest, RenewalResourcesResponse> renewalResources =
        genForrenewalResources();

    private static HttpRequestDef<RenewalResourcesRequest, RenewalResourcesResponse> genForrenewalResources() {
        // basic
        HttpRequestDef.Builder<RenewalResourcesRequest, RenewalResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RenewalResourcesRequest.class, RenewalResourcesResponse.class)
                .withName("RenewalResources")
                .withUri("/v2/orders/subscriptions/resources/renew")
                .withContentType("application/json");

        // requests
        builder.<RenewalResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RenewalResourcesReq.class),
            f -> f.withMarshaller(RenewalResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> sendVerificationMessageCode =
        genForsendVerificationMessageCode();

    private static HttpRequestDef<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> genForsendVerificationMessageCode() {
        // basic
        HttpRequestDef.Builder<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SendVerificationMessageCodeRequest.class,
                    SendVerificationMessageCodeResponse.class)
                .withName("SendVerificationMessageCode")
                .withUri("/v2/bases/verificationcode/send")
                .withContentType("application/json");

        // requests
        builder.<SendVerificationCodeV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendVerificationCodeV2Req.class),
            f -> f.withMarshaller(SendVerificationMessageCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> showCustomerAccountBalances =
        genForshowCustomerAccountBalances();

    private static HttpRequestDef<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> genForshowCustomerAccountBalances() {
        // basic
        HttpRequestDef.Builder<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCustomerAccountBalancesRequest.class,
                    ShowCustomerAccountBalancesResponse.class)
                .withName("ShowCustomerAccountBalances")
                .withUri("/v2/accounts/customer-accounts/balances")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> showCustomerOrderDetails =
        genForshowCustomerOrderDetails();

    private static HttpRequestDef<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> genForshowCustomerOrderDetails() {
        // basic
        HttpRequestDef.Builder<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowCustomerOrderDetailsRequest.class, ShowCustomerOrderDetailsResponse.class)
                .withName("ShowCustomerOrderDetails")
                .withUri("/v2/orders/customer-orders/details/{order_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("order_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResult =
        genForshowRealnameAuthenticationReviewResult();

    private static HttpRequestDef<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> genForshowRealnameAuthenticationReviewResult() {
        // basic
        HttpRequestDef.Builder<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRealnameAuthenticationReviewResultRequest.class,
                    ShowRealnameAuthenticationReviewResultResponse.class)
                .withName("ShowRealnameAuthenticationReviewResult")
                .withUri("/v2/customers/realname-auths/result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRealnameAuthenticationReviewResultRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> showRefundOrderDetails =
        genForshowRefundOrderDetails();

    private static HttpRequestDef<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> genForshowRefundOrderDetails() {
        // basic
        HttpRequestDef.Builder<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRefundOrderDetailsRequest.class, ShowRefundOrderDetailsResponse.class)
            .withName("ShowRefundOrderDetails")
            .withUri("/v2/orders/customer-orders/refund-orders")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRefundOrderDetailsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubCustomerBudgetRequest, ShowSubCustomerBudgetResponse> showSubCustomerBudget =
        genForshowSubCustomerBudget();

    private static HttpRequestDef<ShowSubCustomerBudgetRequest, ShowSubCustomerBudgetResponse> genForshowSubCustomerBudget() {
        // basic
        HttpRequestDef.Builder<ShowSubCustomerBudgetRequest, ShowSubCustomerBudgetResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSubCustomerBudgetRequest.class, ShowSubCustomerBudgetResponse.class)
            .withName("ShowSubCustomerBudget")
            .withUri("/v2/partners/sub-customers/budget")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubCustomerBudgetRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            }));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubCustomerBudgetRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezeSubCustomersRequest, UnfreezeSubCustomersResponse> unfreezeSubCustomers =
        genForunfreezeSubCustomers();

    private static HttpRequestDef<UnfreezeSubCustomersRequest, UnfreezeSubCustomersResponse> genForunfreezeSubCustomers() {
        // basic
        HttpRequestDef.Builder<UnfreezeSubCustomersRequest, UnfreezeSubCustomersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UnfreezeSubCustomersRequest.class, UnfreezeSubCustomersResponse.class)
            .withName("UnfreezeSubCustomers")
            .withUri("/v2/partners/sub-customers/unfreeze")
            .withContentType("application/json");

        // requests
        builder.<UnfreezeSubCustomersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnfreezeSubCustomersReq.class),
            f -> f.withMarshaller(UnfreezeSubCustomersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> updatePeriodToOnDemand =
        genForupdatePeriodToOnDemand();

    private static HttpRequestDef<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> genForupdatePeriodToOnDemand() {
        // basic
        HttpRequestDef.Builder<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdatePeriodToOnDemandRequest.class, UpdatePeriodToOnDemandResponse.class)
            .withName("UpdatePeriodToOnDemand")
            .withUri("/v2/orders/subscriptions/resources/to-on-demand")
            .withContentType("application/json");

        // requests
        builder.<PeriodToOnDemandReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PeriodToOnDemandReq.class),
            f -> f.withMarshaller(UpdatePeriodToOnDemandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubCustomerBudgetRequest, UpdateSubCustomerBudgetResponse> updateSubCustomerBudget =
        genForupdateSubCustomerBudget();

    private static HttpRequestDef<UpdateSubCustomerBudgetRequest, UpdateSubCustomerBudgetResponse> genForupdateSubCustomerBudget() {
        // basic
        HttpRequestDef.Builder<UpdateSubCustomerBudgetRequest, UpdateSubCustomerBudgetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSubCustomerBudgetRequest.class, UpdateSubCustomerBudgetResponse.class)
            .withName("UpdateSubCustomerBudget")
            .withUri("/v2/partners/sub-customers/budget")
            .withContentType("application/json");

        // requests
        builder.<ModSubCustomerBudgetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModSubCustomerBudgetReq.class),
            f -> f.withMarshaller(UpdateSubCustomerBudgetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

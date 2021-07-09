package com.huaweicloud.sdk.bss.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.bss.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class BssMeta {

    public static final HttpRequestDef<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> autoRenewalResources = genForautoRenewalResources();

    private static HttpRequestDef<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> genForautoRenewalResources() {
        // basic
        HttpRequestDef.Builder<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AutoRenewalResourcesRequest.class, AutoRenewalResourcesResponse.class)
                .withName("AutoRenewalResources")
                .withUri("/v2/orders/subscriptions/resources/autorenew/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AutoRenewalResourcesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchSetSubCustomerDiscountRequest, BatchSetSubCustomerDiscountResponse> batchSetSubCustomerDiscount = genForbatchSetSubCustomerDiscount();

    private static HttpRequestDef<BatchSetSubCustomerDiscountRequest, BatchSetSubCustomerDiscountResponse> genForbatchSetSubCustomerDiscount() {
        // basic
        HttpRequestDef.Builder<BatchSetSubCustomerDiscountRequest, BatchSetSubCustomerDiscountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSetSubCustomerDiscountRequest.class, BatchSetSubCustomerDiscountResponse.class)
                .withName("BatchSetSubCustomerDiscount")
                .withUri("/v2/partners/discounts")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SetPartnerDiscountsReq.class,
            f -> f.withMarshaller(BatchSetSubCustomerDiscountRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> cancelAutoRenewalResources = genForcancelAutoRenewalResources();

    private static HttpRequestDef<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> genForcancelAutoRenewalResources() {
        // basic
        HttpRequestDef.Builder<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelAutoRenewalResourcesRequest.class, CancelAutoRenewalResourcesResponse.class)
                .withName("CancelAutoRenewalResources")
                .withUri("/v2/orders/subscriptions/resources/autorenew/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelAutoRenewalResourcesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CancelCustomerOrderRequest, CancelCustomerOrderResponse> cancelCustomerOrder = genForcancelCustomerOrder();

    private static HttpRequestDef<CancelCustomerOrderRequest, CancelCustomerOrderResponse> genForcancelCustomerOrder() {
        // basic
        HttpRequestDef.Builder<CancelCustomerOrderRequest, CancelCustomerOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CancelCustomerOrderRequest.class, CancelCustomerOrderResponse.class)
                .withName("CancelCustomerOrder")
                .withUri("/v2/orders/customer-orders/cancel")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CancelCustomerOrderReq.class,
            f -> f.withMarshaller(CancelCustomerOrderRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> cancelResourcesSubscription = genForcancelResourcesSubscription();

    private static HttpRequestDef<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> genForcancelResourcesSubscription() {
        // basic
        HttpRequestDef.Builder<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelResourcesSubscriptionRequest.class, CancelResourcesSubscriptionResponse.class)
                .withName("CancelResourcesSubscription")
                .withUri("/v2/orders/subscriptions/resources/unsubscribe")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UnsubscribeResourcesReq.class,
            f -> f.withMarshaller(CancelResourcesSubscriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthentication = genForchangeEnterpriseRealnameAuthentication();

    private static HttpRequestDef<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> genForchangeEnterpriseRealnameAuthentication() {
        // basic
        HttpRequestDef.Builder<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeEnterpriseRealnameAuthenticationRequest.class, ChangeEnterpriseRealnameAuthenticationResponse.class)
                .withName("ChangeEnterpriseRealnameAuthentication")
                .withUri("/v2/customers/realname-auths/enterprise")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ChangeEnterpriseRealnameAuthsReq.class,
            f -> f.withMarshaller(ChangeEnterpriseRealnameAuthenticationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CheckUserIdentityRequest, CheckUserIdentityResponse> checkUserIdentity = genForcheckUserIdentity();

    private static HttpRequestDef<CheckUserIdentityRequest, CheckUserIdentityResponse> genForcheckUserIdentity() {
        // basic
        HttpRequestDef.Builder<CheckUserIdentityRequest, CheckUserIdentityResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckUserIdentityRequest.class, CheckUserIdentityResponse.class)
                .withName("CheckUserIdentity")
                .withUri("/v2/partners/sub-customers/users/check-identity")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CheckSubcustomerUserReq.class,
            f -> f.withMarshaller(CheckUserIdentityRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateEnterpriseProjectAuthRequest, CreateEnterpriseProjectAuthResponse> createEnterpriseProjectAuth = genForcreateEnterpriseProjectAuth();

    private static HttpRequestDef<CreateEnterpriseProjectAuthRequest, CreateEnterpriseProjectAuthResponse> genForcreateEnterpriseProjectAuth() {
        // basic
        HttpRequestDef.Builder<CreateEnterpriseProjectAuthRequest, CreateEnterpriseProjectAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnterpriseProjectAuthRequest.class, CreateEnterpriseProjectAuthResponse.class)
                .withName("CreateEnterpriseProjectAuth")
                .withUri("/v2/enterprises/enterprise-projects/authority")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthentication = genForcreateEnterpriseRealnameAuthentication();

    private static HttpRequestDef<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> genForcreateEnterpriseRealnameAuthentication() {
        // basic
        HttpRequestDef.Builder<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnterpriseRealnameAuthenticationRequest.class, CreateEnterpriseRealnameAuthenticationResponse.class)
                .withName("CreateEnterpriseRealnameAuthentication")
                .withUri("/v2/customers/realname-auths/enterprise")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApplyEnterpriseRealnameAuthsReq.class,
            f -> f.withMarshaller(CreateEnterpriseRealnameAuthenticationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePartnerCouponsRequest, CreatePartnerCouponsResponse> createPartnerCoupons = genForcreatePartnerCoupons();

    private static HttpRequestDef<CreatePartnerCouponsRequest, CreatePartnerCouponsResponse> genForcreatePartnerCoupons() {
        // basic
        HttpRequestDef.Builder<CreatePartnerCouponsRequest, CreatePartnerCouponsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePartnerCouponsRequest.class, CreatePartnerCouponsResponse.class)
                .withName("CreatePartnerCoupons")
                .withUri("/v2/promotions/benefits/partner-coupons")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePartnerCouponsReq.class,
            f -> f.withMarshaller(CreatePartnerCouponsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> createPersonalRealnameAuth = genForcreatePersonalRealnameAuth();

    private static HttpRequestDef<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> genForcreatePersonalRealnameAuth() {
        // basic
        HttpRequestDef.Builder<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePersonalRealnameAuthRequest.class, CreatePersonalRealnameAuthResponse.class)
                .withName("CreatePersonalRealnameAuth")
                .withUri("/v2/customers/realname-auths/individual")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApplyIndividualRealnameAuthsReq.class,
            f -> f.withMarshaller(CreatePersonalRealnameAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePostalRequest, CreatePostalResponse> createPostal = genForcreatePostal();

    private static HttpRequestDef<CreatePostalRequest, CreatePostalResponse> genForcreatePostal() {
        // basic
        HttpRequestDef.Builder<CreatePostalRequest, CreatePostalResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostalRequest.class, CreatePostalResponse.class)
                .withName("CreatePostal")
                .withUri("/v2/customers/postal-addresses")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePostalRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddPostalReq.class,
            f -> f.withMarshaller(CreatePostalRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSubCustomerRequest, CreateSubCustomerResponse> createSubCustomer = genForcreateSubCustomer();

    private static HttpRequestDef<CreateSubCustomerRequest, CreateSubCustomerResponse> genForcreateSubCustomer() {
        // basic
        HttpRequestDef.Builder<CreateSubCustomerRequest, CreateSubCustomerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubCustomerRequest.class, CreateSubCustomerResponse.class)
                .withName("CreateSubCustomer")
                .withUri("/v2/partners/sub-customers")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateCustomerV2Req.class,
            f -> f.withMarshaller(CreateSubCustomerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSubEnterpriseAccountRequest, CreateSubEnterpriseAccountResponse> createSubEnterpriseAccount = genForcreateSubEnterpriseAccount();

    private static HttpRequestDef<CreateSubEnterpriseAccountRequest, CreateSubEnterpriseAccountResponse> genForcreateSubEnterpriseAccount() {
        // basic
        HttpRequestDef.Builder<CreateSubEnterpriseAccountRequest, CreateSubEnterpriseAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubEnterpriseAccountRequest.class, CreateSubEnterpriseAccountResponse.class)
                .withName("CreateSubEnterpriseAccount")
                .withUri("/v2/enterprises/multi-accounts/sub-customers")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSubCustomerReqV2.class,
            f -> f.withMarshaller(CreateSubEnterpriseAccountRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeletePostalRequest, DeletePostalResponse> deletePostal = genFordeletePostal();

    private static HttpRequestDef<DeletePostalRequest, DeletePostalResponse> genFordeletePostal() {
        // basic
        HttpRequestDef.Builder<DeletePostalRequest, DeletePostalResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePostalRequest.class, DeletePostalResponse.class)
                .withName("DeletePostal")
                .withUri("/v2/customers/postal-addresses/{address_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("address_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePostalRequest::getAddressId, (req, v) -> {
                req.setAddressId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCitiesRequest, ListCitiesResponse> listCities = genForlistCities();

    private static HttpRequestDef<ListCitiesRequest, ListCitiesResponse> genForlistCities() {
        // basic
        HttpRequestDef.Builder<ListCitiesRequest, ListCitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCitiesRequest.class, ListCitiesResponse.class)
                .withName("ListCities")
                .withUri("/v2/systems/configs/cities")
                .withContentType("application/json");

        // requests
        builder.withRequestField("province_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCitiesRequest::getProvinceCode, (req, v) -> {
                req.setProvinceCode(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCitiesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCitiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCitiesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListConversionsRequest, ListConversionsResponse> listConversions = genForlistConversions();

    private static HttpRequestDef<ListConversionsRequest, ListConversionsResponse> genForlistConversions() {
        // basic
        HttpRequestDef.Builder<ListConversionsRequest, ListConversionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConversionsRequest.class, ListConversionsResponse.class)
                .withName("ListConversions")
                .withUri("/v2/bases/conversions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("measure_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListConversionsRequest::getMeasureType, (req, v) -> {
                req.setMeasureType(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListConversionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCountiesRequest, ListCountiesResponse> listCounties = genForlistCounties();

    private static HttpRequestDef<ListCountiesRequest, ListCountiesResponse> genForlistCounties() {
        // basic
        HttpRequestDef.Builder<ListCountiesRequest, ListCountiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCountiesRequest.class, ListCountiesResponse.class)
                .withName("ListCounties")
                .withUri("/v2/systems/configs/counties")
                .withContentType("application/json");

        // requests
        builder.withRequestField("city_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCountiesRequest::getCityCode, (req, v) -> {
                req.setCityCode(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCountiesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCountiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCountiesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCouponQuotasRecordsRequest, ListCouponQuotasRecordsResponse> listCouponQuotasRecords = genForlistCouponQuotasRecords();

    private static HttpRequestDef<ListCouponQuotasRecordsRequest, ListCouponQuotasRecordsResponse> genForlistCouponQuotasRecords() {
        // basic
        HttpRequestDef.Builder<ListCouponQuotasRecordsRequest, ListCouponQuotasRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCouponQuotasRecordsRequest.class, ListCouponQuotasRecordsResponse.class)
                .withName("ListCouponQuotasRecords")
                .withUri("/v2/partners/coupon-quotas/records")
                .withContentType("application/json");

        // requests
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );
        builder.withRequestField("quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getQuotaId, (req, v) -> {
                req.setQuotaId(v);
            })
        );
        builder.withRequestField("operation_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getOperationTimeBegin, (req, v) -> {
                req.setOperationTimeBegin(v);
            })
        );
        builder.withRequestField("operation_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getOperationTimeEnd, (req, v) -> {
                req.setOperationTimeEnd(v);
            })
        );
        builder.withRequestField("parent_quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getParentQuotaId, (req, v) -> {
                req.setParentQuotaId(v);
            })
        );
        builder.withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getOperationType, (req, v) -> {
                req.setOperationType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerBillsFeeRecordsRequest, ListCustomerBillsFeeRecordsResponse> listCustomerBillsFeeRecords = genForlistCustomerBillsFeeRecords();

    private static HttpRequestDef<ListCustomerBillsFeeRecordsRequest, ListCustomerBillsFeeRecordsResponse> genForlistCustomerBillsFeeRecords() {
        // basic
        HttpRequestDef.Builder<ListCustomerBillsFeeRecordsRequest, ListCustomerBillsFeeRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomerBillsFeeRecordsRequest.class, ListCustomerBillsFeeRecordsResponse.class)
                .withName("ListCustomerBillsFeeRecords")
                .withUri("/v2/bills/customer-bills/fee-records")
                .withContentType("application/json");

        // requests
        builder.withRequestField("bill_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getBillCycle, (req, v) -> {
                req.setBillCycle(v);
            })
        );
        builder.withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getProviderType, (req, v) -> {
                req.setProviderType(v);
            })
        );
        builder.withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getServiceTypeCode, (req, v) -> {
                req.setServiceTypeCode(v);
            })
        );
        builder.withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getResourceTypeCode, (req, v) -> {
                req.setResourceTypeCode(v);
            })
        );
        builder.withRequestField("region_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getRegionCode, (req, v) -> {
                req.setRegionCode(v);
            })
        );
        builder.withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getChargingMode, (req, v) -> {
                req.setChargingMode(v);
            })
        );
        builder.withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getBillType, (req, v) -> {
                req.setBillType(v);
            })
        );
        builder.withRequestField("trade_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getTradeId, (req, v) -> {
                req.setTradeId(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("include_zero_record",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getIncludeZeroRecord, (req, v) -> {
                req.setIncludeZeroRecord(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getMethod, (req, v) -> {
                req.setMethod(v);
            })
        );
        builder.withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerBillsMonthlyBreakDownRequest, ListCustomerBillsMonthlyBreakDownResponse> listCustomerBillsMonthlyBreakDown = genForlistCustomerBillsMonthlyBreakDown();

    private static HttpRequestDef<ListCustomerBillsMonthlyBreakDownRequest, ListCustomerBillsMonthlyBreakDownResponse> genForlistCustomerBillsMonthlyBreakDown() {
        // basic
        HttpRequestDef.Builder<ListCustomerBillsMonthlyBreakDownRequest, ListCustomerBillsMonthlyBreakDownResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomerBillsMonthlyBreakDownRequest.class, ListCustomerBillsMonthlyBreakDownResponse.class)
                .withName("ListCustomerBillsMonthlyBreakDown")
                .withUri("/v2/costs/cost-analysed-bills/monthly-breakdown")
                .withContentType("application/json");

        // requests
        builder.withRequestField("shared_month",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getSharedMonth, (req, v) -> {
                req.setSharedMonth(v);
            })
        );
        builder.withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getChargingMode, (req, v) -> {
                req.setChargingMode(v);
            })
        );
        builder.withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getServiceTypeCode, (req, v) -> {
                req.setServiceTypeCode(v);
            })
        );
        builder.withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getResourceTypeCode, (req, v) -> {
                req.setResourceTypeCode(v);
            })
        );
        builder.withRequestField("region_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getRegionCode, (req, v) -> {
                req.setRegionCode(v);
            })
        );
        builder.withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getBillType, (req, v) -> {
                req.setBillType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );
        builder.withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getMethod, (req, v) -> {
                req.setMethod(v);
            })
        );
        builder.withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResources = genForlistCustomerOnDemandResources();

    private static HttpRequestDef<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> genForlistCustomerOnDemandResources() {
        // basic
        HttpRequestDef.Builder<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCustomerOnDemandResourcesRequest.class, ListCustomerOnDemandResourcesResponse.class)
                .withName("ListCustomerOnDemandResources")
                .withUri("/v2/partners/sub-customers/on-demand-resources/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOnDemandResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryCustomerOnDemandResourcesReq.class,
            f -> f.withMarshaller(ListCustomerOnDemandResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerOrdersRequest, ListCustomerOrdersResponse> listCustomerOrders = genForlistCustomerOrders();

    private static HttpRequestDef<ListCustomerOrdersRequest, ListCustomerOrdersResponse> genForlistCustomerOrders() {
        // basic
        HttpRequestDef.Builder<ListCustomerOrdersRequest, ListCustomerOrdersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomerOrdersRequest.class, ListCustomerOrdersResponse.class)
                .withName("ListCustomerOrders")
                .withUri("/v2/orders/customer-orders")
                .withContentType("application/json");

        // requests
        builder.withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            })
        );
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );
        builder.withRequestField("create_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getCreateTimeBegin, (req, v) -> {
                req.setCreateTimeBegin(v);
            })
        );
        builder.withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getCreateTimeEnd, (req, v) -> {
                req.setCreateTimeEnd(v);
            })
        );
        builder.withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getServiceTypeCode, (req, v) -> {
                req.setServiceTypeCode(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOrderType, (req, v) -> {
                req.setOrderType(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            })
        );
        builder.withRequestField("payment_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getPaymentTimeBegin, (req, v) -> {
                req.setPaymentTimeBegin(v);
            })
        );
        builder.withRequestField("payment_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getPaymentTimeEnd, (req, v) -> {
                req.setPaymentTimeEnd(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerOrdersRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCustomersBalancesDetailRequest, ListCustomersBalancesDetailResponse> listCustomersBalancesDetail = genForlistCustomersBalancesDetail();

    private static HttpRequestDef<ListCustomersBalancesDetailRequest, ListCustomersBalancesDetailResponse> genForlistCustomersBalancesDetail() {
        // basic
        HttpRequestDef.Builder<ListCustomersBalancesDetailRequest, ListCustomersBalancesDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCustomersBalancesDetailRequest.class, ListCustomersBalancesDetailResponse.class)
                .withName("ListCustomersBalancesDetail")
                .withUri("/v2/accounts/customer-accounts/balances/batch-query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryCustomersBalancesReq.class,
            f -> f.withMarshaller(ListCustomersBalancesDetailRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetails = genForlistCustomerselfResourceRecordDetails();

    private static HttpRequestDef<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> genForlistCustomerselfResourceRecordDetails() {
        // basic
        HttpRequestDef.Builder<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCustomerselfResourceRecordDetailsRequest.class, ListCustomerselfResourceRecordDetailsResponse.class)
                .withName("ListCustomerselfResourceRecordDetails")
                .withUri("/v2/bills/customer-bills/res-records/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryResRecordsDetailReq.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordDetailsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecords = genForlistCustomerselfResourceRecords();

    private static HttpRequestDef<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> genForlistCustomerselfResourceRecords() {
        // basic
        HttpRequestDef.Builder<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomerselfResourceRecordsRequest.class, ListCustomerselfResourceRecordsResponse.class)
                .withName("ListCustomerselfResourceRecords")
                .withUri("/v2/bills/customer-bills/res-fee-records")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            })
        );
        builder.withRequestField("cloud_service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getCloudServiceType, (req, v) -> {
                req.setCloudServiceType(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getChargeMode, (req, v) -> {
                req.setChargeMode(v);
            })
        );
        builder.withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getBillType, (req, v) -> {
                req.setBillType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("include_zero_record",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getIncludeZeroRecord, (req, v) -> {
                req.setIncludeZeroRecord(v);
            })
        );
        builder.withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getMethod, (req, v) -> {
                req.setMethod(v);
            })
        );
        builder.withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            })
        );
        builder.withRequestField("trade_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getTradeId, (req, v) -> {
                req.setTradeId(v);
            })
        );
        builder.withRequestField("bill_date_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getBillDateBegin, (req, v) -> {
                req.setBillDateBegin(v);
            })
        );
        builder.withRequestField("bill_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getBillDateEnd, (req, v) -> {
                req.setBillDateEnd(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseMultiAccountRequest, ListEnterpriseMultiAccountResponse> listEnterpriseMultiAccount = genForlistEnterpriseMultiAccount();

    private static HttpRequestDef<ListEnterpriseMultiAccountRequest, ListEnterpriseMultiAccountResponse> genForlistEnterpriseMultiAccount() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseMultiAccountRequest, ListEnterpriseMultiAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnterpriseMultiAccountRequest.class, ListEnterpriseMultiAccountResponse.class)
                .withName("ListEnterpriseMultiAccount")
                .withUri("/v2/enterprises/multi-accounts/retrieve-amount")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEnterpriseMultiAccountRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            })
        );
        builder.withRequestField("balance_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEnterpriseMultiAccountRequest::getBalanceType, (req, v) -> {
                req.setBalanceType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnterpriseMultiAccountRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnterpriseMultiAccountRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseOrganizationsRequest, ListEnterpriseOrganizationsResponse> listEnterpriseOrganizations = genForlistEnterpriseOrganizations();

    private static HttpRequestDef<ListEnterpriseOrganizationsRequest, ListEnterpriseOrganizationsResponse> genForlistEnterpriseOrganizations() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseOrganizationsRequest, ListEnterpriseOrganizationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnterpriseOrganizationsRequest.class, ListEnterpriseOrganizationsResponse.class)
                .withName("ListEnterpriseOrganizations")
                .withUri("/v2/enterprises/multi-accounts/enterprise-organizations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("recursive_query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnterpriseOrganizationsRequest::getRecursiveQuery, (req, v) -> {
                req.setRecursiveQuery(v);
            })
        );
        builder.withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnterpriseOrganizationsRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseSubCustomersRequest, ListEnterpriseSubCustomersResponse> listEnterpriseSubCustomers = genForlistEnterpriseSubCustomers();

    private static HttpRequestDef<ListEnterpriseSubCustomersRequest, ListEnterpriseSubCustomersResponse> genForlistEnterpriseSubCustomers() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseSubCustomersRequest, ListEnterpriseSubCustomersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnterpriseSubCustomersRequest.class, ListEnterpriseSubCustomersResponse.class)
                .withName("ListEnterpriseSubCustomers")
                .withUri("/v2/enterprises/multi-accounts/sub-customers")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sub_customer_account_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getSubCustomerAccountName, (req, v) -> {
                req.setSubCustomerAccountName(v);
            })
        );
        builder.withRequestField("sub_customer_display_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getSubCustomerDisplayName, (req, v) -> {
                req.setSubCustomerDisplayName(v);
            })
        );
        builder.withRequestField("fuzzy_query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getFuzzyQuery, (req, v) -> {
                req.setFuzzyQuery(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("org_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getOrgId, (req, v) -> {
                req.setOrgId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> listFreeResourceUsages = genForlistFreeResourceUsages();

    private static HttpRequestDef<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> genForlistFreeResourceUsages() {
        // basic
        HttpRequestDef.Builder<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListFreeResourceUsagesRequest.class, ListFreeResourceUsagesResponse.class)
                .withName("ListFreeResourceUsages")
                .withUri("/v2/payments/free-resources/usages/details/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFreeResourceUsagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListFreeResourceUsagesReq.class,
            f -> f.withMarshaller(ListFreeResourceUsagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListFreeResourcesRequest, ListFreeResourcesResponse> listFreeResources = genForlistFreeResources();

    private static HttpRequestDef<ListFreeResourcesRequest, ListFreeResourcesResponse> genForlistFreeResources() {
        // basic
        HttpRequestDef.Builder<ListFreeResourcesRequest, ListFreeResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListFreeResourcesRequest.class, ListFreeResourcesResponse.class)
                .withName("ListFreeResources")
                .withUri("/v2/payments/free-resources/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFreeResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListFreeResourcesReq.class,
            f -> f.withMarshaller(ListFreeResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListIndirectPartnersRequest, ListIndirectPartnersResponse> listIndirectPartners = genForlistIndirectPartners();

    private static HttpRequestDef<ListIndirectPartnersRequest, ListIndirectPartnersResponse> genForlistIndirectPartners() {
        // basic
        HttpRequestDef.Builder<ListIndirectPartnersRequest, ListIndirectPartnersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIndirectPartnersRequest.class, ListIndirectPartnersResponse.class)
                .withName("ListIndirectPartners")
                .withUri("/v2/partners/indirect-partners/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryIndirectPartnersReq.class,
            f -> f.withMarshaller(ListIndirectPartnersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListIssuedCouponQuotasRequest, ListIssuedCouponQuotasResponse> listIssuedCouponQuotas = genForlistIssuedCouponQuotas();

    private static HttpRequestDef<ListIssuedCouponQuotasRequest, ListIssuedCouponQuotasResponse> genForlistIssuedCouponQuotas() {
        // basic
        HttpRequestDef.Builder<ListIssuedCouponQuotasRequest, ListIssuedCouponQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIssuedCouponQuotasRequest.class, ListIssuedCouponQuotasResponse.class)
                .withName("ListIssuedCouponQuotas")
                .withUri("/v2/partners/issued-coupon-quotas")
                .withContentType("application/json");

        // requests
        builder.withRequestField("quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getQuotaId, (req, v) -> {
                req.setQuotaId(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );
        builder.withRequestField("parent_quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getParentQuotaId, (req, v) -> {
                req.setParentQuotaId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListIssuedPartnerCouponsRequest, ListIssuedPartnerCouponsResponse> listIssuedPartnerCoupons = genForlistIssuedPartnerCoupons();

    private static HttpRequestDef<ListIssuedPartnerCouponsRequest, ListIssuedPartnerCouponsResponse> genForlistIssuedPartnerCoupons() {
        // basic
        HttpRequestDef.Builder<ListIssuedPartnerCouponsRequest, ListIssuedPartnerCouponsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIssuedPartnerCouponsRequest.class, ListIssuedPartnerCouponsResponse.class)
                .withName("ListIssuedPartnerCoupons")
                .withUri("/v2/promotions/benefits/partner-coupons")
                .withContentType("application/json");

        // requests
        builder.withRequestField("coupon_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCouponId, (req, v) -> {
                req.setCouponId(v);
            })
        );
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );
        builder.withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            })
        );
        builder.withRequestField("coupon_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCouponType, (req, v) -> {
                req.setCouponType(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("create_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCreateTimeBegin, (req, v) -> {
                req.setCreateTimeBegin(v);
            })
        );
        builder.withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCreateTimeEnd, (req, v) -> {
                req.setCreateTimeEnd(v);
            })
        );
        builder.withRequestField("effective_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getEffectiveTimeBegin, (req, v) -> {
                req.setEffectiveTimeBegin(v);
            })
        );
        builder.withRequestField("effective_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getEffectiveTimeEnd, (req, v) -> {
                req.setEffectiveTimeEnd(v);
            })
        );
        builder.withRequestField("expire_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getExpireTimeBegin, (req, v) -> {
                req.setExpireTimeBegin(v);
            })
        );
        builder.withRequestField("expire_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getExpireTimeEnd, (req, v) -> {
                req.setExpireTimeEnd(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMeasureUnitsRequest, ListMeasureUnitsResponse> listMeasureUnits = genForlistMeasureUnits();

    private static HttpRequestDef<ListMeasureUnitsRequest, ListMeasureUnitsResponse> genForlistMeasureUnits() {
        // basic
        HttpRequestDef.Builder<ListMeasureUnitsRequest, ListMeasureUnitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMeasureUnitsRequest.class, ListMeasureUnitsResponse.class)
                .withName("ListMeasureUnits")
                .withUri("/v2/bases/measurements")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMeasureUnitsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> listOnDemandResourceRatings = genForlistOnDemandResourceRatings();

    private static HttpRequestDef<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> genForlistOnDemandResourceRatings() {
        // basic
        HttpRequestDef.Builder<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListOnDemandResourceRatingsRequest.class, ListOnDemandResourceRatingsResponse.class)
                .withName("ListOnDemandResourceRatings")
                .withUri("/v2/bills/ratings/on-demand-resources")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RateOnDemandReq.class,
            f -> f.withMarshaller(ListOnDemandResourceRatingsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderId = genForlistOrderCouponsByOrderId();

    private static HttpRequestDef<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse> genForlistOrderCouponsByOrderId() {
        // basic
        HttpRequestDef.Builder<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOrderCouponsByOrderIdRequest.class, ListOrderCouponsByOrderIdResponse.class)
                .withName("ListOrderCouponsByOrderId")
                .withUri("/v2/orders/customer-orders/order-coupons")
                .withContentType("application/json");

        // requests
        builder.withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListOrderCouponsByOrderIdRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListOrderDiscountsRequest, ListOrderDiscountsResponse> listOrderDiscounts = genForlistOrderDiscounts();

    private static HttpRequestDef<ListOrderDiscountsRequest, ListOrderDiscountsResponse> genForlistOrderDiscounts() {
        // basic
        HttpRequestDef.Builder<ListOrderDiscountsRequest, ListOrderDiscountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOrderDiscountsRequest.class, ListOrderDiscountsResponse.class)
                .withName("ListOrderDiscounts")
                .withUri("/v2/orders/customer-orders/order-discounts")
                .withContentType("application/json");

        // requests
        builder.withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListOrderDiscountsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPartnerAdjustRecordsRequest, ListPartnerAdjustRecordsResponse> listPartnerAdjustRecords = genForlistPartnerAdjustRecords();

    private static HttpRequestDef<ListPartnerAdjustRecordsRequest, ListPartnerAdjustRecordsResponse> genForlistPartnerAdjustRecords() {
        // basic
        HttpRequestDef.Builder<ListPartnerAdjustRecordsRequest, ListPartnerAdjustRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPartnerAdjustRecordsRequest.class, ListPartnerAdjustRecordsResponse.class)
                .withName("ListPartnerAdjustRecords")
                .withUri("/v2/accounts/partner-accounts/adjust-records")
                .withContentType("application/json");

        // requests
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );
        builder.withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getOperationType, (req, v) -> {
                req.setOperationType(v);
            })
        );
        builder.withRequestField("operation_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getOperationTimeBegin, (req, v) -> {
                req.setOperationTimeBegin(v);
            })
        );
        builder.withRequestField("operation_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getOperationTimeEnd, (req, v) -> {
                req.setOperationTimeEnd(v);
            })
        );
        builder.withRequestField("trans_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getTransId, (req, v) -> {
                req.setTransId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPartnerBalancesRequest, ListPartnerBalancesResponse> listPartnerBalances = genForlistPartnerBalances();

    private static HttpRequestDef<ListPartnerBalancesRequest, ListPartnerBalancesResponse> genForlistPartnerBalances() {
        // basic
        HttpRequestDef.Builder<ListPartnerBalancesRequest, ListPartnerBalancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPartnerBalancesRequest.class, ListPartnerBalancesResponse.class)
                .withName("ListPartnerBalances")
                .withUri("/v2/accounts/partner-accounts/balances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerBalancesRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPartnerCouponsRecordRequest, ListPartnerCouponsRecordResponse> listPartnerCouponsRecord = genForlistPartnerCouponsRecord();

    private static HttpRequestDef<ListPartnerCouponsRecordRequest, ListPartnerCouponsRecordResponse> genForlistPartnerCouponsRecord() {
        // basic
        HttpRequestDef.Builder<ListPartnerCouponsRecordRequest, ListPartnerCouponsRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPartnerCouponsRecordRequest.class, ListPartnerCouponsRecordResponse.class)
                .withName("ListPartnerCouponsRecord")
                .withUri("/v2/promotions/benefits/partner-coupons/records/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("operation_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getOperationTypes, (req, v) -> {
                req.setOperationTypes(v);
            })
        );
        builder.withRequestField("quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getQuotaId, (req, v) -> {
                req.setQuotaId(v);
            })
        );
        builder.withRequestField("quota_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getQuotaType, (req, v) -> {
                req.setQuotaType(v);
            })
        );
        builder.withRequestField("coupon_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getCouponIds, (req, v) -> {
                req.setCouponIds(v);
            })
        );
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );
        builder.withRequestField("operation_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getOperationTimeBegin, (req, v) -> {
                req.setOperationTimeBegin(v);
            })
        );
        builder.withRequestField("operation_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getOperationTimeEnd, (req, v) -> {
                req.setOperationTimeEnd(v);
            })
        );
        builder.withRequestField("result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getResult, (req, v) -> {
                req.setResult(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResources = genForlistPayPerUseCustomerResources();

    private static HttpRequestDef<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> genForlistPayPerUseCustomerResources() {
        // basic
        HttpRequestDef.Builder<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListPayPerUseCustomerResourcesRequest.class, ListPayPerUseCustomerResourcesResponse.class)
                .withName("ListPayPerUseCustomerResources")
                .withUri("/v2/orders/suscriptions/resources/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryResourcesReq.class,
            f -> f.withMarshaller(ListPayPerUseCustomerResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPostalAddressRequest, ListPostalAddressResponse> listPostalAddress = genForlistPostalAddress();

    private static HttpRequestDef<ListPostalAddressRequest, ListPostalAddressResponse> genForlistPostalAddress() {
        // basic
        HttpRequestDef.Builder<ListPostalAddressRequest, ListPostalAddressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPostalAddressRequest.class, ListPostalAddressResponse.class)
                .withName("ListPostalAddress")
                .withUri("/v2/customers/postal-addresses")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPostalAddressRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPostalAddressRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListProvincesRequest, ListProvincesResponse> listProvinces = genForlistProvinces();

    private static HttpRequestDef<ListProvincesRequest, ListProvincesResponse> genForlistProvinces() {
        // basic
        HttpRequestDef.Builder<ListProvincesRequest, ListProvincesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProvincesRequest.class, ListProvincesResponse.class)
                .withName("ListProvinces")
                .withUri("/v2/systems/configs/provinces")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProvincesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProvincesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProvincesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaCouponsRequest, ListQuotaCouponsResponse> listQuotaCoupons = genForlistQuotaCoupons();

    private static HttpRequestDef<ListQuotaCouponsRequest, ListQuotaCouponsResponse> genForlistQuotaCoupons() {
        // basic
        HttpRequestDef.Builder<ListQuotaCouponsRequest, ListQuotaCouponsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQuotaCouponsRequest.class, ListQuotaCouponsResponse.class)
                .withName("ListQuotaCoupons")
                .withUri("/v2/partners/coupon-quotas/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryCouponQuotasReqExt.class,
            f -> f.withMarshaller(ListQuotaCouponsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> listRateOnPeriodDetail = genForlistRateOnPeriodDetail();

    private static HttpRequestDef<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> genForlistRateOnPeriodDetail() {
        // basic
        HttpRequestDef.Builder<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListRateOnPeriodDetailRequest.class, ListRateOnPeriodDetailResponse.class)
                .withName("ListRateOnPeriodDetail")
                .withUri("/v2/bills/ratings/period-resources/subscribe-rate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RateOnPeriodReq.class,
            f -> f.withMarshaller(ListRateOnPeriodDetailRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTypesRequest, ListResourceTypesResponse> listResourceTypes = genForlistResourceTypes();

    private static HttpRequestDef<ListResourceTypesRequest, ListResourceTypesResponse> genForlistResourceTypes() {
        // basic
        HttpRequestDef.Builder<ListResourceTypesRequest, ListResourceTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTypesRequest.class, ListResourceTypesResponse.class)
                .withName("ListResourceTypes")
                .withUri("/v2/bases/resource-types")
                .withContentType("application/json");

        // requests
        builder.withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourceTypesRequest::getResourceTypeCode, (req, v) -> {
                req.setResourceTypeCode(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourceTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListResourceUsagesRequest, ListResourceUsagesResponse> listResourceUsages = genForlistResourceUsages();

    private static HttpRequestDef<ListResourceUsagesRequest, ListResourceUsagesResponse> genForlistResourceUsages() {
        // basic
        HttpRequestDef.Builder<ListResourceUsagesRequest, ListResourceUsagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourceUsagesRequest.class, ListResourceUsagesResponse.class)
                .withName("ListResourceUsages")
                .withUri("/v2/payments/free-resources/usages/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourceUsagesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListServiceResourcesRequest, ListServiceResourcesResponse> listServiceResources = genForlistServiceResources();

    private static HttpRequestDef<ListServiceResourcesRequest, ListServiceResourcesResponse> genForlistServiceResources() {
        // basic
        HttpRequestDef.Builder<ListServiceResourcesRequest, ListServiceResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceResourcesRequest.class, ListServiceResourcesResponse.class)
                .withName("ListServiceResources")
                .withUri("/v2/products/service-resources")
                .withContentType("application/json");

        // requests
        builder.withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListServiceResourcesRequest::getServiceTypeCode, (req, v) -> {
                req.setServiceTypeCode(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServiceResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServiceResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServiceResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListServiceTypesRequest, ListServiceTypesResponse> listServiceTypes = genForlistServiceTypes();

    private static HttpRequestDef<ListServiceTypesRequest, ListServiceTypesResponse> genForlistServiceTypes() {
        // basic
        HttpRequestDef.Builder<ListServiceTypesRequest, ListServiceTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceTypesRequest.class, ListServiceTypesResponse.class)
                .withName("ListServiceTypes")
                .withUri("/v2/bases/service-types")
                .withContentType("application/json");

        // requests
        builder.withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServiceTypesRequest::getServiceTypeCode, (req, v) -> {
                req.setServiceTypeCode(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServiceTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSkuInventoriesRequest, ListSkuInventoriesResponse> listSkuInventories = genForlistSkuInventories();

    private static HttpRequestDef<ListSkuInventoriesRequest, ListSkuInventoriesResponse> genForlistSkuInventories() {
        // basic
        HttpRequestDef.Builder<ListSkuInventoriesRequest, ListSkuInventoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSkuInventoriesRequest.class, ListSkuInventoriesResponse.class)
                .withName("ListSkuInventories")
                .withUri("/v2/orders/inventories/sku-inventories/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QuerySkuInventoriesReq.class,
            f -> f.withMarshaller(ListSkuInventoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> listSubCustomerCoupons = genForlistSubCustomerCoupons();

    private static HttpRequestDef<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> genForlistSubCustomerCoupons() {
        // basic
        HttpRequestDef.Builder<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubCustomerCouponsRequest.class, ListSubCustomerCouponsResponse.class)
                .withName("ListSubCustomerCoupons")
                .withUri("/v2/promotions/benefits/coupons")
                .withContentType("application/json");

        // requests
        builder.withRequestField("coupon_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getCouponId, (req, v) -> {
                req.setCouponId(v);
            })
        );
        builder.withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            })
        );
        builder.withRequestField("promotion_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getPromotionPlanId, (req, v) -> {
                req.setPromotionPlanId(v);
            })
        );
        builder.withRequestField("coupon_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getCouponType, (req, v) -> {
                req.setCouponType(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("active_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getActiveStartTime, (req, v) -> {
                req.setActiveStartTime(v);
            })
        );
        builder.withRequestField("active_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getActiveEndTime, (req, v) -> {
                req.setActiveEndTime(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("source_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomerDiscountsRequest, ListSubCustomerDiscountsResponse> listSubCustomerDiscounts = genForlistSubCustomerDiscounts();

    private static HttpRequestDef<ListSubCustomerDiscountsRequest, ListSubCustomerDiscountsResponse> genForlistSubCustomerDiscounts() {
        // basic
        HttpRequestDef.Builder<ListSubCustomerDiscountsRequest, ListSubCustomerDiscountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubCustomerDiscountsRequest.class, ListSubCustomerDiscountsResponse.class)
                .withName("ListSubCustomerDiscounts")
                .withUri("/v2/partners/discounts")
                .withContentType("application/json");

        // requests
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSubCustomerDiscountsRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerDiscountsRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomerResFeeRecordsRequest, ListSubCustomerResFeeRecordsResponse> listSubCustomerResFeeRecords = genForlistSubCustomerResFeeRecords();

    private static HttpRequestDef<ListSubCustomerResFeeRecordsRequest, ListSubCustomerResFeeRecordsResponse> genForlistSubCustomerResFeeRecords() {
        // basic
        HttpRequestDef.Builder<ListSubCustomerResFeeRecordsRequest, ListSubCustomerResFeeRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubCustomerResFeeRecordsRequest.class, ListSubCustomerResFeeRecordsResponse.class)
                .withName("ListSubCustomerResFeeRecords")
                .withUri("/v2/bills/partner-bills/subcustomer-bills/res-fee-records")
                .withContentType("application/json");

        // requests
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );
        builder.withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            })
        );
        builder.withRequestField("cloud_service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getCloudServiceType, (req, v) -> {
                req.setCloudServiceType(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getChargeMode, (req, v) -> {
                req.setChargeMode(v);
            })
        );
        builder.withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getBillType, (req, v) -> {
                req.setBillType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );
        builder.withRequestField("include_zero_record",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getIncludeZeroRecord, (req, v) -> {
                req.setIncludeZeroRecord(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );
        builder.withRequestField("bill_date_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getBillDateBegin, (req, v) -> {
                req.setBillDateBegin(v);
            })
        );
        builder.withRequestField("bill_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubCustomerResFeeRecordsRequest::getBillDateEnd, (req, v) -> {
                req.setBillDateEnd(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomers = genForlistSubCustomers();

    private static HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> genForlistSubCustomers() {
        // basic
        HttpRequestDef.Builder<ListSubCustomersRequest, ListSubCustomersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSubCustomersRequest.class, ListSubCustomersResponse.class)
                .withName("ListSubCustomers")
                .withUri("/v2/partners/sub-customers/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QuerySubCustomerListReq.class,
            f -> f.withMarshaller(ListSubCustomersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSubcustomerMonthlyBillsRequest, ListSubcustomerMonthlyBillsResponse> listSubcustomerMonthlyBills = genForlistSubcustomerMonthlyBills();

    private static HttpRequestDef<ListSubcustomerMonthlyBillsRequest, ListSubcustomerMonthlyBillsResponse> genForlistSubcustomerMonthlyBills() {
        // basic
        HttpRequestDef.Builder<ListSubcustomerMonthlyBillsRequest, ListSubcustomerMonthlyBillsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubcustomerMonthlyBillsRequest.class, ListSubcustomerMonthlyBillsResponse.class)
                .withName("ListSubcustomerMonthlyBills")
                .withUri("/v2/bills/partner-bills/subcustomer-bills/monthly-sum")
                .withContentType("application/json");

        // requests
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );
        builder.withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            })
        );
        builder.withRequestField("cloud_service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getCloudServiceType, (req, v) -> {
                req.setCloudServiceType(v);
            })
        );
        builder.withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getChargeMode, (req, v) -> {
                req.setChargeMode(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getBillType, (req, v) -> {
                req.setBillType(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListUsageTypesRequest, ListUsageTypesResponse> listUsageTypes = genForlistUsageTypes();

    private static HttpRequestDef<ListUsageTypesRequest, ListUsageTypesResponse> genForlistUsageTypes() {
        // basic
        HttpRequestDef.Builder<ListUsageTypesRequest, ListUsageTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsageTypesRequest.class, ListUsageTypesResponse.class)
                .withName("ListUsageTypes")
                .withUri("/v2/products/usage-types")
                .withContentType("application/json");

        // requests
        builder.withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsageTypesRequest::getResourceTypeCode, (req, v) -> {
                req.setResourceTypeCode(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListUsageTypesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListUsageTypesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsageTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

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
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PayCustomerOrderReq.class,
            f -> f.withMarshaller(PayOrdersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ReclaimCouponQuotasRequest, ReclaimCouponQuotasResponse> reclaimCouponQuotas = genForreclaimCouponQuotas();

    private static HttpRequestDef<ReclaimCouponQuotasRequest, ReclaimCouponQuotasResponse> genForreclaimCouponQuotas() {
        // basic
        HttpRequestDef.Builder<ReclaimCouponQuotasRequest, ReclaimCouponQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReclaimCouponQuotasRequest.class, ReclaimCouponQuotasResponse.class)
                .withName("ReclaimCouponQuotas")
                .withUri("/v2/partners/coupon-quotas/indirect-partner-reclaim")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ReclaimCouponQuotasReq.class,
            f -> f.withMarshaller(ReclaimCouponQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ReclaimIndirectPartnerAccountRequest, ReclaimIndirectPartnerAccountResponse> reclaimIndirectPartnerAccount = genForreclaimIndirectPartnerAccount();

    private static HttpRequestDef<ReclaimIndirectPartnerAccountRequest, ReclaimIndirectPartnerAccountResponse> genForreclaimIndirectPartnerAccount() {
        // basic
        HttpRequestDef.Builder<ReclaimIndirectPartnerAccountRequest, ReclaimIndirectPartnerAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReclaimIndirectPartnerAccountRequest.class, ReclaimIndirectPartnerAccountResponse.class)
                .withName("ReclaimIndirectPartnerAccount")
                .withUri("/v2/accounts/partner-accounts/indirect-partner-reclaim")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ReclaimIndirectPartnerAccountReq.class,
            f -> f.withMarshaller(ReclaimIndirectPartnerAccountRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ReclaimPartnerCouponsRequest, ReclaimPartnerCouponsResponse> reclaimPartnerCoupons = genForreclaimPartnerCoupons();

    private static HttpRequestDef<ReclaimPartnerCouponsRequest, ReclaimPartnerCouponsResponse> genForreclaimPartnerCoupons() {
        // basic
        HttpRequestDef.Builder<ReclaimPartnerCouponsRequest, ReclaimPartnerCouponsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReclaimPartnerCouponsRequest.class, ReclaimPartnerCouponsResponse.class)
                .withName("ReclaimPartnerCoupons")
                .withUri("/v2/promotions/benefits/partner-coupons/reclaim")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ReclaimPartnerCouponsReq.class,
            f -> f.withMarshaller(ReclaimPartnerCouponsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ReclaimSubEnterpriseAmountRequest, ReclaimSubEnterpriseAmountResponse> reclaimSubEnterpriseAmount = genForreclaimSubEnterpriseAmount();

    private static HttpRequestDef<ReclaimSubEnterpriseAmountRequest, ReclaimSubEnterpriseAmountResponse> genForreclaimSubEnterpriseAmount() {
        // basic
        HttpRequestDef.Builder<ReclaimSubEnterpriseAmountRequest, ReclaimSubEnterpriseAmountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReclaimSubEnterpriseAmountRequest.class, ReclaimSubEnterpriseAmountResponse.class)
                .withName("ReclaimSubEnterpriseAmount")
                .withUri("/v2/enterprises/multi-accounts/retrieve-amount")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RetrieveEnterpriseMultiAccountReq.class,
            f -> f.withMarshaller(ReclaimSubEnterpriseAmountRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ReclaimToPartnerAccountRequest, ReclaimToPartnerAccountResponse> reclaimToPartnerAccount = genForreclaimToPartnerAccount();

    private static HttpRequestDef<ReclaimToPartnerAccountRequest, ReclaimToPartnerAccountResponse> genForreclaimToPartnerAccount() {
        // basic
        HttpRequestDef.Builder<ReclaimToPartnerAccountRequest, ReclaimToPartnerAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReclaimToPartnerAccountRequest.class, ReclaimToPartnerAccountResponse.class)
                .withName("ReclaimToPartnerAccount")
                .withUri("/v2/accounts/partner-accounts/reclaim")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ReclaimToPartnerAccountBalancesReq.class,
            f -> f.withMarshaller(ReclaimToPartnerAccountRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RenewalResourcesRequest, RenewalResourcesResponse> renewalResources = genForrenewalResources();

    private static HttpRequestDef<RenewalResourcesRequest, RenewalResourcesResponse> genForrenewalResources() {
        // basic
        HttpRequestDef.Builder<RenewalResourcesRequest, RenewalResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RenewalResourcesRequest.class, RenewalResourcesResponse.class)
                .withName("RenewalResources")
                .withUri("/v2/orders/subscriptions/resources/renew")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RenewalResourcesReq.class,
            f -> f.withMarshaller(RenewalResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SendSmsVerificationCodeRequest, SendSmsVerificationCodeResponse> sendSmsVerificationCode = genForsendSmsVerificationCode();

    private static HttpRequestDef<SendSmsVerificationCodeRequest, SendSmsVerificationCodeResponse> genForsendSmsVerificationCode() {
        // basic
        HttpRequestDef.Builder<SendSmsVerificationCodeRequest, SendSmsVerificationCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendSmsVerificationCodeRequest.class, SendSmsVerificationCodeResponse.class)
                .withName("SendSmsVerificationCode")
                .withUri("/v2/enterprises/multi-accounts/sm-verification-code")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SendSmVerificationCodeReq.class,
            f -> f.withMarshaller(SendSmsVerificationCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> sendVerificationMessageCode = genForsendVerificationMessageCode();

    private static HttpRequestDef<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> genForsendVerificationMessageCode() {
        // basic
        HttpRequestDef.Builder<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendVerificationMessageCodeRequest.class, SendVerificationMessageCodeResponse.class)
                .withName("SendVerificationMessageCode")
                .withUri("/v2/bases/verificationcode/send")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SendVerificationCodeV2Req.class,
            f -> f.withMarshaller(SendVerificationMessageCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> showCustomerAccountBalances = genForshowCustomerAccountBalances();

    private static HttpRequestDef<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> genForshowCustomerAccountBalances() {
        // basic
        HttpRequestDef.Builder<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCustomerAccountBalancesRequest.class, ShowCustomerAccountBalancesResponse.class)
                .withName("ShowCustomerAccountBalances")
                .withUri("/v2/accounts/customer-accounts/balances")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse> showCustomerMonthlySum = genForshowCustomerMonthlySum();

    private static HttpRequestDef<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse> genForshowCustomerMonthlySum() {
        // basic
        HttpRequestDef.Builder<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCustomerMonthlySumRequest.class, ShowCustomerMonthlySumResponse.class)
                .withName("ShowCustomerMonthlySum")
                .withUri("/v2/bills/customer-bills/monthly-sum")
                .withContentType("application/json");

        // requests
        builder.withRequestField("bill_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getBillCycle, (req, v) -> {
                req.setBillCycle(v);
            })
        );
        builder.withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getServiceTypeCode, (req, v) -> {
                req.setServiceTypeCode(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getMethod, (req, v) -> {
                req.setMethod(v);
            })
        );
        builder.withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getSubCustomerId, (req, v) -> {
                req.setSubCustomerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> showCustomerOrderDetails = genForshowCustomerOrderDetails();

    private static HttpRequestDef<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> genForshowCustomerOrderDetails() {
        // basic
        HttpRequestDef.Builder<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCustomerOrderDetailsRequest.class, ShowCustomerOrderDetailsResponse.class)
                .withName("ShowCustomerOrderDetails")
                .withUri("/v2/orders/customer-orders/details/{order_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("order_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getIndirectPartnerId, (req, v) -> {
                req.setIndirectPartnerId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMultiAccountTransferAmountRequest, ShowMultiAccountTransferAmountResponse> showMultiAccountTransferAmount = genForshowMultiAccountTransferAmount();

    private static HttpRequestDef<ShowMultiAccountTransferAmountRequest, ShowMultiAccountTransferAmountResponse> genForshowMultiAccountTransferAmount() {
        // basic
        HttpRequestDef.Builder<ShowMultiAccountTransferAmountRequest, ShowMultiAccountTransferAmountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMultiAccountTransferAmountRequest.class, ShowMultiAccountTransferAmountResponse.class)
                .withName("ShowMultiAccountTransferAmount")
                .withUri("/v2/enterprises/multi-accounts/transfer-amount")
                .withContentType("application/json");

        // requests
        builder.withRequestField("balance_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMultiAccountTransferAmountRequest::getBalanceType, (req, v) -> {
                req.setBalanceType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowMultiAccountTransferAmountRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowMultiAccountTransferAmountRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResult = genForshowRealnameAuthenticationReviewResult();

    private static HttpRequestDef<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> genForshowRealnameAuthenticationReviewResult() {
        // basic
        HttpRequestDef.Builder<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRealnameAuthenticationReviewResultRequest.class, ShowRealnameAuthenticationReviewResultResponse.class)
                .withName("ShowRealnameAuthenticationReviewResult")
                .withUri("/v2/customers/realname-auths/result")
                .withContentType("application/json");

        // requests
        builder.withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRealnameAuthenticationReviewResultRequest::getCustomerId, (req, v) -> {
                req.setCustomerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> showRefundOrderDetails = genForshowRefundOrderDetails();

    private static HttpRequestDef<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> genForshowRefundOrderDetails() {
        // basic
        HttpRequestDef.Builder<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRefundOrderDetailsRequest.class, ShowRefundOrderDetailsResponse.class)
                .withName("ShowRefundOrderDetails")
                .withUri("/v2/orders/customer-orders/refund-orders")
                .withContentType("application/json");

        // requests
        builder.withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRefundOrderDetailsRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateCouponQuotasRequest, UpdateCouponQuotasResponse> updateCouponQuotas = genForupdateCouponQuotas();

    private static HttpRequestDef<UpdateCouponQuotasRequest, UpdateCouponQuotasResponse> genForupdateCouponQuotas() {
        // basic
        HttpRequestDef.Builder<UpdateCouponQuotasRequest, UpdateCouponQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCouponQuotasRequest.class, UpdateCouponQuotasResponse.class)
                .withName("UpdateCouponQuotas")
                .withUri("/v2/partners/coupon-quotas/indirect-partner-adjust")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AdjustCouponQuotasReq.class,
            f -> f.withMarshaller(UpdateCouponQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomerAccountAmountRequest, UpdateCustomerAccountAmountResponse> updateCustomerAccountAmount = genForupdateCustomerAccountAmount();

    private static HttpRequestDef<UpdateCustomerAccountAmountRequest, UpdateCustomerAccountAmountResponse> genForupdateCustomerAccountAmount() {
        // basic
        HttpRequestDef.Builder<UpdateCustomerAccountAmountRequest, UpdateCustomerAccountAmountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCustomerAccountAmountRequest.class, UpdateCustomerAccountAmountResponse.class)
                .withName("UpdateCustomerAccountAmount")
                .withUri("/v2/accounts/partner-accounts/adjust-amount")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AdjustAccountReq.class,
            f -> f.withMarshaller(UpdateCustomerAccountAmountRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateIndirectPartnerAccountRequest, UpdateIndirectPartnerAccountResponse> updateIndirectPartnerAccount = genForupdateIndirectPartnerAccount();

    private static HttpRequestDef<UpdateIndirectPartnerAccountRequest, UpdateIndirectPartnerAccountResponse> genForupdateIndirectPartnerAccount() {
        // basic
        HttpRequestDef.Builder<UpdateIndirectPartnerAccountRequest, UpdateIndirectPartnerAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateIndirectPartnerAccountRequest.class, UpdateIndirectPartnerAccountResponse.class)
                .withName("UpdateIndirectPartnerAccount")
                .withUri("/v2/accounts/partner-accounts/indirect-partner-adjust")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AdjustToIndirectPartnerReq.class,
            f -> f.withMarshaller(UpdateIndirectPartnerAccountRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> updatePeriodToOnDemand = genForupdatePeriodToOnDemand();

    private static HttpRequestDef<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> genForupdatePeriodToOnDemand() {
        // basic
        HttpRequestDef.Builder<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdatePeriodToOnDemandRequest.class, UpdatePeriodToOnDemandResponse.class)
                .withName("UpdatePeriodToOnDemand")
                .withUri("/v2/orders/subscriptions/resources/to-on-demand")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PeriodToOnDemandReq.class,
            f -> f.withMarshaller(UpdatePeriodToOnDemandRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostalRequest, UpdatePostalResponse> updatePostal = genForupdatePostal();

    private static HttpRequestDef<UpdatePostalRequest, UpdatePostalResponse> genForupdatePostal() {
        // basic
        HttpRequestDef.Builder<UpdatePostalRequest, UpdatePostalResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePostalRequest.class, UpdatePostalResponse.class)
                .withName("UpdatePostal")
                .withUri("/v2/customers/postal-addresses")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePostalRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePostalReq.class,
            f -> f.withMarshaller(UpdatePostalRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubEnterpriseAmountRequest, UpdateSubEnterpriseAmountResponse> updateSubEnterpriseAmount = genForupdateSubEnterpriseAmount();

    private static HttpRequestDef<UpdateSubEnterpriseAmountRequest, UpdateSubEnterpriseAmountResponse> genForupdateSubEnterpriseAmount() {
        // basic
        HttpRequestDef.Builder<UpdateSubEnterpriseAmountRequest, UpdateSubEnterpriseAmountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSubEnterpriseAmountRequest.class, UpdateSubEnterpriseAmountResponse.class)
                .withName("UpdateSubEnterpriseAmount")
                .withUri("/v2/enterprises/multi-accounts/transfer-amount")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TransferEnterpriseMultiAccountReq.class,
            f -> f.withMarshaller(UpdateSubEnterpriseAmountRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

package com.huaweicloud.sdk.bss.v2;

import com.huaweicloud.sdk.bss.v2.model.AdjustAccountReq;
import com.huaweicloud.sdk.bss.v2.model.AdjustCouponQuotasReq;
import com.huaweicloud.sdk.bss.v2.model.AdjustToIndirectPartnerReq;
import com.huaweicloud.sdk.bss.v2.model.ApplyEnterpriseRealnameAuthsReq;
import com.huaweicloud.sdk.bss.v2.model.ApplyIndividualRealnameAuthsReq;
import com.huaweicloud.sdk.bss.v2.model.AutoRenewalResourcesRequest;
import com.huaweicloud.sdk.bss.v2.model.AutoRenewalResourcesResponse;
import com.huaweicloud.sdk.bss.v2.model.CancelAutoRenewalResourcesRequest;
import com.huaweicloud.sdk.bss.v2.model.CancelAutoRenewalResourcesResponse;
import com.huaweicloud.sdk.bss.v2.model.CancelCustomerOrderReq;
import com.huaweicloud.sdk.bss.v2.model.CancelCustomerOrderRequest;
import com.huaweicloud.sdk.bss.v2.model.CancelCustomerOrderResponse;
import com.huaweicloud.sdk.bss.v2.model.CancelResourcesSubscriptionRequest;
import com.huaweicloud.sdk.bss.v2.model.CancelResourcesSubscriptionResponse;
import com.huaweicloud.sdk.bss.v2.model.ChangeEnterpriseRealnameAuthenticationRequest;
import com.huaweicloud.sdk.bss.v2.model.ChangeEnterpriseRealnameAuthenticationResponse;
import com.huaweicloud.sdk.bss.v2.model.ChangeEnterpriseRealnameAuthsReq;
import com.huaweicloud.sdk.bss.v2.model.CheckSubcustomerUserReq;
import com.huaweicloud.sdk.bss.v2.model.CheckUserIdentityRequest;
import com.huaweicloud.sdk.bss.v2.model.CheckUserIdentityResponse;
import com.huaweicloud.sdk.bss.v2.model.ClaimEnterpriseMultiAccountCouponRequest;
import com.huaweicloud.sdk.bss.v2.model.ClaimEnterpriseMultiAccountCouponResponse;
import com.huaweicloud.sdk.bss.v2.model.CreateCustomerV2Req;
import com.huaweicloud.sdk.bss.v2.model.CreateEnterpriseProjectAuthRequest;
import com.huaweicloud.sdk.bss.v2.model.CreateEnterpriseProjectAuthResponse;
import com.huaweicloud.sdk.bss.v2.model.CreateEnterpriseRealnameAuthenticationRequest;
import com.huaweicloud.sdk.bss.v2.model.CreateEnterpriseRealnameAuthenticationResponse;
import com.huaweicloud.sdk.bss.v2.model.CreatePartnerCouponsReq;
import com.huaweicloud.sdk.bss.v2.model.CreatePartnerCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.CreatePartnerCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.CreatePersonalRealnameAuthRequest;
import com.huaweicloud.sdk.bss.v2.model.CreatePersonalRealnameAuthResponse;
import com.huaweicloud.sdk.bss.v2.model.CreateSubCustomerReqV2;
import com.huaweicloud.sdk.bss.v2.model.CreateSubCustomerRequest;
import com.huaweicloud.sdk.bss.v2.model.CreateSubCustomerResponse;
import com.huaweicloud.sdk.bss.v2.model.CreateSubEnterpriseAccountRequest;
import com.huaweicloud.sdk.bss.v2.model.CreateSubEnterpriseAccountResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCitiesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCitiesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListConsumeSubCustomersReq;
import com.huaweicloud.sdk.bss.v2.model.ListConsumeSubCustomersRequest;
import com.huaweicloud.sdk.bss.v2.model.ListConsumeSubCustomersResponse;
import com.huaweicloud.sdk.bss.v2.model.ListConversionsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListConversionsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCostsReq;
import com.huaweicloud.sdk.bss.v2.model.ListCostsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCostsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCountiesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCountiesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCouponQuotasRecordsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCouponQuotasRecordsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerAccountChangeRecordsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerAccountChangeRecordsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerBillsFeeRecordsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerBillsFeeRecordsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerBillsMonthlyBreakDownRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerBillsMonthlyBreakDownResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerOnDemandResourcesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerOnDemandResourcesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerOrdersRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerOrdersResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCustomersBalancesDetailRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCustomersBalancesDetailResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerselfResourceRecordDetailsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerselfResourceRecordDetailsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerselfResourceRecordsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCustomerselfResourceRecordsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListEnterpriseMultiAccountRequest;
import com.huaweicloud.sdk.bss.v2.model.ListEnterpriseMultiAccountResponse;
import com.huaweicloud.sdk.bss.v2.model.ListEnterpriseOrganizationsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListEnterpriseOrganizationsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListEnterpriseSubCustomersRequest;
import com.huaweicloud.sdk.bss.v2.model.ListEnterpriseSubCustomersResponse;
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourceInfosReq;
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourceInfosRequest;
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourceInfosResponse;
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourceUsagesReq;
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourceUsagesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourceUsagesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourcesUsageRecordsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourcesUsageRecordsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListIncentiveDiscountPoliciesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListIncentiveDiscountPoliciesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListIndirectPartnersRequest;
import com.huaweicloud.sdk.bss.v2.model.ListIndirectPartnersResponse;
import com.huaweicloud.sdk.bss.v2.model.ListIssuedCouponQuotasRequest;
import com.huaweicloud.sdk.bss.v2.model.ListIssuedCouponQuotasResponse;
import com.huaweicloud.sdk.bss.v2.model.ListIssuedPartnerCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListIssuedPartnerCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListMeasureUnitsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListMeasureUnitsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListMultiAccountRetrieveCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListMultiAccountRetrieveCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListMultiAccountTransferCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListMultiAccountTransferCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListOnDemandResourceRatingsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListOnDemandResourceRatingsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListOrderCouponsByOrderIdRequest;
import com.huaweicloud.sdk.bss.v2.model.ListOrderCouponsByOrderIdResponse;
import com.huaweicloud.sdk.bss.v2.model.ListOrderDiscountsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListOrderDiscountsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListPartnerAccountChangeRecordsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListPartnerAccountChangeRecordsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListPartnerAdjustRecordsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListPartnerAdjustRecordsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListPartnerBalancesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListPartnerBalancesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListPartnerCouponsRecordRequest;
import com.huaweicloud.sdk.bss.v2.model.ListPartnerCouponsRecordResponse;
import com.huaweicloud.sdk.bss.v2.model.ListPayPerUseCustomerResourcesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListPayPerUseCustomerResourcesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListProvincesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListProvincesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListQuotaCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListQuotaCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListRateOnPeriodDetailRequest;
import com.huaweicloud.sdk.bss.v2.model.ListRateOnPeriodDetailResponse;
import com.huaweicloud.sdk.bss.v2.model.ListRenewRateOnPeriodReq;
import com.huaweicloud.sdk.bss.v2.model.ListRenewRateOnPeriodRequest;
import com.huaweicloud.sdk.bss.v2.model.ListRenewRateOnPeriodResponse;
import com.huaweicloud.sdk.bss.v2.model.ListResourceTypesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListResourceTypesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListResourceUsageRequest;
import com.huaweicloud.sdk.bss.v2.model.ListResourceUsageResponse;
import com.huaweicloud.sdk.bss.v2.model.ListResourceUsageSummaryRequest;
import com.huaweicloud.sdk.bss.v2.model.ListResourceUsageSummaryResponse;
import com.huaweicloud.sdk.bss.v2.model.ListServiceResourcesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListServiceResourcesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListServiceTypesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListServiceTypesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListStoredValueCardsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListStoredValueCardsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomerBillDetailRequest;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomerBillDetailResponse;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomerCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomerCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomerNewTagReq;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomerNewTagRequest;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomerNewTagResponse;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomersRequest;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomersResponse;
import com.huaweicloud.sdk.bss.v2.model.ListSubcustomerMonthlyBillsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListSubcustomerMonthlyBillsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListUsageTypesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListUsageTypesResponse;
import com.huaweicloud.sdk.bss.v2.model.PayCustomerOrderV3Req;
import com.huaweicloud.sdk.bss.v2.model.PayOrdersRequest;
import com.huaweicloud.sdk.bss.v2.model.PayOrdersResponse;
import com.huaweicloud.sdk.bss.v2.model.PeriodToOnDemandReq;
import com.huaweicloud.sdk.bss.v2.model.QueryCouponQuotasReqExt;
import com.huaweicloud.sdk.bss.v2.model.QueryCustomerOnDemandResourcesReq;
import com.huaweicloud.sdk.bss.v2.model.QueryCustomersBalancesReq;
import com.huaweicloud.sdk.bss.v2.model.QueryIndirectPartnersReq;
import com.huaweicloud.sdk.bss.v2.model.QueryResRecordsDetailReq;
import com.huaweicloud.sdk.bss.v2.model.QueryResourcesReq;
import com.huaweicloud.sdk.bss.v2.model.QuerySubCustomerListReq;
import com.huaweicloud.sdk.bss.v2.model.RateOnDemandReq;
import com.huaweicloud.sdk.bss.v2.model.RateOnPeriodReq;
import com.huaweicloud.sdk.bss.v2.model.ReclaimCouponQuotasReq;
import com.huaweicloud.sdk.bss.v2.model.ReclaimCouponQuotasRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimCouponQuotasResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimEnterpriseMultiAccountCouponRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimEnterpriseMultiAccountCouponResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimIndirectPartnerAccountReq;
import com.huaweicloud.sdk.bss.v2.model.ReclaimIndirectPartnerAccountRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimIndirectPartnerAccountResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimPartnerCouponsReq;
import com.huaweicloud.sdk.bss.v2.model.ReclaimPartnerCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimPartnerCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimSubEnterpriseAmountRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimSubEnterpriseAmountResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimToPartnerAccountBalancesReq;
import com.huaweicloud.sdk.bss.v2.model.ReclaimToPartnerAccountRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimToPartnerAccountResponse;
import com.huaweicloud.sdk.bss.v2.model.RenewalResourcesReq;
import com.huaweicloud.sdk.bss.v2.model.RenewalResourcesRequest;
import com.huaweicloud.sdk.bss.v2.model.RenewalResourcesResponse;
import com.huaweicloud.sdk.bss.v2.model.RetrieveEnterpriseMultiAccountCouponReq;
import com.huaweicloud.sdk.bss.v2.model.RetrieveEnterpriseMultiAccountReq;
import com.huaweicloud.sdk.bss.v2.model.SendSmVerificationCodeReq;
import com.huaweicloud.sdk.bss.v2.model.SendSmsVerificationCodeRequest;
import com.huaweicloud.sdk.bss.v2.model.SendSmsVerificationCodeResponse;
import com.huaweicloud.sdk.bss.v2.model.SendVerificationCodeV2Req;
import com.huaweicloud.sdk.bss.v2.model.SendVerificationMessageCodeRequest;
import com.huaweicloud.sdk.bss.v2.model.SendVerificationMessageCodeResponse;
import com.huaweicloud.sdk.bss.v2.model.ShowCustomerAccountBalancesRequest;
import com.huaweicloud.sdk.bss.v2.model.ShowCustomerAccountBalancesResponse;
import com.huaweicloud.sdk.bss.v2.model.ShowCustomerMonthlySumRequest;
import com.huaweicloud.sdk.bss.v2.model.ShowCustomerMonthlySumResponse;
import com.huaweicloud.sdk.bss.v2.model.ShowCustomerOrderDetailsRequest;
import com.huaweicloud.sdk.bss.v2.model.ShowCustomerOrderDetailsResponse;
import com.huaweicloud.sdk.bss.v2.model.ShowMultiAccountTransferAmountRequest;
import com.huaweicloud.sdk.bss.v2.model.ShowMultiAccountTransferAmountResponse;
import com.huaweicloud.sdk.bss.v2.model.ShowRealnameAuthenticationReviewResultRequest;
import com.huaweicloud.sdk.bss.v2.model.ShowRealnameAuthenticationReviewResultResponse;
import com.huaweicloud.sdk.bss.v2.model.ShowRefundOrderDetailsRequest;
import com.huaweicloud.sdk.bss.v2.model.ShowRefundOrderDetailsResponse;
import com.huaweicloud.sdk.bss.v2.model.TransferEnterpriseMultiAccountCouponReq;
import com.huaweicloud.sdk.bss.v2.model.TransferEnterpriseMultiAccountReq;
import com.huaweicloud.sdk.bss.v2.model.UnsubscribeResourcesReq;
import com.huaweicloud.sdk.bss.v2.model.UpdateCouponQuotasRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdateCouponQuotasResponse;
import com.huaweicloud.sdk.bss.v2.model.UpdateCustomerAccountAmountRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdateCustomerAccountAmountResponse;
import com.huaweicloud.sdk.bss.v2.model.UpdateIndirectPartnerAccountRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdateIndirectPartnerAccountResponse;
import com.huaweicloud.sdk.bss.v2.model.UpdatePeriodToOnDemandRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdatePeriodToOnDemandResponse;
import com.huaweicloud.sdk.bss.v2.model.UpdateSubEnterpriseAmountRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdateSubEnterpriseAmountResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class BssMeta {

    public static final HttpRequestDef<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> autoRenewalResources =
        genForAutoRenewalResources();

    private static HttpRequestDef<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> genForAutoRenewalResources() {
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
            f -> f.withMarshaller(AutoRenewalResourcesRequest::getResourceId,
                AutoRenewalResourcesRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> cancelAutoRenewalResources =
        genForCancelAutoRenewalResources();

    private static HttpRequestDef<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> genForCancelAutoRenewalResources() {
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
            f -> f.withMarshaller(CancelAutoRenewalResourcesRequest::getResourceId,
                CancelAutoRenewalResourcesRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelCustomerOrderRequest, CancelCustomerOrderResponse> cancelCustomerOrder =
        genForCancelCustomerOrder();

    private static HttpRequestDef<CancelCustomerOrderRequest, CancelCustomerOrderResponse> genForCancelCustomerOrder() {
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
            f -> f.withMarshaller(CancelCustomerOrderRequest::getBody, CancelCustomerOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> cancelResourcesSubscription =
        genForCancelResourcesSubscription();

    private static HttpRequestDef<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> genForCancelResourcesSubscription() {
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
            f -> f.withMarshaller(CancelResourcesSubscriptionRequest::getBody,
                CancelResourcesSubscriptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthentication =
        genForChangeEnterpriseRealnameAuthentication();

    private static HttpRequestDef<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> genForChangeEnterpriseRealnameAuthentication() {
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
            f -> f.withMarshaller(ChangeEnterpriseRealnameAuthenticationRequest::getBody,
                ChangeEnterpriseRealnameAuthenticationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckUserIdentityRequest, CheckUserIdentityResponse> checkUserIdentity =
        genForCheckUserIdentity();

    private static HttpRequestDef<CheckUserIdentityRequest, CheckUserIdentityResponse> genForCheckUserIdentity() {
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
            f -> f.withMarshaller(CheckUserIdentityRequest::getBody, CheckUserIdentityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ClaimEnterpriseMultiAccountCouponRequest, ClaimEnterpriseMultiAccountCouponResponse> claimEnterpriseMultiAccountCoupon =
        genForClaimEnterpriseMultiAccountCoupon();

    private static HttpRequestDef<ClaimEnterpriseMultiAccountCouponRequest, ClaimEnterpriseMultiAccountCouponResponse> genForClaimEnterpriseMultiAccountCoupon() {
        // basic
        HttpRequestDef.Builder<ClaimEnterpriseMultiAccountCouponRequest, ClaimEnterpriseMultiAccountCouponResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ClaimEnterpriseMultiAccountCouponRequest.class,
                    ClaimEnterpriseMultiAccountCouponResponse.class)
                .withName("ClaimEnterpriseMultiAccountCoupon")
                .withUri("/v2/enterprises/multi-accounts/transfer-coupon")
                .withContentType("application/json");

        // requests
        builder.<TransferEnterpriseMultiAccountCouponReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransferEnterpriseMultiAccountCouponReq.class),
            f -> f.withMarshaller(ClaimEnterpriseMultiAccountCouponRequest::getBody,
                ClaimEnterpriseMultiAccountCouponRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnterpriseProjectAuthRequest, CreateEnterpriseProjectAuthResponse> createEnterpriseProjectAuth =
        genForCreateEnterpriseProjectAuth();

    private static HttpRequestDef<CreateEnterpriseProjectAuthRequest, CreateEnterpriseProjectAuthResponse> genForCreateEnterpriseProjectAuth() {
        // basic
        HttpRequestDef.Builder<CreateEnterpriseProjectAuthRequest, CreateEnterpriseProjectAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateEnterpriseProjectAuthRequest.class,
                    CreateEnterpriseProjectAuthResponse.class)
                .withName("CreateEnterpriseProjectAuth")
                .withUri("/v2/enterprises/enterprise-projects/authority")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthentication =
        genForCreateEnterpriseRealnameAuthentication();

    private static HttpRequestDef<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> genForCreateEnterpriseRealnameAuthentication() {
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
            f -> f.withMarshaller(CreateEnterpriseRealnameAuthenticationRequest::getBody,
                CreateEnterpriseRealnameAuthenticationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePartnerCouponsRequest, CreatePartnerCouponsResponse> createPartnerCoupons =
        genForCreatePartnerCoupons();

    private static HttpRequestDef<CreatePartnerCouponsRequest, CreatePartnerCouponsResponse> genForCreatePartnerCoupons() {
        // basic
        HttpRequestDef.Builder<CreatePartnerCouponsRequest, CreatePartnerCouponsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePartnerCouponsRequest.class, CreatePartnerCouponsResponse.class)
            .withName("CreatePartnerCoupons")
            .withUri("/v2/promotions/benefits/partner-coupons")
            .withContentType("application/json");

        // requests
        builder.<CreatePartnerCouponsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePartnerCouponsReq.class),
            f -> f.withMarshaller(CreatePartnerCouponsRequest::getBody, CreatePartnerCouponsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> createPersonalRealnameAuth =
        genForCreatePersonalRealnameAuth();

    private static HttpRequestDef<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> genForCreatePersonalRealnameAuth() {
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
            f -> f.withMarshaller(CreatePersonalRealnameAuthRequest::getBody,
                CreatePersonalRealnameAuthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubCustomerRequest, CreateSubCustomerResponse> createSubCustomer =
        genForCreateSubCustomer();

    private static HttpRequestDef<CreateSubCustomerRequest, CreateSubCustomerResponse> genForCreateSubCustomer() {
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
            f -> f.withMarshaller(CreateSubCustomerRequest::getBody, CreateSubCustomerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubEnterpriseAccountRequest, CreateSubEnterpriseAccountResponse> createSubEnterpriseAccount =
        genForCreateSubEnterpriseAccount();

    private static HttpRequestDef<CreateSubEnterpriseAccountRequest, CreateSubEnterpriseAccountResponse> genForCreateSubEnterpriseAccount() {
        // basic
        HttpRequestDef.Builder<CreateSubEnterpriseAccountRequest, CreateSubEnterpriseAccountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSubEnterpriseAccountRequest.class,
                    CreateSubEnterpriseAccountResponse.class)
                .withName("CreateSubEnterpriseAccount")
                .withUri("/v2/enterprises/multi-accounts/sub-customers")
                .withContentType("application/json");

        // requests
        builder.<CreateSubCustomerReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubCustomerReqV2.class),
            f -> f.withMarshaller(CreateSubEnterpriseAccountRequest::getBody,
                CreateSubEnterpriseAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCitiesRequest, ListCitiesResponse> listCities = genForListCities();

    private static HttpRequestDef<ListCitiesRequest, ListCitiesResponse> genForListCities() {
        // basic
        HttpRequestDef.Builder<ListCitiesRequest, ListCitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCitiesRequest.class, ListCitiesResponse.class)
                .withName("ListCities")
                .withUri("/v2/systems/configs/cities")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("province_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCitiesRequest::getProvinceCode, ListCitiesRequest::setProvinceCode));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCitiesRequest::getOffset, ListCitiesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCitiesRequest::getLimit, ListCitiesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCitiesRequest::getXLanguage, ListCitiesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsumeSubCustomersRequest, ListConsumeSubCustomersResponse> listConsumeSubCustomers =
        genForListConsumeSubCustomers();

    private static HttpRequestDef<ListConsumeSubCustomersRequest, ListConsumeSubCustomersResponse> genForListConsumeSubCustomers() {
        // basic
        HttpRequestDef.Builder<ListConsumeSubCustomersRequest, ListConsumeSubCustomersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListConsumeSubCustomersRequest.class, ListConsumeSubCustomersResponse.class)
            .withName("ListConsumeSubCustomers")
            .withUri("/v2/bills/subcustomer-bills/res-fee-records/sub-customers/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeSubCustomersRequest::getXLanguage,
                ListConsumeSubCustomersRequest::setXLanguage));
        builder.<ListConsumeSubCustomersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListConsumeSubCustomersReq.class),
            f -> f.withMarshaller(ListConsumeSubCustomersRequest::getBody, ListConsumeSubCustomersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConversionsRequest, ListConversionsResponse> listConversions =
        genForListConversions();

    private static HttpRequestDef<ListConversionsRequest, ListConversionsResponse> genForListConversions() {
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
            f -> f.withMarshaller(ListConversionsRequest::getMeasureType, ListConversionsRequest::setMeasureType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConversionsRequest::getXLanguage, ListConversionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCostsRequest, ListCostsResponse> listCosts = genForListCosts();

    private static HttpRequestDef<ListCostsRequest, ListCostsResponse> genForListCosts() {
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
            f -> f.withMarshaller(ListCostsRequest::getXLanguage, ListCostsRequest::setXLanguage));
        builder.<ListCostsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCostsReq.class),
            f -> f.withMarshaller(ListCostsRequest::getBody, ListCostsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCountiesRequest, ListCountiesResponse> listCounties = genForListCounties();

    private static HttpRequestDef<ListCountiesRequest, ListCountiesResponse> genForListCounties() {
        // basic
        HttpRequestDef.Builder<ListCountiesRequest, ListCountiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCountiesRequest.class, ListCountiesResponse.class)
                .withName("ListCounties")
                .withUri("/v2/systems/configs/counties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("city_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCountiesRequest::getCityCode, ListCountiesRequest::setCityCode));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCountiesRequest::getOffset, ListCountiesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCountiesRequest::getLimit, ListCountiesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCountiesRequest::getXLanguage, ListCountiesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCouponQuotasRecordsRequest, ListCouponQuotasRecordsResponse> listCouponQuotasRecords =
        genForListCouponQuotasRecords();

    private static HttpRequestDef<ListCouponQuotasRecordsRequest, ListCouponQuotasRecordsResponse> genForListCouponQuotasRecords() {
        // basic
        HttpRequestDef.Builder<ListCouponQuotasRecordsRequest, ListCouponQuotasRecordsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCouponQuotasRecordsRequest.class, ListCouponQuotasRecordsResponse.class)
            .withName("ListCouponQuotasRecords")
            .withUri("/v2/partners/coupon-quotas/records")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getIndirectPartnerId,
                ListCouponQuotasRecordsRequest::setIndirectPartnerId));
        builder.<String>withRequestField("quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getQuotaId,
                ListCouponQuotasRecordsRequest::setQuotaId));
        builder.<String>withRequestField("operation_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getOperationTimeBegin,
                ListCouponQuotasRecordsRequest::setOperationTimeBegin));
        builder.<String>withRequestField("operation_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getOperationTimeEnd,
                ListCouponQuotasRecordsRequest::setOperationTimeEnd));
        builder.<String>withRequestField("parent_quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getParentQuotaId,
                ListCouponQuotasRecordsRequest::setParentQuotaId));
        builder.<String>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getOperationType,
                ListCouponQuotasRecordsRequest::setOperationType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getOffset,
                ListCouponQuotasRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCouponQuotasRecordsRequest::getLimit, ListCouponQuotasRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerAccountChangeRecordsRequest, ListCustomerAccountChangeRecordsResponse> listCustomerAccountChangeRecords =
        genForListCustomerAccountChangeRecords();

    private static HttpRequestDef<ListCustomerAccountChangeRecordsRequest, ListCustomerAccountChangeRecordsResponse> genForListCustomerAccountChangeRecords() {
        // basic
        HttpRequestDef.Builder<ListCustomerAccountChangeRecordsRequest, ListCustomerAccountChangeRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCustomerAccountChangeRecordsRequest.class,
                    ListCustomerAccountChangeRecordsResponse.class)
                .withName("ListCustomerAccountChangeRecords")
                .withUri("/v2/accounts/customer-accounts/account-change-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("balance_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getBalanceType,
                ListCustomerAccountChangeRecordsRequest::setBalanceType));
        builder.<String>withRequestField("revenue_expense_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getRevenueExpenseType,
                ListCustomerAccountChangeRecordsRequest::setRevenueExpenseType));
        builder.<String>withRequestField("trade_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getTradeType,
                ListCustomerAccountChangeRecordsRequest::setTradeType));
        builder.<String>withRequestField("trade_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getTradeTimeBegin,
                ListCustomerAccountChangeRecordsRequest::setTradeTimeBegin));
        builder.<String>withRequestField("trade_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getTradeTimeEnd,
                ListCustomerAccountChangeRecordsRequest::setTradeTimeEnd));
        builder.<String>withRequestField("trade_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getTradeId,
                ListCustomerAccountChangeRecordsRequest::setTradeId));
        builder.<String>withRequestField("payment_channel_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getPaymentChannelId,
                ListCustomerAccountChangeRecordsRequest::setPaymentChannelId));
        builder.<String>withRequestField("payment_channel_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getPaymentChannelNo,
                ListCustomerAccountChangeRecordsRequest::setPaymentChannelNo));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getOffset,
                ListCustomerAccountChangeRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerAccountChangeRecordsRequest::getLimit,
                ListCustomerAccountChangeRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerBillsFeeRecordsRequest, ListCustomerBillsFeeRecordsResponse> listCustomerBillsFeeRecords =
        genForListCustomerBillsFeeRecords();

    private static HttpRequestDef<ListCustomerBillsFeeRecordsRequest, ListCustomerBillsFeeRecordsResponse> genForListCustomerBillsFeeRecords() {
        // basic
        HttpRequestDef.Builder<ListCustomerBillsFeeRecordsRequest, ListCustomerBillsFeeRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCustomerBillsFeeRecordsRequest.class,
                    ListCustomerBillsFeeRecordsResponse.class)
                .withName("ListCustomerBillsFeeRecords")
                .withUri("/v2/bills/customer-bills/fee-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bill_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getBillCycle,
                ListCustomerBillsFeeRecordsRequest::setBillCycle));
        builder.<Integer>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getProviderType,
                ListCustomerBillsFeeRecordsRequest::setProviderType));
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getServiceTypeCode,
                ListCustomerBillsFeeRecordsRequest::setServiceTypeCode));
        builder.<String>withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getResourceTypeCode,
                ListCustomerBillsFeeRecordsRequest::setResourceTypeCode));
        builder.<String>withRequestField("region_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getRegionCode,
                ListCustomerBillsFeeRecordsRequest::setRegionCode));
        builder.<Integer>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getChargingMode,
                ListCustomerBillsFeeRecordsRequest::setChargingMode));
        builder.<Integer>withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getBillType,
                ListCustomerBillsFeeRecordsRequest::setBillType));
        builder.<String>withRequestField("trade_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getTradeId,
                ListCustomerBillsFeeRecordsRequest::setTradeId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getEnterpriseProjectId,
                ListCustomerBillsFeeRecordsRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("include_zero_record",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getIncludeZeroRecord,
                ListCustomerBillsFeeRecordsRequest::setIncludeZeroRecord));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getStatus,
                ListCustomerBillsFeeRecordsRequest::setStatus));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getMethod,
                ListCustomerBillsFeeRecordsRequest::setMethod));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getSubCustomerId,
                ListCustomerBillsFeeRecordsRequest::setSubCustomerId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getOffset,
                ListCustomerBillsFeeRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getLimit,
                ListCustomerBillsFeeRecordsRequest::setLimit));
        builder.<String>withRequestField("bill_date_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getBillDateBegin,
                ListCustomerBillsFeeRecordsRequest::setBillDateBegin));
        builder.<String>withRequestField("bill_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getBillDateEnd,
                ListCustomerBillsFeeRecordsRequest::setBillDateEnd));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsFeeRecordsRequest::getXLanguage,
                ListCustomerBillsFeeRecordsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerBillsMonthlyBreakDownRequest, ListCustomerBillsMonthlyBreakDownResponse> listCustomerBillsMonthlyBreakDown =
        genForListCustomerBillsMonthlyBreakDown();

    private static HttpRequestDef<ListCustomerBillsMonthlyBreakDownRequest, ListCustomerBillsMonthlyBreakDownResponse> genForListCustomerBillsMonthlyBreakDown() {
        // basic
        HttpRequestDef.Builder<ListCustomerBillsMonthlyBreakDownRequest, ListCustomerBillsMonthlyBreakDownResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCustomerBillsMonthlyBreakDownRequest.class,
                    ListCustomerBillsMonthlyBreakDownResponse.class)
                .withName("ListCustomerBillsMonthlyBreakDown")
                .withUri("/v2/costs/cost-analysed-bills/monthly-breakdown")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("shared_month",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getSharedMonth,
                ListCustomerBillsMonthlyBreakDownRequest::setSharedMonth));
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getServiceTypeCode,
                ListCustomerBillsMonthlyBreakDownRequest::setServiceTypeCode));
        builder.<String>withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getResourceTypeCode,
                ListCustomerBillsMonthlyBreakDownRequest::setResourceTypeCode));
        builder.<String>withRequestField("region_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getRegionCode,
                ListCustomerBillsMonthlyBreakDownRequest::setRegionCode));
        builder.<Integer>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getChargingMode,
                ListCustomerBillsMonthlyBreakDownRequest::setChargingMode));
        builder.<Integer>withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getBillType,
                ListCustomerBillsMonthlyBreakDownRequest::setBillType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getOffset,
                ListCustomerBillsMonthlyBreakDownRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getLimit,
                ListCustomerBillsMonthlyBreakDownRequest::setLimit));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getResourceId,
                ListCustomerBillsMonthlyBreakDownRequest::setResourceId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getResourceName,
                ListCustomerBillsMonthlyBreakDownRequest::setResourceName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getEnterpriseProjectId,
                ListCustomerBillsMonthlyBreakDownRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getMethod,
                ListCustomerBillsMonthlyBreakDownRequest::setMethod));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getSubCustomerId,
                ListCustomerBillsMonthlyBreakDownRequest::setSubCustomerId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerBillsMonthlyBreakDownRequest::getXLanguage,
                ListCustomerBillsMonthlyBreakDownRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResources =
        genForListCustomerOnDemandResources();

    private static HttpRequestDef<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> genForListCustomerOnDemandResources() {
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
            f -> f.withMarshaller(ListCustomerOnDemandResourcesRequest::getXLanguage,
                ListCustomerOnDemandResourcesRequest::setXLanguage));
        builder.<QueryCustomerOnDemandResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryCustomerOnDemandResourcesReq.class),
            f -> f.withMarshaller(ListCustomerOnDemandResourcesRequest::getBody,
                ListCustomerOnDemandResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerOrdersRequest, ListCustomerOrdersResponse> listCustomerOrders =
        genForListCustomerOrders();

    private static HttpRequestDef<ListCustomerOrdersRequest, ListCustomerOrdersResponse> genForListCustomerOrders() {
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
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOrderId, ListCustomerOrdersRequest::setOrderId));
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getCustomerId, ListCustomerOrdersRequest::setCustomerId));
        builder.<String>withRequestField("create_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getCreateTimeBegin,
                ListCustomerOrdersRequest::setCreateTimeBegin));
        builder.<String>withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getCreateTimeEnd,
                ListCustomerOrdersRequest::setCreateTimeEnd));
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getServiceTypeCode,
                ListCustomerOrdersRequest::setServiceTypeCode));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getStatus, ListCustomerOrdersRequest::setStatus));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOrderType, ListCustomerOrdersRequest::setOrderType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getLimit, ListCustomerOrdersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOffset, ListCustomerOrdersRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getOrderBy, ListCustomerOrdersRequest::setOrderBy));
        builder.<String>withRequestField("payment_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getPaymentTimeBegin,
                ListCustomerOrdersRequest::setPaymentTimeBegin));
        builder.<String>withRequestField("payment_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getPaymentTimeEnd,
                ListCustomerOrdersRequest::setPaymentTimeEnd));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getIndirectPartnerId,
                ListCustomerOrdersRequest::setIndirectPartnerId));
        builder.<ListCustomerOrdersRequest.MethodEnum>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCustomerOrdersRequest.MethodEnum.class),
            f -> f.withMarshaller(ListCustomerOrdersRequest::getMethod, ListCustomerOrdersRequest::setMethod));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomersBalancesDetailRequest, ListCustomersBalancesDetailResponse> listCustomersBalancesDetail =
        genForListCustomersBalancesDetail();

    private static HttpRequestDef<ListCustomersBalancesDetailRequest, ListCustomersBalancesDetailResponse> genForListCustomersBalancesDetail() {
        // basic
        HttpRequestDef.Builder<ListCustomersBalancesDetailRequest, ListCustomersBalancesDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCustomersBalancesDetailRequest.class,
                    ListCustomersBalancesDetailResponse.class)
                .withName("ListCustomersBalancesDetail")
                .withUri("/v2/accounts/customer-accounts/balances/batch-query")
                .withContentType("application/json");

        // requests
        builder.<QueryCustomersBalancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryCustomersBalancesReq.class),
            f -> f.withMarshaller(ListCustomersBalancesDetailRequest::getBody,
                ListCustomersBalancesDetailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetails =
        genForListCustomerselfResourceRecordDetails();

    private static HttpRequestDef<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> genForListCustomerselfResourceRecordDetails() {
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
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordDetailsRequest::getXLanguage,
                ListCustomerselfResourceRecordDetailsRequest::setXLanguage));
        builder.<QueryResRecordsDetailReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResRecordsDetailReq.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordDetailsRequest::getBody,
                ListCustomerselfResourceRecordDetailsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecords =
        genForListCustomerselfResourceRecords();

    private static HttpRequestDef<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> genForListCustomerselfResourceRecords() {
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
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getCycle,
                ListCustomerselfResourceRecordsRequest::setCycle));
        builder.<String>withRequestField("cloud_service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getCloudServiceType,
                ListCustomerselfResourceRecordsRequest::setCloudServiceType));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getRegion,
                ListCustomerselfResourceRecordsRequest::setRegion));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getChargeMode,
                ListCustomerselfResourceRecordsRequest::setChargeMode));
        builder.<Integer>withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getBillType,
                ListCustomerselfResourceRecordsRequest::setBillType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getOffset,
                ListCustomerselfResourceRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getLimit,
                ListCustomerselfResourceRecordsRequest::setLimit));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getResourceId,
                ListCustomerselfResourceRecordsRequest::setResourceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getEnterpriseProjectId,
                ListCustomerselfResourceRecordsRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("include_zero_record",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getIncludeZeroRecord,
                ListCustomerselfResourceRecordsRequest::setIncludeZeroRecord));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getMethod,
                ListCustomerselfResourceRecordsRequest::setMethod));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getSubCustomerId,
                ListCustomerselfResourceRecordsRequest::setSubCustomerId));
        builder.<String>withRequestField("trade_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getTradeId,
                ListCustomerselfResourceRecordsRequest::setTradeId));
        builder.<String>withRequestField("bill_date_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getBillDateBegin,
                ListCustomerselfResourceRecordsRequest::setBillDateBegin));
        builder.<String>withRequestField("bill_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getBillDateEnd,
                ListCustomerselfResourceRecordsRequest::setBillDateEnd));
        builder.<Integer>withRequestField("statistic_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getStatisticType,
                ListCustomerselfResourceRecordsRequest::setStatisticType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerselfResourceRecordsRequest::getXLanguage,
                ListCustomerselfResourceRecordsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseMultiAccountRequest, ListEnterpriseMultiAccountResponse> listEnterpriseMultiAccount =
        genForListEnterpriseMultiAccount();

    private static HttpRequestDef<ListEnterpriseMultiAccountRequest, ListEnterpriseMultiAccountResponse> genForListEnterpriseMultiAccount() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseMultiAccountRequest, ListEnterpriseMultiAccountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEnterpriseMultiAccountRequest.class,
                    ListEnterpriseMultiAccountResponse.class)
                .withName("ListEnterpriseMultiAccount")
                .withUri("/v2/enterprises/multi-accounts/retrieve-amount")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseMultiAccountRequest::getSubCustomerId,
                ListEnterpriseMultiAccountRequest::setSubCustomerId));
        builder.<String>withRequestField("balance_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseMultiAccountRequest::getBalanceType,
                ListEnterpriseMultiAccountRequest::setBalanceType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseMultiAccountRequest::getOffset,
                ListEnterpriseMultiAccountRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseMultiAccountRequest::getLimit,
                ListEnterpriseMultiAccountRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseOrganizationsRequest, ListEnterpriseOrganizationsResponse> listEnterpriseOrganizations =
        genForListEnterpriseOrganizations();

    private static HttpRequestDef<ListEnterpriseOrganizationsRequest, ListEnterpriseOrganizationsResponse> genForListEnterpriseOrganizations() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseOrganizationsRequest, ListEnterpriseOrganizationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEnterpriseOrganizationsRequest.class,
                    ListEnterpriseOrganizationsResponse.class)
                .withName("ListEnterpriseOrganizations")
                .withUri("/v2/enterprises/multi-accounts/enterprise-organizations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("recursive_query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseOrganizationsRequest::getRecursiveQuery,
                ListEnterpriseOrganizationsRequest::setRecursiveQuery));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseOrganizationsRequest::getParentId,
                ListEnterpriseOrganizationsRequest::setParentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseSubCustomersRequest, ListEnterpriseSubCustomersResponse> listEnterpriseSubCustomers =
        genForListEnterpriseSubCustomers();

    private static HttpRequestDef<ListEnterpriseSubCustomersRequest, ListEnterpriseSubCustomersResponse> genForListEnterpriseSubCustomers() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseSubCustomersRequest, ListEnterpriseSubCustomersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEnterpriseSubCustomersRequest.class,
                    ListEnterpriseSubCustomersResponse.class)
                .withName("ListEnterpriseSubCustomers")
                .withUri("/v2/enterprises/multi-accounts/sub-customers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_customer_account_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getSubCustomerAccountName,
                ListEnterpriseSubCustomersRequest::setSubCustomerAccountName));
        builder.<String>withRequestField("sub_customer_display_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getSubCustomerDisplayName,
                ListEnterpriseSubCustomersRequest::setSubCustomerDisplayName));
        builder.<Integer>withRequestField("fuzzy_query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getFuzzyQuery,
                ListEnterpriseSubCustomersRequest::setFuzzyQuery));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getOffset,
                ListEnterpriseSubCustomersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getLimit,
                ListEnterpriseSubCustomersRequest::setLimit));
        builder.<String>withRequestField("org_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseSubCustomersRequest::getOrgId,
                ListEnterpriseSubCustomersRequest::setOrgId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse> listFreeResourceInfos =
        genForListFreeResourceInfos();

    private static HttpRequestDef<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse> genForListFreeResourceInfos() {
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
            f -> f.withMarshaller(ListFreeResourceInfosRequest::getXLanguage,
                ListFreeResourceInfosRequest::setXLanguage));
        builder.<ListFreeResourceInfosReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFreeResourceInfosReq.class),
            f -> f.withMarshaller(ListFreeResourceInfosRequest::getBody, ListFreeResourceInfosRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> listFreeResourceUsages =
        genForListFreeResourceUsages();

    private static HttpRequestDef<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> genForListFreeResourceUsages() {
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
            f -> f.withMarshaller(ListFreeResourceUsagesRequest::getXLanguage,
                ListFreeResourceUsagesRequest::setXLanguage));
        builder.<ListFreeResourceUsagesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFreeResourceUsagesReq.class),
            f -> f.withMarshaller(ListFreeResourceUsagesRequest::getBody, ListFreeResourceUsagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFreeResourcesUsageRecordsRequest, ListFreeResourcesUsageRecordsResponse> listFreeResourcesUsageRecords =
        genForListFreeResourcesUsageRecords();

    private static HttpRequestDef<ListFreeResourcesUsageRecordsRequest, ListFreeResourcesUsageRecordsResponse> genForListFreeResourcesUsageRecords() {
        // basic
        HttpRequestDef.Builder<ListFreeResourcesUsageRecordsRequest, ListFreeResourcesUsageRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListFreeResourcesUsageRecordsRequest.class,
                    ListFreeResourcesUsageRecordsResponse.class)
                .withName("ListFreeResourcesUsageRecords")
                .withUri("/v2/bills/customer-bills/free-resources-usage-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("free_resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFreeResourcesUsageRecordsRequest::getFreeResourceId,
                ListFreeResourcesUsageRecordsRequest::setFreeResourceId));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFreeResourcesUsageRecordsRequest::getProductId,
                ListFreeResourcesUsageRecordsRequest::setProductId));
        builder.<String>withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFreeResourcesUsageRecordsRequest::getResourceTypeCode,
                ListFreeResourcesUsageRecordsRequest::setResourceTypeCode));
        builder.<String>withRequestField("deduct_time_begin",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFreeResourcesUsageRecordsRequest::getDeductTimeBegin,
                ListFreeResourcesUsageRecordsRequest::setDeductTimeBegin));
        builder.<String>withRequestField("deduct_time_end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFreeResourcesUsageRecordsRequest::getDeductTimeEnd,
                ListFreeResourcesUsageRecordsRequest::setDeductTimeEnd));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFreeResourcesUsageRecordsRequest::getOffset,
                ListFreeResourcesUsageRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFreeResourcesUsageRecordsRequest::getLimit,
                ListFreeResourcesUsageRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIncentiveDiscountPoliciesRequest, ListIncentiveDiscountPoliciesResponse> listIncentiveDiscountPolicies =
        genForListIncentiveDiscountPolicies();

    private static HttpRequestDef<ListIncentiveDiscountPoliciesRequest, ListIncentiveDiscountPoliciesResponse> genForListIncentiveDiscountPolicies() {
        // basic
        HttpRequestDef.Builder<ListIncentiveDiscountPoliciesRequest, ListIncentiveDiscountPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListIncentiveDiscountPoliciesRequest.class,
                    ListIncentiveDiscountPoliciesResponse.class)
                .withName("ListIncentiveDiscountPolicies")
                .withUri("/v2/products/incentive-discount-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncentiveDiscountPoliciesRequest::getTime,
                ListIncentiveDiscountPoliciesRequest::setTime));
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncentiveDiscountPoliciesRequest::getServiceTypeCode,
                ListIncentiveDiscountPoliciesRequest::setServiceTypeCode));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIncentiveDiscountPoliciesRequest::getOffset,
                ListIncentiveDiscountPoliciesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIncentiveDiscountPoliciesRequest::getLimit,
                ListIncentiveDiscountPoliciesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIndirectPartnersRequest, ListIndirectPartnersResponse> listIndirectPartners =
        genForListIndirectPartners();

    private static HttpRequestDef<ListIndirectPartnersRequest, ListIndirectPartnersResponse> genForListIndirectPartners() {
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
            f -> f.withMarshaller(ListIndirectPartnersRequest::getBody, ListIndirectPartnersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssuedCouponQuotasRequest, ListIssuedCouponQuotasResponse> listIssuedCouponQuotas =
        genForListIssuedCouponQuotas();

    private static HttpRequestDef<ListIssuedCouponQuotasRequest, ListIssuedCouponQuotasResponse> genForListIssuedCouponQuotas() {
        // basic
        HttpRequestDef.Builder<ListIssuedCouponQuotasRequest, ListIssuedCouponQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListIssuedCouponQuotasRequest.class, ListIssuedCouponQuotasResponse.class)
            .withName("ListIssuedCouponQuotas")
            .withUri("/v2/partners/issued-coupon-quotas")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getQuotaId,
                ListIssuedCouponQuotasRequest::setQuotaId));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getIndirectPartnerId,
                ListIssuedCouponQuotasRequest::setIndirectPartnerId));
        builder.<String>withRequestField("parent_quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getParentQuotaId,
                ListIssuedCouponQuotasRequest::setParentQuotaId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getOffset, ListIssuedCouponQuotasRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuedCouponQuotasRequest::getLimit, ListIssuedCouponQuotasRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssuedPartnerCouponsRequest, ListIssuedPartnerCouponsResponse> listIssuedPartnerCoupons =
        genForListIssuedPartnerCoupons();

    private static HttpRequestDef<ListIssuedPartnerCouponsRequest, ListIssuedPartnerCouponsResponse> genForListIssuedPartnerCoupons() {
        // basic
        HttpRequestDef.Builder<ListIssuedPartnerCouponsRequest, ListIssuedPartnerCouponsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListIssuedPartnerCouponsRequest.class, ListIssuedPartnerCouponsResponse.class)
                .withName("ListIssuedPartnerCoupons")
                .withUri("/v2/promotions/benefits/partner-coupons")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("coupon_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCouponId,
                ListIssuedPartnerCouponsRequest::setCouponId));
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCustomerId,
                ListIssuedPartnerCouponsRequest::setCustomerId));
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getOrderId,
                ListIssuedPartnerCouponsRequest::setOrderId));
        builder.<Integer>withRequestField("coupon_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCouponType,
                ListIssuedPartnerCouponsRequest::setCouponType));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getStatus,
                ListIssuedPartnerCouponsRequest::setStatus));
        builder.<String>withRequestField("create_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCreateTimeBegin,
                ListIssuedPartnerCouponsRequest::setCreateTimeBegin));
        builder.<String>withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getCreateTimeEnd,
                ListIssuedPartnerCouponsRequest::setCreateTimeEnd));
        builder.<String>withRequestField("effective_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getEffectiveTimeBegin,
                ListIssuedPartnerCouponsRequest::setEffectiveTimeBegin));
        builder.<String>withRequestField("effective_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getEffectiveTimeEnd,
                ListIssuedPartnerCouponsRequest::setEffectiveTimeEnd));
        builder.<String>withRequestField("expire_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getExpireTimeBegin,
                ListIssuedPartnerCouponsRequest::setExpireTimeBegin));
        builder.<String>withRequestField("expire_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getExpireTimeEnd,
                ListIssuedPartnerCouponsRequest::setExpireTimeEnd));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getOffset,
                ListIssuedPartnerCouponsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getLimit,
                ListIssuedPartnerCouponsRequest::setLimit));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuedPartnerCouponsRequest::getIndirectPartnerId,
                ListIssuedPartnerCouponsRequest::setIndirectPartnerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMeasureUnitsRequest, ListMeasureUnitsResponse> listMeasureUnits =
        genForListMeasureUnits();

    private static HttpRequestDef<ListMeasureUnitsRequest, ListMeasureUnitsResponse> genForListMeasureUnits() {
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
            f -> f.withMarshaller(ListMeasureUnitsRequest::getXLanguage, ListMeasureUnitsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMultiAccountRetrieveCouponsRequest, ListMultiAccountRetrieveCouponsResponse> listMultiAccountRetrieveCoupons =
        genForListMultiAccountRetrieveCoupons();

    private static HttpRequestDef<ListMultiAccountRetrieveCouponsRequest, ListMultiAccountRetrieveCouponsResponse> genForListMultiAccountRetrieveCoupons() {
        // basic
        HttpRequestDef.Builder<ListMultiAccountRetrieveCouponsRequest, ListMultiAccountRetrieveCouponsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMultiAccountRetrieveCouponsRequest.class,
                    ListMultiAccountRetrieveCouponsResponse.class)
                .withName("ListMultiAccountRetrieveCoupons")
                .withUri("/v2/enterprises/multi-accounts/retrieve-coupons")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMultiAccountRetrieveCouponsRequest::getSubCustomerId,
                ListMultiAccountRetrieveCouponsRequest::setSubCustomerId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMultiAccountRetrieveCouponsRequest::getOffset,
                ListMultiAccountRetrieveCouponsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMultiAccountRetrieveCouponsRequest::getLimit,
                ListMultiAccountRetrieveCouponsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMultiAccountTransferCouponsRequest, ListMultiAccountTransferCouponsResponse> listMultiAccountTransferCoupons =
        genForListMultiAccountTransferCoupons();

    private static HttpRequestDef<ListMultiAccountTransferCouponsRequest, ListMultiAccountTransferCouponsResponse> genForListMultiAccountTransferCoupons() {
        // basic
        HttpRequestDef.Builder<ListMultiAccountTransferCouponsRequest, ListMultiAccountTransferCouponsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMultiAccountTransferCouponsRequest.class,
                    ListMultiAccountTransferCouponsResponse.class)
                .withName("ListMultiAccountTransferCoupons")
                .withUri("/v2/enterprises/multi-accounts/transfer-coupons")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMultiAccountTransferCouponsRequest::getOffset,
                ListMultiAccountTransferCouponsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMultiAccountTransferCouponsRequest::getLimit,
                ListMultiAccountTransferCouponsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> listOnDemandResourceRatings =
        genForListOnDemandResourceRatings();

    private static HttpRequestDef<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> genForListOnDemandResourceRatings() {
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
            f -> f.withMarshaller(ListOnDemandResourceRatingsRequest::getBody,
                ListOnDemandResourceRatingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderId =
        genForListOrderCouponsByOrderId();

    private static HttpRequestDef<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse> genForListOrderCouponsByOrderId() {
        // basic
        HttpRequestDef.Builder<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListOrderCouponsByOrderIdRequest.class,
                    ListOrderCouponsByOrderIdResponse.class)
                .withName("ListOrderCouponsByOrderId")
                .withUri("/v2/orders/customer-orders/order-coupons")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderCouponsByOrderIdRequest::getOrderId,
                ListOrderCouponsByOrderIdRequest::setOrderId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrderDiscountsRequest, ListOrderDiscountsResponse> listOrderDiscounts =
        genForListOrderDiscounts();

    private static HttpRequestDef<ListOrderDiscountsRequest, ListOrderDiscountsResponse> genForListOrderDiscounts() {
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
            f -> f.withMarshaller(ListOrderDiscountsRequest::getOrderId, ListOrderDiscountsRequest::setOrderId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartnerAccountChangeRecordsRequest, ListPartnerAccountChangeRecordsResponse> listPartnerAccountChangeRecords =
        genForListPartnerAccountChangeRecords();

    private static HttpRequestDef<ListPartnerAccountChangeRecordsRequest, ListPartnerAccountChangeRecordsResponse> genForListPartnerAccountChangeRecords() {
        // basic
        HttpRequestDef.Builder<ListPartnerAccountChangeRecordsRequest, ListPartnerAccountChangeRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPartnerAccountChangeRecordsRequest.class,
                    ListPartnerAccountChangeRecordsResponse.class)
                .withName("ListPartnerAccountChangeRecords")
                .withUri("/v2/accounts/partner-accounts/account-change-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("balance_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAccountChangeRecordsRequest::getBalanceType,
                ListPartnerAccountChangeRecordsRequest::setBalanceType));
        builder.<String>withRequestField("trade_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAccountChangeRecordsRequest::getTradeType,
                ListPartnerAccountChangeRecordsRequest::setTradeType));
        builder.<String>withRequestField("trade_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAccountChangeRecordsRequest::getTradeTimeBegin,
                ListPartnerAccountChangeRecordsRequest::setTradeTimeBegin));
        builder.<String>withRequestField("trade_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAccountChangeRecordsRequest::getTradeTimeEnd,
                ListPartnerAccountChangeRecordsRequest::setTradeTimeEnd));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnerAccountChangeRecordsRequest::getOffset,
                ListPartnerAccountChangeRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnerAccountChangeRecordsRequest::getLimit,
                ListPartnerAccountChangeRecordsRequest::setLimit));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAccountChangeRecordsRequest::getIndirectPartnerId,
                ListPartnerAccountChangeRecordsRequest::setIndirectPartnerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartnerAdjustRecordsRequest, ListPartnerAdjustRecordsResponse> listPartnerAdjustRecords =
        genForListPartnerAdjustRecords();

    private static HttpRequestDef<ListPartnerAdjustRecordsRequest, ListPartnerAdjustRecordsResponse> genForListPartnerAdjustRecords() {
        // basic
        HttpRequestDef.Builder<ListPartnerAdjustRecordsRequest, ListPartnerAdjustRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListPartnerAdjustRecordsRequest.class, ListPartnerAdjustRecordsResponse.class)
                .withName("ListPartnerAdjustRecords")
                .withUri("/v3/accounts/partner-accounts/adjust-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getCustomerId,
                ListPartnerAdjustRecordsRequest::setCustomerId));
        builder.<String>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getOperationType,
                ListPartnerAdjustRecordsRequest::setOperationType));
        builder.<String>withRequestField("operation_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getOperationTimeBegin,
                ListPartnerAdjustRecordsRequest::setOperationTimeBegin));
        builder.<String>withRequestField("operation_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getOperationTimeEnd,
                ListPartnerAdjustRecordsRequest::setOperationTimeEnd));
        builder.<String>withRequestField("trans_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getTransId,
                ListPartnerAdjustRecordsRequest::setTransId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getOffset,
                ListPartnerAdjustRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getLimit,
                ListPartnerAdjustRecordsRequest::setLimit));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerAdjustRecordsRequest::getIndirectPartnerId,
                ListPartnerAdjustRecordsRequest::setIndirectPartnerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartnerBalancesRequest, ListPartnerBalancesResponse> listPartnerBalances =
        genForListPartnerBalances();

    private static HttpRequestDef<ListPartnerBalancesRequest, ListPartnerBalancesResponse> genForListPartnerBalances() {
        // basic
        HttpRequestDef.Builder<ListPartnerBalancesRequest, ListPartnerBalancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPartnerBalancesRequest.class, ListPartnerBalancesResponse.class)
                .withName("ListPartnerBalances")
                .withUri("/v2/accounts/partner-accounts/balances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerBalancesRequest::getIndirectPartnerId,
                ListPartnerBalancesRequest::setIndirectPartnerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartnerCouponsRecordRequest, ListPartnerCouponsRecordResponse> listPartnerCouponsRecord =
        genForListPartnerCouponsRecord();

    private static HttpRequestDef<ListPartnerCouponsRecordRequest, ListPartnerCouponsRecordResponse> genForListPartnerCouponsRecord() {
        // basic
        HttpRequestDef.Builder<ListPartnerCouponsRecordRequest, ListPartnerCouponsRecordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListPartnerCouponsRecordRequest.class, ListPartnerCouponsRecordResponse.class)
                .withName("ListPartnerCouponsRecord")
                .withUri("/v2/promotions/benefits/partner-coupons/records/query")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("operation_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getOperationTypes,
                ListPartnerCouponsRecordRequest::setOperationTypes));
        builder.<String>withRequestField("quota_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getQuotaId,
                ListPartnerCouponsRecordRequest::setQuotaId));
        builder.<Integer>withRequestField("quota_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getQuotaType,
                ListPartnerCouponsRecordRequest::setQuotaType));
        builder.<List<String>>withRequestField("coupon_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getCouponIds,
                ListPartnerCouponsRecordRequest::setCouponIds));
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getCustomerId,
                ListPartnerCouponsRecordRequest::setCustomerId));
        builder.<String>withRequestField("operation_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getOperationTimeBegin,
                ListPartnerCouponsRecordRequest::setOperationTimeBegin));
        builder.<String>withRequestField("operation_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getOperationTimeEnd,
                ListPartnerCouponsRecordRequest::setOperationTimeEnd));
        builder.<String>withRequestField("result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getResult,
                ListPartnerCouponsRecordRequest::setResult));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getOffset,
                ListPartnerCouponsRecordRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getLimit,
                ListPartnerCouponsRecordRequest::setLimit));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartnerCouponsRecordRequest::getIndirectPartnerId,
                ListPartnerCouponsRecordRequest::setIndirectPartnerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResources =
        genForListPayPerUseCustomerResources();

    private static HttpRequestDef<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> genForListPayPerUseCustomerResources() {
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
            f -> f.withMarshaller(ListPayPerUseCustomerResourcesRequest::getBody,
                ListPayPerUseCustomerResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProvincesRequest, ListProvincesResponse> listProvinces =
        genForListProvinces();

    private static HttpRequestDef<ListProvincesRequest, ListProvincesResponse> genForListProvinces() {
        // basic
        HttpRequestDef.Builder<ListProvincesRequest, ListProvincesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProvincesRequest.class, ListProvincesResponse.class)
                .withName("ListProvinces")
                .withUri("/v2/systems/configs/provinces")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvincesRequest::getOffset, ListProvincesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvincesRequest::getLimit, ListProvincesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProvincesRequest::getXLanguage, ListProvincesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaCouponsRequest, ListQuotaCouponsResponse> listQuotaCoupons =
        genForListQuotaCoupons();

    private static HttpRequestDef<ListQuotaCouponsRequest, ListQuotaCouponsResponse> genForListQuotaCoupons() {
        // basic
        HttpRequestDef.Builder<ListQuotaCouponsRequest, ListQuotaCouponsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQuotaCouponsRequest.class, ListQuotaCouponsResponse.class)
                .withName("ListQuotaCoupons")
                .withUri("/v2/partners/coupon-quotas/query")
                .withContentType("application/json");

        // requests
        builder.<QueryCouponQuotasReqExt>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryCouponQuotasReqExt.class),
            f -> f.withMarshaller(ListQuotaCouponsRequest::getBody, ListQuotaCouponsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> listRateOnPeriodDetail =
        genForListRateOnPeriodDetail();

    private static HttpRequestDef<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> genForListRateOnPeriodDetail() {
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
            f -> f.withMarshaller(ListRateOnPeriodDetailRequest::getBody, ListRateOnPeriodDetailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRenewRateOnPeriodRequest, ListRenewRateOnPeriodResponse> listRenewRateOnPeriod =
        genForListRenewRateOnPeriod();

    private static HttpRequestDef<ListRenewRateOnPeriodRequest, ListRenewRateOnPeriodResponse> genForListRenewRateOnPeriod() {
        // basic
        HttpRequestDef.Builder<ListRenewRateOnPeriodRequest, ListRenewRateOnPeriodResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListRenewRateOnPeriodRequest.class, ListRenewRateOnPeriodResponse.class)
            .withName("ListRenewRateOnPeriod")
            .withUri("/v2/bills/ratings/period-resources/renew-rate")
            .withContentType("application/json");

        // requests
        builder.<ListRenewRateOnPeriodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRenewRateOnPeriodReq.class),
            f -> f.withMarshaller(ListRenewRateOnPeriodRequest::getBody, ListRenewRateOnPeriodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTypesRequest, ListResourceTypesResponse> listResourceTypes =
        genForListResourceTypes();

    private static HttpRequestDef<ListResourceTypesRequest, ListResourceTypesResponse> genForListResourceTypes() {
        // basic
        HttpRequestDef.Builder<ListResourceTypesRequest, ListResourceTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTypesRequest.class, ListResourceTypesResponse.class)
                .withName("ListResourceTypes")
                .withUri("/v2/products/resource-types")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceTypesRequest::getLimit, ListResourceTypesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceTypesRequest::getOffset, ListResourceTypesRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTypesRequest::getXLanguage, ListResourceTypesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceUsageRequest, ListResourceUsageResponse> listResourceUsage =
        genForListResourceUsage();

    private static HttpRequestDef<ListResourceUsageRequest, ListResourceUsageResponse> genForListResourceUsage() {
        // basic
        HttpRequestDef.Builder<ListResourceUsageRequest, ListResourceUsageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceUsageRequest.class, ListResourceUsageResponse.class)
                .withName("ListResourceUsage")
                .withUri("/v2/bills/customer-bills/resources/usage/details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bill_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageRequest::getBillCycle, ListResourceUsageRequest::setBillCycle));
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageRequest::getServiceTypeCode,
                ListResourceUsageRequest::setServiceTypeCode));
        builder.<String>withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageRequest::getResourceTypeCode,
                ListResourceUsageRequest::setResourceTypeCode));
        builder.<String>withRequestField("usage_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageRequest::getUsageType, ListResourceUsageRequest::setUsageType));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageRequest::getResourceId, ListResourceUsageRequest::setResourceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceUsageRequest::getOffset, ListResourceUsageRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceUsageRequest::getLimit, ListResourceUsageRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageRequest::getXLanguage, ListResourceUsageRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceUsageSummaryRequest, ListResourceUsageSummaryResponse> listResourceUsageSummary =
        genForListResourceUsageSummary();

    private static HttpRequestDef<ListResourceUsageSummaryRequest, ListResourceUsageSummaryResponse> genForListResourceUsageSummary() {
        // basic
        HttpRequestDef.Builder<ListResourceUsageSummaryRequest, ListResourceUsageSummaryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListResourceUsageSummaryRequest.class, ListResourceUsageSummaryResponse.class)
                .withName("ListResourceUsageSummary")
                .withUri("/v2/bills/customer-bills/resources/usage/summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bill_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageSummaryRequest::getBillCycle,
                ListResourceUsageSummaryRequest::setBillCycle));
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageSummaryRequest::getServiceTypeCode,
                ListResourceUsageSummaryRequest::setServiceTypeCode));
        builder.<String>withRequestField("resource_type_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageSummaryRequest::getResourceTypeCode,
                ListResourceUsageSummaryRequest::setResourceTypeCode));
        builder.<String>withRequestField("usage_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageSummaryRequest::getUsageType,
                ListResourceUsageSummaryRequest::setUsageType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceUsageSummaryRequest::getOffset,
                ListResourceUsageSummaryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceUsageSummaryRequest::getLimit,
                ListResourceUsageSummaryRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUsageSummaryRequest::getXLanguage,
                ListResourceUsageSummaryRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceResourcesRequest, ListServiceResourcesResponse> listServiceResources =
        genForListServiceResources();

    private static HttpRequestDef<ListServiceResourcesRequest, ListServiceResourcesResponse> genForListServiceResources() {
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
            f -> f.withMarshaller(ListServiceResourcesRequest::getServiceTypeCode,
                ListServiceResourcesRequest::setServiceTypeCode));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceResourcesRequest::getLimit, ListServiceResourcesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceResourcesRequest::getOffset, ListServiceResourcesRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceResourcesRequest::getXLanguage,
                ListServiceResourcesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceTypesRequest, ListServiceTypesResponse> listServiceTypes =
        genForListServiceTypes();

    private static HttpRequestDef<ListServiceTypesRequest, ListServiceTypesResponse> genForListServiceTypes() {
        // basic
        HttpRequestDef.Builder<ListServiceTypesRequest, ListServiceTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceTypesRequest.class, ListServiceTypesResponse.class)
                .withName("ListServiceTypes")
                .withUri("/v2/products/service-types")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceTypesRequest::getLimit, ListServiceTypesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceTypesRequest::getOffset, ListServiceTypesRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceTypesRequest::getXLanguage, ListServiceTypesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoredValueCardsRequest, ListStoredValueCardsResponse> listStoredValueCards =
        genForListStoredValueCards();

    private static HttpRequestDef<ListStoredValueCardsRequest, ListStoredValueCardsResponse> genForListStoredValueCards() {
        // basic
        HttpRequestDef.Builder<ListStoredValueCardsRequest, ListStoredValueCardsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListStoredValueCardsRequest.class, ListStoredValueCardsResponse.class)
            .withName("ListStoredValueCards")
            .withUri("/v2/promotions/benefits/stored-value-cards")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoredValueCardsRequest::getStatus, ListStoredValueCardsRequest::setStatus));
        builder.<String>withRequestField("card_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoredValueCardsRequest::getCardId, ListStoredValueCardsRequest::setCardId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoredValueCardsRequest::getOffset, ListStoredValueCardsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoredValueCardsRequest::getLimit, ListStoredValueCardsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomerBillDetailRequest, ListSubCustomerBillDetailResponse> listSubCustomerBillDetail =
        genForListSubCustomerBillDetail();

    private static HttpRequestDef<ListSubCustomerBillDetailRequest, ListSubCustomerBillDetailResponse> genForListSubCustomerBillDetail() {
        // basic
        HttpRequestDef.Builder<ListSubCustomerBillDetailRequest, ListSubCustomerBillDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSubCustomerBillDetailRequest.class,
                    ListSubCustomerBillDetailResponse.class)
                .withName("ListSubCustomerBillDetail")
                .withUri("/v2/bills/subcustomer-bills/res-fee-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bill_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getBillCycle,
                ListSubCustomerBillDetailRequest::setBillCycle));
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getCustomerId,
                ListSubCustomerBillDetailRequest::setCustomerId));
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getServiceTypeCode,
                ListSubCustomerBillDetailRequest::setServiceTypeCode));
        builder.<String>withRequestField("region_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getRegionCode,
                ListSubCustomerBillDetailRequest::setRegionCode));
        builder.<Integer>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getChargingMode,
                ListSubCustomerBillDetailRequest::setChargingMode));
        builder.<Integer>withRequestField("bill_detail_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getBillDetailType,
                ListSubCustomerBillDetailRequest::setBillDetailType));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getResourceId,
                ListSubCustomerBillDetailRequest::setResourceId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getResourceName,
                ListSubCustomerBillDetailRequest::setResourceName));
        builder.<String>withRequestField("trade_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getTradeId,
                ListSubCustomerBillDetailRequest::setTradeId));
        builder.<String>withRequestField("account_manager_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getAccountManagerId,
                ListSubCustomerBillDetailRequest::setAccountManagerId));
        builder.<String>withRequestField("association_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getAssociationType,
                ListSubCustomerBillDetailRequest::setAssociationType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getOffset,
                ListSubCustomerBillDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getLimit,
                ListSubCustomerBillDetailRequest::setLimit));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getIndirectPartnerId,
                ListSubCustomerBillDetailRequest::setIndirectPartnerId));
        builder.<String>withRequestField("bill_date_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getBillDateBegin,
                ListSubCustomerBillDetailRequest::setBillDateBegin));
        builder.<String>withRequestField("bill_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getBillDateEnd,
                ListSubCustomerBillDetailRequest::setBillDateEnd));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerBillDetailRequest::getXLanguage,
                ListSubCustomerBillDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> listSubCustomerCoupons =
        genForListSubCustomerCoupons();

    private static HttpRequestDef<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> genForListSubCustomerCoupons() {
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
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getCouponId,
                ListSubCustomerCouponsRequest::setCouponId));
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getOrderId,
                ListSubCustomerCouponsRequest::setOrderId));
        builder.<String>withRequestField("promotion_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getPromotionPlanId,
                ListSubCustomerCouponsRequest::setPromotionPlanId));
        builder.<Integer>withRequestField("coupon_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getCouponType,
                ListSubCustomerCouponsRequest::setCouponType));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getStatus, ListSubCustomerCouponsRequest::setStatus));
        builder.<String>withRequestField("active_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getActiveStartTime,
                ListSubCustomerCouponsRequest::setActiveStartTime));
        builder.<String>withRequestField("active_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getActiveEndTime,
                ListSubCustomerCouponsRequest::setActiveEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getOffset, ListSubCustomerCouponsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getLimit, ListSubCustomerCouponsRequest::setLimit));
        builder.<String>withRequestField("source_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getSourceId,
                ListSubCustomerCouponsRequest::setSourceId));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomerCouponsRequest::getIndirectPartnerId,
                ListSubCustomerCouponsRequest::setIndirectPartnerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomerNewTagRequest, ListSubCustomerNewTagResponse> listSubCustomerNewTag =
        genForListSubCustomerNewTag();

    private static HttpRequestDef<ListSubCustomerNewTagRequest, ListSubCustomerNewTagResponse> genForListSubCustomerNewTag() {
        // basic
        HttpRequestDef.Builder<ListSubCustomerNewTagRequest, ListSubCustomerNewTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListSubCustomerNewTagRequest.class, ListSubCustomerNewTagResponse.class)
            .withName("ListSubCustomerNewTag")
            .withUri("/v2/partners/sub-customers/new-customers-tags/batch-query")
            .withContentType("application/json");

        // requests
        builder.<ListSubCustomerNewTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSubCustomerNewTagReq.class),
            f -> f.withMarshaller(ListSubCustomerNewTagRequest::getBody, ListSubCustomerNewTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomers =
        genForListSubCustomers();

    private static HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> genForListSubCustomers() {
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
            f -> f.withMarshaller(ListSubCustomersRequest::getBody, ListSubCustomersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubcustomerMonthlyBillsRequest, ListSubcustomerMonthlyBillsResponse> listSubcustomerMonthlyBills =
        genForListSubcustomerMonthlyBills();

    private static HttpRequestDef<ListSubcustomerMonthlyBillsRequest, ListSubcustomerMonthlyBillsResponse> genForListSubcustomerMonthlyBills() {
        // basic
        HttpRequestDef.Builder<ListSubcustomerMonthlyBillsRequest, ListSubcustomerMonthlyBillsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSubcustomerMonthlyBillsRequest.class,
                    ListSubcustomerMonthlyBillsResponse.class)
                .withName("ListSubcustomerMonthlyBills")
                .withUri("/v2/bills/partner-bills/subcustomer-bills/monthly-sum")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getCustomerId,
                ListSubcustomerMonthlyBillsRequest::setCustomerId));
        builder.<String>withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getCycle,
                ListSubcustomerMonthlyBillsRequest::setCycle));
        builder.<String>withRequestField("cloud_service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getCloudServiceType,
                ListSubcustomerMonthlyBillsRequest::setCloudServiceType));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getChargeMode,
                ListSubcustomerMonthlyBillsRequest::setChargeMode));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getOffset,
                ListSubcustomerMonthlyBillsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getLimit,
                ListSubcustomerMonthlyBillsRequest::setLimit));
        builder.<String>withRequestField("bill_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getBillType,
                ListSubcustomerMonthlyBillsRequest::setBillType));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubcustomerMonthlyBillsRequest::getIndirectPartnerId,
                ListSubcustomerMonthlyBillsRequest::setIndirectPartnerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsageTypesRequest, ListUsageTypesResponse> listUsageTypes =
        genForListUsageTypes();

    private static HttpRequestDef<ListUsageTypesRequest, ListUsageTypesResponse> genForListUsageTypes() {
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
            f -> f.withMarshaller(ListUsageTypesRequest::getResourceTypeCode,
                ListUsageTypesRequest::setResourceTypeCode));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageTypesRequest::getOffset, ListUsageTypesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageTypesRequest::getLimit, ListUsageTypesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsageTypesRequest::getXLanguage, ListUsageTypesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PayOrdersRequest, PayOrdersResponse> payOrders = genForPayOrders();

    private static HttpRequestDef<PayOrdersRequest, PayOrdersResponse> genForPayOrders() {
        // basic
        HttpRequestDef.Builder<PayOrdersRequest, PayOrdersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PayOrdersRequest.class, PayOrdersResponse.class)
                .withName("PayOrders")
                .withUri("/v3/orders/customer-orders/pay")
                .withContentType("application/json");

        // requests
        builder.<PayCustomerOrderV3Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PayCustomerOrderV3Req.class),
            f -> f.withMarshaller(PayOrdersRequest::getBody, PayOrdersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReclaimCouponQuotasRequest, ReclaimCouponQuotasResponse> reclaimCouponQuotas =
        genForReclaimCouponQuotas();

    private static HttpRequestDef<ReclaimCouponQuotasRequest, ReclaimCouponQuotasResponse> genForReclaimCouponQuotas() {
        // basic
        HttpRequestDef.Builder<ReclaimCouponQuotasRequest, ReclaimCouponQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReclaimCouponQuotasRequest.class, ReclaimCouponQuotasResponse.class)
                .withName("ReclaimCouponQuotas")
                .withUri("/v2/partners/coupon-quotas/indirect-partner-reclaim")
                .withContentType("application/json");

        // requests
        builder.<ReclaimCouponQuotasReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReclaimCouponQuotasReq.class),
            f -> f.withMarshaller(ReclaimCouponQuotasRequest::getBody, ReclaimCouponQuotasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReclaimEnterpriseMultiAccountCouponRequest, ReclaimEnterpriseMultiAccountCouponResponse> reclaimEnterpriseMultiAccountCoupon =
        genForReclaimEnterpriseMultiAccountCoupon();

    private static HttpRequestDef<ReclaimEnterpriseMultiAccountCouponRequest, ReclaimEnterpriseMultiAccountCouponResponse> genForReclaimEnterpriseMultiAccountCoupon() {
        // basic
        HttpRequestDef.Builder<ReclaimEnterpriseMultiAccountCouponRequest, ReclaimEnterpriseMultiAccountCouponResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ReclaimEnterpriseMultiAccountCouponRequest.class,
                    ReclaimEnterpriseMultiAccountCouponResponse.class)
                .withName("ReclaimEnterpriseMultiAccountCoupon")
                .withUri("/v2/enterprises/multi-accounts/retrieve-coupon")
                .withContentType("application/json");

        // requests
        builder.<RetrieveEnterpriseMultiAccountCouponReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RetrieveEnterpriseMultiAccountCouponReq.class),
            f -> f.withMarshaller(ReclaimEnterpriseMultiAccountCouponRequest::getBody,
                ReclaimEnterpriseMultiAccountCouponRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReclaimIndirectPartnerAccountRequest, ReclaimIndirectPartnerAccountResponse> reclaimIndirectPartnerAccount =
        genForReclaimIndirectPartnerAccount();

    private static HttpRequestDef<ReclaimIndirectPartnerAccountRequest, ReclaimIndirectPartnerAccountResponse> genForReclaimIndirectPartnerAccount() {
        // basic
        HttpRequestDef.Builder<ReclaimIndirectPartnerAccountRequest, ReclaimIndirectPartnerAccountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ReclaimIndirectPartnerAccountRequest.class,
                    ReclaimIndirectPartnerAccountResponse.class)
                .withName("ReclaimIndirectPartnerAccount")
                .withUri("/v2/accounts/partner-accounts/indirect-partner-reclaim")
                .withContentType("application/json");

        // requests
        builder.<ReclaimIndirectPartnerAccountReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReclaimIndirectPartnerAccountReq.class),
            f -> f.withMarshaller(ReclaimIndirectPartnerAccountRequest::getBody,
                ReclaimIndirectPartnerAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReclaimPartnerCouponsRequest, ReclaimPartnerCouponsResponse> reclaimPartnerCoupons =
        genForReclaimPartnerCoupons();

    private static HttpRequestDef<ReclaimPartnerCouponsRequest, ReclaimPartnerCouponsResponse> genForReclaimPartnerCoupons() {
        // basic
        HttpRequestDef.Builder<ReclaimPartnerCouponsRequest, ReclaimPartnerCouponsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ReclaimPartnerCouponsRequest.class, ReclaimPartnerCouponsResponse.class)
            .withName("ReclaimPartnerCoupons")
            .withUri("/v2/promotions/benefits/partner-coupons/reclaim")
            .withContentType("application/json");

        // requests
        builder.<ReclaimPartnerCouponsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReclaimPartnerCouponsReq.class),
            f -> f.withMarshaller(ReclaimPartnerCouponsRequest::getBody, ReclaimPartnerCouponsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReclaimSubEnterpriseAmountRequest, ReclaimSubEnterpriseAmountResponse> reclaimSubEnterpriseAmount =
        genForReclaimSubEnterpriseAmount();

    private static HttpRequestDef<ReclaimSubEnterpriseAmountRequest, ReclaimSubEnterpriseAmountResponse> genForReclaimSubEnterpriseAmount() {
        // basic
        HttpRequestDef.Builder<ReclaimSubEnterpriseAmountRequest, ReclaimSubEnterpriseAmountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ReclaimSubEnterpriseAmountRequest.class,
                    ReclaimSubEnterpriseAmountResponse.class)
                .withName("ReclaimSubEnterpriseAmount")
                .withUri("/v2/enterprises/multi-accounts/retrieve-amount")
                .withContentType("application/json");

        // requests
        builder.<RetrieveEnterpriseMultiAccountReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RetrieveEnterpriseMultiAccountReq.class),
            f -> f.withMarshaller(ReclaimSubEnterpriseAmountRequest::getBody,
                ReclaimSubEnterpriseAmountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReclaimToPartnerAccountRequest, ReclaimToPartnerAccountResponse> reclaimToPartnerAccount =
        genForReclaimToPartnerAccount();

    private static HttpRequestDef<ReclaimToPartnerAccountRequest, ReclaimToPartnerAccountResponse> genForReclaimToPartnerAccount() {
        // basic
        HttpRequestDef.Builder<ReclaimToPartnerAccountRequest, ReclaimToPartnerAccountResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ReclaimToPartnerAccountRequest.class, ReclaimToPartnerAccountResponse.class)
            .withName("ReclaimToPartnerAccount")
            .withUri("/v2/accounts/partner-accounts/reclaim")
            .withContentType("application/json");

        // requests
        builder.<ReclaimToPartnerAccountBalancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReclaimToPartnerAccountBalancesReq.class),
            f -> f.withMarshaller(ReclaimToPartnerAccountRequest::getBody, ReclaimToPartnerAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenewalResourcesRequest, RenewalResourcesResponse> renewalResources =
        genForRenewalResources();

    private static HttpRequestDef<RenewalResourcesRequest, RenewalResourcesResponse> genForRenewalResources() {
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
            f -> f.withMarshaller(RenewalResourcesRequest::getBody, RenewalResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendSmsVerificationCodeRequest, SendSmsVerificationCodeResponse> sendSmsVerificationCode =
        genForSendSmsVerificationCode();

    private static HttpRequestDef<SendSmsVerificationCodeRequest, SendSmsVerificationCodeResponse> genForSendSmsVerificationCode() {
        // basic
        HttpRequestDef.Builder<SendSmsVerificationCodeRequest, SendSmsVerificationCodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SendSmsVerificationCodeRequest.class, SendSmsVerificationCodeResponse.class)
            .withName("SendSmsVerificationCode")
            .withUri("/v2/enterprises/multi-accounts/sm-verification-code")
            .withContentType("application/json");

        // requests
        builder.<SendSmVerificationCodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendSmVerificationCodeReq.class),
            f -> f.withMarshaller(SendSmsVerificationCodeRequest::getBody, SendSmsVerificationCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> sendVerificationMessageCode =
        genForSendVerificationMessageCode();

    private static HttpRequestDef<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> genForSendVerificationMessageCode() {
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
            f -> f.withMarshaller(SendVerificationMessageCodeRequest::getBody,
                SendVerificationMessageCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> showCustomerAccountBalances =
        genForShowCustomerAccountBalances();

    private static HttpRequestDef<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> genForShowCustomerAccountBalances() {
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

    public static final HttpRequestDef<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse> showCustomerMonthlySum =
        genForShowCustomerMonthlySum();

    private static HttpRequestDef<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse> genForShowCustomerMonthlySum() {
        // basic
        HttpRequestDef.Builder<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCustomerMonthlySumRequest.class, ShowCustomerMonthlySumResponse.class)
            .withName("ShowCustomerMonthlySum")
            .withUri("/v2/bills/customer-bills/monthly-sum")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bill_cycle",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getBillCycle,
                ShowCustomerMonthlySumRequest::setBillCycle));
        builder.<String>withRequestField("service_type_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getServiceTypeCode,
                ShowCustomerMonthlySumRequest::setServiceTypeCode));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getEnterpriseProjectId,
                ShowCustomerMonthlySumRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getOffset, ShowCustomerMonthlySumRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getLimit, ShowCustomerMonthlySumRequest::setLimit));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getMethod, ShowCustomerMonthlySumRequest::setMethod));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerMonthlySumRequest::getSubCustomerId,
                ShowCustomerMonthlySumRequest::setSubCustomerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> showCustomerOrderDetails =
        genForShowCustomerOrderDetails();

    private static HttpRequestDef<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> genForShowCustomerOrderDetails() {
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
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getOrderId,
                ShowCustomerOrderDetailsRequest::setOrderId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getLimit,
                ShowCustomerOrderDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getOffset,
                ShowCustomerOrderDetailsRequest::setOffset));
        builder.<String>withRequestField("indirect_partner_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getIndirectPartnerId,
                ShowCustomerOrderDetailsRequest::setIndirectPartnerId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerOrderDetailsRequest::getXLanguage,
                ShowCustomerOrderDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMultiAccountTransferAmountRequest, ShowMultiAccountTransferAmountResponse> showMultiAccountTransferAmount =
        genForShowMultiAccountTransferAmount();

    private static HttpRequestDef<ShowMultiAccountTransferAmountRequest, ShowMultiAccountTransferAmountResponse> genForShowMultiAccountTransferAmount() {
        // basic
        HttpRequestDef.Builder<ShowMultiAccountTransferAmountRequest, ShowMultiAccountTransferAmountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMultiAccountTransferAmountRequest.class,
                    ShowMultiAccountTransferAmountResponse.class)
                .withName("ShowMultiAccountTransferAmount")
                .withUri("/v2/enterprises/multi-accounts/transfer-amount")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("balance_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMultiAccountTransferAmountRequest::getBalanceType,
                ShowMultiAccountTransferAmountRequest::setBalanceType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMultiAccountTransferAmountRequest::getOffset,
                ShowMultiAccountTransferAmountRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMultiAccountTransferAmountRequest::getLimit,
                ShowMultiAccountTransferAmountRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResult =
        genForShowRealnameAuthenticationReviewResult();

    private static HttpRequestDef<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> genForShowRealnameAuthenticationReviewResult() {
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
            f -> f.withMarshaller(ShowRealnameAuthenticationReviewResultRequest::getCustomerId,
                ShowRealnameAuthenticationReviewResultRequest::setCustomerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> showRefundOrderDetails =
        genForShowRefundOrderDetails();

    private static HttpRequestDef<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> genForShowRefundOrderDetails() {
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
            f -> f.withMarshaller(ShowRefundOrderDetailsRequest::getOrderId,
                ShowRefundOrderDetailsRequest::setOrderId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCouponQuotasRequest, UpdateCouponQuotasResponse> updateCouponQuotas =
        genForUpdateCouponQuotas();

    private static HttpRequestDef<UpdateCouponQuotasRequest, UpdateCouponQuotasResponse> genForUpdateCouponQuotas() {
        // basic
        HttpRequestDef.Builder<UpdateCouponQuotasRequest, UpdateCouponQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCouponQuotasRequest.class, UpdateCouponQuotasResponse.class)
                .withName("UpdateCouponQuotas")
                .withUri("/v2/partners/coupon-quotas/indirect-partner-adjust")
                .withContentType("application/json");

        // requests
        builder.<AdjustCouponQuotasReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdjustCouponQuotasReq.class),
            f -> f.withMarshaller(UpdateCouponQuotasRequest::getBody, UpdateCouponQuotasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomerAccountAmountRequest, UpdateCustomerAccountAmountResponse> updateCustomerAccountAmount =
        genForUpdateCustomerAccountAmount();

    private static HttpRequestDef<UpdateCustomerAccountAmountRequest, UpdateCustomerAccountAmountResponse> genForUpdateCustomerAccountAmount() {
        // basic
        HttpRequestDef.Builder<UpdateCustomerAccountAmountRequest, UpdateCustomerAccountAmountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateCustomerAccountAmountRequest.class,
                    UpdateCustomerAccountAmountResponse.class)
                .withName("UpdateCustomerAccountAmount")
                .withUri("/v2/accounts/partner-accounts/adjust-amount")
                .withContentType("application/json");

        // requests
        builder.<AdjustAccountReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdjustAccountReq.class),
            f -> f.withMarshaller(UpdateCustomerAccountAmountRequest::getBody,
                UpdateCustomerAccountAmountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIndirectPartnerAccountRequest, UpdateIndirectPartnerAccountResponse> updateIndirectPartnerAccount =
        genForUpdateIndirectPartnerAccount();

    private static HttpRequestDef<UpdateIndirectPartnerAccountRequest, UpdateIndirectPartnerAccountResponse> genForUpdateIndirectPartnerAccount() {
        // basic
        HttpRequestDef.Builder<UpdateIndirectPartnerAccountRequest, UpdateIndirectPartnerAccountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateIndirectPartnerAccountRequest.class,
                    UpdateIndirectPartnerAccountResponse.class)
                .withName("UpdateIndirectPartnerAccount")
                .withUri("/v2/accounts/partner-accounts/indirect-partner-adjust")
                .withContentType("application/json");

        // requests
        builder.<AdjustToIndirectPartnerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdjustToIndirectPartnerReq.class),
            f -> f.withMarshaller(UpdateIndirectPartnerAccountRequest::getBody,
                UpdateIndirectPartnerAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> updatePeriodToOnDemand =
        genForUpdatePeriodToOnDemand();

    private static HttpRequestDef<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> genForUpdatePeriodToOnDemand() {
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
            f -> f.withMarshaller(UpdatePeriodToOnDemandRequest::getBody, UpdatePeriodToOnDemandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubEnterpriseAmountRequest, UpdateSubEnterpriseAmountResponse> updateSubEnterpriseAmount =
        genForUpdateSubEnterpriseAmount();

    private static HttpRequestDef<UpdateSubEnterpriseAmountRequest, UpdateSubEnterpriseAmountResponse> genForUpdateSubEnterpriseAmount() {
        // basic
        HttpRequestDef.Builder<UpdateSubEnterpriseAmountRequest, UpdateSubEnterpriseAmountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateSubEnterpriseAmountRequest.class,
                    UpdateSubEnterpriseAmountResponse.class)
                .withName("UpdateSubEnterpriseAmount")
                .withUri("/v2/enterprises/multi-accounts/transfer-amount")
                .withContentType("application/json");

        // requests
        builder.<TransferEnterpriseMultiAccountReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransferEnterpriseMultiAccountReq.class),
            f -> f.withMarshaller(UpdateSubEnterpriseAmountRequest::getBody,
                UpdateSubEnterpriseAmountRequest::setBody));

        // response

        return builder.build();
    }

}

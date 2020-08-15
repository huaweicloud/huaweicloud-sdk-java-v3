package com.huaweicloud.sdk.bss.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.bss.v2.model.*;

public class BssAsyncClient {
    protected HcClient hcClient;

    public BssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BssAsyncClient> newBuilder() {
        return new ClientBuilder<>(BssAsyncClient::new, "GlobalCredentials");
    }


    public CompletableFuture<AutoRenewalResourcesResponse> autoRenewalResourcesAsync(AutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.autoRenewalResources);
    }

    public CompletableFuture<BatchSetSubCustomerDiscountResponse> batchSetSubCustomerDiscountAsync(BatchSetSubCustomerDiscountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.batchSetSubCustomerDiscount);
    }

    public CompletableFuture<CancelAutoRenewalResourcesResponse> cancelAutoRenewalResourcesAsync(CancelAutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.cancelAutoRenewalResources);
    }

    public CompletableFuture<CancelCustomerOrderResponse> cancelCustomerOrderAsync(CancelCustomerOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.cancelCustomerOrder);
    }

    public CompletableFuture<CancelResourcesSubscriptionResponse> cancelResourcesSubscriptionAsync(CancelResourcesSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.cancelResourcesSubscription);
    }

    public CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthenticationAsync(ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.changeEnterpriseRealnameAuthentication);
    }

    public CompletableFuture<CheckUserIdentityResponse> checkUserIdentityAsync(CheckUserIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.checkUserIdentity);
    }

    public CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationAsync(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createEnterpriseRealnameAuthentication);
    }

    public CompletableFuture<CreatePartnerCouponsResponse> createPartnerCouponsAsync(CreatePartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createPartnerCoupons);
    }

    public CompletableFuture<CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthAsync(CreatePersonalRealnameAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createPersonalRealnameAuth);
    }

    public CompletableFuture<CreatePostalResponse> createPostalAsync(CreatePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createPostal);
    }

    public CompletableFuture<CreateSubCustomerResponse> createSubCustomerAsync(CreateSubCustomerRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createSubCustomer);
    }

    public CompletableFuture<CreateSubEnterpriseAccountResponse> createSubEnterpriseAccountAsync(CreateSubEnterpriseAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createSubEnterpriseAccount);
    }

    public CompletableFuture<DeletePostalResponse> deletePostalAsync(DeletePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.deletePostal);
    }

    public CompletableFuture<ListCitiesResponse> listCitiesAsync(ListCitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCities);
    }

    public CompletableFuture<ListCountiesResponse> listCountiesAsync(ListCountiesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCounties);
    }

    public CompletableFuture<ListCouponQuotasRecordsResponse> listCouponQuotasRecordsAsync(ListCouponQuotasRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCouponQuotasRecords);
    }

    public CompletableFuture<ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesAsync(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerOnDemandResources);
    }

    public CompletableFuture<ListCustomerOrdersResponse> listCustomerOrdersAsync(ListCustomerOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerOrders);
    }

    public CompletableFuture<ListCustomersBalancesDetailResponse> listCustomersBalancesDetailAsync(ListCustomersBalancesDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomersBalancesDetail);
    }

    public CompletableFuture<ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsAsync(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerselfResourceRecordDetails);
    }

    public CompletableFuture<ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsAsync(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerselfResourceRecords);
    }

    public CompletableFuture<ListIndirectPartnersResponse> listIndirectPartnersAsync(ListIndirectPartnersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listIndirectPartners);
    }

    public CompletableFuture<ListIssuedCouponQuotasResponse> listIssuedCouponQuotasAsync(ListIssuedCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listIssuedCouponQuotas);
    }

    public CompletableFuture<ListIssuedPartnerCouponsResponse> listIssuedPartnerCouponsAsync(ListIssuedPartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listIssuedPartnerCoupons);
    }

    public CompletableFuture<ListOnDemandResourceRatingsResponse> listOnDemandResourceRatingsAsync(ListOnDemandResourceRatingsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listOnDemandResourceRatings);
    }

    public CompletableFuture<ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderIdAsync(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listOrderCouponsByOrderId);
    }

    public CompletableFuture<ListPartnerAdjustRecordsResponse> listPartnerAdjustRecordsAsync(ListPartnerAdjustRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerAdjustRecords);
    }

    public CompletableFuture<ListPartnerBalancesResponse> listPartnerBalancesAsync(ListPartnerBalancesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerBalances);
    }

    public CompletableFuture<ListPartnerCouponsRecordResponse> listPartnerCouponsRecordAsync(ListPartnerCouponsRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerCouponsRecord);
    }

    public CompletableFuture<ListPartnerPayOrdersResponse> listPartnerPayOrdersAsync(ListPartnerPayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerPayOrders);
    }

    public CompletableFuture<ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesAsync(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPayPerUseCustomerResources);
    }

    public CompletableFuture<ListProvincesResponse> listProvincesAsync(ListProvincesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listProvinces);
    }

    public CompletableFuture<ListQuotaCouponsResponse> listQuotaCouponsAsync(ListQuotaCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listQuotaCoupons);
    }

    public CompletableFuture<ListRateOnPeriodDetailResponse> listRateOnPeriodDetailAsync(ListRateOnPeriodDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listRateOnPeriodDetail);
    }

    public CompletableFuture<ListResourceUsagesResponse> listResourceUsagesAsync(ListResourceUsagesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listResourceUsages);
    }

    public CompletableFuture<ListSkuInventoriesResponse> listSkuInventoriesAsync(ListSkuInventoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSkuInventories);
    }

    public CompletableFuture<ListSubCustomerCouponsResponse> listSubCustomerCouponsAsync(ListSubCustomerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomerCoupons);
    }

    public CompletableFuture<ListSubCustomerDiscountsResponse> listSubCustomerDiscountsAsync(ListSubCustomerDiscountsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomerDiscounts);
    }

    public CompletableFuture<ListSubCustomerResFeeRecordsResponse> listSubCustomerResFeeRecordsAsync(ListSubCustomerResFeeRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomerResFeeRecords);
    }

    public CompletableFuture<ListSubCustomersResponse> listSubCustomersAsync(ListSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomers);
    }

    public CompletableFuture<ListSubcustomerMonthlyBillsResponse> listSubcustomerMonthlyBillsAsync(ListSubcustomerMonthlyBillsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubcustomerMonthlyBills);
    }

    public CompletableFuture<PayOrdersResponse> payOrdersAsync(PayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.payOrders);
    }

    public CompletableFuture<ReclaimCouponQuotasResponse> reclaimCouponQuotasAsync(ReclaimCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimCouponQuotas);
    }

    public CompletableFuture<ReclaimIndirectPartnerAccountResponse> reclaimIndirectPartnerAccountAsync(ReclaimIndirectPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimIndirectPartnerAccount);
    }

    public CompletableFuture<ReclaimPartnerCouponsResponse> reclaimPartnerCouponsAsync(ReclaimPartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimPartnerCoupons);
    }

    public CompletableFuture<ReclaimSubEnterpriseAmountResponse> reclaimSubEnterpriseAmountAsync(ReclaimSubEnterpriseAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimSubEnterpriseAmount);
    }

    public CompletableFuture<ReclaimToPartnerAccountResponse> reclaimToPartnerAccountAsync(ReclaimToPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimToPartnerAccount);
    }

    public CompletableFuture<RenewalResourcesResponse> renewalResourcesAsync(RenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.renewalResources);
    }

    public CompletableFuture<SendSmsVerificationCodeResponse> sendSmsVerificationCodeAsync(SendSmsVerificationCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.sendSmsVerificationCode);
    }

    public CompletableFuture<SendVerificationMessageCodeResponse> sendVerificationMessageCodeAsync(SendVerificationMessageCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.sendVerificationMessageCode);
    }

    public CompletableFuture<ShowCusotmerAccountBalancesResponse> showCusotmerAccountBalancesAsync(ShowCusotmerAccountBalancesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showCusotmerAccountBalances);
    }

    public CompletableFuture<ShowCustomerMonthlySumResponse> showCustomerMonthlySumAsync(ShowCustomerMonthlySumRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showCustomerMonthlySum);
    }

    public CompletableFuture<ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsAsync(ShowCustomerOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showCustomerOrderDetails);
    }

    public CompletableFuture<ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultAsync(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showRealnameAuthenticationReviewResult);
    }

    public CompletableFuture<ShowRefundOrderDetailsResponse> showRefundOrderDetailsAsync(ShowRefundOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showRefundOrderDetails);
    }

    public CompletableFuture<UpdateCouponQuotasResponse> updateCouponQuotasAsync(UpdateCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateCouponQuotas);
    }

    public CompletableFuture<UpdateCustomerAccountAmountResponse> updateCustomerAccountAmountAsync(UpdateCustomerAccountAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateCustomerAccountAmount);
    }

    public CompletableFuture<UpdateIndirectPartnerAccountResponse> updateIndirectPartnerAccountAsync(UpdateIndirectPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateIndirectPartnerAccount);
    }

    public CompletableFuture<UpdatePostalResponse> updatePostalAsync(UpdatePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updatePostal);
    }

    public CompletableFuture<UpdateSubEnterpriseAmountResponse> updateSubEnterpriseAmountAsync(UpdateSubEnterpriseAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateSubEnterpriseAmount);
    }

}
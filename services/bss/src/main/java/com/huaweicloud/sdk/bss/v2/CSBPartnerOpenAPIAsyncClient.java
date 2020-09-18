package com.huaweicloud.sdk.bss.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.bss.v2.model.*;

public class CSBPartnerOpenAPIAsyncClient {
    protected HcClient hcClient;

    public CSBPartnerOpenAPIAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CSBPartnerOpenAPIAsyncClient> newBuilder() {
        return new ClientBuilder<>(CSBPartnerOpenAPIAsyncClient::new, "GlobalCredentials");
    }


    public CompletableFuture<AutoRenewalResourcesResponse> autoRenewalResourcesAsync(AutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.autoRenewalResources);
    }

    public CompletableFuture<BatchSetSubCustomerDiscountResponse> batchSetSubCustomerDiscountAsync(BatchSetSubCustomerDiscountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.batchSetSubCustomerDiscount);
    }

    public CompletableFuture<CancelAutoRenewalResourcesResponse> cancelAutoRenewalResourcesAsync(CancelAutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.cancelAutoRenewalResources);
    }

    public CompletableFuture<CancelCustomerOrderResponse> cancelCustomerOrderAsync(CancelCustomerOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.cancelCustomerOrder);
    }

    public CompletableFuture<CancelResourcesSubscriptionResponse> cancelResourcesSubscriptionAsync(CancelResourcesSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.cancelResourcesSubscription);
    }

    public CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthenticationAsync(ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.changeEnterpriseRealnameAuthentication);
    }

    public CompletableFuture<CheckUserIdentityResponse> checkUserIdentityAsync(CheckUserIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.checkUserIdentity);
    }

    public CompletableFuture<CreateEnterpriseProjectAuthResponse> createEnterpriseProjectAuthAsync(CreateEnterpriseProjectAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createEnterpriseProjectAuth);
    }

    public CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationAsync(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createEnterpriseRealnameAuthentication);
    }

    public CompletableFuture<CreatePartnerCouponsResponse> createPartnerCouponsAsync(CreatePartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createPartnerCoupons);
    }

    public CompletableFuture<CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthAsync(CreatePersonalRealnameAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createPersonalRealnameAuth);
    }

    public CompletableFuture<CreatePostalResponse> createPostalAsync(CreatePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createPostal);
    }

    public CompletableFuture<CreateSubCustomerResponse> createSubCustomerAsync(CreateSubCustomerRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createSubCustomer);
    }

    public CompletableFuture<CreateSubEnterpriseAccountResponse> createSubEnterpriseAccountAsync(CreateSubEnterpriseAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createSubEnterpriseAccount);
    }

    public CompletableFuture<DeletePostalResponse> deletePostalAsync(DeletePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.deletePostal);
    }

    public CompletableFuture<ListCitiesResponse> listCitiesAsync(ListCitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCities);
    }

    public CompletableFuture<ListCountiesResponse> listCountiesAsync(ListCountiesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCounties);
    }

    public CompletableFuture<ListCouponQuotasRecordsResponse> listCouponQuotasRecordsAsync(ListCouponQuotasRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCouponQuotasRecords);
    }

    public CompletableFuture<ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesAsync(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCustomerOnDemandResources);
    }

    public CompletableFuture<ListCustomerOrdersResponse> listCustomerOrdersAsync(ListCustomerOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCustomerOrders);
    }

    public CompletableFuture<ListCustomersBalancesDetailResponse> listCustomersBalancesDetailAsync(ListCustomersBalancesDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCustomersBalancesDetail);
    }

    public CompletableFuture<ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsAsync(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCustomerselfResourceRecordDetails);
    }

    public CompletableFuture<ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsAsync(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCustomerselfResourceRecords);
    }

    public CompletableFuture<ListEnterpriseMultiAccountResponse> listEnterpriseMultiAccountAsync(ListEnterpriseMultiAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listEnterpriseMultiAccount);
    }

    public CompletableFuture<ListIndirectPartnersResponse> listIndirectPartnersAsync(ListIndirectPartnersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listIndirectPartners);
    }

    public CompletableFuture<ListIssuedCouponQuotasResponse> listIssuedCouponQuotasAsync(ListIssuedCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listIssuedCouponQuotas);
    }

    public CompletableFuture<ListIssuedPartnerCouponsResponse> listIssuedPartnerCouponsAsync(ListIssuedPartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listIssuedPartnerCoupons);
    }

    public CompletableFuture<ListOnDemandResourceRatingsResponse> listOnDemandResourceRatingsAsync(ListOnDemandResourceRatingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listOnDemandResourceRatings);
    }

    public CompletableFuture<ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderIdAsync(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listOrderCouponsByOrderId);
    }

    public CompletableFuture<ListPartnerAdjustRecordsResponse> listPartnerAdjustRecordsAsync(ListPartnerAdjustRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listPartnerAdjustRecords);
    }

    public CompletableFuture<ListPartnerBalancesResponse> listPartnerBalancesAsync(ListPartnerBalancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listPartnerBalances);
    }

    public CompletableFuture<ListPartnerCouponsRecordResponse> listPartnerCouponsRecordAsync(ListPartnerCouponsRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listPartnerCouponsRecord);
    }

    public CompletableFuture<ListPartnerPayOrdersResponse> listPartnerPayOrdersAsync(ListPartnerPayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listPartnerPayOrders);
    }

    public CompletableFuture<ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesAsync(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listPayPerUseCustomerResources);
    }

    public CompletableFuture<ListPostalAddressResponse> listPostalAddressAsync(ListPostalAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listPostalAddress);
    }

    public CompletableFuture<ListProvincesResponse> listProvincesAsync(ListProvincesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listProvinces);
    }

    public CompletableFuture<ListQuotaCouponsResponse> listQuotaCouponsAsync(ListQuotaCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listQuotaCoupons);
    }

    public CompletableFuture<ListRateOnPeriodDetailResponse> listRateOnPeriodDetailAsync(ListRateOnPeriodDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listRateOnPeriodDetail);
    }

    public CompletableFuture<ListResourceUsagesResponse> listResourceUsagesAsync(ListResourceUsagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listResourceUsages);
    }

    public CompletableFuture<ListSkuInventoriesResponse> listSkuInventoriesAsync(ListSkuInventoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listSkuInventories);
    }

    public CompletableFuture<ListSubCustomerCouponsResponse> listSubCustomerCouponsAsync(ListSubCustomerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listSubCustomerCoupons);
    }

    public CompletableFuture<ListSubCustomerDiscountsResponse> listSubCustomerDiscountsAsync(ListSubCustomerDiscountsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listSubCustomerDiscounts);
    }

    public CompletableFuture<ListSubCustomerResFeeRecordsResponse> listSubCustomerResFeeRecordsAsync(ListSubCustomerResFeeRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listSubCustomerResFeeRecords);
    }

    public CompletableFuture<ListSubCustomersResponse> listSubCustomersAsync(ListSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listSubCustomers);
    }

    public CompletableFuture<ListSubcustomerMonthlyBillsResponse> listSubcustomerMonthlyBillsAsync(ListSubcustomerMonthlyBillsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listSubcustomerMonthlyBills);
    }

    public CompletableFuture<PayOrdersResponse> payOrdersAsync(PayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.payOrders);
    }

    public CompletableFuture<ReclaimCouponQuotasResponse> reclaimCouponQuotasAsync(ReclaimCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.reclaimCouponQuotas);
    }

    public CompletableFuture<ReclaimIndirectPartnerAccountResponse> reclaimIndirectPartnerAccountAsync(ReclaimIndirectPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.reclaimIndirectPartnerAccount);
    }

    public CompletableFuture<ReclaimPartnerCouponsResponse> reclaimPartnerCouponsAsync(ReclaimPartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.reclaimPartnerCoupons);
    }

    public CompletableFuture<ReclaimSubEnterpriseAmountResponse> reclaimSubEnterpriseAmountAsync(ReclaimSubEnterpriseAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.reclaimSubEnterpriseAmount);
    }

    public CompletableFuture<ReclaimToPartnerAccountResponse> reclaimToPartnerAccountAsync(ReclaimToPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.reclaimToPartnerAccount);
    }

    public CompletableFuture<RenewalResourcesResponse> renewalResourcesAsync(RenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.renewalResources);
    }

    public CompletableFuture<SendSmsVerificationCodeResponse> sendSmsVerificationCodeAsync(SendSmsVerificationCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.sendSmsVerificationCode);
    }

    public CompletableFuture<SendVerificationMessageCodeResponse> sendVerificationMessageCodeAsync(SendVerificationMessageCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.sendVerificationMessageCode);
    }

    public CompletableFuture<ShowCusotmerAccountBalancesResponse> showCusotmerAccountBalancesAsync(ShowCusotmerAccountBalancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showCusotmerAccountBalances);
    }

    public CompletableFuture<ShowCustomerMonthlySumResponse> showCustomerMonthlySumAsync(ShowCustomerMonthlySumRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showCustomerMonthlySum);
    }

    public CompletableFuture<ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsAsync(ShowCustomerOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showCustomerOrderDetails);
    }

    public CompletableFuture<ShowMultiAccountTransferAmountResponse> showMultiAccountTransferAmountAsync(ShowMultiAccountTransferAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showMultiAccountTransferAmount);
    }

    public CompletableFuture<ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultAsync(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showRealnameAuthenticationReviewResult);
    }

    public CompletableFuture<ShowRefundOrderDetailsResponse> showRefundOrderDetailsAsync(ShowRefundOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showRefundOrderDetails);
    }

    public CompletableFuture<UpdateCouponQuotasResponse> updateCouponQuotasAsync(UpdateCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.updateCouponQuotas);
    }

    public CompletableFuture<UpdateCustomerAccountAmountResponse> updateCustomerAccountAmountAsync(UpdateCustomerAccountAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.updateCustomerAccountAmount);
    }

    public CompletableFuture<UpdateIndirectPartnerAccountResponse> updateIndirectPartnerAccountAsync(UpdateIndirectPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.updateIndirectPartnerAccount);
    }

    public CompletableFuture<UpdatePostalResponse> updatePostalAsync(UpdatePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.updatePostal);
    }

    public CompletableFuture<UpdateSubEnterpriseAmountResponse> updateSubEnterpriseAmountAsync(UpdateSubEnterpriseAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.updateSubEnterpriseAmount);
    }

}
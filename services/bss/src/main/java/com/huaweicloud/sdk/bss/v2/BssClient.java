package com.huaweicloud.sdk.bss.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.bss.v2.model.*;

public class BssClient {
    protected HcClient hcClient;

    public BssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BssClient> newBuilder() {
        return new ClientBuilder<>(BssClient::new, "GlobalCredentials");
    }

    public AutoRenewalResourcesResponse autoRenewalResources(AutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.autoRenewalResources);
    }

    public BatchSetSubCustomerDiscountResponse batchSetSubCustomerDiscount(BatchSetSubCustomerDiscountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.batchSetSubCustomerDiscount);
    }

    public CancelAutoRenewalResourcesResponse cancelAutoRenewalResources(CancelAutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.cancelAutoRenewalResources);
    }

    public CancelCustomerOrderResponse cancelCustomerOrder(CancelCustomerOrderRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.cancelCustomerOrder);
    }

    public CancelResourcesSubscriptionResponse cancelResourcesSubscription(CancelResourcesSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.cancelResourcesSubscription);
    }

    public ChangeEnterpriseRealnameAuthenticationResponse changeEnterpriseRealnameAuthentication(ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.changeEnterpriseRealnameAuthentication);
    }

    public CheckUserIdentityResponse checkUserIdentity(CheckUserIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.checkUserIdentity);
    }

    public CreateEnterpriseRealnameAuthenticationResponse createEnterpriseRealnameAuthentication(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createEnterpriseRealnameAuthentication);
    }

    public CreatePartnerCouponsResponse createPartnerCoupons(CreatePartnerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createPartnerCoupons);
    }

    public CreatePersonalRealnameAuthResponse createPersonalRealnameAuth(CreatePersonalRealnameAuthRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createPersonalRealnameAuth);
    }

    public CreatePostalResponse createPostal(CreatePostalRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createPostal);
    }

    public CreateSubCustomerResponse createSubCustomer(CreateSubCustomerRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createSubCustomer);
    }

    public CreateSubEnterpriseAccountResponse createSubEnterpriseAccount(CreateSubEnterpriseAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createSubEnterpriseAccount);
    }

    public DeletePostalResponse deletePostal(DeletePostalRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.deletePostal);
    }

    public ListCitiesResponse listCities(ListCitiesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCities);
    }

    public ListCountiesResponse listCounties(ListCountiesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCounties);
    }

    public ListCouponQuotasRecordsResponse listCouponQuotasRecords(ListCouponQuotasRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCouponQuotasRecords);
    }

    public ListCustomerOnDemandResourcesResponse listCustomerOnDemandResources(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerOnDemandResources);
    }

    public ListCustomerOrdersResponse listCustomerOrders(ListCustomerOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerOrders);
    }

    public ListCustomersBalancesDetailResponse listCustomersBalancesDetail(ListCustomersBalancesDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomersBalancesDetail);
    }

    public ListCustomerselfResourceRecordDetailsResponse listCustomerselfResourceRecordDetails(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerselfResourceRecordDetails);
    }

    public ListCustomerselfResourceRecordsResponse listCustomerselfResourceRecords(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerselfResourceRecords);
    }

    public ListIndirectPartnersResponse listIndirectPartners(ListIndirectPartnersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIndirectPartners);
    }

    public ListIssuedCouponQuotasResponse listIssuedCouponQuotas(ListIssuedCouponQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIssuedCouponQuotas);
    }

    public ListIssuedPartnerCouponsResponse listIssuedPartnerCoupons(ListIssuedPartnerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIssuedPartnerCoupons);
    }

    public ListOnDemandResourceRatingsResponse listOnDemandResourceRatings(ListOnDemandResourceRatingsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listOnDemandResourceRatings);
    }

    public ListOrderCouponsByOrderIdResponse listOrderCouponsByOrderId(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listOrderCouponsByOrderId);
    }

    public ListPartnerAdjustRecordsResponse listPartnerAdjustRecords(ListPartnerAdjustRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerAdjustRecords);
    }

    public ListPartnerBalancesResponse listPartnerBalances(ListPartnerBalancesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerBalances);
    }

    public ListPartnerCouponsRecordResponse listPartnerCouponsRecord(ListPartnerCouponsRecordRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerCouponsRecord);
    }

    public ListPartnerPayOrdersResponse listPartnerPayOrders(ListPartnerPayOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerPayOrders);
    }

    public ListPayPerUseCustomerResourcesResponse listPayPerUseCustomerResources(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPayPerUseCustomerResources);
    }

    public ListProvincesResponse listProvinces(ListProvincesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listProvinces);
    }

    public ListQuotaCouponsResponse listQuotaCoupons(ListQuotaCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listQuotaCoupons);
    }

    public ListRateOnPeriodDetailResponse listRateOnPeriodDetail(ListRateOnPeriodDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listRateOnPeriodDetail);
    }

    public ListResourceUsagesResponse listResourceUsages(ListResourceUsagesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listResourceUsages);
    }

    public ListSkuInventoriesResponse listSkuInventories(ListSkuInventoriesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSkuInventories);
    }

    public ListSubCustomerCouponsResponse listSubCustomerCoupons(ListSubCustomerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomerCoupons);
    }

    public ListSubCustomerDiscountsResponse listSubCustomerDiscounts(ListSubCustomerDiscountsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomerDiscounts);
    }

    public ListSubCustomerResFeeRecordsResponse listSubCustomerResFeeRecords(ListSubCustomerResFeeRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomerResFeeRecords);
    }

    public ListSubCustomersResponse listSubCustomers(ListSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomers);
    }

    public ListSubcustomerMonthlyBillsResponse listSubcustomerMonthlyBills(ListSubcustomerMonthlyBillsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubcustomerMonthlyBills);
    }

    public PayOrdersResponse payOrders(PayOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.payOrders);
    }

    public ReclaimCouponQuotasResponse reclaimCouponQuotas(ReclaimCouponQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimCouponQuotas);
    }

    public ReclaimIndirectPartnerAccountResponse reclaimIndirectPartnerAccount(ReclaimIndirectPartnerAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimIndirectPartnerAccount);
    }

    public ReclaimPartnerCouponsResponse reclaimPartnerCoupons(ReclaimPartnerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimPartnerCoupons);
    }

    public ReclaimSubEnterpriseAmountResponse reclaimSubEnterpriseAmount(ReclaimSubEnterpriseAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimSubEnterpriseAmount);
    }

    public ReclaimToPartnerAccountResponse reclaimToPartnerAccount(ReclaimToPartnerAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimToPartnerAccount);
    }

    public RenewalResourcesResponse renewalResources(RenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.renewalResources);
    }

    public SendSmsVerificationCodeResponse sendSmsVerificationCode(SendSmsVerificationCodeRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.sendSmsVerificationCode);
    }

    public SendVerificationMessageCodeResponse sendVerificationMessageCode(SendVerificationMessageCodeRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.sendVerificationMessageCode);
    }

    public ShowCusotmerAccountBalancesResponse showCusotmerAccountBalances(ShowCusotmerAccountBalancesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showCusotmerAccountBalances);
    }

    public ShowCustomerMonthlySumResponse showCustomerMonthlySum(ShowCustomerMonthlySumRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showCustomerMonthlySum);
    }

    public ShowCustomerOrderDetailsResponse showCustomerOrderDetails(ShowCustomerOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showCustomerOrderDetails);
    }

    public ShowRealnameAuthenticationReviewResultResponse showRealnameAuthenticationReviewResult(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showRealnameAuthenticationReviewResult);
    }

    public ShowRefundOrderDetailsResponse showRefundOrderDetails(ShowRefundOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showRefundOrderDetails);
    }

    public UpdateCouponQuotasResponse updateCouponQuotas(UpdateCouponQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateCouponQuotas);
    }

    public UpdateCustomerAccountAmountResponse updateCustomerAccountAmount(UpdateCustomerAccountAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateCustomerAccountAmount);
    }

    public UpdateIndirectPartnerAccountResponse updateIndirectPartnerAccount(UpdateIndirectPartnerAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateIndirectPartnerAccount);
    }

    public UpdatePostalResponse updatePostal(UpdatePostalRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updatePostal);
    }

    public UpdateSubEnterpriseAmountResponse updateSubEnterpriseAmount(UpdateSubEnterpriseAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateSubEnterpriseAmount);
    }

}
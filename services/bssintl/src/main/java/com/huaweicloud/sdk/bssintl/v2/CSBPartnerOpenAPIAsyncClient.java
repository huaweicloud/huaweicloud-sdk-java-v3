package com.huaweicloud.sdk.bssintl.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.bssintl.v2.model.*;

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

    public CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationAsync(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createEnterpriseRealnameAuthentication);
    }

    public CompletableFuture<CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthAsync(CreatePersonalRealnameAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createPersonalRealnameAuth);
    }

    public CompletableFuture<CreateSubCustomerResponse> createSubCustomerAsync(CreateSubCustomerRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.createSubCustomer);
    }

    public CompletableFuture<FreezeSubCustomersResponse> freezeSubCustomersAsync(FreezeSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.freezeSubCustomers);
    }

    public CompletableFuture<ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesAsync(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCustomerOnDemandResources);
    }

    public CompletableFuture<ListCustomerOrdersResponse> listCustomerOrdersAsync(ListCustomerOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCustomerOrders);
    }

    public CompletableFuture<ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsAsync(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCustomerselfResourceRecordDetails);
    }

    public CompletableFuture<ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsAsync(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listCustomerselfResourceRecords);
    }

    public CompletableFuture<ListOnDemandResourceRatingsResponse> listOnDemandResourceRatingsAsync(ListOnDemandResourceRatingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listOnDemandResourceRatings);
    }

    public CompletableFuture<ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderIdAsync(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listOrderCouponsByOrderId);
    }

    public CompletableFuture<ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesAsync(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listPayPerUseCustomerResources);
    }

    public CompletableFuture<ListRateOnPeriodDetailResponse> listRateOnPeriodDetailAsync(ListRateOnPeriodDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listRateOnPeriodDetail);
    }

    public CompletableFuture<ListResourceUsagesResponse> listResourceUsagesAsync(ListResourceUsagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listResourceUsages);
    }

    public CompletableFuture<ListSubCustomerCouponsResponse> listSubCustomerCouponsAsync(ListSubCustomerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listSubCustomerCoupons);
    }

    public CompletableFuture<ListSubCustomersResponse> listSubCustomersAsync(ListSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.listSubCustomers);
    }

    public CompletableFuture<PayOrdersResponse> payOrdersAsync(PayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.payOrders);
    }

    public CompletableFuture<RenewalResourcesResponse> renewalResourcesAsync(RenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.renewalResources);
    }

    public CompletableFuture<SendVerificationMessageCodeResponse> sendVerificationMessageCodeAsync(SendVerificationMessageCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.sendVerificationMessageCode);
    }

    public CompletableFuture<ShowCustomerMonthlySumResponse> showCustomerMonthlySumAsync(ShowCustomerMonthlySumRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showCustomerMonthlySum);
    }

    public CompletableFuture<ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsAsync(ShowCustomerOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showCustomerOrderDetails);
    }

    public CompletableFuture<ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultAsync(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showRealnameAuthenticationReviewResult);
    }

    public CompletableFuture<ShowRefundOrderDetailsResponse> showRefundOrderDetailsAsync(ShowRefundOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showRefundOrderDetails);
    }

    public CompletableFuture<ShowSubCustomerBudgetResponse> showSubCustomerBudgetAsync(ShowSubCustomerBudgetRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.showSubCustomerBudget);
    }

    public CompletableFuture<UnfreezeSubCustomersResponse> unfreezeSubCustomersAsync(UnfreezeSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.unfreezeSubCustomers);
    }

    public CompletableFuture<UpdateSubCustomerBudgetResponse> updateSubCustomerBudgetAsync(UpdateSubCustomerBudgetRequest request) {
        return hcClient.asyncInvokeHttp(request, CSBPartnerOpenAPIMeta.updateSubCustomerBudget);
    }

}
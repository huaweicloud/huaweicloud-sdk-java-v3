package com.huaweicloud.sdk.bssintl.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.bssintl.v2.model.*;

public class BssintlClient {
    protected HcClient hcClient;

    public BssintlClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BssintlClient> newBuilder() {
        return new ClientBuilder<>(BssintlClient::new, "GlobalCredentials");
    }

    public AutoRenewalResourcesResponse autoRenewalResources(AutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.autoRenewalResources);
    }

    public CancelAutoRenewalResourcesResponse cancelAutoRenewalResources(CancelAutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.cancelAutoRenewalResources);
    }

    public CancelCustomerOrderResponse cancelCustomerOrder(CancelCustomerOrderRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.cancelCustomerOrder);
    }

    public CancelResourcesSubscriptionResponse cancelResourcesSubscription(CancelResourcesSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.cancelResourcesSubscription);
    }

    public ChangeEnterpriseRealnameAuthenticationResponse changeEnterpriseRealnameAuthentication(ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.changeEnterpriseRealnameAuthentication);
    }

    public CheckUserIdentityResponse checkUserIdentity(CheckUserIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.checkUserIdentity);
    }

    public CreateEnterpriseRealnameAuthenticationResponse createEnterpriseRealnameAuthentication(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.createEnterpriseRealnameAuthentication);
    }

    public CreatePersonalRealnameAuthResponse createPersonalRealnameAuth(CreatePersonalRealnameAuthRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.createPersonalRealnameAuth);
    }

    public CreateSubCustomerResponse createSubCustomer(CreateSubCustomerRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.createSubCustomer);
    }

    public ListCustomerOnDemandResourcesResponse listCustomerOnDemandResources(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerOnDemandResources);
    }

    public ListCustomerOrdersResponse listCustomerOrders(ListCustomerOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerOrders);
    }

    public ListCustomerselfResourceRecordDetailsResponse listCustomerselfResourceRecordDetails(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecordDetails);
    }

    public ListCustomerselfResourceRecordsResponse listCustomerselfResourceRecords(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecords);
    }

    public ListOnDemandResourceRatingsResponse listOnDemandResourceRatings(ListOnDemandResourceRatingsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listOnDemandResourceRatings);
    }

    public ListOrderCouponsByOrderIdResponse listOrderCouponsByOrderId(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listOrderCouponsByOrderId);
    }

    public ListPayPerUseCustomerResourcesResponse listPayPerUseCustomerResources(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listPayPerUseCustomerResources);
    }

    public ListRateOnPeriodDetailResponse listRateOnPeriodDetail(ListRateOnPeriodDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listRateOnPeriodDetail);
    }

    public ListResourceUsagesResponse listResourceUsages(ListResourceUsagesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listResourceUsages);
    }

    public ListSubCustomerCouponsResponse listSubCustomerCoupons(ListSubCustomerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listSubCustomerCoupons);
    }

    public ListSubCustomersResponse listSubCustomers(ListSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listSubCustomers);
    }

    public PayOrdersResponse payOrders(PayOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.payOrders);
    }

    public RenewalResourcesResponse renewalResources(RenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.renewalResources);
    }

    public SendVerificationMessageCodeResponse sendVerificationMessageCode(SendVerificationMessageCodeRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.sendVerificationMessageCode);
    }

    public ShowCustomerOrderDetailsResponse showCustomerOrderDetails(ShowCustomerOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showCustomerOrderDetails);
    }

    public ShowRealnameAuthenticationReviewResultResponse showRealnameAuthenticationReviewResult(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showRealnameAuthenticationReviewResult);
    }

    public ShowRefundOrderDetailsResponse showRefundOrderDetails(ShowRefundOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showRefundOrderDetails);
    }

}
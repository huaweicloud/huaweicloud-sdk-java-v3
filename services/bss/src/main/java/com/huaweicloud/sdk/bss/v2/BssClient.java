package com.huaweicloud.sdk.bss.v2;

import com.huaweicloud.sdk.bss.v2.model.AutoRenewalResourcesRequest;
import com.huaweicloud.sdk.bss.v2.model.AutoRenewalResourcesResponse;
import com.huaweicloud.sdk.bss.v2.model.CancelAutoRenewalResourcesRequest;
import com.huaweicloud.sdk.bss.v2.model.CancelAutoRenewalResourcesResponse;
import com.huaweicloud.sdk.bss.v2.model.CancelCustomerOrderRequest;
import com.huaweicloud.sdk.bss.v2.model.CancelCustomerOrderResponse;
import com.huaweicloud.sdk.bss.v2.model.CancelResourcesSubscriptionRequest;
import com.huaweicloud.sdk.bss.v2.model.CancelResourcesSubscriptionResponse;
import com.huaweicloud.sdk.bss.v2.model.ChangeEnterpriseRealnameAuthenticationRequest;
import com.huaweicloud.sdk.bss.v2.model.ChangeEnterpriseRealnameAuthenticationResponse;
import com.huaweicloud.sdk.bss.v2.model.CheckUserIdentityRequest;
import com.huaweicloud.sdk.bss.v2.model.CheckUserIdentityResponse;
import com.huaweicloud.sdk.bss.v2.model.ClaimEnterpriseMultiAccountCouponRequest;
import com.huaweicloud.sdk.bss.v2.model.ClaimEnterpriseMultiAccountCouponResponse;
import com.huaweicloud.sdk.bss.v2.model.CreateEnterpriseProjectAuthRequest;
import com.huaweicloud.sdk.bss.v2.model.CreateEnterpriseProjectAuthResponse;
import com.huaweicloud.sdk.bss.v2.model.CreateEnterpriseRealnameAuthenticationRequest;
import com.huaweicloud.sdk.bss.v2.model.CreateEnterpriseRealnameAuthenticationResponse;
import com.huaweicloud.sdk.bss.v2.model.CreatePartnerCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.CreatePartnerCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.CreatePersonalRealnameAuthRequest;
import com.huaweicloud.sdk.bss.v2.model.CreatePersonalRealnameAuthResponse;
import com.huaweicloud.sdk.bss.v2.model.CreatePostalRequest;
import com.huaweicloud.sdk.bss.v2.model.CreatePostalResponse;
import com.huaweicloud.sdk.bss.v2.model.CreateSubCustomerRequest;
import com.huaweicloud.sdk.bss.v2.model.CreateSubCustomerResponse;
import com.huaweicloud.sdk.bss.v2.model.CreateSubEnterpriseAccountRequest;
import com.huaweicloud.sdk.bss.v2.model.CreateSubEnterpriseAccountResponse;
import com.huaweicloud.sdk.bss.v2.model.DeletePostalRequest;
import com.huaweicloud.sdk.bss.v2.model.DeletePostalResponse;
import com.huaweicloud.sdk.bss.v2.model.ListCitiesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListCitiesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListConsumeSubCustomersRequest;
import com.huaweicloud.sdk.bss.v2.model.ListConsumeSubCustomersResponse;
import com.huaweicloud.sdk.bss.v2.model.ListConversionsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListConversionsResponse;
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
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourceInfosRequest;
import com.huaweicloud.sdk.bss.v2.model.ListFreeResourceInfosResponse;
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
import com.huaweicloud.sdk.bss.v2.model.ListPostalAddressRequest;
import com.huaweicloud.sdk.bss.v2.model.ListPostalAddressResponse;
import com.huaweicloud.sdk.bss.v2.model.ListProvincesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListProvincesResponse;
import com.huaweicloud.sdk.bss.v2.model.ListQuotaCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListQuotaCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListRateOnPeriodDetailRequest;
import com.huaweicloud.sdk.bss.v2.model.ListRateOnPeriodDetailResponse;
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
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomerNewTagRequest;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomerNewTagResponse;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomersRequest;
import com.huaweicloud.sdk.bss.v2.model.ListSubCustomersResponse;
import com.huaweicloud.sdk.bss.v2.model.ListSubcustomerMonthlyBillsRequest;
import com.huaweicloud.sdk.bss.v2.model.ListSubcustomerMonthlyBillsResponse;
import com.huaweicloud.sdk.bss.v2.model.ListUsageTypesRequest;
import com.huaweicloud.sdk.bss.v2.model.ListUsageTypesResponse;
import com.huaweicloud.sdk.bss.v2.model.PayOrdersRequest;
import com.huaweicloud.sdk.bss.v2.model.PayOrdersResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimCouponQuotasRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimCouponQuotasResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimEnterpriseMultiAccountCouponRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimEnterpriseMultiAccountCouponResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimIndirectPartnerAccountRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimIndirectPartnerAccountResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimPartnerCouponsRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimPartnerCouponsResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimSubEnterpriseAmountRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimSubEnterpriseAmountResponse;
import com.huaweicloud.sdk.bss.v2.model.ReclaimToPartnerAccountRequest;
import com.huaweicloud.sdk.bss.v2.model.ReclaimToPartnerAccountResponse;
import com.huaweicloud.sdk.bss.v2.model.RenewalResourcesRequest;
import com.huaweicloud.sdk.bss.v2.model.RenewalResourcesResponse;
import com.huaweicloud.sdk.bss.v2.model.SendSmsVerificationCodeRequest;
import com.huaweicloud.sdk.bss.v2.model.SendSmsVerificationCodeResponse;
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
import com.huaweicloud.sdk.bss.v2.model.UpdateCouponQuotasRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdateCouponQuotasResponse;
import com.huaweicloud.sdk.bss.v2.model.UpdateCustomerAccountAmountRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdateCustomerAccountAmountResponse;
import com.huaweicloud.sdk.bss.v2.model.UpdateIndirectPartnerAccountRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdateIndirectPartnerAccountResponse;
import com.huaweicloud.sdk.bss.v2.model.UpdatePeriodToOnDemandRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdatePeriodToOnDemandResponse;
import com.huaweicloud.sdk.bss.v2.model.UpdatePostalRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdatePostalResponse;
import com.huaweicloud.sdk.bss.v2.model.UpdateSubEnterpriseAmountRequest;
import com.huaweicloud.sdk.bss.v2.model.UpdateSubEnterpriseAmountResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class BssClient {

    protected HcClient hcClient;

    public BssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BssClient> newBuilder() {
        ClientBuilder<BssClient> clientBuilder = new ClientBuilder<>(BssClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 设置包年/包月资源自动续费
     *
     * 为防止资源到期被删除，客户可为长期使用的包年/包月资源开通自动续费。
     * 
     * 客户在费用中心开通自动续费请参见[这里](https://support.huaweicloud.com/usermanual-billing/renewals_topic_20000003.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   首先要客户成功支付包年/包月资源订单，才能进行自动续费的开通。
     * &gt;-   目前支持设置自动续费的包年/包月产品请参见[自动续费规则说明](https://support.huaweicloud.com/usermanual-billing/renewals_topic_20000002.html)。
     * &gt;-   在调用本接口前，您可以调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)”接口获取资源ID、资源过期时间以及资源过期后扣费策略等信息。
     * &gt;-   自动续费将于产品到期前7天的凌晨3:00开始扣款，请保持账户余额充足。若由于账户中余额不足等原因导致第一次未扣费成功，系统将每天凌晨3:00尝试进行一次扣款，直到扣款成功或保留产品资源的最后一天。
     * &gt;-   续费周期与原资源的购买周期一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return AutoRenewalResourcesResponse
     */
    public AutoRenewalResourcesResponse autoRenewalResources(AutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.autoRenewalResources);
    }

    /**
     * 设置包年/包月资源自动续费
     *
     * 为防止资源到期被删除，客户可为长期使用的包年/包月资源开通自动续费。
     * 
     * 客户在费用中心开通自动续费请参见[这里](https://support.huaweicloud.com/usermanual-billing/renewals_topic_20000003.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   首先要客户成功支付包年/包月资源订单，才能进行自动续费的开通。
     * &gt;-   目前支持设置自动续费的包年/包月产品请参见[自动续费规则说明](https://support.huaweicloud.com/usermanual-billing/renewals_topic_20000002.html)。
     * &gt;-   在调用本接口前，您可以调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)”接口获取资源ID、资源过期时间以及资源过期后扣费策略等信息。
     * &gt;-   自动续费将于产品到期前7天的凌晨3:00开始扣款，请保持账户余额充足。若由于账户中余额不足等原因导致第一次未扣费成功，系统将每天凌晨3:00尝试进行一次扣款，直到扣款成功或保留产品资源的最后一天。
     * &gt;-   续费周期与原资源的购买周期一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return SyncInvoker<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse>
     */
    public SyncInvoker<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> autoRenewalResourcesInvoker(
        AutoRenewalResourcesRequest request) {
        return new SyncInvoker<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse>(request,
            BssMeta.autoRenewalResources, hcClient);
    }

    /**
     * 取消包年/包月资源自动续费
     *
     * 客户设置自动续费后，还可以执行取消自动续费的操作。关闭自动续费后，资源到期将不会被自动续费。
     * 
     * 客户在费用中心取消包年/包月资源自动续费请参见[这里](https://support.huaweicloud.com/usermanual-billing/renewals_topic_20000005.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   前提是已经调用“[设置包年/包月资源自动续费](https://support.huaweicloud.com/api-oce/api_order_00022.html)”接口设置自动续费或在调用“[续订包年/包月资源](https://support.huaweicloud.com/api-oce/api_order_00018.html)”接口时设置到期策略为自动续订。
     * &gt;-   目前支持取消自动续费的包年/包月产品同支持自动续费的包年/包月产品。
     * &gt;-   在调用本接口前，您可以调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-bpconsole/api_order_00021.html)”接口获取资源ID、资源过期时间以及资源过期后扣费策略等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return CancelAutoRenewalResourcesResponse
     */
    public CancelAutoRenewalResourcesResponse cancelAutoRenewalResources(CancelAutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.cancelAutoRenewalResources);
    }

    /**
     * 取消包年/包月资源自动续费
     *
     * 客户设置自动续费后，还可以执行取消自动续费的操作。关闭自动续费后，资源到期将不会被自动续费。
     * 
     * 客户在费用中心取消包年/包月资源自动续费请参见[这里](https://support.huaweicloud.com/usermanual-billing/renewals_topic_20000005.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   前提是已经调用“[设置包年/包月资源自动续费](https://support.huaweicloud.com/api-oce/api_order_00022.html)”接口设置自动续费或在调用“[续订包年/包月资源](https://support.huaweicloud.com/api-oce/api_order_00018.html)”接口时设置到期策略为自动续订。
     * &gt;-   目前支持取消自动续费的包年/包月产品同支持自动续费的包年/包月产品。
     * &gt;-   在调用本接口前，您可以调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-bpconsole/api_order_00021.html)”接口获取资源ID、资源过期时间以及资源过期后扣费策略等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return SyncInvoker<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse>
     */
    public SyncInvoker<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> cancelAutoRenewalResourcesInvoker(
        CancelAutoRenewalResourcesRequest request) {
        return new SyncInvoker<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse>(request,
            BssMeta.cancelAutoRenewalResources, hcClient);
    }

    /**
     * 取消待支付订单
     *
     * 客户可以对待支付的订单进行取消操作。
     * 
     * 客户登录费用中心取消包年包月产品的待支付订单请单击[这里](https://support.huaweicloud.com/usermanual-billing/zh-cn_topic_0031465730.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;只有订单状态是“待支付”的时候，才能取消订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return CancelCustomerOrderResponse
     */
    public CancelCustomerOrderResponse cancelCustomerOrder(CancelCustomerOrderRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.cancelCustomerOrder);
    }

    /**
     * 取消待支付订单
     *
     * 客户可以对待支付的订单进行取消操作。
     * 
     * 客户登录费用中心取消包年包月产品的待支付订单请单击[这里](https://support.huaweicloud.com/usermanual-billing/zh-cn_topic_0031465730.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;只有订单状态是“待支付”的时候，才能取消订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return SyncInvoker<CancelCustomerOrderRequest, CancelCustomerOrderResponse>
     */
    public SyncInvoker<CancelCustomerOrderRequest, CancelCustomerOrderResponse> cancelCustomerOrderInvoker(
        CancelCustomerOrderRequest request) {
        return new SyncInvoker<CancelCustomerOrderRequest, CancelCustomerOrderResponse>(request,
            BssMeta.cancelCustomerOrder, hcClient);
    }

    /**
     * 退订包年/包月资源
     *
     * 客户购买包年/包月资源后，支持客户退订包年/包月实例。退订资源实例包括资源续费部分和当前正在使用的部分，退订后资源将无法使用。
     * 
     * 客户在费用中心退订已购买的包年包月资源请参见[这里](https://support.huaweicloud.com/usermanual-billing/zh-cn_topic_0083138805.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   首先要成功支付包年/包月产品，产生一条开通成功的包年/包月资源，才能进行退订。
     * &gt;-   调用接口后，如果某个主资源有对应的从资源，系统会将主资源和从资源一起退订，主资源的从资源信息可以通过调用[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)接口获取。
     * &gt;-   注意：如ECS主机挂载新购的云硬盘，但此硬盘不是该ECS主资源的从资源，主从资源信息必须以调用[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)接口获取的信息为准。
     * &gt;-   调用该接口后，您还可以调用“[查询退款订单的金额详情](查询退款订单的金额详情.md)”接口查询退订订单对应的金额来自哪些订单。
     * &gt;-   该接口支持5天无理由全额退订，具体规则请参见“[退订规则说明](https://support.huaweicloud.com/usermanual-billing/unsubscription_topic_20000081.html)”。
     * &gt;-   您正在退订使用中的资源，请仔细确认资源信息和退款信息。未放入回收站的资源退订后无法恢复，若您要保留资源，仅退订未使用的续费周期，请退订续费周期。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return CancelResourcesSubscriptionResponse
     */
    public CancelResourcesSubscriptionResponse cancelResourcesSubscription(CancelResourcesSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.cancelResourcesSubscription);
    }

    /**
     * 退订包年/包月资源
     *
     * 客户购买包年/包月资源后，支持客户退订包年/包月实例。退订资源实例包括资源续费部分和当前正在使用的部分，退订后资源将无法使用。
     * 
     * 客户在费用中心退订已购买的包年包月资源请参见[这里](https://support.huaweicloud.com/usermanual-billing/zh-cn_topic_0083138805.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   首先要成功支付包年/包月产品，产生一条开通成功的包年/包月资源，才能进行退订。
     * &gt;-   调用接口后，如果某个主资源有对应的从资源，系统会将主资源和从资源一起退订，主资源的从资源信息可以通过调用[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)接口获取。
     * &gt;-   注意：如ECS主机挂载新购的云硬盘，但此硬盘不是该ECS主资源的从资源，主从资源信息必须以调用[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)接口获取的信息为准。
     * &gt;-   调用该接口后，您还可以调用“[查询退款订单的金额详情](查询退款订单的金额详情.md)”接口查询退订订单对应的金额来自哪些订单。
     * &gt;-   该接口支持5天无理由全额退订，具体规则请参见“[退订规则说明](https://support.huaweicloud.com/usermanual-billing/unsubscription_topic_20000081.html)”。
     * &gt;-   您正在退订使用中的资源，请仔细确认资源信息和退款信息。未放入回收站的资源退订后无法恢复，若您要保留资源，仅退订未使用的续费周期，请退订续费周期。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return SyncInvoker<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse>
     */
    public SyncInvoker<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> cancelResourcesSubscriptionInvoker(
        CancelResourcesSubscriptionRequest request) {
        return new SyncInvoker<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse>(request,
            BssMeta.cancelResourcesSubscription, hcClient);
    }

    /**
     * 申请实名认证变更
     *
     * 客户可以进行实名认证变更申请。
     * 
     * 个人客户登录帐号中心通过实名认证变更为企业帐号的方式及流程请参见[这里](https://support.huaweicloud.com/usermanual-account/zh-cn_topic_0103532632.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return ChangeEnterpriseRealnameAuthenticationResponse
     */
    public ChangeEnterpriseRealnameAuthenticationResponse changeEnterpriseRealnameAuthentication(
        ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.changeEnterpriseRealnameAuthentication);
    }

    /**
     * 申请实名认证变更
     *
     * 客户可以进行实名认证变更申请。
     * 
     * 个人客户登录帐号中心通过实名认证变更为企业帐号的方式及流程请参见[这里](https://support.huaweicloud.com/usermanual-account/zh-cn_topic_0103532632.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return SyncInvoker<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse>
     */
    public SyncInvoker<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthenticationInvoker(
        ChangeEnterpriseRealnameAuthenticationRequest request) {
        return new SyncInvoker<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse>(
            request, BssMeta.changeEnterpriseRealnameAuthentication, hcClient);
    }

    /**
     * 校验客户注册信息
     *
     * 客户注册时可检查客户的登录名称、手机号或者邮箱是否可以用于注册。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;针对校验手机号场景，目前仅支持校验手机号注册数量是否超过上限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return CheckUserIdentityResponse
     */
    public CheckUserIdentityResponse checkUserIdentity(CheckUserIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.checkUserIdentity);
    }

    /**
     * 校验客户注册信息
     *
     * 客户注册时可检查客户的登录名称、手机号或者邮箱是否可以用于注册。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;针对校验手机号场景，目前仅支持校验手机号注册数量是否超过上限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return SyncInvoker<CheckUserIdentityRequest, CheckUserIdentityResponse>
     */
    public SyncInvoker<CheckUserIdentityRequest, CheckUserIdentityResponse> checkUserIdentityInvoker(
        CheckUserIdentityRequest request) {
        return new SyncInvoker<CheckUserIdentityRequest, CheckUserIdentityResponse>(request, BssMeta.checkUserIdentity,
            hcClient);
    }

    /**
     * 企业主账号向企业子账号拨款优惠券
     *
     * 企业主账号在自建平台向企业子账号拨款优惠券。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   仅支持华为发放的测试类、商务类、活动类代金券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ClaimEnterpriseMultiAccountCouponRequest 请求对象
     * @return ClaimEnterpriseMultiAccountCouponResponse
     */
    public ClaimEnterpriseMultiAccountCouponResponse claimEnterpriseMultiAccountCoupon(
        ClaimEnterpriseMultiAccountCouponRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.claimEnterpriseMultiAccountCoupon);
    }

    /**
     * 企业主账号向企业子账号拨款优惠券
     *
     * 企业主账号在自建平台向企业子账号拨款优惠券。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   仅支持华为发放的测试类、商务类、活动类代金券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ClaimEnterpriseMultiAccountCouponRequest 请求对象
     * @return SyncInvoker<ClaimEnterpriseMultiAccountCouponRequest, ClaimEnterpriseMultiAccountCouponResponse>
     */
    public SyncInvoker<ClaimEnterpriseMultiAccountCouponRequest, ClaimEnterpriseMultiAccountCouponResponse> claimEnterpriseMultiAccountCouponInvoker(
        ClaimEnterpriseMultiAccountCouponRequest request) {
        return new SyncInvoker<ClaimEnterpriseMultiAccountCouponRequest, ClaimEnterpriseMultiAccountCouponResponse>(
            request, BssMeta.claimEnterpriseMultiAccountCoupon, hcClient);
    }

    /**
     * 开通客户企业项目权限
     *
     * 客户在自建平台开通客户企业项目权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnterpriseProjectAuthRequest 请求对象
     * @return CreateEnterpriseProjectAuthResponse
     */
    public CreateEnterpriseProjectAuthResponse createEnterpriseProjectAuth(CreateEnterpriseProjectAuthRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createEnterpriseProjectAuth);
    }

    /**
     * 开通客户企业项目权限
     *
     * 客户在自建平台开通客户企业项目权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnterpriseProjectAuthRequest 请求对象
     * @return SyncInvoker<CreateEnterpriseProjectAuthRequest, CreateEnterpriseProjectAuthResponse>
     */
    public SyncInvoker<CreateEnterpriseProjectAuthRequest, CreateEnterpriseProjectAuthResponse> createEnterpriseProjectAuthInvoker(
        CreateEnterpriseProjectAuthRequest request) {
        return new SyncInvoker<CreateEnterpriseProjectAuthRequest, CreateEnterpriseProjectAuthResponse>(request,
            BssMeta.createEnterpriseProjectAuth, hcClient);
    }

    /**
     * 申请企业实名认证
     *
     * 企业客户可以进行企业实名认证申请。
     * 
     * 客户登录帐号中心进行企业实名认证的方式及流程请参见[这里](https://support.huaweicloud.com/usermanual-account/zh-cn_topic_0077914253.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CreateEnterpriseRealnameAuthenticationResponse
     */
    public CreateEnterpriseRealnameAuthenticationResponse createEnterpriseRealnameAuthentication(
        CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createEnterpriseRealnameAuthentication);
    }

    /**
     * 申请企业实名认证
     *
     * 企业客户可以进行企业实名认证申请。
     * 
     * 客户登录帐号中心进行企业实名认证的方式及流程请参见[这里](https://support.huaweicloud.com/usermanual-account/zh-cn_topic_0077914253.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return SyncInvoker<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse>
     */
    public SyncInvoker<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationInvoker(
        CreateEnterpriseRealnameAuthenticationRequest request) {
        return new SyncInvoker<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse>(
            request, BssMeta.createEnterpriseRealnameAuthentication, hcClient);
    }

    /**
     * 发放优惠券
     *
     * 合作伙伴可以在拥有的代金券额度范围内为客户下发优惠券。
     * 
     * 伙伴登录合作伙伴中心为客户发放代金券请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/espp_050502.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;只能给代售子客户发放优惠券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePartnerCouponsRequest 请求对象
     * @return CreatePartnerCouponsResponse
     */
    public CreatePartnerCouponsResponse createPartnerCoupons(CreatePartnerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createPartnerCoupons);
    }

    /**
     * 发放优惠券
     *
     * 合作伙伴可以在拥有的代金券额度范围内为客户下发优惠券。
     * 
     * 伙伴登录合作伙伴中心为客户发放代金券请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/espp_050502.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;只能给代售子客户发放优惠券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePartnerCouponsRequest 请求对象
     * @return SyncInvoker<CreatePartnerCouponsRequest, CreatePartnerCouponsResponse>
     */
    public SyncInvoker<CreatePartnerCouponsRequest, CreatePartnerCouponsResponse> createPartnerCouponsInvoker(
        CreatePartnerCouponsRequest request) {
        return new SyncInvoker<CreatePartnerCouponsRequest, CreatePartnerCouponsResponse>(request,
            BssMeta.createPartnerCoupons, hcClient);
    }

    /**
     * 申请个人实名认证
     *
     * 个人客户可以进行个人实名认证申请。
     * 
     * 客户登录帐号中心进行个人实名认证的方式及流程请参见[这里](https://support.huaweicloud.com/usermanual-account/zh-cn_topic_0077914254.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return CreatePersonalRealnameAuthResponse
     */
    public CreatePersonalRealnameAuthResponse createPersonalRealnameAuth(CreatePersonalRealnameAuthRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createPersonalRealnameAuth);
    }

    /**
     * 申请个人实名认证
     *
     * 个人客户可以进行个人实名认证申请。
     * 
     * 客户登录帐号中心进行个人实名认证的方式及流程请参见[这里](https://support.huaweicloud.com/usermanual-account/zh-cn_topic_0077914254.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return SyncInvoker<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse>
     */
    public SyncInvoker<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthInvoker(
        CreatePersonalRealnameAuthRequest request) {
        return new SyncInvoker<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse>(request,
            BssMeta.createPersonalRealnameAuth, hcClient);
    }

    /**
     * 新增邮寄地址
     *
     * 伙伴可以新增自己的邮寄地址信息。
     * 
     * 伙伴登录伙伴中心新增邮寄地址请参见[向华为云索取发票](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435143.html)，进入索取发票页面，选择纸质发票，即可设置邮件地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostalRequest 请求对象
     * @return CreatePostalResponse
     */
    public CreatePostalResponse createPostal(CreatePostalRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createPostal);
    }

    /**
     * 新增邮寄地址
     *
     * 伙伴可以新增自己的邮寄地址信息。
     * 
     * 伙伴登录伙伴中心新增邮寄地址请参见[向华为云索取发票](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435143.html)，进入索取发票页面，选择纸质发票，即可设置邮件地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostalRequest 请求对象
     * @return SyncInvoker<CreatePostalRequest, CreatePostalResponse>
     */
    public SyncInvoker<CreatePostalRequest, CreatePostalResponse> createPostalInvoker(CreatePostalRequest request) {
        return new SyncInvoker<CreatePostalRequest, CreatePostalResponse>(request, BssMeta.createPostal, hcClient);
    }

    /**
     * 创建客户
     *
     * 在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。
     * 
     * 华为云总经销商（一级经销商）可以注册云经销商（二级经销商）的子客户。注册完成后，子客户可以自动和云经销商绑定。
     * 
     * &gt;![](public_sys-resources/icon-caution.gif) **注意：** 
     * &gt;-   调用该接口为客户创建华为云账号后，如果想从合作伙伴销售平台跳转至华为云官网，还需要进行SAML认证，具体请参见“[Web UI方式](https://support.huaweicloud.com/api-bpconsole/jac_00001.html)”中的“SAML认证”。
     * &gt;-   如果创建的时候不输入手机号，那么客户将无法收到华为云发出的任何提醒短信，需要客户自己登录到华为云平台补充手机号。
     * &gt;-   调用“创建客户”接口时，华为云会同步创建华为云客户账号，将客户ID及账号名返回给伙伴平台，然后华为云异步完成客户与伙伴的关联。伙伴与客户的关联结果可通过“[查询客户列表](https://support.huaweicloud.com/api-bpconsole/mc_00021.html)”查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return CreateSubCustomerResponse
     */
    public CreateSubCustomerResponse createSubCustomer(CreateSubCustomerRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createSubCustomer);
    }

    /**
     * 创建客户
     *
     * 在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。
     * 
     * 华为云总经销商（一级经销商）可以注册云经销商（二级经销商）的子客户。注册完成后，子客户可以自动和云经销商绑定。
     * 
     * &gt;![](public_sys-resources/icon-caution.gif) **注意：** 
     * &gt;-   调用该接口为客户创建华为云账号后，如果想从合作伙伴销售平台跳转至华为云官网，还需要进行SAML认证，具体请参见“[Web UI方式](https://support.huaweicloud.com/api-bpconsole/jac_00001.html)”中的“SAML认证”。
     * &gt;-   如果创建的时候不输入手机号，那么客户将无法收到华为云发出的任何提醒短信，需要客户自己登录到华为云平台补充手机号。
     * &gt;-   调用“创建客户”接口时，华为云会同步创建华为云客户账号，将客户ID及账号名返回给伙伴平台，然后华为云异步完成客户与伙伴的关联。伙伴与客户的关联结果可通过“[查询客户列表](https://support.huaweicloud.com/api-bpconsole/mc_00021.html)”查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return SyncInvoker<CreateSubCustomerRequest, CreateSubCustomerResponse>
     */
    public SyncInvoker<CreateSubCustomerRequest, CreateSubCustomerResponse> createSubCustomerInvoker(
        CreateSubCustomerRequest request) {
        return new SyncInvoker<CreateSubCustomerRequest, CreateSubCustomerResponse>(request, BssMeta.createSubCustomer,
            hcClient);
    }

    /**
     * 创建企业子账号
     *
     * 企业主账号在自建平台创建企业子账号。
     * 
     * 企业主账号创建企业子账号请参见[这里](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0104194162.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubEnterpriseAccountRequest 请求对象
     * @return CreateSubEnterpriseAccountResponse
     */
    public CreateSubEnterpriseAccountResponse createSubEnterpriseAccount(CreateSubEnterpriseAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createSubEnterpriseAccount);
    }

    /**
     * 创建企业子账号
     *
     * 企业主账号在自建平台创建企业子账号。
     * 
     * 企业主账号创建企业子账号请参见[这里](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0104194162.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubEnterpriseAccountRequest 请求对象
     * @return SyncInvoker<CreateSubEnterpriseAccountRequest, CreateSubEnterpriseAccountResponse>
     */
    public SyncInvoker<CreateSubEnterpriseAccountRequest, CreateSubEnterpriseAccountResponse> createSubEnterpriseAccountInvoker(
        CreateSubEnterpriseAccountRequest request) {
        return new SyncInvoker<CreateSubEnterpriseAccountRequest, CreateSubEnterpriseAccountResponse>(request,
            BssMeta.createSubEnterpriseAccount, hcClient);
    }

    /**
     * 删除邮寄地址
     *
     * 伙伴可以删除自己的邮寄地址信息。
     * 
     * 伙伴登录伙伴中心修改邮寄地址请参见[向华为云索取发票](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435143.html)，进入索取发票页面，选择删除邮寄地址，即可删除邮件地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostalRequest 请求对象
     * @return DeletePostalResponse
     */
    public DeletePostalResponse deletePostal(DeletePostalRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.deletePostal);
    }

    /**
     * 删除邮寄地址
     *
     * 伙伴可以删除自己的邮寄地址信息。
     * 
     * 伙伴登录伙伴中心修改邮寄地址请参见[向华为云索取发票](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435143.html)，进入索取发票页面，选择删除邮寄地址，即可删除邮件地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePostalRequest 请求对象
     * @return SyncInvoker<DeletePostalRequest, DeletePostalResponse>
     */
    public SyncInvoker<DeletePostalRequest, DeletePostalResponse> deletePostalInvoker(DeletePostalRequest request) {
        return new SyncInvoker<DeletePostalRequest, DeletePostalResponse>(request, BssMeta.deletePostal, hcClient);
    }

    /**
     * 查询城市信息
     *
     * 伙伴在伙伴销售平台上查询城市信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCitiesRequest 请求对象
     * @return ListCitiesResponse
     */
    public ListCitiesResponse listCities(ListCitiesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCities);
    }

    /**
     * 查询城市信息
     *
     * 伙伴在伙伴销售平台上查询城市信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCitiesRequest 请求对象
     * @return SyncInvoker<ListCitiesRequest, ListCitiesResponse>
     */
    public SyncInvoker<ListCitiesRequest, ListCitiesResponse> listCitiesInvoker(ListCitiesRequest request) {
        return new SyncInvoker<ListCitiesRequest, ListCitiesResponse>(request, BssMeta.listCities, hcClient);
    }

    /**
     * 查询伙伴消费子客户列表
     *
     * 伙伴在伙伴销售平台可实时查询消费账期内的子客户列表，可以用于查询子客户的消费记录。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;若当前子客户与伙伴无关联关系，仍可查询账期内处于关联状态且有消费的子客户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConsumeSubCustomersRequest 请求对象
     * @return ListConsumeSubCustomersResponse
     */
    public ListConsumeSubCustomersResponse listConsumeSubCustomers(ListConsumeSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listConsumeSubCustomers);
    }

    /**
     * 查询伙伴消费子客户列表
     *
     * 伙伴在伙伴销售平台可实时查询消费账期内的子客户列表，可以用于查询子客户的消费记录。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;若当前子客户与伙伴无关联关系，仍可查询账期内处于关联状态且有消费的子客户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConsumeSubCustomersRequest 请求对象
     * @return SyncInvoker<ListConsumeSubCustomersRequest, ListConsumeSubCustomersResponse>
     */
    public SyncInvoker<ListConsumeSubCustomersRequest, ListConsumeSubCustomersResponse> listConsumeSubCustomersInvoker(
        ListConsumeSubCustomersRequest request) {
        return new SyncInvoker<ListConsumeSubCustomersRequest, ListConsumeSubCustomersResponse>(request,
            BssMeta.listConsumeSubCustomers, hcClient);
    }

    /**
     * 查询度量单位进制
     *
     * 伙伴在伙伴销售平台上查询度量单位的进制转换信息，用于不同度量单位之间的转换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConversionsRequest 请求对象
     * @return ListConversionsResponse
     */
    public ListConversionsResponse listConversions(ListConversionsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listConversions);
    }

    /**
     * 查询度量单位进制
     *
     * 伙伴在伙伴销售平台上查询度量单位的进制转换信息，用于不同度量单位之间的转换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConversionsRequest 请求对象
     * @return SyncInvoker<ListConversionsRequest, ListConversionsResponse>
     */
    public SyncInvoker<ListConversionsRequest, ListConversionsResponse> listConversionsInvoker(
        ListConversionsRequest request) {
        return new SyncInvoker<ListConversionsRequest, ListConversionsResponse>(request, BssMeta.listConversions,
            hcClient);
    }

    /**
     * 查询成本数据
     *
     * 客户在自建平台查询成本分析数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCostsRequest 请求对象
     * @return ListCostsResponse
     */
    public ListCostsResponse listCosts(ListCostsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCosts);
    }

    /**
     * 查询成本数据
     *
     * 客户在自建平台查询成本分析数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCostsRequest 请求对象
     * @return SyncInvoker<ListCostsRequest, ListCostsResponse>
     */
    public SyncInvoker<ListCostsRequest, ListCostsResponse> listCostsInvoker(ListCostsRequest request) {
        return new SyncInvoker<ListCostsRequest, ListCostsResponse>(request, BssMeta.listCosts, hcClient);
    }

    /**
     * 查询区县信息
     *
     * 伙伴在伙伴销售平台上查询区县信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCountiesRequest 请求对象
     * @return ListCountiesResponse
     */
    public ListCountiesResponse listCounties(ListCountiesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCounties);
    }

    /**
     * 查询区县信息
     *
     * 伙伴在伙伴销售平台上查询区县信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCountiesRequest 请求对象
     * @return SyncInvoker<ListCountiesRequest, ListCountiesResponse>
     */
    public SyncInvoker<ListCountiesRequest, ListCountiesResponse> listCountiesInvoker(ListCountiesRequest request) {
        return new SyncInvoker<ListCountiesRequest, ListCountiesResponse>(request, BssMeta.listCounties, hcClient);
    }

    /**
     * 查询代金券额度的发放回收记录
     *
     * 华为云总经销商（一级经销商）可以查看给云经销商（二级经销商）发放或回收代金券额度的操作记录。
     * 
     * 一级经销商可以登录伙伴中心，进入“客户业务** **\\&gt; 代金券管理”，选择“代金券额度”页签，单击“操作记录”查看代金券额度的发放和回收记录。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;伙伴也可以单击代金券额度所在行的“操作记录”，查看该代金券额度对应的操作记录日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCouponQuotasRecordsRequest 请求对象
     * @return ListCouponQuotasRecordsResponse
     */
    public ListCouponQuotasRecordsResponse listCouponQuotasRecords(ListCouponQuotasRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCouponQuotasRecords);
    }

    /**
     * 查询代金券额度的发放回收记录
     *
     * 华为云总经销商（一级经销商）可以查看给云经销商（二级经销商）发放或回收代金券额度的操作记录。
     * 
     * 一级经销商可以登录伙伴中心，进入“客户业务** **\\&gt; 代金券管理”，选择“代金券额度”页签，单击“操作记录”查看代金券额度的发放和回收记录。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;伙伴也可以单击代金券额度所在行的“操作记录”，查看该代金券额度对应的操作记录日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCouponQuotasRecordsRequest 请求对象
     * @return SyncInvoker<ListCouponQuotasRecordsRequest, ListCouponQuotasRecordsResponse>
     */
    public SyncInvoker<ListCouponQuotasRecordsRequest, ListCouponQuotasRecordsResponse> listCouponQuotasRecordsInvoker(
        ListCouponQuotasRecordsRequest request) {
        return new SyncInvoker<ListCouponQuotasRecordsRequest, ListCouponQuotasRecordsResponse>(request,
            BssMeta.listCouponQuotasRecords, hcClient);
    }

    /**
     * 查询收支明细(客户)
     *
     * 功能描述：客户可以查询自身的收支明细情况(此接口不适用于伙伴的代售类、转售类客户。)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerAccountChangeRecordsRequest 请求对象
     * @return ListCustomerAccountChangeRecordsResponse
     */
    public ListCustomerAccountChangeRecordsResponse listCustomerAccountChangeRecords(
        ListCustomerAccountChangeRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerAccountChangeRecords);
    }

    /**
     * 查询收支明细(客户)
     *
     * 功能描述：客户可以查询自身的收支明细情况(此接口不适用于伙伴的代售类、转售类客户。)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerAccountChangeRecordsRequest 请求对象
     * @return SyncInvoker<ListCustomerAccountChangeRecordsRequest, ListCustomerAccountChangeRecordsResponse>
     */
    public SyncInvoker<ListCustomerAccountChangeRecordsRequest, ListCustomerAccountChangeRecordsResponse> listCustomerAccountChangeRecordsInvoker(
        ListCustomerAccountChangeRecordsRequest request) {
        return new SyncInvoker<ListCustomerAccountChangeRecordsRequest, ListCustomerAccountChangeRecordsResponse>(
            request, BssMeta.listCustomerAccountChangeRecords, hcClient);
    }

    /**
     * 查询流水账单
     *
     * 客户在自建平台查询自己的消费流水账单。
     * 
     * 客户登录费用中心查询自己的消费流水账单请参见[这里](https://support.huaweicloud.com/usermanual-billing/bills-topic_80000001.html#bills-topic_80000001__zh-cn_topic_0000001162496407_s716e04d5d0ba4e9d9a76a8bcbfbcfe73)的“**查看流水账单**”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerBillsFeeRecordsRequest 请求对象
     * @return ListCustomerBillsFeeRecordsResponse
     */
    public ListCustomerBillsFeeRecordsResponse listCustomerBillsFeeRecords(ListCustomerBillsFeeRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerBillsFeeRecords);
    }

    /**
     * 查询流水账单
     *
     * 客户在自建平台查询自己的消费流水账单。
     * 
     * 客户登录费用中心查询自己的消费流水账单请参见[这里](https://support.huaweicloud.com/usermanual-billing/bills-topic_80000001.html#bills-topic_80000001__zh-cn_topic_0000001162496407_s716e04d5d0ba4e9d9a76a8bcbfbcfe73)的“**查看流水账单**”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerBillsFeeRecordsRequest 请求对象
     * @return SyncInvoker<ListCustomerBillsFeeRecordsRequest, ListCustomerBillsFeeRecordsResponse>
     */
    public SyncInvoker<ListCustomerBillsFeeRecordsRequest, ListCustomerBillsFeeRecordsResponse> listCustomerBillsFeeRecordsInvoker(
        ListCustomerBillsFeeRecordsRequest request) {
        return new SyncInvoker<ListCustomerBillsFeeRecordsRequest, ListCustomerBillsFeeRecordsResponse>(request,
            BssMeta.listCustomerBillsFeeRecords, hcClient);
    }

    /**
     * 查询月度成本
     *
     * 客户可以查询指定月份的月度摊销成本。当前仅支持查询近18个月的摊销成本。摊销成本计算规则请参见[成本摊销规则](https://support.huaweicloud.com/usermanual-cost/costcenter_000002_01.html)。
     * 
     * 客户可查询的数据范围同成本中心提供的[数据范围](https://support.huaweicloud.com/usermanual-cost/costcenter_0000004.html)一致。
     * 
     * 客户登录成本中心导出成本明细请参见[导出成本明细数据](https://support.huaweicloud.com/usermanual-cost/costcenter_000002_03.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;该接口仅面向已开通成本中心的客户开放。如何开启成本中心请参见[这里](https://support.huaweicloud.com/usermanual-cost/costcenter_000004.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerBillsMonthlyBreakDownRequest 请求对象
     * @return ListCustomerBillsMonthlyBreakDownResponse
     */
    public ListCustomerBillsMonthlyBreakDownResponse listCustomerBillsMonthlyBreakDown(
        ListCustomerBillsMonthlyBreakDownRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerBillsMonthlyBreakDown);
    }

    /**
     * 查询月度成本
     *
     * 客户可以查询指定月份的月度摊销成本。当前仅支持查询近18个月的摊销成本。摊销成本计算规则请参见[成本摊销规则](https://support.huaweicloud.com/usermanual-cost/costcenter_000002_01.html)。
     * 
     * 客户可查询的数据范围同成本中心提供的[数据范围](https://support.huaweicloud.com/usermanual-cost/costcenter_0000004.html)一致。
     * 
     * 客户登录成本中心导出成本明细请参见[导出成本明细数据](https://support.huaweicloud.com/usermanual-cost/costcenter_000002_03.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;该接口仅面向已开通成本中心的客户开放。如何开启成本中心请参见[这里](https://support.huaweicloud.com/usermanual-cost/costcenter_000004.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerBillsMonthlyBreakDownRequest 请求对象
     * @return SyncInvoker<ListCustomerBillsMonthlyBreakDownRequest, ListCustomerBillsMonthlyBreakDownResponse>
     */
    public SyncInvoker<ListCustomerBillsMonthlyBreakDownRequest, ListCustomerBillsMonthlyBreakDownResponse> listCustomerBillsMonthlyBreakDownInvoker(
        ListCustomerBillsMonthlyBreakDownRequest request) {
        return new SyncInvoker<ListCustomerBillsMonthlyBreakDownRequest, ListCustomerBillsMonthlyBreakDownResponse>(
            request, BssMeta.listCustomerBillsMonthlyBreakDown, hcClient);
    }

    /**
     * 查询客户按需资源列表
     *
     * 合作伙伴可以查询关联的代售类客户已开通的按需资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return ListCustomerOnDemandResourcesResponse
     */
    public ListCustomerOnDemandResourcesResponse listCustomerOnDemandResources(
        ListCustomerOnDemandResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerOnDemandResources);
    }

    /**
     * 查询客户按需资源列表
     *
     * 合作伙伴可以查询关联的代售类客户已开通的按需资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return SyncInvoker<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse>
     */
    public SyncInvoker<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesInvoker(
        ListCustomerOnDemandResourcesRequest request) {
        return new SyncInvoker<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse>(request,
            BssMeta.listCustomerOnDemandResources, hcClient);
    }

    /**
     * 查询订单列表
     *
     * 客户购买包年/包月资源后，可以查看待审核、处理中、已取消、已完成和待支付等状态的订单。
     * 
     * 伙伴登录伙伴中心查看客户订单请单击[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0076200001.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;如果想查询某条订单下的资源信息，在调用本接口获取订单ID后，请调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)”接口在请求参数输入订单号进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return ListCustomerOrdersResponse
     */
    public ListCustomerOrdersResponse listCustomerOrders(ListCustomerOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerOrders);
    }

    /**
     * 查询订单列表
     *
     * 客户购买包年/包月资源后，可以查看待审核、处理中、已取消、已完成和待支付等状态的订单。
     * 
     * 伙伴登录伙伴中心查看客户订单请单击[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0076200001.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;如果想查询某条订单下的资源信息，在调用本接口获取订单ID后，请调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)”接口在请求参数输入订单号进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return SyncInvoker<ListCustomerOrdersRequest, ListCustomerOrdersResponse>
     */
    public SyncInvoker<ListCustomerOrdersRequest, ListCustomerOrdersResponse> listCustomerOrdersInvoker(
        ListCustomerOrdersRequest request) {
        return new SyncInvoker<ListCustomerOrdersRequest, ListCustomerOrdersResponse>(request,
            BssMeta.listCustomerOrders, hcClient);
    }

    /**
     * 查询客户账户余额
     *
     * 合作伙伴可以查询关联的代售类客户的账户余额。
     * 
     * 伙伴登录伙伴中心查询客户余额请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435115.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;顾问销售类客户是客户在华为云充值，合作伙伴无法调用此接口查询其账户余额。代售类客户的账户由合作伙伴拨款，所以可以查询到。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomersBalancesDetailRequest 请求对象
     * @return ListCustomersBalancesDetailResponse
     */
    public ListCustomersBalancesDetailResponse listCustomersBalancesDetail(ListCustomersBalancesDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomersBalancesDetail);
    }

    /**
     * 查询客户账户余额
     *
     * 合作伙伴可以查询关联的代售类客户的账户余额。
     * 
     * 伙伴登录伙伴中心查询客户余额请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435115.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;顾问销售类客户是客户在华为云充值，合作伙伴无法调用此接口查询其账户余额。代售类客户的账户由合作伙伴拨款，所以可以查询到。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomersBalancesDetailRequest 请求对象
     * @return SyncInvoker<ListCustomersBalancesDetailRequest, ListCustomersBalancesDetailResponse>
     */
    public SyncInvoker<ListCustomersBalancesDetailRequest, ListCustomersBalancesDetailResponse> listCustomersBalancesDetailInvoker(
        ListCustomersBalancesDetailRequest request) {
        return new SyncInvoker<ListCustomersBalancesDetailRequest, ListCustomersBalancesDetailResponse>(request,
            BssMeta.listCustomersBalancesDetail, hcClient);
    }

    /**
     * 查询资源详单
     *
     * 客户在自建平台查询自己的资源详单，用于反映各类资源的消耗情况。
     * 
     * 客户登录费用中心查询资源详单请参见[这里](https://support.huaweicloud.com/usermanual-billing/bills_topic_100000063.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;由于资源消费呈现的是资源维度的8位小数原始消费金额，实际从账户扣费时按2位小数进行扣费（即扣到分），会存在精度差异，所以，不推荐消费汇总和资源消费直接对账。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return ListCustomerselfResourceRecordDetailsResponse
     */
    public ListCustomerselfResourceRecordDetailsResponse listCustomerselfResourceRecordDetails(
        ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerselfResourceRecordDetails);
    }

    /**
     * 查询资源详单
     *
     * 客户在自建平台查询自己的资源详单，用于反映各类资源的消耗情况。
     * 
     * 客户登录费用中心查询资源详单请参见[这里](https://support.huaweicloud.com/usermanual-billing/bills_topic_100000063.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;由于资源消费呈现的是资源维度的8位小数原始消费金额，实际从账户扣费时按2位小数进行扣费（即扣到分），会存在精度差异，所以，不推荐消费汇总和资源消费直接对账。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return SyncInvoker<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse>
     */
    public SyncInvoker<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsInvoker(
        ListCustomerselfResourceRecordDetailsRequest request) {
        return new SyncInvoker<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse>(
            request, BssMeta.listCustomerselfResourceRecordDetails, hcClient);
    }

    /**
     * 查询资源消费记录
     *
     * 客户在自建平台查询每个资源的消费明细数据。
     * 
     * 客户登录费用中心查询资源消费记录请参见[这里](https://support.huaweicloud.com/usermanual-billing/bills_topic_100000061.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return ListCustomerselfResourceRecordsResponse
     */
    public ListCustomerselfResourceRecordsResponse listCustomerselfResourceRecords(
        ListCustomerselfResourceRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerselfResourceRecords);
    }

    /**
     * 查询资源消费记录
     *
     * 客户在自建平台查询每个资源的消费明细数据。
     * 
     * 客户登录费用中心查询资源消费记录请参见[这里](https://support.huaweicloud.com/usermanual-billing/bills_topic_100000061.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return SyncInvoker<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse>
     */
    public SyncInvoker<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsInvoker(
        ListCustomerselfResourceRecordsRequest request) {
        return new SyncInvoker<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse>(request,
            BssMeta.listCustomerselfResourceRecords, hcClient);
    }

    /**
     * 查询企业子账号可回收余额
     *
     * 企业主账号在自建平台查询企业子账号的可回收余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnterpriseMultiAccountRequest 请求对象
     * @return ListEnterpriseMultiAccountResponse
     */
    public ListEnterpriseMultiAccountResponse listEnterpriseMultiAccount(ListEnterpriseMultiAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listEnterpriseMultiAccount);
    }

    /**
     * 查询企业子账号可回收余额
     *
     * 企业主账号在自建平台查询企业子账号的可回收余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnterpriseMultiAccountRequest 请求对象
     * @return SyncInvoker<ListEnterpriseMultiAccountRequest, ListEnterpriseMultiAccountResponse>
     */
    public SyncInvoker<ListEnterpriseMultiAccountRequest, ListEnterpriseMultiAccountResponse> listEnterpriseMultiAccountInvoker(
        ListEnterpriseMultiAccountRequest request) {
        return new SyncInvoker<ListEnterpriseMultiAccountRequest, ListEnterpriseMultiAccountResponse>(request,
            BssMeta.listEnterpriseMultiAccount, hcClient);
    }

    /**
     * 查询企业组织结构
     *
     * 企业主账号在自建平台查询企业组织结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnterpriseOrganizationsRequest 请求对象
     * @return ListEnterpriseOrganizationsResponse
     */
    public ListEnterpriseOrganizationsResponse listEnterpriseOrganizations(ListEnterpriseOrganizationsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listEnterpriseOrganizations);
    }

    /**
     * 查询企业组织结构
     *
     * 企业主账号在自建平台查询企业组织结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnterpriseOrganizationsRequest 请求对象
     * @return SyncInvoker<ListEnterpriseOrganizationsRequest, ListEnterpriseOrganizationsResponse>
     */
    public SyncInvoker<ListEnterpriseOrganizationsRequest, ListEnterpriseOrganizationsResponse> listEnterpriseOrganizationsInvoker(
        ListEnterpriseOrganizationsRequest request) {
        return new SyncInvoker<ListEnterpriseOrganizationsRequest, ListEnterpriseOrganizationsResponse>(request,
            BssMeta.listEnterpriseOrganizations, hcClient);
    }

    /**
     * 查询企业子账号列表
     *
     * 企业主账号在自建平台查询企业子账号信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnterpriseSubCustomersRequest 请求对象
     * @return ListEnterpriseSubCustomersResponse
     */
    public ListEnterpriseSubCustomersResponse listEnterpriseSubCustomers(ListEnterpriseSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listEnterpriseSubCustomers);
    }

    /**
     * 查询企业子账号列表
     *
     * 企业主账号在自建平台查询企业子账号信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnterpriseSubCustomersRequest 请求对象
     * @return SyncInvoker<ListEnterpriseSubCustomersRequest, ListEnterpriseSubCustomersResponse>
     */
    public SyncInvoker<ListEnterpriseSubCustomersRequest, ListEnterpriseSubCustomersResponse> listEnterpriseSubCustomersInvoker(
        ListEnterpriseSubCustomersRequest request) {
        return new SyncInvoker<ListEnterpriseSubCustomersRequest, ListEnterpriseSubCustomersResponse>(request,
            BssMeta.listEnterpriseSubCustomers, hcClient);
    }

    /**
     * 查询资源包列表
     *
     * 客户在伙伴销售平台查询客户的资源包列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourceInfosRequest 请求对象
     * @return ListFreeResourceInfosResponse
     */
    public ListFreeResourceInfosResponse listFreeResourceInfos(ListFreeResourceInfosRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listFreeResourceInfos);
    }

    /**
     * 查询资源包列表
     *
     * 客户在伙伴销售平台查询客户的资源包列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourceInfosRequest 请求对象
     * @return SyncInvoker<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse>
     */
    public SyncInvoker<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse> listFreeResourceInfosInvoker(
        ListFreeResourceInfosRequest request) {
        return new SyncInvoker<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse>(request,
            BssMeta.listFreeResourceInfos, hcClient);
    }

    /**
     * 查询资源包使用量
     *
     * 客户在伙伴销售平台根据资源项维度查询客户的资源包使用量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourceUsagesRequest 请求对象
     * @return ListFreeResourceUsagesResponse
     */
    public ListFreeResourceUsagesResponse listFreeResourceUsages(ListFreeResourceUsagesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listFreeResourceUsages);
    }

    /**
     * 查询资源包使用量
     *
     * 客户在伙伴销售平台根据资源项维度查询客户的资源包使用量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourceUsagesRequest 请求对象
     * @return SyncInvoker<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse>
     */
    public SyncInvoker<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> listFreeResourceUsagesInvoker(
        ListFreeResourceUsagesRequest request) {
        return new SyncInvoker<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse>(request,
            BssMeta.listFreeResourceUsages, hcClient);
    }

    /**
     * 查询资源包使用明细
     *
     * 客户在自建平台查询资源包使用明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourcesUsageRecordsRequest 请求对象
     * @return ListFreeResourcesUsageRecordsResponse
     */
    public ListFreeResourcesUsageRecordsResponse listFreeResourcesUsageRecords(
        ListFreeResourcesUsageRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listFreeResourcesUsageRecords);
    }

    /**
     * 查询资源包使用明细
     *
     * 客户在自建平台查询资源包使用明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourcesUsageRecordsRequest 请求对象
     * @return SyncInvoker<ListFreeResourcesUsageRecordsRequest, ListFreeResourcesUsageRecordsResponse>
     */
    public SyncInvoker<ListFreeResourcesUsageRecordsRequest, ListFreeResourcesUsageRecordsResponse> listFreeResourcesUsageRecordsInvoker(
        ListFreeResourcesUsageRecordsRequest request) {
        return new SyncInvoker<ListFreeResourcesUsageRecordsRequest, ListFreeResourcesUsageRecordsResponse>(request,
            BssMeta.listFreeResourcesUsageRecords, hcClient);
    }

    /**
     * 查询产品的折扣和激励策略
     *
     * 伙伴在伙伴销售平台上查询产品的折扣和激励策略。
     * 
     * 伙伴登录合作伙伴中心查看产品的折扣和激励策略请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120400.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIncentiveDiscountPoliciesRequest 请求对象
     * @return ListIncentiveDiscountPoliciesResponse
     */
    public ListIncentiveDiscountPoliciesResponse listIncentiveDiscountPolicies(
        ListIncentiveDiscountPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIncentiveDiscountPolicies);
    }

    /**
     * 查询产品的折扣和激励策略
     *
     * 伙伴在伙伴销售平台上查询产品的折扣和激励策略。
     * 
     * 伙伴登录合作伙伴中心查看产品的折扣和激励策略请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120400.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIncentiveDiscountPoliciesRequest 请求对象
     * @return SyncInvoker<ListIncentiveDiscountPoliciesRequest, ListIncentiveDiscountPoliciesResponse>
     */
    public SyncInvoker<ListIncentiveDiscountPoliciesRequest, ListIncentiveDiscountPoliciesResponse> listIncentiveDiscountPoliciesInvoker(
        ListIncentiveDiscountPoliciesRequest request) {
        return new SyncInvoker<ListIncentiveDiscountPoliciesRequest, ListIncentiveDiscountPoliciesResponse>(request,
            BssMeta.listIncentiveDiscountPolicies, hcClient);
    }

    /**
     * 查询云经销商列表
     *
     * 华为云总经销商（一级经销商）可以查询云经销商（二级经销商）列表。
     * 
     * 一级经销商在伙伴中心查询二级经销商列表的方式请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120210.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIndirectPartnersRequest 请求对象
     * @return ListIndirectPartnersResponse
     */
    public ListIndirectPartnersResponse listIndirectPartners(ListIndirectPartnersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIndirectPartners);
    }

    /**
     * 查询云经销商列表
     *
     * 华为云总经销商（一级经销商）可以查询云经销商（二级经销商）列表。
     * 
     * 一级经销商在伙伴中心查询二级经销商列表的方式请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120210.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIndirectPartnersRequest 请求对象
     * @return SyncInvoker<ListIndirectPartnersRequest, ListIndirectPartnersResponse>
     */
    public SyncInvoker<ListIndirectPartnersRequest, ListIndirectPartnersResponse> listIndirectPartnersInvoker(
        ListIndirectPartnersRequest request) {
        return new SyncInvoker<ListIndirectPartnersRequest, ListIndirectPartnersResponse>(request,
            BssMeta.listIndirectPartners, hcClient);
    }

    /**
     * 查询已发放的代金券额度
     *
     * 华为云总经销商（一级经销商）可以查看发放给云经销商（二级经销商）的代金券额度列表。
     * 
     * 一级经销商登录伙伴中心，进入“客户业务** **\\&gt; 代金券管理”，选择“已发放代金券额度”可查看代金券额度列表。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;调用该接口之前，需通过客户经理联系华为运营人员，为合作伙伴设置代金券发放额度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssuedCouponQuotasRequest 请求对象
     * @return ListIssuedCouponQuotasResponse
     */
    public ListIssuedCouponQuotasResponse listIssuedCouponQuotas(ListIssuedCouponQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIssuedCouponQuotas);
    }

    /**
     * 查询已发放的代金券额度
     *
     * 华为云总经销商（一级经销商）可以查看发放给云经销商（二级经销商）的代金券额度列表。
     * 
     * 一级经销商登录伙伴中心，进入“客户业务** **\\&gt; 代金券管理”，选择“已发放代金券额度”可查看代金券额度列表。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;调用该接口之前，需通过客户经理联系华为运营人员，为合作伙伴设置代金券发放额度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssuedCouponQuotasRequest 请求对象
     * @return SyncInvoker<ListIssuedCouponQuotasRequest, ListIssuedCouponQuotasResponse>
     */
    public SyncInvoker<ListIssuedCouponQuotasRequest, ListIssuedCouponQuotasResponse> listIssuedCouponQuotasInvoker(
        ListIssuedCouponQuotasRequest request) {
        return new SyncInvoker<ListIssuedCouponQuotasRequest, ListIssuedCouponQuotasResponse>(request,
            BssMeta.listIssuedCouponQuotas, hcClient);
    }

    /**
     * 查询已发放的优惠券
     *
     * 合作伙伴可以查询已发放的优惠券列表。
     * 
     * 伙伴登录伙伴中心，进入“客户业务** **\\&gt; 代金券管理”，选择“已发放代金券”页签，即可查询已发放的代金券。
     * 
     * 伙伴登录伙伴中心，进入“客户业务 \\&gt; 现金券管理”，选择“已发放现金券”页签，即可查询已发放的现金券。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   只可查到失效时间在12个月内的代金/现金劵。
     * &gt;-   在API只可以查询代售子客户已发放的代金/现金劵，在伙伴中心可以查询代售和顾问销售已发放的代金/现金劵，对比一致性时需要注意关联模式是否一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssuedPartnerCouponsRequest 请求对象
     * @return ListIssuedPartnerCouponsResponse
     */
    public ListIssuedPartnerCouponsResponse listIssuedPartnerCoupons(ListIssuedPartnerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIssuedPartnerCoupons);
    }

    /**
     * 查询已发放的优惠券
     *
     * 合作伙伴可以查询已发放的优惠券列表。
     * 
     * 伙伴登录伙伴中心，进入“客户业务** **\\&gt; 代金券管理”，选择“已发放代金券”页签，即可查询已发放的代金券。
     * 
     * 伙伴登录伙伴中心，进入“客户业务 \\&gt; 现金券管理”，选择“已发放现金券”页签，即可查询已发放的现金券。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   只可查到失效时间在12个月内的代金/现金劵。
     * &gt;-   在API只可以查询代售子客户已发放的代金/现金劵，在伙伴中心可以查询代售和顾问销售已发放的代金/现金劵，对比一致性时需要注意关联模式是否一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssuedPartnerCouponsRequest 请求对象
     * @return SyncInvoker<ListIssuedPartnerCouponsRequest, ListIssuedPartnerCouponsResponse>
     */
    public SyncInvoker<ListIssuedPartnerCouponsRequest, ListIssuedPartnerCouponsResponse> listIssuedPartnerCouponsInvoker(
        ListIssuedPartnerCouponsRequest request) {
        return new SyncInvoker<ListIssuedPartnerCouponsRequest, ListIssuedPartnerCouponsResponse>(request,
            BssMeta.listIssuedPartnerCoupons, hcClient);
    }

    /**
     * 查询度量单位列表
     *
     * 伙伴在伙伴销售平台上查询资源使用量，包年包月资源的时长及金额的度量单位及名称，度量单位类型等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMeasureUnitsRequest 请求对象
     * @return ListMeasureUnitsResponse
     */
    public ListMeasureUnitsResponse listMeasureUnits(ListMeasureUnitsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listMeasureUnits);
    }

    /**
     * 查询度量单位列表
     *
     * 伙伴在伙伴销售平台上查询资源使用量，包年包月资源的时长及金额的度量单位及名称，度量单位类型等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMeasureUnitsRequest 请求对象
     * @return SyncInvoker<ListMeasureUnitsRequest, ListMeasureUnitsResponse>
     */
    public SyncInvoker<ListMeasureUnitsRequest, ListMeasureUnitsResponse> listMeasureUnitsInvoker(
        ListMeasureUnitsRequest request) {
        return new SyncInvoker<ListMeasureUnitsRequest, ListMeasureUnitsResponse>(request, BssMeta.listMeasureUnits,
            hcClient);
    }

    /**
     * 查询企业子账号可回收优惠券列表
     *
     * 企业主账号在自建平台查询企业子账号的可回收优惠券。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   仅支持华为发放的测试类、商务类、活动类代金券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMultiAccountRetrieveCouponsRequest 请求对象
     * @return ListMultiAccountRetrieveCouponsResponse
     */
    public ListMultiAccountRetrieveCouponsResponse listMultiAccountRetrieveCoupons(
        ListMultiAccountRetrieveCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listMultiAccountRetrieveCoupons);
    }

    /**
     * 查询企业子账号可回收优惠券列表
     *
     * 企业主账号在自建平台查询企业子账号的可回收优惠券。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   仅支持华为发放的测试类、商务类、活动类代金券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMultiAccountRetrieveCouponsRequest 请求对象
     * @return SyncInvoker<ListMultiAccountRetrieveCouponsRequest, ListMultiAccountRetrieveCouponsResponse>
     */
    public SyncInvoker<ListMultiAccountRetrieveCouponsRequest, ListMultiAccountRetrieveCouponsResponse> listMultiAccountRetrieveCouponsInvoker(
        ListMultiAccountRetrieveCouponsRequest request) {
        return new SyncInvoker<ListMultiAccountRetrieveCouponsRequest, ListMultiAccountRetrieveCouponsResponse>(request,
            BssMeta.listMultiAccountRetrieveCoupons, hcClient);
    }

    /**
     * 查询企业主账号可拨款优惠券列表
     *
     * 企业主账号在自建平台查询自己的可拨款优惠券列表。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   仅支持华为发放的测试类、商务类、活动类代金券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMultiAccountTransferCouponsRequest 请求对象
     * @return ListMultiAccountTransferCouponsResponse
     */
    public ListMultiAccountTransferCouponsResponse listMultiAccountTransferCoupons(
        ListMultiAccountTransferCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listMultiAccountTransferCoupons);
    }

    /**
     * 查询企业主账号可拨款优惠券列表
     *
     * 企业主账号在自建平台查询自己的可拨款优惠券列表。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   仅支持华为发放的测试类、商务类、活动类代金券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMultiAccountTransferCouponsRequest 请求对象
     * @return SyncInvoker<ListMultiAccountTransferCouponsRequest, ListMultiAccountTransferCouponsResponse>
     */
    public SyncInvoker<ListMultiAccountTransferCouponsRequest, ListMultiAccountTransferCouponsResponse> listMultiAccountTransferCouponsInvoker(
        ListMultiAccountTransferCouponsRequest request) {
        return new SyncInvoker<ListMultiAccountTransferCouponsRequest, ListMultiAccountTransferCouponsResponse>(request,
            BssMeta.listMultiAccountTransferCoupons, hcClient);
    }

    /**
     * 查询按需产品价格
     *
     * 伙伴在销售平台按照条件查询按需产品的价格。
     * 
     * 如果购买该产品的租户享受折扣，可以在查询结果中返回折扣金额以及扣除折扣后的最后成交价。
     * 
     * 如果该租户享受多种折扣，系统会优先返回客户享受的商务折扣的折扣金额和最终成交价。
     * 
     * &gt;![](public_sys-resources/icon-caution.gif) **注意：** 
     * &gt;华为云根据云服务类型、资源类型、云服务区和资源规格四个条件来查询产品，查询时请确认这4个查询条件均输入正确，否则该接口会返回无法找到产品的错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return ListOnDemandResourceRatingsResponse
     */
    public ListOnDemandResourceRatingsResponse listOnDemandResourceRatings(ListOnDemandResourceRatingsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listOnDemandResourceRatings);
    }

    /**
     * 查询按需产品价格
     *
     * 伙伴在销售平台按照条件查询按需产品的价格。
     * 
     * 如果购买该产品的租户享受折扣，可以在查询结果中返回折扣金额以及扣除折扣后的最后成交价。
     * 
     * 如果该租户享受多种折扣，系统会优先返回客户享受的商务折扣的折扣金额和最终成交价。
     * 
     * &gt;![](public_sys-resources/icon-caution.gif) **注意：** 
     * &gt;华为云根据云服务类型、资源类型、云服务区和资源规格四个条件来查询产品，查询时请确认这4个查询条件均输入正确，否则该接口会返回无法找到产品的错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return SyncInvoker<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse>
     */
    public SyncInvoker<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> listOnDemandResourceRatingsInvoker(
        ListOnDemandResourceRatingsRequest request) {
        return new SyncInvoker<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse>(request,
            BssMeta.listOnDemandResourceRatings, hcClient);
    }

    /**
     * 查询订单可用优惠券
     *
     * 客户在伙伴销售平台支付待支付订单时，查询可使用的优惠券列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrderCouponsByOrderIdRequest 请求对象
     * @return ListOrderCouponsByOrderIdResponse
     */
    public ListOrderCouponsByOrderIdResponse listOrderCouponsByOrderId(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listOrderCouponsByOrderId);
    }

    /**
     * 查询订单可用优惠券
     *
     * 客户在伙伴销售平台支付待支付订单时，查询可使用的优惠券列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrderCouponsByOrderIdRequest 请求对象
     * @return SyncInvoker<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse>
     */
    public SyncInvoker<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderIdInvoker(
        ListOrderCouponsByOrderIdRequest request) {
        return new SyncInvoker<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse>(request,
            BssMeta.listOrderCouponsByOrderId, hcClient);
    }

    /**
     * 查询订单可用折扣
     *
     * 客户在伙伴销售平台支付待支付订单时，查询可使用的折扣信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrderDiscountsRequest 请求对象
     * @return ListOrderDiscountsResponse
     */
    public ListOrderDiscountsResponse listOrderDiscounts(ListOrderDiscountsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listOrderDiscounts);
    }

    /**
     * 查询订单可用折扣
     *
     * 客户在伙伴销售平台支付待支付订单时，查询可使用的折扣信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrderDiscountsRequest 请求对象
     * @return SyncInvoker<ListOrderDiscountsRequest, ListOrderDiscountsResponse>
     */
    public SyncInvoker<ListOrderDiscountsRequest, ListOrderDiscountsResponse> listOrderDiscountsInvoker(
        ListOrderDiscountsRequest request) {
        return new SyncInvoker<ListOrderDiscountsRequest, ListOrderDiscountsResponse>(request,
            BssMeta.listOrderDiscounts, hcClient);
    }

    /**
     * 查询收支明细
     *
     * 伙伴在伙伴销售平台上查询自身的收支明细情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnerAccountChangeRecordsRequest 请求对象
     * @return ListPartnerAccountChangeRecordsResponse
     */
    public ListPartnerAccountChangeRecordsResponse listPartnerAccountChangeRecords(
        ListPartnerAccountChangeRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerAccountChangeRecords);
    }

    /**
     * 查询收支明细
     *
     * 伙伴在伙伴销售平台上查询自身的收支明细情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnerAccountChangeRecordsRequest 请求对象
     * @return SyncInvoker<ListPartnerAccountChangeRecordsRequest, ListPartnerAccountChangeRecordsResponse>
     */
    public SyncInvoker<ListPartnerAccountChangeRecordsRequest, ListPartnerAccountChangeRecordsResponse> listPartnerAccountChangeRecordsInvoker(
        ListPartnerAccountChangeRecordsRequest request) {
        return new SyncInvoker<ListPartnerAccountChangeRecordsRequest, ListPartnerAccountChangeRecordsResponse>(request,
            BssMeta.listPartnerAccountChangeRecords, hcClient);
    }

    /**
     * 查询调账记录
     *
     * 伙伴在伙伴销售平台查询向客户及关联的云经销商（二级经销商）拨款或回收的调账记录。
     * 
     * 伙伴登录伙伴中心，在“拨款”或“回收”页面，单击“调账记录”，可以查看一级经销商为二级经销商调账的记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnerAdjustRecordsRequest 请求对象
     * @return ListPartnerAdjustRecordsResponse
     */
    public ListPartnerAdjustRecordsResponse listPartnerAdjustRecords(ListPartnerAdjustRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerAdjustRecords);
    }

    /**
     * 查询调账记录
     *
     * 伙伴在伙伴销售平台查询向客户及关联的云经销商（二级经销商）拨款或回收的调账记录。
     * 
     * 伙伴登录伙伴中心，在“拨款”或“回收”页面，单击“调账记录”，可以查看一级经销商为二级经销商调账的记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnerAdjustRecordsRequest 请求对象
     * @return SyncInvoker<ListPartnerAdjustRecordsRequest, ListPartnerAdjustRecordsResponse>
     */
    public SyncInvoker<ListPartnerAdjustRecordsRequest, ListPartnerAdjustRecordsResponse> listPartnerAdjustRecordsInvoker(
        ListPartnerAdjustRecordsRequest request) {
        return new SyncInvoker<ListPartnerAdjustRecordsRequest, ListPartnerAdjustRecordsResponse>(request,
            BssMeta.listPartnerAdjustRecords, hcClient);
    }

    /**
     * 查询云经销商账户余额
     *
     * 华为云总经销商（一级经销商）可以查询关联的云经销商（二级经销商）的账户余额；云经销商伙伴可以查询自己的账户余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnerBalancesRequest 请求对象
     * @return ListPartnerBalancesResponse
     */
    public ListPartnerBalancesResponse listPartnerBalances(ListPartnerBalancesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerBalances);
    }

    /**
     * 查询云经销商账户余额
     *
     * 华为云总经销商（一级经销商）可以查询关联的云经销商（二级经销商）的账户余额；云经销商伙伴可以查询自己的账户余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnerBalancesRequest 请求对象
     * @return SyncInvoker<ListPartnerBalancesRequest, ListPartnerBalancesResponse>
     */
    public SyncInvoker<ListPartnerBalancesRequest, ListPartnerBalancesResponse> listPartnerBalancesInvoker(
        ListPartnerBalancesRequest request) {
        return new SyncInvoker<ListPartnerBalancesRequest, ListPartnerBalancesResponse>(request,
            BssMeta.listPartnerBalances, hcClient);
    }

    /**
     * 查询优惠券的发放回收记录
     *
     * 合作伙伴可查看给客户发放和回收优惠券的操作记录。
     * 
     * 合作伙伴登录伙伴中心查看、导出代金券操作日志请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435103.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnerCouponsRecordRequest 请求对象
     * @return ListPartnerCouponsRecordResponse
     */
    public ListPartnerCouponsRecordResponse listPartnerCouponsRecord(ListPartnerCouponsRecordRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerCouponsRecord);
    }

    /**
     * 查询优惠券的发放回收记录
     *
     * 合作伙伴可查看给客户发放和回收优惠券的操作记录。
     * 
     * 合作伙伴登录伙伴中心查看、导出代金券操作日志请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435103.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnerCouponsRecordRequest 请求对象
     * @return SyncInvoker<ListPartnerCouponsRecordRequest, ListPartnerCouponsRecordResponse>
     */
    public SyncInvoker<ListPartnerCouponsRecordRequest, ListPartnerCouponsRecordResponse> listPartnerCouponsRecordInvoker(
        ListPartnerCouponsRecordRequest request) {
        return new SyncInvoker<ListPartnerCouponsRecordRequest, ListPartnerCouponsRecordResponse>(request,
            BssMeta.listPartnerCouponsRecord, hcClient);
    }

    /**
     * 查询客户包年/包月资源列表
     *
     * 客户在伙伴销售平台查询某个或所有的包年/包月资源。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;成功调用本接口后，如果您需要对已生效状态的资源进行续订，您可以调用“[查询包年/包月产品价格](https://support.huaweicloud.com/api-bpconsole/bcloud_01002.html)”接口对查询到的包年/包月资源进行续订询价，然后再调用“[续订包年/包月资源](https://support.huaweicloud.com/api-bpconsole/api_order_00018.html)”接口进行续订。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return ListPayPerUseCustomerResourcesResponse
     */
    public ListPayPerUseCustomerResourcesResponse listPayPerUseCustomerResources(
        ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPayPerUseCustomerResources);
    }

    /**
     * 查询客户包年/包月资源列表
     *
     * 客户在伙伴销售平台查询某个或所有的包年/包月资源。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;成功调用本接口后，如果您需要对已生效状态的资源进行续订，您可以调用“[查询包年/包月产品价格](https://support.huaweicloud.com/api-bpconsole/bcloud_01002.html)”接口对查询到的包年/包月资源进行续订询价，然后再调用“[续订包年/包月资源](https://support.huaweicloud.com/api-bpconsole/api_order_00018.html)”接口进行续订。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return SyncInvoker<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse>
     */
    public SyncInvoker<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesInvoker(
        ListPayPerUseCustomerResourcesRequest request) {
        return new SyncInvoker<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse>(request,
            BssMeta.listPayPerUseCustomerResources, hcClient);
    }

    /**
     * 查询邮寄地址
     *
     * 伙伴可以查询自己的邮寄地址信息。
     * 
     * 伙伴登录伙伴中心查询邮寄地址请参见[向华为云索取发票](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435143.html)，进入索取发票页面，即可查看邮寄地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostalAddressRequest 请求对象
     * @return ListPostalAddressResponse
     */
    public ListPostalAddressResponse listPostalAddress(ListPostalAddressRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPostalAddress);
    }

    /**
     * 查询邮寄地址
     *
     * 伙伴可以查询自己的邮寄地址信息。
     * 
     * 伙伴登录伙伴中心查询邮寄地址请参见[向华为云索取发票](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435143.html)，进入索取发票页面，即可查看邮寄地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostalAddressRequest 请求对象
     * @return SyncInvoker<ListPostalAddressRequest, ListPostalAddressResponse>
     */
    public SyncInvoker<ListPostalAddressRequest, ListPostalAddressResponse> listPostalAddressInvoker(
        ListPostalAddressRequest request) {
        return new SyncInvoker<ListPostalAddressRequest, ListPostalAddressResponse>(request, BssMeta.listPostalAddress,
            hcClient);
    }

    /**
     * 查询省份信息
     *
     * 伙伴在伙伴销售平台上查询省份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProvincesRequest 请求对象
     * @return ListProvincesResponse
     */
    public ListProvincesResponse listProvinces(ListProvincesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listProvinces);
    }

    /**
     * 查询省份信息
     *
     * 伙伴在伙伴销售平台上查询省份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProvincesRequest 请求对象
     * @return SyncInvoker<ListProvincesRequest, ListProvincesResponse>
     */
    public SyncInvoker<ListProvincesRequest, ListProvincesResponse> listProvincesInvoker(ListProvincesRequest request) {
        return new SyncInvoker<ListProvincesRequest, ListProvincesResponse>(request, BssMeta.listProvinces, hcClient);
    }

    /**
     * 查询优惠券额度
     *
     * 合作伙伴可以查看所拥有的优惠劵额度。
     * 
     * 伙伴登录合作伙伴中心查看所拥有的代金券额度请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435100.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaCouponsRequest 请求对象
     * @return ListQuotaCouponsResponse
     */
    public ListQuotaCouponsResponse listQuotaCoupons(ListQuotaCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listQuotaCoupons);
    }

    /**
     * 查询优惠券额度
     *
     * 合作伙伴可以查看所拥有的优惠劵额度。
     * 
     * 伙伴登录合作伙伴中心查看所拥有的代金券额度请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435100.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaCouponsRequest 请求对象
     * @return SyncInvoker<ListQuotaCouponsRequest, ListQuotaCouponsResponse>
     */
    public SyncInvoker<ListQuotaCouponsRequest, ListQuotaCouponsResponse> listQuotaCouponsInvoker(
        ListQuotaCouponsRequest request) {
        return new SyncInvoker<ListQuotaCouponsRequest, ListQuotaCouponsResponse>(request, BssMeta.listQuotaCoupons,
            hcClient);
    }

    /**
     * 查询包年/包月产品价格
     *
     * 伙伴在销售平台按照条件查询包年/包月产品开通时候的价格。
     * 
     * 如果购买该产品的客户享受折扣，可以在查询结果中返回折扣金额以及扣除折扣后的最后成交价。
     * 
     * 如果该客户享受多种折扣，系统会返回每种折扣的批价结果。如果客户在下单的时候选择自动支付，则系统会优先应用商务折扣的批价结果。
     * 
     * &gt;![](public_sys-resources/icon-caution.gif) **注意：** 
     * &gt;华为云根据云服务类型、资源类型、云服务区和资源规格四个条件来查询产品，查询时请确认这4个查询条件均输入正确，否则该接口会返回无法找到产品的错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return ListRateOnPeriodDetailResponse
     */
    public ListRateOnPeriodDetailResponse listRateOnPeriodDetail(ListRateOnPeriodDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listRateOnPeriodDetail);
    }

    /**
     * 查询包年/包月产品价格
     *
     * 伙伴在销售平台按照条件查询包年/包月产品开通时候的价格。
     * 
     * 如果购买该产品的客户享受折扣，可以在查询结果中返回折扣金额以及扣除折扣后的最后成交价。
     * 
     * 如果该客户享受多种折扣，系统会返回每种折扣的批价结果。如果客户在下单的时候选择自动支付，则系统会优先应用商务折扣的批价结果。
     * 
     * &gt;![](public_sys-resources/icon-caution.gif) **注意：** 
     * &gt;华为云根据云服务类型、资源类型、云服务区和资源规格四个条件来查询产品，查询时请确认这4个查询条件均输入正确，否则该接口会返回无法找到产品的错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return SyncInvoker<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse>
     */
    public SyncInvoker<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> listRateOnPeriodDetailInvoker(
        ListRateOnPeriodDetailRequest request) {
        return new SyncInvoker<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse>(request,
            BssMeta.listRateOnPeriodDetail, hcClient);
    }

    /**
     * 查询待续订包年包月资源的续订金额
     *
     * 功能描述：客户在自建平台按照条件查询待续订包年/包月资源续订时候的续订金额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRenewRateOnPeriodRequest 请求对象
     * @return ListRenewRateOnPeriodResponse
     */
    public ListRenewRateOnPeriodResponse listRenewRateOnPeriod(ListRenewRateOnPeriodRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listRenewRateOnPeriod);
    }

    /**
     * 查询待续订包年包月资源的续订金额
     *
     * 功能描述：客户在自建平台按照条件查询待续订包年/包月资源续订时候的续订金额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRenewRateOnPeriodRequest 请求对象
     * @return SyncInvoker<ListRenewRateOnPeriodRequest, ListRenewRateOnPeriodResponse>
     */
    public SyncInvoker<ListRenewRateOnPeriodRequest, ListRenewRateOnPeriodResponse> listRenewRateOnPeriodInvoker(
        ListRenewRateOnPeriodRequest request) {
        return new SyncInvoker<ListRenewRateOnPeriodRequest, ListRenewRateOnPeriodResponse>(request,
            BssMeta.listRenewRateOnPeriod, hcClient);
    }

    /**
     * 查询资源类型列表
     *
     * 伙伴在伙伴销售平台查询资源类型的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTypesRequest 请求对象
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listResourceTypes);
    }

    /**
     * 查询资源类型列表
     *
     * 伙伴在伙伴销售平台查询资源类型的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTypesRequest 请求对象
     * @return SyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse>
     */
    public SyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse> listResourceTypesInvoker(
        ListResourceTypesRequest request) {
        return new SyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse>(request, BssMeta.listResourceTypes,
            hcClient);
    }

    /**
     * 查询95计费资源用量明细
     *
     * 客户在自建平台查询自己的资源使用量明细。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;当前仅支持查询CDN、OBS、IEC和VPC四种云服务类型的资源用量明细，仅针对95计费场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceUsageRequest 请求对象
     * @return ListResourceUsageResponse
     */
    public ListResourceUsageResponse listResourceUsage(ListResourceUsageRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listResourceUsage);
    }

    /**
     * 查询95计费资源用量明细
     *
     * 客户在自建平台查询自己的资源使用量明细。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;当前仅支持查询CDN、OBS、IEC和VPC四种云服务类型的资源用量明细，仅针对95计费场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceUsageRequest 请求对象
     * @return SyncInvoker<ListResourceUsageRequest, ListResourceUsageResponse>
     */
    public SyncInvoker<ListResourceUsageRequest, ListResourceUsageResponse> listResourceUsageInvoker(
        ListResourceUsageRequest request) {
        return new SyncInvoker<ListResourceUsageRequest, ListResourceUsageResponse>(request, BssMeta.listResourceUsage,
            hcClient);
    }

    /**
     * 查询95计费资源用量汇总
     *
     * 客户在自建平台查询自己的资源使用量汇总。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   当前仅支持查询CDN、OBS、IEC和VPC四种云服务类型的资源用量汇总，仅针对95计费场景。
     * &gt;-   使用量汇总列表只包含月汇总金额和资源ID，若要查询具体某个资源的用量明细，请调用[查询资源用量明细](https://support.huaweicloud.com/api-oce/zh-cn_topic_0000001190606757.html)接口获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceUsageSummaryRequest 请求对象
     * @return ListResourceUsageSummaryResponse
     */
    public ListResourceUsageSummaryResponse listResourceUsageSummary(ListResourceUsageSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listResourceUsageSummary);
    }

    /**
     * 查询95计费资源用量汇总
     *
     * 客户在自建平台查询自己的资源使用量汇总。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   当前仅支持查询CDN、OBS、IEC和VPC四种云服务类型的资源用量汇总，仅针对95计费场景。
     * &gt;-   使用量汇总列表只包含月汇总金额和资源ID，若要查询具体某个资源的用量明细，请调用[查询资源用量明细](https://support.huaweicloud.com/api-oce/zh-cn_topic_0000001190606757.html)接口获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceUsageSummaryRequest 请求对象
     * @return SyncInvoker<ListResourceUsageSummaryRequest, ListResourceUsageSummaryResponse>
     */
    public SyncInvoker<ListResourceUsageSummaryRequest, ListResourceUsageSummaryResponse> listResourceUsageSummaryInvoker(
        ListResourceUsageSummaryRequest request) {
        return new SyncInvoker<ListResourceUsageSummaryRequest, ListResourceUsageSummaryResponse>(request,
            BssMeta.listResourceUsageSummary, hcClient);
    }

    /**
     * 根据云服务类型查询资源列表
     *
     * 伙伴在伙伴销售平台根据云服务类型查询关联的资源类型编码和名称，用于查询按需产品的价格或包年/包月产品的价格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceResourcesRequest 请求对象
     * @return ListServiceResourcesResponse
     */
    public ListServiceResourcesResponse listServiceResources(ListServiceResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listServiceResources);
    }

    /**
     * 根据云服务类型查询资源列表
     *
     * 伙伴在伙伴销售平台根据云服务类型查询关联的资源类型编码和名称，用于查询按需产品的价格或包年/包月产品的价格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceResourcesRequest 请求对象
     * @return SyncInvoker<ListServiceResourcesRequest, ListServiceResourcesResponse>
     */
    public SyncInvoker<ListServiceResourcesRequest, ListServiceResourcesResponse> listServiceResourcesInvoker(
        ListServiceResourcesRequest request) {
        return new SyncInvoker<ListServiceResourcesRequest, ListServiceResourcesResponse>(request,
            BssMeta.listServiceResources, hcClient);
    }

    /**
     * 查询云服务类型列表
     *
     * 伙伴在伙伴销售平台查询云服务类型的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceTypesRequest 请求对象
     * @return ListServiceTypesResponse
     */
    public ListServiceTypesResponse listServiceTypes(ListServiceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listServiceTypes);
    }

    /**
     * 查询云服务类型列表
     *
     * 伙伴在伙伴销售平台查询云服务类型的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceTypesRequest 请求对象
     * @return SyncInvoker<ListServiceTypesRequest, ListServiceTypesResponse>
     */
    public SyncInvoker<ListServiceTypesRequest, ListServiceTypesResponse> listServiceTypesInvoker(
        ListServiceTypesRequest request) {
        return new SyncInvoker<ListServiceTypesRequest, ListServiceTypesResponse>(request, BssMeta.listServiceTypes,
            hcClient);
    }

    /**
     * 查询储值卡列表
     *
     * 客户可以查询已购买的储值卡列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoredValueCardsRequest 请求对象
     * @return ListStoredValueCardsResponse
     */
    public ListStoredValueCardsResponse listStoredValueCards(ListStoredValueCardsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listStoredValueCards);
    }

    /**
     * 查询储值卡列表
     *
     * 客户可以查询已购买的储值卡列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoredValueCardsRequest 请求对象
     * @return SyncInvoker<ListStoredValueCardsRequest, ListStoredValueCardsResponse>
     */
    public SyncInvoker<ListStoredValueCardsRequest, ListStoredValueCardsResponse> listStoredValueCardsInvoker(
        ListStoredValueCardsRequest request) {
        return new SyncInvoker<ListStoredValueCardsRequest, ListStoredValueCardsResponse>(request,
            BssMeta.listStoredValueCards, hcClient);
    }

    /**
     * 查询伙伴子客户消费记录
     *
     * 伙伴在伙伴销售平台可实时查询子客户的消费记录，了解客户的资源消耗情况。
     * 
     * 伙伴在伙伴中心查询客户消费明细请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435155.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   消费记录支持查询18个月内的记录。
     * &gt;-   如果是客户经理主管来查询，只支持按照单个客户经理查询，必须输入客户经理ID。
     * &gt;-   目前支持伙伴查询所有子客户（包含代售类和顾问销售类）的消费记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomerBillDetailRequest 请求对象
     * @return ListSubCustomerBillDetailResponse
     */
    public ListSubCustomerBillDetailResponse listSubCustomerBillDetail(ListSubCustomerBillDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomerBillDetail);
    }

    /**
     * 查询伙伴子客户消费记录
     *
     * 伙伴在伙伴销售平台可实时查询子客户的消费记录，了解客户的资源消耗情况。
     * 
     * 伙伴在伙伴中心查询客户消费明细请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435155.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   消费记录支持查询18个月内的记录。
     * &gt;-   如果是客户经理主管来查询，只支持按照单个客户经理查询，必须输入客户经理ID。
     * &gt;-   目前支持伙伴查询所有子客户（包含代售类和顾问销售类）的消费记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomerBillDetailRequest 请求对象
     * @return SyncInvoker<ListSubCustomerBillDetailRequest, ListSubCustomerBillDetailResponse>
     */
    public SyncInvoker<ListSubCustomerBillDetailRequest, ListSubCustomerBillDetailResponse> listSubCustomerBillDetailInvoker(
        ListSubCustomerBillDetailRequest request) {
        return new SyncInvoker<ListSubCustomerBillDetailRequest, ListSubCustomerBillDetailResponse>(request,
            BssMeta.listSubCustomerBillDetail, hcClient);
    }

    /**
     * 查询优惠券列表
     *
     * 伙伴可以查询自身的优惠券信息。
     * 
     * 伙伴登录伙伴中心查询已发放代金券列表请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435101.html)，查看已下发代金券的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return ListSubCustomerCouponsResponse
     */
    public ListSubCustomerCouponsResponse listSubCustomerCoupons(ListSubCustomerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomerCoupons);
    }

    /**
     * 查询优惠券列表
     *
     * 伙伴可以查询自身的优惠券信息。
     * 
     * 伙伴登录伙伴中心查询已发放代金券列表请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435101.html)，查看已下发代金券的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return SyncInvoker<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse>
     */
    public SyncInvoker<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> listSubCustomerCouponsInvoker(
        ListSubCustomerCouponsRequest request) {
        return new SyncInvoker<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse>(request,
            BssMeta.listSubCustomerCoupons, hcClient);
    }

    /**
     * 查询客户新客标签
     *
     * 伙伴通过该接口可以查询客户的新客标签。
     * 
     * &gt;![](public_sys-resources/icon-caution.gif) **注意：** 
     * &gt;-   新客标签失效后，new\\_customer\\_tag会变成N，且有效期过期。
     * &gt;-   客户如果没有实名认证，则新客标签为空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomerNewTagRequest 请求对象
     * @return ListSubCustomerNewTagResponse
     */
    public ListSubCustomerNewTagResponse listSubCustomerNewTag(ListSubCustomerNewTagRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomerNewTag);
    }

    /**
     * 查询客户新客标签
     *
     * 伙伴通过该接口可以查询客户的新客标签。
     * 
     * &gt;![](public_sys-resources/icon-caution.gif) **注意：** 
     * &gt;-   新客标签失效后，new\\_customer\\_tag会变成N，且有效期过期。
     * &gt;-   客户如果没有实名认证，则新客标签为空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomerNewTagRequest 请求对象
     * @return SyncInvoker<ListSubCustomerNewTagRequest, ListSubCustomerNewTagResponse>
     */
    public SyncInvoker<ListSubCustomerNewTagRequest, ListSubCustomerNewTagResponse> listSubCustomerNewTagInvoker(
        ListSubCustomerNewTagRequest request) {
        return new SyncInvoker<ListSubCustomerNewTagRequest, ListSubCustomerNewTagResponse>(request,
            BssMeta.listSubCustomerNewTag, hcClient);
    }

    /**
     * 查询客户列表
     *
     * 伙伴可以查询合作伙伴的客户信息列表。
     * 
     * 伙伴登录合作伙伴中心查询客户信息列表请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435115.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomersRequest 请求对象
     * @return ListSubCustomersResponse
     */
    public ListSubCustomersResponse listSubCustomers(ListSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomers);
    }

    /**
     * 查询客户列表
     *
     * 伙伴可以查询合作伙伴的客户信息列表。
     * 
     * 伙伴登录合作伙伴中心查询客户信息列表请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435115.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomersRequest 请求对象
     * @return SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse>
     */
    public SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomersInvoker(
        ListSubCustomersRequest request) {
        return new SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse>(request, BssMeta.listSubCustomers,
            hcClient);
    }

    /**
     * 查询客户月度消费账单
     *
     * 合作伙伴可查询客户的消费汇总账单，消费按月汇总。
     * 
     * 伙伴在伙伴中心查询客户月度消费账单请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435154.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;消费汇总数据仅包含前一天24点前的数据。每天刷新一次，更新前一天的数据。
     * &gt;该接口用于合作伙伴查询其代售类客户在华为的消费情况，如果输入某个客户ID，则是查询单个客户的，否则是查询该伙伴下所有使用伙伴拨款消费的客户的消费记录（包括退订记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubcustomerMonthlyBillsRequest 请求对象
     * @return ListSubcustomerMonthlyBillsResponse
     */
    public ListSubcustomerMonthlyBillsResponse listSubcustomerMonthlyBills(ListSubcustomerMonthlyBillsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubcustomerMonthlyBills);
    }

    /**
     * 查询客户月度消费账单
     *
     * 合作伙伴可查询客户的消费汇总账单，消费按月汇总。
     * 
     * 伙伴在伙伴中心查询客户月度消费账单请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435154.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;消费汇总数据仅包含前一天24点前的数据。每天刷新一次，更新前一天的数据。
     * &gt;该接口用于合作伙伴查询其代售类客户在华为的消费情况，如果输入某个客户ID，则是查询单个客户的，否则是查询该伙伴下所有使用伙伴拨款消费的客户的消费记录（包括退订记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubcustomerMonthlyBillsRequest 请求对象
     * @return SyncInvoker<ListSubcustomerMonthlyBillsRequest, ListSubcustomerMonthlyBillsResponse>
     */
    public SyncInvoker<ListSubcustomerMonthlyBillsRequest, ListSubcustomerMonthlyBillsResponse> listSubcustomerMonthlyBillsInvoker(
        ListSubcustomerMonthlyBillsRequest request) {
        return new SyncInvoker<ListSubcustomerMonthlyBillsRequest, ListSubcustomerMonthlyBillsResponse>(request,
            BssMeta.listSubcustomerMonthlyBills, hcClient);
    }

    /**
     * 查询使用量类型列表
     *
     * 伙伴在伙伴销售平台查询资源的使用量类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsageTypesRequest 请求对象
     * @return ListUsageTypesResponse
     */
    public ListUsageTypesResponse listUsageTypes(ListUsageTypesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listUsageTypes);
    }

    /**
     * 查询使用量类型列表
     *
     * 伙伴在伙伴销售平台查询资源的使用量类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsageTypesRequest 请求对象
     * @return SyncInvoker<ListUsageTypesRequest, ListUsageTypesResponse>
     */
    public SyncInvoker<ListUsageTypesRequest, ListUsageTypesResponse> listUsageTypesInvoker(
        ListUsageTypesRequest request) {
        return new SyncInvoker<ListUsageTypesRequest, ListUsageTypesResponse>(request, BssMeta.listUsageTypes,
            hcClient);
    }

    /**
     * 支付包年/包月产品订单
     *
     * 客户可以对待支付状态的包年/包月产品订单进行支付。
     * 
     * 客户登录费用中心支付包年包月产品的待支付订单请单击[这里](https://support.huaweicloud.com/usermanual-billing/zh-cn_topic_0031512547.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   API支持月度结算和余额支付两种支付方式，月度结算优先。
     * &gt;-   余额支付包括现金账户和信用账户两种支付方式，如果两个账户都有余额，则优先现金账户支付。
     * &gt;-   同时使用订单折扣和优惠券的互斥规则如下：
     * &gt;    -   如果优惠券的限制属性上存在simultaneousUseWithEmpowerDiscount字段，并且值为0，则折扣和优惠券不能同时使用。
     * &gt;    -   如果优惠券的限制属性上存在minConsumeDiscount字段，当折扣ID包含的所有订单项上的折扣率discount\\_ratio都小于minConsumeDiscount字段时，则折扣ID和优惠券不能同时使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PayOrdersRequest 请求对象
     * @return PayOrdersResponse
     */
    public PayOrdersResponse payOrders(PayOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.payOrders);
    }

    /**
     * 支付包年/包月产品订单
     *
     * 客户可以对待支付状态的包年/包月产品订单进行支付。
     * 
     * 客户登录费用中心支付包年包月产品的待支付订单请单击[这里](https://support.huaweicloud.com/usermanual-billing/zh-cn_topic_0031512547.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   API支持月度结算和余额支付两种支付方式，月度结算优先。
     * &gt;-   余额支付包括现金账户和信用账户两种支付方式，如果两个账户都有余额，则优先现金账户支付。
     * &gt;-   同时使用订单折扣和优惠券的互斥规则如下：
     * &gt;    -   如果优惠券的限制属性上存在simultaneousUseWithEmpowerDiscount字段，并且值为0，则折扣和优惠券不能同时使用。
     * &gt;    -   如果优惠券的限制属性上存在minConsumeDiscount字段，当折扣ID包含的所有订单项上的折扣率discount\\_ratio都小于minConsumeDiscount字段时，则折扣ID和优惠券不能同时使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PayOrdersRequest 请求对象
     * @return SyncInvoker<PayOrdersRequest, PayOrdersResponse>
     */
    public SyncInvoker<PayOrdersRequest, PayOrdersResponse> payOrdersInvoker(PayOrdersRequest request) {
        return new SyncInvoker<PayOrdersRequest, PayOrdersResponse>(request, BssMeta.payOrders, hcClient);
    }

    /**
     * 回收云经销商的代金券额度
     *
     * 华为云总经销商（一级经销商）可以回收已发放给云经销商（二级经销商）的代金券额度。
     * 
     * 一级经销商在伙伴中心回收已发放给二级经销商的代金券额度请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120206.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimCouponQuotasRequest 请求对象
     * @return ReclaimCouponQuotasResponse
     */
    public ReclaimCouponQuotasResponse reclaimCouponQuotas(ReclaimCouponQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimCouponQuotas);
    }

    /**
     * 回收云经销商的代金券额度
     *
     * 华为云总经销商（一级经销商）可以回收已发放给云经销商（二级经销商）的代金券额度。
     * 
     * 一级经销商在伙伴中心回收已发放给二级经销商的代金券额度请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120206.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimCouponQuotasRequest 请求对象
     * @return SyncInvoker<ReclaimCouponQuotasRequest, ReclaimCouponQuotasResponse>
     */
    public SyncInvoker<ReclaimCouponQuotasRequest, ReclaimCouponQuotasResponse> reclaimCouponQuotasInvoker(
        ReclaimCouponQuotasRequest request) {
        return new SyncInvoker<ReclaimCouponQuotasRequest, ReclaimCouponQuotasResponse>(request,
            BssMeta.reclaimCouponQuotas, hcClient);
    }

    /**
     * 企业主账号从企业子账号回收优惠券
     *
     * 企业主账号在自建平台回收给企业子账号的拨款优惠券。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   仅支持华为发放的测试类、商务类、活动类代金券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimEnterpriseMultiAccountCouponRequest 请求对象
     * @return ReclaimEnterpriseMultiAccountCouponResponse
     */
    public ReclaimEnterpriseMultiAccountCouponResponse reclaimEnterpriseMultiAccountCoupon(
        ReclaimEnterpriseMultiAccountCouponRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimEnterpriseMultiAccountCoupon);
    }

    /**
     * 企业主账号从企业子账号回收优惠券
     *
     * 企业主账号在自建平台回收给企业子账号的拨款优惠券。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   仅支持华为发放的测试类、商务类、活动类代金券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimEnterpriseMultiAccountCouponRequest 请求对象
     * @return SyncInvoker<ReclaimEnterpriseMultiAccountCouponRequest, ReclaimEnterpriseMultiAccountCouponResponse>
     */
    public SyncInvoker<ReclaimEnterpriseMultiAccountCouponRequest, ReclaimEnterpriseMultiAccountCouponResponse> reclaimEnterpriseMultiAccountCouponInvoker(
        ReclaimEnterpriseMultiAccountCouponRequest request) {
        return new SyncInvoker<ReclaimEnterpriseMultiAccountCouponRequest, ReclaimEnterpriseMultiAccountCouponResponse>(
            request, BssMeta.reclaimEnterpriseMultiAccountCoupon, hcClient);
    }

    /**
     * 回收云经销商账户拨款
     *
     * 华为云总经销商（一级经销商）可以回收云经销商（二级经销商）的账户余额。
     * 
     * 一级经销商在伙伴中心回收二级经销商账户拨款请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120205.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimIndirectPartnerAccountRequest 请求对象
     * @return ReclaimIndirectPartnerAccountResponse
     */
    public ReclaimIndirectPartnerAccountResponse reclaimIndirectPartnerAccount(
        ReclaimIndirectPartnerAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimIndirectPartnerAccount);
    }

    /**
     * 回收云经销商账户拨款
     *
     * 华为云总经销商（一级经销商）可以回收云经销商（二级经销商）的账户余额。
     * 
     * 一级经销商在伙伴中心回收二级经销商账户拨款请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120205.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimIndirectPartnerAccountRequest 请求对象
     * @return SyncInvoker<ReclaimIndirectPartnerAccountRequest, ReclaimIndirectPartnerAccountResponse>
     */
    public SyncInvoker<ReclaimIndirectPartnerAccountRequest, ReclaimIndirectPartnerAccountResponse> reclaimIndirectPartnerAccountInvoker(
        ReclaimIndirectPartnerAccountRequest request) {
        return new SyncInvoker<ReclaimIndirectPartnerAccountRequest, ReclaimIndirectPartnerAccountResponse>(request,
            BssMeta.reclaimIndirectPartnerAccount, hcClient);
    }

    /**
     * 回收优惠券
     *
     * 对于合作伙伴已经下发给客户的优惠券，如遇发错或其他特殊情况，合作伙伴有回收的权利。优惠券回收后，客户将不再拥有该优惠券。
     * 
     * 伙伴登录合作伙伴中心回收为客户发放的代金券请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/espp_050503.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;只能回收代售类子客户的优惠券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimPartnerCouponsRequest 请求对象
     * @return ReclaimPartnerCouponsResponse
     */
    public ReclaimPartnerCouponsResponse reclaimPartnerCoupons(ReclaimPartnerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimPartnerCoupons);
    }

    /**
     * 回收优惠券
     *
     * 对于合作伙伴已经下发给客户的优惠券，如遇发错或其他特殊情况，合作伙伴有回收的权利。优惠券回收后，客户将不再拥有该优惠券。
     * 
     * 伙伴登录合作伙伴中心回收为客户发放的代金券请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/espp_050503.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;只能回收代售类子客户的优惠券。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimPartnerCouponsRequest 请求对象
     * @return SyncInvoker<ReclaimPartnerCouponsRequest, ReclaimPartnerCouponsResponse>
     */
    public SyncInvoker<ReclaimPartnerCouponsRequest, ReclaimPartnerCouponsResponse> reclaimPartnerCouponsInvoker(
        ReclaimPartnerCouponsRequest request) {
        return new SyncInvoker<ReclaimPartnerCouponsRequest, ReclaimPartnerCouponsResponse>(request,
            BssMeta.reclaimPartnerCoupons, hcClient);
    }

    /**
     * 企业主账号从企业子账号回收拨款
     *
     * 企业主账号在自建平台回收给企业子账号的拨款。
     * 
     * 如果回收的是企业子账户的信用账户，可以回收所有额度；如果回收金额大于子账户信用余额的时候，可能会导致子账户欠费，请慎重选择。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimSubEnterpriseAmountRequest 请求对象
     * @return ReclaimSubEnterpriseAmountResponse
     */
    public ReclaimSubEnterpriseAmountResponse reclaimSubEnterpriseAmount(ReclaimSubEnterpriseAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimSubEnterpriseAmount);
    }

    /**
     * 企业主账号从企业子账号回收拨款
     *
     * 企业主账号在自建平台回收给企业子账号的拨款。
     * 
     * 如果回收的是企业子账户的信用账户，可以回收所有额度；如果回收金额大于子账户信用余额的时候，可能会导致子账户欠费，请慎重选择。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimSubEnterpriseAmountRequest 请求对象
     * @return SyncInvoker<ReclaimSubEnterpriseAmountRequest, ReclaimSubEnterpriseAmountResponse>
     */
    public SyncInvoker<ReclaimSubEnterpriseAmountRequest, ReclaimSubEnterpriseAmountResponse> reclaimSubEnterpriseAmountInvoker(
        ReclaimSubEnterpriseAmountRequest request) {
        return new SyncInvoker<ReclaimSubEnterpriseAmountRequest, ReclaimSubEnterpriseAmountResponse>(request,
            BssMeta.reclaimSubEnterpriseAmount, hcClient);
    }

    /**
     * 回收客户账户余额
     *
     * 当客户不再使用华为云产品时，合作伙伴可以回收代售类客户账户余额。
     * 
     * 伙伴登录伙伴中心回收代售类客户账户余额请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435147.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimToPartnerAccountRequest 请求对象
     * @return ReclaimToPartnerAccountResponse
     */
    public ReclaimToPartnerAccountResponse reclaimToPartnerAccount(ReclaimToPartnerAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimToPartnerAccount);
    }

    /**
     * 回收客户账户余额
     *
     * 当客户不再使用华为云产品时，合作伙伴可以回收代售类客户账户余额。
     * 
     * 伙伴登录伙伴中心回收代售类客户账户余额请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435147.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReclaimToPartnerAccountRequest 请求对象
     * @return SyncInvoker<ReclaimToPartnerAccountRequest, ReclaimToPartnerAccountResponse>
     */
    public SyncInvoker<ReclaimToPartnerAccountRequest, ReclaimToPartnerAccountResponse> reclaimToPartnerAccountInvoker(
        ReclaimToPartnerAccountRequest request) {
        return new SyncInvoker<ReclaimToPartnerAccountRequest, ReclaimToPartnerAccountResponse>(request,
            BssMeta.reclaimToPartnerAccount, hcClient);
    }

    /**
     * 续订包年/包月资源
     *
     * 客户的包年/包月资源即将到期时，可进行包年/包月资源的续订。
     * 
     * 客户在费用中心执行续订操作请参见[这里](https://support.huaweicloud.com/usermanual-billing/renewals_topic_10000003.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   调用接口后，如果某个主资源有对应的从资源，系统会将主资源和从资源一起续订，主资源的从资源信息可以通过调用[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)接口获取。
     * &gt;-   注意：如ECS主机挂载新购的云硬盘，但此硬盘不是该ECS主资源的从资源，主从资源信息必须以调用[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)接口获取的信息为准。
     * &gt;-   本接口支持自动支付，支付时使用折扣或优惠券的说明，请参见[支付使用折扣或优惠券说明](https://support.huaweicloud.com/api-oce/appendix_00001.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenewalResourcesRequest 请求对象
     * @return RenewalResourcesResponse
     */
    public RenewalResourcesResponse renewalResources(RenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.renewalResources);
    }

    /**
     * 续订包年/包月资源
     *
     * 客户的包年/包月资源即将到期时，可进行包年/包月资源的续订。
     * 
     * 客户在费用中心执行续订操作请参见[这里](https://support.huaweicloud.com/usermanual-billing/renewals_topic_10000003.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   调用接口后，如果某个主资源有对应的从资源，系统会将主资源和从资源一起续订，主资源的从资源信息可以通过调用[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)接口获取。
     * &gt;-   注意：如ECS主机挂载新购的云硬盘，但此硬盘不是该ECS主资源的从资源，主从资源信息必须以调用[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)接口获取的信息为准。
     * &gt;-   本接口支持自动支付，支付时使用折扣或优惠券的说明，请参见[支付使用折扣或优惠券说明](https://support.huaweicloud.com/api-oce/appendix_00001.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenewalResourcesRequest 请求对象
     * @return SyncInvoker<RenewalResourcesRequest, RenewalResourcesResponse>
     */
    public SyncInvoker<RenewalResourcesRequest, RenewalResourcesResponse> renewalResourcesInvoker(
        RenewalResourcesRequest request) {
        return new SyncInvoker<RenewalResourcesRequest, RenewalResourcesResponse>(request, BssMeta.renewalResources,
            hcClient);
    }

    /**
     * 发送短信验证码
     *
     * 企业主账号在自建平台发送短信验证码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendSmsVerificationCodeRequest 请求对象
     * @return SendSmsVerificationCodeResponse
     */
    public SendSmsVerificationCodeResponse sendSmsVerificationCode(SendSmsVerificationCodeRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.sendSmsVerificationCode);
    }

    /**
     * 发送短信验证码
     *
     * 企业主账号在自建平台发送短信验证码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendSmsVerificationCodeRequest 请求对象
     * @return SyncInvoker<SendSmsVerificationCodeRequest, SendSmsVerificationCodeResponse>
     */
    public SyncInvoker<SendSmsVerificationCodeRequest, SendSmsVerificationCodeResponse> sendSmsVerificationCodeInvoker(
        SendSmsVerificationCodeRequest request) {
        return new SyncInvoker<SendSmsVerificationCodeRequest, SendSmsVerificationCodeResponse>(request,
            BssMeta.sendSmsVerificationCode, hcClient);
    }

    /**
     * 发送验证码
     *
     * 客户注册时，如果填写了手机号，可以向对应的手机发送注册验证码，校验信息的正确性。使用个人银行卡方式进行实名认证时，通过该接口向指定的手机发送验证码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return SendVerificationMessageCodeResponse
     */
    public SendVerificationMessageCodeResponse sendVerificationMessageCode(SendVerificationMessageCodeRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.sendVerificationMessageCode);
    }

    /**
     * 发送验证码
     *
     * 客户注册时，如果填写了手机号，可以向对应的手机发送注册验证码，校验信息的正确性。使用个人银行卡方式进行实名认证时，通过该接口向指定的手机发送验证码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return SyncInvoker<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse>
     */
    public SyncInvoker<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> sendVerificationMessageCodeInvoker(
        SendVerificationMessageCodeRequest request) {
        return new SyncInvoker<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse>(request,
            BssMeta.sendVerificationMessageCode, hcClient);
    }

    /**
     * 查询账户余额
     *
     * 客户可以查询自身的账户余额。
     * 
     * 客户可以登录费用中心进入“[总览](https://account.huaweicloud.com/usercenter/#/userindex/allview)”页面，在“可用额度”区域可以查询自身的账户余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerAccountBalancesRequest 请求对象
     * @return ShowCustomerAccountBalancesResponse
     */
    public ShowCustomerAccountBalancesResponse showCustomerAccountBalances(ShowCustomerAccountBalancesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showCustomerAccountBalances);
    }

    /**
     * 查询账户余额
     *
     * 客户可以查询自身的账户余额。
     * 
     * 客户可以登录费用中心进入“[总览](https://account.huaweicloud.com/usercenter/#/userindex/allview)”页面，在“可用额度”区域可以查询自身的账户余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerAccountBalancesRequest 请求对象
     * @return SyncInvoker<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse>
     */
    public SyncInvoker<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> showCustomerAccountBalancesInvoker(
        ShowCustomerAccountBalancesRequest request) {
        return new SyncInvoker<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse>(request,
            BssMeta.showCustomerAccountBalances, hcClient);
    }

    /**
     * 查询汇总账单
     *
     * 客户在自建平台查询自身的消费汇总账单，此账单按月汇总消费数据。
     * 
     * 客户登录费用中心查询自身的消费汇总账单请参见[这里](https://support.huaweicloud.com/usermanual-billing/bills-topic_80000001.html#bills-topic_80000001__zh-cn_topic_0000001162496407_s620ce713baf04899a416d781d1817931)的“**查看汇总**”。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;当前支持查看2019/01月份至今的费用账单。企业主账号展示的费用账单，包含关联的统一还款企业子账号的消费数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerMonthlySumRequest 请求对象
     * @return ShowCustomerMonthlySumResponse
     */
    public ShowCustomerMonthlySumResponse showCustomerMonthlySum(ShowCustomerMonthlySumRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showCustomerMonthlySum);
    }

    /**
     * 查询汇总账单
     *
     * 客户在自建平台查询自身的消费汇总账单，此账单按月汇总消费数据。
     * 
     * 客户登录费用中心查询自身的消费汇总账单请参见[这里](https://support.huaweicloud.com/usermanual-billing/bills-topic_80000001.html#bills-topic_80000001__zh-cn_topic_0000001162496407_s620ce713baf04899a416d781d1817931)的“**查看汇总**”。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;当前支持查看2019/01月份至今的费用账单。企业主账号展示的费用账单，包含关联的统一还款企业子账号的消费数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerMonthlySumRequest 请求对象
     * @return SyncInvoker<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse>
     */
    public SyncInvoker<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse> showCustomerMonthlySumInvoker(
        ShowCustomerMonthlySumRequest request) {
        return new SyncInvoker<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse>(request,
            BssMeta.showCustomerMonthlySum, hcClient);
    }

    /**
     * 查询订单详情
     *
     * 客户可以在伙伴销售平台查看订单详情。
     * 
     * 客户登录费用中心查看订单详情请单击[这里](https://support.huaweicloud.com/usermanual-billing/order_topic_9000001.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;如果想查询某条订单下的资源信息，请调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)”接口在请求参数输入订单号进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return ShowCustomerOrderDetailsResponse
     */
    public ShowCustomerOrderDetailsResponse showCustomerOrderDetails(ShowCustomerOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showCustomerOrderDetails);
    }

    /**
     * 查询订单详情
     *
     * 客户可以在伙伴销售平台查看订单详情。
     * 
     * 客户登录费用中心查看订单详情请单击[这里](https://support.huaweicloud.com/usermanual-billing/order_topic_9000001.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;如果想查询某条订单下的资源信息，请调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)”接口在请求参数输入订单号进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return SyncInvoker<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse>
     */
    public SyncInvoker<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsInvoker(
        ShowCustomerOrderDetailsRequest request) {
        return new SyncInvoker<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse>(request,
            BssMeta.showCustomerOrderDetails, hcClient);
    }

    /**
     * 查询企业主账号可拨款余额
     *
     * 企业主账号在自建平台查询自己的可拨款余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMultiAccountTransferAmountRequest 请求对象
     * @return ShowMultiAccountTransferAmountResponse
     */
    public ShowMultiAccountTransferAmountResponse showMultiAccountTransferAmount(
        ShowMultiAccountTransferAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showMultiAccountTransferAmount);
    }

    /**
     * 查询企业主账号可拨款余额
     *
     * 企业主账号在自建平台查询自己的可拨款余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMultiAccountTransferAmountRequest 请求对象
     * @return SyncInvoker<ShowMultiAccountTransferAmountRequest, ShowMultiAccountTransferAmountResponse>
     */
    public SyncInvoker<ShowMultiAccountTransferAmountRequest, ShowMultiAccountTransferAmountResponse> showMultiAccountTransferAmountInvoker(
        ShowMultiAccountTransferAmountRequest request) {
        return new SyncInvoker<ShowMultiAccountTransferAmountRequest, ShowMultiAccountTransferAmountResponse>(request,
            BssMeta.showMultiAccountTransferAmount, hcClient);
    }

    /**
     * 查询实名认证审核结果
     *
     * 如果实名认证申请或实名认证变更申请的响应中，显示需要人工审核，使用该接口查询审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return ShowRealnameAuthenticationReviewResultResponse
     */
    public ShowRealnameAuthenticationReviewResultResponse showRealnameAuthenticationReviewResult(
        ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showRealnameAuthenticationReviewResult);
    }

    /**
     * 查询实名认证审核结果
     *
     * 如果实名认证申请或实名认证变更申请的响应中，显示需要人工审核，使用该接口查询审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return SyncInvoker<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse>
     */
    public SyncInvoker<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultInvoker(
        ShowRealnameAuthenticationReviewResultRequest request) {
        return new SyncInvoker<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse>(
            request, BssMeta.showRealnameAuthenticationReviewResult, hcClient);
    }

    /**
     * 查询退款订单的金额详情
     *
     * 客户在伙伴销售平台查询某次退订订单或者降配订单的退款金额来自哪些资源和对应订单。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   可以在调用完“[退订包年/包月资源](https://support.huaweicloud.com/api-oce/api_order_00019.html)”接口生成退订订单ID后，调用该接口查询退订订单对应的金额所属资源和订单。例如，调用“[退订包年/包月资源](https://support.huaweicloud.com/api-oce/api_order_00019.html)”接口退订资源及其已续费周期后，您可以调用本小节的接口查询到退订金额归属的原开通订单ID和原续费订单ID。
     * &gt;-   2018年5月份之后退订的订单才能查询到归属的原订单ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return ShowRefundOrderDetailsResponse
     */
    public ShowRefundOrderDetailsResponse showRefundOrderDetails(ShowRefundOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showRefundOrderDetails);
    }

    /**
     * 查询退款订单的金额详情
     *
     * 客户在伙伴销售平台查询某次退订订单或者降配订单的退款金额来自哪些资源和对应订单。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   可以在调用完“[退订包年/包月资源](https://support.huaweicloud.com/api-oce/api_order_00019.html)”接口生成退订订单ID后，调用该接口查询退订订单对应的金额所属资源和订单。例如，调用“[退订包年/包月资源](https://support.huaweicloud.com/api-oce/api_order_00019.html)”接口退订资源及其已续费周期后，您可以调用本小节的接口查询到退订金额归属的原开通订单ID和原续费订单ID。
     * &gt;-   2018年5月份之后退订的订单才能查询到归属的原订单ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return SyncInvoker<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse>
     */
    public SyncInvoker<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> showRefundOrderDetailsInvoker(
        ShowRefundOrderDetailsRequest request) {
        return new SyncInvoker<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse>(request,
            BssMeta.showRefundOrderDetails, hcClient);
    }

    /**
     * 向云经销商发放代金券额度
     *
     * 华为云总经销商（一级经销商）可以向云经销商（二级经销商）发放代金券额度。
     * 
     * 一级经销商在伙伴中心向二级经销商发放代金券额度请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120206.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCouponQuotasRequest 请求对象
     * @return UpdateCouponQuotasResponse
     */
    public UpdateCouponQuotasResponse updateCouponQuotas(UpdateCouponQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateCouponQuotas);
    }

    /**
     * 向云经销商发放代金券额度
     *
     * 华为云总经销商（一级经销商）可以向云经销商（二级经销商）发放代金券额度。
     * 
     * 一级经销商在伙伴中心向二级经销商发放代金券额度请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120206.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCouponQuotasRequest 请求对象
     * @return SyncInvoker<UpdateCouponQuotasRequest, UpdateCouponQuotasResponse>
     */
    public SyncInvoker<UpdateCouponQuotasRequest, UpdateCouponQuotasResponse> updateCouponQuotasInvoker(
        UpdateCouponQuotasRequest request) {
        return new SyncInvoker<UpdateCouponQuotasRequest, UpdateCouponQuotasResponse>(request,
            BssMeta.updateCouponQuotas, hcClient);
    }

    /**
     * 向客户账户拨款
     *
     * 合作伙伴可以为代售类客户账户拨款。
     * 
     * 伙伴登录伙伴中心为代售类客户账户拨款请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435147.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomerAccountAmountRequest 请求对象
     * @return UpdateCustomerAccountAmountResponse
     */
    public UpdateCustomerAccountAmountResponse updateCustomerAccountAmount(UpdateCustomerAccountAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateCustomerAccountAmount);
    }

    /**
     * 向客户账户拨款
     *
     * 合作伙伴可以为代售类客户账户拨款。
     * 
     * 伙伴登录伙伴中心为代售类客户账户拨款请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435147.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomerAccountAmountRequest 请求对象
     * @return SyncInvoker<UpdateCustomerAccountAmountRequest, UpdateCustomerAccountAmountResponse>
     */
    public SyncInvoker<UpdateCustomerAccountAmountRequest, UpdateCustomerAccountAmountResponse> updateCustomerAccountAmountInvoker(
        UpdateCustomerAccountAmountRequest request) {
        return new SyncInvoker<UpdateCustomerAccountAmountRequest, UpdateCustomerAccountAmountResponse>(request,
            BssMeta.updateCustomerAccountAmount, hcClient);
    }

    /**
     * 向云经销商账户拨款
     *
     * 华为云总经销商（一级经销商）可以向云经销商（二级经销商）账户拨款。
     * 
     * 一级经销商在伙伴中心向二级经销商拨款请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120205.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIndirectPartnerAccountRequest 请求对象
     * @return UpdateIndirectPartnerAccountResponse
     */
    public UpdateIndirectPartnerAccountResponse updateIndirectPartnerAccount(
        UpdateIndirectPartnerAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateIndirectPartnerAccount);
    }

    /**
     * 向云经销商账户拨款
     *
     * 华为云总经销商（一级经销商）可以向云经销商（二级经销商）账户拨款。
     * 
     * 一级经销商在伙伴中心向二级经销商拨款请参见[这里](https://support.huaweicloud.com/usermanual-bpconsole/dp_120205.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIndirectPartnerAccountRequest 请求对象
     * @return SyncInvoker<UpdateIndirectPartnerAccountRequest, UpdateIndirectPartnerAccountResponse>
     */
    public SyncInvoker<UpdateIndirectPartnerAccountRequest, UpdateIndirectPartnerAccountResponse> updateIndirectPartnerAccountInvoker(
        UpdateIndirectPartnerAccountRequest request) {
        return new SyncInvoker<UpdateIndirectPartnerAccountRequest, UpdateIndirectPartnerAccountResponse>(request,
            BssMeta.updateIndirectPartnerAccount, hcClient);
    }

    /**
     * 设置或取消包年/包月资源到期转按需
     *
     * 客户可以设置包年/包月资源到期后转为按需资源计费。包年/包月计费模式到期后，按需的计费模式即生效。
     * 
     * 客户在费用中心设置包年包月资源到期转按需请参见[这里](https://support.huaweicloud.com/usermanual-billing/renewals_topic_50000003.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   客户需要成功支付包年/包月资源订单后，才能设置资源的到期转按需。
     * &gt;-   目前解决方案组合产品、按需套餐包不支持到期转按需。
     * &gt;-   在调用本接口前，您可以调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)”接口获取资源ID、资源过期时间以及资源过期后的扣费策略等信息。
     * &gt;-   设置包年/包月资源到期转按需后，包年/包月资源到期后将自动变成按需计费。
     * &gt;-   取消包年/包月资源到期转按需的前提是已经调用“[设置或取消包年/包月资源到期转按需](https://support.huaweicloud.com/api-oce/api_order_00024.html)”接口设置包年/包月资源的到期转按需或在调用“[续订包年/包月资源](https://support.huaweicloud.com/api-oce/api_order_00018.html)”接口时设置到期策略为到期转按需。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePeriodToOnDemandRequest 请求对象
     * @return UpdatePeriodToOnDemandResponse
     */
    public UpdatePeriodToOnDemandResponse updatePeriodToOnDemand(UpdatePeriodToOnDemandRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updatePeriodToOnDemand);
    }

    /**
     * 设置或取消包年/包月资源到期转按需
     *
     * 客户可以设置包年/包月资源到期后转为按需资源计费。包年/包月计费模式到期后，按需的计费模式即生效。
     * 
     * 客户在费用中心设置包年包月资源到期转按需请参见[这里](https://support.huaweicloud.com/usermanual-billing/renewals_topic_50000003.html)。
     * 
     * &gt;![](public_sys-resources/icon-note.gif) **说明：** 
     * &gt;-   客户需要成功支付包年/包月资源订单后，才能设置资源的到期转按需。
     * &gt;-   目前解决方案组合产品、按需套餐包不支持到期转按需。
     * &gt;-   在调用本接口前，您可以调用“[查询客户包年/包月资源列表](https://support.huaweicloud.com/api-oce/api_order_00021.html)”接口获取资源ID、资源过期时间以及资源过期后的扣费策略等信息。
     * &gt;-   设置包年/包月资源到期转按需后，包年/包月资源到期后将自动变成按需计费。
     * &gt;-   取消包年/包月资源到期转按需的前提是已经调用“[设置或取消包年/包月资源到期转按需](https://support.huaweicloud.com/api-oce/api_order_00024.html)”接口设置包年/包月资源的到期转按需或在调用“[续订包年/包月资源](https://support.huaweicloud.com/api-oce/api_order_00018.html)”接口时设置到期策略为到期转按需。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePeriodToOnDemandRequest 请求对象
     * @return SyncInvoker<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse>
     */
    public SyncInvoker<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> updatePeriodToOnDemandInvoker(
        UpdatePeriodToOnDemandRequest request) {
        return new SyncInvoker<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse>(request,
            BssMeta.updatePeriodToOnDemand, hcClient);
    }

    /**
     * 修改邮寄地址
     *
     * 伙伴可以修改自己的邮寄地址信息。
     * 
     * 伙伴登录伙伴中心修改邮寄地址请参见[向华为云索取发票](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435143.html)，进入索取发票页面，选择修改邮寄地址，即可修改邮件地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostalRequest 请求对象
     * @return UpdatePostalResponse
     */
    public UpdatePostalResponse updatePostal(UpdatePostalRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updatePostal);
    }

    /**
     * 修改邮寄地址
     *
     * 伙伴可以修改自己的邮寄地址信息。
     * 
     * 伙伴登录伙伴中心修改邮寄地址请参见[向华为云索取发票](https://support.huaweicloud.com/usermanual-bpconsole/zh-cn_topic_0072435143.html)，进入索取发票页面，选择修改邮寄地址，即可修改邮件地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePostalRequest 请求对象
     * @return SyncInvoker<UpdatePostalRequest, UpdatePostalResponse>
     */
    public SyncInvoker<UpdatePostalRequest, UpdatePostalResponse> updatePostalInvoker(UpdatePostalRequest request) {
        return new SyncInvoker<UpdatePostalRequest, UpdatePostalResponse>(request, BssMeta.updatePostal, hcClient);
    }

    /**
     * 企业主账号向企业子账号拨款
     *
     * 企业主账号在自建平台向企业子账号拨款。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubEnterpriseAmountRequest 请求对象
     * @return UpdateSubEnterpriseAmountResponse
     */
    public UpdateSubEnterpriseAmountResponse updateSubEnterpriseAmount(UpdateSubEnterpriseAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateSubEnterpriseAmount);
    }

    /**
     * 企业主账号向企业子账号拨款
     *
     * 企业主账号在自建平台向企业子账号拨款。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubEnterpriseAmountRequest 请求对象
     * @return SyncInvoker<UpdateSubEnterpriseAmountRequest, UpdateSubEnterpriseAmountResponse>
     */
    public SyncInvoker<UpdateSubEnterpriseAmountRequest, UpdateSubEnterpriseAmountResponse> updateSubEnterpriseAmountInvoker(
        UpdateSubEnterpriseAmountRequest request) {
        return new SyncInvoker<UpdateSubEnterpriseAmountRequest, UpdateSubEnterpriseAmountResponse>(request,
            BssMeta.updateSubEnterpriseAmount, hcClient);
    }

}

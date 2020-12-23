package com.huaweicloud.sdk.bssintl.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.bssintl.v2.model.*;

public class BssintlAsyncClient {
    protected HcClient hcClient;

    public BssintlAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BssintlAsyncClient> newBuilder() {
        return new ClientBuilder<>(BssintlAsyncClient::new, "GlobalCredentials");
    }


    /**
     * 设置包年包月资源自动续费
     * 功能描述：设置包周期资源自动续费
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return CompletableFuture<AutoRenewalResourcesResponse>
     */
    public CompletableFuture<AutoRenewalResourcesResponse> autoRenewalResourcesAsync(AutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.autoRenewalResources);
    }

    /**
     * 取消包年包月资源自动续费
     * 功能描述：取消包年/包月资源自动续费
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return CompletableFuture<CancelAutoRenewalResourcesResponse>
     */
    public CompletableFuture<CancelAutoRenewalResourcesResponse> cancelAutoRenewalResourcesAsync(CancelAutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.cancelAutoRenewalResources);
    }

    /**
     * 取消待支付订单
     * 功能描述：客户可以对待支付的订单进行取消操作
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return CompletableFuture<CancelCustomerOrderResponse>
     */
    public CompletableFuture<CancelCustomerOrderResponse> cancelCustomerOrderAsync(CancelCustomerOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.cancelCustomerOrder);
    }

    /**
     * 退订包年包月资源
     * 功能描述：客户购买包年包月资源后，支持客户退订包年包月实例。退订资源实例包括资源续费部分和当前正在使用的部分，退订后资源将无法使用
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return CompletableFuture<CancelResourcesSubscriptionResponse>
     */
    public CompletableFuture<CancelResourcesSubscriptionResponse> cancelResourcesSubscriptionAsync(CancelResourcesSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.cancelResourcesSubscription);
    }

    /**
     * 申请实名认证变更
     * 功能描述：客户可以进行实名认证变更申请。
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse>
     */
    public CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthenticationAsync(ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.changeEnterpriseRealnameAuthentication);
    }

    /**
     * 校验客户注册信息
     * 功能描述：客户注册时可检查客户的登录名称、手机号或者邮箱是否可以用于注册。
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return CompletableFuture<CheckUserIdentityResponse>
     */
    public CompletableFuture<CheckUserIdentityResponse> checkUserIdentityAsync(CheckUserIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.checkUserIdentity);
    }

    /**
     * 申请企业实名认证
     * 功能描述：企业客户可以进行企业实名认证申请。
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse>
     */
    public CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationAsync(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.createEnterpriseRealnameAuthentication);
    }

    /**
     * 申请个人实名认证
     * 功能描述：个人客户可以进行个人实名认证申请。
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return CompletableFuture<CreatePersonalRealnameAuthResponse>
     */
    public CompletableFuture<CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthAsync(CreatePersonalRealnameAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.createPersonalRealnameAuth);
    }

    /**
     * 创建客户
     * 功能描述：在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。华为云伙伴能力中心（一级经销商）可以注册精英服务商伙伴（二级经销商）的子客户。注册完成后，子客户可以自动和精英服务商伙伴绑定。
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return CompletableFuture<CreateSubCustomerResponse>
     */
    public CompletableFuture<CreateSubCustomerResponse> createSubCustomerAsync(CreateSubCustomerRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.createSubCustomer);
    }

    /**
     * 冻结伙伴子客户
     * 功能描述：冻结伙伴子客户
     *
     * @param FreezeSubCustomersRequest 请求对象
     * @return CompletableFuture<FreezeSubCustomersResponse>
     */
    public CompletableFuture<FreezeSubCustomersResponse> freezeSubCustomersAsync(FreezeSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.freezeSubCustomers);
    }

    /**
     * 查询用量单位进制
     * 功能描述：查询用量单位进制
     *
     * @param ListConversionsRequest 请求对象
     * @return CompletableFuture<ListConversionsResponse>
     */
    public CompletableFuture<ListConversionsResponse> listConversionsAsync(ListConversionsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listConversions);
    }

    /**
     * 查询客户按需资源列表
     * 功能描述：客户在伙伴销售平台查询已开通的按需资源
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return CompletableFuture<ListCustomerOnDemandResourcesResponse>
     */
    public CompletableFuture<ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesAsync(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listCustomerOnDemandResources);
    }

    /**
     * 查询订单列表
     * 功能描述：客户购买包年包月资源后，可以查看待审核、处理中、已取消、已完成和待支付等状态的订单
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return CompletableFuture<ListCustomerOrdersResponse>
     */
    public CompletableFuture<ListCustomerOrdersResponse> listCustomerOrdersAsync(ListCustomerOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listCustomerOrders);
    }

    /**
     * 查询资源详单
     * 功能描述：客户在客户自建平台查询自己的资源详单，用于反映各类资源的消耗情况。资源详单数据有延迟，最大延迟24小时。
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return CompletableFuture<ListCustomerselfResourceRecordDetailsResponse>
     */
    public CompletableFuture<ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsAsync(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecordDetails);
    }

    /**
     * 查询资源消费记录
     * 功能描述：客户在客户自建平台查询每个资源的消费明细数据
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return CompletableFuture<ListCustomerselfResourceRecordsResponse>
     */
    public CompletableFuture<ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsAsync(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecords);
    }

    /**
     * 查询用量单位列表
     * 功能描述：查询用量单位列表
     *
     * @param ListMeasureUnitsRequest 请求对象
     * @return CompletableFuture<ListMeasureUnitsResponse>
     */
    public CompletableFuture<ListMeasureUnitsResponse> listMeasureUnitsAsync(ListMeasureUnitsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listMeasureUnits);
    }

    /**
     * 查询按需产品价格
     * 功能描述：按需资源询价
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return CompletableFuture<ListOnDemandResourceRatingsResponse>
     */
    public CompletableFuture<ListOnDemandResourceRatingsResponse> listOnDemandResourceRatingsAsync(ListOnDemandResourceRatingsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listOnDemandResourceRatings);
    }

    /**
     * 查询订单可用优惠券
     * 功能描述：客户在客户自建平台查看订单可用的优惠券列表
     *
     * @param ListOrderCouponsByOrderIdRequest 请求对象
     * @return CompletableFuture<ListOrderCouponsByOrderIdResponse>
     */
    public CompletableFuture<ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderIdAsync(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listOrderCouponsByOrderId);
    }

    /**
     * 查询客户包年包月资源列表
     * 功能描述：客户在客户自建平台查询某个或所有的包年包月资源
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return CompletableFuture<ListPayPerUseCustomerResourcesResponse>
     */
    public CompletableFuture<ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesAsync(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listPayPerUseCustomerResources);
    }

    /**
     * 查询伙伴月度消费账单
     * 功能描述：伙伴可以查询伙伴月度消费账单
     *
     * @param ListPostpaidBillSumRequest 请求对象
     * @return CompletableFuture<ListPostpaidBillSumResponse>
     */
    public CompletableFuture<ListPostpaidBillSumResponse> listPostpaidBillSumAsync(ListPostpaidBillSumRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listPostpaidBillSum);
    }

    /**
     * 包周期资源订购询价
     * 功能描述：包周期资源订购询价
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return CompletableFuture<ListRateOnPeriodDetailResponse>
     */
    public CompletableFuture<ListRateOnPeriodDetailResponse> listRateOnPeriodDetailAsync(ListRateOnPeriodDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listRateOnPeriodDetail);
    }

    /**
     * 查询资源类型列表
     * 功能描述：客户在客户自建平台查询资源类型的列表。
     *
     * @param ListResourceTypesRequest 请求对象
     * @return CompletableFuture<ListResourceTypesResponse>
     */
    public CompletableFuture<ListResourceTypesResponse> listResourceTypesAsync(ListResourceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listResourceTypes);
    }

    /**
     * 查询套餐内使用量
     * 功能描述：客户在客户自建平台查询套餐内的使用量
     *
     * @param ListResourceUsagesRequest 请求对象
     * @return CompletableFuture<ListResourceUsagesResponse>
     */
    public CompletableFuture<ListResourceUsagesResponse> listResourceUsagesAsync(ListResourceUsagesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listResourceUsages);
    }

    /**
     * 根据云服务类型查询资源列表
     * 功能描述：伙伴在伙伴销售平台根据云服务类型查询关联的资源类型编码和名称，用于查询按需产品的价格或包年/包月产品的价格。
     *
     * @param ListServiceResourcesRequest 请求对象
     * @return CompletableFuture<ListServiceResourcesResponse>
     */
    public CompletableFuture<ListServiceResourcesResponse> listServiceResourcesAsync(ListServiceResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listServiceResources);
    }

    /**
     * 查询云服务类型列表
     * 功能描述：伙伴在伙伴销售平台查询云服务类型的列表。
     *
     * @param ListServiceTypesRequest 请求对象
     * @return CompletableFuture<ListServiceTypesResponse>
     */
    public CompletableFuture<ListServiceTypesResponse> listServiceTypesAsync(ListServiceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listServiceTypes);
    }

    /**
     * 查询优惠券列表
     * 功能描述：伙伴可以查询自身的优惠券信息。
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return CompletableFuture<ListSubCustomerCouponsResponse>
     */
    public CompletableFuture<ListSubCustomerCouponsResponse> listSubCustomerCouponsAsync(ListSubCustomerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listSubCustomerCoupons);
    }

    /**
     * 查询客户列表
     * 功能描述：伙伴可以查询合作伙伴的客户信息列表。
     *
     * @param ListSubCustomersRequest 请求对象
     * @return CompletableFuture<ListSubCustomersResponse>
     */
    public CompletableFuture<ListSubCustomersResponse> listSubCustomersAsync(ListSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listSubCustomers);
    }

    /**
     * 查询使用量类型列表
     * 功能描述：伙伴在伙伴销售平台查询资源的使用量类型列表。
     *
     * @param ListUsageTypesRequest 请求对象
     * @return CompletableFuture<ListUsageTypesResponse>
     */
    public CompletableFuture<ListUsageTypesResponse> listUsageTypesAsync(ListUsageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listUsageTypes);
    }

    /**
     * 支付包年包月产品订单
     * 功能描述：客户可以对待支付状态的包年包月产品订单进行支付
     *
     * @param PayOrdersRequest 请求对象
     * @return CompletableFuture<PayOrdersResponse>
     */
    public CompletableFuture<PayOrdersResponse> payOrdersAsync(PayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.payOrders);
    }

    /**
     * 续订包年包月资源
     * 功能描述：客户的包年包月资源即将到期时，可进行包年包月资源的续订
     *
     * @param RenewalResourcesRequest 请求对象
     * @return CompletableFuture<RenewalResourcesResponse>
     */
    public CompletableFuture<RenewalResourcesResponse> renewalResourcesAsync(RenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.renewalResources);
    }

    /**
     * 发送验证码
     * 功能描述：客户注册时，如果填写了手机号，可以向对应的手机发送注册验证码，校验信息的正确性。使用个人银行卡方式进行实名认证时，通过该接口向指定的手机发送验证码。
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return CompletableFuture<SendVerificationMessageCodeResponse>
     */
    public CompletableFuture<SendVerificationMessageCodeResponse> sendVerificationMessageCodeAsync(SendVerificationMessageCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.sendVerificationMessageCode);
    }

    /**
     * 查询汇总账单
     * 功能描述：客户在客户自建平台查询自身的消费汇总账单，此账单按月汇总消费数据。消费汇总账单数据仅包含前一天24点前的数据
     *
     * @param ShowCustomerMonthlySumRequest 请求对象
     * @return CompletableFuture<ShowCustomerMonthlySumResponse>
     */
    public CompletableFuture<ShowCustomerMonthlySumResponse> showCustomerMonthlySumAsync(ShowCustomerMonthlySumRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showCustomerMonthlySum);
    }

    /**
     * 查询订单详情
     * 功能描述：客户可以查看订单详情
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return CompletableFuture<ShowCustomerOrderDetailsResponse>
     */
    public CompletableFuture<ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsAsync(ShowCustomerOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showCustomerOrderDetails);
    }

    /**
     * 查询实名认证审核结果
     * 功能描述：如果实名认证申请或实名认证变更申请的响应中，显示需要人工审核，使用该接口查询审核结果。
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return CompletableFuture<ShowRealnameAuthenticationReviewResultResponse>
     */
    public CompletableFuture<ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultAsync(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showRealnameAuthenticationReviewResult);
    }

    /**
     * 查询退款订单的金额详情
     * 功能描述：客户在伙伴销售平台查询某次退订订单或者降配订单的退款金额来自哪些资源和对应订单
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return CompletableFuture<ShowRefundOrderDetailsResponse>
     */
    public CompletableFuture<ShowRefundOrderDetailsResponse> showRefundOrderDetailsAsync(ShowRefundOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showRefundOrderDetails);
    }

    /**
     * 查询客户预算
     * 功能描述：查询客户预算
     *
     * @param ShowSubCustomerBudgetRequest 请求对象
     * @return CompletableFuture<ShowSubCustomerBudgetResponse>
     */
    public CompletableFuture<ShowSubCustomerBudgetResponse> showSubCustomerBudgetAsync(ShowSubCustomerBudgetRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showSubCustomerBudget);
    }

    /**
     * 解冻伙伴子客户
     * 功能描述：解冻伙伴子客户
     *
     * @param UnfreezeSubCustomersRequest 请求对象
     * @return CompletableFuture<UnfreezeSubCustomersResponse>
     */
    public CompletableFuture<UnfreezeSubCustomersResponse> unfreezeSubCustomersAsync(UnfreezeSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.unfreezeSubCustomers);
    }

    /**
     * 设置或者取消包年包月资源到期转按需
     * 功能描述：客户可以设置包年包月资源到期后转为按需资源计费。包年包月计费模式到期后，按需的计费模式即生效
     *
     * @param UpdatePeriodToOnDemandRequest 请求对象
     * @return CompletableFuture<UpdatePeriodToOnDemandResponse>
     */
    public CompletableFuture<UpdatePeriodToOnDemandResponse> updatePeriodToOnDemandAsync(UpdatePeriodToOnDemandRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.updatePeriodToOnDemand);
    }

    /**
     * 设置客户预算
     * 功能描述：设置客户预算
     *
     * @param UpdateSubCustomerBudgetRequest 请求对象
     * @return CompletableFuture<UpdateSubCustomerBudgetResponse>
     */
    public CompletableFuture<UpdateSubCustomerBudgetResponse> updateSubCustomerBudgetAsync(UpdateSubCustomerBudgetRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.updateSubCustomerBudget);
    }

}
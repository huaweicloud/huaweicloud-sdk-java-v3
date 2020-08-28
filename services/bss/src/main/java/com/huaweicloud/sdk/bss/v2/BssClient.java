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


    /**
     * 设置包年包月资源自动续费
     * 功能描述：设置包周期资源自动续费
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return AutoRenewalResourcesResponse
    */
    public AutoRenewalResourcesResponse autoRenewalResources(AutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.autoRenewalResources);
    }

    /**
     * 设置伙伴折扣
     * 功能描述：设置伙伴折扣
     *
     * @param BatchSetSubCustomerDiscountRequest 请求对象
     * @return BatchSetSubCustomerDiscountResponse
    */
    public BatchSetSubCustomerDiscountResponse batchSetSubCustomerDiscount(BatchSetSubCustomerDiscountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.batchSetSubCustomerDiscount);
    }

    /**
     * 取消包年包月资源自动续费
     * 功能描述：取消包年/包月资源自动续费
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return CancelAutoRenewalResourcesResponse
    */
    public CancelAutoRenewalResourcesResponse cancelAutoRenewalResources(CancelAutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.cancelAutoRenewalResources);
    }

    /**
     * 取消包周期订单
     * 功能描述：取消包周期订单
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return CancelCustomerOrderResponse
    */
    public CancelCustomerOrderResponse cancelCustomerOrder(CancelCustomerOrderRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.cancelCustomerOrder);
    }

    /**
     * 退订包周期资源
     * 功能描述：退订包周期资源
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return CancelResourcesSubscriptionResponse
    */
    public CancelResourcesSubscriptionResponse cancelResourcesSubscription(CancelResourcesSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.cancelResourcesSubscription);
    }

    /**
     * 实名认证变更申请
     * 功能描述：实名认证变更申请
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return ChangeEnterpriseRealnameAuthenticationResponse
    */
    public ChangeEnterpriseRealnameAuthenticationResponse changeEnterpriseRealnameAuthentication(ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.changeEnterpriseRealnameAuthentication);
    }

    /**
     * 校验客户的注册信息
     * 功能描述：校验客户的注册信息
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return CheckUserIdentityResponse
    */
    public CheckUserIdentityResponse checkUserIdentity(CheckUserIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.checkUserIdentity);
    }

    /**
     * 企业实名认证申请
     * 功能描述：企业实名认证申请V2
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CreateEnterpriseRealnameAuthenticationResponse
    */
    public CreateEnterpriseRealnameAuthenticationResponse createEnterpriseRealnameAuthentication(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createEnterpriseRealnameAuthentication);
    }

    /**
     * 伙伴给子客户发券
     * 功能描述：伙伴给子客户发券
     *
     * @param CreatePartnerCouponsRequest 请求对象
     * @return CreatePartnerCouponsResponse
    */
    public CreatePartnerCouponsResponse createPartnerCoupons(CreatePartnerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createPartnerCoupons);
    }

    /**
     * 个人实名认证申请
     * 功能描述：个人实名认证申请
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return CreatePersonalRealnameAuthResponse
    */
    public CreatePersonalRealnameAuthResponse createPersonalRealnameAuth(CreatePersonalRealnameAuthRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createPersonalRealnameAuth);
    }

    /**
     * 新增邮寄地址
     * 功能描述：新增邮寄地址
     *
     * @param CreatePostalRequest 请求对象
     * @return CreatePostalResponse
    */
    public CreatePostalResponse createPostal(CreatePostalRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createPostal);
    }

    /**
     * 创建客户（V2）
     * 功能描述：在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return CreateSubCustomerResponse
    */
    public CreateSubCustomerResponse createSubCustomer(CreateSubCustomerRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createSubCustomer);
    }

    /**
     * 创建企业子账号
     * 功能描述：创建企业子账号
     *
     * @param CreateSubEnterpriseAccountRequest 请求对象
     * @return CreateSubEnterpriseAccountResponse
    */
    public CreateSubEnterpriseAccountResponse createSubEnterpriseAccount(CreateSubEnterpriseAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.createSubEnterpriseAccount);
    }

    /**
     * 删除邮寄地址
     * 功能描述：删除邮寄地址
     *
     * @param DeletePostalRequest 请求对象
     * @return DeletePostalResponse
    */
    public DeletePostalResponse deletePostal(DeletePostalRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.deletePostal);
    }

    /**
     * 根据省份查询城市信息
     * 功能描述：根据省份查询城市列表
     *
     * @param ListCitiesRequest 请求对象
     * @return ListCitiesResponse
    */
    public ListCitiesResponse listCities(ListCitiesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCities);
    }

    /**
     * 根据城市查询区县信息
     * 功能描述：根据城市查询区县列表
     *
     * @param ListCountiesRequest 请求对象
     * @return ListCountiesResponse
    */
    public ListCountiesResponse listCounties(ListCountiesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCounties);
    }

    /**
     * 查询优惠券额度发放回收记录
     * 功能描述：查询优惠券额度发放回收记录
     *
     * @param ListCouponQuotasRecordsRequest 请求对象
     * @return ListCouponQuotasRecordsResponse
    */
    public ListCouponQuotasRecordsResponse listCouponQuotasRecords(ListCouponQuotasRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCouponQuotasRecords);
    }

    /**
     * 查询客户按需资源列表
     * 功能描述：查询客户按需资源列表
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return ListCustomerOnDemandResourcesResponse
    */
    public ListCustomerOnDemandResourcesResponse listCustomerOnDemandResources(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerOnDemandResources);
    }

    /**
     * 查询订单列表V2
     * 功能描述：查询订单列表
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return ListCustomerOrdersResponse
    */
    public ListCustomerOrdersResponse listCustomerOrders(ListCustomerOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerOrders);
    }

    /**
     * 批量查询伙伴子客户账户余额
     * 功能描述：批量查询伙伴子客户账户余额
     *
     * @param ListCustomersBalancesDetailRequest 请求对象
     * @return ListCustomersBalancesDetailResponse
    */
    public ListCustomersBalancesDetailResponse listCustomersBalancesDetail(ListCustomersBalancesDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomersBalancesDetail);
    }

    /**
     * 查询资源详单V2（客户）
     * 功能描述：客户在客户自建平台查询自己的资源详单，用于反映各类资源的消耗情况。资源详单数据有延迟，最大延迟24小时。
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return ListCustomerselfResourceRecordDetailsResponse
    */
    public ListCustomerselfResourceRecordDetailsResponse listCustomerselfResourceRecordDetails(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerselfResourceRecordDetails);
    }

    /**
     * 查询资源消费记录（客户）
     * 功能描述：查询资源消费记录（客户）
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return ListCustomerselfResourceRecordsResponse
    */
    public ListCustomerselfResourceRecordsResponse listCustomerselfResourceRecords(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listCustomerselfResourceRecords);
    }

    /**
     * 查询精英服务商列表
     * 功能描述：查询精英服务商列表
     *
     * @param ListIndirectPartnersRequest 请求对象
     * @return ListIndirectPartnersResponse
    */
    public ListIndirectPartnersResponse listIndirectPartners(ListIndirectPartnersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIndirectPartners);
    }

    /**
     * 查询已发放优惠券额度
     * 功能描述：一级经销商查询发给二级经销商的额度
     *
     * @param ListIssuedCouponQuotasRequest 请求对象
     * @return ListIssuedCouponQuotasResponse
    */
    public ListIssuedCouponQuotasResponse listIssuedCouponQuotas(ListIssuedCouponQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIssuedCouponQuotas);
    }

    /**
     * 查询已发放的优惠券列表
     * 功能描述：查询已发放的优惠券列表
     *
     * @param ListIssuedPartnerCouponsRequest 请求对象
     * @return ListIssuedPartnerCouponsResponse
    */
    public ListIssuedPartnerCouponsResponse listIssuedPartnerCoupons(ListIssuedPartnerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listIssuedPartnerCoupons);
    }

    /**
     * 查询按需产品价格
     * 功能描述：按需资源询价
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return ListOnDemandResourceRatingsResponse
    */
    public ListOnDemandResourceRatingsResponse listOnDemandResourceRatings(ListOnDemandResourceRatingsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listOnDemandResourceRatings);
    }

    /**
     * 查询订单可用优惠券
     * 功能描述：查询订单详情
     *
     * @param ListOrderCouponsByOrderIdRequest 请求对象
     * @return ListOrderCouponsByOrderIdResponse
    */
    public ListOrderCouponsByOrderIdResponse listOrderCouponsByOrderId(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listOrderCouponsByOrderId);
    }

    /**
     * 查询调账回收记录
     * 功能描述：查询调账回收记录
     *
     * @param ListPartnerAdjustRecordsRequest 请求对象
     * @return ListPartnerAdjustRecordsResponse
    */
    public ListPartnerAdjustRecordsResponse listPartnerAdjustRecords(ListPartnerAdjustRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerAdjustRecords);
    }

    /**
     * 查询账户余额
     * 功能描述：查询伙伴账户余额
     *
     * @param ListPartnerBalancesRequest 请求对象
     * @return ListPartnerBalancesResponse
    */
    public ListPartnerBalancesResponse listPartnerBalances(ListPartnerBalancesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerBalances);
    }

    /**
     * 查询优惠券的发放回收记录
     * 功能描述：查询优惠券的发放回收记录
     *
     * @param ListPartnerCouponsRecordRequest 请求对象
     * @return ListPartnerCouponsRecordResponse
    */
    public ListPartnerCouponsRecordResponse listPartnerCouponsRecord(ListPartnerCouponsRecordRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerCouponsRecord);
    }

    /**
     * 查询伙伴代付订单列表
     * 功能描述：查询伙伴代付订单列表
     *
     * @param ListPartnerPayOrdersRequest 请求对象
     * @return ListPartnerPayOrdersResponse
    */
    public ListPartnerPayOrdersResponse listPartnerPayOrders(ListPartnerPayOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPartnerPayOrders);
    }

    /**
     * 查询客户包年包月资源列表
     * 功能描述：查询客户包年/包月资源列表
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return ListPayPerUseCustomerResourcesResponse
    */
    public ListPayPerUseCustomerResourcesResponse listPayPerUseCustomerResources(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listPayPerUseCustomerResources);
    }

    /**
     * 根据国家查询省份信息
     * 功能描述：根据国家查询省份列表
     *
     * @param ListProvincesRequest 请求对象
     * @return ListProvincesResponse
    */
    public ListProvincesResponse listProvinces(ListProvincesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listProvinces);
    }

    /**
     * 查询优惠券额度列表
     * 功能描述：查询优惠券额度列表
     *
     * @param ListQuotaCouponsRequest 请求对象
     * @return ListQuotaCouponsResponse
    */
    public ListQuotaCouponsResponse listQuotaCoupons(ListQuotaCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listQuotaCoupons);
    }

    /**
     * 包周期资源订购询价
     * 功能描述：包周期资源订购询价
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return ListRateOnPeriodDetailResponse
    */
    public ListRateOnPeriodDetailResponse listRateOnPeriodDetail(ListRateOnPeriodDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listRateOnPeriodDetail);
    }

    /**
     * 查询套餐内使用量
     * 功能描述：查询套餐内使用量
     *
     * @param ListResourceUsagesRequest 请求对象
     * @return ListResourceUsagesResponse
    */
    public ListResourceUsagesResponse listResourceUsages(ListResourceUsagesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listResourceUsages);
    }

    /**
     * 库存查询
     * 功能描述：查询硬件库存
     *
     * @param ListSkuInventoriesRequest 请求对象
     * @return ListSkuInventoriesResponse
    */
    public ListSkuInventoriesResponse listSkuInventories(ListSkuInventoriesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSkuInventories);
    }

    /**
     * 查询优惠券列表
     * 功能描述：查询优惠券列表
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return ListSubCustomerCouponsResponse
    */
    public ListSubCustomerCouponsResponse listSubCustomerCoupons(ListSubCustomerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomerCoupons);
    }

    /**
     * 查询伙伴折扣
     * 功能描述：查询伙伴折扣
     *
     * @param ListSubCustomerDiscountsRequest 请求对象
     * @return ListSubCustomerDiscountsResponse
    */
    public ListSubCustomerDiscountsResponse listSubCustomerDiscounts(ListSubCustomerDiscountsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomerDiscounts);
    }

    /**
     * 查询客户消费记录
     * 功能描述：查询客户消费记录
     *
     * @param ListSubCustomerResFeeRecordsRequest 请求对象
     * @return ListSubCustomerResFeeRecordsResponse
    */
    public ListSubCustomerResFeeRecordsResponse listSubCustomerResFeeRecords(ListSubCustomerResFeeRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomerResFeeRecords);
    }

    /**
     * 查询客户列表
     * 功能描述：查询客户列表
     *
     * @param ListSubCustomersRequest 请求对象
     * @return ListSubCustomersResponse
    */
    public ListSubCustomersResponse listSubCustomers(ListSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubCustomers);
    }

    /**
     * 查询客户月度消费账单（V2）
     * 功能描述：合作伙伴可查询客户的消费汇总账单，消费按月汇总
     *
     * @param ListSubcustomerMonthlyBillsRequest 请求对象
     * @return ListSubcustomerMonthlyBillsResponse
    */
    public ListSubcustomerMonthlyBillsResponse listSubcustomerMonthlyBills(ListSubcustomerMonthlyBillsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.listSubcustomerMonthlyBills);
    }

    /**
     * 支付包周期订单
     * 功能描述：支付包周期订单
     *
     * @param PayOrdersRequest 请求对象
     * @return PayOrdersResponse
    */
    public PayOrdersResponse payOrders(PayOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.payOrders);
    }

    /**
     * 回收优惠券额度
     * 功能描述：一级经销商给二级经销商回收额度
     *
     * @param ReclaimCouponQuotasRequest 请求对象
     * @return ReclaimCouponQuotasResponse
    */
    public ReclaimCouponQuotasResponse reclaimCouponQuotas(ReclaimCouponQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimCouponQuotas);
    }

    /**
     * 回收精英服务商账户拨款
     * 功能描述：合作伙伴可以回收二级渠道账户余额
     *
     * @param ReclaimIndirectPartnerAccountRequest 请求对象
     * @return ReclaimIndirectPartnerAccountResponse
    */
    public ReclaimIndirectPartnerAccountResponse reclaimIndirectPartnerAccount(ReclaimIndirectPartnerAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimIndirectPartnerAccount);
    }

    /**
     * 伙伴回收子客户优惠券
     * 功能描述：伙伴回收子客户优惠券
     *
     * @param ReclaimPartnerCouponsRequest 请求对象
     * @return ReclaimPartnerCouponsResponse
    */
    public ReclaimPartnerCouponsResponse reclaimPartnerCoupons(ReclaimPartnerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimPartnerCoupons);
    }

    /**
     * 企业主账号从企业子账号回收拨款
     * 功能描述：企业主账号从企业子账号回收拨款
     *
     * @param ReclaimSubEnterpriseAmountRequest 请求对象
     * @return ReclaimSubEnterpriseAmountResponse
    */
    public ReclaimSubEnterpriseAmountResponse reclaimSubEnterpriseAmount(ReclaimSubEnterpriseAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimSubEnterpriseAmount);
    }

    /**
     * 回收子客户余额（支持一级回收二级的子客户余额）
     * 功能描述：回收子客户余额（支持一级回收二级的子客户余额）
     *
     * @param ReclaimToPartnerAccountRequest 请求对象
     * @return ReclaimToPartnerAccountResponse
    */
    public ReclaimToPartnerAccountResponse reclaimToPartnerAccount(ReclaimToPartnerAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.reclaimToPartnerAccount);
    }

    /**
     * 续订包周期资源
     * 功能描述：续订包周期资源
     *
     * @param RenewalResourcesRequest 请求对象
     * @return RenewalResourcesResponse
    */
    public RenewalResourcesResponse renewalResources(RenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.renewalResources);
    }

    /**
     * 发送短信验证码
     * 功能描述：发送短信验证码
     *
     * @param SendSmsVerificationCodeRequest 请求对象
     * @return SendSmsVerificationCodeResponse
    */
    public SendSmsVerificationCodeResponse sendSmsVerificationCode(SendSmsVerificationCodeRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.sendSmsVerificationCode);
    }

    /**
     * 短信验证码
     * 功能描述：发送验证码
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return SendVerificationMessageCodeResponse
    */
    public SendVerificationMessageCodeResponse sendVerificationMessageCode(SendVerificationMessageCodeRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.sendVerificationMessageCode);
    }

    /**
     * 查询客户账户余额
     * 功能描述：查询客户账户余额
     *
     * @param ShowCusotmerAccountBalancesRequest 请求对象
     * @return ShowCusotmerAccountBalancesResponse
    */
    public ShowCusotmerAccountBalancesResponse showCusotmerAccountBalances(ShowCusotmerAccountBalancesRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showCusotmerAccountBalances);
    }

    /**
     * 查询客户消费汇总
     * 功能描述：客户可以查询自身的消费汇总单的功能，消费按月汇总。每天刷新一次，更新前一天的数据。
     *
     * @param ShowCustomerMonthlySumRequest 请求对象
     * @return ShowCustomerMonthlySumResponse
    */
    public ShowCustomerMonthlySumResponse showCustomerMonthlySum(ShowCustomerMonthlySumRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showCustomerMonthlySum);
    }

    /**
     * 查询订单详情V2
     * 功能描述：查询订单详情
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return ShowCustomerOrderDetailsResponse
    */
    public ShowCustomerOrderDetailsResponse showCustomerOrderDetails(ShowCustomerOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showCustomerOrderDetails);
    }

    /**
     * 查询实名认证审核结果
     * 功能描述：查询实名认证审核结果
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return ShowRealnameAuthenticationReviewResultResponse
    */
    public ShowRealnameAuthenticationReviewResultResponse showRealnameAuthenticationReviewResult(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showRealnameAuthenticationReviewResult);
    }

    /**
     * 查询退款订单的金额详情V2
     * 功能描述：查询退款订单的金额详情
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return ShowRefundOrderDetailsResponse
    */
    public ShowRefundOrderDetailsResponse showRefundOrderDetails(ShowRefundOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.showRefundOrderDetails);
    }

    /**
     * 向精英服务商发放代金券额度
     * 功能描述：向精英服务商发放代金券额度
     *
     * @param UpdateCouponQuotasRequest 请求对象
     * @return UpdateCouponQuotasResponse
    */
    public UpdateCouponQuotasResponse updateCouponQuotas(UpdateCouponQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateCouponQuotas);
    }

    /**
     * 调账
     * 功能描述：从伙伴账户调账给子客户
     *
     * @param UpdateCustomerAccountAmountRequest 请求对象
     * @return UpdateCustomerAccountAmountResponse
    */
    public UpdateCustomerAccountAmountResponse updateCustomerAccountAmount(UpdateCustomerAccountAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateCustomerAccountAmount);
    }

    /**
     * 向二级渠道账户拨款
     * 功能描述：从伙伴账户调账给二级渠道
     *
     * @param UpdateIndirectPartnerAccountRequest 请求对象
     * @return UpdateIndirectPartnerAccountResponse
    */
    public UpdateIndirectPartnerAccountResponse updateIndirectPartnerAccount(UpdateIndirectPartnerAccountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateIndirectPartnerAccount);
    }

    /**
     * 修改邮寄地址
     * 功能描述：修改邮寄地址
     *
     * @param UpdatePostalRequest 请求对象
     * @return UpdatePostalResponse
    */
    public UpdatePostalResponse updatePostal(UpdatePostalRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updatePostal);
    }

    /**
     * 企业主账号向企业子账号拨款
     * 功能描述：企业主账号向企业子账号拨款
     *
     * @param UpdateSubEnterpriseAmountRequest 请求对象
     * @return UpdateSubEnterpriseAmountResponse
    */
    public UpdateSubEnterpriseAmountResponse updateSubEnterpriseAmount(UpdateSubEnterpriseAmountRequest request) {
        return hcClient.syncInvokeHttp(request, BssMeta.updateSubEnterpriseAmount);
    }

}
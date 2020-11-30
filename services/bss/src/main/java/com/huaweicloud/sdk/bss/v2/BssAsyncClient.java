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


    /**
     * 设置包年包月资源自动续费
     * 功能描述：设置包周期资源自动续费
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return CompletableFuture<AutoRenewalResourcesResponse>
     */
    public CompletableFuture<AutoRenewalResourcesResponse> autoRenewalResourcesAsync(AutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.autoRenewalResources);
    }

    /**
     * 设置伙伴折扣
     * 功能描述：设置伙伴折扣
     *
     * @param BatchSetSubCustomerDiscountRequest 请求对象
     * @return CompletableFuture<BatchSetSubCustomerDiscountResponse>
     */
    public CompletableFuture<BatchSetSubCustomerDiscountResponse> batchSetSubCustomerDiscountAsync(BatchSetSubCustomerDiscountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.batchSetSubCustomerDiscount);
    }

    /**
     * 取消包年包月资源自动续费
     * 功能描述：取消包年/包月资源自动续费
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return CompletableFuture<CancelAutoRenewalResourcesResponse>
     */
    public CompletableFuture<CancelAutoRenewalResourcesResponse> cancelAutoRenewalResourcesAsync(CancelAutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.cancelAutoRenewalResources);
    }

    /**
     * 取消包周期订单
     * 功能描述：取消包周期订单
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return CompletableFuture<CancelCustomerOrderResponse>
     */
    public CompletableFuture<CancelCustomerOrderResponse> cancelCustomerOrderAsync(CancelCustomerOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.cancelCustomerOrder);
    }

    /**
     * 退订包周期资源
     * 功能描述：退订包周期资源
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return CompletableFuture<CancelResourcesSubscriptionResponse>
     */
    public CompletableFuture<CancelResourcesSubscriptionResponse> cancelResourcesSubscriptionAsync(CancelResourcesSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.cancelResourcesSubscription);
    }

    /**
     * 实名认证变更申请
     * 功能描述：实名认证变更申请
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse>
     */
    public CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthenticationAsync(ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.changeEnterpriseRealnameAuthentication);
    }

    /**
     * 校验客户的注册信息
     * 功能描述：校验客户的注册信息
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return CompletableFuture<CheckUserIdentityResponse>
     */
    public CompletableFuture<CheckUserIdentityResponse> checkUserIdentityAsync(CheckUserIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.checkUserIdentity);
    }

    /**
     * 开通企业项目
     * 功能描述：客户开通自身的企业项目功能
     *
     * @param CreateEnterpriseProjectAuthRequest 请求对象
     * @return CompletableFuture<CreateEnterpriseProjectAuthResponse>
     */
    public CompletableFuture<CreateEnterpriseProjectAuthResponse> createEnterpriseProjectAuthAsync(CreateEnterpriseProjectAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createEnterpriseProjectAuth);
    }

    /**
     * 企业实名认证申请
     * 功能描述：企业实名认证申请V2
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse>
     */
    public CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationAsync(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createEnterpriseRealnameAuthentication);
    }

    /**
     * 伙伴给子客户发券
     * 功能描述：伙伴给子客户发券
     *
     * @param CreatePartnerCouponsRequest 请求对象
     * @return CompletableFuture<CreatePartnerCouponsResponse>
     */
    public CompletableFuture<CreatePartnerCouponsResponse> createPartnerCouponsAsync(CreatePartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createPartnerCoupons);
    }

    /**
     * 个人实名认证申请
     * 功能描述：个人实名认证申请
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return CompletableFuture<CreatePersonalRealnameAuthResponse>
     */
    public CompletableFuture<CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthAsync(CreatePersonalRealnameAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createPersonalRealnameAuth);
    }

    /**
     * 新增邮寄地址
     * 功能描述：新增邮寄地址
     *
     * @param CreatePostalRequest 请求对象
     * @return CompletableFuture<CreatePostalResponse>
     */
    public CompletableFuture<CreatePostalResponse> createPostalAsync(CreatePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createPostal);
    }

    /**
     * 创建客户（V2）
     * 功能描述：在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return CompletableFuture<CreateSubCustomerResponse>
     */
    public CompletableFuture<CreateSubCustomerResponse> createSubCustomerAsync(CreateSubCustomerRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createSubCustomer);
    }

    /**
     * 创建企业子账号
     * 功能描述：创建企业子账号
     *
     * @param CreateSubEnterpriseAccountRequest 请求对象
     * @return CompletableFuture<CreateSubEnterpriseAccountResponse>
     */
    public CompletableFuture<CreateSubEnterpriseAccountResponse> createSubEnterpriseAccountAsync(CreateSubEnterpriseAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createSubEnterpriseAccount);
    }

    /**
     * 删除邮寄地址
     * 功能描述：删除邮寄地址
     *
     * @param DeletePostalRequest 请求对象
     * @return CompletableFuture<DeletePostalResponse>
     */
    public CompletableFuture<DeletePostalResponse> deletePostalAsync(DeletePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.deletePostal);
    }

    /**
     * 根据省份查询城市信息
     * 功能描述：根据省份查询城市列表
     *
     * @param ListCitiesRequest 请求对象
     * @return CompletableFuture<ListCitiesResponse>
     */
    public CompletableFuture<ListCitiesResponse> listCitiesAsync(ListCitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCities);
    }

    /**
     * 根据城市查询区县信息
     * 功能描述：根据城市查询区县列表
     *
     * @param ListCountiesRequest 请求对象
     * @return CompletableFuture<ListCountiesResponse>
     */
    public CompletableFuture<ListCountiesResponse> listCountiesAsync(ListCountiesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCounties);
    }

    /**
     * 查询优惠券额度发放回收记录
     * 功能描述：查询优惠券额度发放回收记录
     *
     * @param ListCouponQuotasRecordsRequest 请求对象
     * @return CompletableFuture<ListCouponQuotasRecordsResponse>
     */
    public CompletableFuture<ListCouponQuotasRecordsResponse> listCouponQuotasRecordsAsync(ListCouponQuotasRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCouponQuotasRecords);
    }

    /**
     * 查询流水账单
     * 功能描述：客户在客户自建平台查询自己的流水账单
     *
     * @param ListCustomerBillsFeeRecordsRequest 请求对象
     * @return CompletableFuture<ListCustomerBillsFeeRecordsResponse>
     */
    public CompletableFuture<ListCustomerBillsFeeRecordsResponse> listCustomerBillsFeeRecordsAsync(ListCustomerBillsFeeRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerBillsFeeRecords);
    }

    /**
     * 查询客户按需资源列表
     * 功能描述：查询客户按需资源列表
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return CompletableFuture<ListCustomerOnDemandResourcesResponse>
     */
    public CompletableFuture<ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesAsync(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerOnDemandResources);
    }

    /**
     * 查询订单列表V2
     * 功能描述：查询订单列表
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return CompletableFuture<ListCustomerOrdersResponse>
     */
    public CompletableFuture<ListCustomerOrdersResponse> listCustomerOrdersAsync(ListCustomerOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerOrders);
    }

    /**
     * 批量查询伙伴子客户账户余额
     * 功能描述：批量查询伙伴子客户账户余额
     *
     * @param ListCustomersBalancesDetailRequest 请求对象
     * @return CompletableFuture<ListCustomersBalancesDetailResponse>
     */
    public CompletableFuture<ListCustomersBalancesDetailResponse> listCustomersBalancesDetailAsync(ListCustomersBalancesDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomersBalancesDetail);
    }

    /**
     * 查询资源详单V2（客户）
     * 功能描述：客户在客户自建平台查询自己的资源详单，用于反映各类资源的消耗情况。资源详单数据有延迟，最大延迟24小时。
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return CompletableFuture<ListCustomerselfResourceRecordDetailsResponse>
     */
    public CompletableFuture<ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsAsync(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerselfResourceRecordDetails);
    }

    /**
     * 查询资源消费记录（客户）
     * 功能描述：查询资源消费记录（客户）
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return CompletableFuture<ListCustomerselfResourceRecordsResponse>
     */
    public CompletableFuture<ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsAsync(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerselfResourceRecords);
    }

    /**
     * 查询企业子可回收余额
     * 功能描述：查询企业子可回收余额
     *
     * @param ListEnterpriseMultiAccountRequest 请求对象
     * @return CompletableFuture<ListEnterpriseMultiAccountResponse>
     */
    public CompletableFuture<ListEnterpriseMultiAccountResponse> listEnterpriseMultiAccountAsync(ListEnterpriseMultiAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listEnterpriseMultiAccount);
    }

    /**
     * 查询企业组织结构
     * 功能描述：企业主账号在客户自建平台查询企业组织结构
     *
     * @param ListEnterpriseOrganizationsRequest 请求对象
     * @return CompletableFuture<ListEnterpriseOrganizationsResponse>
     */
    public CompletableFuture<ListEnterpriseOrganizationsResponse> listEnterpriseOrganizationsAsync(ListEnterpriseOrganizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listEnterpriseOrganizations);
    }

    /**
     * 查询企业子账号列表
     * 功能描述：企业主账号在客户自建平台查询企业子账号信息列表
     *
     * @param ListEnterpriseSubCustomersRequest 请求对象
     * @return CompletableFuture<ListEnterpriseSubCustomersResponse>
     */
    public CompletableFuture<ListEnterpriseSubCustomersResponse> listEnterpriseSubCustomersAsync(ListEnterpriseSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listEnterpriseSubCustomers);
    }

    /**
     * 查询精英服务商列表
     * 功能描述：查询精英服务商列表
     *
     * @param ListIndirectPartnersRequest 请求对象
     * @return CompletableFuture<ListIndirectPartnersResponse>
     */
    public CompletableFuture<ListIndirectPartnersResponse> listIndirectPartnersAsync(ListIndirectPartnersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listIndirectPartners);
    }

    /**
     * 查询已发放优惠券额度
     * 功能描述：一级经销商查询发给二级经销商的额度
     *
     * @param ListIssuedCouponQuotasRequest 请求对象
     * @return CompletableFuture<ListIssuedCouponQuotasResponse>
     */
    public CompletableFuture<ListIssuedCouponQuotasResponse> listIssuedCouponQuotasAsync(ListIssuedCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listIssuedCouponQuotas);
    }

    /**
     * 查询已发放的优惠券列表
     * 功能描述：查询已发放的优惠券列表
     *
     * @param ListIssuedPartnerCouponsRequest 请求对象
     * @return CompletableFuture<ListIssuedPartnerCouponsResponse>
     */
    public CompletableFuture<ListIssuedPartnerCouponsResponse> listIssuedPartnerCouponsAsync(ListIssuedPartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listIssuedPartnerCoupons);
    }

    /**
     * 查询按需产品价格
     * 功能描述：按需资源询价
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return CompletableFuture<ListOnDemandResourceRatingsResponse>
     */
    public CompletableFuture<ListOnDemandResourceRatingsResponse> listOnDemandResourceRatingsAsync(ListOnDemandResourceRatingsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listOnDemandResourceRatings);
    }

    /**
     * 查询订单可用优惠券
     * 功能描述：查询订单详情
     *
     * @param ListOrderCouponsByOrderIdRequest 请求对象
     * @return CompletableFuture<ListOrderCouponsByOrderIdResponse>
     */
    public CompletableFuture<ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderIdAsync(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listOrderCouponsByOrderId);
    }

    /**
     * 查询调账回收记录
     * 功能描述：查询调账回收记录
     *
     * @param ListPartnerAdjustRecordsRequest 请求对象
     * @return CompletableFuture<ListPartnerAdjustRecordsResponse>
     */
    public CompletableFuture<ListPartnerAdjustRecordsResponse> listPartnerAdjustRecordsAsync(ListPartnerAdjustRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerAdjustRecords);
    }

    /**
     * 查询账户余额
     * 功能描述：查询伙伴账户余额
     *
     * @param ListPartnerBalancesRequest 请求对象
     * @return CompletableFuture<ListPartnerBalancesResponse>
     */
    public CompletableFuture<ListPartnerBalancesResponse> listPartnerBalancesAsync(ListPartnerBalancesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerBalances);
    }

    /**
     * 查询优惠券的发放回收记录
     * 功能描述：查询优惠券的发放回收记录
     *
     * @param ListPartnerCouponsRecordRequest 请求对象
     * @return CompletableFuture<ListPartnerCouponsRecordResponse>
     */
    public CompletableFuture<ListPartnerCouponsRecordResponse> listPartnerCouponsRecordAsync(ListPartnerCouponsRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerCouponsRecord);
    }

    /**
     * 查询伙伴代付订单列表
     * 功能描述：查询伙伴代付订单列表
     *
     * @param ListPartnerPayOrdersRequest 请求对象
     * @return CompletableFuture<ListPartnerPayOrdersResponse>
     */
    public CompletableFuture<ListPartnerPayOrdersResponse> listPartnerPayOrdersAsync(ListPartnerPayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerPayOrders);
    }

    /**
     * 查询客户包年包月资源列表
     * 功能描述：查询客户包年/包月资源列表
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return CompletableFuture<ListPayPerUseCustomerResourcesResponse>
     */
    public CompletableFuture<ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesAsync(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPayPerUseCustomerResources);
    }

    /**
     * 查询邮寄地址
     * 功能描述：查询邮寄地址
     *
     * @param ListPostalAddressRequest 请求对象
     * @return CompletableFuture<ListPostalAddressResponse>
     */
    public CompletableFuture<ListPostalAddressResponse> listPostalAddressAsync(ListPostalAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPostalAddress);
    }

    /**
     * 根据国家查询省份信息
     * 功能描述：根据国家查询省份列表
     *
     * @param ListProvincesRequest 请求对象
     * @return CompletableFuture<ListProvincesResponse>
     */
    public CompletableFuture<ListProvincesResponse> listProvincesAsync(ListProvincesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listProvinces);
    }

    /**
     * 查询优惠券额度列表
     * 功能描述：查询优惠券额度列表
     *
     * @param ListQuotaCouponsRequest 请求对象
     * @return CompletableFuture<ListQuotaCouponsResponse>
     */
    public CompletableFuture<ListQuotaCouponsResponse> listQuotaCouponsAsync(ListQuotaCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listQuotaCoupons);
    }

    /**
     * 包周期资源订购询价
     * 功能描述：包周期资源订购询价
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return CompletableFuture<ListRateOnPeriodDetailResponse>
     */
    public CompletableFuture<ListRateOnPeriodDetailResponse> listRateOnPeriodDetailAsync(ListRateOnPeriodDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listRateOnPeriodDetail);
    }

    /**
     * 查询资源类型
     * 功能描述：查询资源类型
     *
     * @param ListResourceTypesRequest 请求对象
     * @return CompletableFuture<ListResourceTypesResponse>
     */
    public CompletableFuture<ListResourceTypesResponse> listResourceTypesAsync(ListResourceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listResourceTypes);
    }

    /**
     * 查询套餐内使用量
     * 功能描述：查询套餐内使用量
     *
     * @param ListResourceUsagesRequest 请求对象
     * @return CompletableFuture<ListResourceUsagesResponse>
     */
    public CompletableFuture<ListResourceUsagesResponse> listResourceUsagesAsync(ListResourceUsagesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listResourceUsages);
    }

    /**
     * 根据云服务类型查询资源列表
     * 功能描述：根据云服务类型查询资源列表
     *
     * @param ListServiceResourcesRequest 请求对象
     * @return CompletableFuture<ListServiceResourcesResponse>
     */
    public CompletableFuture<ListServiceResourcesResponse> listServiceResourcesAsync(ListServiceResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listServiceResources);
    }

    /**
     * 查询云服务类型列表
     * 功能描述：查询云服务类型列表
     *
     * @param ListServiceTypesRequest 请求对象
     * @return CompletableFuture<ListServiceTypesResponse>
     */
    public CompletableFuture<ListServiceTypesResponse> listServiceTypesAsync(ListServiceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listServiceTypes);
    }

    /**
     * 库存查询
     * 功能描述：查询硬件库存
     *
     * @param ListSkuInventoriesRequest 请求对象
     * @return CompletableFuture<ListSkuInventoriesResponse>
     */
    public CompletableFuture<ListSkuInventoriesResponse> listSkuInventoriesAsync(ListSkuInventoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSkuInventories);
    }

    /**
     * 查询优惠券列表
     * 功能描述：查询优惠券列表
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return CompletableFuture<ListSubCustomerCouponsResponse>
     */
    public CompletableFuture<ListSubCustomerCouponsResponse> listSubCustomerCouponsAsync(ListSubCustomerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomerCoupons);
    }

    /**
     * 查询伙伴折扣
     * 功能描述：查询伙伴折扣
     *
     * @param ListSubCustomerDiscountsRequest 请求对象
     * @return CompletableFuture<ListSubCustomerDiscountsResponse>
     */
    public CompletableFuture<ListSubCustomerDiscountsResponse> listSubCustomerDiscountsAsync(ListSubCustomerDiscountsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomerDiscounts);
    }

    /**
     * 查询客户消费记录
     * 功能描述：查询客户消费记录
     *
     * @param ListSubCustomerResFeeRecordsRequest 请求对象
     * @return CompletableFuture<ListSubCustomerResFeeRecordsResponse>
     */
    public CompletableFuture<ListSubCustomerResFeeRecordsResponse> listSubCustomerResFeeRecordsAsync(ListSubCustomerResFeeRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomerResFeeRecords);
    }

    /**
     * 查询客户列表
     * 功能描述：查询客户列表
     *
     * @param ListSubCustomersRequest 请求对象
     * @return CompletableFuture<ListSubCustomersResponse>
     */
    public CompletableFuture<ListSubCustomersResponse> listSubCustomersAsync(ListSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomers);
    }

    /**
     * 查询客户月度消费账单（V2）
     * 功能描述：合作伙伴可查询客户的消费汇总账单，消费按月汇总
     *
     * @param ListSubcustomerMonthlyBillsRequest 请求对象
     * @return CompletableFuture<ListSubcustomerMonthlyBillsResponse>
     */
    public CompletableFuture<ListSubcustomerMonthlyBillsResponse> listSubcustomerMonthlyBillsAsync(ListSubcustomerMonthlyBillsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubcustomerMonthlyBills);
    }

    /**
     * 查询使用量列表
     * 功能描述：客户在伙伴销售平台或自建平台查询包年/包月或按需产品的列表
     *
     * @param ListUsageTypesRequest 请求对象
     * @return CompletableFuture<ListUsageTypesResponse>
     */
    public CompletableFuture<ListUsageTypesResponse> listUsageTypesAsync(ListUsageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listUsageTypes);
    }

    /**
     * 支付包周期订单
     * 功能描述：支付包周期订单
     *
     * @param PayOrdersRequest 请求对象
     * @return CompletableFuture<PayOrdersResponse>
     */
    public CompletableFuture<PayOrdersResponse> payOrdersAsync(PayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.payOrders);
    }

    /**
     * 回收优惠券额度
     * 功能描述：一级经销商给二级经销商回收额度
     *
     * @param ReclaimCouponQuotasRequest 请求对象
     * @return CompletableFuture<ReclaimCouponQuotasResponse>
     */
    public CompletableFuture<ReclaimCouponQuotasResponse> reclaimCouponQuotasAsync(ReclaimCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimCouponQuotas);
    }

    /**
     * 回收精英服务商账户拨款
     * 功能描述：合作伙伴可以回收二级渠道账户余额
     *
     * @param ReclaimIndirectPartnerAccountRequest 请求对象
     * @return CompletableFuture<ReclaimIndirectPartnerAccountResponse>
     */
    public CompletableFuture<ReclaimIndirectPartnerAccountResponse> reclaimIndirectPartnerAccountAsync(ReclaimIndirectPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimIndirectPartnerAccount);
    }

    /**
     * 伙伴回收子客户优惠券
     * 功能描述：伙伴回收子客户优惠券
     *
     * @param ReclaimPartnerCouponsRequest 请求对象
     * @return CompletableFuture<ReclaimPartnerCouponsResponse>
     */
    public CompletableFuture<ReclaimPartnerCouponsResponse> reclaimPartnerCouponsAsync(ReclaimPartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimPartnerCoupons);
    }

    /**
     * 企业主账号从企业子账号回收拨款
     * 功能描述：企业主账号从企业子账号回收拨款
     *
     * @param ReclaimSubEnterpriseAmountRequest 请求对象
     * @return CompletableFuture<ReclaimSubEnterpriseAmountResponse>
     */
    public CompletableFuture<ReclaimSubEnterpriseAmountResponse> reclaimSubEnterpriseAmountAsync(ReclaimSubEnterpriseAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimSubEnterpriseAmount);
    }

    /**
     * 回收子客户余额（支持一级回收二级的子客户余额）
     * 功能描述：回收子客户余额（支持一级回收二级的子客户余额）
     *
     * @param ReclaimToPartnerAccountRequest 请求对象
     * @return CompletableFuture<ReclaimToPartnerAccountResponse>
     */
    public CompletableFuture<ReclaimToPartnerAccountResponse> reclaimToPartnerAccountAsync(ReclaimToPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimToPartnerAccount);
    }

    /**
     * 续订包周期资源
     * 功能描述：续订包周期资源
     *
     * @param RenewalResourcesRequest 请求对象
     * @return CompletableFuture<RenewalResourcesResponse>
     */
    public CompletableFuture<RenewalResourcesResponse> renewalResourcesAsync(RenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.renewalResources);
    }

    /**
     * 发送短信验证码
     * 功能描述：发送短信验证码
     *
     * @param SendSmsVerificationCodeRequest 请求对象
     * @return CompletableFuture<SendSmsVerificationCodeResponse>
     */
    public CompletableFuture<SendSmsVerificationCodeResponse> sendSmsVerificationCodeAsync(SendSmsVerificationCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.sendSmsVerificationCode);
    }

    /**
     * 短信验证码
     * 功能描述：发送验证码
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return CompletableFuture<SendVerificationMessageCodeResponse>
     */
    public CompletableFuture<SendVerificationMessageCodeResponse> sendVerificationMessageCodeAsync(SendVerificationMessageCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.sendVerificationMessageCode);
    }

    /**
     * 查询客户账户余额
     * 功能描述：查询客户账户余额
     *
     * @param ShowCusotmerAccountBalancesRequest 请求对象
     * @return CompletableFuture<ShowCusotmerAccountBalancesResponse>
     */
    public CompletableFuture<ShowCusotmerAccountBalancesResponse> showCusotmerAccountBalancesAsync(ShowCusotmerAccountBalancesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showCusotmerAccountBalances);
    }

    /**
     * 查询客户消费汇总
     * 功能描述：客户可以查询自身的消费汇总单的功能，消费按月汇总。每天刷新一次，更新前一天的数据。
     *
     * @param ShowCustomerMonthlySumRequest 请求对象
     * @return CompletableFuture<ShowCustomerMonthlySumResponse>
     */
    public CompletableFuture<ShowCustomerMonthlySumResponse> showCustomerMonthlySumAsync(ShowCustomerMonthlySumRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showCustomerMonthlySum);
    }

    /**
     * 查询订单详情V2
     * 功能描述：查询订单详情
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return CompletableFuture<ShowCustomerOrderDetailsResponse>
     */
    public CompletableFuture<ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsAsync(ShowCustomerOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showCustomerOrderDetails);
    }

    /**
     * 查询企业主的可拨款余额
     * 功能描述：查询企业主的可拨款余额
     *
     * @param ShowMultiAccountTransferAmountRequest 请求对象
     * @return CompletableFuture<ShowMultiAccountTransferAmountResponse>
     */
    public CompletableFuture<ShowMultiAccountTransferAmountResponse> showMultiAccountTransferAmountAsync(ShowMultiAccountTransferAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showMultiAccountTransferAmount);
    }

    /**
     * 查询实名认证审核结果
     * 功能描述：查询实名认证审核结果
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return CompletableFuture<ShowRealnameAuthenticationReviewResultResponse>
     */
    public CompletableFuture<ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultAsync(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showRealnameAuthenticationReviewResult);
    }

    /**
     * 查询退款订单的金额详情V2
     * 功能描述：查询退款订单的金额详情
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return CompletableFuture<ShowRefundOrderDetailsResponse>
     */
    public CompletableFuture<ShowRefundOrderDetailsResponse> showRefundOrderDetailsAsync(ShowRefundOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showRefundOrderDetails);
    }

    /**
     * 向精英服务商发放代金券额度
     * 功能描述：向精英服务商发放代金券额度
     *
     * @param UpdateCouponQuotasRequest 请求对象
     * @return CompletableFuture<UpdateCouponQuotasResponse>
     */
    public CompletableFuture<UpdateCouponQuotasResponse> updateCouponQuotasAsync(UpdateCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateCouponQuotas);
    }

    /**
     * 调账
     * 功能描述：从伙伴账户调账给子客户
     *
     * @param UpdateCustomerAccountAmountRequest 请求对象
     * @return CompletableFuture<UpdateCustomerAccountAmountResponse>
     */
    public CompletableFuture<UpdateCustomerAccountAmountResponse> updateCustomerAccountAmountAsync(UpdateCustomerAccountAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateCustomerAccountAmount);
    }

    /**
     * 向二级渠道账户拨款
     * 功能描述：从伙伴账户调账给二级渠道
     *
     * @param UpdateIndirectPartnerAccountRequest 请求对象
     * @return CompletableFuture<UpdateIndirectPartnerAccountResponse>
     */
    public CompletableFuture<UpdateIndirectPartnerAccountResponse> updateIndirectPartnerAccountAsync(UpdateIndirectPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateIndirectPartnerAccount);
    }

    /**
     * 设置或者取消包周期资源到期转按需
     * 功能描述：设置或者取消包周期资源到期转按需
     *
     * @param UpdatePeriodToOnDemandRequest 请求对象
     * @return CompletableFuture<UpdatePeriodToOnDemandResponse>
     */
    public CompletableFuture<UpdatePeriodToOnDemandResponse> updatePeriodToOnDemandAsync(UpdatePeriodToOnDemandRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updatePeriodToOnDemand);
    }

    /**
     * 修改邮寄地址
     * 功能描述：修改邮寄地址
     *
     * @param UpdatePostalRequest 请求对象
     * @return CompletableFuture<UpdatePostalResponse>
     */
    public CompletableFuture<UpdatePostalResponse> updatePostalAsync(UpdatePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updatePostal);
    }

    /**
     * 企业主账号向企业子账号拨款
     * 功能描述：企业主账号向企业子账号拨款
     *
     * @param UpdateSubEnterpriseAmountRequest 请求对象
     * @return CompletableFuture<UpdateSubEnterpriseAmountResponse>
     */
    public CompletableFuture<UpdateSubEnterpriseAmountResponse> updateSubEnterpriseAmountAsync(UpdateSubEnterpriseAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateSubEnterpriseAmount);
    }

}
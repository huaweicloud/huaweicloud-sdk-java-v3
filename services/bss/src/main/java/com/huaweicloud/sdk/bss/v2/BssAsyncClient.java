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
     * 设置包年/包月资源自动续费
     * 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return CompletableFuture<AutoRenewalResourcesResponse>
     */
    public CompletableFuture<AutoRenewalResourcesResponse> autoRenewalResourcesAsync(AutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.autoRenewalResources);
    }

    /**
     * 设置伙伴折扣
     * 功能描述：合作伙伴可以为客户设置产品折扣，可指定有效期。被授予折扣后，客户在购买华为云产品（特殊产品除外）时，可享受伙伴授予折扣。
     *
     * @param BatchSetSubCustomerDiscountRequest 请求对象
     * @return CompletableFuture<BatchSetSubCustomerDiscountResponse>
     */
    public CompletableFuture<BatchSetSubCustomerDiscountResponse> batchSetSubCustomerDiscountAsync(BatchSetSubCustomerDiscountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.batchSetSubCustomerDiscount);
    }

    /**
     * 取消包年/包月资源自动续费
     * 功能描述：取消包年/包月资源自动续费
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return CompletableFuture<CancelAutoRenewalResourcesResponse>
     */
    public CompletableFuture<CancelAutoRenewalResourcesResponse> cancelAutoRenewalResourcesAsync(CancelAutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.cancelAutoRenewalResources);
    }

    /**
     * 取消待支付订单
     * 功能描述：客户可以对待支付的订单进行取消操作
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return CompletableFuture<CancelCustomerOrderResponse>
     */
    public CompletableFuture<CancelCustomerOrderResponse> cancelCustomerOrderAsync(CancelCustomerOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.cancelCustomerOrder);
    }

    /**
     * 退订包年/包月资源
     * 功能描述：客户购买包年/包月资源后，支持客户退订包年/包月实例。退订资源实例包括资源续费部分和当前正在使用的部分，退订后资源将无法使用
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return CompletableFuture<CancelResourcesSubscriptionResponse>
     */
    public CompletableFuture<CancelResourcesSubscriptionResponse> cancelResourcesSubscriptionAsync(CancelResourcesSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.cancelResourcesSubscription);
    }

    /**
     * 申请实名认证变更
     * 功能描述：客户可以进行实名认证变更申请。
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse>
     */
    public CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthenticationAsync(ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.changeEnterpriseRealnameAuthentication);
    }

    /**
     * 校验客户注册信息
     * 功能描述：客户注册时可检查客户的登录名称、手机号或者邮箱是否可以用于注册。
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return CompletableFuture<CheckUserIdentityResponse>
     */
    public CompletableFuture<CheckUserIdentityResponse> checkUserIdentityAsync(CheckUserIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.checkUserIdentity);
    }

    /**
     * 开通客户企业项目权限
     * 功能描述：客户在客户自建平台开通客户企业项目权限
     *
     * @param CreateEnterpriseProjectAuthRequest 请求对象
     * @return CompletableFuture<CreateEnterpriseProjectAuthResponse>
     */
    public CompletableFuture<CreateEnterpriseProjectAuthResponse> createEnterpriseProjectAuthAsync(CreateEnterpriseProjectAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createEnterpriseProjectAuth);
    }

    /**
     * 申请企业实名认证
     * 功能描述：企业客户可以进行企业实名认证申请。
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse>
     */
    public CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationAsync(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createEnterpriseRealnameAuthentication);
    }

    /**
     * 发放优惠券
     * 功能描述：合作伙伴可以在拥有的代金券额度范围内为客户下发优惠券。
     *
     * @param CreatePartnerCouponsRequest 请求对象
     * @return CompletableFuture<CreatePartnerCouponsResponse>
     */
    public CompletableFuture<CreatePartnerCouponsResponse> createPartnerCouponsAsync(CreatePartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createPartnerCoupons);
    }

    /**
     * 申请个人实名认证
     * 功能描述：个人客户可以进行个人实名认证申请。
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return CompletableFuture<CreatePersonalRealnameAuthResponse>
     */
    public CompletableFuture<CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthAsync(CreatePersonalRealnameAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createPersonalRealnameAuth);
    }

    /**
     * 新增邮寄地址
     * 功能描述：客户可以新增自己的邮寄地址信息。
     *
     * @param CreatePostalRequest 请求对象
     * @return CompletableFuture<CreatePostalResponse>
     */
    public CompletableFuture<CreatePostalResponse> createPostalAsync(CreatePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createPostal);
    }

    /**
     * 创建客户
     * 功能描述：在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。华为云伙伴能力中心（一级经销商）可以注册精英服务商伙伴（二级经销商）的子客户。注册完成后，子客户可以自动和精英服务商伙伴绑定。
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return CompletableFuture<CreateSubCustomerResponse>
     */
    public CompletableFuture<CreateSubCustomerResponse> createSubCustomerAsync(CreateSubCustomerRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createSubCustomer);
    }

    /**
     * 创建企业子账号
     * 功能描述：企业主账号在客户自建平台创建企业子账号
     *
     * @param CreateSubEnterpriseAccountRequest 请求对象
     * @return CompletableFuture<CreateSubEnterpriseAccountResponse>
     */
    public CompletableFuture<CreateSubEnterpriseAccountResponse> createSubEnterpriseAccountAsync(CreateSubEnterpriseAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.createSubEnterpriseAccount);
    }

    /**
     * 删除邮寄地址
     * 功能描述：客户可以删除自己的邮寄地址信息。
     *
     * @param DeletePostalRequest 请求对象
     * @return CompletableFuture<DeletePostalResponse>
     */
    public CompletableFuture<DeletePostalResponse> deletePostalAsync(DeletePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.deletePostal);
    }

    /**
     * 查询城市信息
     * 功能描述：伙伴在伙伴销售平台上查询城市信息。
     *
     * @param ListCitiesRequest 请求对象
     * @return CompletableFuture<ListCitiesResponse>
     */
    public CompletableFuture<ListCitiesResponse> listCitiesAsync(ListCitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCities);
    }

    /**
     * 查询使用量单位进制
     * 功能描述：伙伴在伙伴销售平台上查询使用量单位的进制转换信息，用于不同度量单位之间的转换。
     *
     * @param ListConversionsRequest 请求对象
     * @return CompletableFuture<ListConversionsResponse>
     */
    public CompletableFuture<ListConversionsResponse> listConversionsAsync(ListConversionsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listConversions);
    }

    /**
     * 查询区县信息
     * 功能描述：伙伴在伙伴销售平台上查询区县信息。
     *
     * @param ListCountiesRequest 请求对象
     * @return CompletableFuture<ListCountiesResponse>
     */
    public CompletableFuture<ListCountiesResponse> listCountiesAsync(ListCountiesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCounties);
    }

    /**
     * 查询代金券额度的发放回收记录
     * 功能描述：华为云伙伴能力中心（一级经销商）可以在伙伴中心查看给精英服务商（二级经销商）发放或回收代金券额度的操作记录。
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
     * 功能描述：客户在伙伴销售平台查询已开通的按需资源
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return CompletableFuture<ListCustomerOnDemandResourcesResponse>
     */
    public CompletableFuture<ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesAsync(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerOnDemandResources);
    }

    /**
     * 查询订单列表
     * 功能描述：客户购买包年包月资源后，可以查看待审核、处理中、已取消、已完成和待支付等状态的订单
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
     * 查询资源详单
     * 功能描述：客户在客户自建平台查询自己的资源详单，用于反映各类资源的消耗情况。
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return CompletableFuture<ListCustomerselfResourceRecordDetailsResponse>
     */
    public CompletableFuture<ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsAsync(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerselfResourceRecordDetails);
    }

    /**
     * 查询资源消费记录
     * 功能描述：客户在客户自建平台查询每个资源的消费明细数据
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return CompletableFuture<ListCustomerselfResourceRecordsResponse>
     */
    public CompletableFuture<ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsAsync(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listCustomerselfResourceRecords);
    }

    /**
     * 查询企业子账号可回收余额
     * 功能描述：企业主账号在客户自建平台查询企业子账号的可回收余额
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
     * 功能描述：华为云伙伴能力中心（一级经销商）可以查询精英服务商（二级经销商）列表。
     *
     * @param ListIndirectPartnersRequest 请求对象
     * @return CompletableFuture<ListIndirectPartnersResponse>
     */
    public CompletableFuture<ListIndirectPartnersResponse> listIndirectPartnersAsync(ListIndirectPartnersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listIndirectPartners);
    }

    /**
     * 查询已发放的代金券额度
     * 功能描述：华为云伙伴能力中心（一级经销商）可以在伙伴中心查看发放给精英服务商（二级经销商）的代金券额度列表。
     *
     * @param ListIssuedCouponQuotasRequest 请求对象
     * @return CompletableFuture<ListIssuedCouponQuotasResponse>
     */
    public CompletableFuture<ListIssuedCouponQuotasResponse> listIssuedCouponQuotasAsync(ListIssuedCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listIssuedCouponQuotas);
    }

    /**
     * 查询已发放的优惠券
     * 功能描述：合作伙伴可以查询已发放的优惠券列表。
     *
     * @param ListIssuedPartnerCouponsRequest 请求对象
     * @return CompletableFuture<ListIssuedPartnerCouponsResponse>
     */
    public CompletableFuture<ListIssuedPartnerCouponsResponse> listIssuedPartnerCouponsAsync(ListIssuedPartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listIssuedPartnerCoupons);
    }

    /**
     * 查询使用量单位列表
     * 功能描述：伙伴在伙伴销售平台上查询资源使用量的度量单位及名称，度量单位类型等。
     *
     * @param ListMeasureUnitsRequest 请求对象
     * @return CompletableFuture<ListMeasureUnitsResponse>
     */
    public CompletableFuture<ListMeasureUnitsResponse> listMeasureUnitsAsync(ListMeasureUnitsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listMeasureUnits);
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
     * 功能描述：客户在客户自建平台查看订单可用的优惠券列表
     *
     * @param ListOrderCouponsByOrderIdRequest 请求对象
     * @return CompletableFuture<ListOrderCouponsByOrderIdResponse>
     */
    public CompletableFuture<ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderIdAsync(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listOrderCouponsByOrderId);
    }

    /**
     * 查询订单可用折扣
     * 功能描述：功能介绍客户在伙伴销售平台支付待支付订单时，查询可使用的折扣。只返回商务合同折扣和伙伴授权折扣客户在客户自建平台查看订单可用的优惠券列表。
     *
     * @param ListOrderDiscountsRequest 请求对象
     * @return CompletableFuture<ListOrderDiscountsResponse>
     */
    public CompletableFuture<ListOrderDiscountsResponse> listOrderDiscountsAsync(ListOrderDiscountsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listOrderDiscounts);
    }

    /**
     * 查询调账记录
     * 功能描述：伙伴在伙伴销售平台查询向客户及关联的精英服务商（二级经销商）拨款或回收的调账记录
     *
     * @param ListPartnerAdjustRecordsRequest 请求对象
     * @return CompletableFuture<ListPartnerAdjustRecordsResponse>
     */
    public CompletableFuture<ListPartnerAdjustRecordsResponse> listPartnerAdjustRecordsAsync(ListPartnerAdjustRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerAdjustRecords);
    }

    /**
     * 查询伙伴/精英服务商账户余额
     * 功能描述：合作伙伴可以查询自己及关联的精英服务商的账户余额。
     *
     * @param ListPartnerBalancesRequest 请求对象
     * @return CompletableFuture<ListPartnerBalancesResponse>
     */
    public CompletableFuture<ListPartnerBalancesResponse> listPartnerBalancesAsync(ListPartnerBalancesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerBalances);
    }

    /**
     * 查询优惠券的发放回收记录
     * 功能描述：合作伙伴可查看给客户发放和回收优惠券的操作记录。
     *
     * @param ListPartnerCouponsRecordRequest 请求对象
     * @return CompletableFuture<ListPartnerCouponsRecordResponse>
     */
    public CompletableFuture<ListPartnerCouponsRecordResponse> listPartnerCouponsRecordAsync(ListPartnerCouponsRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerCouponsRecord);
    }

    /**
     * 查询伙伴代付订单列表
     * 功能描述：伙伴在伙伴销售平台查询客户的代支付订单列表。
     *
     * @param ListPartnerPayOrdersRequest 请求对象
     * @return CompletableFuture<ListPartnerPayOrdersResponse>
     */
    public CompletableFuture<ListPartnerPayOrdersResponse> listPartnerPayOrdersAsync(ListPartnerPayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPartnerPayOrders);
    }

    /**
     * 查询客户包年/包月资源列表
     * 功能描述：客户在客户自建平台查询某个或所有的包年/包月资源
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return CompletableFuture<ListPayPerUseCustomerResourcesResponse>
     */
    public CompletableFuture<ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesAsync(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPayPerUseCustomerResources);
    }

    /**
     * 查询邮寄地址
     * 功能描述：客户可以查询自己的邮寄地址信息。
     *
     * @param ListPostalAddressRequest 请求对象
     * @return CompletableFuture<ListPostalAddressResponse>
     */
    public CompletableFuture<ListPostalAddressResponse> listPostalAddressAsync(ListPostalAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listPostalAddress);
    }

    /**
     * 查询省份信息
     * 功能描述：伙伴在伙伴销售平台上查询省份信息。
     *
     * @param ListProvincesRequest 请求对象
     * @return CompletableFuture<ListProvincesResponse>
     */
    public CompletableFuture<ListProvincesResponse> listProvincesAsync(ListProvincesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listProvinces);
    }

    /**
     * 查询优惠券额度
     * 功能描述：合作伙伴可以查看所拥有的优惠劵额度。
     *
     * @param ListQuotaCouponsRequest 请求对象
     * @return CompletableFuture<ListQuotaCouponsResponse>
     */
    public CompletableFuture<ListQuotaCouponsResponse> listQuotaCouponsAsync(ListQuotaCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listQuotaCoupons);
    }

    /**
     * 查询包年/包月产品价格
     * 功能描述：客户在自建平台按照条件查询包年/包月产品开通时候的价格
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return CompletableFuture<ListRateOnPeriodDetailResponse>
     */
    public CompletableFuture<ListRateOnPeriodDetailResponse> listRateOnPeriodDetailAsync(ListRateOnPeriodDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listRateOnPeriodDetail);
    }

    /**
     * 查询资源类型列表
     * 功能描述：客户在客户自建平台查询资源类型的列表。
     *
     * @param ListResourceTypesRequest 请求对象
     * @return CompletableFuture<ListResourceTypesResponse>
     */
    public CompletableFuture<ListResourceTypesResponse> listResourceTypesAsync(ListResourceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listResourceTypes);
    }

    /**
     * 查询套餐内使用量
     * 功能描述：客户在客户自建平台查询套餐内的使用量
     *
     * @param ListResourceUsagesRequest 请求对象
     * @return CompletableFuture<ListResourceUsagesResponse>
     */
    public CompletableFuture<ListResourceUsagesResponse> listResourceUsagesAsync(ListResourceUsagesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listResourceUsages);
    }

    /**
     * 根据云服务类型查询资源列表
     * 功能描述：伙伴在伙伴销售平台根据云服务类型查询关联的资源类型编码和名称，用于查询按需产品的价格或包年/包月产品的价格。
     *
     * @param ListServiceResourcesRequest 请求对象
     * @return CompletableFuture<ListServiceResourcesResponse>
     */
    public CompletableFuture<ListServiceResourcesResponse> listServiceResourcesAsync(ListServiceResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listServiceResources);
    }

    /**
     * 查询云服务类型列表
     * 功能描述：伙伴在伙伴销售平台查询云服务类型的列表。
     *
     * @param ListServiceTypesRequest 请求对象
     * @return CompletableFuture<ListServiceTypesResponse>
     */
    public CompletableFuture<ListServiceTypesResponse> listServiceTypesAsync(ListServiceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listServiceTypes);
    }

    /**
     * 查询硬件库存
     * 功能描述：客户在购买硬件产品时，可以在客户自建平台上查询硬件产品的库存
     *
     * @param ListSkuInventoriesRequest 请求对象
     * @return CompletableFuture<ListSkuInventoriesResponse>
     */
    public CompletableFuture<ListSkuInventoriesResponse> listSkuInventoriesAsync(ListSkuInventoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSkuInventories);
    }

    /**
     * 查询优惠券列表
     * 功能描述：伙伴可以查询自身的优惠券信息。
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return CompletableFuture<ListSubCustomerCouponsResponse>
     */
    public CompletableFuture<ListSubCustomerCouponsResponse> listSubCustomerCouponsAsync(ListSubCustomerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomerCoupons);
    }

    /**
     * 查询伙伴折扣
     * 功能描述：合作伙伴可以查看为客户设置的折扣，每次查询一个客户。如果该客户没有设置折扣，返回null。精英服务商（二级经销商）也可以通过该接口查询子客户的折扣。
     *
     * @param ListSubCustomerDiscountsRequest 请求对象
     * @return CompletableFuture<ListSubCustomerDiscountsResponse>
     */
    public CompletableFuture<ListSubCustomerDiscountsResponse> listSubCustomerDiscountsAsync(ListSubCustomerDiscountsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomerDiscounts);
    }

    /**
     * 查询客户消费记录
     * 功能描述：合作伙伴可以查看客户的消费记录
     *
     * @param ListSubCustomerResFeeRecordsRequest 请求对象
     * @return CompletableFuture<ListSubCustomerResFeeRecordsResponse>
     */
    public CompletableFuture<ListSubCustomerResFeeRecordsResponse> listSubCustomerResFeeRecordsAsync(ListSubCustomerResFeeRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomerResFeeRecords);
    }

    /**
     * 查询客户列表
     * 功能描述：伙伴可以查询合作伙伴的客户信息列表。
     *
     * @param ListSubCustomersRequest 请求对象
     * @return CompletableFuture<ListSubCustomersResponse>
     */
    public CompletableFuture<ListSubCustomersResponse> listSubCustomersAsync(ListSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubCustomers);
    }

    /**
     * 查询客户月度消费账单
     * 功能描述：合作伙伴可查询客户的消费汇总账单，消费按月汇总
     *
     * @param ListSubcustomerMonthlyBillsRequest 请求对象
     * @return CompletableFuture<ListSubcustomerMonthlyBillsResponse>
     */
    public CompletableFuture<ListSubcustomerMonthlyBillsResponse> listSubcustomerMonthlyBillsAsync(ListSubcustomerMonthlyBillsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listSubcustomerMonthlyBills);
    }

    /**
     * 查询使用量类型列表
     * 功能描述：伙伴在伙伴销售平台查询资源的使用量类型列表。
     *
     * @param ListUsageTypesRequest 请求对象
     * @return CompletableFuture<ListUsageTypesResponse>
     */
    public CompletableFuture<ListUsageTypesResponse> listUsageTypesAsync(ListUsageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.listUsageTypes);
    }

    /**
     * 支付包年/包月产品订单
     * 功能描述：客户可以对待支付状态的包年/包月产品订单进行支付
     *
     * @param PayOrdersRequest 请求对象
     * @return CompletableFuture<PayOrdersResponse>
     */
    public CompletableFuture<PayOrdersResponse> payOrdersAsync(PayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.payOrders);
    }

    /**
     * 回收代金券额度
     * 功能描述：华为云伙伴能力中心（一级经销商）可以在伙伴中心回收已发放给精英服务商（二级经销商）的代金券额度。
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
     * 回收优惠券
     * 功能描述：对于合作伙伴已经下发给客户的优惠券，如遇发错或其他特殊情况，合作伙伴有回收的权利。优惠券回收后，客户将不再拥有该优惠券。
     *
     * @param ReclaimPartnerCouponsRequest 请求对象
     * @return CompletableFuture<ReclaimPartnerCouponsResponse>
     */
    public CompletableFuture<ReclaimPartnerCouponsResponse> reclaimPartnerCouponsAsync(ReclaimPartnerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimPartnerCoupons);
    }

    /**
     * 企业主账号从企业子账号回收拨款
     * 功能描述：企业主账号在客户自建平台回收给企业子账号的拨款
     *
     * @param ReclaimSubEnterpriseAmountRequest 请求对象
     * @return CompletableFuture<ReclaimSubEnterpriseAmountResponse>
     */
    public CompletableFuture<ReclaimSubEnterpriseAmountResponse> reclaimSubEnterpriseAmountAsync(ReclaimSubEnterpriseAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimSubEnterpriseAmount);
    }

    /**
     * 回收客户账户余额
     * 功能描述：当客户不再使用华为云产品时，合作伙伴可以回收垫付类客户账户余额。（支持一级回收二级的子客户余额）
     *
     * @param ReclaimToPartnerAccountRequest 请求对象
     * @return CompletableFuture<ReclaimToPartnerAccountResponse>
     */
    public CompletableFuture<ReclaimToPartnerAccountResponse> reclaimToPartnerAccountAsync(ReclaimToPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.reclaimToPartnerAccount);
    }

    /**
     * 续订包年/包月资源
     * 功能描述：客户的包年包/月资源即将到期时，可进行包年/包月资源的续订
     *
     * @param RenewalResourcesRequest 请求对象
     * @return CompletableFuture<RenewalResourcesResponse>
     */
    public CompletableFuture<RenewalResourcesResponse> renewalResourcesAsync(RenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.renewalResources);
    }

    /**
     * 发送短信验证码
     * 功能描述：企业主账号在客户自建平台发送短信验证码
     *
     * @param SendSmsVerificationCodeRequest 请求对象
     * @return CompletableFuture<SendSmsVerificationCodeResponse>
     */
    public CompletableFuture<SendSmsVerificationCodeResponse> sendSmsVerificationCodeAsync(SendSmsVerificationCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.sendSmsVerificationCode);
    }

    /**
     * 发送验证码
     * 功能描述：客户注册时，如果填写了手机号，可以向对应的手机发送注册验证码，校验信息的正确性。使用个人银行卡方式进行实名认证时，通过该接口向指定的手机发送验证码。
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return CompletableFuture<SendVerificationMessageCodeResponse>
     */
    public CompletableFuture<SendVerificationMessageCodeResponse> sendVerificationMessageCodeAsync(SendVerificationMessageCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.sendVerificationMessageCode);
    }

    /**
     * 查询账户余额
     * 功能描述：查询账户余额
     *
     * @param ShowCustomerAccountBalancesRequest 请求对象
     * @return CompletableFuture<ShowCustomerAccountBalancesResponse>
     */
    public CompletableFuture<ShowCustomerAccountBalancesResponse> showCustomerAccountBalancesAsync(ShowCustomerAccountBalancesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showCustomerAccountBalances);
    }

    /**
     * 查询汇总账单
     * 功能描述：客户在客户自建平台查询自身的消费汇总账单，此账单按月汇总消费数据。
     *
     * @param ShowCustomerMonthlySumRequest 请求对象
     * @return CompletableFuture<ShowCustomerMonthlySumResponse>
     */
    public CompletableFuture<ShowCustomerMonthlySumResponse> showCustomerMonthlySumAsync(ShowCustomerMonthlySumRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showCustomerMonthlySum);
    }

    /**
     * 查询订单详情
     * 功能描述：客户可以查看订单详情
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return CompletableFuture<ShowCustomerOrderDetailsResponse>
     */
    public CompletableFuture<ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsAsync(ShowCustomerOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showCustomerOrderDetails);
    }

    /**
     * 查询企业主账号可拨款余额
     * 功能描述：企业主账号在客户自建平台查询自己的可拨款余额
     *
     * @param ShowMultiAccountTransferAmountRequest 请求对象
     * @return CompletableFuture<ShowMultiAccountTransferAmountResponse>
     */
    public CompletableFuture<ShowMultiAccountTransferAmountResponse> showMultiAccountTransferAmountAsync(ShowMultiAccountTransferAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showMultiAccountTransferAmount);
    }

    /**
     * 查询实名认证审核结果
     * 功能描述：如果实名认证申请或实名认证变更申请的响应中，显示需要人工审核，使用该接口查询审核结果。
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return CompletableFuture<ShowRealnameAuthenticationReviewResultResponse>
     */
    public CompletableFuture<ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultAsync(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showRealnameAuthenticationReviewResult);
    }

    /**
     * 查询退款订单的金额详情
     * 功能描述：客户在伙伴销售平台查询某次退订订单或者降配订单的退款金额来自哪些资源和对应订单
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return CompletableFuture<ShowRefundOrderDetailsResponse>
     */
    public CompletableFuture<ShowRefundOrderDetailsResponse> showRefundOrderDetailsAsync(ShowRefundOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.showRefundOrderDetails);
    }

    /**
     * 向精英服务商发放代金券额度
     * 功能描述：华为云伙伴能力中心（一级经销商）可以在伙伴中心向精英服务商（二级经销商）发放代金券额度。
     *
     * @param UpdateCouponQuotasRequest 请求对象
     * @return CompletableFuture<UpdateCouponQuotasResponse>
     */
    public CompletableFuture<UpdateCouponQuotasResponse> updateCouponQuotasAsync(UpdateCouponQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateCouponQuotas);
    }

    /**
     * 向客户账户拨款
     * 功能描述：合作伙伴可以为垫付类客户账户拨款。
     *
     * @param UpdateCustomerAccountAmountRequest 请求对象
     * @return CompletableFuture<UpdateCustomerAccountAmountResponse>
     */
    public CompletableFuture<UpdateCustomerAccountAmountResponse> updateCustomerAccountAmountAsync(UpdateCustomerAccountAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateCustomerAccountAmount);
    }

    /**
     * 向精英服务商账户拨款
     * 功能描述：华为云伙伴能力中心（一级经销商）可以向精英服务商（二级经销商）账户拨款
     *
     * @param UpdateIndirectPartnerAccountRequest 请求对象
     * @return CompletableFuture<UpdateIndirectPartnerAccountResponse>
     */
    public CompletableFuture<UpdateIndirectPartnerAccountResponse> updateIndirectPartnerAccountAsync(UpdateIndirectPartnerAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateIndirectPartnerAccount);
    }

    /**
     * 设置或者取消包年/包月资源到期转按需
     * 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费。包年/包月计费模式到期后，按需的计费模式即生效
     *
     * @param UpdatePeriodToOnDemandRequest 请求对象
     * @return CompletableFuture<UpdatePeriodToOnDemandResponse>
     */
    public CompletableFuture<UpdatePeriodToOnDemandResponse> updatePeriodToOnDemandAsync(UpdatePeriodToOnDemandRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updatePeriodToOnDemand);
    }

    /**
     * 修改邮寄地址
     * 功能描述：客户可以修改自己的邮寄地址信息。
     *
     * @param UpdatePostalRequest 请求对象
     * @return CompletableFuture<UpdatePostalResponse>
     */
    public CompletableFuture<UpdatePostalResponse> updatePostalAsync(UpdatePostalRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updatePostal);
    }

    /**
     * 企业主账号向企业子账号拨款
     * 功能描述：企业主账号在客户自建平台向企业子账号拨款
     *
     * @param UpdateSubEnterpriseAmountRequest 请求对象
     * @return CompletableFuture<UpdateSubEnterpriseAmountResponse>
     */
    public CompletableFuture<UpdateSubEnterpriseAmountResponse> updateSubEnterpriseAmountAsync(UpdateSubEnterpriseAmountRequest request) {
        return hcClient.asyncInvokeHttp(request, BssMeta.updateSubEnterpriseAmount);
    }

}
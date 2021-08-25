package com.huaweicloud.sdk.bssintl.v2;

import com.huaweicloud.sdk.bssintl.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class BssintlClient {

    protected HcClient hcClient;

    public BssintlClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BssintlClient> newBuilder() {
        return new ClientBuilder<>(BssintlClient::new, "GlobalCredentials");
    }

    /** 设置包年/包月资源自动续费 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return AutoRenewalResourcesResponse */
    public AutoRenewalResourcesResponse autoRenewalResources(AutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.autoRenewalResources);
    }

    /** 设置包年/包月资源自动续费 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return SyncInvoker<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> */
    public SyncInvoker<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> autoRenewalResourcesInvoker(
        AutoRenewalResourcesRequest request) {
        return new SyncInvoker<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse>(request,
            BssintlMeta.autoRenewalResources, hcClient);
    }

    /** 取消包年/包月资源自动续费 功能描述：取消包年/包月资源自动续费
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return CancelAutoRenewalResourcesResponse */
    public CancelAutoRenewalResourcesResponse cancelAutoRenewalResources(CancelAutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.cancelAutoRenewalResources);
    }

    /** 取消包年/包月资源自动续费 功能描述：取消包年/包月资源自动续费
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return SyncInvoker<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> */
    public SyncInvoker<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> cancelAutoRenewalResourcesInvoker(
        CancelAutoRenewalResourcesRequest request) {
        return new SyncInvoker<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse>(request,
            BssintlMeta.cancelAutoRenewalResources, hcClient);
    }

    /** 取消待支付订单 功能描述：客户可以对待支付的订单进行取消操作
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return CancelCustomerOrderResponse */
    public CancelCustomerOrderResponse cancelCustomerOrder(CancelCustomerOrderRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.cancelCustomerOrder);
    }

    /** 取消待支付订单 功能描述：客户可以对待支付的订单进行取消操作
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return SyncInvoker<CancelCustomerOrderRequest, CancelCustomerOrderResponse> */
    public SyncInvoker<CancelCustomerOrderRequest, CancelCustomerOrderResponse> cancelCustomerOrderInvoker(
        CancelCustomerOrderRequest request) {
        return new SyncInvoker<CancelCustomerOrderRequest, CancelCustomerOrderResponse>(request,
            BssintlMeta.cancelCustomerOrder, hcClient);
    }

    /** 退订包年/包月资源 功能描述：客户购买包年/包月资源后，支持客户退订包年/包月实例。退订资源实例包括资源续费部分和当前正在使用的部分，退订后资源将无法使用
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return CancelResourcesSubscriptionResponse */
    public CancelResourcesSubscriptionResponse cancelResourcesSubscription(CancelResourcesSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.cancelResourcesSubscription);
    }

    /** 退订包年/包月资源 功能描述：客户购买包年/包月资源后，支持客户退订包年/包月实例。退订资源实例包括资源续费部分和当前正在使用的部分，退订后资源将无法使用
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return SyncInvoker<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> */
    public SyncInvoker<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> cancelResourcesSubscriptionInvoker(
        CancelResourcesSubscriptionRequest request) {
        return new SyncInvoker<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse>(request,
            BssintlMeta.cancelResourcesSubscription, hcClient);
    }

    /** 申请实名认证变更 功能描述：客户可以进行实名认证变更申请。
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return ChangeEnterpriseRealnameAuthenticationResponse */
    public ChangeEnterpriseRealnameAuthenticationResponse changeEnterpriseRealnameAuthentication(
        ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.changeEnterpriseRealnameAuthentication);
    }

    /** 申请实名认证变更 功能描述：客户可以进行实名认证变更申请。
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return SyncInvoker<ChangeEnterpriseRealnameAuthenticationRequest,
     *         ChangeEnterpriseRealnameAuthenticationResponse> */
    public SyncInvoker<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthenticationInvoker(
        ChangeEnterpriseRealnameAuthenticationRequest request) {
        return new SyncInvoker<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse>(
            request, BssintlMeta.changeEnterpriseRealnameAuthentication, hcClient);
    }

    /** 校验客户注册信息 功能描述：客户注册时可检查客户的登录名称、手机号或者邮箱是否可以用于注册。
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return CheckUserIdentityResponse */
    public CheckUserIdentityResponse checkUserIdentity(CheckUserIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.checkUserIdentity);
    }

    /** 校验客户注册信息 功能描述：客户注册时可检查客户的登录名称、手机号或者邮箱是否可以用于注册。
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return SyncInvoker<CheckUserIdentityRequest, CheckUserIdentityResponse> */
    public SyncInvoker<CheckUserIdentityRequest, CheckUserIdentityResponse> checkUserIdentityInvoker(
        CheckUserIdentityRequest request) {
        return new SyncInvoker<CheckUserIdentityRequest, CheckUserIdentityResponse>(request,
            BssintlMeta.checkUserIdentity, hcClient);
    }

    /** 申请企业实名认证 功能描述：企业客户可以进行企业实名认证申请。
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CreateEnterpriseRealnameAuthenticationResponse */
    public CreateEnterpriseRealnameAuthenticationResponse createEnterpriseRealnameAuthentication(
        CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.createEnterpriseRealnameAuthentication);
    }

    /** 申请企业实名认证 功能描述：企业客户可以进行企业实名认证申请。
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return SyncInvoker<CreateEnterpriseRealnameAuthenticationRequest,
     *         CreateEnterpriseRealnameAuthenticationResponse> */
    public SyncInvoker<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationInvoker(
        CreateEnterpriseRealnameAuthenticationRequest request) {
        return new SyncInvoker<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse>(
            request, BssintlMeta.createEnterpriseRealnameAuthentication, hcClient);
    }

    /** 申请个人实名认证 功能描述：个人客户可以进行个人实名认证申请。
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return CreatePersonalRealnameAuthResponse */
    public CreatePersonalRealnameAuthResponse createPersonalRealnameAuth(CreatePersonalRealnameAuthRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.createPersonalRealnameAuth);
    }

    /** 申请个人实名认证 功能描述：个人客户可以进行个人实名认证申请。
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return SyncInvoker<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> */
    public SyncInvoker<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthInvoker(
        CreatePersonalRealnameAuthRequest request) {
        return new SyncInvoker<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse>(request,
            BssintlMeta.createPersonalRealnameAuth, hcClient);
    }

    /** 创建客户
     * 功能描述：在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。华为云伙伴能力中心（一级经销商）可以注册精英服务商伙伴（二级经销商）的子客户。注册完成后，子客户可以自动和精英服务商伙伴绑定。
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return CreateSubCustomerResponse */
    public CreateSubCustomerResponse createSubCustomer(CreateSubCustomerRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.createSubCustomer);
    }

    /** 创建客户
     * 功能描述：在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。华为云伙伴能力中心（一级经销商）可以注册精英服务商伙伴（二级经销商）的子客户。注册完成后，子客户可以自动和精英服务商伙伴绑定。
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return SyncInvoker<CreateSubCustomerRequest, CreateSubCustomerResponse> */
    public SyncInvoker<CreateSubCustomerRequest, CreateSubCustomerResponse> createSubCustomerInvoker(
        CreateSubCustomerRequest request) {
        return new SyncInvoker<CreateSubCustomerRequest, CreateSubCustomerResponse>(request,
            BssintlMeta.createSubCustomer, hcClient);
    }

    /** 冻结伙伴子客户 功能描述：冻结伙伴子客户
     *
     * @param FreezeSubCustomersRequest 请求对象
     * @return FreezeSubCustomersResponse */
    public FreezeSubCustomersResponse freezeSubCustomers(FreezeSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.freezeSubCustomers);
    }

    /** 冻结伙伴子客户 功能描述：冻结伙伴子客户
     *
     * @param FreezeSubCustomersRequest 请求对象
     * @return SyncInvoker<FreezeSubCustomersRequest, FreezeSubCustomersResponse> */
    public SyncInvoker<FreezeSubCustomersRequest, FreezeSubCustomersResponse> freezeSubCustomersInvoker(
        FreezeSubCustomersRequest request) {
        return new SyncInvoker<FreezeSubCustomersRequest, FreezeSubCustomersResponse>(request,
            BssintlMeta.freezeSubCustomers, hcClient);
    }

    /** 查询使用量单位进制 功能描述：伙伴在伙伴销售平台上查询使用量单位的进制转换信息，用于不同度量单位之间的转换。
     *
     * @param ListConversionsRequest 请求对象
     * @return ListConversionsResponse */
    public ListConversionsResponse listConversions(ListConversionsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listConversions);
    }

    /** 查询使用量单位进制 功能描述：伙伴在伙伴销售平台上查询使用量单位的进制转换信息，用于不同度量单位之间的转换。
     *
     * @param ListConversionsRequest 请求对象
     * @return SyncInvoker<ListConversionsRequest, ListConversionsResponse> */
    public SyncInvoker<ListConversionsRequest, ListConversionsResponse> listConversionsInvoker(
        ListConversionsRequest request) {
        return new SyncInvoker<ListConversionsRequest, ListConversionsResponse>(request, BssintlMeta.listConversions,
            hcClient);
    }

    /** 查询成本数据 功能描述：按照企业项目查询某个客户的成本消耗
     *
     * @param ListCostsRequest 请求对象
     * @return ListCostsResponse */
    public ListCostsResponse listCosts(ListCostsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCosts);
    }

    /** 查询成本数据 功能描述：按照企业项目查询某个客户的成本消耗
     *
     * @param ListCostsRequest 请求对象
     * @return SyncInvoker<ListCostsRequest, ListCostsResponse> */
    public SyncInvoker<ListCostsRequest, ListCostsResponse> listCostsInvoker(ListCostsRequest request) {
        return new SyncInvoker<ListCostsRequest, ListCostsResponse>(request, BssintlMeta.listCosts, hcClient);
    }

    /** 查询客户按需资源列表 功能描述：客户在伙伴销售平台查询已开通的按需资源
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return ListCustomerOnDemandResourcesResponse */
    public ListCustomerOnDemandResourcesResponse listCustomerOnDemandResources(
        ListCustomerOnDemandResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerOnDemandResources);
    }

    /** 查询客户按需资源列表 功能描述：客户在伙伴销售平台查询已开通的按需资源
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return SyncInvoker<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> */
    public SyncInvoker<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesInvoker(
        ListCustomerOnDemandResourcesRequest request) {
        return new SyncInvoker<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse>(request,
            BssintlMeta.listCustomerOnDemandResources, hcClient);
    }

    /** 查询订单列表 功能描述：客户购买包年包月资源后，可以查看待审核、处理中、已取消、已完成和待支付等状态的订单
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return ListCustomerOrdersResponse */
    public ListCustomerOrdersResponse listCustomerOrders(ListCustomerOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerOrders);
    }

    /** 查询订单列表 功能描述：客户购买包年包月资源后，可以查看待审核、处理中、已取消、已完成和待支付等状态的订单
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return SyncInvoker<ListCustomerOrdersRequest, ListCustomerOrdersResponse> */
    public SyncInvoker<ListCustomerOrdersRequest, ListCustomerOrdersResponse> listCustomerOrdersInvoker(
        ListCustomerOrdersRequest request) {
        return new SyncInvoker<ListCustomerOrdersRequest, ListCustomerOrdersResponse>(request,
            BssintlMeta.listCustomerOrders, hcClient);
    }

    /** 查询资源详单 功能描述：客户在客户自建平台查询自己的资源详单，用于反映各类资源的消耗情况。
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return ListCustomerselfResourceRecordDetailsResponse */
    public ListCustomerselfResourceRecordDetailsResponse listCustomerselfResourceRecordDetails(
        ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecordDetails);
    }

    /** 查询资源详单 功能描述：客户在客户自建平台查询自己的资源详单，用于反映各类资源的消耗情况。
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return SyncInvoker<ListCustomerselfResourceRecordDetailsRequest,
     *         ListCustomerselfResourceRecordDetailsResponse> */
    public SyncInvoker<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsInvoker(
        ListCustomerselfResourceRecordDetailsRequest request) {
        return new SyncInvoker<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse>(
            request, BssintlMeta.listCustomerselfResourceRecordDetails, hcClient);
    }

    /** 查询资源消费记录 功能描述：客户在客户自建平台查询每个资源的消费明细数据
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return ListCustomerselfResourceRecordsResponse */
    public ListCustomerselfResourceRecordsResponse listCustomerselfResourceRecords(
        ListCustomerselfResourceRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecords);
    }

    /** 查询资源消费记录 功能描述：客户在客户自建平台查询每个资源的消费明细数据
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return SyncInvoker<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> */
    public SyncInvoker<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsInvoker(
        ListCustomerselfResourceRecordsRequest request) {
        return new SyncInvoker<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse>(request,
            BssintlMeta.listCustomerselfResourceRecords, hcClient);
    }

    /** 查询资源内使用量 功能描述：客户在自建平台查询客户自己的资源包列表
     *
     * @param ListFreeResourceUsagesRequest 请求对象
     * @return ListFreeResourceUsagesResponse */
    public ListFreeResourceUsagesResponse listFreeResourceUsages(ListFreeResourceUsagesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listFreeResourceUsages);
    }

    /** 查询资源内使用量 功能描述：客户在自建平台查询客户自己的资源包列表
     *
     * @param ListFreeResourceUsagesRequest 请求对象
     * @return SyncInvoker<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> */
    public SyncInvoker<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> listFreeResourceUsagesInvoker(
        ListFreeResourceUsagesRequest request) {
        return new SyncInvoker<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse>(request,
            BssintlMeta.listFreeResourceUsages, hcClient);
    }

    /** 查询资源包列表 功能描述：查询资源包列表
     *
     * @param ListFreeResourcesRequest 请求对象
     * @return ListFreeResourcesResponse */
    public ListFreeResourcesResponse listFreeResources(ListFreeResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listFreeResources);
    }

    /** 查询资源包列表 功能描述：查询资源包列表
     *
     * @param ListFreeResourcesRequest 请求对象
     * @return SyncInvoker<ListFreeResourcesRequest, ListFreeResourcesResponse> */
    public SyncInvoker<ListFreeResourcesRequest, ListFreeResourcesResponse> listFreeResourcesInvoker(
        ListFreeResourcesRequest request) {
        return new SyncInvoker<ListFreeResourcesRequest, ListFreeResourcesResponse>(request,
            BssintlMeta.listFreeResources, hcClient);
    }

    /** 查询使用量单位列表 功能描述：伙伴在伙伴销售平台上查询资源使用量的度量单位及名称，度量单位类型等。
     *
     * @param ListMeasureUnitsRequest 请求对象
     * @return ListMeasureUnitsResponse */
    public ListMeasureUnitsResponse listMeasureUnits(ListMeasureUnitsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listMeasureUnits);
    }

    /** 查询使用量单位列表 功能描述：伙伴在伙伴销售平台上查询资源使用量的度量单位及名称，度量单位类型等。
     *
     * @param ListMeasureUnitsRequest 请求对象
     * @return SyncInvoker<ListMeasureUnitsRequest, ListMeasureUnitsResponse> */
    public SyncInvoker<ListMeasureUnitsRequest, ListMeasureUnitsResponse> listMeasureUnitsInvoker(
        ListMeasureUnitsRequest request) {
        return new SyncInvoker<ListMeasureUnitsRequest, ListMeasureUnitsResponse>(request, BssintlMeta.listMeasureUnits,
            hcClient);
    }

    /** 查询按需产品价格 功能描述：按需资源询价
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return ListOnDemandResourceRatingsResponse */
    public ListOnDemandResourceRatingsResponse listOnDemandResourceRatings(ListOnDemandResourceRatingsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listOnDemandResourceRatings);
    }

    /** 查询按需产品价格 功能描述：按需资源询价
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return SyncInvoker<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> */
    public SyncInvoker<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> listOnDemandResourceRatingsInvoker(
        ListOnDemandResourceRatingsRequest request) {
        return new SyncInvoker<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse>(request,
            BssintlMeta.listOnDemandResourceRatings, hcClient);
    }

    /** 查询订单可用优惠券 功能描述：客户在客户自建平台查看订单可用的优惠券列表
     *
     * @param ListOrderCouponsByOrderIdRequest 请求对象
     * @return ListOrderCouponsByOrderIdResponse */
    public ListOrderCouponsByOrderIdResponse listOrderCouponsByOrderId(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listOrderCouponsByOrderId);
    }

    /** 查询订单可用优惠券 功能描述：客户在客户自建平台查看订单可用的优惠券列表
     *
     * @param ListOrderCouponsByOrderIdRequest 请求对象
     * @return SyncInvoker<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse> */
    public SyncInvoker<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse> listOrderCouponsByOrderIdInvoker(
        ListOrderCouponsByOrderIdRequest request) {
        return new SyncInvoker<ListOrderCouponsByOrderIdRequest, ListOrderCouponsByOrderIdResponse>(request,
            BssintlMeta.listOrderCouponsByOrderId, hcClient);
    }

    /** 查询订单可用折扣 功能描述：功能介绍客户在伙伴销售平台支付待支付订单时，查询可使用的折扣。只返回商务合同折扣和伙伴授权折扣客户在客户自建平台查看订单可用的优惠券列表。
     *
     * @param ListOrderDiscountsRequest 请求对象
     * @return ListOrderDiscountsResponse */
    public ListOrderDiscountsResponse listOrderDiscounts(ListOrderDiscountsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listOrderDiscounts);
    }

    /** 查询订单可用折扣 功能描述：功能介绍客户在伙伴销售平台支付待支付订单时，查询可使用的折扣。只返回商务合同折扣和伙伴授权折扣客户在客户自建平台查看订单可用的优惠券列表。
     *
     * @param ListOrderDiscountsRequest 请求对象
     * @return SyncInvoker<ListOrderDiscountsRequest, ListOrderDiscountsResponse> */
    public SyncInvoker<ListOrderDiscountsRequest, ListOrderDiscountsResponse> listOrderDiscountsInvoker(
        ListOrderDiscountsRequest request) {
        return new SyncInvoker<ListOrderDiscountsRequest, ListOrderDiscountsResponse>(request,
            BssintlMeta.listOrderDiscounts, hcClient);
    }

    /** 查询客户包年/包月资源列表 功能描述：客户在客户自建平台查询某个或所有的包年/包月资源
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return ListPayPerUseCustomerResourcesResponse */
    public ListPayPerUseCustomerResourcesResponse listPayPerUseCustomerResources(
        ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listPayPerUseCustomerResources);
    }

    /** 查询客户包年/包月资源列表 功能描述：客户在客户自建平台查询某个或所有的包年/包月资源
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return SyncInvoker<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> */
    public SyncInvoker<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesInvoker(
        ListPayPerUseCustomerResourcesRequest request) {
        return new SyncInvoker<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse>(request,
            BssintlMeta.listPayPerUseCustomerResources, hcClient);
    }

    /** 查询伙伴月度消费账单 功能描述：伙伴可以查询伙伴月度消费账单
     *
     * @param ListPostpaidBillSumRequest 请求对象
     * @return ListPostpaidBillSumResponse */
    public ListPostpaidBillSumResponse listPostpaidBillSum(ListPostpaidBillSumRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listPostpaidBillSum);
    }

    /** 查询伙伴月度消费账单 功能描述：伙伴可以查询伙伴月度消费账单
     *
     * @param ListPostpaidBillSumRequest 请求对象
     * @return SyncInvoker<ListPostpaidBillSumRequest, ListPostpaidBillSumResponse> */
    public SyncInvoker<ListPostpaidBillSumRequest, ListPostpaidBillSumResponse> listPostpaidBillSumInvoker(
        ListPostpaidBillSumRequest request) {
        return new SyncInvoker<ListPostpaidBillSumRequest, ListPostpaidBillSumResponse>(request,
            BssintlMeta.listPostpaidBillSum, hcClient);
    }

    /** 查询包年/包月产品价格 功能描述：客户在自建平台按照条件查询包年/包月产品开通时候的价格
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return ListRateOnPeriodDetailResponse */
    public ListRateOnPeriodDetailResponse listRateOnPeriodDetail(ListRateOnPeriodDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listRateOnPeriodDetail);
    }

    /** 查询包年/包月产品价格 功能描述：客户在自建平台按照条件查询包年/包月产品开通时候的价格
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return SyncInvoker<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> */
    public SyncInvoker<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> listRateOnPeriodDetailInvoker(
        ListRateOnPeriodDetailRequest request) {
        return new SyncInvoker<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse>(request,
            BssintlMeta.listRateOnPeriodDetail, hcClient);
    }

    /** 查询资源类型列表 功能描述：客户在客户自建平台查询资源类型的列表。
     *
     * @param ListResourceTypesRequest 请求对象
     * @return ListResourceTypesResponse */
    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listResourceTypes);
    }

    /** 查询资源类型列表 功能描述：客户在客户自建平台查询资源类型的列表。
     *
     * @param ListResourceTypesRequest 请求对象
     * @return SyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse> */
    public SyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse> listResourceTypesInvoker(
        ListResourceTypesRequest request) {
        return new SyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse>(request,
            BssintlMeta.listResourceTypes, hcClient);
    }

    /** 查询套餐内使用量 功能描述：客户在客户自建平台查询套餐内的使用量
     *
     * @param ListResourceUsagesRequest 请求对象
     * @return ListResourceUsagesResponse */
    public ListResourceUsagesResponse listResourceUsages(ListResourceUsagesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listResourceUsages);
    }

    /** 查询套餐内使用量 功能描述：客户在客户自建平台查询套餐内的使用量
     *
     * @param ListResourceUsagesRequest 请求对象
     * @return SyncInvoker<ListResourceUsagesRequest, ListResourceUsagesResponse> */
    public SyncInvoker<ListResourceUsagesRequest, ListResourceUsagesResponse> listResourceUsagesInvoker(
        ListResourceUsagesRequest request) {
        return new SyncInvoker<ListResourceUsagesRequest, ListResourceUsagesResponse>(request,
            BssintlMeta.listResourceUsages, hcClient);
    }

    /** 根据云服务类型查询资源列表 功能描述：伙伴在伙伴销售平台根据云服务类型查询关联的资源类型编码和名称，用于查询按需产品的价格或包年/包月产品的价格。
     *
     * @param ListServiceResourcesRequest 请求对象
     * @return ListServiceResourcesResponse */
    public ListServiceResourcesResponse listServiceResources(ListServiceResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listServiceResources);
    }

    /** 根据云服务类型查询资源列表 功能描述：伙伴在伙伴销售平台根据云服务类型查询关联的资源类型编码和名称，用于查询按需产品的价格或包年/包月产品的价格。
     *
     * @param ListServiceResourcesRequest 请求对象
     * @return SyncInvoker<ListServiceResourcesRequest, ListServiceResourcesResponse> */
    public SyncInvoker<ListServiceResourcesRequest, ListServiceResourcesResponse> listServiceResourcesInvoker(
        ListServiceResourcesRequest request) {
        return new SyncInvoker<ListServiceResourcesRequest, ListServiceResourcesResponse>(request,
            BssintlMeta.listServiceResources, hcClient);
    }

    /** 查询云服务类型列表 功能描述：伙伴在伙伴销售平台查询云服务类型的列表。
     *
     * @param ListServiceTypesRequest 请求对象
     * @return ListServiceTypesResponse */
    public ListServiceTypesResponse listServiceTypes(ListServiceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listServiceTypes);
    }

    /** 查询云服务类型列表 功能描述：伙伴在伙伴销售平台查询云服务类型的列表。
     *
     * @param ListServiceTypesRequest 请求对象
     * @return SyncInvoker<ListServiceTypesRequest, ListServiceTypesResponse> */
    public SyncInvoker<ListServiceTypesRequest, ListServiceTypesResponse> listServiceTypesInvoker(
        ListServiceTypesRequest request) {
        return new SyncInvoker<ListServiceTypesRequest, ListServiceTypesResponse>(request, BssintlMeta.listServiceTypes,
            hcClient);
    }

    /** 查询优惠券列表 功能描述：伙伴可以查询自身的优惠券信息。
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return ListSubCustomerCouponsResponse */
    public ListSubCustomerCouponsResponse listSubCustomerCoupons(ListSubCustomerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listSubCustomerCoupons);
    }

    /** 查询优惠券列表 功能描述：伙伴可以查询自身的优惠券信息。
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return SyncInvoker<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> */
    public SyncInvoker<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> listSubCustomerCouponsInvoker(
        ListSubCustomerCouponsRequest request) {
        return new SyncInvoker<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse>(request,
            BssintlMeta.listSubCustomerCoupons, hcClient);
    }

    /** 查询客户列表 功能描述：伙伴可以查询合作伙伴的客户信息列表。
     *
     * @param ListSubCustomersRequest 请求对象
     * @return ListSubCustomersResponse */
    public ListSubCustomersResponse listSubCustomers(ListSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listSubCustomers);
    }

    /** 查询客户列表 功能描述：伙伴可以查询合作伙伴的客户信息列表。
     *
     * @param ListSubCustomersRequest 请求对象
     * @return SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse> */
    public SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomersInvoker(
        ListSubCustomersRequest request) {
        return new SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse>(request, BssintlMeta.listSubCustomers,
            hcClient);
    }

    /** 查询使用量类型列表 功能描述：伙伴在伙伴销售平台查询资源的使用量类型列表。
     *
     * @param ListUsageTypesRequest 请求对象
     * @return ListUsageTypesResponse */
    public ListUsageTypesResponse listUsageTypes(ListUsageTypesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listUsageTypes);
    }

    /** 查询使用量类型列表 功能描述：伙伴在伙伴销售平台查询资源的使用量类型列表。
     *
     * @param ListUsageTypesRequest 请求对象
     * @return SyncInvoker<ListUsageTypesRequest, ListUsageTypesResponse> */
    public SyncInvoker<ListUsageTypesRequest, ListUsageTypesResponse> listUsageTypesInvoker(
        ListUsageTypesRequest request) {
        return new SyncInvoker<ListUsageTypesRequest, ListUsageTypesResponse>(request, BssintlMeta.listUsageTypes,
            hcClient);
    }

    /** 支付包年/包月产品订单 功能描述：客户可以对待支付状态的包年/包月产品订单进行支付
     *
     * @param PayOrdersRequest 请求对象
     * @return PayOrdersResponse */
    public PayOrdersResponse payOrders(PayOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.payOrders);
    }

    /** 支付包年/包月产品订单 功能描述：客户可以对待支付状态的包年/包月产品订单进行支付
     *
     * @param PayOrdersRequest 请求对象
     * @return SyncInvoker<PayOrdersRequest, PayOrdersResponse> */
    public SyncInvoker<PayOrdersRequest, PayOrdersResponse> payOrdersInvoker(PayOrdersRequest request) {
        return new SyncInvoker<PayOrdersRequest, PayOrdersResponse>(request, BssintlMeta.payOrders, hcClient);
    }

    /** 续订包年/包月资源 功能描述：客户的包年包/月资源即将到期时，可进行包年/包月资源的续订
     *
     * @param RenewalResourcesRequest 请求对象
     * @return RenewalResourcesResponse */
    public RenewalResourcesResponse renewalResources(RenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.renewalResources);
    }

    /** 续订包年/包月资源 功能描述：客户的包年包/月资源即将到期时，可进行包年/包月资源的续订
     *
     * @param RenewalResourcesRequest 请求对象
     * @return SyncInvoker<RenewalResourcesRequest, RenewalResourcesResponse> */
    public SyncInvoker<RenewalResourcesRequest, RenewalResourcesResponse> renewalResourcesInvoker(
        RenewalResourcesRequest request) {
        return new SyncInvoker<RenewalResourcesRequest, RenewalResourcesResponse>(request, BssintlMeta.renewalResources,
            hcClient);
    }

    /** 发送验证码 功能描述：客户注册时，如果填写了手机号，可以向对应的手机发送注册验证码，校验信息的正确性。使用个人银行卡方式进行实名认证时，通过该接口向指定的手机发送验证码。
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return SendVerificationMessageCodeResponse */
    public SendVerificationMessageCodeResponse sendVerificationMessageCode(SendVerificationMessageCodeRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.sendVerificationMessageCode);
    }

    /** 发送验证码 功能描述：客户注册时，如果填写了手机号，可以向对应的手机发送注册验证码，校验信息的正确性。使用个人银行卡方式进行实名认证时，通过该接口向指定的手机发送验证码。
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return SyncInvoker<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> */
    public SyncInvoker<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> sendVerificationMessageCodeInvoker(
        SendVerificationMessageCodeRequest request) {
        return new SyncInvoker<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse>(request,
            BssintlMeta.sendVerificationMessageCode, hcClient);
    }

    /** 查询账户余额 功能描述：查询账户余额
     *
     * @param ShowCustomerAccountBalancesRequest 请求对象
     * @return ShowCustomerAccountBalancesResponse */
    public ShowCustomerAccountBalancesResponse showCustomerAccountBalances(ShowCustomerAccountBalancesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showCustomerAccountBalances);
    }

    /** 查询账户余额 功能描述：查询账户余额
     *
     * @param ShowCustomerAccountBalancesRequest 请求对象
     * @return SyncInvoker<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> */
    public SyncInvoker<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> showCustomerAccountBalancesInvoker(
        ShowCustomerAccountBalancesRequest request) {
        return new SyncInvoker<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse>(request,
            BssintlMeta.showCustomerAccountBalances, hcClient);
    }

    /** 查询汇总账单 功能描述：客户在客户自建平台查询自身的消费汇总账单，此账单按月汇总消费数据。
     *
     * @param ShowCustomerMonthlySumRequest 请求对象
     * @return ShowCustomerMonthlySumResponse */
    public ShowCustomerMonthlySumResponse showCustomerMonthlySum(ShowCustomerMonthlySumRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showCustomerMonthlySum);
    }

    /** 查询汇总账单 功能描述：客户在客户自建平台查询自身的消费汇总账单，此账单按月汇总消费数据。
     *
     * @param ShowCustomerMonthlySumRequest 请求对象
     * @return SyncInvoker<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse> */
    public SyncInvoker<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse> showCustomerMonthlySumInvoker(
        ShowCustomerMonthlySumRequest request) {
        return new SyncInvoker<ShowCustomerMonthlySumRequest, ShowCustomerMonthlySumResponse>(request,
            BssintlMeta.showCustomerMonthlySum, hcClient);
    }

    /** 查询订单详情 功能描述：客户可以查看订单详情
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return ShowCustomerOrderDetailsResponse */
    public ShowCustomerOrderDetailsResponse showCustomerOrderDetails(ShowCustomerOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showCustomerOrderDetails);
    }

    /** 查询订单详情 功能描述：客户可以查看订单详情
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return SyncInvoker<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> */
    public SyncInvoker<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsInvoker(
        ShowCustomerOrderDetailsRequest request) {
        return new SyncInvoker<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse>(request,
            BssintlMeta.showCustomerOrderDetails, hcClient);
    }

    /** 查询实名认证审核结果 功能描述：如果实名认证申请或实名认证变更申请的响应中，显示需要人工审核，使用该接口查询审核结果。
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return ShowRealnameAuthenticationReviewResultResponse */
    public ShowRealnameAuthenticationReviewResultResponse showRealnameAuthenticationReviewResult(
        ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showRealnameAuthenticationReviewResult);
    }

    /** 查询实名认证审核结果 功能描述：如果实名认证申请或实名认证变更申请的响应中，显示需要人工审核，使用该接口查询审核结果。
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return SyncInvoker<ShowRealnameAuthenticationReviewResultRequest,
     *         ShowRealnameAuthenticationReviewResultResponse> */
    public SyncInvoker<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultInvoker(
        ShowRealnameAuthenticationReviewResultRequest request) {
        return new SyncInvoker<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse>(
            request, BssintlMeta.showRealnameAuthenticationReviewResult, hcClient);
    }

    /** 查询退款订单的金额详情 功能描述：客户在伙伴销售平台查询某次退订订单或者降配订单的退款金额来自哪些资源和对应订单
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return ShowRefundOrderDetailsResponse */
    public ShowRefundOrderDetailsResponse showRefundOrderDetails(ShowRefundOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showRefundOrderDetails);
    }

    /** 查询退款订单的金额详情 功能描述：客户在伙伴销售平台查询某次退订订单或者降配订单的退款金额来自哪些资源和对应订单
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return SyncInvoker<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> */
    public SyncInvoker<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> showRefundOrderDetailsInvoker(
        ShowRefundOrderDetailsRequest request) {
        return new SyncInvoker<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse>(request,
            BssintlMeta.showRefundOrderDetails, hcClient);
    }

    /** 查询客户预算 功能描述：查询客户预算
     *
     * @param ShowSubCustomerBudgetRequest 请求对象
     * @return ShowSubCustomerBudgetResponse */
    public ShowSubCustomerBudgetResponse showSubCustomerBudget(ShowSubCustomerBudgetRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showSubCustomerBudget);
    }

    /** 查询客户预算 功能描述：查询客户预算
     *
     * @param ShowSubCustomerBudgetRequest 请求对象
     * @return SyncInvoker<ShowSubCustomerBudgetRequest, ShowSubCustomerBudgetResponse> */
    public SyncInvoker<ShowSubCustomerBudgetRequest, ShowSubCustomerBudgetResponse> showSubCustomerBudgetInvoker(
        ShowSubCustomerBudgetRequest request) {
        return new SyncInvoker<ShowSubCustomerBudgetRequest, ShowSubCustomerBudgetResponse>(request,
            BssintlMeta.showSubCustomerBudget, hcClient);
    }

    /** 解冻伙伴子客户 功能描述：解冻伙伴子客户
     *
     * @param UnfreezeSubCustomersRequest 请求对象
     * @return UnfreezeSubCustomersResponse */
    public UnfreezeSubCustomersResponse unfreezeSubCustomers(UnfreezeSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.unfreezeSubCustomers);
    }

    /** 解冻伙伴子客户 功能描述：解冻伙伴子客户
     *
     * @param UnfreezeSubCustomersRequest 请求对象
     * @return SyncInvoker<UnfreezeSubCustomersRequest, UnfreezeSubCustomersResponse> */
    public SyncInvoker<UnfreezeSubCustomersRequest, UnfreezeSubCustomersResponse> unfreezeSubCustomersInvoker(
        UnfreezeSubCustomersRequest request) {
        return new SyncInvoker<UnfreezeSubCustomersRequest, UnfreezeSubCustomersResponse>(request,
            BssintlMeta.unfreezeSubCustomers, hcClient);
    }

    /** 设置或者取消包年/包月资源到期转按需 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费。包年/包月计费模式到期后，按需的计费模式即生效
     *
     * @param UpdatePeriodToOnDemandRequest 请求对象
     * @return UpdatePeriodToOnDemandResponse */
    public UpdatePeriodToOnDemandResponse updatePeriodToOnDemand(UpdatePeriodToOnDemandRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.updatePeriodToOnDemand);
    }

    /** 设置或者取消包年/包月资源到期转按需 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费。包年/包月计费模式到期后，按需的计费模式即生效
     *
     * @param UpdatePeriodToOnDemandRequest 请求对象
     * @return SyncInvoker<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> */
    public SyncInvoker<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> updatePeriodToOnDemandInvoker(
        UpdatePeriodToOnDemandRequest request) {
        return new SyncInvoker<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse>(request,
            BssintlMeta.updatePeriodToOnDemand, hcClient);
    }

    /** 设置客户预算 功能描述：设置客户预算
     *
     * @param UpdateSubCustomerBudgetRequest 请求对象
     * @return UpdateSubCustomerBudgetResponse */
    public UpdateSubCustomerBudgetResponse updateSubCustomerBudget(UpdateSubCustomerBudgetRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.updateSubCustomerBudget);
    }

    /** 设置客户预算 功能描述：设置客户预算
     *
     * @param UpdateSubCustomerBudgetRequest 请求对象
     * @return SyncInvoker<UpdateSubCustomerBudgetRequest, UpdateSubCustomerBudgetResponse> */
    public SyncInvoker<UpdateSubCustomerBudgetRequest, UpdateSubCustomerBudgetResponse> updateSubCustomerBudgetInvoker(
        UpdateSubCustomerBudgetRequest request) {
        return new SyncInvoker<UpdateSubCustomerBudgetRequest, UpdateSubCustomerBudgetResponse>(request,
            BssintlMeta.updateSubCustomerBudget, hcClient);
    }

}

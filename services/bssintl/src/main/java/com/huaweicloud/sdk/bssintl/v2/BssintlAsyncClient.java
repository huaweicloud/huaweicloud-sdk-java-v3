package com.huaweicloud.sdk.bssintl.v2;

import com.huaweicloud.sdk.bssintl.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class BssintlAsyncClient {

    protected HcClient hcClient;

    public BssintlAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BssintlAsyncClient> newBuilder() {
        return new ClientBuilder<>(BssintlAsyncClient::new, "GlobalCredentials");
    }

    /**
     * 设置包年/包月资源自动续费
     *
     * 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return CompletableFuture<AutoRenewalResourcesResponse>
     */
    public CompletableFuture<AutoRenewalResourcesResponse> autoRenewalResourcesAsync(
        AutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.autoRenewalResources);
    }

    /**
     * 设置包年/包月资源自动续费
     *
     * 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return AsyncInvoker<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse>
     */
    public AsyncInvoker<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse> autoRenewalResourcesAsyncInvoker(
        AutoRenewalResourcesRequest request) {
        return new AsyncInvoker<AutoRenewalResourcesRequest, AutoRenewalResourcesResponse>(request,
            BssintlMeta.autoRenewalResources, hcClient);
    }

    /**
     * 取消包年/包月资源自动续费
     *
     * 功能描述：取消包年/包月资源自动续费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return CompletableFuture<CancelAutoRenewalResourcesResponse>
     */
    public CompletableFuture<CancelAutoRenewalResourcesResponse> cancelAutoRenewalResourcesAsync(
        CancelAutoRenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.cancelAutoRenewalResources);
    }

    /**
     * 取消包年/包月资源自动续费
     *
     * 功能描述：取消包年/包月资源自动续费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return AsyncInvoker<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse>
     */
    public AsyncInvoker<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse> cancelAutoRenewalResourcesAsyncInvoker(
        CancelAutoRenewalResourcesRequest request) {
        return new AsyncInvoker<CancelAutoRenewalResourcesRequest, CancelAutoRenewalResourcesResponse>(request,
            BssintlMeta.cancelAutoRenewalResources, hcClient);
    }

    /**
     * 取消待支付订单
     *
     * 功能描述：客户可以对待支付的订单进行取消操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return CompletableFuture<CancelCustomerOrderResponse>
     */
    public CompletableFuture<CancelCustomerOrderResponse> cancelCustomerOrderAsync(CancelCustomerOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.cancelCustomerOrder);
    }

    /**
     * 取消待支付订单
     *
     * 功能描述：客户可以对待支付的订单进行取消操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return AsyncInvoker<CancelCustomerOrderRequest, CancelCustomerOrderResponse>
     */
    public AsyncInvoker<CancelCustomerOrderRequest, CancelCustomerOrderResponse> cancelCustomerOrderAsyncInvoker(
        CancelCustomerOrderRequest request) {
        return new AsyncInvoker<CancelCustomerOrderRequest, CancelCustomerOrderResponse>(request,
            BssintlMeta.cancelCustomerOrder, hcClient);
    }

    /**
     * 退订包年/包月资源
     *
     * 功能描述：客户购买包年/包月资源后，支持客户退订包年/包月实例。退订资源实例包括资源续费部分和当前正在使用的部分，退订后资源将无法使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return CompletableFuture<CancelResourcesSubscriptionResponse>
     */
    public CompletableFuture<CancelResourcesSubscriptionResponse> cancelResourcesSubscriptionAsync(
        CancelResourcesSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.cancelResourcesSubscription);
    }

    /**
     * 退订包年/包月资源
     *
     * 功能描述：客户购买包年/包月资源后，支持客户退订包年/包月实例。退订资源实例包括资源续费部分和当前正在使用的部分，退订后资源将无法使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return AsyncInvoker<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse>
     */
    public AsyncInvoker<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse> cancelResourcesSubscriptionAsyncInvoker(
        CancelResourcesSubscriptionRequest request) {
        return new AsyncInvoker<CancelResourcesSubscriptionRequest, CancelResourcesSubscriptionResponse>(request,
            BssintlMeta.cancelResourcesSubscription, hcClient);
    }

    /**
     * 申请实名认证变更
     *
     * 功能描述：客户可以进行实名认证变更申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse>
     */
    public CompletableFuture<ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthenticationAsync(
        ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.changeEnterpriseRealnameAuthentication);
    }

    /**
     * 申请实名认证变更
     *
     * 功能描述：客户可以进行实名认证变更申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return AsyncInvoker<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse>
     */
    public AsyncInvoker<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse> changeEnterpriseRealnameAuthenticationAsyncInvoker(
        ChangeEnterpriseRealnameAuthenticationRequest request) {
        return new AsyncInvoker<ChangeEnterpriseRealnameAuthenticationRequest, ChangeEnterpriseRealnameAuthenticationResponse>(
            request, BssintlMeta.changeEnterpriseRealnameAuthentication, hcClient);
    }

    /**
     * 校验客户注册信息
     *
     * 功能描述：客户注册时可检查客户的登录名称、手机号或者邮箱是否可以用于注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return CompletableFuture<CheckUserIdentityResponse>
     */
    public CompletableFuture<CheckUserIdentityResponse> checkUserIdentityAsync(CheckUserIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.checkUserIdentity);
    }

    /**
     * 校验客户注册信息
     *
     * 功能描述：客户注册时可检查客户的登录名称、手机号或者邮箱是否可以用于注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return AsyncInvoker<CheckUserIdentityRequest, CheckUserIdentityResponse>
     */
    public AsyncInvoker<CheckUserIdentityRequest, CheckUserIdentityResponse> checkUserIdentityAsyncInvoker(
        CheckUserIdentityRequest request) {
        return new AsyncInvoker<CheckUserIdentityRequest, CheckUserIdentityResponse>(request,
            BssintlMeta.checkUserIdentity, hcClient);
    }

    /**
     * 申请企业实名认证
     *
     * 功能描述：企业客户可以进行企业实名认证申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse>
     */
    public CompletableFuture<CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationAsync(
        CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.createEnterpriseRealnameAuthentication);
    }

    /**
     * 申请企业实名认证
     *
     * 功能描述：企业客户可以进行企业实名认证申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return AsyncInvoker<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse>
     */
    public AsyncInvoker<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse> createEnterpriseRealnameAuthenticationAsyncInvoker(
        CreateEnterpriseRealnameAuthenticationRequest request) {
        return new AsyncInvoker<CreateEnterpriseRealnameAuthenticationRequest, CreateEnterpriseRealnameAuthenticationResponse>(
            request, BssintlMeta.createEnterpriseRealnameAuthentication, hcClient);
    }

    /**
     * 申请个人实名认证
     *
     * 功能描述：个人客户可以进行个人实名认证申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return CompletableFuture<CreatePersonalRealnameAuthResponse>
     */
    public CompletableFuture<CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthAsync(
        CreatePersonalRealnameAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.createPersonalRealnameAuth);
    }

    /**
     * 申请个人实名认证
     *
     * 功能描述：个人客户可以进行个人实名认证申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return AsyncInvoker<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse>
     */
    public AsyncInvoker<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse> createPersonalRealnameAuthAsyncInvoker(
        CreatePersonalRealnameAuthRequest request) {
        return new AsyncInvoker<CreatePersonalRealnameAuthRequest, CreatePersonalRealnameAuthResponse>(request,
            BssintlMeta.createPersonalRealnameAuth, hcClient);
    }

    /**
     * 创建客户
     *
     * 功能描述：在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。华为云伙伴能力中心（一级经销商）可以注册精英服务商伙伴（二级经销商）的子客户。注册完成后，子客户可以自动和精英服务商伙伴绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return CompletableFuture<CreateSubCustomerResponse>
     */
    public CompletableFuture<CreateSubCustomerResponse> createSubCustomerAsync(CreateSubCustomerRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.createSubCustomer);
    }

    /**
     * 创建客户
     *
     * 功能描述：在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。华为云伙伴能力中心（一级经销商）可以注册精英服务商伙伴（二级经销商）的子客户。注册完成后，子客户可以自动和精英服务商伙伴绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return AsyncInvoker<CreateSubCustomerRequest, CreateSubCustomerResponse>
     */
    public AsyncInvoker<CreateSubCustomerRequest, CreateSubCustomerResponse> createSubCustomerAsyncInvoker(
        CreateSubCustomerRequest request) {
        return new AsyncInvoker<CreateSubCustomerRequest, CreateSubCustomerResponse>(request,
            BssintlMeta.createSubCustomer, hcClient);
    }

    /**
     * 冻结客户账号
     *
     * 功能描述：冻结伙伴子客户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezeSubCustomersRequest 请求对象
     * @return CompletableFuture<FreezeSubCustomersResponse>
     */
    public CompletableFuture<FreezeSubCustomersResponse> freezeSubCustomersAsync(FreezeSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.freezeSubCustomers);
    }

    /**
     * 冻结客户账号
     *
     * 功能描述：冻结伙伴子客户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezeSubCustomersRequest 请求对象
     * @return AsyncInvoker<FreezeSubCustomersRequest, FreezeSubCustomersResponse>
     */
    public AsyncInvoker<FreezeSubCustomersRequest, FreezeSubCustomersResponse> freezeSubCustomersAsyncInvoker(
        FreezeSubCustomersRequest request) {
        return new AsyncInvoker<FreezeSubCustomersRequest, FreezeSubCustomersResponse>(request,
            BssintlMeta.freezeSubCustomers, hcClient);
    }

    /**
     * 查询使用量单位进制
     *
     * 功能描述：伙伴在伙伴销售平台上查询使用量单位的进制转换信息，用于不同度量单位之间的转换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConversionsRequest 请求对象
     * @return CompletableFuture<ListConversionsResponse>
     */
    public CompletableFuture<ListConversionsResponse> listConversionsAsync(ListConversionsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listConversions);
    }

    /**
     * 查询使用量单位进制
     *
     * 功能描述：伙伴在伙伴销售平台上查询使用量单位的进制转换信息，用于不同度量单位之间的转换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConversionsRequest 请求对象
     * @return AsyncInvoker<ListConversionsRequest, ListConversionsResponse>
     */
    public AsyncInvoker<ListConversionsRequest, ListConversionsResponse> listConversionsAsyncInvoker(
        ListConversionsRequest request) {
        return new AsyncInvoker<ListConversionsRequest, ListConversionsResponse>(request, BssintlMeta.listConversions,
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
     * @return CompletableFuture<ListCostsResponse>
     */
    public CompletableFuture<ListCostsResponse> listCostsAsync(ListCostsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listCosts);
    }

    /**
     * 查询成本数据
     *
     * 客户在自建平台查询成本分析数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCostsRequest 请求对象
     * @return AsyncInvoker<ListCostsRequest, ListCostsResponse>
     */
    public AsyncInvoker<ListCostsRequest, ListCostsResponse> listCostsAsyncInvoker(ListCostsRequest request) {
        return new AsyncInvoker<ListCostsRequest, ListCostsResponse>(request, BssintlMeta.listCosts, hcClient);
    }

    /**
     * 查询客户按需资源列表
     *
     * 功能描述：客户在伙伴销售平台查询已开通的按需资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return CompletableFuture<ListCustomerOnDemandResourcesResponse>
     */
    public CompletableFuture<ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesAsync(
        ListCustomerOnDemandResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listCustomerOnDemandResources);
    }

    /**
     * 查询客户按需资源列表
     *
     * 功能描述：客户在伙伴销售平台查询已开通的按需资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return AsyncInvoker<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse>
     */
    public AsyncInvoker<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse> listCustomerOnDemandResourcesAsyncInvoker(
        ListCustomerOnDemandResourcesRequest request) {
        return new AsyncInvoker<ListCustomerOnDemandResourcesRequest, ListCustomerOnDemandResourcesResponse>(request,
            BssintlMeta.listCustomerOnDemandResources, hcClient);
    }

    /**
     * 查询订单列表
     *
     * 功能描述：客户购买包年包月资源后，可以查看待审核、处理中、已取消、已完成和待支付等状态的订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return CompletableFuture<ListCustomerOrdersResponse>
     */
    public CompletableFuture<ListCustomerOrdersResponse> listCustomerOrdersAsync(ListCustomerOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listCustomerOrders);
    }

    /**
     * 查询订单列表
     *
     * 功能描述：客户购买包年包月资源后，可以查看待审核、处理中、已取消、已完成和待支付等状态的订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return AsyncInvoker<ListCustomerOrdersRequest, ListCustomerOrdersResponse>
     */
    public AsyncInvoker<ListCustomerOrdersRequest, ListCustomerOrdersResponse> listCustomerOrdersAsyncInvoker(
        ListCustomerOrdersRequest request) {
        return new AsyncInvoker<ListCustomerOrdersRequest, ListCustomerOrdersResponse>(request,
            BssintlMeta.listCustomerOrders, hcClient);
    }

    /**
     * 查询资源详单
     *
     * 功能描述：客户在客户自建平台查询自己的资源详单，用于反映各类资源的消耗情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return CompletableFuture<ListCustomerselfResourceRecordDetailsResponse>
     */
    public CompletableFuture<ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsAsync(
        ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecordDetails);
    }

    /**
     * 查询资源详单
     *
     * 功能描述：客户在客户自建平台查询自己的资源详单，用于反映各类资源的消耗情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return AsyncInvoker<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse>
     */
    public AsyncInvoker<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse> listCustomerselfResourceRecordDetailsAsyncInvoker(
        ListCustomerselfResourceRecordDetailsRequest request) {
        return new AsyncInvoker<ListCustomerselfResourceRecordDetailsRequest, ListCustomerselfResourceRecordDetailsResponse>(
            request, BssintlMeta.listCustomerselfResourceRecordDetails, hcClient);
    }

    /**
     * 查询资源消费记录
     *
     * 功能描述：客户在客户自建平台查询每个资源的消费明细数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return CompletableFuture<ListCustomerselfResourceRecordsResponse>
     */
    public CompletableFuture<ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsAsync(
        ListCustomerselfResourceRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecords);
    }

    /**
     * 查询资源消费记录
     *
     * 功能描述：客户在客户自建平台查询每个资源的消费明细数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return AsyncInvoker<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse>
     */
    public AsyncInvoker<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse> listCustomerselfResourceRecordsAsyncInvoker(
        ListCustomerselfResourceRecordsRequest request) {
        return new AsyncInvoker<ListCustomerselfResourceRecordsRequest, ListCustomerselfResourceRecordsResponse>(
            request, BssintlMeta.listCustomerselfResourceRecords, hcClient);
    }

    /**
     * 查询资源包列表
     *
     * 功能描述：客户在自建平台查询资源包列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourceInfosRequest 请求对象
     * @return CompletableFuture<ListFreeResourceInfosResponse>
     */
    public CompletableFuture<ListFreeResourceInfosResponse> listFreeResourceInfosAsync(
        ListFreeResourceInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listFreeResourceInfos);
    }

    /**
     * 查询资源包列表
     *
     * 功能描述：客户在自建平台查询资源包列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourceInfosRequest 请求对象
     * @return AsyncInvoker<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse>
     */
    public AsyncInvoker<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse> listFreeResourceInfosAsyncInvoker(
        ListFreeResourceInfosRequest request) {
        return new AsyncInvoker<ListFreeResourceInfosRequest, ListFreeResourceInfosResponse>(request,
            BssintlMeta.listFreeResourceInfos, hcClient);
    }

    /**
     * 查询资源内使用量
     *
     * 功能描述：客户在自建平台查询客户自己的资源包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourceUsagesRequest 请求对象
     * @return CompletableFuture<ListFreeResourceUsagesResponse>
     */
    public CompletableFuture<ListFreeResourceUsagesResponse> listFreeResourceUsagesAsync(
        ListFreeResourceUsagesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listFreeResourceUsages);
    }

    /**
     * 查询资源内使用量
     *
     * 功能描述：客户在自建平台查询客户自己的资源包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourceUsagesRequest 请求对象
     * @return AsyncInvoker<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse>
     */
    public AsyncInvoker<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse> listFreeResourceUsagesAsyncInvoker(
        ListFreeResourceUsagesRequest request) {
        return new AsyncInvoker<ListFreeResourceUsagesRequest, ListFreeResourceUsagesResponse>(request,
            BssintlMeta.listFreeResourceUsages, hcClient);
    }

    /**
     * 查询资源包使用明细
     *
     * 客户在自建平台查询资源包使用明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourcesUsageRecordsRequest 请求对象
     * @return CompletableFuture<ListFreeResourcesUsageRecordsResponse>
     */
    public CompletableFuture<ListFreeResourcesUsageRecordsResponse> listFreeResourcesUsageRecordsAsync(
        ListFreeResourcesUsageRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listFreeResourcesUsageRecords);
    }

    /**
     * 查询资源包使用明细
     *
     * 客户在自建平台查询资源包使用明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFreeResourcesUsageRecordsRequest 请求对象
     * @return AsyncInvoker<ListFreeResourcesUsageRecordsRequest, ListFreeResourcesUsageRecordsResponse>
     */
    public AsyncInvoker<ListFreeResourcesUsageRecordsRequest, ListFreeResourcesUsageRecordsResponse> listFreeResourcesUsageRecordsAsyncInvoker(
        ListFreeResourcesUsageRecordsRequest request) {
        return new AsyncInvoker<ListFreeResourcesUsageRecordsRequest, ListFreeResourcesUsageRecordsResponse>(request,
            BssintlMeta.listFreeResourcesUsageRecords, hcClient);
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
     * @return CompletableFuture<ListIndirectPartnersResponse>
     */
    public CompletableFuture<ListIndirectPartnersResponse> listIndirectPartnersAsync(
        ListIndirectPartnersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listIndirectPartners);
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
     * @return AsyncInvoker<ListIndirectPartnersRequest, ListIndirectPartnersResponse>
     */
    public AsyncInvoker<ListIndirectPartnersRequest, ListIndirectPartnersResponse> listIndirectPartnersAsyncInvoker(
        ListIndirectPartnersRequest request) {
        return new AsyncInvoker<ListIndirectPartnersRequest, ListIndirectPartnersResponse>(request,
            BssintlMeta.listIndirectPartners, hcClient);
    }

    /**
     * 查询发票列表
     *
     * 功能描述：查询发票列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInvoicesRequest 请求对象
     * @return CompletableFuture<ListInvoicesResponse>
     */
    public CompletableFuture<ListInvoicesResponse> listInvoicesAsync(ListInvoicesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listInvoices);
    }

    /**
     * 查询发票列表
     *
     * 功能描述：查询发票列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInvoicesRequest 请求对象
     * @return AsyncInvoker<ListInvoicesRequest, ListInvoicesResponse>
     */
    public AsyncInvoker<ListInvoicesRequest, ListInvoicesResponse> listInvoicesAsyncInvoker(
        ListInvoicesRequest request) {
        return new AsyncInvoker<ListInvoicesRequest, ListInvoicesResponse>(request, BssintlMeta.listInvoices, hcClient);
    }

    /**
     * 查询使用量单位列表
     *
     * 功能描述：伙伴在伙伴销售平台上查询资源使用量的度量单位及名称，度量单位类型等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMeasureUnitsRequest 请求对象
     * @return CompletableFuture<ListMeasureUnitsResponse>
     */
    public CompletableFuture<ListMeasureUnitsResponse> listMeasureUnitsAsync(ListMeasureUnitsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listMeasureUnits);
    }

    /**
     * 查询使用量单位列表
     *
     * 功能描述：伙伴在伙伴销售平台上查询资源使用量的度量单位及名称，度量单位类型等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMeasureUnitsRequest 请求对象
     * @return AsyncInvoker<ListMeasureUnitsRequest, ListMeasureUnitsResponse>
     */
    public AsyncInvoker<ListMeasureUnitsRequest, ListMeasureUnitsResponse> listMeasureUnitsAsyncInvoker(
        ListMeasureUnitsRequest request) {
        return new AsyncInvoker<ListMeasureUnitsRequest, ListMeasureUnitsResponse>(request,
            BssintlMeta.listMeasureUnits, hcClient);
    }

    /**
     * 查询消费汇总(客户)
     *
     * 功能描述：客户可以查询自身的消费汇总单的功能，消费按月汇总。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonthlyExpendituresRequest 请求对象
     * @return CompletableFuture<ListMonthlyExpendituresResponse>
     */
    public CompletableFuture<ListMonthlyExpendituresResponse> listMonthlyExpendituresAsync(
        ListMonthlyExpendituresRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listMonthlyExpenditures);
    }

    /**
     * 查询消费汇总(客户)
     *
     * 功能描述：客户可以查询自身的消费汇总单的功能，消费按月汇总。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonthlyExpendituresRequest 请求对象
     * @return AsyncInvoker<ListMonthlyExpendituresRequest, ListMonthlyExpendituresResponse>
     */
    public AsyncInvoker<ListMonthlyExpendituresRequest, ListMonthlyExpendituresResponse> listMonthlyExpendituresAsyncInvoker(
        ListMonthlyExpendituresRequest request) {
        return new AsyncInvoker<ListMonthlyExpendituresRequest, ListMonthlyExpendituresResponse>(request,
            BssintlMeta.listMonthlyExpenditures, hcClient);
    }

    /**
     * 查询按需产品价格
     *
     * 功能描述：按需资源询价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return CompletableFuture<ListOnDemandResourceRatingsResponse>
     */
    public CompletableFuture<ListOnDemandResourceRatingsResponse> listOnDemandResourceRatingsAsync(
        ListOnDemandResourceRatingsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listOnDemandResourceRatings);
    }

    /**
     * 查询按需产品价格
     *
     * 功能描述：按需资源询价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return AsyncInvoker<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse>
     */
    public AsyncInvoker<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse> listOnDemandResourceRatingsAsyncInvoker(
        ListOnDemandResourceRatingsRequest request) {
        return new AsyncInvoker<ListOnDemandResourceRatingsRequest, ListOnDemandResourceRatingsResponse>(request,
            BssintlMeta.listOnDemandResourceRatings, hcClient);
    }

    /**
     * 查询订单可用折扣
     *
     * 功能描述：功能介绍客户在伙伴销售平台支付待支付订单时，查询可使用的折扣。只返回商务合同折扣和伙伴授权折扣客户在客户自建平台查看订单可用的优惠券列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrderDiscountsRequest 请求对象
     * @return CompletableFuture<ListOrderDiscountsResponse>
     */
    public CompletableFuture<ListOrderDiscountsResponse> listOrderDiscountsAsync(ListOrderDiscountsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listOrderDiscounts);
    }

    /**
     * 查询订单可用折扣
     *
     * 功能描述：功能介绍客户在伙伴销售平台支付待支付订单时，查询可使用的折扣。只返回商务合同折扣和伙伴授权折扣客户在客户自建平台查看订单可用的优惠券列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrderDiscountsRequest 请求对象
     * @return AsyncInvoker<ListOrderDiscountsRequest, ListOrderDiscountsResponse>
     */
    public AsyncInvoker<ListOrderDiscountsRequest, ListOrderDiscountsResponse> listOrderDiscountsAsyncInvoker(
        ListOrderDiscountsRequest request) {
        return new AsyncInvoker<ListOrderDiscountsRequest, ListOrderDiscountsResponse>(request,
            BssintlMeta.listOrderDiscounts, hcClient);
    }

    /**
     * 查询客户包年/包月资源列表
     *
     * 功能描述：客户在客户自建平台查询某个或所有的包年/包月资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return CompletableFuture<ListPayPerUseCustomerResourcesResponse>
     */
    public CompletableFuture<ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesAsync(
        ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listPayPerUseCustomerResources);
    }

    /**
     * 查询客户包年/包月资源列表
     *
     * 功能描述：客户在客户自建平台查询某个或所有的包年/包月资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return AsyncInvoker<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse>
     */
    public AsyncInvoker<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse> listPayPerUseCustomerResourcesAsyncInvoker(
        ListPayPerUseCustomerResourcesRequest request) {
        return new AsyncInvoker<ListPayPerUseCustomerResourcesRequest, ListPayPerUseCustomerResourcesResponse>(request,
            BssintlMeta.listPayPerUseCustomerResources, hcClient);
    }

    /**
     * 查询伙伴月度消费账单
     *
     * 功能描述：伙伴可以查询伙伴月度消费账单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostpaidBillSumRequest 请求对象
     * @return CompletableFuture<ListPostpaidBillSumResponse>
     */
    public CompletableFuture<ListPostpaidBillSumResponse> listPostpaidBillSumAsync(ListPostpaidBillSumRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listPostpaidBillSum);
    }

    /**
     * 查询伙伴月度消费账单
     *
     * 功能描述：伙伴可以查询伙伴月度消费账单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPostpaidBillSumRequest 请求对象
     * @return AsyncInvoker<ListPostpaidBillSumRequest, ListPostpaidBillSumResponse>
     */
    public AsyncInvoker<ListPostpaidBillSumRequest, ListPostpaidBillSumResponse> listPostpaidBillSumAsyncInvoker(
        ListPostpaidBillSumRequest request) {
        return new AsyncInvoker<ListPostpaidBillSumRequest, ListPostpaidBillSumResponse>(request,
            BssintlMeta.listPostpaidBillSum, hcClient);
    }

    /**
     * 查询包年/包月产品价格
     *
     * 功能描述：客户在自建平台按照条件查询包年/包月产品开通时候的价格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return CompletableFuture<ListRateOnPeriodDetailResponse>
     */
    public CompletableFuture<ListRateOnPeriodDetailResponse> listRateOnPeriodDetailAsync(
        ListRateOnPeriodDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listRateOnPeriodDetail);
    }

    /**
     * 查询包年/包月产品价格
     *
     * 功能描述：客户在自建平台按照条件查询包年/包月产品开通时候的价格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return AsyncInvoker<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse>
     */
    public AsyncInvoker<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse> listRateOnPeriodDetailAsyncInvoker(
        ListRateOnPeriodDetailRequest request) {
        return new AsyncInvoker<ListRateOnPeriodDetailRequest, ListRateOnPeriodDetailResponse>(request,
            BssintlMeta.listRateOnPeriodDetail, hcClient);
    }

    /**
     * 查询资源类型列表
     *
     * 伙伴在伙伴销售平台查询资源类型的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTypesRequest 请求对象
     * @return CompletableFuture<ListResourceTypesResponse>
     */
    public CompletableFuture<ListResourceTypesResponse> listResourceTypesAsync(ListResourceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listResourceTypes);
    }

    /**
     * 查询资源类型列表
     *
     * 伙伴在伙伴销售平台查询资源类型的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTypesRequest 请求对象
     * @return AsyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse>
     */
    public AsyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse> listResourceTypesAsyncInvoker(
        ListResourceTypesRequest request) {
        return new AsyncInvoker<ListResourceTypesRequest, ListResourceTypesResponse>(request,
            BssintlMeta.listResourceTypes, hcClient);
    }

    /**
     * 根据云服务类型查询资源列表
     *
     * 功能描述：伙伴在伙伴销售平台根据云服务类型查询关联的资源类型编码和名称，用于查询按需产品的价格或包年/包月产品的价格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceResourcesRequest 请求对象
     * @return CompletableFuture<ListServiceResourcesResponse>
     */
    public CompletableFuture<ListServiceResourcesResponse> listServiceResourcesAsync(
        ListServiceResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listServiceResources);
    }

    /**
     * 根据云服务类型查询资源列表
     *
     * 功能描述：伙伴在伙伴销售平台根据云服务类型查询关联的资源类型编码和名称，用于查询按需产品的价格或包年/包月产品的价格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceResourcesRequest 请求对象
     * @return AsyncInvoker<ListServiceResourcesRequest, ListServiceResourcesResponse>
     */
    public AsyncInvoker<ListServiceResourcesRequest, ListServiceResourcesResponse> listServiceResourcesAsyncInvoker(
        ListServiceResourcesRequest request) {
        return new AsyncInvoker<ListServiceResourcesRequest, ListServiceResourcesResponse>(request,
            BssintlMeta.listServiceResources, hcClient);
    }

    /**
     * 查询云服务类型列表
     *
     * 伙伴在伙伴销售平台查询云服务类型的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceTypesRequest 请求对象
     * @return CompletableFuture<ListServiceTypesResponse>
     */
    public CompletableFuture<ListServiceTypesResponse> listServiceTypesAsync(ListServiceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listServiceTypes);
    }

    /**
     * 查询云服务类型列表
     *
     * 伙伴在伙伴销售平台查询云服务类型的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceTypesRequest 请求对象
     * @return AsyncInvoker<ListServiceTypesRequest, ListServiceTypesResponse>
     */
    public AsyncInvoker<ListServiceTypesRequest, ListServiceTypesResponse> listServiceTypesAsyncInvoker(
        ListServiceTypesRequest request) {
        return new AsyncInvoker<ListServiceTypesRequest, ListServiceTypesResponse>(request,
            BssintlMeta.listServiceTypes, hcClient);
    }

    /**
     * 查询优惠券列表
     *
     * 功能描述：伙伴/客户可以查询自身的优惠券信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return CompletableFuture<ListSubCustomerCouponsResponse>
     */
    public CompletableFuture<ListSubCustomerCouponsResponse> listSubCustomerCouponsAsync(
        ListSubCustomerCouponsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listSubCustomerCoupons);
    }

    /**
     * 查询优惠券列表
     *
     * 功能描述：伙伴/客户可以查询自身的优惠券信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return AsyncInvoker<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse>
     */
    public AsyncInvoker<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse> listSubCustomerCouponsAsyncInvoker(
        ListSubCustomerCouponsRequest request) {
        return new AsyncInvoker<ListSubCustomerCouponsRequest, ListSubCustomerCouponsResponse>(request,
            BssintlMeta.listSubCustomerCoupons, hcClient);
    }

    /**
     * 查询客户列表
     *
     * 功能描述：伙伴可以查询合作伙伴的客户信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomersRequest 请求对象
     * @return CompletableFuture<ListSubCustomersResponse>
     */
    public CompletableFuture<ListSubCustomersResponse> listSubCustomersAsync(ListSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listSubCustomers);
    }

    /**
     * 查询客户列表
     *
     * 功能描述：伙伴可以查询合作伙伴的客户信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubCustomersRequest 请求对象
     * @return AsyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse>
     */
    public AsyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomersAsyncInvoker(
        ListSubCustomersRequest request) {
        return new AsyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse>(request,
            BssintlMeta.listSubCustomers, hcClient);
    }

    /**
     * 查询使用量类型列表
     *
     * 功能描述：伙伴在伙伴销售平台查询资源的使用量类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsageTypesRequest 请求对象
     * @return CompletableFuture<ListUsageTypesResponse>
     */
    public CompletableFuture<ListUsageTypesResponse> listUsageTypesAsync(ListUsageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.listUsageTypes);
    }

    /**
     * 查询使用量类型列表
     *
     * 功能描述：伙伴在伙伴销售平台查询资源的使用量类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsageTypesRequest 请求对象
     * @return AsyncInvoker<ListUsageTypesRequest, ListUsageTypesResponse>
     */
    public AsyncInvoker<ListUsageTypesRequest, ListUsageTypesResponse> listUsageTypesAsyncInvoker(
        ListUsageTypesRequest request) {
        return new AsyncInvoker<ListUsageTypesRequest, ListUsageTypesResponse>(request, BssintlMeta.listUsageTypes,
            hcClient);
    }

    /**
     * 支付包年/包月产品订单
     *
     * 客户可以对待支付状态的包年/包月产品订单进行支付
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PayOrdersRequest 请求对象
     * @return CompletableFuture<PayOrdersResponse>
     */
    public CompletableFuture<PayOrdersResponse> payOrdersAsync(PayOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.payOrders);
    }

    /**
     * 支付包年/包月产品订单
     *
     * 客户可以对待支付状态的包年/包月产品订单进行支付
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PayOrdersRequest 请求对象
     * @return AsyncInvoker<PayOrdersRequest, PayOrdersResponse>
     */
    public AsyncInvoker<PayOrdersRequest, PayOrdersResponse> payOrdersAsyncInvoker(PayOrdersRequest request) {
        return new AsyncInvoker<PayOrdersRequest, PayOrdersResponse>(request, BssintlMeta.payOrders, hcClient);
    }

    /**
     * 续订包年/包月资源
     *
     * 功能描述：客户的包年包/月资源即将到期时，可进行包年/包月资源的续订
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenewalResourcesRequest 请求对象
     * @return CompletableFuture<RenewalResourcesResponse>
     */
    public CompletableFuture<RenewalResourcesResponse> renewalResourcesAsync(RenewalResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.renewalResources);
    }

    /**
     * 续订包年/包月资源
     *
     * 功能描述：客户的包年包/月资源即将到期时，可进行包年/包月资源的续订
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenewalResourcesRequest 请求对象
     * @return AsyncInvoker<RenewalResourcesRequest, RenewalResourcesResponse>
     */
    public AsyncInvoker<RenewalResourcesRequest, RenewalResourcesResponse> renewalResourcesAsyncInvoker(
        RenewalResourcesRequest request) {
        return new AsyncInvoker<RenewalResourcesRequest, RenewalResourcesResponse>(request,
            BssintlMeta.renewalResources, hcClient);
    }

    /**
     * 发送验证码
     *
     * 功能描述：客户注册时，如果填写了邮箱，可以向对应的邮箱发送注册验证码，校验信息的正确性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return CompletableFuture<SendVerificationMessageCodeResponse>
     */
    public CompletableFuture<SendVerificationMessageCodeResponse> sendVerificationMessageCodeAsync(
        SendVerificationMessageCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.sendVerificationMessageCode);
    }

    /**
     * 发送验证码
     *
     * 功能描述：客户注册时，如果填写了邮箱，可以向对应的邮箱发送注册验证码，校验信息的正确性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return AsyncInvoker<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse>
     */
    public AsyncInvoker<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse> sendVerificationMessageCodeAsyncInvoker(
        SendVerificationMessageCodeRequest request) {
        return new AsyncInvoker<SendVerificationMessageCodeRequest, SendVerificationMessageCodeResponse>(request,
            BssintlMeta.sendVerificationMessageCode, hcClient);
    }

    /**
     * 查询账户余额
     *
     * 功能描述：客户可以查询自身的账户余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerAccountBalancesRequest 请求对象
     * @return CompletableFuture<ShowCustomerAccountBalancesResponse>
     */
    public CompletableFuture<ShowCustomerAccountBalancesResponse> showCustomerAccountBalancesAsync(
        ShowCustomerAccountBalancesRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showCustomerAccountBalances);
    }

    /**
     * 查询账户余额
     *
     * 功能描述：客户可以查询自身的账户余额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerAccountBalancesRequest 请求对象
     * @return AsyncInvoker<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse>
     */
    public AsyncInvoker<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse> showCustomerAccountBalancesAsyncInvoker(
        ShowCustomerAccountBalancesRequest request) {
        return new AsyncInvoker<ShowCustomerAccountBalancesRequest, ShowCustomerAccountBalancesResponse>(request,
            BssintlMeta.showCustomerAccountBalances, hcClient);
    }

    /**
     * 查询订单详情
     *
     * 功能描述：客户可以查看订单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return CompletableFuture<ShowCustomerOrderDetailsResponse>
     */
    public CompletableFuture<ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsAsync(
        ShowCustomerOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showCustomerOrderDetails);
    }

    /**
     * 查询订单详情
     *
     * 功能描述：客户可以查看订单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return AsyncInvoker<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse>
     */
    public AsyncInvoker<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse> showCustomerOrderDetailsAsyncInvoker(
        ShowCustomerOrderDetailsRequest request) {
        return new AsyncInvoker<ShowCustomerOrderDetailsRequest, ShowCustomerOrderDetailsResponse>(request,
            BssintlMeta.showCustomerOrderDetails, hcClient);
    }

    /**
     * 查询实名认证审核结果
     *
     * 功能描述：如果实名认证申请或实名认证变更申请的响应中，显示需要人工审核，使用该接口查询审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return CompletableFuture<ShowRealnameAuthenticationReviewResultResponse>
     */
    public CompletableFuture<ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultAsync(
        ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showRealnameAuthenticationReviewResult);
    }

    /**
     * 查询实名认证审核结果
     *
     * 功能描述：如果实名认证申请或实名认证变更申请的响应中，显示需要人工审核，使用该接口查询审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return AsyncInvoker<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse>
     */
    public AsyncInvoker<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse> showRealnameAuthenticationReviewResultAsyncInvoker(
        ShowRealnameAuthenticationReviewResultRequest request) {
        return new AsyncInvoker<ShowRealnameAuthenticationReviewResultRequest, ShowRealnameAuthenticationReviewResultResponse>(
            request, BssintlMeta.showRealnameAuthenticationReviewResult, hcClient);
    }

    /**
     * 查询退款订单的金额详情
     *
     * 功能描述：客户在伙伴销售平台查询某次退订订单或者降配订单的退款金额来自哪些资源和对应订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return CompletableFuture<ShowRefundOrderDetailsResponse>
     */
    public CompletableFuture<ShowRefundOrderDetailsResponse> showRefundOrderDetailsAsync(
        ShowRefundOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showRefundOrderDetails);
    }

    /**
     * 查询退款订单的金额详情
     *
     * 功能描述：客户在伙伴销售平台查询某次退订订单或者降配订单的退款金额来自哪些资源和对应订单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return AsyncInvoker<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse>
     */
    public AsyncInvoker<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse> showRefundOrderDetailsAsyncInvoker(
        ShowRefundOrderDetailsRequest request) {
        return new AsyncInvoker<ShowRefundOrderDetailsRequest, ShowRefundOrderDetailsResponse>(request,
            BssintlMeta.showRefundOrderDetails, hcClient);
    }

    /**
     * 查询客户预算
     *
     * 功能描述：查询客户预算
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubCustomerBudgetRequest 请求对象
     * @return CompletableFuture<ShowSubCustomerBudgetResponse>
     */
    public CompletableFuture<ShowSubCustomerBudgetResponse> showSubCustomerBudgetAsync(
        ShowSubCustomerBudgetRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.showSubCustomerBudget);
    }

    /**
     * 查询客户预算
     *
     * 功能描述：查询客户预算
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubCustomerBudgetRequest 请求对象
     * @return AsyncInvoker<ShowSubCustomerBudgetRequest, ShowSubCustomerBudgetResponse>
     */
    public AsyncInvoker<ShowSubCustomerBudgetRequest, ShowSubCustomerBudgetResponse> showSubCustomerBudgetAsyncInvoker(
        ShowSubCustomerBudgetRequest request) {
        return new AsyncInvoker<ShowSubCustomerBudgetRequest, ShowSubCustomerBudgetResponse>(request,
            BssintlMeta.showSubCustomerBudget, hcClient);
    }

    /**
     * 解冻客户账号
     *
     * 功能描述：解冻伙伴子客户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezeSubCustomersRequest 请求对象
     * @return CompletableFuture<UnfreezeSubCustomersResponse>
     */
    public CompletableFuture<UnfreezeSubCustomersResponse> unfreezeSubCustomersAsync(
        UnfreezeSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.unfreezeSubCustomers);
    }

    /**
     * 解冻客户账号
     *
     * 功能描述：解冻伙伴子客户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezeSubCustomersRequest 请求对象
     * @return AsyncInvoker<UnfreezeSubCustomersRequest, UnfreezeSubCustomersResponse>
     */
    public AsyncInvoker<UnfreezeSubCustomersRequest, UnfreezeSubCustomersResponse> unfreezeSubCustomersAsyncInvoker(
        UnfreezeSubCustomersRequest request) {
        return new AsyncInvoker<UnfreezeSubCustomersRequest, UnfreezeSubCustomersResponse>(request,
            BssintlMeta.unfreezeSubCustomers, hcClient);
    }

    /**
     * 设置或者取消包年/包月资源到期转按需
     *
     * 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费。包年/包月计费模式到期后，按需的计费模式即生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePeriodToOnDemandRequest 请求对象
     * @return CompletableFuture<UpdatePeriodToOnDemandResponse>
     */
    public CompletableFuture<UpdatePeriodToOnDemandResponse> updatePeriodToOnDemandAsync(
        UpdatePeriodToOnDemandRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.updatePeriodToOnDemand);
    }

    /**
     * 设置或者取消包年/包月资源到期转按需
     *
     * 功能描述：客户可以设置包年/包月资源到期后转为按需资源计费。包年/包月计费模式到期后，按需的计费模式即生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePeriodToOnDemandRequest 请求对象
     * @return AsyncInvoker<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse>
     */
    public AsyncInvoker<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse> updatePeriodToOnDemandAsyncInvoker(
        UpdatePeriodToOnDemandRequest request) {
        return new AsyncInvoker<UpdatePeriodToOnDemandRequest, UpdatePeriodToOnDemandResponse>(request,
            BssintlMeta.updatePeriodToOnDemand, hcClient);
    }

    /**
     * 设置客户预算
     *
     * 功能描述：设置客户预算
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubCustomerBudgetRequest 请求对象
     * @return CompletableFuture<UpdateSubCustomerBudgetResponse>
     */
    public CompletableFuture<UpdateSubCustomerBudgetResponse> updateSubCustomerBudgetAsync(
        UpdateSubCustomerBudgetRequest request) {
        return hcClient.asyncInvokeHttp(request, BssintlMeta.updateSubCustomerBudget);
    }

    /**
     * 设置客户预算
     *
     * 功能描述：设置客户预算
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubCustomerBudgetRequest 请求对象
     * @return AsyncInvoker<UpdateSubCustomerBudgetRequest, UpdateSubCustomerBudgetResponse>
     */
    public AsyncInvoker<UpdateSubCustomerBudgetRequest, UpdateSubCustomerBudgetResponse> updateSubCustomerBudgetAsyncInvoker(
        UpdateSubCustomerBudgetRequest request) {
        return new AsyncInvoker<UpdateSubCustomerBudgetRequest, UpdateSubCustomerBudgetResponse>(request,
            BssintlMeta.updateSubCustomerBudget, hcClient);
    }

}

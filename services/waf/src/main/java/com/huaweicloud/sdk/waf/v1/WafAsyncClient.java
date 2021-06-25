package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.waf.v1.model.*;

public class WafAsyncClient {
    protected HcClient hcClient;

    public WafAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WafAsyncClient> newBuilder() {
        return new ClientBuilder<>(WafAsyncClient::new);
    }


    /**
     * 查询租户云模式订购信息
     * 查询租户云模式订购信息，包括包周期、按需计费
     *
     * @param ConfirmCloudWafSubscriptionInfoRequest 请求对象
     * @return CompletableFuture<ConfirmCloudWafSubscriptionInfoResponse>
     */
    public CompletableFuture<ConfirmCloudWafSubscriptionInfoResponse> confirmCloudWafSubscriptionInfoAsync(ConfirmCloudWafSubscriptionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmCloudWafSubscriptionInfo);
    }

    /**
     * 查询租户云模式订购信息
     * 查询租户云模式订购信息，包括包周期、按需计费
     *
     * @param ConfirmCloudWafSubscriptionInfoRequest 请求对象
     * @return AsyncInvoker<ConfirmCloudWafSubscriptionInfoRequest, ConfirmCloudWafSubscriptionInfoResponse>
     */
    public AsyncInvoker<ConfirmCloudWafSubscriptionInfoRequest, ConfirmCloudWafSubscriptionInfoResponse> confirmCloudWafSubscriptionInfoAsyncInvoker(ConfirmCloudWafSubscriptionInfoRequest request) {
        return new AsyncInvoker<ConfirmCloudWafSubscriptionInfoRequest, ConfirmCloudWafSubscriptionInfoResponse>(request, WafMeta.confirmCloudWafSubscriptionInfo, hcClient);
    }

    /**
     * 获取用户套餐信息
     * 获取用户购买的WAF规格信息
     *
     * @param ConfirmUserBundleRequest 请求对象
     * @return CompletableFuture<ConfirmUserBundleResponse>
     */
    public CompletableFuture<ConfirmUserBundleResponse> confirmUserBundleAsync(ConfirmUserBundleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmUserBundle);
    }

    /**
     * 获取用户套餐信息
     * 获取用户购买的WAF规格信息
     *
     * @param ConfirmUserBundleRequest 请求对象
     * @return AsyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse>
     */
    public AsyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse> confirmUserBundleAsyncInvoker(ConfirmUserBundleRequest request) {
        return new AsyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse>(request, WafMeta.confirmUserBundle, hcClient);
    }

    /**
     * 创建反爬虫规则
     * 创建反爬虫规则
     *
     * @param CreateAnticrawlerRulesRequest 请求对象
     * @return CompletableFuture<CreateAnticrawlerRulesResponse>
     */
    public CompletableFuture<CreateAnticrawlerRulesResponse> createAnticrawlerRulesAsync(CreateAnticrawlerRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createAnticrawlerRules);
    }

    /**
     * 创建反爬虫规则
     * 创建反爬虫规则
     *
     * @param CreateAnticrawlerRulesRequest 请求对象
     * @return AsyncInvoker<CreateAnticrawlerRulesRequest, CreateAnticrawlerRulesResponse>
     */
    public AsyncInvoker<CreateAnticrawlerRulesRequest, CreateAnticrawlerRulesResponse> createAnticrawlerRulesAsyncInvoker(CreateAnticrawlerRulesRequest request) {
        return new AsyncInvoker<CreateAnticrawlerRulesRequest, CreateAnticrawlerRulesResponse>(request, WafMeta.createAnticrawlerRules, hcClient);
    }

    /**
     * 创建防敏感信息泄露规则
     * 创建防敏感信息泄露规则
     *
     * @param CreateAntileakageRulesRequest 请求对象
     * @return CompletableFuture<CreateAntileakageRulesResponse>
     */
    public CompletableFuture<CreateAntileakageRulesResponse> createAntileakageRulesAsync(CreateAntileakageRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createAntileakageRules);
    }

    /**
     * 创建防敏感信息泄露规则
     * 创建防敏感信息泄露规则
     *
     * @param CreateAntileakageRulesRequest 请求对象
     * @return AsyncInvoker<CreateAntileakageRulesRequest, CreateAntileakageRulesResponse>
     */
    public AsyncInvoker<CreateAntileakageRulesRequest, CreateAntileakageRulesResponse> createAntileakageRulesAsyncInvoker(CreateAntileakageRulesRequest request) {
        return new AsyncInvoker<CreateAntileakageRulesRequest, CreateAntileakageRulesResponse>(request, WafMeta.createAntileakageRules, hcClient);
    }

    /**
     * 创建cc规则
     * 创建cc规则
     *
     * @param CreateCcRuleRequest 请求对象
     * @return CompletableFuture<CreateCcRuleResponse>
     */
    public CompletableFuture<CreateCcRuleResponse> createCcRuleAsync(CreateCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createCcRule);
    }

    /**
     * 创建cc规则
     * 创建cc规则
     *
     * @param CreateCcRuleRequest 请求对象
     * @return AsyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse>
     */
    public AsyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse> createCcRuleAsyncInvoker(CreateCcRuleRequest request) {
        return new AsyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse>(request, WafMeta.createCcRule, hcClient);
    }

    /**
     * 创建证书
     * 创建证书
     *
     * @param CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createCertificate);
    }

    /**
     * 创建证书
     * 创建证书
     *
     * @param CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(CreateCertificateRequest request) {
        return new AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, WafMeta.createCertificate, hcClient);
    }

    /**
     * 创建精准防护规则
     * 创建精准防护规则
     *
     * @param CreateCustomRulesRequest 请求对象
     * @return CompletableFuture<CreateCustomRulesResponse>
     */
    public CompletableFuture<CreateCustomRulesResponse> createCustomRulesAsync(CreateCustomRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createCustomRules);
    }

    /**
     * 创建精准防护规则
     * 创建精准防护规则
     *
     * @param CreateCustomRulesRequest 请求对象
     * @return AsyncInvoker<CreateCustomRulesRequest, CreateCustomRulesResponse>
     */
    public AsyncInvoker<CreateCustomRulesRequest, CreateCustomRulesResponse> createCustomRulesAsyncInvoker(CreateCustomRulesRequest request) {
        return new AsyncInvoker<CreateCustomRulesRequest, CreateCustomRulesResponse>(request, WafMeta.createCustomRules, hcClient);
    }

    /**
     * 创建地理位置规则
     * 创建地理位置规则
     *
     * @param CreateGeoipRulesRequest 请求对象
     * @return CompletableFuture<CreateGeoipRulesResponse>
     */
    public CompletableFuture<CreateGeoipRulesResponse> createGeoipRulesAsync(CreateGeoipRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createGeoipRules);
    }

    /**
     * 创建地理位置规则
     * 创建地理位置规则
     *
     * @param CreateGeoipRulesRequest 请求对象
     * @return AsyncInvoker<CreateGeoipRulesRequest, CreateGeoipRulesResponse>
     */
    public AsyncInvoker<CreateGeoipRulesRequest, CreateGeoipRulesResponse> createGeoipRulesAsyncInvoker(CreateGeoipRulesRequest request) {
        return new AsyncInvoker<CreateGeoipRulesRequest, CreateGeoipRulesResponse>(request, WafMeta.createGeoipRules, hcClient);
    }

    /**
     * 创建云模式防护域名
     * 创建云模式防护域名
     *
     * @param CreateInstaneRequest 请求对象
     * @return CompletableFuture<CreateInstaneResponse>
     */
    public CompletableFuture<CreateInstaneResponse> createInstaneAsync(CreateInstaneRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createInstane);
    }

    /**
     * 创建云模式防护域名
     * 创建云模式防护域名
     *
     * @param CreateInstaneRequest 请求对象
     * @return AsyncInvoker<CreateInstaneRequest, CreateInstaneResponse>
     */
    public AsyncInvoker<CreateInstaneRequest, CreateInstaneResponse> createInstaneAsyncInvoker(CreateInstaneRequest request) {
        return new AsyncInvoker<CreateInstaneRequest, CreateInstaneResponse>(request, WafMeta.createInstane, hcClient);
    }

    /**
     * 创建防护策略
     * 创建防护策略
     *
     * @param CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPolicy);
    }

    /**
     * 创建防护策略
     * 创建防护策略
     *
     * @param CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(CreatePolicyRequest request) {
        return new AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, WafMeta.createPolicy, hcClient);
    }

    /**
     * 创建独享模式域名
     * 创建独享模式域名
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return CompletableFuture<CreatePremiumHostResponse>
     */
    public CompletableFuture<CreatePremiumHostResponse> createPremiumHostAsync(CreatePremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPremiumHost);
    }

    /**
     * 创建独享模式域名
     * 创建独享模式域名
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return AsyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>
     */
    public AsyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHostAsyncInvoker(CreatePremiumHostRequest request) {
        return new AsyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>(request, WafMeta.createPremiumHost, hcClient);
    }

    /**
     * 删除反爬虫防护规则
     * 删除反爬虫防护规则
     *
     * @param DeleteAnticrawlerRuleRequest 请求对象
     * @return CompletableFuture<DeleteAnticrawlerRuleResponse>
     */
    public CompletableFuture<DeleteAnticrawlerRuleResponse> deleteAnticrawlerRuleAsync(DeleteAnticrawlerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteAnticrawlerRule);
    }

    /**
     * 删除反爬虫防护规则
     * 删除反爬虫防护规则
     *
     * @param DeleteAnticrawlerRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse>
     */
    public AsyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> deleteAnticrawlerRuleAsyncInvoker(DeleteAnticrawlerRuleRequest request) {
        return new AsyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse>(request, WafMeta.deleteAnticrawlerRule, hcClient);
    }

    /**
     * 删除防敏感信息泄露防护规则
     * 删除防敏感信息泄露防护规则
     *
     * @param DeleteAntileakageRuleRequest 请求对象
     * @return CompletableFuture<DeleteAntileakageRuleResponse>
     */
    public CompletableFuture<DeleteAntileakageRuleResponse> deleteAntileakageRuleAsync(DeleteAntileakageRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteAntileakageRule);
    }

    /**
     * 删除防敏感信息泄露防护规则
     * 删除防敏感信息泄露防护规则
     *
     * @param DeleteAntileakageRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse>
     */
    public AsyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> deleteAntileakageRuleAsyncInvoker(DeleteAntileakageRuleRequest request) {
        return new AsyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse>(request, WafMeta.deleteAntileakageRule, hcClient);
    }

    /**
     * 删除cc防护规则
     * 删除cc防护规则
     *
     * @param DeleteCcRuleRequest 请求对象
     * @return CompletableFuture<DeleteCcRuleResponse>
     */
    public CompletableFuture<DeleteCcRuleResponse> deleteCcRuleAsync(DeleteCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteCcRule);
    }

    /**
     * 删除cc防护规则
     * 删除cc防护规则
     *
     * @param DeleteCcRuleRequest 请求对象
     * @return AsyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse>
     */
    public AsyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse> deleteCcRuleAsyncInvoker(DeleteCcRuleRequest request) {
        return new AsyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse>(request, WafMeta.deleteCcRule, hcClient);
    }

    /**
     * 删除证书
     * 删除证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteCertificate);
    }

    /**
     * 删除证书
     * 删除证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, WafMeta.deleteCertificate, hcClient);
    }

    /**
     * 删除精准防护规则
     * 删除精准防护规则
     *
     * @param DeleteCustomRuleRequest 请求对象
     * @return CompletableFuture<DeleteCustomRuleResponse>
     */
    public CompletableFuture<DeleteCustomRuleResponse> deleteCustomRuleAsync(DeleteCustomRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteCustomRule);
    }

    /**
     * 删除精准防护规则
     * 删除精准防护规则
     *
     * @param DeleteCustomRuleRequest 请求对象
     * @return AsyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse>
     */
    public AsyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse> deleteCustomRuleAsyncInvoker(DeleteCustomRuleRequest request) {
        return new AsyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse>(request, WafMeta.deleteCustomRule, hcClient);
    }

    /**
     * 删除地理位置防护规则
     * 删除地理位置防护规则
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return CompletableFuture<DeleteGeoipRuleResponse>
     */
    public CompletableFuture<DeleteGeoipRuleResponse> deleteGeoipRuleAsync(DeleteGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteGeoipRule);
    }

    /**
     * 删除地理位置防护规则
     * 删除地理位置防护规则
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return AsyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>
     */
    public AsyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRuleAsyncInvoker(DeleteGeoipRuleRequest request) {
        return new AsyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>(request, WafMeta.deleteGeoipRule, hcClient);
    }

    /**
     * 删除云模式防护域名
     * 删除云模式防护域名
     *
     * @param DeleteInstaneRequest 请求对象
     * @return CompletableFuture<DeleteInstaneResponse>
     */
    public CompletableFuture<DeleteInstaneResponse> deleteInstaneAsync(DeleteInstaneRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteInstane);
    }

    /**
     * 删除云模式防护域名
     * 删除云模式防护域名
     *
     * @param DeleteInstaneRequest 请求对象
     * @return AsyncInvoker<DeleteInstaneRequest, DeleteInstaneResponse>
     */
    public AsyncInvoker<DeleteInstaneRequest, DeleteInstaneResponse> deleteInstaneAsyncInvoker(DeleteInstaneRequest request) {
        return new AsyncInvoker<DeleteInstaneRequest, DeleteInstaneResponse>(request, WafMeta.deleteInstane, hcClient);
    }

    /**
     * 删除防护策略
     * 删除防护策略
     *
     * @param DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     * 删除防护策略
     *
     * @param DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(DeletePolicyRequest request) {
        return new AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, WafMeta.deletePolicy, hcClient);
    }

    /**
     * 删除独享模式域名
     * 删除独享模式域名
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return CompletableFuture<DeletePremiumHostResponse>
     */
    public CompletableFuture<DeletePremiumHostResponse> deletePremiumHostAsync(DeletePremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePremiumHost);
    }

    /**
     * 删除独享模式域名
     * 删除独享模式域名
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return AsyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>
     */
    public AsyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHostAsyncInvoker(DeletePremiumHostRequest request) {
        return new AsyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>(request, WafMeta.deletePremiumHost, hcClient);
    }

    /**
     * 查询反爬虫规则列表
     * 查询反爬虫规则列表
     *
     * @param ListAnticrawlerRulesRequest 请求对象
     * @return CompletableFuture<ListAnticrawlerRulesResponse>
     */
    public CompletableFuture<ListAnticrawlerRulesResponse> listAnticrawlerRulesAsync(ListAnticrawlerRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAnticrawlerRules);
    }

    /**
     * 查询反爬虫规则列表
     * 查询反爬虫规则列表
     *
     * @param ListAnticrawlerRulesRequest 请求对象
     * @return AsyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse>
     */
    public AsyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> listAnticrawlerRulesAsyncInvoker(ListAnticrawlerRulesRequest request) {
        return new AsyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse>(request, WafMeta.listAnticrawlerRules, hcClient);
    }

    /**
     * 查询防敏感信息泄露规则列表
     * 查询防敏感信息泄露规则列表
     *
     * @param ListAntileakageRulesRequest 请求对象
     * @return CompletableFuture<ListAntileakageRulesResponse>
     */
    public CompletableFuture<ListAntileakageRulesResponse> listAntileakageRulesAsync(ListAntileakageRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAntileakageRules);
    }

    /**
     * 查询防敏感信息泄露规则列表
     * 查询防敏感信息泄露规则列表
     *
     * @param ListAntileakageRulesRequest 请求对象
     * @return AsyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse>
     */
    public AsyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse> listAntileakageRulesAsyncInvoker(ListAntileakageRulesRequest request) {
        return new AsyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse>(request, WafMeta.listAntileakageRules, hcClient);
    }

    /**
     * 查询攻击防护类型
     * 查询攻击防护类型
     *
     * @param ListAttackActionRequest 请求对象
     * @return CompletableFuture<ListAttackActionResponse>
     */
    public CompletableFuture<ListAttackActionResponse> listAttackActionAsync(ListAttackActionRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAttackAction);
    }

    /**
     * 查询攻击防护类型
     * 查询攻击防护类型
     *
     * @param ListAttackActionRequest 请求对象
     * @return AsyncInvoker<ListAttackActionRequest, ListAttackActionResponse>
     */
    public AsyncInvoker<ListAttackActionRequest, ListAttackActionResponse> listAttackActionAsyncInvoker(ListAttackActionRequest request) {
        return new AsyncInvoker<ListAttackActionRequest, ListAttackActionResponse>(request, WafMeta.listAttackAction, hcClient);
    }

    /**
     * 查询攻击事件分布
     * 查询攻击事件分布
     *
     * @param ListAttackDistributionRequest 请求对象
     * @return CompletableFuture<ListAttackDistributionResponse>
     */
    public CompletableFuture<ListAttackDistributionResponse> listAttackDistributionAsync(ListAttackDistributionRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAttackDistribution);
    }

    /**
     * 查询攻击事件分布
     * 查询攻击事件分布
     *
     * @param ListAttackDistributionRequest 请求对象
     * @return AsyncInvoker<ListAttackDistributionRequest, ListAttackDistributionResponse>
     */
    public AsyncInvoker<ListAttackDistributionRequest, ListAttackDistributionResponse> listAttackDistributionAsyncInvoker(ListAttackDistributionRequest request) {
        return new AsyncInvoker<ListAttackDistributionRequest, ListAttackDistributionResponse>(request, WafMeta.listAttackDistribution, hcClient);
    }

    /**
     * 查询安全统计带宽数据
     * 查询安全统计带宽数据
     *
     * @param ListBandwidthTimelineRequest 请求对象
     * @return CompletableFuture<ListBandwidthTimelineResponse>
     */
    public CompletableFuture<ListBandwidthTimelineResponse> listBandwidthTimelineAsync(ListBandwidthTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listBandwidthTimeline);
    }

    /**
     * 查询安全统计带宽数据
     * 查询安全统计带宽数据
     *
     * @param ListBandwidthTimelineRequest 请求对象
     * @return AsyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>
     */
    public AsyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimelineAsyncInvoker(ListBandwidthTimelineRequest request) {
        return new AsyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>(request, WafMeta.listBandwidthTimeline, hcClient);
    }

    /**
     * 查询cc规则列表
     * 查询cc规则列表
     *
     * @param ListCcRulesRequest 请求对象
     * @return CompletableFuture<ListCcRulesResponse>
     */
    public CompletableFuture<ListCcRulesResponse> listCcRulesAsync(ListCcRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCcRules);
    }

    /**
     * 查询cc规则列表
     * 查询cc规则列表
     *
     * @param ListCcRulesRequest 请求对象
     * @return AsyncInvoker<ListCcRulesRequest, ListCcRulesResponse>
     */
    public AsyncInvoker<ListCcRulesRequest, ListCcRulesResponse> listCcRulesAsyncInvoker(ListCcRulesRequest request) {
        return new AsyncInvoker<ListCcRulesRequest, ListCcRulesResponse>(request, WafMeta.listCcRules, hcClient);
    }

    /**
     * 查询证书列表
     * 查询证书列表
     *
     * @param ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCertificates);
    }

    /**
     * 查询证书列表
     * 查询证书列表
     *
     * @param ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(ListCertificatesRequest request) {
        return new AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, WafMeta.listCertificates, hcClient);
    }

    /**
     * 查询精准防护规则列表
     * 查询精准防护规则列表
     *
     * @param ListCustomRulesRequest 请求对象
     * @return CompletableFuture<ListCustomRulesResponse>
     */
    public CompletableFuture<ListCustomRulesResponse> listCustomRulesAsync(ListCustomRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCustomRules);
    }

    /**
     * 查询精准防护规则列表
     * 查询精准防护规则列表
     *
     * @param ListCustomRulesRequest 请求对象
     * @return AsyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse>
     */
    public AsyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse> listCustomRulesAsyncInvoker(ListCustomRulesRequest request) {
        return new AsyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse>(request, WafMeta.listCustomRules, hcClient);
    }

    /**
     * 查询请求/攻击数量统计
     * 查询请求/攻击数量统计。
     *
     * @param ListEventByTimelineRequest 请求对象
     * @return CompletableFuture<ListEventByTimelineResponse>
     */
    public CompletableFuture<ListEventByTimelineResponse> listEventByTimelineAsync(ListEventByTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listEventByTimeline);
    }

    /**
     * 查询请求/攻击数量统计
     * 查询请求/攻击数量统计。
     *
     * @param ListEventByTimelineRequest 请求对象
     * @return AsyncInvoker<ListEventByTimelineRequest, ListEventByTimelineResponse>
     */
    public AsyncInvoker<ListEventByTimelineRequest, ListEventByTimelineResponse> listEventByTimelineAsyncInvoker(ListEventByTimelineRequest request) {
        return new AsyncInvoker<ListEventByTimelineRequest, ListEventByTimelineResponse>(request, WafMeta.listEventByTimeline, hcClient);
    }

    /**
     * 查询攻击事件详情列表
     * 查询攻击事件详情列表
     *
     * @param ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listEvents);
    }

    /**
     * 查询攻击事件详情列表
     * 查询攻击事件详情列表
     *
     * @param ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<ListEventsRequest, ListEventsResponse>(request, WafMeta.listEvents, hcClient);
    }

    /**
     * 查询地理位置规则列表
     * 查询地理位置规则列表
     *
     * @param ListGeoipRulesRequest 请求对象
     * @return CompletableFuture<ListGeoipRulesResponse>
     */
    public CompletableFuture<ListGeoipRulesResponse> listGeoipRulesAsync(ListGeoipRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listGeoipRules);
    }

    /**
     * 查询地理位置规则列表
     * 查询地理位置规则列表
     *
     * @param ListGeoipRulesRequest 请求对象
     * @return AsyncInvoker<ListGeoipRulesRequest, ListGeoipRulesResponse>
     */
    public AsyncInvoker<ListGeoipRulesRequest, ListGeoipRulesResponse> listGeoipRulesAsyncInvoker(ListGeoipRulesRequest request) {
        return new AsyncInvoker<ListGeoipRulesRequest, ListGeoipRulesResponse>(request, WafMeta.listGeoipRules, hcClient);
    }

    /**
     * 查询WAF独享引擎列表
     * 查询WAF独享引擎列表
     *
     * @param ListInstanceRequest 请求对象
     * @return CompletableFuture<ListInstanceResponse>
     */
    public CompletableFuture<ListInstanceResponse> listInstanceAsync(ListInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listInstance);
    }

    /**
     * 查询WAF独享引擎列表
     * 查询WAF独享引擎列表
     *
     * @param ListInstanceRequest 请求对象
     * @return AsyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public AsyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceAsyncInvoker(ListInstanceRequest request) {
        return new AsyncInvoker<ListInstanceRequest, ListInstanceResponse>(request, WafMeta.listInstance, hcClient);
    }

    /**
     * 查询云模式防护域名列表
     * 查询云模式防护域名列表
     *
     * @param ListInstanesRequest 请求对象
     * @return CompletableFuture<ListInstanesResponse>
     */
    public CompletableFuture<ListInstanesResponse> listInstanesAsync(ListInstanesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listInstanes);
    }

    /**
     * 查询云模式防护域名列表
     * 查询云模式防护域名列表
     *
     * @param ListInstanesRequest 请求对象
     * @return AsyncInvoker<ListInstanesRequest, ListInstanesResponse>
     */
    public AsyncInvoker<ListInstanesRequest, ListInstanesResponse> listInstanesAsyncInvoker(ListInstanesRequest request) {
        return new AsyncInvoker<ListInstanesRequest, ListInstanesResponse>(request, WafMeta.listInstanes, hcClient);
    }

    /**
     * 查询防护策略列表
     * 查询防护策略列表
     *
     * @param ListPolicyRequest 请求对象
     * @return CompletableFuture<ListPolicyResponse>
     */
    public CompletableFuture<ListPolicyResponse> listPolicyAsync(ListPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPolicy);
    }

    /**
     * 查询防护策略列表
     * 查询防护策略列表
     *
     * @param ListPolicyRequest 请求对象
     * @return AsyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public AsyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyAsyncInvoker(ListPolicyRequest request) {
        return new AsyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, WafMeta.listPolicy, hcClient);
    }

    /**
     * 独享模式域名列表
     * 独享模式域名列表
     *
     * @param ListPremiumHostRequest 请求对象
     * @return CompletableFuture<ListPremiumHostResponse>
     */
    public CompletableFuture<ListPremiumHostResponse> listPremiumHostAsync(ListPremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPremiumHost);
    }

    /**
     * 独享模式域名列表
     * 独享模式域名列表
     *
     * @param ListPremiumHostRequest 请求对象
     * @return AsyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>
     */
    public AsyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHostAsyncInvoker(ListPremiumHostRequest request) {
        return new AsyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>(request, WafMeta.listPremiumHost, hcClient);
    }

    /**
     * 查询QPS
     * 查询QPS。
     *
     * @param ListQpsRequest 请求对象
     * @return CompletableFuture<ListQpsResponse>
     */
    public CompletableFuture<ListQpsResponse> listQpsAsync(ListQpsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listQps);
    }

    /**
     * 查询QPS
     * 查询QPS。
     *
     * @param ListQpsRequest 请求对象
     * @return AsyncInvoker<ListQpsRequest, ListQpsResponse>
     */
    public AsyncInvoker<ListQpsRequest, ListQpsResponse> listQpsAsyncInvoker(ListQpsRequest request) {
        return new AsyncInvoker<ListQpsRequest, ListQpsResponse>(request, WafMeta.listQps, hcClient);
    }

    /**
     * 查询安全统计qps次数
     * 查询安全统计qps次数
     *
     * @param ListQpsTimelineRequest 请求对象
     * @return CompletableFuture<ListQpsTimelineResponse>
     */
    public CompletableFuture<ListQpsTimelineResponse> listQpsTimelineAsync(ListQpsTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listQpsTimeline);
    }

    /**
     * 查询安全统计qps次数
     * 查询安全统计qps次数
     *
     * @param ListQpsTimelineRequest 请求对象
     * @return AsyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>
     */
    public AsyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimelineAsyncInvoker(ListQpsTimelineRequest request) {
        return new AsyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>(request, WafMeta.listQpsTimeline, hcClient);
    }

    /**
     * 查询安全统计请求次数
     * 查询安全统计请求次数
     *
     * @param ListRequestTimelineRequest 请求对象
     * @return CompletableFuture<ListRequestTimelineResponse>
     */
    public CompletableFuture<ListRequestTimelineResponse> listRequestTimelineAsync(ListRequestTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listRequestTimeline);
    }

    /**
     * 查询安全统计请求次数
     * 查询安全统计请求次数
     *
     * @param ListRequestTimelineRequest 请求对象
     * @return AsyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>
     */
    public AsyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimelineAsyncInvoker(ListRequestTimelineRequest request) {
        return new AsyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>(request, WafMeta.listRequestTimeline, hcClient);
    }

    /**
     * 查询安全统计响应码数据
     * 查询安全统计响应码数据
     *
     * @param ListResponseCodeTimelineRequest 请求对象
     * @return CompletableFuture<ListResponseCodeTimelineResponse>
     */
    public CompletableFuture<ListResponseCodeTimelineResponse> listResponseCodeTimelineAsync(ListResponseCodeTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listResponseCodeTimeline);
    }

    /**
     * 查询安全统计响应码数据
     * 查询安全统计响应码数据
     *
     * @param ListResponseCodeTimelineRequest 请求对象
     * @return AsyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse>
     */
    public AsyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> listResponseCodeTimelineAsyncInvoker(ListResponseCodeTimelineRequest request) {
        return new AsyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse>(request, WafMeta.listResponseCodeTimeline, hcClient);
    }

    /**
     * 查询被攻击次数前五的域名
     * 查询被攻击次数前五的域名
     *
     * @param ListSourceDomainTop5Request 请求对象
     * @return CompletableFuture<ListSourceDomainTop5Response>
     */
    public CompletableFuture<ListSourceDomainTop5Response> listSourceDomainTop5Async(ListSourceDomainTop5Request request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listSourceDomainTop5);
    }

    /**
     * 查询被攻击次数前五的域名
     * 查询被攻击次数前五的域名
     *
     * @param ListSourceDomainTop5Request 请求对象
     * @return AsyncInvoker<ListSourceDomainTop5Request, ListSourceDomainTop5Response>
     */
    public AsyncInvoker<ListSourceDomainTop5Request, ListSourceDomainTop5Response> listSourceDomainTop5AsyncInvoker(ListSourceDomainTop5Request request) {
        return new AsyncInvoker<ListSourceDomainTop5Request, ListSourceDomainTop5Response>(request, WafMeta.listSourceDomainTop5, hcClient);
    }

    /**
     * 查询攻击源IP的个数
     * 查询攻击源IP的个数。
     *
     * @param ListSourceIpNumRequest 请求对象
     * @return CompletableFuture<ListSourceIpNumResponse>
     */
    public CompletableFuture<ListSourceIpNumResponse> listSourceIpNumAsync(ListSourceIpNumRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listSourceIpNum);
    }

    /**
     * 查询攻击源IP的个数
     * 查询攻击源IP的个数。
     *
     * @param ListSourceIpNumRequest 请求对象
     * @return AsyncInvoker<ListSourceIpNumRequest, ListSourceIpNumResponse>
     */
    public AsyncInvoker<ListSourceIpNumRequest, ListSourceIpNumResponse> listSourceIpNumAsyncInvoker(ListSourceIpNumRequest request) {
        return new AsyncInvoker<ListSourceIpNumRequest, ListSourceIpNumResponse>(request, WafMeta.listSourceIpNum, hcClient);
    }

    /**
     * 查询攻击源ip
     * 查询攻击源ip
     *
     * @param ListSourceIpTop5Request 请求对象
     * @return CompletableFuture<ListSourceIpTop5Response>
     */
    public CompletableFuture<ListSourceIpTop5Response> listSourceIpTop5Async(ListSourceIpTop5Request request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listSourceIpTop5);
    }

    /**
     * 查询攻击源ip
     * 查询攻击源ip
     *
     * @param ListSourceIpTop5Request 请求对象
     * @return AsyncInvoker<ListSourceIpTop5Request, ListSourceIpTop5Response>
     */
    public AsyncInvoker<ListSourceIpTop5Request, ListSourceIpTop5Response> listSourceIpTop5AsyncInvoker(ListSourceIpTop5Request request) {
        return new AsyncInvoker<ListSourceIpTop5Request, ListSourceIpTop5Response>(request, WafMeta.listSourceIpTop5, hcClient);
    }

    /**
     * 查询被攻击次数前五的url
     * 查询被攻击次数前五的url
     *
     * @param ListSourceUrlTop5Request 请求对象
     * @return CompletableFuture<ListSourceUrlTop5Response>
     */
    public CompletableFuture<ListSourceUrlTop5Response> listSourceUrlTop5Async(ListSourceUrlTop5Request request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listSourceUrlTop5);
    }

    /**
     * 查询被攻击次数前五的url
     * 查询被攻击次数前五的url
     *
     * @param ListSourceUrlTop5Request 请求对象
     * @return AsyncInvoker<ListSourceUrlTop5Request, ListSourceUrlTop5Response>
     */
    public AsyncInvoker<ListSourceUrlTop5Request, ListSourceUrlTop5Response> listSourceUrlTop5AsyncInvoker(ListSourceUrlTop5Request request) {
        return new AsyncInvoker<ListSourceUrlTop5Request, ListSourceUrlTop5Response>(request, WafMeta.listSourceUrlTop5, hcClient);
    }

    /**
     * 查询安全总览请求数据
     * 查询安全总览请求数据
     *
     * @param ListStatisticsRequest 请求对象
     * @return CompletableFuture<ListStatisticsResponse>
     */
    public CompletableFuture<ListStatisticsResponse> listStatisticsAsync(ListStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listStatistics);
    }

    /**
     * 查询安全总览请求数据
     * 查询安全总览请求数据
     *
     * @param ListStatisticsRequest 请求对象
     * @return AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsAsyncInvoker(ListStatisticsRequest request) {
        return new AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>(request, WafMeta.listStatistics, hcClient);
    }

    /**
     * 查询攻击事件分布类型
     * 查询攻击事件分布类型。
     *
     * @param ListThreatsRequest 请求对象
     * @return CompletableFuture<ListThreatsResponse>
     */
    public CompletableFuture<ListThreatsResponse> listThreatsAsync(ListThreatsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listThreats);
    }

    /**
     * 查询攻击事件分布类型
     * 查询攻击事件分布类型。
     *
     * @param ListThreatsRequest 请求对象
     * @return AsyncInvoker<ListThreatsRequest, ListThreatsResponse>
     */
    public AsyncInvoker<ListThreatsRequest, ListThreatsResponse> listThreatsAsyncInvoker(ListThreatsRequest request) {
        return new AsyncInvoker<ListThreatsRequest, ListThreatsResponse>(request, WafMeta.listThreats, hcClient);
    }

    /**
     * 查询业务异常监控
     * 查询业务异常监控
     *
     * @param ListTopAbnormalRequest 请求对象
     * @return CompletableFuture<ListTopAbnormalResponse>
     */
    public CompletableFuture<ListTopAbnormalResponse> listTopAbnormalAsync(ListTopAbnormalRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopAbnormal);
    }

    /**
     * 查询业务异常监控
     * 查询业务异常监控
     *
     * @param ListTopAbnormalRequest 请求对象
     * @return AsyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>
     */
    public AsyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormalAsyncInvoker(ListTopAbnormalRequest request) {
        return new AsyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>(request, WafMeta.listTopAbnormal, hcClient);
    }

    /**
     * 查询攻击域名
     * 查询攻击域名
     *
     * @param ListTopDomainRequest 请求对象
     * @return CompletableFuture<ListTopDomainResponse>
     */
    public CompletableFuture<ListTopDomainResponse> listTopDomainAsync(ListTopDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopDomain);
    }

    /**
     * 查询攻击域名
     * 查询攻击域名
     *
     * @param ListTopDomainRequest 请求对象
     * @return AsyncInvoker<ListTopDomainRequest, ListTopDomainResponse>
     */
    public AsyncInvoker<ListTopDomainRequest, ListTopDomainResponse> listTopDomainAsyncInvoker(ListTopDomainRequest request) {
        return new AsyncInvoker<ListTopDomainRequest, ListTopDomainResponse>(request, WafMeta.listTopDomain, hcClient);
    }

    /**
     * 查询攻击源ip
     * 查询攻击源ip
     *
     * @param ListTopIpRequest 请求对象
     * @return CompletableFuture<ListTopIpResponse>
     */
    public CompletableFuture<ListTopIpResponse> listTopIpAsync(ListTopIpRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopIp);
    }

    /**
     * 查询攻击源ip
     * 查询攻击源ip
     *
     * @param ListTopIpRequest 请求对象
     * @return AsyncInvoker<ListTopIpRequest, ListTopIpResponse>
     */
    public AsyncInvoker<ListTopIpRequest, ListTopIpResponse> listTopIpAsyncInvoker(ListTopIpRequest request) {
        return new AsyncInvoker<ListTopIpRequest, ListTopIpResponse>(request, WafMeta.listTopIp, hcClient);
    }

    /**
     * 查询攻击来源区域
     * 查询攻击来源区域
     *
     * @param ListTopRegionRequest 请求对象
     * @return CompletableFuture<ListTopRegionResponse>
     */
    public CompletableFuture<ListTopRegionResponse> listTopRegionAsync(ListTopRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopRegion);
    }

    /**
     * 查询攻击来源区域
     * 查询攻击来源区域
     *
     * @param ListTopRegionRequest 请求对象
     * @return AsyncInvoker<ListTopRegionRequest, ListTopRegionResponse>
     */
    public AsyncInvoker<ListTopRegionRequest, ListTopRegionResponse> listTopRegionAsyncInvoker(ListTopRegionRequest request) {
        return new AsyncInvoker<ListTopRegionRequest, ListTopRegionResponse>(request, WafMeta.listTopRegion, hcClient);
    }

    /**
     * 查询被攻击url
     * 查询被攻击url
     *
     * @param ListTopUrlRequest 请求对象
     * @return CompletableFuture<ListTopUrlResponse>
     */
    public CompletableFuture<ListTopUrlResponse> listTopUrlAsync(ListTopUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopUrl);
    }

    /**
     * 查询被攻击url
     * 查询被攻击url
     *
     * @param ListTopUrlRequest 请求对象
     * @return AsyncInvoker<ListTopUrlRequest, ListTopUrlResponse>
     */
    public AsyncInvoker<ListTopUrlRequest, ListTopUrlResponse> listTopUrlAsyncInvoker(ListTopUrlRequest request) {
        return new AsyncInvoker<ListTopUrlRequest, ListTopUrlResponse>(request, WafMeta.listTopUrl, hcClient);
    }

    /**
     * 查询事件日志中的url
     * 查询QPS。
     *
     * @param ListUrlRequest 请求对象
     * @return CompletableFuture<ListUrlResponse>
     */
    public CompletableFuture<ListUrlResponse> listUrlAsync(ListUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listUrl);
    }

    /**
     * 查询事件日志中的url
     * 查询QPS。
     *
     * @param ListUrlRequest 请求对象
     * @return AsyncInvoker<ListUrlRequest, ListUrlResponse>
     */
    public AsyncInvoker<ListUrlRequest, ListUrlResponse> listUrlAsyncInvoker(ListUrlRequest request) {
        return new AsyncInvoker<ListUrlRequest, ListUrlResponse>(request, WafMeta.listUrl, hcClient);
    }

    /**
     * 查询引用表列表
     * 查询引用表列表
     *
     * @param ListValueListRequest 请求对象
     * @return CompletableFuture<ListValueListResponse>
     */
    public CompletableFuture<ListValueListResponse> listValueListAsync(ListValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listValueList);
    }

    /**
     * 查询引用表列表
     * 查询引用表列表
     *
     * @param ListValueListRequest 请求对象
     * @return AsyncInvoker<ListValueListRequest, ListValueListResponse>
     */
    public AsyncInvoker<ListValueListRequest, ListValueListResponse> listValueListAsyncInvoker(ListValueListRequest request) {
        return new AsyncInvoker<ListValueListRequest, ListValueListResponse>(request, WafMeta.listValueList, hcClient);
    }

    /**
     * 查询反爬虫防护规则
     * 根据Id查询反爬虫防护规则
     *
     * @param ShowAnticrawlerRuleRequest 请求对象
     * @return CompletableFuture<ShowAnticrawlerRuleResponse>
     */
    public CompletableFuture<ShowAnticrawlerRuleResponse> showAnticrawlerRuleAsync(ShowAnticrawlerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showAnticrawlerRule);
    }

    /**
     * 查询反爬虫防护规则
     * 根据Id查询反爬虫防护规则
     *
     * @param ShowAnticrawlerRuleRequest 请求对象
     * @return AsyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse>
     */
    public AsyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> showAnticrawlerRuleAsyncInvoker(ShowAnticrawlerRuleRequest request) {
        return new AsyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse>(request, WafMeta.showAnticrawlerRule, hcClient);
    }

    /**
     * 查询防敏感信息泄露防护规则
     * 根据Id查询防敏感信息泄露防护规则
     *
     * @param ShowAntileakageRuleRequest 请求对象
     * @return CompletableFuture<ShowAntileakageRuleResponse>
     */
    public CompletableFuture<ShowAntileakageRuleResponse> showAntileakageRuleAsync(ShowAntileakageRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showAntileakageRule);
    }

    /**
     * 查询防敏感信息泄露防护规则
     * 根据Id查询防敏感信息泄露防护规则
     *
     * @param ShowAntileakageRuleRequest 请求对象
     * @return AsyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse>
     */
    public AsyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> showAntileakageRuleAsyncInvoker(ShowAntileakageRuleRequest request) {
        return new AsyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse>(request, WafMeta.showAntileakageRule, hcClient);
    }

    /**
     * 根据Id查询cc防护规则
     * 根据Id查询cc防护规则
     *
     * @param ShowCcRuleRequest 请求对象
     * @return CompletableFuture<ShowCcRuleResponse>
     */
    public CompletableFuture<ShowCcRuleResponse> showCcRuleAsync(ShowCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showCcRule);
    }

    /**
     * 根据Id查询cc防护规则
     * 根据Id查询cc防护规则
     *
     * @param ShowCcRuleRequest 请求对象
     * @return AsyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse>
     */
    public AsyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse> showCcRuleAsyncInvoker(ShowCcRuleRequest request) {
        return new AsyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse>(request, WafMeta.showCcRule, hcClient);
    }

    /**
     * 查询证书
     * 查询证书
     *
     * @param ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse>
     */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showCertificate);
    }

    /**
     * 查询证书
     * 查询证书
     *
     * @param ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(ShowCertificateRequest request) {
        return new AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, WafMeta.showCertificate, hcClient);
    }

    /**
     * 根据Id查询精准防护规则
     * 根据Id查询精准防护规则
     *
     * @param ShowCustomRuleRequest 请求对象
     * @return CompletableFuture<ShowCustomRuleResponse>
     */
    public CompletableFuture<ShowCustomRuleResponse> showCustomRuleAsync(ShowCustomRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showCustomRule);
    }

    /**
     * 根据Id查询精准防护规则
     * 根据Id查询精准防护规则
     *
     * @param ShowCustomRuleRequest 请求对象
     * @return AsyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse>
     */
    public AsyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse> showCustomRuleAsyncInvoker(ShowCustomRuleRequest request) {
        return new AsyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse>(request, WafMeta.showCustomRule, hcClient);
    }

    /**
     * 根据Id查询地理位置防护规则
     * 根据Id查询地理位置防护规则
     *
     * @param ShowGeoipRuleRequest 请求对象
     * @return CompletableFuture<ShowGeoipRuleResponse>
     */
    public CompletableFuture<ShowGeoipRuleResponse> showGeoipRuleAsync(ShowGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showGeoipRule);
    }

    /**
     * 根据Id查询地理位置防护规则
     * 根据Id查询地理位置防护规则
     *
     * @param ShowGeoipRuleRequest 请求对象
     * @return AsyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse>
     */
    public AsyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse> showGeoipRuleAsyncInvoker(ShowGeoipRuleRequest request) {
        return new AsyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse>(request, WafMeta.showGeoipRule, hcClient);
    }

    /**
     * 根据Id查询云模式防护域名
     * 根据Id查询云模式防护域名
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showInstance);
    }

    /**
     * 根据Id查询云模式防护域名
     * 根据Id查询云模式防护域名
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, WafMeta.showInstance, hcClient);
    }

    /**
     * 获取云模式域名路由信息
     * 返回路由信息
     *
     * @param ShowInstanceRouteRequest 请求对象
     * @return CompletableFuture<ShowInstanceRouteResponse>
     */
    public CompletableFuture<ShowInstanceRouteResponse> showInstanceRouteAsync(ShowInstanceRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showInstanceRoute);
    }

    /**
     * 获取云模式域名路由信息
     * 返回路由信息
     *
     * @param ShowInstanceRouteRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRouteRequest, ShowInstanceRouteResponse>
     */
    public AsyncInvoker<ShowInstanceRouteRequest, ShowInstanceRouteResponse> showInstanceRouteAsyncInvoker(ShowInstanceRouteRequest request) {
        return new AsyncInvoker<ShowInstanceRouteRequest, ShowInstanceRouteResponse>(request, WafMeta.showInstanceRoute, hcClient);
    }

    /**
     * 查看独享模式域名配置
     * 查看独享模式域名配置
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return CompletableFuture<ShowPremiumHostResponse>
     */
    public CompletableFuture<ShowPremiumHostResponse> showPremiumHostAsync(ShowPremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showPremiumHost);
    }

    /**
     * 查看独享模式域名配置
     * 查看独享模式域名配置
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return AsyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>
     */
    public AsyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHostAsyncInvoker(ShowPremiumHostRequest request) {
        return new AsyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>(request, WafMeta.showPremiumHost, hcClient);
    }

    /**
     * 更新反爬虫防护规则
     * 更新反爬虫防护规则
     *
     * @param UpdateAnticrawlerRuleRequest 请求对象
     * @return CompletableFuture<UpdateAnticrawlerRuleResponse>
     */
    public CompletableFuture<UpdateAnticrawlerRuleResponse> updateAnticrawlerRuleAsync(UpdateAnticrawlerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateAnticrawlerRule);
    }

    /**
     * 更新反爬虫防护规则
     * 更新反爬虫防护规则
     *
     * @param UpdateAnticrawlerRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse>
     */
    public AsyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> updateAnticrawlerRuleAsyncInvoker(UpdateAnticrawlerRuleRequest request) {
        return new AsyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse>(request, WafMeta.updateAnticrawlerRule, hcClient);
    }

    /**
     * 更新防敏感信息泄露防护规则
     * 更新防敏感信息泄露防护规则
     *
     * @param UpdateAntileakageRuleRequest 请求对象
     * @return CompletableFuture<UpdateAntileakageRuleResponse>
     */
    public CompletableFuture<UpdateAntileakageRuleResponse> updateAntileakageRuleAsync(UpdateAntileakageRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateAntileakageRule);
    }

    /**
     * 更新防敏感信息泄露防护规则
     * 更新防敏感信息泄露防护规则
     *
     * @param UpdateAntileakageRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse>
     */
    public AsyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> updateAntileakageRuleAsyncInvoker(UpdateAntileakageRuleRequest request) {
        return new AsyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse>(request, WafMeta.updateAntileakageRule, hcClient);
    }

    /**
     * 更新cc防护规则
     * 更新cc防护规则
     *
     * @param UpdateCcRuleRequest 请求对象
     * @return CompletableFuture<UpdateCcRuleResponse>
     */
    public CompletableFuture<UpdateCcRuleResponse> updateCcRuleAsync(UpdateCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateCcRule);
    }

    /**
     * 更新cc防护规则
     * 更新cc防护规则
     *
     * @param UpdateCcRuleRequest 请求对象
     * @return AsyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse>
     */
    public AsyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse> updateCcRuleAsyncInvoker(UpdateCcRuleRequest request) {
        return new AsyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse>(request, WafMeta.updateCcRule, hcClient);
    }

    /**
     * 修改证书
     * 修改证书
     *
     * @param UpdateCertificateRequest 请求对象
     * @return CompletableFuture<UpdateCertificateResponse>
     */
    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateCertificate);
    }

    /**
     * 修改证书
     * 修改证书
     *
     * @param UpdateCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(UpdateCertificateRequest request) {
        return new AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, WafMeta.updateCertificate, hcClient);
    }

    /**
     * 更新精准防护规则
     * 更新精准防护规则
     *
     * @param UpdateCustomRuleRequest 请求对象
     * @return CompletableFuture<UpdateCustomRuleResponse>
     */
    public CompletableFuture<UpdateCustomRuleResponse> updateCustomRuleAsync(UpdateCustomRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateCustomRule);
    }

    /**
     * 更新精准防护规则
     * 更新精准防护规则
     *
     * @param UpdateCustomRuleRequest 请求对象
     * @return AsyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse>
     */
    public AsyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse> updateCustomRuleAsyncInvoker(UpdateCustomRuleRequest request) {
        return new AsyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse>(request, WafMeta.updateCustomRule, hcClient);
    }

    /**
     * 更新地理位置防护规则
     * 更新地理位置防护规则
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return CompletableFuture<UpdateGeoipRuleResponse>
     */
    public CompletableFuture<UpdateGeoipRuleResponse> updateGeoipRuleAsync(UpdateGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateGeoipRule);
    }

    /**
     * 更新地理位置防护规则
     * 更新地理位置防护规则
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return AsyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>
     */
    public AsyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRuleAsyncInvoker(UpdateGeoipRuleRequest request) {
        return new AsyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>(request, WafMeta.updateGeoipRule, hcClient);
    }

    /**
     * 更新云模式防护域名
     * 更新云模式防护域名
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateInstance);
    }

    /**
     * 更新云模式防护域名
     * 更新云模式防护域名
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, WafMeta.updateInstance, hcClient);
    }

    /**
     * 更新防护策略
     * 更新防护策略，请求体可只传需要更新的部分
     *
     * @param UpdatePatchPolicyRequest 请求对象
     * @return CompletableFuture<UpdatePatchPolicyResponse>
     */
    public CompletableFuture<UpdatePatchPolicyResponse> updatePatchPolicyAsync(UpdatePatchPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePatchPolicy);
    }

    /**
     * 更新防护策略
     * 更新防护策略，请求体可只传需要更新的部分
     *
     * @param UpdatePatchPolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePatchPolicyRequest, UpdatePatchPolicyResponse>
     */
    public AsyncInvoker<UpdatePatchPolicyRequest, UpdatePatchPolicyResponse> updatePatchPolicyAsyncInvoker(UpdatePatchPolicyRequest request) {
        return new AsyncInvoker<UpdatePatchPolicyRequest, UpdatePatchPolicyResponse>(request, WafMeta.updatePatchPolicy, hcClient);
    }

    /**
     * 修改独享模式域名配置
     * 修改独享模式域名配置
     *
     * @param UpdatePremiumHostRequest 请求对象
     * @return CompletableFuture<UpdatePremiumHostResponse>
     */
    public CompletableFuture<UpdatePremiumHostResponse> updatePremiumHostAsync(UpdatePremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePremiumHost);
    }

    /**
     * 修改独享模式域名配置
     * 修改独享模式域名配置
     *
     * @param UpdatePremiumHostRequest 请求对象
     * @return AsyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>
     */
    public AsyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHostAsyncInvoker(UpdatePremiumHostRequest request) {
        return new AsyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>(request, WafMeta.updatePremiumHost, hcClient);
    }

    /**
     * 修改独享模式域名接入状态
     * 修改独享模式域名接入状态
     *
     * @param UpdatePremiumHostAccessStatusRequest 请求对象
     * @return CompletableFuture<UpdatePremiumHostAccessStatusResponse>
     */
    public CompletableFuture<UpdatePremiumHostAccessStatusResponse> updatePremiumHostAccessStatusAsync(UpdatePremiumHostAccessStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePremiumHostAccessStatus);
    }

    /**
     * 修改独享模式域名接入状态
     * 修改独享模式域名接入状态
     *
     * @param UpdatePremiumHostAccessStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse>
     */
    public AsyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> updatePremiumHostAccessStatusAsyncInvoker(UpdatePremiumHostAccessStatusRequest request) {
        return new AsyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse>(request, WafMeta.updatePremiumHostAccessStatus, hcClient);
    }

    /**
     * 修改独享模式域名防护状态
     * 修改独享模式域名防护状态
     *
     * @param UpdatePremiumHostProtectStatusRequest 请求对象
     * @return CompletableFuture<UpdatePremiumHostProtectStatusResponse>
     */
    public CompletableFuture<UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusAsync(UpdatePremiumHostProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePremiumHostProtectStatus);
    }

    /**
     * 修改独享模式域名防护状态
     * 修改独享模式域名防护状态
     *
     * @param UpdatePremiumHostProtectStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>
     */
    public AsyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusAsyncInvoker(UpdatePremiumHostProtectStatusRequest request) {
        return new AsyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>(request, WafMeta.updatePremiumHostProtectStatus, hcClient);
    }

    /**
     * 创建WAF独享引擎组
     * 创建WAF独享引擎组
     *
     * @param CreatePoolRequest 请求对象
     * @return CompletableFuture<CreatePoolResponse>
     */
    public CompletableFuture<CreatePoolResponse> createPoolAsync(CreatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPool);
    }

    /**
     * 创建WAF独享引擎组
     * 创建WAF独享引擎组
     *
     * @param CreatePoolRequest 请求对象
     * @return AsyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public AsyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolAsyncInvoker(CreatePoolRequest request) {
        return new AsyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, WafMeta.createPool, hcClient);
    }

    /**
     * 删除WAF独享引擎组
     * 删除WAF独享引擎组
     *
     * @param DeletePoolRequest 请求对象
     * @return CompletableFuture<DeletePoolResponse>
     */
    public CompletableFuture<DeletePoolResponse> deletePoolAsync(DeletePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePool);
    }

    /**
     * 删除WAF独享引擎组
     * 删除WAF独享引擎组
     *
     * @param DeletePoolRequest 请求对象
     * @return AsyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public AsyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolAsyncInvoker(DeletePoolRequest request) {
        return new AsyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, WafMeta.deletePool, hcClient);
    }

    /**
     * 查询WAF独享引擎组列表
     * 查询WAF独享引擎组列表
     *
     * @param ListPoolsRequest 请求对象
     * @return CompletableFuture<ListPoolsResponse>
     */
    public CompletableFuture<ListPoolsResponse> listPoolsAsync(ListPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPools);
    }

    /**
     * 查询WAF独享引擎组列表
     * 查询WAF独享引擎组列表
     *
     * @param ListPoolsRequest 请求对象
     * @return AsyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public AsyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsAsyncInvoker(ListPoolsRequest request) {
        return new AsyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, WafMeta.listPools, hcClient);
    }

    /**
     * 查询WAF独享引擎组信息
     * 查询WAF独享引擎组信息
     *
     * @param ShowPoolRequest 请求对象
     * @return CompletableFuture<ShowPoolResponse>
     */
    public CompletableFuture<ShowPoolResponse> showPoolAsync(ShowPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showPool);
    }

    /**
     * 查询WAF独享引擎组信息
     * 查询WAF独享引擎组信息
     *
     * @param ShowPoolRequest 请求对象
     * @return AsyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public AsyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolAsyncInvoker(ShowPoolRequest request) {
        return new AsyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, WafMeta.showPool, hcClient);
    }

    /**
     * 修改WAF独享引擎组信息
     * 修改WAF独享引擎组信息
     *
     * @param UpdatePoolRequest 请求对象
     * @return CompletableFuture<UpdatePoolResponse>
     */
    public CompletableFuture<UpdatePoolResponse> updatePoolAsync(UpdatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePool);
    }

    /**
     * 修改WAF独享引擎组信息
     * 修改WAF独享引擎组信息
     *
     * @param UpdatePoolRequest 请求对象
     * @return AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolAsyncInvoker(UpdatePoolRequest request) {
        return new AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, WafMeta.updatePool, hcClient);
    }

}
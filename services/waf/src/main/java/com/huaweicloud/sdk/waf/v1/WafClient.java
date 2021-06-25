package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.waf.v1.model.*;

public class WafClient {
    protected HcClient hcClient;

    public WafClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WafClient> newBuilder() {
        return new ClientBuilder<>(WafClient::new);
    }


    /**
     * 查询租户云模式订购信息
     * 查询租户云模式订购信息，包括包周期、按需计费
     *
     * @param ConfirmCloudWafSubscriptionInfoRequest 请求对象
     * @return ConfirmCloudWafSubscriptionInfoResponse
     */
    public ConfirmCloudWafSubscriptionInfoResponse confirmCloudWafSubscriptionInfo(ConfirmCloudWafSubscriptionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmCloudWafSubscriptionInfo);
    }

    /**
     * 查询租户云模式订购信息
     * 查询租户云模式订购信息，包括包周期、按需计费
     *
     * @param ConfirmCloudWafSubscriptionInfoRequest 请求对象
     * @return SyncInvoker<ConfirmCloudWafSubscriptionInfoRequest, ConfirmCloudWafSubscriptionInfoResponse>
     */
    public SyncInvoker<ConfirmCloudWafSubscriptionInfoRequest, ConfirmCloudWafSubscriptionInfoResponse> confirmCloudWafSubscriptionInfoInvoker(ConfirmCloudWafSubscriptionInfoRequest request) {
        return new SyncInvoker<ConfirmCloudWafSubscriptionInfoRequest, ConfirmCloudWafSubscriptionInfoResponse>(request, WafMeta.confirmCloudWafSubscriptionInfo, hcClient);
    }

    /**
     * 获取用户套餐信息
     * 获取用户购买的WAF规格信息
     *
     * @param ConfirmUserBundleRequest 请求对象
     * @return ConfirmUserBundleResponse
     */
    public ConfirmUserBundleResponse confirmUserBundle(ConfirmUserBundleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmUserBundle);
    }

    /**
     * 获取用户套餐信息
     * 获取用户购买的WAF规格信息
     *
     * @param ConfirmUserBundleRequest 请求对象
     * @return SyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse>
     */
    public SyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse> confirmUserBundleInvoker(ConfirmUserBundleRequest request) {
        return new SyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse>(request, WafMeta.confirmUserBundle, hcClient);
    }

    /**
     * 创建反爬虫规则
     * 创建反爬虫规则
     *
     * @param CreateAnticrawlerRulesRequest 请求对象
     * @return CreateAnticrawlerRulesResponse
     */
    public CreateAnticrawlerRulesResponse createAnticrawlerRules(CreateAnticrawlerRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createAnticrawlerRules);
    }

    /**
     * 创建反爬虫规则
     * 创建反爬虫规则
     *
     * @param CreateAnticrawlerRulesRequest 请求对象
     * @return SyncInvoker<CreateAnticrawlerRulesRequest, CreateAnticrawlerRulesResponse>
     */
    public SyncInvoker<CreateAnticrawlerRulesRequest, CreateAnticrawlerRulesResponse> createAnticrawlerRulesInvoker(CreateAnticrawlerRulesRequest request) {
        return new SyncInvoker<CreateAnticrawlerRulesRequest, CreateAnticrawlerRulesResponse>(request, WafMeta.createAnticrawlerRules, hcClient);
    }

    /**
     * 创建防敏感信息泄露规则
     * 创建防敏感信息泄露规则
     *
     * @param CreateAntileakageRulesRequest 请求对象
     * @return CreateAntileakageRulesResponse
     */
    public CreateAntileakageRulesResponse createAntileakageRules(CreateAntileakageRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createAntileakageRules);
    }

    /**
     * 创建防敏感信息泄露规则
     * 创建防敏感信息泄露规则
     *
     * @param CreateAntileakageRulesRequest 请求对象
     * @return SyncInvoker<CreateAntileakageRulesRequest, CreateAntileakageRulesResponse>
     */
    public SyncInvoker<CreateAntileakageRulesRequest, CreateAntileakageRulesResponse> createAntileakageRulesInvoker(CreateAntileakageRulesRequest request) {
        return new SyncInvoker<CreateAntileakageRulesRequest, CreateAntileakageRulesResponse>(request, WafMeta.createAntileakageRules, hcClient);
    }

    /**
     * 创建cc规则
     * 创建cc规则
     *
     * @param CreateCcRuleRequest 请求对象
     * @return CreateCcRuleResponse
     */
    public CreateCcRuleResponse createCcRule(CreateCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createCcRule);
    }

    /**
     * 创建cc规则
     * 创建cc规则
     *
     * @param CreateCcRuleRequest 请求对象
     * @return SyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse>
     */
    public SyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse> createCcRuleInvoker(CreateCcRuleRequest request) {
        return new SyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse>(request, WafMeta.createCcRule, hcClient);
    }

    /**
     * 创建证书
     * 创建证书
     *
     * @param CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createCertificate);
    }

    /**
     * 创建证书
     * 创建证书
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, WafMeta.createCertificate, hcClient);
    }

    /**
     * 创建精准防护规则
     * 创建精准防护规则
     *
     * @param CreateCustomRulesRequest 请求对象
     * @return CreateCustomRulesResponse
     */
    public CreateCustomRulesResponse createCustomRules(CreateCustomRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createCustomRules);
    }

    /**
     * 创建精准防护规则
     * 创建精准防护规则
     *
     * @param CreateCustomRulesRequest 请求对象
     * @return SyncInvoker<CreateCustomRulesRequest, CreateCustomRulesResponse>
     */
    public SyncInvoker<CreateCustomRulesRequest, CreateCustomRulesResponse> createCustomRulesInvoker(CreateCustomRulesRequest request) {
        return new SyncInvoker<CreateCustomRulesRequest, CreateCustomRulesResponse>(request, WafMeta.createCustomRules, hcClient);
    }

    /**
     * 创建地理位置规则
     * 创建地理位置规则
     *
     * @param CreateGeoipRulesRequest 请求对象
     * @return CreateGeoipRulesResponse
     */
    public CreateGeoipRulesResponse createGeoipRules(CreateGeoipRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createGeoipRules);
    }

    /**
     * 创建地理位置规则
     * 创建地理位置规则
     *
     * @param CreateGeoipRulesRequest 请求对象
     * @return SyncInvoker<CreateGeoipRulesRequest, CreateGeoipRulesResponse>
     */
    public SyncInvoker<CreateGeoipRulesRequest, CreateGeoipRulesResponse> createGeoipRulesInvoker(CreateGeoipRulesRequest request) {
        return new SyncInvoker<CreateGeoipRulesRequest, CreateGeoipRulesResponse>(request, WafMeta.createGeoipRules, hcClient);
    }

    /**
     * 创建云模式防护域名
     * 创建云模式防护域名
     *
     * @param CreateInstaneRequest 请求对象
     * @return CreateInstaneResponse
     */
    public CreateInstaneResponse createInstane(CreateInstaneRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createInstane);
    }

    /**
     * 创建云模式防护域名
     * 创建云模式防护域名
     *
     * @param CreateInstaneRequest 请求对象
     * @return SyncInvoker<CreateInstaneRequest, CreateInstaneResponse>
     */
    public SyncInvoker<CreateInstaneRequest, CreateInstaneResponse> createInstaneInvoker(CreateInstaneRequest request) {
        return new SyncInvoker<CreateInstaneRequest, CreateInstaneResponse>(request, WafMeta.createInstane, hcClient);
    }

    /**
     * 创建防护策略
     * 创建防护策略
     *
     * @param CreatePolicyRequest 请求对象
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPolicy);
    }

    /**
     * 创建防护策略
     * 创建防护策略
     *
     * @param CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, WafMeta.createPolicy, hcClient);
    }

    /**
     * 创建独享模式域名
     * 创建独享模式域名
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return CreatePremiumHostResponse
     */
    public CreatePremiumHostResponse createPremiumHost(CreatePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPremiumHost);
    }

    /**
     * 创建独享模式域名
     * 创建独享模式域名
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>
     */
    public SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHostInvoker(CreatePremiumHostRequest request) {
        return new SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>(request, WafMeta.createPremiumHost, hcClient);
    }

    /**
     * 删除反爬虫防护规则
     * 删除反爬虫防护规则
     *
     * @param DeleteAnticrawlerRuleRequest 请求对象
     * @return DeleteAnticrawlerRuleResponse
     */
    public DeleteAnticrawlerRuleResponse deleteAnticrawlerRule(DeleteAnticrawlerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteAnticrawlerRule);
    }

    /**
     * 删除反爬虫防护规则
     * 删除反爬虫防护规则
     *
     * @param DeleteAnticrawlerRuleRequest 请求对象
     * @return SyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse>
     */
    public SyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> deleteAnticrawlerRuleInvoker(DeleteAnticrawlerRuleRequest request) {
        return new SyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse>(request, WafMeta.deleteAnticrawlerRule, hcClient);
    }

    /**
     * 删除防敏感信息泄露防护规则
     * 删除防敏感信息泄露防护规则
     *
     * @param DeleteAntileakageRuleRequest 请求对象
     * @return DeleteAntileakageRuleResponse
     */
    public DeleteAntileakageRuleResponse deleteAntileakageRule(DeleteAntileakageRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteAntileakageRule);
    }

    /**
     * 删除防敏感信息泄露防护规则
     * 删除防敏感信息泄露防护规则
     *
     * @param DeleteAntileakageRuleRequest 请求对象
     * @return SyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse>
     */
    public SyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> deleteAntileakageRuleInvoker(DeleteAntileakageRuleRequest request) {
        return new SyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse>(request, WafMeta.deleteAntileakageRule, hcClient);
    }

    /**
     * 删除cc防护规则
     * 删除cc防护规则
     *
     * @param DeleteCcRuleRequest 请求对象
     * @return DeleteCcRuleResponse
     */
    public DeleteCcRuleResponse deleteCcRule(DeleteCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteCcRule);
    }

    /**
     * 删除cc防护规则
     * 删除cc防护规则
     *
     * @param DeleteCcRuleRequest 请求对象
     * @return SyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse>
     */
    public SyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse> deleteCcRuleInvoker(DeleteCcRuleRequest request) {
        return new SyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse>(request, WafMeta.deleteCcRule, hcClient);
    }

    /**
     * 删除证书
     * 删除证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteCertificate);
    }

    /**
     * 删除证书
     * 删除证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, WafMeta.deleteCertificate, hcClient);
    }

    /**
     * 删除精准防护规则
     * 删除精准防护规则
     *
     * @param DeleteCustomRuleRequest 请求对象
     * @return DeleteCustomRuleResponse
     */
    public DeleteCustomRuleResponse deleteCustomRule(DeleteCustomRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteCustomRule);
    }

    /**
     * 删除精准防护规则
     * 删除精准防护规则
     *
     * @param DeleteCustomRuleRequest 请求对象
     * @return SyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse>
     */
    public SyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse> deleteCustomRuleInvoker(DeleteCustomRuleRequest request) {
        return new SyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse>(request, WafMeta.deleteCustomRule, hcClient);
    }

    /**
     * 删除地理位置防护规则
     * 删除地理位置防护规则
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return DeleteGeoipRuleResponse
     */
    public DeleteGeoipRuleResponse deleteGeoipRule(DeleteGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteGeoipRule);
    }

    /**
     * 删除地理位置防护规则
     * 删除地理位置防护规则
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>
     */
    public SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRuleInvoker(DeleteGeoipRuleRequest request) {
        return new SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>(request, WafMeta.deleteGeoipRule, hcClient);
    }

    /**
     * 删除云模式防护域名
     * 删除云模式防护域名
     *
     * @param DeleteInstaneRequest 请求对象
     * @return DeleteInstaneResponse
     */
    public DeleteInstaneResponse deleteInstane(DeleteInstaneRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteInstane);
    }

    /**
     * 删除云模式防护域名
     * 删除云模式防护域名
     *
     * @param DeleteInstaneRequest 请求对象
     * @return SyncInvoker<DeleteInstaneRequest, DeleteInstaneResponse>
     */
    public SyncInvoker<DeleteInstaneRequest, DeleteInstaneResponse> deleteInstaneInvoker(DeleteInstaneRequest request) {
        return new SyncInvoker<DeleteInstaneRequest, DeleteInstaneResponse>(request, WafMeta.deleteInstane, hcClient);
    }

    /**
     * 删除防护策略
     * 删除防护策略
     *
     * @param DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     * 删除防护策略
     *
     * @param DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, WafMeta.deletePolicy, hcClient);
    }

    /**
     * 删除独享模式域名
     * 删除独享模式域名
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return DeletePremiumHostResponse
     */
    public DeletePremiumHostResponse deletePremiumHost(DeletePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePremiumHost);
    }

    /**
     * 删除独享模式域名
     * 删除独享模式域名
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>
     */
    public SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHostInvoker(DeletePremiumHostRequest request) {
        return new SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>(request, WafMeta.deletePremiumHost, hcClient);
    }

    /**
     * 查询反爬虫规则列表
     * 查询反爬虫规则列表
     *
     * @param ListAnticrawlerRulesRequest 请求对象
     * @return ListAnticrawlerRulesResponse
     */
    public ListAnticrawlerRulesResponse listAnticrawlerRules(ListAnticrawlerRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAnticrawlerRules);
    }

    /**
     * 查询反爬虫规则列表
     * 查询反爬虫规则列表
     *
     * @param ListAnticrawlerRulesRequest 请求对象
     * @return SyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse>
     */
    public SyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> listAnticrawlerRulesInvoker(ListAnticrawlerRulesRequest request) {
        return new SyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse>(request, WafMeta.listAnticrawlerRules, hcClient);
    }

    /**
     * 查询防敏感信息泄露规则列表
     * 查询防敏感信息泄露规则列表
     *
     * @param ListAntileakageRulesRequest 请求对象
     * @return ListAntileakageRulesResponse
     */
    public ListAntileakageRulesResponse listAntileakageRules(ListAntileakageRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAntileakageRules);
    }

    /**
     * 查询防敏感信息泄露规则列表
     * 查询防敏感信息泄露规则列表
     *
     * @param ListAntileakageRulesRequest 请求对象
     * @return SyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse>
     */
    public SyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse> listAntileakageRulesInvoker(ListAntileakageRulesRequest request) {
        return new SyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse>(request, WafMeta.listAntileakageRules, hcClient);
    }

    /**
     * 查询攻击防护类型
     * 查询攻击防护类型
     *
     * @param ListAttackActionRequest 请求对象
     * @return ListAttackActionResponse
     */
    public ListAttackActionResponse listAttackAction(ListAttackActionRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAttackAction);
    }

    /**
     * 查询攻击防护类型
     * 查询攻击防护类型
     *
     * @param ListAttackActionRequest 请求对象
     * @return SyncInvoker<ListAttackActionRequest, ListAttackActionResponse>
     */
    public SyncInvoker<ListAttackActionRequest, ListAttackActionResponse> listAttackActionInvoker(ListAttackActionRequest request) {
        return new SyncInvoker<ListAttackActionRequest, ListAttackActionResponse>(request, WafMeta.listAttackAction, hcClient);
    }

    /**
     * 查询攻击事件分布
     * 查询攻击事件分布
     *
     * @param ListAttackDistributionRequest 请求对象
     * @return ListAttackDistributionResponse
     */
    public ListAttackDistributionResponse listAttackDistribution(ListAttackDistributionRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAttackDistribution);
    }

    /**
     * 查询攻击事件分布
     * 查询攻击事件分布
     *
     * @param ListAttackDistributionRequest 请求对象
     * @return SyncInvoker<ListAttackDistributionRequest, ListAttackDistributionResponse>
     */
    public SyncInvoker<ListAttackDistributionRequest, ListAttackDistributionResponse> listAttackDistributionInvoker(ListAttackDistributionRequest request) {
        return new SyncInvoker<ListAttackDistributionRequest, ListAttackDistributionResponse>(request, WafMeta.listAttackDistribution, hcClient);
    }

    /**
     * 查询安全统计带宽数据
     * 查询安全统计带宽数据
     *
     * @param ListBandwidthTimelineRequest 请求对象
     * @return ListBandwidthTimelineResponse
     */
    public ListBandwidthTimelineResponse listBandwidthTimeline(ListBandwidthTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listBandwidthTimeline);
    }

    /**
     * 查询安全统计带宽数据
     * 查询安全统计带宽数据
     *
     * @param ListBandwidthTimelineRequest 请求对象
     * @return SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>
     */
    public SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimelineInvoker(ListBandwidthTimelineRequest request) {
        return new SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>(request, WafMeta.listBandwidthTimeline, hcClient);
    }

    /**
     * 查询cc规则列表
     * 查询cc规则列表
     *
     * @param ListCcRulesRequest 请求对象
     * @return ListCcRulesResponse
     */
    public ListCcRulesResponse listCcRules(ListCcRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCcRules);
    }

    /**
     * 查询cc规则列表
     * 查询cc规则列表
     *
     * @param ListCcRulesRequest 请求对象
     * @return SyncInvoker<ListCcRulesRequest, ListCcRulesResponse>
     */
    public SyncInvoker<ListCcRulesRequest, ListCcRulesResponse> listCcRulesInvoker(ListCcRulesRequest request) {
        return new SyncInvoker<ListCcRulesRequest, ListCcRulesResponse>(request, WafMeta.listCcRules, hcClient);
    }

    /**
     * 查询证书列表
     * 查询证书列表
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCertificates);
    }

    /**
     * 查询证书列表
     * 查询证书列表
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, WafMeta.listCertificates, hcClient);
    }

    /**
     * 查询精准防护规则列表
     * 查询精准防护规则列表
     *
     * @param ListCustomRulesRequest 请求对象
     * @return ListCustomRulesResponse
     */
    public ListCustomRulesResponse listCustomRules(ListCustomRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCustomRules);
    }

    /**
     * 查询精准防护规则列表
     * 查询精准防护规则列表
     *
     * @param ListCustomRulesRequest 请求对象
     * @return SyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse>
     */
    public SyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse> listCustomRulesInvoker(ListCustomRulesRequest request) {
        return new SyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse>(request, WafMeta.listCustomRules, hcClient);
    }

    /**
     * 查询请求/攻击数量统计
     * 查询请求/攻击数量统计。
     *
     * @param ListEventByTimelineRequest 请求对象
     * @return ListEventByTimelineResponse
     */
    public ListEventByTimelineResponse listEventByTimeline(ListEventByTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listEventByTimeline);
    }

    /**
     * 查询请求/攻击数量统计
     * 查询请求/攻击数量统计。
     *
     * @param ListEventByTimelineRequest 请求对象
     * @return SyncInvoker<ListEventByTimelineRequest, ListEventByTimelineResponse>
     */
    public SyncInvoker<ListEventByTimelineRequest, ListEventByTimelineResponse> listEventByTimelineInvoker(ListEventByTimelineRequest request) {
        return new SyncInvoker<ListEventByTimelineRequest, ListEventByTimelineResponse>(request, WafMeta.listEventByTimeline, hcClient);
    }

    /**
     * 查询攻击事件详情列表
     * 查询攻击事件详情列表
     *
     * @param ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listEvents);
    }

    /**
     * 查询攻击事件详情列表
     * 查询攻击事件详情列表
     *
     * @param ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<ListEventsRequest, ListEventsResponse>(request, WafMeta.listEvents, hcClient);
    }

    /**
     * 查询地理位置规则列表
     * 查询地理位置规则列表
     *
     * @param ListGeoipRulesRequest 请求对象
     * @return ListGeoipRulesResponse
     */
    public ListGeoipRulesResponse listGeoipRules(ListGeoipRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listGeoipRules);
    }

    /**
     * 查询地理位置规则列表
     * 查询地理位置规则列表
     *
     * @param ListGeoipRulesRequest 请求对象
     * @return SyncInvoker<ListGeoipRulesRequest, ListGeoipRulesResponse>
     */
    public SyncInvoker<ListGeoipRulesRequest, ListGeoipRulesResponse> listGeoipRulesInvoker(ListGeoipRulesRequest request) {
        return new SyncInvoker<ListGeoipRulesRequest, ListGeoipRulesResponse>(request, WafMeta.listGeoipRules, hcClient);
    }

    /**
     * 查询WAF独享引擎列表
     * 查询WAF独享引擎列表
     *
     * @param ListInstanceRequest 请求对象
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listInstance);
    }

    /**
     * 查询WAF独享引擎列表
     * 查询WAF独享引擎列表
     *
     * @param ListInstanceRequest 请求对象
     * @return SyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public SyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceInvoker(ListInstanceRequest request) {
        return new SyncInvoker<ListInstanceRequest, ListInstanceResponse>(request, WafMeta.listInstance, hcClient);
    }

    /**
     * 查询云模式防护域名列表
     * 查询云模式防护域名列表
     *
     * @param ListInstanesRequest 请求对象
     * @return ListInstanesResponse
     */
    public ListInstanesResponse listInstanes(ListInstanesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listInstanes);
    }

    /**
     * 查询云模式防护域名列表
     * 查询云模式防护域名列表
     *
     * @param ListInstanesRequest 请求对象
     * @return SyncInvoker<ListInstanesRequest, ListInstanesResponse>
     */
    public SyncInvoker<ListInstanesRequest, ListInstanesResponse> listInstanesInvoker(ListInstanesRequest request) {
        return new SyncInvoker<ListInstanesRequest, ListInstanesResponse>(request, WafMeta.listInstanes, hcClient);
    }

    /**
     * 查询防护策略列表
     * 查询防护策略列表
     *
     * @param ListPolicyRequest 请求对象
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPolicy);
    }

    /**
     * 查询防护策略列表
     * 查询防护策略列表
     *
     * @param ListPolicyRequest 请求对象
     * @return SyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public SyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyInvoker(ListPolicyRequest request) {
        return new SyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, WafMeta.listPolicy, hcClient);
    }

    /**
     * 独享模式域名列表
     * 独享模式域名列表
     *
     * @param ListPremiumHostRequest 请求对象
     * @return ListPremiumHostResponse
     */
    public ListPremiumHostResponse listPremiumHost(ListPremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPremiumHost);
    }

    /**
     * 独享模式域名列表
     * 独享模式域名列表
     *
     * @param ListPremiumHostRequest 请求对象
     * @return SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>
     */
    public SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHostInvoker(ListPremiumHostRequest request) {
        return new SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>(request, WafMeta.listPremiumHost, hcClient);
    }

    /**
     * 查询QPS
     * 查询QPS。
     *
     * @param ListQpsRequest 请求对象
     * @return ListQpsResponse
     */
    public ListQpsResponse listQps(ListQpsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listQps);
    }

    /**
     * 查询QPS
     * 查询QPS。
     *
     * @param ListQpsRequest 请求对象
     * @return SyncInvoker<ListQpsRequest, ListQpsResponse>
     */
    public SyncInvoker<ListQpsRequest, ListQpsResponse> listQpsInvoker(ListQpsRequest request) {
        return new SyncInvoker<ListQpsRequest, ListQpsResponse>(request, WafMeta.listQps, hcClient);
    }

    /**
     * 查询安全统计qps次数
     * 查询安全统计qps次数
     *
     * @param ListQpsTimelineRequest 请求对象
     * @return ListQpsTimelineResponse
     */
    public ListQpsTimelineResponse listQpsTimeline(ListQpsTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listQpsTimeline);
    }

    /**
     * 查询安全统计qps次数
     * 查询安全统计qps次数
     *
     * @param ListQpsTimelineRequest 请求对象
     * @return SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>
     */
    public SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimelineInvoker(ListQpsTimelineRequest request) {
        return new SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>(request, WafMeta.listQpsTimeline, hcClient);
    }

    /**
     * 查询安全统计请求次数
     * 查询安全统计请求次数
     *
     * @param ListRequestTimelineRequest 请求对象
     * @return ListRequestTimelineResponse
     */
    public ListRequestTimelineResponse listRequestTimeline(ListRequestTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listRequestTimeline);
    }

    /**
     * 查询安全统计请求次数
     * 查询安全统计请求次数
     *
     * @param ListRequestTimelineRequest 请求对象
     * @return SyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>
     */
    public SyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimelineInvoker(ListRequestTimelineRequest request) {
        return new SyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>(request, WafMeta.listRequestTimeline, hcClient);
    }

    /**
     * 查询安全统计响应码数据
     * 查询安全统计响应码数据
     *
     * @param ListResponseCodeTimelineRequest 请求对象
     * @return ListResponseCodeTimelineResponse
     */
    public ListResponseCodeTimelineResponse listResponseCodeTimeline(ListResponseCodeTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listResponseCodeTimeline);
    }

    /**
     * 查询安全统计响应码数据
     * 查询安全统计响应码数据
     *
     * @param ListResponseCodeTimelineRequest 请求对象
     * @return SyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse>
     */
    public SyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> listResponseCodeTimelineInvoker(ListResponseCodeTimelineRequest request) {
        return new SyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse>(request, WafMeta.listResponseCodeTimeline, hcClient);
    }

    /**
     * 查询被攻击次数前五的域名
     * 查询被攻击次数前五的域名
     *
     * @param ListSourceDomainTop5Request 请求对象
     * @return ListSourceDomainTop5Response
     */
    public ListSourceDomainTop5Response listSourceDomainTop5(ListSourceDomainTop5Request request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listSourceDomainTop5);
    }

    /**
     * 查询被攻击次数前五的域名
     * 查询被攻击次数前五的域名
     *
     * @param ListSourceDomainTop5Request 请求对象
     * @return SyncInvoker<ListSourceDomainTop5Request, ListSourceDomainTop5Response>
     */
    public SyncInvoker<ListSourceDomainTop5Request, ListSourceDomainTop5Response> listSourceDomainTop5Invoker(ListSourceDomainTop5Request request) {
        return new SyncInvoker<ListSourceDomainTop5Request, ListSourceDomainTop5Response>(request, WafMeta.listSourceDomainTop5, hcClient);
    }

    /**
     * 查询攻击源IP的个数
     * 查询攻击源IP的个数。
     *
     * @param ListSourceIpNumRequest 请求对象
     * @return ListSourceIpNumResponse
     */
    public ListSourceIpNumResponse listSourceIpNum(ListSourceIpNumRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listSourceIpNum);
    }

    /**
     * 查询攻击源IP的个数
     * 查询攻击源IP的个数。
     *
     * @param ListSourceIpNumRequest 请求对象
     * @return SyncInvoker<ListSourceIpNumRequest, ListSourceIpNumResponse>
     */
    public SyncInvoker<ListSourceIpNumRequest, ListSourceIpNumResponse> listSourceIpNumInvoker(ListSourceIpNumRequest request) {
        return new SyncInvoker<ListSourceIpNumRequest, ListSourceIpNumResponse>(request, WafMeta.listSourceIpNum, hcClient);
    }

    /**
     * 查询攻击源ip
     * 查询攻击源ip
     *
     * @param ListSourceIpTop5Request 请求对象
     * @return ListSourceIpTop5Response
     */
    public ListSourceIpTop5Response listSourceIpTop5(ListSourceIpTop5Request request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listSourceIpTop5);
    }

    /**
     * 查询攻击源ip
     * 查询攻击源ip
     *
     * @param ListSourceIpTop5Request 请求对象
     * @return SyncInvoker<ListSourceIpTop5Request, ListSourceIpTop5Response>
     */
    public SyncInvoker<ListSourceIpTop5Request, ListSourceIpTop5Response> listSourceIpTop5Invoker(ListSourceIpTop5Request request) {
        return new SyncInvoker<ListSourceIpTop5Request, ListSourceIpTop5Response>(request, WafMeta.listSourceIpTop5, hcClient);
    }

    /**
     * 查询被攻击次数前五的url
     * 查询被攻击次数前五的url
     *
     * @param ListSourceUrlTop5Request 请求对象
     * @return ListSourceUrlTop5Response
     */
    public ListSourceUrlTop5Response listSourceUrlTop5(ListSourceUrlTop5Request request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listSourceUrlTop5);
    }

    /**
     * 查询被攻击次数前五的url
     * 查询被攻击次数前五的url
     *
     * @param ListSourceUrlTop5Request 请求对象
     * @return SyncInvoker<ListSourceUrlTop5Request, ListSourceUrlTop5Response>
     */
    public SyncInvoker<ListSourceUrlTop5Request, ListSourceUrlTop5Response> listSourceUrlTop5Invoker(ListSourceUrlTop5Request request) {
        return new SyncInvoker<ListSourceUrlTop5Request, ListSourceUrlTop5Response>(request, WafMeta.listSourceUrlTop5, hcClient);
    }

    /**
     * 查询安全总览请求数据
     * 查询安全总览请求数据
     *
     * @param ListStatisticsRequest 请求对象
     * @return ListStatisticsResponse
     */
    public ListStatisticsResponse listStatistics(ListStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listStatistics);
    }

    /**
     * 查询安全总览请求数据
     * 查询安全总览请求数据
     *
     * @param ListStatisticsRequest 请求对象
     * @return SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public SyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsInvoker(ListStatisticsRequest request) {
        return new SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>(request, WafMeta.listStatistics, hcClient);
    }

    /**
     * 查询攻击事件分布类型
     * 查询攻击事件分布类型。
     *
     * @param ListThreatsRequest 请求对象
     * @return ListThreatsResponse
     */
    public ListThreatsResponse listThreats(ListThreatsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listThreats);
    }

    /**
     * 查询攻击事件分布类型
     * 查询攻击事件分布类型。
     *
     * @param ListThreatsRequest 请求对象
     * @return SyncInvoker<ListThreatsRequest, ListThreatsResponse>
     */
    public SyncInvoker<ListThreatsRequest, ListThreatsResponse> listThreatsInvoker(ListThreatsRequest request) {
        return new SyncInvoker<ListThreatsRequest, ListThreatsResponse>(request, WafMeta.listThreats, hcClient);
    }

    /**
     * 查询业务异常监控
     * 查询业务异常监控
     *
     * @param ListTopAbnormalRequest 请求对象
     * @return ListTopAbnormalResponse
     */
    public ListTopAbnormalResponse listTopAbnormal(ListTopAbnormalRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopAbnormal);
    }

    /**
     * 查询业务异常监控
     * 查询业务异常监控
     *
     * @param ListTopAbnormalRequest 请求对象
     * @return SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>
     */
    public SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormalInvoker(ListTopAbnormalRequest request) {
        return new SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>(request, WafMeta.listTopAbnormal, hcClient);
    }

    /**
     * 查询攻击域名
     * 查询攻击域名
     *
     * @param ListTopDomainRequest 请求对象
     * @return ListTopDomainResponse
     */
    public ListTopDomainResponse listTopDomain(ListTopDomainRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopDomain);
    }

    /**
     * 查询攻击域名
     * 查询攻击域名
     *
     * @param ListTopDomainRequest 请求对象
     * @return SyncInvoker<ListTopDomainRequest, ListTopDomainResponse>
     */
    public SyncInvoker<ListTopDomainRequest, ListTopDomainResponse> listTopDomainInvoker(ListTopDomainRequest request) {
        return new SyncInvoker<ListTopDomainRequest, ListTopDomainResponse>(request, WafMeta.listTopDomain, hcClient);
    }

    /**
     * 查询攻击源ip
     * 查询攻击源ip
     *
     * @param ListTopIpRequest 请求对象
     * @return ListTopIpResponse
     */
    public ListTopIpResponse listTopIp(ListTopIpRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopIp);
    }

    /**
     * 查询攻击源ip
     * 查询攻击源ip
     *
     * @param ListTopIpRequest 请求对象
     * @return SyncInvoker<ListTopIpRequest, ListTopIpResponse>
     */
    public SyncInvoker<ListTopIpRequest, ListTopIpResponse> listTopIpInvoker(ListTopIpRequest request) {
        return new SyncInvoker<ListTopIpRequest, ListTopIpResponse>(request, WafMeta.listTopIp, hcClient);
    }

    /**
     * 查询攻击来源区域
     * 查询攻击来源区域
     *
     * @param ListTopRegionRequest 请求对象
     * @return ListTopRegionResponse
     */
    public ListTopRegionResponse listTopRegion(ListTopRegionRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopRegion);
    }

    /**
     * 查询攻击来源区域
     * 查询攻击来源区域
     *
     * @param ListTopRegionRequest 请求对象
     * @return SyncInvoker<ListTopRegionRequest, ListTopRegionResponse>
     */
    public SyncInvoker<ListTopRegionRequest, ListTopRegionResponse> listTopRegionInvoker(ListTopRegionRequest request) {
        return new SyncInvoker<ListTopRegionRequest, ListTopRegionResponse>(request, WafMeta.listTopRegion, hcClient);
    }

    /**
     * 查询被攻击url
     * 查询被攻击url
     *
     * @param ListTopUrlRequest 请求对象
     * @return ListTopUrlResponse
     */
    public ListTopUrlResponse listTopUrl(ListTopUrlRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopUrl);
    }

    /**
     * 查询被攻击url
     * 查询被攻击url
     *
     * @param ListTopUrlRequest 请求对象
     * @return SyncInvoker<ListTopUrlRequest, ListTopUrlResponse>
     */
    public SyncInvoker<ListTopUrlRequest, ListTopUrlResponse> listTopUrlInvoker(ListTopUrlRequest request) {
        return new SyncInvoker<ListTopUrlRequest, ListTopUrlResponse>(request, WafMeta.listTopUrl, hcClient);
    }

    /**
     * 查询事件日志中的url
     * 查询QPS。
     *
     * @param ListUrlRequest 请求对象
     * @return ListUrlResponse
     */
    public ListUrlResponse listUrl(ListUrlRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listUrl);
    }

    /**
     * 查询事件日志中的url
     * 查询QPS。
     *
     * @param ListUrlRequest 请求对象
     * @return SyncInvoker<ListUrlRequest, ListUrlResponse>
     */
    public SyncInvoker<ListUrlRequest, ListUrlResponse> listUrlInvoker(ListUrlRequest request) {
        return new SyncInvoker<ListUrlRequest, ListUrlResponse>(request, WafMeta.listUrl, hcClient);
    }

    /**
     * 查询引用表列表
     * 查询引用表列表
     *
     * @param ListValueListRequest 请求对象
     * @return ListValueListResponse
     */
    public ListValueListResponse listValueList(ListValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listValueList);
    }

    /**
     * 查询引用表列表
     * 查询引用表列表
     *
     * @param ListValueListRequest 请求对象
     * @return SyncInvoker<ListValueListRequest, ListValueListResponse>
     */
    public SyncInvoker<ListValueListRequest, ListValueListResponse> listValueListInvoker(ListValueListRequest request) {
        return new SyncInvoker<ListValueListRequest, ListValueListResponse>(request, WafMeta.listValueList, hcClient);
    }

    /**
     * 查询反爬虫防护规则
     * 根据Id查询反爬虫防护规则
     *
     * @param ShowAnticrawlerRuleRequest 请求对象
     * @return ShowAnticrawlerRuleResponse
     */
    public ShowAnticrawlerRuleResponse showAnticrawlerRule(ShowAnticrawlerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showAnticrawlerRule);
    }

    /**
     * 查询反爬虫防护规则
     * 根据Id查询反爬虫防护规则
     *
     * @param ShowAnticrawlerRuleRequest 请求对象
     * @return SyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse>
     */
    public SyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> showAnticrawlerRuleInvoker(ShowAnticrawlerRuleRequest request) {
        return new SyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse>(request, WafMeta.showAnticrawlerRule, hcClient);
    }

    /**
     * 查询防敏感信息泄露防护规则
     * 根据Id查询防敏感信息泄露防护规则
     *
     * @param ShowAntileakageRuleRequest 请求对象
     * @return ShowAntileakageRuleResponse
     */
    public ShowAntileakageRuleResponse showAntileakageRule(ShowAntileakageRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showAntileakageRule);
    }

    /**
     * 查询防敏感信息泄露防护规则
     * 根据Id查询防敏感信息泄露防护规则
     *
     * @param ShowAntileakageRuleRequest 请求对象
     * @return SyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse>
     */
    public SyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> showAntileakageRuleInvoker(ShowAntileakageRuleRequest request) {
        return new SyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse>(request, WafMeta.showAntileakageRule, hcClient);
    }

    /**
     * 根据Id查询cc防护规则
     * 根据Id查询cc防护规则
     *
     * @param ShowCcRuleRequest 请求对象
     * @return ShowCcRuleResponse
     */
    public ShowCcRuleResponse showCcRule(ShowCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCcRule);
    }

    /**
     * 根据Id查询cc防护规则
     * 根据Id查询cc防护规则
     *
     * @param ShowCcRuleRequest 请求对象
     * @return SyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse>
     */
    public SyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse> showCcRuleInvoker(ShowCcRuleRequest request) {
        return new SyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse>(request, WafMeta.showCcRule, hcClient);
    }

    /**
     * 查询证书
     * 查询证书
     *
     * @param ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCertificate);
    }

    /**
     * 查询证书
     * 查询证书
     *
     * @param ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, WafMeta.showCertificate, hcClient);
    }

    /**
     * 根据Id查询精准防护规则
     * 根据Id查询精准防护规则
     *
     * @param ShowCustomRuleRequest 请求对象
     * @return ShowCustomRuleResponse
     */
    public ShowCustomRuleResponse showCustomRule(ShowCustomRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCustomRule);
    }

    /**
     * 根据Id查询精准防护规则
     * 根据Id查询精准防护规则
     *
     * @param ShowCustomRuleRequest 请求对象
     * @return SyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse>
     */
    public SyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse> showCustomRuleInvoker(ShowCustomRuleRequest request) {
        return new SyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse>(request, WafMeta.showCustomRule, hcClient);
    }

    /**
     * 根据Id查询地理位置防护规则
     * 根据Id查询地理位置防护规则
     *
     * @param ShowGeoipRuleRequest 请求对象
     * @return ShowGeoipRuleResponse
     */
    public ShowGeoipRuleResponse showGeoipRule(ShowGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showGeoipRule);
    }

    /**
     * 根据Id查询地理位置防护规则
     * 根据Id查询地理位置防护规则
     *
     * @param ShowGeoipRuleRequest 请求对象
     * @return SyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse>
     */
    public SyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse> showGeoipRuleInvoker(ShowGeoipRuleRequest request) {
        return new SyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse>(request, WafMeta.showGeoipRule, hcClient);
    }

    /**
     * 根据Id查询云模式防护域名
     * 根据Id查询云模式防护域名
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showInstance);
    }

    /**
     * 根据Id查询云模式防护域名
     * 根据Id查询云模式防护域名
     *
     * @param ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, WafMeta.showInstance, hcClient);
    }

    /**
     * 获取云模式域名路由信息
     * 返回路由信息
     *
     * @param ShowInstanceRouteRequest 请求对象
     * @return ShowInstanceRouteResponse
     */
    public ShowInstanceRouteResponse showInstanceRoute(ShowInstanceRouteRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showInstanceRoute);
    }

    /**
     * 获取云模式域名路由信息
     * 返回路由信息
     *
     * @param ShowInstanceRouteRequest 请求对象
     * @return SyncInvoker<ShowInstanceRouteRequest, ShowInstanceRouteResponse>
     */
    public SyncInvoker<ShowInstanceRouteRequest, ShowInstanceRouteResponse> showInstanceRouteInvoker(ShowInstanceRouteRequest request) {
        return new SyncInvoker<ShowInstanceRouteRequest, ShowInstanceRouteResponse>(request, WafMeta.showInstanceRoute, hcClient);
    }

    /**
     * 查看独享模式域名配置
     * 查看独享模式域名配置
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return ShowPremiumHostResponse
     */
    public ShowPremiumHostResponse showPremiumHost(ShowPremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPremiumHost);
    }

    /**
     * 查看独享模式域名配置
     * 查看独享模式域名配置
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>
     */
    public SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHostInvoker(ShowPremiumHostRequest request) {
        return new SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>(request, WafMeta.showPremiumHost, hcClient);
    }

    /**
     * 更新反爬虫防护规则
     * 更新反爬虫防护规则
     *
     * @param UpdateAnticrawlerRuleRequest 请求对象
     * @return UpdateAnticrawlerRuleResponse
     */
    public UpdateAnticrawlerRuleResponse updateAnticrawlerRule(UpdateAnticrawlerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateAnticrawlerRule);
    }

    /**
     * 更新反爬虫防护规则
     * 更新反爬虫防护规则
     *
     * @param UpdateAnticrawlerRuleRequest 请求对象
     * @return SyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse>
     */
    public SyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> updateAnticrawlerRuleInvoker(UpdateAnticrawlerRuleRequest request) {
        return new SyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse>(request, WafMeta.updateAnticrawlerRule, hcClient);
    }

    /**
     * 更新防敏感信息泄露防护规则
     * 更新防敏感信息泄露防护规则
     *
     * @param UpdateAntileakageRuleRequest 请求对象
     * @return UpdateAntileakageRuleResponse
     */
    public UpdateAntileakageRuleResponse updateAntileakageRule(UpdateAntileakageRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateAntileakageRule);
    }

    /**
     * 更新防敏感信息泄露防护规则
     * 更新防敏感信息泄露防护规则
     *
     * @param UpdateAntileakageRuleRequest 请求对象
     * @return SyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse>
     */
    public SyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> updateAntileakageRuleInvoker(UpdateAntileakageRuleRequest request) {
        return new SyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse>(request, WafMeta.updateAntileakageRule, hcClient);
    }

    /**
     * 更新cc防护规则
     * 更新cc防护规则
     *
     * @param UpdateCcRuleRequest 请求对象
     * @return UpdateCcRuleResponse
     */
    public UpdateCcRuleResponse updateCcRule(UpdateCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateCcRule);
    }

    /**
     * 更新cc防护规则
     * 更新cc防护规则
     *
     * @param UpdateCcRuleRequest 请求对象
     * @return SyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse>
     */
    public SyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse> updateCcRuleInvoker(UpdateCcRuleRequest request) {
        return new SyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse>(request, WafMeta.updateCcRule, hcClient);
    }

    /**
     * 修改证书
     * 修改证书
     *
     * @param UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateCertificate);
    }

    /**
     * 修改证书
     * 修改证书
     *
     * @param UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(UpdateCertificateRequest request) {
        return new SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, WafMeta.updateCertificate, hcClient);
    }

    /**
     * 更新精准防护规则
     * 更新精准防护规则
     *
     * @param UpdateCustomRuleRequest 请求对象
     * @return UpdateCustomRuleResponse
     */
    public UpdateCustomRuleResponse updateCustomRule(UpdateCustomRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateCustomRule);
    }

    /**
     * 更新精准防护规则
     * 更新精准防护规则
     *
     * @param UpdateCustomRuleRequest 请求对象
     * @return SyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse>
     */
    public SyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse> updateCustomRuleInvoker(UpdateCustomRuleRequest request) {
        return new SyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse>(request, WafMeta.updateCustomRule, hcClient);
    }

    /**
     * 更新地理位置防护规则
     * 更新地理位置防护规则
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return UpdateGeoipRuleResponse
     */
    public UpdateGeoipRuleResponse updateGeoipRule(UpdateGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateGeoipRule);
    }

    /**
     * 更新地理位置防护规则
     * 更新地理位置防护规则
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>
     */
    public SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRuleInvoker(UpdateGeoipRuleRequest request) {
        return new SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>(request, WafMeta.updateGeoipRule, hcClient);
    }

    /**
     * 更新云模式防护域名
     * 更新云模式防护域名
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateInstance);
    }

    /**
     * 更新云模式防护域名
     * 更新云模式防护域名
     *
     * @param UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(UpdateInstanceRequest request) {
        return new SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, WafMeta.updateInstance, hcClient);
    }

    /**
     * 更新防护策略
     * 更新防护策略，请求体可只传需要更新的部分
     *
     * @param UpdatePatchPolicyRequest 请求对象
     * @return UpdatePatchPolicyResponse
     */
    public UpdatePatchPolicyResponse updatePatchPolicy(UpdatePatchPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePatchPolicy);
    }

    /**
     * 更新防护策略
     * 更新防护策略，请求体可只传需要更新的部分
     *
     * @param UpdatePatchPolicyRequest 请求对象
     * @return SyncInvoker<UpdatePatchPolicyRequest, UpdatePatchPolicyResponse>
     */
    public SyncInvoker<UpdatePatchPolicyRequest, UpdatePatchPolicyResponse> updatePatchPolicyInvoker(UpdatePatchPolicyRequest request) {
        return new SyncInvoker<UpdatePatchPolicyRequest, UpdatePatchPolicyResponse>(request, WafMeta.updatePatchPolicy, hcClient);
    }

    /**
     * 修改独享模式域名配置
     * 修改独享模式域名配置
     *
     * @param UpdatePremiumHostRequest 请求对象
     * @return UpdatePremiumHostResponse
     */
    public UpdatePremiumHostResponse updatePremiumHost(UpdatePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHost);
    }

    /**
     * 修改独享模式域名配置
     * 修改独享模式域名配置
     *
     * @param UpdatePremiumHostRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>
     */
    public SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHostInvoker(UpdatePremiumHostRequest request) {
        return new SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>(request, WafMeta.updatePremiumHost, hcClient);
    }

    /**
     * 修改独享模式域名接入状态
     * 修改独享模式域名接入状态
     *
     * @param UpdatePremiumHostAccessStatusRequest 请求对象
     * @return UpdatePremiumHostAccessStatusResponse
     */
    public UpdatePremiumHostAccessStatusResponse updatePremiumHostAccessStatus(UpdatePremiumHostAccessStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHostAccessStatus);
    }

    /**
     * 修改独享模式域名接入状态
     * 修改独享模式域名接入状态
     *
     * @param UpdatePremiumHostAccessStatusRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse>
     */
    public SyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> updatePremiumHostAccessStatusInvoker(UpdatePremiumHostAccessStatusRequest request) {
        return new SyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse>(request, WafMeta.updatePremiumHostAccessStatus, hcClient);
    }

    /**
     * 修改独享模式域名防护状态
     * 修改独享模式域名防护状态
     *
     * @param UpdatePremiumHostProtectStatusRequest 请求对象
     * @return UpdatePremiumHostProtectStatusResponse
     */
    public UpdatePremiumHostProtectStatusResponse updatePremiumHostProtectStatus(UpdatePremiumHostProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHostProtectStatus);
    }

    /**
     * 修改独享模式域名防护状态
     * 修改独享模式域名防护状态
     *
     * @param UpdatePremiumHostProtectStatusRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>
     */
    public SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusInvoker(UpdatePremiumHostProtectStatusRequest request) {
        return new SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>(request, WafMeta.updatePremiumHostProtectStatus, hcClient);
    }

    /**
     * 创建WAF独享引擎组
     * 创建WAF独享引擎组
     *
     * @param CreatePoolRequest 请求对象
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPool(CreatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPool);
    }

    /**
     * 创建WAF独享引擎组
     * 创建WAF独享引擎组
     *
     * @param CreatePoolRequest 请求对象
     * @return SyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public SyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolInvoker(CreatePoolRequest request) {
        return new SyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, WafMeta.createPool, hcClient);
    }

    /**
     * 删除WAF独享引擎组
     * 删除WAF独享引擎组
     *
     * @param DeletePoolRequest 请求对象
     * @return DeletePoolResponse
     */
    public DeletePoolResponse deletePool(DeletePoolRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePool);
    }

    /**
     * 删除WAF独享引擎组
     * 删除WAF独享引擎组
     *
     * @param DeletePoolRequest 请求对象
     * @return SyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public SyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolInvoker(DeletePoolRequest request) {
        return new SyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, WafMeta.deletePool, hcClient);
    }

    /**
     * 查询WAF独享引擎组列表
     * 查询WAF独享引擎组列表
     *
     * @param ListPoolsRequest 请求对象
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPools(ListPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPools);
    }

    /**
     * 查询WAF独享引擎组列表
     * 查询WAF独享引擎组列表
     *
     * @param ListPoolsRequest 请求对象
     * @return SyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public SyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsInvoker(ListPoolsRequest request) {
        return new SyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, WafMeta.listPools, hcClient);
    }

    /**
     * 查询WAF独享引擎组信息
     * 查询WAF独享引擎组信息
     *
     * @param ShowPoolRequest 请求对象
     * @return ShowPoolResponse
     */
    public ShowPoolResponse showPool(ShowPoolRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPool);
    }

    /**
     * 查询WAF独享引擎组信息
     * 查询WAF独享引擎组信息
     *
     * @param ShowPoolRequest 请求对象
     * @return SyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public SyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolInvoker(ShowPoolRequest request) {
        return new SyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, WafMeta.showPool, hcClient);
    }

    /**
     * 修改WAF独享引擎组信息
     * 修改WAF独享引擎组信息
     *
     * @param UpdatePoolRequest 请求对象
     * @return UpdatePoolResponse
     */
    public UpdatePoolResponse updatePool(UpdatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePool);
    }

    /**
     * 修改WAF独享引擎组信息
     * 修改WAF独享引擎组信息
     *
     * @param UpdatePoolRequest 请求对象
     * @return SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public SyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolInvoker(UpdatePoolRequest request) {
        return new SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, WafMeta.updatePool, hcClient);
    }

}
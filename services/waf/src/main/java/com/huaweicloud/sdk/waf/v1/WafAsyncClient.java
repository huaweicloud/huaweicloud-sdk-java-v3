package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.waf.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class WafAsyncClient {

    protected HcClient hcClient;

    public WafAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WafAsyncClient> newBuilder() {
        return new ClientBuilder<>(WafAsyncClient::new);
    }

    /**
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ApplyCertificateToHostRequest 请求对象
     * @return CompletableFuture<ApplyCertificateToHostResponse>
     */
    public CompletableFuture<ApplyCertificateToHostResponse> applyCertificateToHostAsync(
        ApplyCertificateToHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.applyCertificateToHost);
    }

    /**
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ApplyCertificateToHostRequest 请求对象
     * @return AsyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse>
     */
    public AsyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> applyCertificateToHostAsyncInvoker(
        ApplyCertificateToHostRequest request) {
        return new AsyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse>(request,
            WafMeta.applyCertificateToHost, hcClient);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAntiTamperRuleRequest 请求对象
     * @return CompletableFuture<CreateAntiTamperRuleResponse>
     */
    public CompletableFuture<CreateAntiTamperRuleResponse> createAntiTamperRuleAsync(
        CreateAntiTamperRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createAntiTamperRule);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAntiTamperRuleRequest 请求对象
     * @return AsyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse>
     */
    public AsyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> createAntiTamperRuleAsyncInvoker(
        CreateAntiTamperRuleRequest request) {
        return new AsyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse>(request,
            WafMeta.createAntiTamperRule, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(
        CreateCertificateRequest request) {
        return new AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, WafMeta.createCertificate,
            hcClient);
    }

    /**
     * 创建地理位置规则
     *
     * 创建地理位置规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGeoipRuleRequest 请求对象
     * @return CompletableFuture<CreateGeoipRuleResponse>
     */
    public CompletableFuture<CreateGeoipRuleResponse> createGeoipRuleAsync(CreateGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createGeoipRule);
    }

    /**
     * 创建地理位置规则
     *
     * 创建地理位置规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGeoipRuleRequest 请求对象
     * @return AsyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse>
     */
    public AsyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse> createGeoipRuleAsyncInvoker(
        CreateGeoipRuleRequest request) {
        return new AsyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse>(request, WafMeta.createGeoipRule,
            hcClient);
    }

    /**
     * 创建云模式防护域名
     *
     * 创建云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateHostRequest 请求对象
     * @return CompletableFuture<CreateHostResponse>
     */
    public CompletableFuture<CreateHostResponse> createHostAsync(CreateHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createHost);
    }

    /**
     * 创建云模式防护域名
     *
     * 创建云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateHostRequest 请求对象
     * @return AsyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public AsyncInvoker<CreateHostRequest, CreateHostResponse> createHostAsyncInvoker(CreateHostRequest request) {
        return new AsyncInvoker<CreateHostRequest, CreateHostResponse>(request, WafMeta.createHost, hcClient);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(
        CreatePolicyRequest request) {
        return new AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, WafMeta.createPolicy, hcClient);
    }

    /**
     * 创建独享模式域名
     *
     * 创建独享模式域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return CompletableFuture<CreatePremiumHostResponse>
     */
    public CompletableFuture<CreatePremiumHostResponse> createPremiumHostAsync(CreatePremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPremiumHost);
    }

    /**
     * 创建独享模式域名
     *
     * 创建独享模式域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return AsyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>
     */
    public AsyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHostAsyncInvoker(
        CreatePremiumHostRequest request) {
        return new AsyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>(request, WafMeta.createPremiumHost,
            hcClient);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrivacyRuleRequest 请求对象
     * @return CompletableFuture<CreatePrivacyRuleResponse>
     */
    public CompletableFuture<CreatePrivacyRuleResponse> createPrivacyRuleAsync(CreatePrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPrivacyRule);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrivacyRuleRequest 请求对象
     * @return AsyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse>
     */
    public AsyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> createPrivacyRuleAsyncInvoker(
        CreatePrivacyRuleRequest request) {
        return new AsyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse>(request, WafMeta.createPrivacyRule,
            hcClient);
    }

    /**
     * 创建引用表
     *
     * 创建引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateValueListRequest 请求对象
     * @return CompletableFuture<CreateValueListResponse>
     */
    public CompletableFuture<CreateValueListResponse> createValueListAsync(CreateValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createValueList);
    }

    /**
     * 创建引用表
     *
     * 创建引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateValueListRequest 请求对象
     * @return AsyncInvoker<CreateValueListRequest, CreateValueListResponse>
     */
    public AsyncInvoker<CreateValueListRequest, CreateValueListResponse> createValueListAsyncInvoker(
        CreateValueListRequest request) {
        return new AsyncInvoker<CreateValueListRequest, CreateValueListResponse>(request, WafMeta.createValueList,
            hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWhiteblackipRuleRequest 请求对象
     * @return CompletableFuture<CreateWhiteblackipRuleResponse>
     */
    public CompletableFuture<CreateWhiteblackipRuleResponse> createWhiteblackipRuleAsync(
        CreateWhiteblackipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createWhiteblackipRule);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWhiteblackipRuleRequest 请求对象
     * @return AsyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse>
     */
    public AsyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> createWhiteblackipRuleAsyncInvoker(
        CreateWhiteblackipRuleRequest request) {
        return new AsyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse>(request,
            WafMeta.createWhiteblackipRule, hcClient);
    }

    /**
     * 删除防篡改防护规则
     *
     * 删除防篡改防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAntitamperRuleRequest 请求对象
     * @return CompletableFuture<DeleteAntitamperRuleResponse>
     */
    public CompletableFuture<DeleteAntitamperRuleResponse> deleteAntitamperRuleAsync(
        DeleteAntitamperRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteAntitamperRule);
    }

    /**
     * 删除防篡改防护规则
     *
     * 删除防篡改防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAntitamperRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse>
     */
    public AsyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> deleteAntitamperRuleAsyncInvoker(
        DeleteAntitamperRuleRequest request) {
        return new AsyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse>(request,
            WafMeta.deleteAntitamperRule, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, WafMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 删除地理位置防护规则
     *
     * 删除地理位置防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return CompletableFuture<DeleteGeoipRuleResponse>
     */
    public CompletableFuture<DeleteGeoipRuleResponse> deleteGeoipRuleAsync(DeleteGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteGeoipRule);
    }

    /**
     * 删除地理位置防护规则
     *
     * 删除地理位置防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return AsyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>
     */
    public AsyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRuleAsyncInvoker(
        DeleteGeoipRuleRequest request) {
        return new AsyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>(request, WafMeta.deleteGeoipRule,
            hcClient);
    }

    /**
     * 删除云模式防护域名
     *
     * 删除云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteHostRequest 请求对象
     * @return CompletableFuture<DeleteHostResponse>
     */
    public CompletableFuture<DeleteHostResponse> deleteHostAsync(DeleteHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteHost);
    }

    /**
     * 删除云模式防护域名
     *
     * 删除云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteHostRequest 请求对象
     * @return AsyncInvoker<DeleteHostRequest, DeleteHostResponse>
     */
    public AsyncInvoker<DeleteHostRequest, DeleteHostResponse> deleteHostAsyncInvoker(DeleteHostRequest request) {
        return new AsyncInvoker<DeleteHostRequest, DeleteHostResponse>(request, WafMeta.deleteHost, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, WafMeta.deletePolicy, hcClient);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return CompletableFuture<DeletePremiumHostResponse>
     */
    public CompletableFuture<DeletePremiumHostResponse> deletePremiumHostAsync(DeletePremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePremiumHost);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return AsyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>
     */
    public AsyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHostAsyncInvoker(
        DeletePremiumHostRequest request) {
        return new AsyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>(request, WafMeta.deletePremiumHost,
            hcClient);
    }

    /**
     * 删除隐私屏蔽防护规则
     *
     * 删除隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePrivacyRuleRequest 请求对象
     * @return CompletableFuture<DeletePrivacyRuleResponse>
     */
    public CompletableFuture<DeletePrivacyRuleResponse> deletePrivacyRuleAsync(DeletePrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePrivacyRule);
    }

    /**
     * 删除隐私屏蔽防护规则
     *
     * 删除隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePrivacyRuleRequest 请求对象
     * @return AsyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse>
     */
    public AsyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> deletePrivacyRuleAsyncInvoker(
        DeletePrivacyRuleRequest request) {
        return new AsyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse>(request, WafMeta.deletePrivacyRule,
            hcClient);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteValueListRequest 请求对象
     * @return CompletableFuture<DeleteValueListResponse>
     */
    public CompletableFuture<DeleteValueListResponse> deleteValueListAsync(DeleteValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteValueList);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteValueListRequest 请求对象
     * @return AsyncInvoker<DeleteValueListRequest, DeleteValueListResponse>
     */
    public AsyncInvoker<DeleteValueListRequest, DeleteValueListResponse> deleteValueListAsyncInvoker(
        DeleteValueListRequest request) {
        return new AsyncInvoker<DeleteValueListRequest, DeleteValueListResponse>(request, WafMeta.deleteValueList,
            hcClient);
    }

    /**
     * 删除黑白名单防护规则
     *
     * 删除黑白名单防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWhiteBlackIpRuleRequest 请求对象
     * @return CompletableFuture<DeleteWhiteBlackIpRuleResponse>
     */
    public CompletableFuture<DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRuleAsync(
        DeleteWhiteBlackIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteWhiteBlackIpRule);
    }

    /**
     * 删除黑白名单防护规则
     *
     * 删除黑白名单防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWhiteBlackIpRuleRequest 请求对象
     * @return AsyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse>
     */
    public AsyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRuleAsyncInvoker(
        DeleteWhiteBlackIpRuleRequest request) {
        return new AsyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse>(request,
            WafMeta.deleteWhiteBlackIpRule, hcClient);
    }

    /**
     * 查询防篡改规则列表
     *
     * 查询防篡改规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAntitamperRuleRequest 请求对象
     * @return CompletableFuture<ListAntitamperRuleResponse>
     */
    public CompletableFuture<ListAntitamperRuleResponse> listAntitamperRuleAsync(ListAntitamperRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAntitamperRule);
    }

    /**
     * 查询防篡改规则列表
     *
     * 查询防篡改规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAntitamperRuleRequest 请求对象
     * @return AsyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse>
     */
    public AsyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse> listAntitamperRuleAsyncInvoker(
        ListAntitamperRuleRequest request) {
        return new AsyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse>(request,
            WafMeta.listAntitamperRule, hcClient);
    }

    /**
     * 查询安全统计带宽数据
     *
     * 查询安全统计带宽数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBandwidthTimelineRequest 请求对象
     * @return CompletableFuture<ListBandwidthTimelineResponse>
     */
    public CompletableFuture<ListBandwidthTimelineResponse> listBandwidthTimelineAsync(
        ListBandwidthTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listBandwidthTimeline);
    }

    /**
     * 查询安全统计带宽数据
     *
     * 查询安全统计带宽数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBandwidthTimelineRequest 请求对象
     * @return AsyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>
     */
    public AsyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimelineAsyncInvoker(
        ListBandwidthTimelineRequest request) {
        return new AsyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>(request,
            WafMeta.listBandwidthTimeline, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, WafMeta.listCertificates,
            hcClient);
    }

    /**
     * 查询全部防护域名列表
     *
     * 查询全部防护域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCompositeHostsRequest 请求对象
     * @return CompletableFuture<ListCompositeHostsResponse>
     */
    public CompletableFuture<ListCompositeHostsResponse> listCompositeHostsAsync(ListCompositeHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCompositeHosts);
    }

    /**
     * 查询全部防护域名列表
     *
     * 查询全部防护域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCompositeHostsRequest 请求对象
     * @return AsyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse>
     */
    public AsyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse> listCompositeHostsAsyncInvoker(
        ListCompositeHostsRequest request) {
        return new AsyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse>(request,
            WafMeta.listCompositeHosts, hcClient);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表，该API暂时不支持查询全部防护事件，pagesize参数不可设为-1，由于性能原因，数据量越大消耗的内存越大，后端最多限制查询10000条数据，例如：自定义时间段内的数据超过了10000条，就无法查出page为101，pagesize为100之后的数据，需要调整时间区间，再进行查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventRequest 请求对象
     * @return CompletableFuture<ListEventResponse>
     */
    public CompletableFuture<ListEventResponse> listEventAsync(ListEventRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listEvent);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表，该API暂时不支持查询全部防护事件，pagesize参数不可设为-1，由于性能原因，数据量越大消耗的内存越大，后端最多限制查询10000条数据，例如：自定义时间段内的数据超过了10000条，就无法查出page为101，pagesize为100之后的数据，需要调整时间区间，再进行查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventRequest 请求对象
     * @return AsyncInvoker<ListEventRequest, ListEventResponse>
     */
    public AsyncInvoker<ListEventRequest, ListEventResponse> listEventAsyncInvoker(ListEventRequest request) {
        return new AsyncInvoker<ListEventRequest, ListEventResponse>(request, WafMeta.listEvent, hcClient);
    }

    /**
     * 查询地理位置规则列表
     *
     * 查询地理位置规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGeoipRuleRequest 请求对象
     * @return CompletableFuture<ListGeoipRuleResponse>
     */
    public CompletableFuture<ListGeoipRuleResponse> listGeoipRuleAsync(ListGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listGeoipRule);
    }

    /**
     * 查询地理位置规则列表
     *
     * 查询地理位置规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGeoipRuleRequest 请求对象
     * @return AsyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse>
     */
    public AsyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse> listGeoipRuleAsyncInvoker(
        ListGeoipRuleRequest request) {
        return new AsyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse>(request, WafMeta.listGeoipRule, hcClient);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return CompletableFuture<ListHostResponse>
     */
    public CompletableFuture<ListHostResponse> listHostAsync(ListHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listHost);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return AsyncInvoker<ListHostRequest, ListHostResponse>
     */
    public AsyncInvoker<ListHostRequest, ListHostResponse> listHostAsyncInvoker(ListHostRequest request) {
        return new AsyncInvoker<ListHostRequest, ListHostResponse>(request, WafMeta.listHost, hcClient);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRouteRequest 请求对象
     * @return CompletableFuture<ListHostRouteResponse>
     */
    public CompletableFuture<ListHostRouteResponse> listHostRouteAsync(ListHostRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listHostRoute);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRouteRequest 请求对象
     * @return AsyncInvoker<ListHostRouteRequest, ListHostRouteResponse>
     */
    public AsyncInvoker<ListHostRouteRequest, ListHostRouteResponse> listHostRouteAsyncInvoker(
        ListHostRouteRequest request) {
        return new AsyncInvoker<ListHostRouteRequest, ListHostRouteResponse>(request, WafMeta.listHostRoute, hcClient);
    }

    /**
     * 查询误报屏蔽规则列表
     *
     * 查询误报屏蔽规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIgnoreRuleRequest 请求对象
     * @return CompletableFuture<ListIgnoreRuleResponse>
     */
    public CompletableFuture<ListIgnoreRuleResponse> listIgnoreRuleAsync(ListIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listIgnoreRule);
    }

    /**
     * 查询误报屏蔽规则列表
     *
     * 查询误报屏蔽规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse>
     */
    public AsyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse> listIgnoreRuleAsyncInvoker(
        ListIgnoreRuleRequest request) {
        return new AsyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse>(request, WafMeta.listIgnoreRule,
            hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return CompletableFuture<ListPolicyResponse>
     */
    public CompletableFuture<ListPolicyResponse> listPolicyAsync(ListPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPolicy);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return AsyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public AsyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyAsyncInvoker(ListPolicyRequest request) {
        return new AsyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, WafMeta.listPolicy, hcClient);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPremiumHostRequest 请求对象
     * @return CompletableFuture<ListPremiumHostResponse>
     */
    public CompletableFuture<ListPremiumHostResponse> listPremiumHostAsync(ListPremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPremiumHost);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPremiumHostRequest 请求对象
     * @return AsyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>
     */
    public AsyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHostAsyncInvoker(
        ListPremiumHostRequest request) {
        return new AsyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>(request, WafMeta.listPremiumHost,
            hcClient);
    }

    /**
     * 查询隐私屏蔽防护规则
     *
     * 查询隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPrivacyRuleRequest 请求对象
     * @return CompletableFuture<ListPrivacyRuleResponse>
     */
    public CompletableFuture<ListPrivacyRuleResponse> listPrivacyRuleAsync(ListPrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPrivacyRule);
    }

    /**
     * 查询隐私屏蔽防护规则
     *
     * 查询隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPrivacyRuleRequest 请求对象
     * @return AsyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse>
     */
    public AsyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse> listPrivacyRuleAsyncInvoker(
        ListPrivacyRuleRequest request) {
        return new AsyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse>(request, WafMeta.listPrivacyRule,
            hcClient);
    }

    /**
     * 查询安全统计qps次数
     *
     * 查询安全统计qps次数
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQpsTimelineRequest 请求对象
     * @return CompletableFuture<ListQpsTimelineResponse>
     */
    public CompletableFuture<ListQpsTimelineResponse> listQpsTimelineAsync(ListQpsTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listQpsTimeline);
    }

    /**
     * 查询安全统计qps次数
     *
     * 查询安全统计qps次数
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQpsTimelineRequest 请求对象
     * @return AsyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>
     */
    public AsyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimelineAsyncInvoker(
        ListQpsTimelineRequest request) {
        return new AsyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>(request, WafMeta.listQpsTimeline,
            hcClient);
    }

    /**
     * 查询安全总览请求数据
     *
     * 查询安全总览请求数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return CompletableFuture<ListStatisticsResponse>
     */
    public CompletableFuture<ListStatisticsResponse> listStatisticsAsync(ListStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listStatistics);
    }

    /**
     * 查询安全总览请求数据
     *
     * 查询安全总览请求数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsAsyncInvoker(
        ListStatisticsRequest request) {
        return new AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>(request, WafMeta.listStatistics,
            hcClient);
    }

    /**
     * 查询业务异常数量
     *
     * 查询业务异常数量
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopAbnormalRequest 请求对象
     * @return CompletableFuture<ListTopAbnormalResponse>
     */
    public CompletableFuture<ListTopAbnormalResponse> listTopAbnormalAsync(ListTopAbnormalRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopAbnormal);
    }

    /**
     * 查询业务异常数量
     *
     * 查询业务异常数量
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopAbnormalRequest 请求对象
     * @return AsyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>
     */
    public AsyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormalAsyncInvoker(
        ListTopAbnormalRequest request) {
        return new AsyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>(request, WafMeta.listTopAbnormal,
            hcClient);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListValueListRequest 请求对象
     * @return CompletableFuture<ListValueListResponse>
     */
    public CompletableFuture<ListValueListResponse> listValueListAsync(ListValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listValueList);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListValueListRequest 请求对象
     * @return AsyncInvoker<ListValueListRequest, ListValueListResponse>
     */
    public AsyncInvoker<ListValueListRequest, ListValueListResponse> listValueListAsyncInvoker(
        ListValueListRequest request) {
        return new AsyncInvoker<ListValueListRequest, ListValueListResponse>(request, WafMeta.listValueList, hcClient);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWhiteblackipRuleRequest 请求对象
     * @return CompletableFuture<ListWhiteblackipRuleResponse>
     */
    public CompletableFuture<ListWhiteblackipRuleResponse> listWhiteblackipRuleAsync(
        ListWhiteblackipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listWhiteblackipRule);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWhiteblackipRuleRequest 请求对象
     * @return AsyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse>
     */
    public AsyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> listWhiteblackipRuleAsyncInvoker(
        ListWhiteblackipRuleRequest request) {
        return new AsyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse>(request,
            WafMeta.listWhiteblackipRule, hcClient);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse>
     */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showCertificate);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(
        ShowCertificateRequest request) {
        return new AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, WafMeta.showCertificate,
            hcClient);
    }

    /**
     * 根据Id查询防护域名
     *
     * 根据Id查询防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCompositeHostRequest 请求对象
     * @return CompletableFuture<ShowCompositeHostResponse>
     */
    public CompletableFuture<ShowCompositeHostResponse> showCompositeHostAsync(ShowCompositeHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showCompositeHost);
    }

    /**
     * 根据Id查询防护域名
     *
     * 根据Id查询防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCompositeHostRequest 请求对象
     * @return AsyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse>
     */
    public AsyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse> showCompositeHostAsyncInvoker(
        ShowCompositeHostRequest request) {
        return new AsyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse>(request, WafMeta.showCompositeHost,
            hcClient);
    }

    /**
     * 局点支持特性查询
     *
     * 局点支持特性查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowConsoleConfigRequest 请求对象
     * @return CompletableFuture<ShowConsoleConfigResponse>
     */
    public CompletableFuture<ShowConsoleConfigResponse> showConsoleConfigAsync(ShowConsoleConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showConsoleConfig);
    }

    /**
     * 局点支持特性查询
     *
     * 局点支持特性查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowConsoleConfigRequest 请求对象
     * @return AsyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse>
     */
    public AsyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse> showConsoleConfigAsyncInvoker(
        ShowConsoleConfigRequest request) {
        return new AsyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse>(request, WafMeta.showConsoleConfig,
            hcClient);
    }

    /**
     * 查询攻击事件详情
     *
     * 查询攻击事件详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return CompletableFuture<ShowEventResponse>
     */
    public CompletableFuture<ShowEventResponse> showEventAsync(ShowEventRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showEvent);
    }

    /**
     * 查询攻击事件详情
     *
     * 查询攻击事件详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return AsyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public AsyncInvoker<ShowEventRequest, ShowEventResponse> showEventAsyncInvoker(ShowEventRequest request) {
        return new AsyncInvoker<ShowEventRequest, ShowEventResponse>(request, WafMeta.showEvent, hcClient);
    }

    /**
     * 根据Id查询云模式防护域名
     *
     * 根据Id查询云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHostRequest 请求对象
     * @return CompletableFuture<ShowHostResponse>
     */
    public CompletableFuture<ShowHostResponse> showHostAsync(ShowHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showHost);
    }

    /**
     * 根据Id查询云模式防护域名
     *
     * 根据Id查询云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHostRequest 请求对象
     * @return AsyncInvoker<ShowHostRequest, ShowHostResponse>
     */
    public AsyncInvoker<ShowHostRequest, ShowHostResponse> showHostAsyncInvoker(ShowHostRequest request) {
        return new AsyncInvoker<ShowHostRequest, ShowHostResponse>(request, WafMeta.showHost, hcClient);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
     * @return CompletableFuture<ShowPolicyResponse>
     */
    public CompletableFuture<ShowPolicyResponse> showPolicyAsync(ShowPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showPolicy);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
     * @return AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyAsyncInvoker(ShowPolicyRequest request) {
        return new AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>(request, WafMeta.showPolicy, hcClient);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return CompletableFuture<ShowPremiumHostResponse>
     */
    public CompletableFuture<ShowPremiumHostResponse> showPremiumHostAsync(ShowPremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showPremiumHost);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return AsyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>
     */
    public AsyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHostAsyncInvoker(
        ShowPremiumHostRequest request) {
        return new AsyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>(request, WafMeta.showPremiumHost,
            hcClient);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return CompletableFuture<UpdateCertificateResponse>
     */
    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateCertificate);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(
        UpdateCertificateRequest request) {
        return new AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, WafMeta.updateCertificate,
            hcClient);
    }

    /**
     * 更新地理位置防护规则
     *
     * 更新地理位置防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return CompletableFuture<UpdateGeoipRuleResponse>
     */
    public CompletableFuture<UpdateGeoipRuleResponse> updateGeoipRuleAsync(UpdateGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateGeoipRule);
    }

    /**
     * 更新地理位置防护规则
     *
     * 更新地理位置防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return AsyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>
     */
    public AsyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRuleAsyncInvoker(
        UpdateGeoipRuleRequest request) {
        return new AsyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>(request, WafMeta.updateGeoipRule,
            hcClient);
    }

    /**
     * 更新云模式防护域名
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostRequest 请求对象
     * @return CompletableFuture<UpdateHostResponse>
     */
    public CompletableFuture<UpdateHostResponse> updateHostAsync(UpdateHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateHost);
    }

    /**
     * 更新云模式防护域名
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostRequest 请求对象
     * @return AsyncInvoker<UpdateHostRequest, UpdateHostResponse>
     */
    public AsyncInvoker<UpdateHostRequest, UpdateHostResponse> updateHostAsyncInvoker(UpdateHostRequest request) {
        return new AsyncInvoker<UpdateHostRequest, UpdateHostResponse>(request, WafMeta.updateHost, hcClient);
    }

    /**
     * 修改域名防护状态
     *
     * 返回路由信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostProtectStatusRequest 请求对象
     * @return CompletableFuture<UpdateHostProtectStatusResponse>
     */
    public CompletableFuture<UpdateHostProtectStatusResponse> updateHostProtectStatusAsync(
        UpdateHostProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateHostProtectStatus);
    }

    /**
     * 修改域名防护状态
     *
     * 返回路由信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostProtectStatusRequest 请求对象
     * @return AsyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse>
     */
    public AsyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> updateHostProtectStatusAsyncInvoker(
        UpdateHostProtectStatusRequest request) {
        return new AsyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse>(request,
            WafMeta.updateHostProtectStatus, hcClient);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
     * @return CompletableFuture<UpdatePolicyResponse>
     */
    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePolicy);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(
        UpdatePolicyRequest request) {
        return new AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>(request, WafMeta.updatePolicy, hcClient);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyProtectHostRequest 请求对象
     * @return CompletableFuture<UpdatePolicyProtectHostResponse>
     */
    public CompletableFuture<UpdatePolicyProtectHostResponse> updatePolicyProtectHostAsync(
        UpdatePolicyProtectHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePolicyProtectHost);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyProtectHostRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse>
     */
    public AsyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> updatePolicyProtectHostAsyncInvoker(
        UpdatePolicyProtectHostRequest request) {
        return new AsyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse>(request,
            WafMeta.updatePolicyProtectHost, hcClient);
    }

    /**
     * 修改单条规则的状态
     *
     * 修改单条规则的状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyRuleStatusRequest 请求对象
     * @return CompletableFuture<UpdatePolicyRuleStatusResponse>
     */
    public CompletableFuture<UpdatePolicyRuleStatusResponse> updatePolicyRuleStatusAsync(
        UpdatePolicyRuleStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePolicyRuleStatus);
    }

    /**
     * 修改单条规则的状态
     *
     * 修改单条规则的状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyRuleStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse>
     */
    public AsyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> updatePolicyRuleStatusAsyncInvoker(
        UpdatePolicyRuleStatusRequest request) {
        return new AsyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse>(request,
            WafMeta.updatePolicyRuleStatus, hcClient);
    }

    /**
     * 修改独享模式域名配置
     *
     * 修改独享模式域名配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePremiumHostRequest 请求对象
     * @return CompletableFuture<UpdatePremiumHostResponse>
     */
    public CompletableFuture<UpdatePremiumHostResponse> updatePremiumHostAsync(UpdatePremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePremiumHost);
    }

    /**
     * 修改独享模式域名配置
     *
     * 修改独享模式域名配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePremiumHostRequest 请求对象
     * @return AsyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>
     */
    public AsyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHostAsyncInvoker(
        UpdatePremiumHostRequest request) {
        return new AsyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>(request, WafMeta.updatePremiumHost,
            hcClient);
    }

    /**
     * 修改独享模式域名防护状态
     *
     * 修改独享模式域名防护状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePremiumHostProtectStatusRequest 请求对象
     * @return CompletableFuture<UpdatePremiumHostProtectStatusResponse>
     */
    public CompletableFuture<UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusAsync(
        UpdatePremiumHostProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePremiumHostProtectStatus);
    }

    /**
     * 修改独享模式域名防护状态
     *
     * 修改独享模式域名防护状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePremiumHostProtectStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>
     */
    public AsyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusAsyncInvoker(
        UpdatePremiumHostProtectStatusRequest request) {
        return new AsyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>(request,
            WafMeta.updatePremiumHostProtectStatus, hcClient);
    }

    /**
     * 更新隐私屏蔽防护规则
     *
     * 更新隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrivacyRuleRequest 请求对象
     * @return CompletableFuture<UpdatePrivacyRuleResponse>
     */
    public CompletableFuture<UpdatePrivacyRuleResponse> updatePrivacyRuleAsync(UpdatePrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePrivacyRule);
    }

    /**
     * 更新隐私屏蔽防护规则
     *
     * 更新隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrivacyRuleRequest 请求对象
     * @return AsyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse>
     */
    public AsyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> updatePrivacyRuleAsyncInvoker(
        UpdatePrivacyRuleRequest request) {
        return new AsyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse>(request, WafMeta.updatePrivacyRule,
            hcClient);
    }

    /**
     * 修改引用表
     *
     * 修改引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateValueListRequest 请求对象
     * @return CompletableFuture<UpdateValueListResponse>
     */
    public CompletableFuture<UpdateValueListResponse> updateValueListAsync(UpdateValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateValueList);
    }

    /**
     * 修改引用表
     *
     * 修改引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateValueListRequest 请求对象
     * @return AsyncInvoker<UpdateValueListRequest, UpdateValueListResponse>
     */
    public AsyncInvoker<UpdateValueListRequest, UpdateValueListResponse> updateValueListAsyncInvoker(
        UpdateValueListRequest request) {
        return new AsyncInvoker<UpdateValueListRequest, UpdateValueListResponse>(request, WafMeta.updateValueList,
            hcClient);
    }

    /**
     * 更新黑白名单防护规则
     *
     * 更新黑白名单防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWhiteblackipRuleRequest 请求对象
     * @return CompletableFuture<UpdateWhiteblackipRuleResponse>
     */
    public CompletableFuture<UpdateWhiteblackipRuleResponse> updateWhiteblackipRuleAsync(
        UpdateWhiteblackipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateWhiteblackipRule);
    }

    /**
     * 更新黑白名单防护规则
     *
     * 更新黑白名单防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWhiteblackipRuleRequest 请求对象
     * @return AsyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse>
     */
    public AsyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> updateWhiteblackipRuleAsyncInvoker(
        UpdateWhiteblackipRuleRequest request) {
        return new AsyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse>(request,
            WafMeta.updateWhiteblackipRule, hcClient);
    }

}

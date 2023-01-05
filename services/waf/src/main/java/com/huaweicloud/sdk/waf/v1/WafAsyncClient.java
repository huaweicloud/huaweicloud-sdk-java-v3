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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 变更包周期云模式waf规格
     *
     * 变更包周期云模式waf规格。注：
     *  - 1.变更某产品规格的前提是必须已购买该产品 
     *  - 2.waf版本只支持升配，不支持降配；扩展包数量可以增加或者减少，但不支持数量减少为0 
     *  - 3.不支持同时升降配，如增加域名扩展包数量，同时减少规则扩展包数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePrepaidCloudWafRequest 请求对象
     * @return CompletableFuture<ChangePrepaidCloudWafResponse>
     */
    public CompletableFuture<ChangePrepaidCloudWafResponse> changePrepaidCloudWafAsync(
        ChangePrepaidCloudWafRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.changePrepaidCloudWaf);
    }

    /**
     * 变更包周期云模式waf规格
     *
     * 变更包周期云模式waf规格。注：
     *  - 1.变更某产品规格的前提是必须已购买该产品 
     *  - 2.waf版本只支持升配，不支持降配；扩展包数量可以增加或者减少，但不支持数量减少为0 
     *  - 3.不支持同时升降配，如增加域名扩展包数量，同时减少规则扩展包数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePrepaidCloudWafRequest 请求对象
     * @return AsyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse>
     */
    public AsyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> changePrepaidCloudWafAsyncInvoker(
        ChangePrepaidCloudWafRequest request) {
        return new AsyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse>(request,
            WafMeta.changePrepaidCloudWaf, hcClient);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建地理位置控制规则
     *
     * 创建地理位置控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGeoipRuleRequest 请求对象
     * @return CompletableFuture<CreateGeoipRuleResponse>
     */
    public CompletableFuture<CreateGeoipRuleResponse> createGeoipRuleAsync(CreateGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createGeoipRule);
    }

    /**
     * 创建地理位置控制规则
     *
     * 创建地理位置控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHostRequest 请求对象
     * @return AsyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public AsyncInvoker<CreateHostRequest, CreateHostResponse> createHostAsyncInvoker(CreateHostRequest request) {
        return new AsyncInvoker<CreateHostRequest, CreateHostResponse>(request, WafMeta.createHost, hcClient);
    }

    /**
     * 创建全局白名单(原误报屏蔽)规则
     *
     * 创建全局白名单(原误报屏蔽)规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIgnoreRuleRequest 请求对象
     * @return CompletableFuture<CreateIgnoreRuleResponse>
     */
    public CompletableFuture<CreateIgnoreRuleResponse> createIgnoreRuleAsync(CreateIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createIgnoreRule);
    }

    /**
     * 创建全局白名单(原误报屏蔽)规则
     *
     * 创建全局白名单(原误报屏蔽)规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse>
     */
    public AsyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> createIgnoreRuleAsyncInvoker(
        CreateIgnoreRuleRequest request) {
        return new AsyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse>(request, WafMeta.createIgnoreRule,
            hcClient);
    }

    /**
     * 创建WAF独享引擎实例
     *
     * 创建WAF独享引擎实例。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createInstance);
    }

    /**
     * 创建WAF独享引擎实例
     *
     * 创建WAF独享引擎实例。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, WafMeta.createInstance,
            hcClient);
    }

    /**
     * 创建ip地址组
     *
     * 创建ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIpGroupRequest 请求对象
     * @return CompletableFuture<CreateIpGroupResponse>
     */
    public CompletableFuture<CreateIpGroupResponse> createIpGroupAsync(CreateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createIpGroup);
    }

    /**
     * 创建ip地址组
     *
     * 创建ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIpGroupRequest 请求对象
     * @return AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupAsyncInvoker(
        CreateIpGroupRequest request) {
        return new AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>(request, WafMeta.createIpGroup, hcClient);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 购买包周期云模式waf
     *
     * 购买包周期云模式waf。入门版waf不支持购买扩展包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrepaidCloudWafRequest 请求对象
     * @return CompletableFuture<CreatePrepaidCloudWafResponse>
     */
    public CompletableFuture<CreatePrepaidCloudWafResponse> createPrepaidCloudWafAsync(
        CreatePrepaidCloudWafRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPrepaidCloudWaf);
    }

    /**
     * 购买包周期云模式waf
     *
     * 购买包周期云模式waf。入门版waf不支持购买扩展包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrepaidCloudWafRequest 请求对象
     * @return AsyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse>
     */
    public AsyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> createPrepaidCloudWafAsyncInvoker(
        CreatePrepaidCloudWafRequest request) {
        return new AsyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse>(request,
            WafMeta.createPrepaidCloudWaf, hcClient);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建引用表，引用表能够被CC攻击防护规则和精准访问防护中的规则所引用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建引用表，引用表能够被CC攻击防护规则和精准访问防护中的规则所引用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除地理位置控制防护规则
     *
     * 删除地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return CompletableFuture<DeleteGeoipRuleResponse>
     */
    public CompletableFuture<DeleteGeoipRuleResponse> deleteGeoipRuleAsync(DeleteGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteGeoipRule);
    }

    /**
     * 删除地理位置控制防护规则
     *
     * 删除地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostRequest 请求对象
     * @return AsyncInvoker<DeleteHostRequest, DeleteHostResponse>
     */
    public AsyncInvoker<DeleteHostRequest, DeleteHostResponse> deleteHostAsyncInvoker(DeleteHostRequest request) {
        return new AsyncInvoker<DeleteHostRequest, DeleteHostResponse>(request, WafMeta.deleteHost, hcClient);
    }

    /**
     * 删除全局白名单(原误报屏蔽)防护规则
     *
     * 删除全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIgnoreRuleRequest 请求对象
     * @return CompletableFuture<DeleteIgnoreRuleResponse>
     */
    public CompletableFuture<DeleteIgnoreRuleResponse> deleteIgnoreRuleAsync(DeleteIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteIgnoreRule);
    }

    /**
     * 删除全局白名单(原误报屏蔽)防护规则
     *
     * 删除全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse>
     */
    public AsyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> deleteIgnoreRuleAsyncInvoker(
        DeleteIgnoreRuleRequest request) {
        return new AsyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse>(request, WafMeta.deleteIgnoreRule,
            hcClient);
    }

    /**
     * 删除WAF独享引擎信息
     *
     * 删除WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteInstance);
    }

    /**
     * 删除WAF独享引擎信息
     *
     * 删除WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, WafMeta.deleteInstance,
            hcClient);
    }

    /**
     * 删除ip地址组
     *
     * 删除ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIpGroupRequest 请求对象
     * @return CompletableFuture<DeleteIpGroupResponse>
     */
    public CompletableFuture<DeleteIpGroupResponse> deleteIpGroupAsync(DeleteIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteIpGroup);
    }

    /**
     * 删除ip地址组
     *
     * 删除ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIpGroupRequest 请求对象
     * @return AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupAsyncInvoker(
        DeleteIpGroupRequest request) {
        return new AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>(request, WafMeta.deleteIpGroup, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询安全统计带宽数据，统计的带宽数据为平均值，单位为bit/s。需要注意的是，安全统计相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询安全统计带宽数据，统计的带宽数据为平均值，单位为bit/s。需要注意的是，安全统计相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询全部防护域名列表，包括云模式和独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询全部防护域名列表，包括云模式和独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventRequest 请求对象
     * @return AsyncInvoker<ListEventRequest, ListEventResponse>
     */
    public AsyncInvoker<ListEventRequest, ListEventResponse> listEventAsyncInvoker(ListEventRequest request) {
        return new AsyncInvoker<ListEventRequest, ListEventResponse>(request, WafMeta.listEvent, hcClient);
    }

    /**
     * 查询地理位置访问控制规则列表
     *
     * 查询地理位置访问控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGeoipRuleRequest 请求对象
     * @return CompletableFuture<ListGeoipRuleResponse>
     */
    public CompletableFuture<ListGeoipRuleResponse> listGeoipRuleAsync(ListGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listGeoipRule);
    }

    /**
     * 查询地理位置访问控制规则列表
     *
     * 查询地理位置访问控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRouteRequest 请求对象
     * @return AsyncInvoker<ListHostRouteRequest, ListHostRouteResponse>
     */
    public AsyncInvoker<ListHostRouteRequest, ListHostRouteResponse> listHostRouteAsyncInvoker(
        ListHostRouteRequest request) {
        return new AsyncInvoker<ListHostRouteRequest, ListHostRouteResponse>(request, WafMeta.listHostRoute, hcClient);
    }

    /**
     * 查询全局白名单(原误报屏蔽)规则列表
     *
     * 查询全局白名单(原误报屏蔽)规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIgnoreRuleRequest 请求对象
     * @return CompletableFuture<ListIgnoreRuleResponse>
     */
    public CompletableFuture<ListIgnoreRuleResponse> listIgnoreRuleAsync(ListIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listIgnoreRule);
    }

    /**
     * 查询全局白名单(原误报屏蔽)规则列表
     *
     * 查询全局白名单(原误报屏蔽)规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询WAF独享引擎列表
     *
     * 查询WAF独享引擎列表。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceRequest 请求对象
     * @return CompletableFuture<ListInstanceResponse>
     */
    public CompletableFuture<ListInstanceResponse> listInstanceAsync(ListInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listInstance);
    }

    /**
     * 查询WAF独享引擎列表
     *
     * 查询WAF独享引擎列表。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceRequest 请求对象
     * @return AsyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public AsyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceAsyncInvoker(
        ListInstanceRequest request) {
        return new AsyncInvoker<ListInstanceRequest, ListInstanceResponse>(request, WafMeta.listInstance, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpGroupRequest 请求对象
     * @return CompletableFuture<ListIpGroupResponse>
     */
    public CompletableFuture<ListIpGroupResponse> listIpGroupAsync(ListIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listIpGroup);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpGroupRequest 请求对象
     * @return AsyncInvoker<ListIpGroupRequest, ListIpGroupResponse>
     */
    public AsyncInvoker<ListIpGroupRequest, ListIpGroupResponse> listIpGroupAsyncInvoker(ListIpGroupRequest request) {
        return new AsyncInvoker<ListIpGroupRequest, ListIpGroupResponse>(request, WafMeta.listIpGroup, hcClient);
    }

    /**
     * 查询告警通知配置
     *
     * 查询告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNoticeConfigsRequest 请求对象
     * @return CompletableFuture<ListNoticeConfigsResponse>
     */
    public CompletableFuture<ListNoticeConfigsResponse> listNoticeConfigsAsync(ListNoticeConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listNoticeConfigs);
    }

    /**
     * 查询告警通知配置
     *
     * 查询告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNoticeConfigsRequest 请求对象
     * @return AsyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse>
     */
    public AsyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse> listNoticeConfigsAsyncInvoker(
        ListNoticeConfigsRequest request) {
        return new AsyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse>(request, WafMeta.listNoticeConfigs,
            hcClient);
    }

    /**
     * 查询安全总览分类统计top信息
     *
     * 查询安全总览分类统计TOP信息，包含受攻击域名 、攻击源ip、受攻击URL、攻击来源区域、攻击事件分布。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOverviewsClassificationRequest 请求对象
     * @return CompletableFuture<ListOverviewsClassificationResponse>
     */
    public CompletableFuture<ListOverviewsClassificationResponse> listOverviewsClassificationAsync(
        ListOverviewsClassificationRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listOverviewsClassification);
    }

    /**
     * 查询安全总览分类统计top信息
     *
     * 查询安全总览分类统计TOP信息，包含受攻击域名 、攻击源ip、受攻击URL、攻击来源区域、攻击事件分布。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOverviewsClassificationRequest 请求对象
     * @return AsyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse>
     */
    public AsyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> listOverviewsClassificationAsyncInvoker(
        ListOverviewsClassificationRequest request) {
        return new AsyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse>(request,
            WafMeta.listOverviewsClassification, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询安全统计qps次数。需要注意的是，安全统计相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询安全统计qps次数。需要注意的是，安全统计相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询安全总览中请求次数时间线统计数据
     *
     * 查询安全总览中请求次数时间线统计数据。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRequestTimelineRequest 请求对象
     * @return CompletableFuture<ListRequestTimelineResponse>
     */
    public CompletableFuture<ListRequestTimelineResponse> listRequestTimelineAsync(ListRequestTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listRequestTimeline);
    }

    /**
     * 查询安全总览中请求次数时间线统计数据
     *
     * 查询安全总览中请求次数时间线统计数据。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRequestTimelineRequest 请求对象
     * @return AsyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>
     */
    public AsyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimelineAsyncInvoker(
        ListRequestTimelineRequest request) {
        return new AsyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>(request,
            WafMeta.listRequestTimeline, hcClient);
    }

    /**
     * 查询安全总览请求与攻击数量
     *
     * 查询安全总览请求与攻击数量。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return CompletableFuture<ListStatisticsResponse>
     */
    public CompletableFuture<ListStatisticsResponse> listStatisticsAsync(ListStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listStatistics);
    }

    /**
     * 查询安全总览请求与攻击数量
     *
     * 查询安全总览请求与攻击数量。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询业务异常TOP统计信息。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询业务异常TOP统计信息。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 按企业项目迁移防护域名
     *
     * 按企业项目迁移防护域名，仅专业版与独享版支持该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateCompositeHostsRequest 请求对象
     * @return CompletableFuture<MigrateCompositeHostsResponse>
     */
    public CompletableFuture<MigrateCompositeHostsResponse> migrateCompositeHostsAsync(
        MigrateCompositeHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.migrateCompositeHosts);
    }

    /**
     * 按企业项目迁移防护域名
     *
     * 按企业项目迁移防护域名，仅专业版与独享版支持该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateCompositeHostsRequest 请求对象
     * @return AsyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse>
     */
    public AsyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> migrateCompositeHostsAsyncInvoker(
        MigrateCompositeHostsRequest request) {
        return new AsyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse>(request,
            WafMeta.migrateCompositeHosts, hcClient);
    }

    /**
     * 重命名WAF独享引擎
     *
     * 重命名WAF独享引擎。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenameInstanceRequest 请求对象
     * @return CompletableFuture<RenameInstanceResponse>
     */
    public CompletableFuture<RenameInstanceResponse> renameInstanceAsync(RenameInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.renameInstance);
    }

    /**
     * 重命名WAF独享引擎
     *
     * 重命名WAF独享引擎。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenameInstanceRequest 请求对象
     * @return AsyncInvoker<RenameInstanceRequest, RenameInstanceResponse>
     */
    public AsyncInvoker<RenameInstanceRequest, RenameInstanceResponse> renameInstanceAsyncInvoker(
        RenameInstanceRequest request) {
        return new AsyncInvoker<RenameInstanceRequest, RenameInstanceResponse>(request, WafMeta.renameInstance,
            hcClient);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询指定事件id的防护事件详情
     *
     * 查询指定事件id的防护事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return CompletableFuture<ShowEventResponse>
     */
    public CompletableFuture<ShowEventResponse> showEventAsync(ShowEventRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showEvent);
    }

    /**
     * 查询指定事件id的防护事件详情
     *
     * 查询指定事件id的防护事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return AsyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public AsyncInvoker<ShowEventRequest, ShowEventResponse> showEventAsyncInvoker(ShowEventRequest request) {
        return new AsyncInvoker<ShowEventRequest, ShowEventResponse>(request, WafMeta.showEvent, hcClient);
    }

    /**
     * 根据防护域名Id查询云模式防护域名详细信息
     *
     * 根据防护域名Id查询云模式防护域名详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHostRequest 请求对象
     * @return CompletableFuture<ShowHostResponse>
     */
    public CompletableFuture<ShowHostResponse> showHostAsync(ShowHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showHost);
    }

    /**
     * 根据防护域名Id查询云模式防护域名详细信息
     *
     * 根据防护域名Id查询云模式防护域名详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHostRequest 请求对象
     * @return AsyncInvoker<ShowHostRequest, ShowHostResponse>
     */
    public AsyncInvoker<ShowHostRequest, ShowHostResponse> showHostAsyncInvoker(ShowHostRequest request) {
        return new AsyncInvoker<ShowHostRequest, ShowHostResponse>(request, WafMeta.showHost, hcClient);
    }

    /**
     * 查询WAF独享引擎信息
     *
     * 查询WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showInstance);
    }

    /**
     * 查询WAF独享引擎信息
     *
     * 查询WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, WafMeta.showInstance, hcClient);
    }

    /**
     * 查询ip地址组明细
     *
     * 查询ip地址组明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpGroupRequest 请求对象
     * @return CompletableFuture<ShowIpGroupResponse>
     */
    public CompletableFuture<ShowIpGroupResponse> showIpGroupAsync(ShowIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showIpGroup);
    }

    /**
     * 查询ip地址组明细
     *
     * 查询ip地址组明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpGroupRequest 请求对象
     * @return AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupAsyncInvoker(ShowIpGroupRequest request) {
        return new AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>(request, WafMeta.showIpGroup, hcClient);
    }

    /**
     * 查询lts配置信息
     *
     * 查询lts配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLtsInfoConfigRequest 请求对象
     * @return CompletableFuture<ShowLtsInfoConfigResponse>
     */
    public CompletableFuture<ShowLtsInfoConfigResponse> showLtsInfoConfigAsync(ShowLtsInfoConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showLtsInfoConfig);
    }

    /**
     * 查询lts配置信息
     *
     * 查询lts配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLtsInfoConfigRequest 请求对象
     * @return AsyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse>
     */
    public AsyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> showLtsInfoConfigAsyncInvoker(
        ShowLtsInfoConfigRequest request) {
        return new AsyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse>(request, WafMeta.showLtsInfoConfig,
            hcClient);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询WAF回源Ip信息
     *
     * 查询WAF回源Ip信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSourceIpRequest 请求对象
     * @return CompletableFuture<ShowSourceIpResponse>
     */
    public CompletableFuture<ShowSourceIpResponse> showSourceIpAsync(ShowSourceIpRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showSourceIp);
    }

    /**
     * 查询WAF回源Ip信息
     *
     * 查询WAF回源Ip信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSourceIpRequest 请求对象
     * @return AsyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse>
     */
    public AsyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse> showSourceIpAsyncInvoker(
        ShowSourceIpRequest request) {
        return new AsyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse>(request, WafMeta.showSourceIp, hcClient);
    }

    /**
     * 查询租户订购信息
     *
     * 查询租户订购信息，包括云模式包周期、按需计费、独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubscriptionInfoRequest 请求对象
     * @return CompletableFuture<ShowSubscriptionInfoResponse>
     */
    public CompletableFuture<ShowSubscriptionInfoResponse> showSubscriptionInfoAsync(
        ShowSubscriptionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showSubscriptionInfo);
    }

    /**
     * 查询租户订购信息
     *
     * 查询租户订购信息，包括云模式包周期、按需计费、独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubscriptionInfoRequest 请求对象
     * @return AsyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse>
     */
    public AsyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> showSubscriptionInfoAsyncInvoker(
        ShowSubscriptionInfoRequest request) {
        return new AsyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse>(request,
            WafMeta.showSubscriptionInfo, hcClient);
    }

    /**
     * 更新告警通知配置
     *
     * 更新告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlertNoticeConfigRequest 请求对象
     * @return CompletableFuture<UpdateAlertNoticeConfigResponse>
     */
    public CompletableFuture<UpdateAlertNoticeConfigResponse> updateAlertNoticeConfigAsync(
        UpdateAlertNoticeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateAlertNoticeConfig);
    }

    /**
     * 更新告警通知配置
     *
     * 更新告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlertNoticeConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse>
     */
    public AsyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> updateAlertNoticeConfigAsyncInvoker(
        UpdateAlertNoticeConfigRequest request) {
        return new AsyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse>(request,
            WafMeta.updateAlertNoticeConfig, hcClient);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 更新地理位置控制防护规则
     *
     * 更新地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return CompletableFuture<UpdateGeoipRuleResponse>
     */
    public CompletableFuture<UpdateGeoipRuleResponse> updateGeoipRuleAsync(UpdateGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateGeoipRule);
    }

    /**
     * 更新地理位置控制防护规则
     *
     * 更新地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 更新云模式防护域名的配置
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHostRequest 请求对象
     * @return CompletableFuture<UpdateHostResponse>
     */
    public CompletableFuture<UpdateHostResponse> updateHostAsync(UpdateHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateHost);
    }

    /**
     * 更新云模式防护域名的配置
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 修改域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 修改域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 修改ip地址组
     *
     * 修改ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIpGroupRequest 请求对象
     * @return CompletableFuture<UpdateIpGroupResponse>
     */
    public CompletableFuture<UpdateIpGroupResponse> updateIpGroupAsync(UpdateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateIpGroup);
    }

    /**
     * 修改ip地址组
     *
     * 修改ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIpGroupRequest 请求对象
     * @return AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupAsyncInvoker(
        UpdateIpGroupRequest request) {
        return new AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>(request, WafMeta.updateIpGroup, hcClient);
    }

    /**
     * 配置全量日志lts
     *
     * 配置全量日志lts，该接口可用来开启与关闭waf全量日志以及配置日志组和日志流。日志组id和日志流id可前往云日志服务获取。配置的日志流id要属于所配置的日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLtsInfoConfigRequest 请求对象
     * @return CompletableFuture<UpdateLtsInfoConfigResponse>
     */
    public CompletableFuture<UpdateLtsInfoConfigResponse> updateLtsInfoConfigAsync(UpdateLtsInfoConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateLtsInfoConfig);
    }

    /**
     * 配置全量日志lts
     *
     * 配置全量日志lts，该接口可用来开启与关闭waf全量日志以及配置日志组和日志流。日志组id和日志流id可前往云日志服务获取。配置的日志流id要属于所配置的日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLtsInfoConfigRequest 请求对象
     * @return AsyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse>
     */
    public AsyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> updateLtsInfoConfigAsyncInvoker(
        UpdateLtsInfoConfigRequest request) {
        return new AsyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse>(request,
            WafMeta.updateLtsInfoConfig, hcClient);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 修改单条规则的状态，用于开启或者关闭单条规则，比如关闭精准防护中某一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 修改单条规则的状态，用于开启或者关闭单条规则，比如关闭精准防护中某一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 修改独享模式域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 修改独享模式域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 更新黑白名单防护规则，可以更新ip/ip段以及防护动作等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 更新黑白名单防护规则，可以更新ip/ip段以及防护动作等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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

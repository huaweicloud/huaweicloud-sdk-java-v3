package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
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
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyCertificateToHostRequest 请求对象
     * @return ApplyCertificateToHostResponse
     */
    public ApplyCertificateToHostResponse applyCertificateToHost(ApplyCertificateToHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.applyCertificateToHost);
    }

    /**
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyCertificateToHostRequest 请求对象
     * @return SyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse>
     */
    public SyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> applyCertificateToHostInvoker(
        ApplyCertificateToHostRequest request) {
        return new SyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse>(request,
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
     * @return ChangePrepaidCloudWafResponse
     */
    public ChangePrepaidCloudWafResponse changePrepaidCloudWaf(ChangePrepaidCloudWafRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.changePrepaidCloudWaf);
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
     * @return SyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse>
     */
    public SyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> changePrepaidCloudWafInvoker(
        ChangePrepaidCloudWafRequest request) {
        return new SyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse>(request,
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
     * @return CreateAntiTamperRuleResponse
     */
    public CreateAntiTamperRuleResponse createAntiTamperRule(CreateAntiTamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createAntiTamperRule);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAntiTamperRuleRequest 请求对象
     * @return SyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse>
     */
    public SyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> createAntiTamperRuleInvoker(
        CreateAntiTamperRuleRequest request) {
        return new SyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse>(request,
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
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, WafMeta.createCertificate,
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
     * @return CreateGeoipRuleResponse
     */
    public CreateGeoipRuleResponse createGeoipRule(CreateGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createGeoipRule);
    }

    /**
     * 创建地理位置控制规则
     *
     * 创建地理位置控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGeoipRuleRequest 请求对象
     * @return SyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse>
     */
    public SyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse> createGeoipRuleInvoker(
        CreateGeoipRuleRequest request) {
        return new SyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse>(request, WafMeta.createGeoipRule,
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
     * @return CreateHostResponse
     */
    public CreateHostResponse createHost(CreateHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createHost);
    }

    /**
     * 创建云模式防护域名
     *
     * 创建云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHostRequest 请求对象
     * @return SyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public SyncInvoker<CreateHostRequest, CreateHostResponse> createHostInvoker(CreateHostRequest request) {
        return new SyncInvoker<CreateHostRequest, CreateHostResponse>(request, WafMeta.createHost, hcClient);
    }

    /**
     * 创建全局白名单(原误报屏蔽)规则
     *
     * 创建全局白名单(原误报屏蔽)规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIgnoreRuleRequest 请求对象
     * @return CreateIgnoreRuleResponse
     */
    public CreateIgnoreRuleResponse createIgnoreRule(CreateIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createIgnoreRule);
    }

    /**
     * 创建全局白名单(原误报屏蔽)规则
     *
     * 创建全局白名单(原误报屏蔽)规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIgnoreRuleRequest 请求对象
     * @return SyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse>
     */
    public SyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> createIgnoreRuleInvoker(
        CreateIgnoreRuleRequest request) {
        return new SyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse>(request, WafMeta.createIgnoreRule,
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
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createInstance);
    }

    /**
     * 创建WAF独享引擎实例
     *
     * 创建WAF独享引擎实例。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, WafMeta.createInstance,
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
     * @return CreateIpGroupResponse
     */
    public CreateIpGroupResponse createIpGroup(CreateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createIpGroup);
    }

    /**
     * 创建ip地址组
     *
     * 创建ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIpGroupRequest 请求对象
     * @return SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupInvoker(CreateIpGroupRequest request) {
        return new SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>(request, WafMeta.createIpGroup, hcClient);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, WafMeta.createPolicy, hcClient);
    }

    /**
     * 创建独享模式域名
     *
     * 创建独享模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return CreatePremiumHostResponse
     */
    public CreatePremiumHostResponse createPremiumHost(CreatePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPremiumHost);
    }

    /**
     * 创建独享模式域名
     *
     * 创建独享模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>
     */
    public SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHostInvoker(
        CreatePremiumHostRequest request) {
        return new SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>(request, WafMeta.createPremiumHost,
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
     * @return CreatePrepaidCloudWafResponse
     */
    public CreatePrepaidCloudWafResponse createPrepaidCloudWaf(CreatePrepaidCloudWafRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPrepaidCloudWaf);
    }

    /**
     * 购买包周期云模式waf
     *
     * 购买包周期云模式waf。入门版waf不支持购买扩展包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrepaidCloudWafRequest 请求对象
     * @return SyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse>
     */
    public SyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> createPrepaidCloudWafInvoker(
        CreatePrepaidCloudWafRequest request) {
        return new SyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse>(request,
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
     * @return CreatePrivacyRuleResponse
     */
    public CreatePrivacyRuleResponse createPrivacyRule(CreatePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPrivacyRule);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivacyRuleRequest 请求对象
     * @return SyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse>
     */
    public SyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> createPrivacyRuleInvoker(
        CreatePrivacyRuleRequest request) {
        return new SyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse>(request, WafMeta.createPrivacyRule,
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
     * @return CreateValueListResponse
     */
    public CreateValueListResponse createValueList(CreateValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createValueList);
    }

    /**
     * 创建引用表
     *
     * 创建引用表，引用表能够被CC攻击防护规则和精准访问防护中的规则所引用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateValueListRequest 请求对象
     * @return SyncInvoker<CreateValueListRequest, CreateValueListResponse>
     */
    public SyncInvoker<CreateValueListRequest, CreateValueListResponse> createValueListInvoker(
        CreateValueListRequest request) {
        return new SyncInvoker<CreateValueListRequest, CreateValueListResponse>(request, WafMeta.createValueList,
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
     * @return CreateWhiteblackipRuleResponse
     */
    public CreateWhiteblackipRuleResponse createWhiteblackipRule(CreateWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createWhiteblackipRule);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse>
     */
    public SyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> createWhiteblackipRuleInvoker(
        CreateWhiteblackipRuleRequest request) {
        return new SyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse>(request,
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
     * @return DeleteAntitamperRuleResponse
     */
    public DeleteAntitamperRuleResponse deleteAntitamperRule(DeleteAntitamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteAntitamperRule);
    }

    /**
     * 删除防篡改防护规则
     *
     * 删除防篡改防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAntitamperRuleRequest 请求对象
     * @return SyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse>
     */
    public SyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> deleteAntitamperRuleInvoker(
        DeleteAntitamperRuleRequest request) {
        return new SyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse>(request,
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
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, WafMeta.deleteCertificate,
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
     * @return DeleteGeoipRuleResponse
     */
    public DeleteGeoipRuleResponse deleteGeoipRule(DeleteGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteGeoipRule);
    }

    /**
     * 删除地理位置控制防护规则
     *
     * 删除地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>
     */
    public SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRuleInvoker(
        DeleteGeoipRuleRequest request) {
        return new SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>(request, WafMeta.deleteGeoipRule,
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
     * @return DeleteHostResponse
     */
    public DeleteHostResponse deleteHost(DeleteHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteHost);
    }

    /**
     * 删除云模式防护域名
     *
     * 删除云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostRequest 请求对象
     * @return SyncInvoker<DeleteHostRequest, DeleteHostResponse>
     */
    public SyncInvoker<DeleteHostRequest, DeleteHostResponse> deleteHostInvoker(DeleteHostRequest request) {
        return new SyncInvoker<DeleteHostRequest, DeleteHostResponse>(request, WafMeta.deleteHost, hcClient);
    }

    /**
     * 删除全局白名单(原误报屏蔽)防护规则
     *
     * 删除全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIgnoreRuleRequest 请求对象
     * @return DeleteIgnoreRuleResponse
     */
    public DeleteIgnoreRuleResponse deleteIgnoreRule(DeleteIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteIgnoreRule);
    }

    /**
     * 删除全局白名单(原误报屏蔽)防护规则
     *
     * 删除全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIgnoreRuleRequest 请求对象
     * @return SyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse>
     */
    public SyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> deleteIgnoreRuleInvoker(
        DeleteIgnoreRuleRequest request) {
        return new SyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse>(request, WafMeta.deleteIgnoreRule,
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
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteInstance);
    }

    /**
     * 删除WAF独享引擎信息
     *
     * 删除WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, WafMeta.deleteInstance,
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
     * @return DeleteIpGroupResponse
     */
    public DeleteIpGroupResponse deleteIpGroup(DeleteIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteIpGroup);
    }

    /**
     * 删除ip地址组
     *
     * 删除ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIpGroupRequest 请求对象
     * @return SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupInvoker(DeleteIpGroupRequest request) {
        return new SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>(request, WafMeta.deleteIpGroup, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, WafMeta.deletePolicy, hcClient);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return DeletePremiumHostResponse
     */
    public DeletePremiumHostResponse deletePremiumHost(DeletePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePremiumHost);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>
     */
    public SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHostInvoker(
        DeletePremiumHostRequest request) {
        return new SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>(request, WafMeta.deletePremiumHost,
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
     * @return DeletePrivacyRuleResponse
     */
    public DeletePrivacyRuleResponse deletePrivacyRule(DeletePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePrivacyRule);
    }

    /**
     * 删除隐私屏蔽防护规则
     *
     * 删除隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivacyRuleRequest 请求对象
     * @return SyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse>
     */
    public SyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> deletePrivacyRuleInvoker(
        DeletePrivacyRuleRequest request) {
        return new SyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse>(request, WafMeta.deletePrivacyRule,
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
     * @return DeleteValueListResponse
     */
    public DeleteValueListResponse deleteValueList(DeleteValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteValueList);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteValueListRequest 请求对象
     * @return SyncInvoker<DeleteValueListRequest, DeleteValueListResponse>
     */
    public SyncInvoker<DeleteValueListRequest, DeleteValueListResponse> deleteValueListInvoker(
        DeleteValueListRequest request) {
        return new SyncInvoker<DeleteValueListRequest, DeleteValueListResponse>(request, WafMeta.deleteValueList,
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
     * @return DeleteWhiteBlackIpRuleResponse
     */
    public DeleteWhiteBlackIpRuleResponse deleteWhiteBlackIpRule(DeleteWhiteBlackIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteWhiteBlackIpRule);
    }

    /**
     * 删除黑白名单防护规则
     *
     * 删除黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWhiteBlackIpRuleRequest 请求对象
     * @return SyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse>
     */
    public SyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRuleInvoker(
        DeleteWhiteBlackIpRuleRequest request) {
        return new SyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse>(request,
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
     * @return ListAntitamperRuleResponse
     */
    public ListAntitamperRuleResponse listAntitamperRule(ListAntitamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAntitamperRule);
    }

    /**
     * 查询防篡改规则列表
     *
     * 查询防篡改规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAntitamperRuleRequest 请求对象
     * @return SyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse>
     */
    public SyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse> listAntitamperRuleInvoker(
        ListAntitamperRuleRequest request) {
        return new SyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse>(request,
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
     * @return ListBandwidthTimelineResponse
     */
    public ListBandwidthTimelineResponse listBandwidthTimeline(ListBandwidthTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listBandwidthTimeline);
    }

    /**
     * 查询安全统计带宽数据
     *
     * 查询安全统计带宽数据，统计的带宽数据为平均值，单位为bit/s。需要注意的是，安全统计相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthTimelineRequest 请求对象
     * @return SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>
     */
    public SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimelineInvoker(
        ListBandwidthTimelineRequest request) {
        return new SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>(request,
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
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, WafMeta.listCertificates,
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
     * @return ListCompositeHostsResponse
     */
    public ListCompositeHostsResponse listCompositeHosts(ListCompositeHostsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCompositeHosts);
    }

    /**
     * 查询全部防护域名列表
     *
     * 查询全部防护域名列表，包括云模式和独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCompositeHostsRequest 请求对象
     * @return SyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse>
     */
    public SyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse> listCompositeHostsInvoker(
        ListCompositeHostsRequest request) {
        return new SyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse>(request,
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
     * @return ListEventResponse
     */
    public ListEventResponse listEvent(ListEventRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listEvent);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表，该API暂时不支持查询全部防护事件，pagesize参数不可设为-1，由于性能原因，数据量越大消耗的内存越大，后端最多限制查询10000条数据，例如：自定义时间段内的数据超过了10000条，就无法查出page为101，pagesize为100之后的数据，需要调整时间区间，再进行查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventRequest 请求对象
     * @return SyncInvoker<ListEventRequest, ListEventResponse>
     */
    public SyncInvoker<ListEventRequest, ListEventResponse> listEventInvoker(ListEventRequest request) {
        return new SyncInvoker<ListEventRequest, ListEventResponse>(request, WafMeta.listEvent, hcClient);
    }

    /**
     * 查询地理位置访问控制规则列表
     *
     * 查询地理位置访问控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGeoipRuleRequest 请求对象
     * @return ListGeoipRuleResponse
     */
    public ListGeoipRuleResponse listGeoipRule(ListGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listGeoipRule);
    }

    /**
     * 查询地理位置访问控制规则列表
     *
     * 查询地理位置访问控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGeoipRuleRequest 请求对象
     * @return SyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse>
     */
    public SyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse> listGeoipRuleInvoker(ListGeoipRuleRequest request) {
        return new SyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse>(request, WafMeta.listGeoipRule, hcClient);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return ListHostResponse
     */
    public ListHostResponse listHost(ListHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listHost);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return SyncInvoker<ListHostRequest, ListHostResponse>
     */
    public SyncInvoker<ListHostRequest, ListHostResponse> listHostInvoker(ListHostRequest request) {
        return new SyncInvoker<ListHostRequest, ListHostResponse>(request, WafMeta.listHost, hcClient);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRouteRequest 请求对象
     * @return ListHostRouteResponse
     */
    public ListHostRouteResponse listHostRoute(ListHostRouteRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listHostRoute);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRouteRequest 请求对象
     * @return SyncInvoker<ListHostRouteRequest, ListHostRouteResponse>
     */
    public SyncInvoker<ListHostRouteRequest, ListHostRouteResponse> listHostRouteInvoker(ListHostRouteRequest request) {
        return new SyncInvoker<ListHostRouteRequest, ListHostRouteResponse>(request, WafMeta.listHostRoute, hcClient);
    }

    /**
     * 查询全局白名单(原误报屏蔽)规则列表
     *
     * 查询全局白名单(原误报屏蔽)规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIgnoreRuleRequest 请求对象
     * @return ListIgnoreRuleResponse
     */
    public ListIgnoreRuleResponse listIgnoreRule(ListIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listIgnoreRule);
    }

    /**
     * 查询全局白名单(原误报屏蔽)规则列表
     *
     * 查询全局白名单(原误报屏蔽)规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIgnoreRuleRequest 请求对象
     * @return SyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse>
     */
    public SyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse> listIgnoreRuleInvoker(
        ListIgnoreRuleRequest request) {
        return new SyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse>(request, WafMeta.listIgnoreRule,
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
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listInstance);
    }

    /**
     * 查询WAF独享引擎列表
     *
     * 查询WAF独享引擎列表。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceRequest 请求对象
     * @return SyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public SyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceInvoker(ListInstanceRequest request) {
        return new SyncInvoker<ListInstanceRequest, ListInstanceResponse>(request, WafMeta.listInstance, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpGroupRequest 请求对象
     * @return ListIpGroupResponse
     */
    public ListIpGroupResponse listIpGroup(ListIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listIpGroup);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpGroupRequest 请求对象
     * @return SyncInvoker<ListIpGroupRequest, ListIpGroupResponse>
     */
    public SyncInvoker<ListIpGroupRequest, ListIpGroupResponse> listIpGroupInvoker(ListIpGroupRequest request) {
        return new SyncInvoker<ListIpGroupRequest, ListIpGroupResponse>(request, WafMeta.listIpGroup, hcClient);
    }

    /**
     * 查询告警通知配置
     *
     * 查询告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNoticeConfigsRequest 请求对象
     * @return ListNoticeConfigsResponse
     */
    public ListNoticeConfigsResponse listNoticeConfigs(ListNoticeConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listNoticeConfigs);
    }

    /**
     * 查询告警通知配置
     *
     * 查询告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNoticeConfigsRequest 请求对象
     * @return SyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse>
     */
    public SyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse> listNoticeConfigsInvoker(
        ListNoticeConfigsRequest request) {
        return new SyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse>(request, WafMeta.listNoticeConfigs,
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
     * @return ListOverviewsClassificationResponse
     */
    public ListOverviewsClassificationResponse listOverviewsClassification(ListOverviewsClassificationRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listOverviewsClassification);
    }

    /**
     * 查询安全总览分类统计top信息
     *
     * 查询安全总览分类统计TOP信息，包含受攻击域名 、攻击源ip、受攻击URL、攻击来源区域、攻击事件分布。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOverviewsClassificationRequest 请求对象
     * @return SyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse>
     */
    public SyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> listOverviewsClassificationInvoker(
        ListOverviewsClassificationRequest request) {
        return new SyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse>(request,
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
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPolicy);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return SyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public SyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyInvoker(ListPolicyRequest request) {
        return new SyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, WafMeta.listPolicy, hcClient);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPremiumHostRequest 请求对象
     * @return ListPremiumHostResponse
     */
    public ListPremiumHostResponse listPremiumHost(ListPremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPremiumHost);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPremiumHostRequest 请求对象
     * @return SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>
     */
    public SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHostInvoker(
        ListPremiumHostRequest request) {
        return new SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>(request, WafMeta.listPremiumHost,
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
     * @return ListPrivacyRuleResponse
     */
    public ListPrivacyRuleResponse listPrivacyRule(ListPrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPrivacyRule);
    }

    /**
     * 查询隐私屏蔽防护规则
     *
     * 查询隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivacyRuleRequest 请求对象
     * @return SyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse>
     */
    public SyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse> listPrivacyRuleInvoker(
        ListPrivacyRuleRequest request) {
        return new SyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse>(request, WafMeta.listPrivacyRule,
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
     * @return ListQpsTimelineResponse
     */
    public ListQpsTimelineResponse listQpsTimeline(ListQpsTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listQpsTimeline);
    }

    /**
     * 查询安全统计qps次数
     *
     * 查询安全统计qps次数。需要注意的是，安全统计相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQpsTimelineRequest 请求对象
     * @return SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>
     */
    public SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimelineInvoker(
        ListQpsTimelineRequest request) {
        return new SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>(request, WafMeta.listQpsTimeline,
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
     * @return ListRequestTimelineResponse
     */
    public ListRequestTimelineResponse listRequestTimeline(ListRequestTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listRequestTimeline);
    }

    /**
     * 查询安全总览中请求次数时间线统计数据
     *
     * 查询安全总览中请求次数时间线统计数据。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRequestTimelineRequest 请求对象
     * @return SyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>
     */
    public SyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimelineInvoker(
        ListRequestTimelineRequest request) {
        return new SyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>(request,
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
     * @return ListStatisticsResponse
     */
    public ListStatisticsResponse listStatistics(ListStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listStatistics);
    }

    /**
     * 查询安全总览请求与攻击数量
     *
     * 查询安全总览请求与攻击数量。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public SyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsInvoker(
        ListStatisticsRequest request) {
        return new SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>(request, WafMeta.listStatistics,
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
     * @return ListTopAbnormalResponse
     */
    public ListTopAbnormalResponse listTopAbnormal(ListTopAbnormalRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopAbnormal);
    }

    /**
     * 查询业务异常数量
     *
     * 查询业务异常TOP统计信息。需要注意的是，安全总览相关的接口，暂时不能支持任意时间的查询。只能支持 console上显示的 昨天，今天，3天，7天和30天 数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTopAbnormalRequest 请求对象
     * @return SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>
     */
    public SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormalInvoker(
        ListTopAbnormalRequest request) {
        return new SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>(request, WafMeta.listTopAbnormal,
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
     * @return ListValueListResponse
     */
    public ListValueListResponse listValueList(ListValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listValueList);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListValueListRequest 请求对象
     * @return SyncInvoker<ListValueListRequest, ListValueListResponse>
     */
    public SyncInvoker<ListValueListRequest, ListValueListResponse> listValueListInvoker(ListValueListRequest request) {
        return new SyncInvoker<ListValueListRequest, ListValueListResponse>(request, WafMeta.listValueList, hcClient);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWhiteblackipRuleRequest 请求对象
     * @return ListWhiteblackipRuleResponse
     */
    public ListWhiteblackipRuleResponse listWhiteblackipRule(ListWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listWhiteblackipRule);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse>
     */
    public SyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> listWhiteblackipRuleInvoker(
        ListWhiteblackipRuleRequest request) {
        return new SyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse>(request,
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
     * @return MigrateCompositeHostsResponse
     */
    public MigrateCompositeHostsResponse migrateCompositeHosts(MigrateCompositeHostsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.migrateCompositeHosts);
    }

    /**
     * 按企业项目迁移防护域名
     *
     * 按企业项目迁移防护域名，仅专业版与独享版支持该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateCompositeHostsRequest 请求对象
     * @return SyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse>
     */
    public SyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> migrateCompositeHostsInvoker(
        MigrateCompositeHostsRequest request) {
        return new SyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse>(request,
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
     * @return RenameInstanceResponse
     */
    public RenameInstanceResponse renameInstance(RenameInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.renameInstance);
    }

    /**
     * 重命名WAF独享引擎
     *
     * 重命名WAF独享引擎。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenameInstanceRequest 请求对象
     * @return SyncInvoker<RenameInstanceRequest, RenameInstanceResponse>
     */
    public SyncInvoker<RenameInstanceRequest, RenameInstanceResponse> renameInstanceInvoker(
        RenameInstanceRequest request) {
        return new SyncInvoker<RenameInstanceRequest, RenameInstanceResponse>(request, WafMeta.renameInstance,
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
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCertificate);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, WafMeta.showCertificate,
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
     * @return ShowCompositeHostResponse
     */
    public ShowCompositeHostResponse showCompositeHost(ShowCompositeHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCompositeHost);
    }

    /**
     * 根据Id查询防护域名
     *
     * 根据Id查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCompositeHostRequest 请求对象
     * @return SyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse>
     */
    public SyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse> showCompositeHostInvoker(
        ShowCompositeHostRequest request) {
        return new SyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse>(request, WafMeta.showCompositeHost,
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
     * @return ShowConsoleConfigResponse
     */
    public ShowConsoleConfigResponse showConsoleConfig(ShowConsoleConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showConsoleConfig);
    }

    /**
     * 局点支持特性查询
     *
     * 局点支持特性查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConsoleConfigRequest 请求对象
     * @return SyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse>
     */
    public SyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse> showConsoleConfigInvoker(
        ShowConsoleConfigRequest request) {
        return new SyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse>(request, WafMeta.showConsoleConfig,
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
     * @return ShowEventResponse
     */
    public ShowEventResponse showEvent(ShowEventRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showEvent);
    }

    /**
     * 查询指定事件id的防护事件详情
     *
     * 查询指定事件id的防护事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return SyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public SyncInvoker<ShowEventRequest, ShowEventResponse> showEventInvoker(ShowEventRequest request) {
        return new SyncInvoker<ShowEventRequest, ShowEventResponse>(request, WafMeta.showEvent, hcClient);
    }

    /**
     * 根据防护域名Id查询云模式防护域名详细信息
     *
     * 根据防护域名Id查询云模式防护域名详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHostRequest 请求对象
     * @return ShowHostResponse
     */
    public ShowHostResponse showHost(ShowHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showHost);
    }

    /**
     * 根据防护域名Id查询云模式防护域名详细信息
     *
     * 根据防护域名Id查询云模式防护域名详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHostRequest 请求对象
     * @return SyncInvoker<ShowHostRequest, ShowHostResponse>
     */
    public SyncInvoker<ShowHostRequest, ShowHostResponse> showHostInvoker(ShowHostRequest request) {
        return new SyncInvoker<ShowHostRequest, ShowHostResponse>(request, WafMeta.showHost, hcClient);
    }

    /**
     * 查询WAF独享引擎信息
     *
     * 查询WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showInstance);
    }

    /**
     * 查询WAF独享引擎信息
     *
     * 查询WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, WafMeta.showInstance, hcClient);
    }

    /**
     * 查询ip地址组明细
     *
     * 查询ip地址组明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpGroupRequest 请求对象
     * @return ShowIpGroupResponse
     */
    public ShowIpGroupResponse showIpGroup(ShowIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showIpGroup);
    }

    /**
     * 查询ip地址组明细
     *
     * 查询ip地址组明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpGroupRequest 请求对象
     * @return SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupInvoker(ShowIpGroupRequest request) {
        return new SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>(request, WafMeta.showIpGroup, hcClient);
    }

    /**
     * 查询lts配置信息
     *
     * 查询lts配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLtsInfoConfigRequest 请求对象
     * @return ShowLtsInfoConfigResponse
     */
    public ShowLtsInfoConfigResponse showLtsInfoConfig(ShowLtsInfoConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showLtsInfoConfig);
    }

    /**
     * 查询lts配置信息
     *
     * 查询lts配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLtsInfoConfigRequest 请求对象
     * @return SyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse>
     */
    public SyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> showLtsInfoConfigInvoker(
        ShowLtsInfoConfigRequest request) {
        return new SyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse>(request, WafMeta.showLtsInfoConfig,
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
     * @return ShowPolicyResponse
     */
    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPolicy);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
     * @return SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>(request, WafMeta.showPolicy, hcClient);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return ShowPremiumHostResponse
     */
    public ShowPremiumHostResponse showPremiumHost(ShowPremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPremiumHost);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>
     */
    public SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHostInvoker(
        ShowPremiumHostRequest request) {
        return new SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>(request, WafMeta.showPremiumHost,
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
     * @return ShowSourceIpResponse
     */
    public ShowSourceIpResponse showSourceIp(ShowSourceIpRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showSourceIp);
    }

    /**
     * 查询WAF回源Ip信息
     *
     * 查询WAF回源Ip信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSourceIpRequest 请求对象
     * @return SyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse>
     */
    public SyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse> showSourceIpInvoker(ShowSourceIpRequest request) {
        return new SyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse>(request, WafMeta.showSourceIp, hcClient);
    }

    /**
     * 查询租户订购信息
     *
     * 查询租户订购信息，包括云模式包周期、按需计费、独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubscriptionInfoRequest 请求对象
     * @return ShowSubscriptionInfoResponse
     */
    public ShowSubscriptionInfoResponse showSubscriptionInfo(ShowSubscriptionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showSubscriptionInfo);
    }

    /**
     * 查询租户订购信息
     *
     * 查询租户订购信息，包括云模式包周期、按需计费、独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubscriptionInfoRequest 请求对象
     * @return SyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse>
     */
    public SyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> showSubscriptionInfoInvoker(
        ShowSubscriptionInfoRequest request) {
        return new SyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse>(request,
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
     * @return UpdateAlertNoticeConfigResponse
     */
    public UpdateAlertNoticeConfigResponse updateAlertNoticeConfig(UpdateAlertNoticeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateAlertNoticeConfig);
    }

    /**
     * 更新告警通知配置
     *
     * 更新告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlertNoticeConfigRequest 请求对象
     * @return SyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse>
     */
    public SyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> updateAlertNoticeConfigInvoker(
        UpdateAlertNoticeConfigRequest request) {
        return new SyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse>(request,
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
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateCertificate);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, WafMeta.updateCertificate,
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
     * @return UpdateGeoipRuleResponse
     */
    public UpdateGeoipRuleResponse updateGeoipRule(UpdateGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateGeoipRule);
    }

    /**
     * 更新地理位置控制防护规则
     *
     * 更新地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>
     */
    public SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRuleInvoker(
        UpdateGeoipRuleRequest request) {
        return new SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>(request, WafMeta.updateGeoipRule,
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
     * @return UpdateHostResponse
     */
    public UpdateHostResponse updateHost(UpdateHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateHost);
    }

    /**
     * 更新云模式防护域名的配置
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHostRequest 请求对象
     * @return SyncInvoker<UpdateHostRequest, UpdateHostResponse>
     */
    public SyncInvoker<UpdateHostRequest, UpdateHostResponse> updateHostInvoker(UpdateHostRequest request) {
        return new SyncInvoker<UpdateHostRequest, UpdateHostResponse>(request, WafMeta.updateHost, hcClient);
    }

    /**
     * 修改域名防护状态
     *
     * 修改域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHostProtectStatusRequest 请求对象
     * @return UpdateHostProtectStatusResponse
     */
    public UpdateHostProtectStatusResponse updateHostProtectStatus(UpdateHostProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateHostProtectStatus);
    }

    /**
     * 修改域名防护状态
     *
     * 修改域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHostProtectStatusRequest 请求对象
     * @return SyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse>
     */
    public SyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> updateHostProtectStatusInvoker(
        UpdateHostProtectStatusRequest request) {
        return new SyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse>(request,
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
     * @return UpdateIpGroupResponse
     */
    public UpdateIpGroupResponse updateIpGroup(UpdateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateIpGroup);
    }

    /**
     * 修改ip地址组
     *
     * 修改ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIpGroupRequest 请求对象
     * @return SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupInvoker(UpdateIpGroupRequest request) {
        return new SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>(request, WafMeta.updateIpGroup, hcClient);
    }

    /**
     * 配置全量日志lts
     *
     * 配置全量日志lts，该接口可用来开启与关闭waf全量日志以及配置日志组和日志流。日志组id和日志流id可前往云日志服务获取。配置的日志流id要属于所配置的日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLtsInfoConfigRequest 请求对象
     * @return UpdateLtsInfoConfigResponse
     */
    public UpdateLtsInfoConfigResponse updateLtsInfoConfig(UpdateLtsInfoConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateLtsInfoConfig);
    }

    /**
     * 配置全量日志lts
     *
     * 配置全量日志lts，该接口可用来开启与关闭waf全量日志以及配置日志组和日志流。日志组id和日志流id可前往云日志服务获取。配置的日志流id要属于所配置的日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLtsInfoConfigRequest 请求对象
     * @return SyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse>
     */
    public SyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> updateLtsInfoConfigInvoker(
        UpdateLtsInfoConfigRequest request) {
        return new SyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse>(request,
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
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePolicy);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>(request, WafMeta.updatePolicy, hcClient);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyProtectHostRequest 请求对象
     * @return UpdatePolicyProtectHostResponse
     */
    public UpdatePolicyProtectHostResponse updatePolicyProtectHost(UpdatePolicyProtectHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePolicyProtectHost);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyProtectHostRequest 请求对象
     * @return SyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse>
     */
    public SyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> updatePolicyProtectHostInvoker(
        UpdatePolicyProtectHostRequest request) {
        return new SyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse>(request,
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
     * @return UpdatePolicyRuleStatusResponse
     */
    public UpdatePolicyRuleStatusResponse updatePolicyRuleStatus(UpdatePolicyRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePolicyRuleStatus);
    }

    /**
     * 修改单条规则的状态
     *
     * 修改单条规则的状态，用于开启或者关闭单条规则，比如关闭精准防护中某一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyRuleStatusRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse>
     */
    public SyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> updatePolicyRuleStatusInvoker(
        UpdatePolicyRuleStatusRequest request) {
        return new SyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse>(request,
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
     * @return UpdatePremiumHostResponse
     */
    public UpdatePremiumHostResponse updatePremiumHost(UpdatePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHost);
    }

    /**
     * 修改独享模式域名配置
     *
     * 修改独享模式域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePremiumHostRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>
     */
    public SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHostInvoker(
        UpdatePremiumHostRequest request) {
        return new SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>(request, WafMeta.updatePremiumHost,
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
     * @return UpdatePremiumHostProtectStatusResponse
     */
    public UpdatePremiumHostProtectStatusResponse updatePremiumHostProtectStatus(
        UpdatePremiumHostProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHostProtectStatus);
    }

    /**
     * 修改独享模式域名防护状态
     *
     * 修改独享模式域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePremiumHostProtectStatusRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>
     */
    public SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusInvoker(
        UpdatePremiumHostProtectStatusRequest request) {
        return new SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>(request,
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
     * @return UpdatePrivacyRuleResponse
     */
    public UpdatePrivacyRuleResponse updatePrivacyRule(UpdatePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePrivacyRule);
    }

    /**
     * 更新隐私屏蔽防护规则
     *
     * 更新隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivacyRuleRequest 请求对象
     * @return SyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse>
     */
    public SyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> updatePrivacyRuleInvoker(
        UpdatePrivacyRuleRequest request) {
        return new SyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse>(request, WafMeta.updatePrivacyRule,
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
     * @return UpdateValueListResponse
     */
    public UpdateValueListResponse updateValueList(UpdateValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateValueList);
    }

    /**
     * 修改引用表
     *
     * 修改引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateValueListRequest 请求对象
     * @return SyncInvoker<UpdateValueListRequest, UpdateValueListResponse>
     */
    public SyncInvoker<UpdateValueListRequest, UpdateValueListResponse> updateValueListInvoker(
        UpdateValueListRequest request) {
        return new SyncInvoker<UpdateValueListRequest, UpdateValueListResponse>(request, WafMeta.updateValueList,
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
     * @return UpdateWhiteblackipRuleResponse
     */
    public UpdateWhiteblackipRuleResponse updateWhiteblackipRule(UpdateWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateWhiteblackipRule);
    }

    /**
     * 更新黑白名单防护规则
     *
     * 更新黑白名单防护规则，可以更新ip/ip段以及防护动作等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse>
     */
    public SyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> updateWhiteblackipRuleInvoker(
        UpdateWhiteblackipRuleRequest request) {
        return new SyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse>(request,
            WafMeta.updateWhiteblackipRule, hcClient);
    }

}

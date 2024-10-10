package com.huaweicloud.sdk.aad.v2;

import com.huaweicloud.sdk.aad.v2.model.CreateDomainRequest;
import com.huaweicloud.sdk.aad.v2.model.CreateDomainResponse;
import com.huaweicloud.sdk.aad.v2.model.DeleteDomainRequest;
import com.huaweicloud.sdk.aad.v2.model.DeleteDomainResponse;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSAttackEventRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSAttackEventResponse;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSConnectionNumberRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSConnectionNumberResponse;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSFlowRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSFlowResponse;
import com.huaweicloud.sdk.aad.v2.model.ListFrequencyControlRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListFrequencyControlRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListInstanceDomainsRequest;
import com.huaweicloud.sdk.aad.v2.model.ListInstanceDomainsResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafAttackEventRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafAttackEventResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafBandwidthRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafBandwidthResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafCustomRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafCustomRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafGeoIpRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafGeoIpRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafQpsRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafQpsResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafWhiteIpRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafWhiteIpRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainCertificateRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainCertificateResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowFlowBlockRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowFlowBlockResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowWafPolicyRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowWafPolicyResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowWafQpsRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowWafQpsResponse;
import com.huaweicloud.sdk.aad.v2.model.UpgradeInstanceSpecRequest;
import com.huaweicloud.sdk.aad.v2.model.UpgradeInstanceSpecResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AadClient {

    protected HcClient hcClient;

    public AadClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AadClient> newBuilder() {
        ClientBuilder<AadClient> clientBuilder = new ClientBuilder<>(AadClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.createDomain);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return SyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public SyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainInvoker(CreateDomainRequest request) {
        return new SyncInvoker<>(request, AadMeta.createDomain, hcClient);
    }

    /**
     * 查询DDoS攻击事件列表
     *
     * 查询DDoS攻击事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSAttackEventRequest 请求对象
     * @return ListDDoSAttackEventResponse
     */
    public ListDDoSAttackEventResponse listDDoSAttackEvent(ListDDoSAttackEventRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listDDoSAttackEvent);
    }

    /**
     * 查询DDoS攻击事件列表
     *
     * 查询DDoS攻击事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSAttackEventRequest 请求对象
     * @return SyncInvoker<ListDDoSAttackEventRequest, ListDDoSAttackEventResponse>
     */
    public SyncInvoker<ListDDoSAttackEventRequest, ListDDoSAttackEventResponse> listDDoSAttackEventInvoker(
        ListDDoSAttackEventRequest request) {
        return new SyncInvoker<>(request, AadMeta.listDDoSAttackEvent, hcClient);
    }

    /**
     * 查询新建连接数和并发连接数
     *
     * 查询新建连接数和并发连接数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSConnectionNumberRequest 请求对象
     * @return ListDDoSConnectionNumberResponse
     */
    public ListDDoSConnectionNumberResponse listDDoSConnectionNumber(ListDDoSConnectionNumberRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listDDoSConnectionNumber);
    }

    /**
     * 查询新建连接数和并发连接数
     *
     * 查询新建连接数和并发连接数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSConnectionNumberRequest 请求对象
     * @return SyncInvoker<ListDDoSConnectionNumberRequest, ListDDoSConnectionNumberResponse>
     */
    public SyncInvoker<ListDDoSConnectionNumberRequest, ListDDoSConnectionNumberResponse> listDDoSConnectionNumberInvoker(
        ListDDoSConnectionNumberRequest request) {
        return new SyncInvoker<>(request, AadMeta.listDDoSConnectionNumber, hcClient);
    }

    /**
     * 查询DDoS攻击防护BPS/PPS流量
     *
     * 查询DDoS攻击防护BPS/PPS流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSFlowRequest 请求对象
     * @return ListDDoSFlowResponse
     */
    public ListDDoSFlowResponse listDDoSFlow(ListDDoSFlowRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listDDoSFlow);
    }

    /**
     * 查询DDoS攻击防护BPS/PPS流量
     *
     * 查询DDoS攻击防护BPS/PPS流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSFlowRequest 请求对象
     * @return SyncInvoker<ListDDoSFlowRequest, ListDDoSFlowResponse>
     */
    public SyncInvoker<ListDDoSFlowRequest, ListDDoSFlowResponse> listDDoSFlowInvoker(ListDDoSFlowRequest request) {
        return new SyncInvoker<>(request, AadMeta.listDDoSFlow, hcClient);
    }

    /**
     * 查询频率控制规则列表
     *
     * 查询频率控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFrequencyControlRuleRequest 请求对象
     * @return ListFrequencyControlRuleResponse
     */
    public ListFrequencyControlRuleResponse listFrequencyControlRule(ListFrequencyControlRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listFrequencyControlRule);
    }

    /**
     * 查询频率控制规则列表
     *
     * 查询频率控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFrequencyControlRuleRequest 请求对象
     * @return SyncInvoker<ListFrequencyControlRuleRequest, ListFrequencyControlRuleResponse>
     */
    public SyncInvoker<ListFrequencyControlRuleRequest, ListFrequencyControlRuleResponse> listFrequencyControlRuleInvoker(
        ListFrequencyControlRuleRequest request) {
        return new SyncInvoker<>(request, AadMeta.listFrequencyControlRule, hcClient);
    }

    /**
     * 查询实例关联的域名信息
     *
     * 查询实例关联的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDomainsRequest 请求对象
     * @return ListInstanceDomainsResponse
     */
    public ListInstanceDomainsResponse listInstanceDomains(ListInstanceDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listInstanceDomains);
    }

    /**
     * 查询实例关联的域名信息
     *
     * 查询实例关联的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDomainsRequest 请求对象
     * @return SyncInvoker<ListInstanceDomainsRequest, ListInstanceDomainsResponse>
     */
    public SyncInvoker<ListInstanceDomainsRequest, ListInstanceDomainsResponse> listInstanceDomainsInvoker(
        ListInstanceDomainsRequest request) {
        return new SyncInvoker<>(request, AadMeta.listInstanceDomains, hcClient);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafAttackEventRequest 请求对象
     * @return ListWafAttackEventResponse
     */
    public ListWafAttackEventResponse listWafAttackEvent(ListWafAttackEventRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listWafAttackEvent);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafAttackEventRequest 请求对象
     * @return SyncInvoker<ListWafAttackEventRequest, ListWafAttackEventResponse>
     */
    public SyncInvoker<ListWafAttackEventRequest, ListWafAttackEventResponse> listWafAttackEventInvoker(
        ListWafAttackEventRequest request) {
        return new SyncInvoker<>(request, AadMeta.listWafAttackEvent, hcClient);
    }

    /**
     * 带宽曲线
     *
     * 带宽曲线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafBandwidthRequest 请求对象
     * @return ListWafBandwidthResponse
     */
    public ListWafBandwidthResponse listWafBandwidth(ListWafBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listWafBandwidth);
    }

    /**
     * 带宽曲线
     *
     * 带宽曲线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafBandwidthRequest 请求对象
     * @return SyncInvoker<ListWafBandwidthRequest, ListWafBandwidthResponse>
     */
    public SyncInvoker<ListWafBandwidthRequest, ListWafBandwidthResponse> listWafBandwidthInvoker(
        ListWafBandwidthRequest request) {
        return new SyncInvoker<>(request, AadMeta.listWafBandwidth, hcClient);
    }

    /**
     * 查询精准防护规则
     *
     * 查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafCustomRuleRequest 请求对象
     * @return ListWafCustomRuleResponse
     */
    public ListWafCustomRuleResponse listWafCustomRule(ListWafCustomRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listWafCustomRule);
    }

    /**
     * 查询精准防护规则
     *
     * 查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafCustomRuleRequest 请求对象
     * @return SyncInvoker<ListWafCustomRuleRequest, ListWafCustomRuleResponse>
     */
    public SyncInvoker<ListWafCustomRuleRequest, ListWafCustomRuleResponse> listWafCustomRuleInvoker(
        ListWafCustomRuleRequest request) {
        return new SyncInvoker<>(request, AadMeta.listWafCustomRule, hcClient);
    }

    /**
     * 查询区域封禁规则
     *
     * 查询区域封禁规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafGeoIpRuleRequest 请求对象
     * @return ListWafGeoIpRuleResponse
     */
    public ListWafGeoIpRuleResponse listWafGeoIpRule(ListWafGeoIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listWafGeoIpRule);
    }

    /**
     * 查询区域封禁规则
     *
     * 查询区域封禁规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafGeoIpRuleRequest 请求对象
     * @return SyncInvoker<ListWafGeoIpRuleRequest, ListWafGeoIpRuleResponse>
     */
    public SyncInvoker<ListWafGeoIpRuleRequest, ListWafGeoIpRuleResponse> listWafGeoIpRuleInvoker(
        ListWafGeoIpRuleRequest request) {
        return new SyncInvoker<>(request, AadMeta.listWafGeoIpRule, hcClient);
    }

    /**
     * 查询请求QPS
     *
     * 查询请求QPS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafQpsRequest 请求对象
     * @return ListWafQpsResponse
     */
    public ListWafQpsResponse listWafQps(ListWafQpsRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listWafQps);
    }

    /**
     * 查询请求QPS
     *
     * 查询请求QPS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafQpsRequest 请求对象
     * @return SyncInvoker<ListWafQpsRequest, ListWafQpsResponse>
     */
    public SyncInvoker<ListWafQpsRequest, ListWafQpsResponse> listWafQpsInvoker(ListWafQpsRequest request) {
        return new SyncInvoker<>(request, AadMeta.listWafQps, hcClient);
    }

    /**
     * 防护策略web-cc黑白名单-查询黑白名单规则
     *
     * 防护策略web-cc黑白名单-查询黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafWhiteIpRuleRequest 请求对象
     * @return ListWafWhiteIpRuleResponse
     */
    public ListWafWhiteIpRuleResponse listWafWhiteIpRule(ListWafWhiteIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listWafWhiteIpRule);
    }

    /**
     * 防护策略web-cc黑白名单-查询黑白名单规则
     *
     * 防护策略web-cc黑白名单-查询黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafWhiteIpRuleRequest 请求对象
     * @return SyncInvoker<ListWafWhiteIpRuleRequest, ListWafWhiteIpRuleResponse>
     */
    public SyncInvoker<ListWafWhiteIpRuleRequest, ListWafWhiteIpRuleResponse> listWafWhiteIpRuleInvoker(
        ListWafWhiteIpRuleRequest request) {
        return new SyncInvoker<>(request, AadMeta.listWafWhiteIpRule, hcClient);
    }

    /**
     * 查询DDoS攻击防护的黑白名单列表
     *
     * 查询DDoS攻击防护的黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteBlackIpRuleRequest 请求对象
     * @return ListWhiteBlackIpRuleResponse
     */
    public ListWhiteBlackIpRuleResponse listWhiteBlackIpRule(ListWhiteBlackIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listWhiteBlackIpRule);
    }

    /**
     * 查询DDoS攻击防护的黑白名单列表
     *
     * 查询DDoS攻击防护的黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteBlackIpRuleRequest 请求对象
     * @return SyncInvoker<ListWhiteBlackIpRuleRequest, ListWhiteBlackIpRuleResponse>
     */
    public SyncInvoker<ListWhiteBlackIpRuleRequest, ListWhiteBlackIpRuleResponse> listWhiteBlackIpRuleInvoker(
        ListWhiteBlackIpRuleRequest request) {
        return new SyncInvoker<>(request, AadMeta.listWhiteBlackIpRule, hcClient);
    }

    /**
     * 查询域名关联的证书信息
     *
     * 查询域名关联的证书信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainCertificateRequest 请求对象
     * @return ShowDomainCertificateResponse
     */
    public ShowDomainCertificateResponse showDomainCertificate(ShowDomainCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.showDomainCertificate);
    }

    /**
     * 查询域名关联的证书信息
     *
     * 查询域名关联的证书信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainCertificateRequest 请求对象
     * @return SyncInvoker<ShowDomainCertificateRequest, ShowDomainCertificateResponse>
     */
    public SyncInvoker<ShowDomainCertificateRequest, ShowDomainCertificateResponse> showDomainCertificateInvoker(
        ShowDomainCertificateRequest request) {
        return new SyncInvoker<>(request, AadMeta.showDomainCertificate, hcClient);
    }

    /**
     * 查询流量封禁信息
     *
     * 查询流量封禁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowBlockRequest 请求对象
     * @return ShowFlowBlockResponse
     */
    public ShowFlowBlockResponse showFlowBlock(ShowFlowBlockRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.showFlowBlock);
    }

    /**
     * 查询流量封禁信息
     *
     * 查询流量封禁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowBlockRequest 请求对象
     * @return SyncInvoker<ShowFlowBlockRequest, ShowFlowBlockResponse>
     */
    public SyncInvoker<ShowFlowBlockRequest, ShowFlowBlockResponse> showFlowBlockInvoker(ShowFlowBlockRequest request) {
        return new SyncInvoker<>(request, AadMeta.showFlowBlock, hcClient);
    }

    /**
     * 查询WEB防护策略配置
     *
     * 查询WEB防护策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWafPolicyRequest 请求对象
     * @return ShowWafPolicyResponse
     */
    public ShowWafPolicyResponse showWafPolicy(ShowWafPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.showWafPolicy);
    }

    /**
     * 查询WEB防护策略配置
     *
     * 查询WEB防护策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWafPolicyRequest 请求对象
     * @return SyncInvoker<ShowWafPolicyRequest, ShowWafPolicyResponse>
     */
    public SyncInvoker<ShowWafPolicyRequest, ShowWafPolicyResponse> showWafPolicyInvoker(ShowWafPolicyRequest request) {
        return new SyncInvoker<>(request, AadMeta.showWafPolicy, hcClient);
    }

    /**
     * 查询CC攻击防护请求QPS
     *
     * 查询CC攻击防护请求QPS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWafQpsRequest 请求对象
     * @return ShowWafQpsResponse
     */
    public ShowWafQpsResponse showWafQps(ShowWafQpsRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.showWafQps);
    }

    /**
     * 查询CC攻击防护请求QPS
     *
     * 查询CC攻击防护请求QPS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWafQpsRequest 请求对象
     * @return SyncInvoker<ShowWafQpsRequest, ShowWafQpsResponse>
     */
    public SyncInvoker<ShowWafQpsRequest, ShowWafQpsResponse> showWafQpsInvoker(ShowWafQpsRequest request) {
        return new SyncInvoker<>(request, AadMeta.showWafQps, hcClient);
    }

    /**
     * 修改实例规格
     *
     * 修改实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceSpecRequest 请求对象
     * @return UpgradeInstanceSpecResponse
     */
    public UpgradeInstanceSpecResponse upgradeInstanceSpec(UpgradeInstanceSpecRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.upgradeInstanceSpec);
    }

    /**
     * 修改实例规格
     *
     * 修改实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceSpecRequest 请求对象
     * @return SyncInvoker<UpgradeInstanceSpecRequest, UpgradeInstanceSpecResponse>
     */
    public SyncInvoker<UpgradeInstanceSpecRequest, UpgradeInstanceSpecResponse> upgradeInstanceSpecInvoker(
        UpgradeInstanceSpecRequest request) {
        return new SyncInvoker<>(request, AadMeta.upgradeInstanceSpec, hcClient);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.deleteDomain);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public SyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainInvoker(DeleteDomainRequest request) {
        return new SyncInvoker<>(request, AadMeta.deleteDomain, hcClient);
    }

}

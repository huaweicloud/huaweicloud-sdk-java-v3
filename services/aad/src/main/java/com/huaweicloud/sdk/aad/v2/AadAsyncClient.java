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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AadAsyncClient {

    protected HcClient hcClient;

    public AadAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AadAsyncClient> newBuilder() {
        ClientBuilder<AadAsyncClient> clientBuilder = new ClientBuilder<>(AadAsyncClient::new, "GlobalCredentials");
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
     * @return CompletableFuture<CreateDomainResponse>
     */
    public CompletableFuture<CreateDomainResponse> createDomainAsync(CreateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.createDomain);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return AsyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public AsyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainAsyncInvoker(
        CreateDomainRequest request) {
        return new AsyncInvoker<>(request, AadMeta.createDomain, hcClient);
    }

    /**
     * 查询DDoS攻击事件列表
     *
     * 查询DDoS攻击事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSAttackEventRequest 请求对象
     * @return CompletableFuture<ListDDoSAttackEventResponse>
     */
    public CompletableFuture<ListDDoSAttackEventResponse> listDDoSAttackEventAsync(ListDDoSAttackEventRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listDDoSAttackEvent);
    }

    /**
     * 查询DDoS攻击事件列表
     *
     * 查询DDoS攻击事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSAttackEventRequest 请求对象
     * @return AsyncInvoker<ListDDoSAttackEventRequest, ListDDoSAttackEventResponse>
     */
    public AsyncInvoker<ListDDoSAttackEventRequest, ListDDoSAttackEventResponse> listDDoSAttackEventAsyncInvoker(
        ListDDoSAttackEventRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listDDoSAttackEvent, hcClient);
    }

    /**
     * 查询新建连接数和并发连接数
     *
     * 查询新建连接数和并发连接数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSConnectionNumberRequest 请求对象
     * @return CompletableFuture<ListDDoSConnectionNumberResponse>
     */
    public CompletableFuture<ListDDoSConnectionNumberResponse> listDDoSConnectionNumberAsync(
        ListDDoSConnectionNumberRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listDDoSConnectionNumber);
    }

    /**
     * 查询新建连接数和并发连接数
     *
     * 查询新建连接数和并发连接数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSConnectionNumberRequest 请求对象
     * @return AsyncInvoker<ListDDoSConnectionNumberRequest, ListDDoSConnectionNumberResponse>
     */
    public AsyncInvoker<ListDDoSConnectionNumberRequest, ListDDoSConnectionNumberResponse> listDDoSConnectionNumberAsyncInvoker(
        ListDDoSConnectionNumberRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listDDoSConnectionNumber, hcClient);
    }

    /**
     * 查询DDoS攻击防护BPS/PPS流量
     *
     * 查询DDoS攻击防护BPS/PPS流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSFlowRequest 请求对象
     * @return CompletableFuture<ListDDoSFlowResponse>
     */
    public CompletableFuture<ListDDoSFlowResponse> listDDoSFlowAsync(ListDDoSFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listDDoSFlow);
    }

    /**
     * 查询DDoS攻击防护BPS/PPS流量
     *
     * 查询DDoS攻击防护BPS/PPS流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSFlowRequest 请求对象
     * @return AsyncInvoker<ListDDoSFlowRequest, ListDDoSFlowResponse>
     */
    public AsyncInvoker<ListDDoSFlowRequest, ListDDoSFlowResponse> listDDoSFlowAsyncInvoker(
        ListDDoSFlowRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listDDoSFlow, hcClient);
    }

    /**
     * 查询频率控制规则列表
     *
     * 查询频率控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFrequencyControlRuleRequest 请求对象
     * @return CompletableFuture<ListFrequencyControlRuleResponse>
     */
    public CompletableFuture<ListFrequencyControlRuleResponse> listFrequencyControlRuleAsync(
        ListFrequencyControlRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listFrequencyControlRule);
    }

    /**
     * 查询频率控制规则列表
     *
     * 查询频率控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFrequencyControlRuleRequest 请求对象
     * @return AsyncInvoker<ListFrequencyControlRuleRequest, ListFrequencyControlRuleResponse>
     */
    public AsyncInvoker<ListFrequencyControlRuleRequest, ListFrequencyControlRuleResponse> listFrequencyControlRuleAsyncInvoker(
        ListFrequencyControlRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listFrequencyControlRule, hcClient);
    }

    /**
     * 查询实例关联的域名信息
     *
     * 查询实例关联的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDomainsRequest 请求对象
     * @return CompletableFuture<ListInstanceDomainsResponse>
     */
    public CompletableFuture<ListInstanceDomainsResponse> listInstanceDomainsAsync(ListInstanceDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listInstanceDomains);
    }

    /**
     * 查询实例关联的域名信息
     *
     * 查询实例关联的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDomainsRequest 请求对象
     * @return AsyncInvoker<ListInstanceDomainsRequest, ListInstanceDomainsResponse>
     */
    public AsyncInvoker<ListInstanceDomainsRequest, ListInstanceDomainsResponse> listInstanceDomainsAsyncInvoker(
        ListInstanceDomainsRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listInstanceDomains, hcClient);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafAttackEventRequest 请求对象
     * @return CompletableFuture<ListWafAttackEventResponse>
     */
    public CompletableFuture<ListWafAttackEventResponse> listWafAttackEventAsync(ListWafAttackEventRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listWafAttackEvent);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafAttackEventRequest 请求对象
     * @return AsyncInvoker<ListWafAttackEventRequest, ListWafAttackEventResponse>
     */
    public AsyncInvoker<ListWafAttackEventRequest, ListWafAttackEventResponse> listWafAttackEventAsyncInvoker(
        ListWafAttackEventRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listWafAttackEvent, hcClient);
    }

    /**
     * 带宽曲线
     *
     * 带宽曲线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafBandwidthRequest 请求对象
     * @return CompletableFuture<ListWafBandwidthResponse>
     */
    public CompletableFuture<ListWafBandwidthResponse> listWafBandwidthAsync(ListWafBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listWafBandwidth);
    }

    /**
     * 带宽曲线
     *
     * 带宽曲线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafBandwidthRequest 请求对象
     * @return AsyncInvoker<ListWafBandwidthRequest, ListWafBandwidthResponse>
     */
    public AsyncInvoker<ListWafBandwidthRequest, ListWafBandwidthResponse> listWafBandwidthAsyncInvoker(
        ListWafBandwidthRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listWafBandwidth, hcClient);
    }

    /**
     * 查询精准防护规则
     *
     * 查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafCustomRuleRequest 请求对象
     * @return CompletableFuture<ListWafCustomRuleResponse>
     */
    public CompletableFuture<ListWafCustomRuleResponse> listWafCustomRuleAsync(ListWafCustomRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listWafCustomRule);
    }

    /**
     * 查询精准防护规则
     *
     * 查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafCustomRuleRequest 请求对象
     * @return AsyncInvoker<ListWafCustomRuleRequest, ListWafCustomRuleResponse>
     */
    public AsyncInvoker<ListWafCustomRuleRequest, ListWafCustomRuleResponse> listWafCustomRuleAsyncInvoker(
        ListWafCustomRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listWafCustomRule, hcClient);
    }

    /**
     * 查询区域封禁规则
     *
     * 查询区域封禁规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafGeoIpRuleRequest 请求对象
     * @return CompletableFuture<ListWafGeoIpRuleResponse>
     */
    public CompletableFuture<ListWafGeoIpRuleResponse> listWafGeoIpRuleAsync(ListWafGeoIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listWafGeoIpRule);
    }

    /**
     * 查询区域封禁规则
     *
     * 查询区域封禁规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafGeoIpRuleRequest 请求对象
     * @return AsyncInvoker<ListWafGeoIpRuleRequest, ListWafGeoIpRuleResponse>
     */
    public AsyncInvoker<ListWafGeoIpRuleRequest, ListWafGeoIpRuleResponse> listWafGeoIpRuleAsyncInvoker(
        ListWafGeoIpRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listWafGeoIpRule, hcClient);
    }

    /**
     * 查询请求QPS
     *
     * 查询请求QPS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafQpsRequest 请求对象
     * @return CompletableFuture<ListWafQpsResponse>
     */
    public CompletableFuture<ListWafQpsResponse> listWafQpsAsync(ListWafQpsRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listWafQps);
    }

    /**
     * 查询请求QPS
     *
     * 查询请求QPS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafQpsRequest 请求对象
     * @return AsyncInvoker<ListWafQpsRequest, ListWafQpsResponse>
     */
    public AsyncInvoker<ListWafQpsRequest, ListWafQpsResponse> listWafQpsAsyncInvoker(ListWafQpsRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listWafQps, hcClient);
    }

    /**
     * 防护策略web-cc黑白名单-查询黑白名单规则
     *
     * 防护策略web-cc黑白名单-查询黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafWhiteIpRuleRequest 请求对象
     * @return CompletableFuture<ListWafWhiteIpRuleResponse>
     */
    public CompletableFuture<ListWafWhiteIpRuleResponse> listWafWhiteIpRuleAsync(ListWafWhiteIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listWafWhiteIpRule);
    }

    /**
     * 防护策略web-cc黑白名单-查询黑白名单规则
     *
     * 防护策略web-cc黑白名单-查询黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWafWhiteIpRuleRequest 请求对象
     * @return AsyncInvoker<ListWafWhiteIpRuleRequest, ListWafWhiteIpRuleResponse>
     */
    public AsyncInvoker<ListWafWhiteIpRuleRequest, ListWafWhiteIpRuleResponse> listWafWhiteIpRuleAsyncInvoker(
        ListWafWhiteIpRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listWafWhiteIpRule, hcClient);
    }

    /**
     * 查询DDoS攻击防护的黑白名单列表
     *
     * 查询DDoS攻击防护的黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteBlackIpRuleRequest 请求对象
     * @return CompletableFuture<ListWhiteBlackIpRuleResponse>
     */
    public CompletableFuture<ListWhiteBlackIpRuleResponse> listWhiteBlackIpRuleAsync(
        ListWhiteBlackIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listWhiteBlackIpRule);
    }

    /**
     * 查询DDoS攻击防护的黑白名单列表
     *
     * 查询DDoS攻击防护的黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteBlackIpRuleRequest 请求对象
     * @return AsyncInvoker<ListWhiteBlackIpRuleRequest, ListWhiteBlackIpRuleResponse>
     */
    public AsyncInvoker<ListWhiteBlackIpRuleRequest, ListWhiteBlackIpRuleResponse> listWhiteBlackIpRuleAsyncInvoker(
        ListWhiteBlackIpRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listWhiteBlackIpRule, hcClient);
    }

    /**
     * 查询域名关联的证书信息
     *
     * 查询域名关联的证书信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainCertificateRequest 请求对象
     * @return CompletableFuture<ShowDomainCertificateResponse>
     */
    public CompletableFuture<ShowDomainCertificateResponse> showDomainCertificateAsync(
        ShowDomainCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showDomainCertificate);
    }

    /**
     * 查询域名关联的证书信息
     *
     * 查询域名关联的证书信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainCertificateRequest 请求对象
     * @return AsyncInvoker<ShowDomainCertificateRequest, ShowDomainCertificateResponse>
     */
    public AsyncInvoker<ShowDomainCertificateRequest, ShowDomainCertificateResponse> showDomainCertificateAsyncInvoker(
        ShowDomainCertificateRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showDomainCertificate, hcClient);
    }

    /**
     * 查询流量封禁信息
     *
     * 查询流量封禁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowBlockRequest 请求对象
     * @return CompletableFuture<ShowFlowBlockResponse>
     */
    public CompletableFuture<ShowFlowBlockResponse> showFlowBlockAsync(ShowFlowBlockRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showFlowBlock);
    }

    /**
     * 查询流量封禁信息
     *
     * 查询流量封禁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowBlockRequest 请求对象
     * @return AsyncInvoker<ShowFlowBlockRequest, ShowFlowBlockResponse>
     */
    public AsyncInvoker<ShowFlowBlockRequest, ShowFlowBlockResponse> showFlowBlockAsyncInvoker(
        ShowFlowBlockRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showFlowBlock, hcClient);
    }

    /**
     * 查询WEB防护策略配置
     *
     * 查询WEB防护策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWafPolicyRequest 请求对象
     * @return CompletableFuture<ShowWafPolicyResponse>
     */
    public CompletableFuture<ShowWafPolicyResponse> showWafPolicyAsync(ShowWafPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showWafPolicy);
    }

    /**
     * 查询WEB防护策略配置
     *
     * 查询WEB防护策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWafPolicyRequest 请求对象
     * @return AsyncInvoker<ShowWafPolicyRequest, ShowWafPolicyResponse>
     */
    public AsyncInvoker<ShowWafPolicyRequest, ShowWafPolicyResponse> showWafPolicyAsyncInvoker(
        ShowWafPolicyRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showWafPolicy, hcClient);
    }

    /**
     * 查询CC攻击防护请求QPS
     *
     * 查询CC攻击防护请求QPS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWafQpsRequest 请求对象
     * @return CompletableFuture<ShowWafQpsResponse>
     */
    public CompletableFuture<ShowWafQpsResponse> showWafQpsAsync(ShowWafQpsRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showWafQps);
    }

    /**
     * 查询CC攻击防护请求QPS
     *
     * 查询CC攻击防护请求QPS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWafQpsRequest 请求对象
     * @return AsyncInvoker<ShowWafQpsRequest, ShowWafQpsResponse>
     */
    public AsyncInvoker<ShowWafQpsRequest, ShowWafQpsResponse> showWafQpsAsyncInvoker(ShowWafQpsRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showWafQps, hcClient);
    }

    /**
     * 修改实例规格
     *
     * 修改实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceSpecRequest 请求对象
     * @return CompletableFuture<UpgradeInstanceSpecResponse>
     */
    public CompletableFuture<UpgradeInstanceSpecResponse> upgradeInstanceSpecAsync(UpgradeInstanceSpecRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.upgradeInstanceSpec);
    }

    /**
     * 修改实例规格
     *
     * 修改实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceSpecRequest 请求对象
     * @return AsyncInvoker<UpgradeInstanceSpecRequest, UpgradeInstanceSpecResponse>
     */
    public AsyncInvoker<UpgradeInstanceSpecRequest, UpgradeInstanceSpecResponse> upgradeInstanceSpecAsyncInvoker(
        UpgradeInstanceSpecRequest request) {
        return new AsyncInvoker<>(request, AadMeta.upgradeInstanceSpec, hcClient);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return CompletableFuture<DeleteDomainResponse>
     */
    public CompletableFuture<DeleteDomainResponse> deleteDomainAsync(DeleteDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.deleteDomain);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainAsyncInvoker(
        DeleteDomainRequest request) {
        return new AsyncInvoker<>(request, AadMeta.deleteDomain, hcClient);
    }

}

package com.huaweicloud.sdk.aad.v2;

import com.huaweicloud.sdk.aad.v2.model.AddWafWhiteIpRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.AddWafWhiteIpRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.CreateDomainRequest;
import com.huaweicloud.sdk.aad.v2.model.CreateDomainResponse;
import com.huaweicloud.sdk.aad.v2.model.DeleteDomainRequest;
import com.huaweicloud.sdk.aad.v2.model.DeleteDomainResponse;
import com.huaweicloud.sdk.aad.v2.model.DeleteWafWhiteIpRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.DeleteWafWhiteIpRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSAttackEventRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSAttackEventResponse;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSBlackHoleEventRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSBlackHoleEventResponse;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSConnectionNumberRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSConnectionNumberResponse;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSFlowRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSFlowResponse;
import com.huaweicloud.sdk.aad.v2.model.ListFrequencyControlRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListFrequencyControlRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListGlobalConfigRequest;
import com.huaweicloud.sdk.aad.v2.model.ListGlobalConfigResponse;
import com.huaweicloud.sdk.aad.v2.model.ListInstanceDomainsRequest;
import com.huaweicloud.sdk.aad.v2.model.ListInstanceDomainsResponse;
import com.huaweicloud.sdk.aad.v2.model.ListSourceIpRequest;
import com.huaweicloud.sdk.aad.v2.model.ListSourceIpResponse;
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
import com.huaweicloud.sdk.aad.v2.model.ShowAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowDDoSPeakRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowDDoSPeakResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainCertificateRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainCertificateResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainDetailRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainDetailResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainNameConfigRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainNameConfigResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowFlowBlockRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowFlowBlockResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowInstanceByInstanceIdRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowInstanceByInstanceIdResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowWafPolicyRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowWafPolicyResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowWafQpsRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowWafQpsResponse;
import com.huaweicloud.sdk.aad.v2.model.UpdateDomainConfigRequest;
import com.huaweicloud.sdk.aad.v2.model.UpdateDomainConfigResponse;
import com.huaweicloud.sdk.aad.v2.model.UpdateForwardRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.UpdateForwardRuleResponse;
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
     * 防护策略web-cc黑白名单-创建黑白名单规则
     *
     * 防护策略web-cc黑白名单-创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWafWhiteIpRuleRequest 请求对象
     * @return CompletableFuture<AddWafWhiteIpRuleResponse>
     */
    public CompletableFuture<AddWafWhiteIpRuleResponse> addWafWhiteIpRuleAsync(AddWafWhiteIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.addWafWhiteIpRule);
    }

    /**
     * 防护策略web-cc黑白名单-创建黑白名单规则
     *
     * 防护策略web-cc黑白名单-创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWafWhiteIpRuleRequest 请求对象
     * @return AsyncInvoker<AddWafWhiteIpRuleRequest, AddWafWhiteIpRuleResponse>
     */
    public AsyncInvoker<AddWafWhiteIpRuleRequest, AddWafWhiteIpRuleResponse> addWafWhiteIpRuleAsyncInvoker(
        AddWafWhiteIpRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.addWafWhiteIpRule, hcClient);
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

    /**
     * 防护策略web-cc黑白名单-删除黑白名单规则
     *
     * 防护策略web-cc黑白名单-删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWafWhiteIpRuleRequest 请求对象
     * @return CompletableFuture<DeleteWafWhiteIpRuleResponse>
     */
    public CompletableFuture<DeleteWafWhiteIpRuleResponse> deleteWafWhiteIpRuleAsync(
        DeleteWafWhiteIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.deleteWafWhiteIpRule);
    }

    /**
     * 防护策略web-cc黑白名单-删除黑白名单规则
     *
     * 防护策略web-cc黑白名单-删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWafWhiteIpRuleRequest 请求对象
     * @return AsyncInvoker<DeleteWafWhiteIpRuleRequest, DeleteWafWhiteIpRuleResponse>
     */
    public AsyncInvoker<DeleteWafWhiteIpRuleRequest, DeleteWafWhiteIpRuleResponse> deleteWafWhiteIpRuleAsyncInvoker(
        DeleteWafWhiteIpRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.deleteWafWhiteIpRule, hcClient);
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
     * 黑洞事件列表
     *
     * 黑洞事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSBlackHoleEventRequest 请求对象
     * @return CompletableFuture<ListDDoSBlackHoleEventResponse>
     */
    public CompletableFuture<ListDDoSBlackHoleEventResponse> listDDoSBlackHoleEventAsync(
        ListDDoSBlackHoleEventRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listDDoSBlackHoleEvent);
    }

    /**
     * 黑洞事件列表
     *
     * 黑洞事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDoSBlackHoleEventRequest 请求对象
     * @return AsyncInvoker<ListDDoSBlackHoleEventRequest, ListDDoSBlackHoleEventResponse>
     */
    public AsyncInvoker<ListDDoSBlackHoleEventRequest, ListDDoSBlackHoleEventResponse> listDDoSBlackHoleEventAsyncInvoker(
        ListDDoSBlackHoleEventRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listDDoSBlackHoleEvent, hcClient);
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
     * 查询控制台WAF全局配置
     *
     * 查询控制台WAF全局配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConfigRequest 请求对象
     * @return CompletableFuture<ListGlobalConfigResponse>
     */
    public CompletableFuture<ListGlobalConfigResponse> listGlobalConfigAsync(ListGlobalConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listGlobalConfig);
    }

    /**
     * 查询控制台WAF全局配置
     *
     * 查询控制台WAF全局配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConfigRequest 请求对象
     * @return AsyncInvoker<ListGlobalConfigRequest, ListGlobalConfigResponse>
     */
    public AsyncInvoker<ListGlobalConfigRequest, ListGlobalConfigResponse> listGlobalConfigAsyncInvoker(
        ListGlobalConfigRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listGlobalConfig, hcClient);
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
     * 查询回源ip列表
     *
     * 查询回源ip列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSourceIpRequest 请求对象
     * @return CompletableFuture<ListSourceIpResponse>
     */
    public CompletableFuture<ListSourceIpResponse> listSourceIpAsync(ListSourceIpRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listSourceIp);
    }

    /**
     * 查询回源ip列表
     *
     * 查询回源ip列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSourceIpRequest 请求对象
     * @return AsyncInvoker<ListSourceIpRequest, ListSourceIpResponse>
     */
    public AsyncInvoker<ListSourceIpRequest, ListSourceIpResponse> listSourceIpAsyncInvoker(
        ListSourceIpRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listSourceIp, hcClient);
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
     * 查询告警设置
     *
     * 查询告警设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return CompletableFuture<ShowAlarmConfigResponse>
     */
    public CompletableFuture<ShowAlarmConfigResponse> showAlarmConfigAsync(ShowAlarmConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showAlarmConfig);
    }

    /**
     * 查询告警设置
     *
     * 查询告警设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return AsyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse>
     */
    public AsyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfigAsyncInvoker(
        ShowAlarmConfigRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showAlarmConfig, hcClient);
    }

    /**
     * 查询高防入流量峰值、攻击流量峰值、DDoS攻击次数
     *
     * 查询高防入流量峰值、攻击流量峰值、DDoS攻击次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDoSPeakRequest 请求对象
     * @return CompletableFuture<ShowDDoSPeakResponse>
     */
    public CompletableFuture<ShowDDoSPeakResponse> showDDoSPeakAsync(ShowDDoSPeakRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showDDoSPeak);
    }

    /**
     * 查询高防入流量峰值、攻击流量峰值、DDoS攻击次数
     *
     * 查询高防入流量峰值、攻击流量峰值、DDoS攻击次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDoSPeakRequest 请求对象
     * @return AsyncInvoker<ShowDDoSPeakRequest, ShowDDoSPeakResponse>
     */
    public AsyncInvoker<ShowDDoSPeakRequest, ShowDDoSPeakResponse> showDDoSPeakAsyncInvoker(
        ShowDDoSPeakRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showDDoSPeak, hcClient);
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
     * 查询域名详情
     *
     * 查询域名详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return CompletableFuture<ShowDomainDetailResponse>
     */
    public CompletableFuture<ShowDomainDetailResponse> showDomainDetailAsync(ShowDomainDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showDomainDetail);
    }

    /**
     * 查询域名详情
     *
     * 查询域名详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>
     */
    public AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailAsyncInvoker(
        ShowDomainDetailRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showDomainDetail, hcClient);
    }

    /**
     * 查看域名配置
     *
     * 查看域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainNameConfigRequest 请求对象
     * @return CompletableFuture<ShowDomainNameConfigResponse>
     */
    public CompletableFuture<ShowDomainNameConfigResponse> showDomainNameConfigAsync(
        ShowDomainNameConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showDomainNameConfig);
    }

    /**
     * 查看域名配置
     *
     * 查看域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainNameConfigRequest 请求对象
     * @return AsyncInvoker<ShowDomainNameConfigRequest, ShowDomainNameConfigResponse>
     */
    public AsyncInvoker<ShowDomainNameConfigRequest, ShowDomainNameConfigResponse> showDomainNameConfigAsyncInvoker(
        ShowDomainNameConfigRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showDomainNameConfig, hcClient);
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
     * 查询实例详情
     *
     * 查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceByInstanceIdRequest 请求对象
     * @return CompletableFuture<ShowInstanceByInstanceIdResponse>
     */
    public CompletableFuture<ShowInstanceByInstanceIdResponse> showInstanceByInstanceIdAsync(
        ShowInstanceByInstanceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showInstanceByInstanceId);
    }

    /**
     * 查询实例详情
     *
     * 查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceByInstanceIdRequest 请求对象
     * @return AsyncInvoker<ShowInstanceByInstanceIdRequest, ShowInstanceByInstanceIdResponse>
     */
    public AsyncInvoker<ShowInstanceByInstanceIdRequest, ShowInstanceByInstanceIdResponse> showInstanceByInstanceIdAsyncInvoker(
        ShowInstanceByInstanceIdRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showInstanceByInstanceId, hcClient);
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
     * 修改域名配置
     *
     * 修改域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainConfigRequest 请求对象
     * @return CompletableFuture<UpdateDomainConfigResponse>
     */
    public CompletableFuture<UpdateDomainConfigResponse> updateDomainConfigAsync(UpdateDomainConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.updateDomainConfig);
    }

    /**
     * 修改域名配置
     *
     * 修改域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainConfigRequest 请求对象
     * @return AsyncInvoker<UpdateDomainConfigRequest, UpdateDomainConfigResponse>
     */
    public AsyncInvoker<UpdateDomainConfigRequest, UpdateDomainConfigResponse> updateDomainConfigAsyncInvoker(
        UpdateDomainConfigRequest request) {
        return new AsyncInvoker<>(request, AadMeta.updateDomainConfig, hcClient);
    }

    /**
     * 修改转发规则中的源站IP
     *
     * 修改转发规则中的源站IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateForwardRuleRequest 请求对象
     * @return CompletableFuture<UpdateForwardRuleResponse>
     */
    public CompletableFuture<UpdateForwardRuleResponse> updateForwardRuleAsync(UpdateForwardRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.updateForwardRule);
    }

    /**
     * 修改转发规则中的源站IP
     *
     * 修改转发规则中的源站IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateForwardRuleRequest 请求对象
     * @return AsyncInvoker<UpdateForwardRuleRequest, UpdateForwardRuleResponse>
     */
    public AsyncInvoker<UpdateForwardRuleRequest, UpdateForwardRuleResponse> updateForwardRuleAsyncInvoker(
        UpdateForwardRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.updateForwardRule, hcClient);
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

}

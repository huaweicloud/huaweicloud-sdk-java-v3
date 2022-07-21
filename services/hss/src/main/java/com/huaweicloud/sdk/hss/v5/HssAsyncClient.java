package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.hss.v5.model.*;

import java.util.concurrent.CompletableFuture;

public class HssAsyncClient {

    protected HcClient hcClient;

    public HssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HssAsyncClient> newBuilder() {
        return new ClientBuilder<>(HssAsyncClient::new);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostStatusRequest 请求对象
     * @return CompletableFuture<ListHostStatusResponse>
     */
    public CompletableFuture<ListHostStatusResponse> listHostStatusAsync(ListHostStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostStatus);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostStatusRequest 请求对象
     * @return AsyncInvoker<ListHostStatusRequest, ListHostStatusResponse>
     */
    public AsyncInvoker<ListHostStatusRequest, ListHostStatusResponse> listHostStatusAsyncInvoker(
        ListHostStatusRequest request) {
        return new AsyncInvoker<ListHostStatusRequest, ListHostStatusResponse>(request, HssMeta.listHostStatus,
            hcClient);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPasswordComplexityRequest 请求对象
     * @return CompletableFuture<ListPasswordComplexityResponse>
     */
    public CompletableFuture<ListPasswordComplexityResponse> listPasswordComplexityAsync(
        ListPasswordComplexityRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPasswordComplexity);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPasswordComplexityRequest 请求对象
     * @return AsyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>
     */
    public AsyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse> listPasswordComplexityAsyncInvoker(
        ListPasswordComplexityRequest request) {
        return new AsyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>(request,
            HssMeta.listPasswordComplexity, hcClient);
    }

    /**
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRiskConfigCheckRulesRequest 请求对象
     * @return CompletableFuture<ListRiskConfigCheckRulesResponse>
     */
    public CompletableFuture<ListRiskConfigCheckRulesResponse> listRiskConfigCheckRulesAsync(
        ListRiskConfigCheckRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRiskConfigCheckRules);
    }

    /**
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRiskConfigCheckRulesRequest 请求对象
     * @return AsyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>
     */
    public AsyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> listRiskConfigCheckRulesAsyncInvoker(
        ListRiskConfigCheckRulesRequest request) {
        return new AsyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>(request,
            HssMeta.listRiskConfigCheckRules, hcClient);
    }

    /**
     * 查询指定安全配置项的受影响服务器列表
     *
     * 查询指定安全配置项的受影响服务器列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRiskConfigHostsRequest 请求对象
     * @return CompletableFuture<ListRiskConfigHostsResponse>
     */
    public CompletableFuture<ListRiskConfigHostsResponse> listRiskConfigHostsAsync(ListRiskConfigHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRiskConfigHosts);
    }

    /**
     * 查询指定安全配置项的受影响服务器列表
     *
     * 查询指定安全配置项的受影响服务器列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRiskConfigHostsRequest 请求对象
     * @return AsyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>
     */
    public AsyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> listRiskConfigHostsAsyncInvoker(
        ListRiskConfigHostsRequest request) {
        return new AsyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>(request,
            HssMeta.listRiskConfigHosts, hcClient);
    }

    /**
     * 查询租户的服务器安全配置检测结果列表
     *
     * 查询租户的服务器安全配置检测结果列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRiskConfigsRequest 请求对象
     * @return CompletableFuture<ListRiskConfigsResponse>
     */
    public CompletableFuture<ListRiskConfigsResponse> listRiskConfigsAsync(ListRiskConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRiskConfigs);
    }

    /**
     * 查询租户的服务器安全配置检测结果列表
     *
     * 查询租户的服务器安全配置检测结果列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRiskConfigsRequest 请求对象
     * @return AsyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>
     */
    public AsyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse> listRiskConfigsAsyncInvoker(
        ListRiskConfigsRequest request) {
        return new AsyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>(request, HssMeta.listRiskConfigs,
            hcClient);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSecurityEventsRequest 请求对象
     * @return CompletableFuture<ListSecurityEventsResponse>
     */
    public CompletableFuture<ListSecurityEventsResponse> listSecurityEventsAsync(ListSecurityEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSecurityEvents);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSecurityEventsRequest 请求对象
     * @return AsyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>
     */
    public AsyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse> listSecurityEventsAsyncInvoker(
        ListSecurityEventsRequest request) {
        return new AsyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>(request,
            HssMeta.listSecurityEvents, hcClient);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ListVulnerabilitiesResponse>
     */
    public CompletableFuture<ListVulnerabilitiesResponse> listVulnerabilitiesAsync(ListVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulnerabilities);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>
     */
    public AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilitiesAsyncInvoker(
        ListVulnerabilitiesRequest request) {
        return new AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>(request,
            HssMeta.listVulnerabilities, hcClient);
    }

    /**
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWeakPasswordUsersRequest 请求对象
     * @return CompletableFuture<ListWeakPasswordUsersResponse>
     */
    public CompletableFuture<ListWeakPasswordUsersResponse> listWeakPasswordUsersAsync(
        ListWeakPasswordUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWeakPasswordUsers);
    }

    /**
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWeakPasswordUsersRequest 请求对象
     * @return AsyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>
     */
    public AsyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> listWeakPasswordUsersAsyncInvoker(
        ListWeakPasswordUsersRequest request) {
        return new AsyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>(request,
            HssMeta.listWeakPasswordUsers, hcClient);
    }

    /**
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCheckRuleDetailRequest 请求对象
     * @return CompletableFuture<ShowCheckRuleDetailResponse>
     */
    public CompletableFuture<ShowCheckRuleDetailResponse> showCheckRuleDetailAsync(ShowCheckRuleDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showCheckRuleDetail);
    }

    /**
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCheckRuleDetailRequest 请求对象
     * @return AsyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>
     */
    public AsyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> showCheckRuleDetailAsyncInvoker(
        ShowCheckRuleDetailRequest request) {
        return new AsyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>(request,
            HssMeta.showCheckRuleDetail, hcClient);
    }

    /**
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRiskConfigDetailRequest 请求对象
     * @return CompletableFuture<ShowRiskConfigDetailResponse>
     */
    public CompletableFuture<ShowRiskConfigDetailResponse> showRiskConfigDetailAsync(
        ShowRiskConfigDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showRiskConfigDetail);
    }

    /**
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRiskConfigDetailRequest 请求对象
     * @return AsyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>
     */
    public AsyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> showRiskConfigDetailAsyncInvoker(
        ShowRiskConfigDetailRequest request) {
        return new AsyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>(request,
            HssMeta.showRiskConfigDetail, hcClient);
    }

}

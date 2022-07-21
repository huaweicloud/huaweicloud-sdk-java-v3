package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.hss.v5.model.*;

public class HssClient {

    protected HcClient hcClient;

    public HssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HssClient> newBuilder() {
        return new ClientBuilder<>(HssClient::new);
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
     * @return ListHostStatusResponse
     */
    public ListHostStatusResponse listHostStatus(ListHostStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostStatus);
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
     * @return SyncInvoker<ListHostStatusRequest, ListHostStatusResponse>
     */
    public SyncInvoker<ListHostStatusRequest, ListHostStatusResponse> listHostStatusInvoker(
        ListHostStatusRequest request) {
        return new SyncInvoker<ListHostStatusRequest, ListHostStatusResponse>(request, HssMeta.listHostStatus,
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
     * @return ListPasswordComplexityResponse
     */
    public ListPasswordComplexityResponse listPasswordComplexity(ListPasswordComplexityRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPasswordComplexity);
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
     * @return SyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>
     */
    public SyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse> listPasswordComplexityInvoker(
        ListPasswordComplexityRequest request) {
        return new SyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>(request,
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
     * @return ListRiskConfigCheckRulesResponse
     */
    public ListRiskConfigCheckRulesResponse listRiskConfigCheckRules(ListRiskConfigCheckRulesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRiskConfigCheckRules);
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
     * @return SyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>
     */
    public SyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> listRiskConfigCheckRulesInvoker(
        ListRiskConfigCheckRulesRequest request) {
        return new SyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>(request,
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
     * @return ListRiskConfigHostsResponse
     */
    public ListRiskConfigHostsResponse listRiskConfigHosts(ListRiskConfigHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRiskConfigHosts);
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
     * @return SyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>
     */
    public SyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> listRiskConfigHostsInvoker(
        ListRiskConfigHostsRequest request) {
        return new SyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>(request,
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
     * @return ListRiskConfigsResponse
     */
    public ListRiskConfigsResponse listRiskConfigs(ListRiskConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRiskConfigs);
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
     * @return SyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>
     */
    public SyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse> listRiskConfigsInvoker(
        ListRiskConfigsRequest request) {
        return new SyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>(request, HssMeta.listRiskConfigs,
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
     * @return ListSecurityEventsResponse
     */
    public ListSecurityEventsResponse listSecurityEvents(ListSecurityEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSecurityEvents);
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
     * @return SyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>
     */
    public SyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse> listSecurityEventsInvoker(
        ListSecurityEventsRequest request) {
        return new SyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>(request,
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
     * @return ListVulnerabilitiesResponse
     */
    public ListVulnerabilitiesResponse listVulnerabilities(ListVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulnerabilities);
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
     * @return SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>
     */
    public SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilitiesInvoker(
        ListVulnerabilitiesRequest request) {
        return new SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>(request,
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
     * @return ListWeakPasswordUsersResponse
     */
    public ListWeakPasswordUsersResponse listWeakPasswordUsers(ListWeakPasswordUsersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWeakPasswordUsers);
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
     * @return SyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>
     */
    public SyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> listWeakPasswordUsersInvoker(
        ListWeakPasswordUsersRequest request) {
        return new SyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>(request,
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
     * @return ShowCheckRuleDetailResponse
     */
    public ShowCheckRuleDetailResponse showCheckRuleDetail(ShowCheckRuleDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showCheckRuleDetail);
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
     * @return SyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>
     */
    public SyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> showCheckRuleDetailInvoker(
        ShowCheckRuleDetailRequest request) {
        return new SyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>(request,
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
     * @return ShowRiskConfigDetailResponse
     */
    public ShowRiskConfigDetailResponse showRiskConfigDetail(ShowRiskConfigDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showRiskConfigDetail);
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
     * @return SyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>
     */
    public SyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> showRiskConfigDetailInvoker(
        ShowRiskConfigDetailRequest request) {
        return new SyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>(request,
            HssMeta.showRiskConfigDetail, hcClient);
    }

}

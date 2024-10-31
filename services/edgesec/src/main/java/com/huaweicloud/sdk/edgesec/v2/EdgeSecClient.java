package com.huaweicloud.sdk.edgesec.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpAccessControlRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpAccessControlRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpBlockTrustIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpBlockTrustIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpCcRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpCcRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpGeoIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpGeoIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIpGroupRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIpGroupResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPunishmentRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPunishmentRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpReferenceTableRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpReferenceTableResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpAccessControlRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpAccessControlRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpBlockTrustIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpBlockTrustIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpCcRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpCcRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpGeoIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpGeoIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpIpGroupRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpIpGroupResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPunishmentRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPunishmentRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpReferenceTableRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpReferenceTableResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DownloadDdosAttackLogsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DownloadDdosAttackLogsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ResetHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ResetHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDdosAttackLogsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDdosAttackLogsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDdosAttackTimelineStatsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDdosAttackTimelineStatsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAccessControlRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAccessControlRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAccessControlRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAccessControlRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackDistributionStatsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackDistributionStatsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackTimelineStatsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackTimelineStatsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackTopStatsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackTopStatsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpBlockTrustIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpBlockTrustIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpBlockTrustIpRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpBlockTrustIpRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpCcRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpCcRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpCcRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpCcRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpGeoIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpGeoIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpGeoIpRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpGeoIpRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIgnoreRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIgnoreRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIpGroupRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIpGroupResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIpGroupsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIpGroupsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpOverviewsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpOverviewsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPoliciesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPoliciesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPunishmentRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPunishmentRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPunishmentRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPunishmentRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpReferenceTablesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpReferenceTablesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpStatisticsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpStatisticsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpAccessControlRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpAccessControlRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpBlockTrustIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpBlockTrustIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpCcRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpCcRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpGeoIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpGeoIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIpGroupRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIpGroupResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPunishmentRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPunishmentRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpReferenceTableRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpReferenceTableResponse;

public class EdgeSecClient {

    protected HcClient hcClient;

    public EdgeSecClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EdgeSecClient> newBuilder() {
        ClientBuilder<EdgeSecClient> clientBuilder = new ClientBuilder<>(EdgeSecClient::new);
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
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createDomain);
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
        return new SyncInvoker<>(request, EdgeSecMeta.createDomain, hcClient);
    }

    /**
     * 创建引用表
     *
     * 创建引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpReferenceTableRequest 请求对象
     * @return CreateHttpReferenceTableResponse
     */
    public CreateHttpReferenceTableResponse createHttpReferenceTable(CreateHttpReferenceTableRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpReferenceTable);
    }

    /**
     * 创建引用表
     *
     * 创建引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpReferenceTableRequest 请求对象
     * @return SyncInvoker<CreateHttpReferenceTableRequest, CreateHttpReferenceTableResponse>
     */
    public SyncInvoker<CreateHttpReferenceTableRequest, CreateHttpReferenceTableResponse> createHttpReferenceTableInvoker(
        CreateHttpReferenceTableRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpReferenceTable, hcClient);
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
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteDomain);
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
        return new SyncInvoker<>(request, EdgeSecMeta.deleteDomain, hcClient);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpReferenceTableRequest 请求对象
     * @return DeleteHttpReferenceTableResponse
     */
    public DeleteHttpReferenceTableResponse deleteHttpReferenceTable(DeleteHttpReferenceTableRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpReferenceTable);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpReferenceTableRequest 请求对象
     * @return SyncInvoker<DeleteHttpReferenceTableRequest, DeleteHttpReferenceTableResponse>
     */
    public SyncInvoker<DeleteHttpReferenceTableRequest, DeleteHttpReferenceTableResponse> deleteHttpReferenceTableInvoker(
        DeleteHttpReferenceTableRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpReferenceTable, hcClient);
    }

    /**
     * 查询防护域名详情
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return ShowDomainDetailResponse
     */
    public ShowDomainDetailResponse showDomainDetail(ShowDomainDetailRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showDomainDetail);
    }

    /**
     * 查询防护域名详情
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return SyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>
     */
    public SyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailInvoker(
        ShowDomainDetailRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showDomainDetail, hcClient);
    }

    /**
     * 查询防护域名列表
     *
     * 查询防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsRequest 请求对象
     * @return ShowDomainsResponse
     */
    public ShowDomainsResponse showDomains(ShowDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showDomains);
    }

    /**
     * 查询防护域名列表
     *
     * 查询防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsRequest 请求对象
     * @return SyncInvoker<ShowDomainsRequest, ShowDomainsResponse>
     */
    public SyncInvoker<ShowDomainsRequest, ShowDomainsResponse> showDomainsInvoker(ShowDomainsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showDomains, hcClient);
    }

    /**
     * 查询攻击域名
     *
     * 查询安全总览top信息，包含攻击域名、攻击源ip、攻击url、攻击来源区域、防护类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpOverviewsRequest 请求对象
     * @return ShowHttpOverviewsResponse
     */
    public ShowHttpOverviewsResponse showHttpOverviews(ShowHttpOverviewsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpOverviews);
    }

    /**
     * 查询攻击域名
     *
     * 查询安全总览top信息，包含攻击域名、攻击源ip、攻击url、攻击来源区域、防护类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpOverviewsRequest 请求对象
     * @return SyncInvoker<ShowHttpOverviewsRequest, ShowHttpOverviewsResponse>
     */
    public SyncInvoker<ShowHttpOverviewsRequest, ShowHttpOverviewsResponse> showHttpOverviewsInvoker(
        ShowHttpOverviewsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpOverviews, hcClient);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpReferenceTablesRequest 请求对象
     * @return ShowHttpReferenceTablesResponse
     */
    public ShowHttpReferenceTablesResponse showHttpReferenceTables(ShowHttpReferenceTablesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpReferenceTables);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpReferenceTablesRequest 请求对象
     * @return SyncInvoker<ShowHttpReferenceTablesRequest, ShowHttpReferenceTablesResponse>
     */
    public SyncInvoker<ShowHttpReferenceTablesRequest, ShowHttpReferenceTablesResponse> showHttpReferenceTablesInvoker(
        ShowHttpReferenceTablesRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpReferenceTables, hcClient);
    }

    /**
     * 查询安全总览请求数据
     *
     * 查询安全总览请求数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpStatisticsRequest 请求对象
     * @return ShowHttpStatisticsResponse
     */
    public ShowHttpStatisticsResponse showHttpStatistics(ShowHttpStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpStatistics);
    }

    /**
     * 查询安全总览请求数据
     *
     * 查询安全总览请求数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpStatisticsRequest 请求对象
     * @return SyncInvoker<ShowHttpStatisticsRequest, ShowHttpStatisticsResponse>
     */
    public SyncInvoker<ShowHttpStatisticsRequest, ShowHttpStatisticsResponse> showHttpStatisticsInvoker(
        ShowHttpStatisticsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpStatistics, hcClient);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomain(UpdateDomainRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateDomain);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return SyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public SyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainInvoker(UpdateDomainRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateDomain, hcClient);
    }

    /**
     * 更新引用表
     *
     * 更新引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpReferenceTableRequest 请求对象
     * @return UpdateHttpReferenceTableResponse
     */
    public UpdateHttpReferenceTableResponse updateHttpReferenceTable(UpdateHttpReferenceTableRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpReferenceTable);
    }

    /**
     * 更新引用表
     *
     * 更新引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpReferenceTableRequest 请求对象
     * @return SyncInvoker<UpdateHttpReferenceTableRequest, UpdateHttpReferenceTableResponse>
     */
    public SyncInvoker<UpdateHttpReferenceTableRequest, UpdateHttpReferenceTableResponse> updateHttpReferenceTableInvoker(
        UpdateHttpReferenceTableRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpReferenceTable, hcClient);
    }

    /**
     * Ddos攻击日志下载
     *
     * Ddos攻击日志下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDdosAttackLogsRequest 请求对象
     * @return DownloadDdosAttackLogsResponse
     */
    public DownloadDdosAttackLogsResponse downloadDdosAttackLogs(DownloadDdosAttackLogsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.downloadDdosAttackLogs);
    }

    /**
     * Ddos攻击日志下载
     *
     * Ddos攻击日志下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDdosAttackLogsRequest 请求对象
     * @return SyncInvoker<DownloadDdosAttackLogsRequest, DownloadDdosAttackLogsResponse>
     */
    public SyncInvoker<DownloadDdosAttackLogsRequest, DownloadDdosAttackLogsResponse> downloadDdosAttackLogsInvoker(
        DownloadDdosAttackLogsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.downloadDdosAttackLogs, hcClient);
    }

    /**
     * 查询ddos攻击日志列表
     *
     * 查询ddos攻击日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdosAttackLogsRequest 请求对象
     * @return ShowDdosAttackLogsResponse
     */
    public ShowDdosAttackLogsResponse showDdosAttackLogs(ShowDdosAttackLogsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showDdosAttackLogs);
    }

    /**
     * 查询ddos攻击日志列表
     *
     * 查询ddos攻击日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdosAttackLogsRequest 请求对象
     * @return SyncInvoker<ShowDdosAttackLogsRequest, ShowDdosAttackLogsResponse>
     */
    public SyncInvoker<ShowDdosAttackLogsRequest, ShowDdosAttackLogsResponse> showDdosAttackLogsInvoker(
        ShowDdosAttackLogsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showDdosAttackLogs, hcClient);
    }

    /**
     * 查询DDoS攻击统计时间线数据
     *
     * 查询DDoS攻击统计时间线数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdosAttackTimelineStatsRequest 请求对象
     * @return ShowDdosAttackTimelineStatsResponse
     */
    public ShowDdosAttackTimelineStatsResponse showDdosAttackTimelineStats(ShowDdosAttackTimelineStatsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showDdosAttackTimelineStats);
    }

    /**
     * 查询DDoS攻击统计时间线数据
     *
     * 查询DDoS攻击统计时间线数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdosAttackTimelineStatsRequest 请求对象
     * @return SyncInvoker<ShowDdosAttackTimelineStatsRequest, ShowDdosAttackTimelineStatsResponse>
     */
    public SyncInvoker<ShowDdosAttackTimelineStatsRequest, ShowDdosAttackTimelineStatsResponse> showDdosAttackTimelineStatsInvoker(
        ShowDdosAttackTimelineStatsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showDdosAttackTimelineStats, hcClient);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyHttpPolicyRequest 请求对象
     * @return ApplyHttpPolicyResponse
     */
    public ApplyHttpPolicyResponse applyHttpPolicy(ApplyHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.applyHttpPolicy);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyHttpPolicyRequest 请求对象
     * @return SyncInvoker<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse>
     */
    public SyncInvoker<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> applyHttpPolicyInvoker(
        ApplyHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.applyHttpPolicy, hcClient);
    }

    /**
     * 创建精准防护规则
     *
     * 创建精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpAccessControlRuleRequest 请求对象
     * @return CreateHttpAccessControlRuleResponse
     */
    public CreateHttpAccessControlRuleResponse createHttpAccessControlRule(CreateHttpAccessControlRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpAccessControlRule);
    }

    /**
     * 创建精准防护规则
     *
     * 创建精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpAccessControlRuleRequest 请求对象
     * @return SyncInvoker<CreateHttpAccessControlRuleRequest, CreateHttpAccessControlRuleResponse>
     */
    public SyncInvoker<CreateHttpAccessControlRuleRequest, CreateHttpAccessControlRuleResponse> createHttpAccessControlRuleInvoker(
        CreateHttpAccessControlRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpAccessControlRule, hcClient);
    }

    /**
     * 创建地理位置规则
     *
     * 创建地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpGeoIpRuleRequest 请求对象
     * @return CreateHttpGeoIpRuleResponse
     */
    public CreateHttpGeoIpRuleResponse createHttpGeoIpRule(CreateHttpGeoIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpGeoIpRule);
    }

    /**
     * 创建地理位置规则
     *
     * 创建地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpGeoIpRuleRequest 请求对象
     * @return SyncInvoker<CreateHttpGeoIpRuleRequest, CreateHttpGeoIpRuleResponse>
     */
    public SyncInvoker<CreateHttpGeoIpRuleRequest, CreateHttpGeoIpRuleResponse> createHttpGeoIpRuleInvoker(
        CreateHttpGeoIpRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpGeoIpRule, hcClient);
    }

    /**
     * 创建误报屏蔽规则
     *
     * 创建误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpIgnoreRuleRequest 请求对象
     * @return CreateHttpIgnoreRuleResponse
     */
    public CreateHttpIgnoreRuleResponse createHttpIgnoreRule(CreateHttpIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpIgnoreRule);
    }

    /**
     * 创建误报屏蔽规则
     *
     * 创建误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpIgnoreRuleRequest 请求对象
     * @return SyncInvoker<CreateHttpIgnoreRuleRequest, CreateHttpIgnoreRuleResponse>
     */
    public SyncInvoker<CreateHttpIgnoreRuleRequest, CreateHttpIgnoreRuleResponse> createHttpIgnoreRuleInvoker(
        CreateHttpIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpIgnoreRule, hcClient);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPolicyRequest 请求对象
     * @return CreateHttpPolicyResponse
     */
    public CreateHttpPolicyResponse createHttpPolicy(CreateHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPolicyRequest 请求对象
     * @return SyncInvoker<CreateHttpPolicyRequest, CreateHttpPolicyResponse>
     */
    public SyncInvoker<CreateHttpPolicyRequest, CreateHttpPolicyResponse> createHttpPolicyInvoker(
        CreateHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpPolicy, hcClient);
    }

    /**
     * 创建攻击惩罚规则
     *
     * 创建攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPunishmentRuleRequest 请求对象
     * @return CreateHttpPunishmentRuleResponse
     */
    public CreateHttpPunishmentRuleResponse createHttpPunishmentRule(CreateHttpPunishmentRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpPunishmentRule);
    }

    /**
     * 创建攻击惩罚规则
     *
     * 创建攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPunishmentRuleRequest 请求对象
     * @return SyncInvoker<CreateHttpPunishmentRuleRequest, CreateHttpPunishmentRuleResponse>
     */
    public SyncInvoker<CreateHttpPunishmentRuleRequest, CreateHttpPunishmentRuleResponse> createHttpPunishmentRuleInvoker(
        CreateHttpPunishmentRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpPunishmentRule, hcClient);
    }

    /**
     * 删除精准防护规则
     *
     * 删除精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpAccessControlRuleRequest 请求对象
     * @return DeleteHttpAccessControlRuleResponse
     */
    public DeleteHttpAccessControlRuleResponse deleteHttpAccessControlRule(DeleteHttpAccessControlRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpAccessControlRule);
    }

    /**
     * 删除精准防护规则
     *
     * 删除精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpAccessControlRuleRequest 请求对象
     * @return SyncInvoker<DeleteHttpAccessControlRuleRequest, DeleteHttpAccessControlRuleResponse>
     */
    public SyncInvoker<DeleteHttpAccessControlRuleRequest, DeleteHttpAccessControlRuleResponse> deleteHttpAccessControlRuleInvoker(
        DeleteHttpAccessControlRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpAccessControlRule, hcClient);
    }

    /**
     * 删除地理位置规则
     *
     * 删除地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpGeoIpRuleRequest 请求对象
     * @return DeleteHttpGeoIpRuleResponse
     */
    public DeleteHttpGeoIpRuleResponse deleteHttpGeoIpRule(DeleteHttpGeoIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpGeoIpRule);
    }

    /**
     * 删除地理位置规则
     *
     * 删除地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpGeoIpRuleRequest 请求对象
     * @return SyncInvoker<DeleteHttpGeoIpRuleRequest, DeleteHttpGeoIpRuleResponse>
     */
    public SyncInvoker<DeleteHttpGeoIpRuleRequest, DeleteHttpGeoIpRuleResponse> deleteHttpGeoIpRuleInvoker(
        DeleteHttpGeoIpRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpGeoIpRule, hcClient);
    }

    /**
     * 删除误报屏蔽规则
     *
     * 删除误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpIgnoreRuleRequest 请求对象
     * @return DeleteHttpIgnoreRuleResponse
     */
    public DeleteHttpIgnoreRuleResponse deleteHttpIgnoreRule(DeleteHttpIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpIgnoreRule);
    }

    /**
     * 删除误报屏蔽规则
     *
     * 删除误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpIgnoreRuleRequest 请求对象
     * @return SyncInvoker<DeleteHttpIgnoreRuleRequest, DeleteHttpIgnoreRuleResponse>
     */
    public SyncInvoker<DeleteHttpIgnoreRuleRequest, DeleteHttpIgnoreRuleResponse> deleteHttpIgnoreRuleInvoker(
        DeleteHttpIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpIgnoreRule, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPolicyRequest 请求对象
     * @return DeleteHttpPolicyResponse
     */
    public DeleteHttpPolicyResponse deleteHttpPolicy(DeleteHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpPolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPolicyRequest 请求对象
     * @return SyncInvoker<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse>
     */
    public SyncInvoker<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> deleteHttpPolicyInvoker(
        DeleteHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpPolicy, hcClient);
    }

    /**
     * 删除攻击惩罚规则
     *
     * 删除攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPunishmentRuleRequest 请求对象
     * @return DeleteHttpPunishmentRuleResponse
     */
    public DeleteHttpPunishmentRuleResponse deleteHttpPunishmentRule(DeleteHttpPunishmentRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpPunishmentRule);
    }

    /**
     * 删除攻击惩罚规则
     *
     * 删除攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPunishmentRuleRequest 请求对象
     * @return SyncInvoker<DeleteHttpPunishmentRuleRequest, DeleteHttpPunishmentRuleResponse>
     */
    public SyncInvoker<DeleteHttpPunishmentRuleRequest, DeleteHttpPunishmentRuleResponse> deleteHttpPunishmentRuleInvoker(
        DeleteHttpPunishmentRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpPunishmentRule, hcClient);
    }

    /**
     * 重置误报屏蔽规则
     *
     * 重置误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetHttpIgnoreRuleRequest 请求对象
     * @return ResetHttpIgnoreRuleResponse
     */
    public ResetHttpIgnoreRuleResponse resetHttpIgnoreRule(ResetHttpIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.resetHttpIgnoreRule);
    }

    /**
     * 重置误报屏蔽规则
     *
     * 重置误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetHttpIgnoreRuleRequest 请求对象
     * @return SyncInvoker<ResetHttpIgnoreRuleRequest, ResetHttpIgnoreRuleResponse>
     */
    public SyncInvoker<ResetHttpIgnoreRuleRequest, ResetHttpIgnoreRuleResponse> resetHttpIgnoreRuleInvoker(
        ResetHttpIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.resetHttpIgnoreRule, hcClient);
    }

    /**
     * 查询精准防护规则
     *
     * 查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAccessControlRuleRequest 请求对象
     * @return ShowHttpAccessControlRuleResponse
     */
    public ShowHttpAccessControlRuleResponse showHttpAccessControlRule(ShowHttpAccessControlRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpAccessControlRule);
    }

    /**
     * 查询精准防护规则
     *
     * 查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAccessControlRuleRequest 请求对象
     * @return SyncInvoker<ShowHttpAccessControlRuleRequest, ShowHttpAccessControlRuleResponse>
     */
    public SyncInvoker<ShowHttpAccessControlRuleRequest, ShowHttpAccessControlRuleResponse> showHttpAccessControlRuleInvoker(
        ShowHttpAccessControlRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpAccessControlRule, hcClient);
    }

    /**
     * 查询精准防护规则列表
     *
     * 查询精准防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAccessControlRulesRequest 请求对象
     * @return ShowHttpAccessControlRulesResponse
     */
    public ShowHttpAccessControlRulesResponse showHttpAccessControlRules(ShowHttpAccessControlRulesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpAccessControlRules);
    }

    /**
     * 查询精准防护规则列表
     *
     * 查询精准防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAccessControlRulesRequest 请求对象
     * @return SyncInvoker<ShowHttpAccessControlRulesRequest, ShowHttpAccessControlRulesResponse>
     */
    public SyncInvoker<ShowHttpAccessControlRulesRequest, ShowHttpAccessControlRulesResponse> showHttpAccessControlRulesInvoker(
        ShowHttpAccessControlRulesRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpAccessControlRules, hcClient);
    }

    /**
     * 查询HTTP攻击分布数据
     *
     * 查询HTTP攻击分布数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackDistributionStatsRequest 请求对象
     * @return ShowHttpAttackDistributionStatsResponse
     */
    public ShowHttpAttackDistributionStatsResponse showHttpAttackDistributionStats(
        ShowHttpAttackDistributionStatsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpAttackDistributionStats);
    }

    /**
     * 查询HTTP攻击分布数据
     *
     * 查询HTTP攻击分布数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackDistributionStatsRequest 请求对象
     * @return SyncInvoker<ShowHttpAttackDistributionStatsRequest, ShowHttpAttackDistributionStatsResponse>
     */
    public SyncInvoker<ShowHttpAttackDistributionStatsRequest, ShowHttpAttackDistributionStatsResponse> showHttpAttackDistributionStatsInvoker(
        ShowHttpAttackDistributionStatsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpAttackDistributionStats, hcClient);
    }

    /**
     * 查询HTTP攻击统计时间线数据
     *
     * 查询HTTP攻击统计时间线数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackTimelineStatsRequest 请求对象
     * @return ShowHttpAttackTimelineStatsResponse
     */
    public ShowHttpAttackTimelineStatsResponse showHttpAttackTimelineStats(ShowHttpAttackTimelineStatsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpAttackTimelineStats);
    }

    /**
     * 查询HTTP攻击统计时间线数据
     *
     * 查询HTTP攻击统计时间线数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackTimelineStatsRequest 请求对象
     * @return SyncInvoker<ShowHttpAttackTimelineStatsRequest, ShowHttpAttackTimelineStatsResponse>
     */
    public SyncInvoker<ShowHttpAttackTimelineStatsRequest, ShowHttpAttackTimelineStatsResponse> showHttpAttackTimelineStatsInvoker(
        ShowHttpAttackTimelineStatsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpAttackTimelineStats, hcClient);
    }

    /**
     * 查询HTTP攻击TOP数据
     *
     * 查询HTTP攻击TOP数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackTopStatsRequest 请求对象
     * @return ShowHttpAttackTopStatsResponse
     */
    public ShowHttpAttackTopStatsResponse showHttpAttackTopStats(ShowHttpAttackTopStatsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpAttackTopStats);
    }

    /**
     * 查询HTTP攻击TOP数据
     *
     * 查询HTTP攻击TOP数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackTopStatsRequest 请求对象
     * @return SyncInvoker<ShowHttpAttackTopStatsRequest, ShowHttpAttackTopStatsResponse>
     */
    public SyncInvoker<ShowHttpAttackTopStatsRequest, ShowHttpAttackTopStatsResponse> showHttpAttackTopStatsInvoker(
        ShowHttpAttackTopStatsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpAttackTopStats, hcClient);
    }

    /**
     * 查询地理位置规则
     *
     * 查询地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpGeoIpRuleRequest 请求对象
     * @return ShowHttpGeoIpRuleResponse
     */
    public ShowHttpGeoIpRuleResponse showHttpGeoIpRule(ShowHttpGeoIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpGeoIpRule);
    }

    /**
     * 查询地理位置规则
     *
     * 查询地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpGeoIpRuleRequest 请求对象
     * @return SyncInvoker<ShowHttpGeoIpRuleRequest, ShowHttpGeoIpRuleResponse>
     */
    public SyncInvoker<ShowHttpGeoIpRuleRequest, ShowHttpGeoIpRuleResponse> showHttpGeoIpRuleInvoker(
        ShowHttpGeoIpRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpGeoIpRule, hcClient);
    }

    /**
     * 查询地理位置规则列表
     *
     * 查询地理位置规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpGeoIpRulesRequest 请求对象
     * @return ShowHttpGeoIpRulesResponse
     */
    public ShowHttpGeoIpRulesResponse showHttpGeoIpRules(ShowHttpGeoIpRulesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpGeoIpRules);
    }

    /**
     * 查询地理位置规则列表
     *
     * 查询地理位置规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpGeoIpRulesRequest 请求对象
     * @return SyncInvoker<ShowHttpGeoIpRulesRequest, ShowHttpGeoIpRulesResponse>
     */
    public SyncInvoker<ShowHttpGeoIpRulesRequest, ShowHttpGeoIpRulesResponse> showHttpGeoIpRulesInvoker(
        ShowHttpGeoIpRulesRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpGeoIpRules, hcClient);
    }

    /**
     * 查询误报屏蔽规则
     *
     * 查询误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIgnoreRuleRequest 请求对象
     * @return ShowHttpIgnoreRuleResponse
     */
    public ShowHttpIgnoreRuleResponse showHttpIgnoreRule(ShowHttpIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpIgnoreRule);
    }

    /**
     * 查询误报屏蔽规则
     *
     * 查询误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIgnoreRuleRequest 请求对象
     * @return SyncInvoker<ShowHttpIgnoreRuleRequest, ShowHttpIgnoreRuleResponse>
     */
    public SyncInvoker<ShowHttpIgnoreRuleRequest, ShowHttpIgnoreRuleResponse> showHttpIgnoreRuleInvoker(
        ShowHttpIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpIgnoreRule, hcClient);
    }

    /**
     * 查询误报屏蔽规则列表
     *
     * 查询误报屏蔽规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIgnoreRulesRequest 请求对象
     * @return ShowHttpIgnoreRulesResponse
     */
    public ShowHttpIgnoreRulesResponse showHttpIgnoreRules(ShowHttpIgnoreRulesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpIgnoreRules);
    }

    /**
     * 查询误报屏蔽规则列表
     *
     * 查询误报屏蔽规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIgnoreRulesRequest 请求对象
     * @return SyncInvoker<ShowHttpIgnoreRulesRequest, ShowHttpIgnoreRulesResponse>
     */
    public SyncInvoker<ShowHttpIgnoreRulesRequest, ShowHttpIgnoreRulesResponse> showHttpIgnoreRulesInvoker(
        ShowHttpIgnoreRulesRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpIgnoreRules, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPoliciesRequest 请求对象
     * @return ShowHttpPoliciesResponse
     */
    public ShowHttpPoliciesResponse showHttpPolicies(ShowHttpPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpPolicies);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPoliciesRequest 请求对象
     * @return SyncInvoker<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse>
     */
    public SyncInvoker<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> showHttpPoliciesInvoker(
        ShowHttpPoliciesRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpPolicies, hcClient);
    }

    /**
     * 查询防护策略
     *
     * 查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPolicyRequest 请求对象
     * @return ShowHttpPolicyResponse
     */
    public ShowHttpPolicyResponse showHttpPolicy(ShowHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpPolicy);
    }

    /**
     * 查询防护策略
     *
     * 查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPolicyRequest 请求对象
     * @return SyncInvoker<ShowHttpPolicyRequest, ShowHttpPolicyResponse>
     */
    public SyncInvoker<ShowHttpPolicyRequest, ShowHttpPolicyResponse> showHttpPolicyInvoker(
        ShowHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpPolicy, hcClient);
    }

    /**
     * 查询攻击惩罚规则
     *
     * 查询攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPunishmentRuleRequest 请求对象
     * @return ShowHttpPunishmentRuleResponse
     */
    public ShowHttpPunishmentRuleResponse showHttpPunishmentRule(ShowHttpPunishmentRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpPunishmentRule);
    }

    /**
     * 查询攻击惩罚规则
     *
     * 查询攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPunishmentRuleRequest 请求对象
     * @return SyncInvoker<ShowHttpPunishmentRuleRequest, ShowHttpPunishmentRuleResponse>
     */
    public SyncInvoker<ShowHttpPunishmentRuleRequest, ShowHttpPunishmentRuleResponse> showHttpPunishmentRuleInvoker(
        ShowHttpPunishmentRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpPunishmentRule, hcClient);
    }

    /**
     * 查询攻击惩罚规则列表
     *
     * 查询攻击惩罚规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPunishmentRulesRequest 请求对象
     * @return ShowHttpPunishmentRulesResponse
     */
    public ShowHttpPunishmentRulesResponse showHttpPunishmentRules(ShowHttpPunishmentRulesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpPunishmentRules);
    }

    /**
     * 查询攻击惩罚规则列表
     *
     * 查询攻击惩罚规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPunishmentRulesRequest 请求对象
     * @return SyncInvoker<ShowHttpPunishmentRulesRequest, ShowHttpPunishmentRulesResponse>
     */
    public SyncInvoker<ShowHttpPunishmentRulesRequest, ShowHttpPunishmentRulesResponse> showHttpPunishmentRulesInvoker(
        ShowHttpPunishmentRulesRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpPunishmentRules, hcClient);
    }

    /**
     * 更新精准防护规则
     *
     * 更新精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpAccessControlRuleRequest 请求对象
     * @return UpdateHttpAccessControlRuleResponse
     */
    public UpdateHttpAccessControlRuleResponse updateHttpAccessControlRule(UpdateHttpAccessControlRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpAccessControlRule);
    }

    /**
     * 更新精准防护规则
     *
     * 更新精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpAccessControlRuleRequest 请求对象
     * @return SyncInvoker<UpdateHttpAccessControlRuleRequest, UpdateHttpAccessControlRuleResponse>
     */
    public SyncInvoker<UpdateHttpAccessControlRuleRequest, UpdateHttpAccessControlRuleResponse> updateHttpAccessControlRuleInvoker(
        UpdateHttpAccessControlRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpAccessControlRule, hcClient);
    }

    /**
     * 更新地理位置规则
     *
     * 更新地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpGeoIpRuleRequest 请求对象
     * @return UpdateHttpGeoIpRuleResponse
     */
    public UpdateHttpGeoIpRuleResponse updateHttpGeoIpRule(UpdateHttpGeoIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpGeoIpRule);
    }

    /**
     * 更新地理位置规则
     *
     * 更新地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpGeoIpRuleRequest 请求对象
     * @return SyncInvoker<UpdateHttpGeoIpRuleRequest, UpdateHttpGeoIpRuleResponse>
     */
    public SyncInvoker<UpdateHttpGeoIpRuleRequest, UpdateHttpGeoIpRuleResponse> updateHttpGeoIpRuleInvoker(
        UpdateHttpGeoIpRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpGeoIpRule, hcClient);
    }

    /**
     * 更新误报屏蔽规则
     *
     * 更新误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpIgnoreRuleRequest 请求对象
     * @return UpdateHttpIgnoreRuleResponse
     */
    public UpdateHttpIgnoreRuleResponse updateHttpIgnoreRule(UpdateHttpIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpIgnoreRule);
    }

    /**
     * 更新误报屏蔽规则
     *
     * 更新误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpIgnoreRuleRequest 请求对象
     * @return SyncInvoker<UpdateHttpIgnoreRuleRequest, UpdateHttpIgnoreRuleResponse>
     */
    public SyncInvoker<UpdateHttpIgnoreRuleRequest, UpdateHttpIgnoreRuleResponse> updateHttpIgnoreRuleInvoker(
        UpdateHttpIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpIgnoreRule, hcClient);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRequest 请求对象
     * @return UpdateHttpPolicyResponse
     */
    public UpdateHttpPolicyResponse updateHttpPolicy(UpdateHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpPolicy);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRequest 请求对象
     * @return SyncInvoker<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse>
     */
    public SyncInvoker<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> updateHttpPolicyInvoker(
        UpdateHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpPolicy, hcClient);
    }

    /**
     * 更新防护策略规则开关
     *
     * 更新防护策略规则开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRuleStatusRequest 请求对象
     * @return UpdateHttpPolicyRuleStatusResponse
     */
    public UpdateHttpPolicyRuleStatusResponse updateHttpPolicyRuleStatus(UpdateHttpPolicyRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpPolicyRuleStatus);
    }

    /**
     * 更新防护策略规则开关
     *
     * 更新防护策略规则开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRuleStatusRequest 请求对象
     * @return SyncInvoker<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse>
     */
    public SyncInvoker<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> updateHttpPolicyRuleStatusInvoker(
        UpdateHttpPolicyRuleStatusRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpPolicyRuleStatus, hcClient);
    }

    /**
     * 更新攻击惩罚规则
     *
     * 更新攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPunishmentRuleRequest 请求对象
     * @return UpdateHttpPunishmentRuleResponse
     */
    public UpdateHttpPunishmentRuleResponse updateHttpPunishmentRule(UpdateHttpPunishmentRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpPunishmentRule);
    }

    /**
     * 更新攻击惩罚规则
     *
     * 更新攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPunishmentRuleRequest 请求对象
     * @return SyncInvoker<UpdateHttpPunishmentRuleRequest, UpdateHttpPunishmentRuleResponse>
     */
    public SyncInvoker<UpdateHttpPunishmentRuleRequest, UpdateHttpPunishmentRuleResponse> updateHttpPunishmentRuleInvoker(
        UpdateHttpPunishmentRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpPunishmentRule, hcClient);
    }

    /**
     * 创建cc规则
     *
     * 创建cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpCcRuleRequest 请求对象
     * @return CreateHttpCcRuleResponse
     */
    public CreateHttpCcRuleResponse createHttpCcRule(CreateHttpCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpCcRule);
    }

    /**
     * 创建cc规则
     *
     * 创建cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpCcRuleRequest 请求对象
     * @return SyncInvoker<CreateHttpCcRuleRequest, CreateHttpCcRuleResponse>
     */
    public SyncInvoker<CreateHttpCcRuleRequest, CreateHttpCcRuleResponse> createHttpCcRuleInvoker(
        CreateHttpCcRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpCcRule, hcClient);
    }

    /**
     * 删除cc规则
     *
     * 删除cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpCcRuleRequest 请求对象
     * @return DeleteHttpCcRuleResponse
     */
    public DeleteHttpCcRuleResponse deleteHttpCcRule(DeleteHttpCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpCcRule);
    }

    /**
     * 删除cc规则
     *
     * 删除cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpCcRuleRequest 请求对象
     * @return SyncInvoker<DeleteHttpCcRuleRequest, DeleteHttpCcRuleResponse>
     */
    public SyncInvoker<DeleteHttpCcRuleRequest, DeleteHttpCcRuleResponse> deleteHttpCcRuleInvoker(
        DeleteHttpCcRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpCcRule, hcClient);
    }

    /**
     * 查询cc规则
     *
     * 查询cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpCcRuleRequest 请求对象
     * @return ShowHttpCcRuleResponse
     */
    public ShowHttpCcRuleResponse showHttpCcRule(ShowHttpCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpCcRule);
    }

    /**
     * 查询cc规则
     *
     * 查询cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpCcRuleRequest 请求对象
     * @return SyncInvoker<ShowHttpCcRuleRequest, ShowHttpCcRuleResponse>
     */
    public SyncInvoker<ShowHttpCcRuleRequest, ShowHttpCcRuleResponse> showHttpCcRuleInvoker(
        ShowHttpCcRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpCcRule, hcClient);
    }

    /**
     * 查询cc规则列表
     *
     * 查询cc规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpCcRulesRequest 请求对象
     * @return ShowHttpCcRulesResponse
     */
    public ShowHttpCcRulesResponse showHttpCcRules(ShowHttpCcRulesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpCcRules);
    }

    /**
     * 查询cc规则列表
     *
     * 查询cc规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpCcRulesRequest 请求对象
     * @return SyncInvoker<ShowHttpCcRulesRequest, ShowHttpCcRulesResponse>
     */
    public SyncInvoker<ShowHttpCcRulesRequest, ShowHttpCcRulesResponse> showHttpCcRulesInvoker(
        ShowHttpCcRulesRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpCcRules, hcClient);
    }

    /**
     * 更新cc规则
     *
     * 更新cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpCcRuleRequest 请求对象
     * @return UpdateHttpCcRuleResponse
     */
    public UpdateHttpCcRuleResponse updateHttpCcRule(UpdateHttpCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpCcRule);
    }

    /**
     * 更新cc规则
     *
     * 更新cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpCcRuleRequest 请求对象
     * @return SyncInvoker<UpdateHttpCcRuleRequest, UpdateHttpCcRuleResponse>
     */
    public SyncInvoker<UpdateHttpCcRuleRequest, UpdateHttpCcRuleResponse> updateHttpCcRuleInvoker(
        UpdateHttpCcRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpCcRule, hcClient);
    }

    /**
     * 创建IP黑白名单规则
     *
     * 创建IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpBlockTrustIpRuleRequest 请求对象
     * @return CreateHttpBlockTrustIpRuleResponse
     */
    public CreateHttpBlockTrustIpRuleResponse createHttpBlockTrustIpRule(CreateHttpBlockTrustIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpBlockTrustIpRule);
    }

    /**
     * 创建IP黑白名单规则
     *
     * 创建IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpBlockTrustIpRuleRequest 请求对象
     * @return SyncInvoker<CreateHttpBlockTrustIpRuleRequest, CreateHttpBlockTrustIpRuleResponse>
     */
    public SyncInvoker<CreateHttpBlockTrustIpRuleRequest, CreateHttpBlockTrustIpRuleResponse> createHttpBlockTrustIpRuleInvoker(
        CreateHttpBlockTrustIpRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpBlockTrustIpRule, hcClient);
    }

    /**
     * 删除IP黑白名单规则
     *
     * 删除IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpBlockTrustIpRuleRequest 请求对象
     * @return DeleteHttpBlockTrustIpRuleResponse
     */
    public DeleteHttpBlockTrustIpRuleResponse deleteHttpBlockTrustIpRule(DeleteHttpBlockTrustIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpBlockTrustIpRule);
    }

    /**
     * 删除IP黑白名单规则
     *
     * 删除IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpBlockTrustIpRuleRequest 请求对象
     * @return SyncInvoker<DeleteHttpBlockTrustIpRuleRequest, DeleteHttpBlockTrustIpRuleResponse>
     */
    public SyncInvoker<DeleteHttpBlockTrustIpRuleRequest, DeleteHttpBlockTrustIpRuleResponse> deleteHttpBlockTrustIpRuleInvoker(
        DeleteHttpBlockTrustIpRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpBlockTrustIpRule, hcClient);
    }

    /**
     * 查询IP黑白名单规则
     *
     * 查询IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpBlockTrustIpRuleRequest 请求对象
     * @return ShowHttpBlockTrustIpRuleResponse
     */
    public ShowHttpBlockTrustIpRuleResponse showHttpBlockTrustIpRule(ShowHttpBlockTrustIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpBlockTrustIpRule);
    }

    /**
     * 查询IP黑白名单规则
     *
     * 查询IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpBlockTrustIpRuleRequest 请求对象
     * @return SyncInvoker<ShowHttpBlockTrustIpRuleRequest, ShowHttpBlockTrustIpRuleResponse>
     */
    public SyncInvoker<ShowHttpBlockTrustIpRuleRequest, ShowHttpBlockTrustIpRuleResponse> showHttpBlockTrustIpRuleInvoker(
        ShowHttpBlockTrustIpRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpBlockTrustIpRule, hcClient);
    }

    /**
     * 查询IP黑白名单规则列表
     *
     * 查询IP黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpBlockTrustIpRulesRequest 请求对象
     * @return ShowHttpBlockTrustIpRulesResponse
     */
    public ShowHttpBlockTrustIpRulesResponse showHttpBlockTrustIpRules(ShowHttpBlockTrustIpRulesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpBlockTrustIpRules);
    }

    /**
     * 查询IP黑白名单规则列表
     *
     * 查询IP黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpBlockTrustIpRulesRequest 请求对象
     * @return SyncInvoker<ShowHttpBlockTrustIpRulesRequest, ShowHttpBlockTrustIpRulesResponse>
     */
    public SyncInvoker<ShowHttpBlockTrustIpRulesRequest, ShowHttpBlockTrustIpRulesResponse> showHttpBlockTrustIpRulesInvoker(
        ShowHttpBlockTrustIpRulesRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpBlockTrustIpRules, hcClient);
    }

    /**
     * 更新IP黑白名单规则
     *
     * 更新IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpBlockTrustIpRuleRequest 请求对象
     * @return UpdateHttpBlockTrustIpRuleResponse
     */
    public UpdateHttpBlockTrustIpRuleResponse updateHttpBlockTrustIpRule(UpdateHttpBlockTrustIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpBlockTrustIpRule);
    }

    /**
     * 更新IP黑白名单规则
     *
     * 更新IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpBlockTrustIpRuleRequest 请求对象
     * @return SyncInvoker<UpdateHttpBlockTrustIpRuleRequest, UpdateHttpBlockTrustIpRuleResponse>
     */
    public SyncInvoker<UpdateHttpBlockTrustIpRuleRequest, UpdateHttpBlockTrustIpRuleResponse> updateHttpBlockTrustIpRuleInvoker(
        UpdateHttpBlockTrustIpRuleRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpBlockTrustIpRule, hcClient);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpIpGroupRequest 请求对象
     * @return CreateHttpIpGroupResponse
     */
    public CreateHttpIpGroupResponse createHttpIpGroup(CreateHttpIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpIpGroup);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpIpGroupRequest 请求对象
     * @return SyncInvoker<CreateHttpIpGroupRequest, CreateHttpIpGroupResponse>
     */
    public SyncInvoker<CreateHttpIpGroupRequest, CreateHttpIpGroupResponse> createHttpIpGroupInvoker(
        CreateHttpIpGroupRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpIpGroup, hcClient);
    }

    /**
     * 删除IP地址组
     *
     * 删除IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpIpGroupRequest 请求对象
     * @return DeleteHttpIpGroupResponse
     */
    public DeleteHttpIpGroupResponse deleteHttpIpGroup(DeleteHttpIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpIpGroup);
    }

    /**
     * 删除IP地址组
     *
     * 删除IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpIpGroupRequest 请求对象
     * @return SyncInvoker<DeleteHttpIpGroupRequest, DeleteHttpIpGroupResponse>
     */
    public SyncInvoker<DeleteHttpIpGroupRequest, DeleteHttpIpGroupResponse> deleteHttpIpGroupInvoker(
        DeleteHttpIpGroupRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpIpGroup, hcClient);
    }

    /**
     * 查询IP地址组
     *
     * 查询IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIpGroupRequest 请求对象
     * @return ShowHttpIpGroupResponse
     */
    public ShowHttpIpGroupResponse showHttpIpGroup(ShowHttpIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpIpGroup);
    }

    /**
     * 查询IP地址组
     *
     * 查询IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIpGroupRequest 请求对象
     * @return SyncInvoker<ShowHttpIpGroupRequest, ShowHttpIpGroupResponse>
     */
    public SyncInvoker<ShowHttpIpGroupRequest, ShowHttpIpGroupResponse> showHttpIpGroupInvoker(
        ShowHttpIpGroupRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpIpGroup, hcClient);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIpGroupsRequest 请求对象
     * @return ShowHttpIpGroupsResponse
     */
    public ShowHttpIpGroupsResponse showHttpIpGroups(ShowHttpIpGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpIpGroups);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIpGroupsRequest 请求对象
     * @return SyncInvoker<ShowHttpIpGroupsRequest, ShowHttpIpGroupsResponse>
     */
    public SyncInvoker<ShowHttpIpGroupsRequest, ShowHttpIpGroupsResponse> showHttpIpGroupsInvoker(
        ShowHttpIpGroupsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpIpGroups, hcClient);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpIpGroupRequest 请求对象
     * @return UpdateHttpIpGroupResponse
     */
    public UpdateHttpIpGroupResponse updateHttpIpGroup(UpdateHttpIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpIpGroup);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpIpGroupRequest 请求对象
     * @return SyncInvoker<UpdateHttpIpGroupRequest, UpdateHttpIpGroupResponse>
     */
    public SyncInvoker<UpdateHttpIpGroupRequest, UpdateHttpIpGroupResponse> updateHttpIpGroupInvoker(
        UpdateHttpIpGroupRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpIpGroup, hcClient);
    }

}

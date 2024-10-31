package com.huaweicloud.sdk.edgesec.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class EdgeSecAsyncClient {

    protected HcClient hcClient;

    public EdgeSecAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EdgeSecAsyncClient> newBuilder() {
        ClientBuilder<EdgeSecAsyncClient> clientBuilder = new ClientBuilder<>(EdgeSecAsyncClient::new);
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
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createDomain);
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
        return new AsyncInvoker<>(request, EdgeSecMeta.createDomain, hcClient);
    }

    /**
     * 创建引用表
     *
     * 创建引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpReferenceTableRequest 请求对象
     * @return CompletableFuture<CreateHttpReferenceTableResponse>
     */
    public CompletableFuture<CreateHttpReferenceTableResponse> createHttpReferenceTableAsync(
        CreateHttpReferenceTableRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpReferenceTable);
    }

    /**
     * 创建引用表
     *
     * 创建引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpReferenceTableRequest 请求对象
     * @return AsyncInvoker<CreateHttpReferenceTableRequest, CreateHttpReferenceTableResponse>
     */
    public AsyncInvoker<CreateHttpReferenceTableRequest, CreateHttpReferenceTableResponse> createHttpReferenceTableAsyncInvoker(
        CreateHttpReferenceTableRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpReferenceTable, hcClient);
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
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteDomain);
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
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteDomain, hcClient);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpReferenceTableRequest 请求对象
     * @return CompletableFuture<DeleteHttpReferenceTableResponse>
     */
    public CompletableFuture<DeleteHttpReferenceTableResponse> deleteHttpReferenceTableAsync(
        DeleteHttpReferenceTableRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpReferenceTable);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpReferenceTableRequest 请求对象
     * @return AsyncInvoker<DeleteHttpReferenceTableRequest, DeleteHttpReferenceTableResponse>
     */
    public AsyncInvoker<DeleteHttpReferenceTableRequest, DeleteHttpReferenceTableResponse> deleteHttpReferenceTableAsyncInvoker(
        DeleteHttpReferenceTableRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpReferenceTable, hcClient);
    }

    /**
     * 查询防护域名详情
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return CompletableFuture<ShowDomainDetailResponse>
     */
    public CompletableFuture<ShowDomainDetailResponse> showDomainDetailAsync(ShowDomainDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showDomainDetail);
    }

    /**
     * 查询防护域名详情
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>
     */
    public AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailAsyncInvoker(
        ShowDomainDetailRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showDomainDetail, hcClient);
    }

    /**
     * 查询防护域名列表
     *
     * 查询防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsRequest 请求对象
     * @return CompletableFuture<ShowDomainsResponse>
     */
    public CompletableFuture<ShowDomainsResponse> showDomainsAsync(ShowDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showDomains);
    }

    /**
     * 查询防护域名列表
     *
     * 查询防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsRequest 请求对象
     * @return AsyncInvoker<ShowDomainsRequest, ShowDomainsResponse>
     */
    public AsyncInvoker<ShowDomainsRequest, ShowDomainsResponse> showDomainsAsyncInvoker(ShowDomainsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showDomains, hcClient);
    }

    /**
     * 查询攻击域名
     *
     * 查询安全总览top信息，包含攻击域名、攻击源ip、攻击url、攻击来源区域、防护类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpOverviewsRequest 请求对象
     * @return CompletableFuture<ShowHttpOverviewsResponse>
     */
    public CompletableFuture<ShowHttpOverviewsResponse> showHttpOverviewsAsync(ShowHttpOverviewsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpOverviews);
    }

    /**
     * 查询攻击域名
     *
     * 查询安全总览top信息，包含攻击域名、攻击源ip、攻击url、攻击来源区域、防护类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpOverviewsRequest 请求对象
     * @return AsyncInvoker<ShowHttpOverviewsRequest, ShowHttpOverviewsResponse>
     */
    public AsyncInvoker<ShowHttpOverviewsRequest, ShowHttpOverviewsResponse> showHttpOverviewsAsyncInvoker(
        ShowHttpOverviewsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpOverviews, hcClient);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpReferenceTablesRequest 请求对象
     * @return CompletableFuture<ShowHttpReferenceTablesResponse>
     */
    public CompletableFuture<ShowHttpReferenceTablesResponse> showHttpReferenceTablesAsync(
        ShowHttpReferenceTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpReferenceTables);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpReferenceTablesRequest 请求对象
     * @return AsyncInvoker<ShowHttpReferenceTablesRequest, ShowHttpReferenceTablesResponse>
     */
    public AsyncInvoker<ShowHttpReferenceTablesRequest, ShowHttpReferenceTablesResponse> showHttpReferenceTablesAsyncInvoker(
        ShowHttpReferenceTablesRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpReferenceTables, hcClient);
    }

    /**
     * 查询安全总览请求数据
     *
     * 查询安全总览请求数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpStatisticsRequest 请求对象
     * @return CompletableFuture<ShowHttpStatisticsResponse>
     */
    public CompletableFuture<ShowHttpStatisticsResponse> showHttpStatisticsAsync(ShowHttpStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpStatistics);
    }

    /**
     * 查询安全总览请求数据
     *
     * 查询安全总览请求数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowHttpStatisticsRequest, ShowHttpStatisticsResponse>
     */
    public AsyncInvoker<ShowHttpStatisticsRequest, ShowHttpStatisticsResponse> showHttpStatisticsAsyncInvoker(
        ShowHttpStatisticsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpStatistics, hcClient);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return CompletableFuture<UpdateDomainResponse>
     */
    public CompletableFuture<UpdateDomainResponse> updateDomainAsync(UpdateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateDomain);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainAsyncInvoker(
        UpdateDomainRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateDomain, hcClient);
    }

    /**
     * 更新引用表
     *
     * 更新引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpReferenceTableRequest 请求对象
     * @return CompletableFuture<UpdateHttpReferenceTableResponse>
     */
    public CompletableFuture<UpdateHttpReferenceTableResponse> updateHttpReferenceTableAsync(
        UpdateHttpReferenceTableRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpReferenceTable);
    }

    /**
     * 更新引用表
     *
     * 更新引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpReferenceTableRequest 请求对象
     * @return AsyncInvoker<UpdateHttpReferenceTableRequest, UpdateHttpReferenceTableResponse>
     */
    public AsyncInvoker<UpdateHttpReferenceTableRequest, UpdateHttpReferenceTableResponse> updateHttpReferenceTableAsyncInvoker(
        UpdateHttpReferenceTableRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpReferenceTable, hcClient);
    }

    /**
     * Ddos攻击日志下载
     *
     * Ddos攻击日志下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDdosAttackLogsRequest 请求对象
     * @return CompletableFuture<DownloadDdosAttackLogsResponse>
     */
    public CompletableFuture<DownloadDdosAttackLogsResponse> downloadDdosAttackLogsAsync(
        DownloadDdosAttackLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.downloadDdosAttackLogs);
    }

    /**
     * Ddos攻击日志下载
     *
     * Ddos攻击日志下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDdosAttackLogsRequest 请求对象
     * @return AsyncInvoker<DownloadDdosAttackLogsRequest, DownloadDdosAttackLogsResponse>
     */
    public AsyncInvoker<DownloadDdosAttackLogsRequest, DownloadDdosAttackLogsResponse> downloadDdosAttackLogsAsyncInvoker(
        DownloadDdosAttackLogsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.downloadDdosAttackLogs, hcClient);
    }

    /**
     * 查询ddos攻击日志列表
     *
     * 查询ddos攻击日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdosAttackLogsRequest 请求对象
     * @return CompletableFuture<ShowDdosAttackLogsResponse>
     */
    public CompletableFuture<ShowDdosAttackLogsResponse> showDdosAttackLogsAsync(ShowDdosAttackLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showDdosAttackLogs);
    }

    /**
     * 查询ddos攻击日志列表
     *
     * 查询ddos攻击日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdosAttackLogsRequest 请求对象
     * @return AsyncInvoker<ShowDdosAttackLogsRequest, ShowDdosAttackLogsResponse>
     */
    public AsyncInvoker<ShowDdosAttackLogsRequest, ShowDdosAttackLogsResponse> showDdosAttackLogsAsyncInvoker(
        ShowDdosAttackLogsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showDdosAttackLogs, hcClient);
    }

    /**
     * 查询DDoS攻击统计时间线数据
     *
     * 查询DDoS攻击统计时间线数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdosAttackTimelineStatsRequest 请求对象
     * @return CompletableFuture<ShowDdosAttackTimelineStatsResponse>
     */
    public CompletableFuture<ShowDdosAttackTimelineStatsResponse> showDdosAttackTimelineStatsAsync(
        ShowDdosAttackTimelineStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showDdosAttackTimelineStats);
    }

    /**
     * 查询DDoS攻击统计时间线数据
     *
     * 查询DDoS攻击统计时间线数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdosAttackTimelineStatsRequest 请求对象
     * @return AsyncInvoker<ShowDdosAttackTimelineStatsRequest, ShowDdosAttackTimelineStatsResponse>
     */
    public AsyncInvoker<ShowDdosAttackTimelineStatsRequest, ShowDdosAttackTimelineStatsResponse> showDdosAttackTimelineStatsAsyncInvoker(
        ShowDdosAttackTimelineStatsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showDdosAttackTimelineStats, hcClient);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyHttpPolicyRequest 请求对象
     * @return CompletableFuture<ApplyHttpPolicyResponse>
     */
    public CompletableFuture<ApplyHttpPolicyResponse> applyHttpPolicyAsync(ApplyHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.applyHttpPolicy);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyHttpPolicyRequest 请求对象
     * @return AsyncInvoker<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse>
     */
    public AsyncInvoker<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> applyHttpPolicyAsyncInvoker(
        ApplyHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.applyHttpPolicy, hcClient);
    }

    /**
     * 创建精准防护规则
     *
     * 创建精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpAccessControlRuleRequest 请求对象
     * @return CompletableFuture<CreateHttpAccessControlRuleResponse>
     */
    public CompletableFuture<CreateHttpAccessControlRuleResponse> createHttpAccessControlRuleAsync(
        CreateHttpAccessControlRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpAccessControlRule);
    }

    /**
     * 创建精准防护规则
     *
     * 创建精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpAccessControlRuleRequest 请求对象
     * @return AsyncInvoker<CreateHttpAccessControlRuleRequest, CreateHttpAccessControlRuleResponse>
     */
    public AsyncInvoker<CreateHttpAccessControlRuleRequest, CreateHttpAccessControlRuleResponse> createHttpAccessControlRuleAsyncInvoker(
        CreateHttpAccessControlRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpAccessControlRule, hcClient);
    }

    /**
     * 创建地理位置规则
     *
     * 创建地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpGeoIpRuleRequest 请求对象
     * @return CompletableFuture<CreateHttpGeoIpRuleResponse>
     */
    public CompletableFuture<CreateHttpGeoIpRuleResponse> createHttpGeoIpRuleAsync(CreateHttpGeoIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpGeoIpRule);
    }

    /**
     * 创建地理位置规则
     *
     * 创建地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpGeoIpRuleRequest 请求对象
     * @return AsyncInvoker<CreateHttpGeoIpRuleRequest, CreateHttpGeoIpRuleResponse>
     */
    public AsyncInvoker<CreateHttpGeoIpRuleRequest, CreateHttpGeoIpRuleResponse> createHttpGeoIpRuleAsyncInvoker(
        CreateHttpGeoIpRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpGeoIpRule, hcClient);
    }

    /**
     * 创建误报屏蔽规则
     *
     * 创建误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpIgnoreRuleRequest 请求对象
     * @return CompletableFuture<CreateHttpIgnoreRuleResponse>
     */
    public CompletableFuture<CreateHttpIgnoreRuleResponse> createHttpIgnoreRuleAsync(
        CreateHttpIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpIgnoreRule);
    }

    /**
     * 创建误报屏蔽规则
     *
     * 创建误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<CreateHttpIgnoreRuleRequest, CreateHttpIgnoreRuleResponse>
     */
    public AsyncInvoker<CreateHttpIgnoreRuleRequest, CreateHttpIgnoreRuleResponse> createHttpIgnoreRuleAsyncInvoker(
        CreateHttpIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpIgnoreRule, hcClient);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPolicyRequest 请求对象
     * @return CompletableFuture<CreateHttpPolicyResponse>
     */
    public CompletableFuture<CreateHttpPolicyResponse> createHttpPolicyAsync(CreateHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPolicyRequest 请求对象
     * @return AsyncInvoker<CreateHttpPolicyRequest, CreateHttpPolicyResponse>
     */
    public AsyncInvoker<CreateHttpPolicyRequest, CreateHttpPolicyResponse> createHttpPolicyAsyncInvoker(
        CreateHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpPolicy, hcClient);
    }

    /**
     * 创建攻击惩罚规则
     *
     * 创建攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPunishmentRuleRequest 请求对象
     * @return CompletableFuture<CreateHttpPunishmentRuleResponse>
     */
    public CompletableFuture<CreateHttpPunishmentRuleResponse> createHttpPunishmentRuleAsync(
        CreateHttpPunishmentRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpPunishmentRule);
    }

    /**
     * 创建攻击惩罚规则
     *
     * 创建攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPunishmentRuleRequest 请求对象
     * @return AsyncInvoker<CreateHttpPunishmentRuleRequest, CreateHttpPunishmentRuleResponse>
     */
    public AsyncInvoker<CreateHttpPunishmentRuleRequest, CreateHttpPunishmentRuleResponse> createHttpPunishmentRuleAsyncInvoker(
        CreateHttpPunishmentRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpPunishmentRule, hcClient);
    }

    /**
     * 删除精准防护规则
     *
     * 删除精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpAccessControlRuleRequest 请求对象
     * @return CompletableFuture<DeleteHttpAccessControlRuleResponse>
     */
    public CompletableFuture<DeleteHttpAccessControlRuleResponse> deleteHttpAccessControlRuleAsync(
        DeleteHttpAccessControlRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpAccessControlRule);
    }

    /**
     * 删除精准防护规则
     *
     * 删除精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpAccessControlRuleRequest 请求对象
     * @return AsyncInvoker<DeleteHttpAccessControlRuleRequest, DeleteHttpAccessControlRuleResponse>
     */
    public AsyncInvoker<DeleteHttpAccessControlRuleRequest, DeleteHttpAccessControlRuleResponse> deleteHttpAccessControlRuleAsyncInvoker(
        DeleteHttpAccessControlRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpAccessControlRule, hcClient);
    }

    /**
     * 删除地理位置规则
     *
     * 删除地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpGeoIpRuleRequest 请求对象
     * @return CompletableFuture<DeleteHttpGeoIpRuleResponse>
     */
    public CompletableFuture<DeleteHttpGeoIpRuleResponse> deleteHttpGeoIpRuleAsync(DeleteHttpGeoIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpGeoIpRule);
    }

    /**
     * 删除地理位置规则
     *
     * 删除地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpGeoIpRuleRequest 请求对象
     * @return AsyncInvoker<DeleteHttpGeoIpRuleRequest, DeleteHttpGeoIpRuleResponse>
     */
    public AsyncInvoker<DeleteHttpGeoIpRuleRequest, DeleteHttpGeoIpRuleResponse> deleteHttpGeoIpRuleAsyncInvoker(
        DeleteHttpGeoIpRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpGeoIpRule, hcClient);
    }

    /**
     * 删除误报屏蔽规则
     *
     * 删除误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpIgnoreRuleRequest 请求对象
     * @return CompletableFuture<DeleteHttpIgnoreRuleResponse>
     */
    public CompletableFuture<DeleteHttpIgnoreRuleResponse> deleteHttpIgnoreRuleAsync(
        DeleteHttpIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpIgnoreRule);
    }

    /**
     * 删除误报屏蔽规则
     *
     * 删除误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<DeleteHttpIgnoreRuleRequest, DeleteHttpIgnoreRuleResponse>
     */
    public AsyncInvoker<DeleteHttpIgnoreRuleRequest, DeleteHttpIgnoreRuleResponse> deleteHttpIgnoreRuleAsyncInvoker(
        DeleteHttpIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpIgnoreRule, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPolicyRequest 请求对象
     * @return CompletableFuture<DeleteHttpPolicyResponse>
     */
    public CompletableFuture<DeleteHttpPolicyResponse> deleteHttpPolicyAsync(DeleteHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpPolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse>
     */
    public AsyncInvoker<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> deleteHttpPolicyAsyncInvoker(
        DeleteHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpPolicy, hcClient);
    }

    /**
     * 删除攻击惩罚规则
     *
     * 删除攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPunishmentRuleRequest 请求对象
     * @return CompletableFuture<DeleteHttpPunishmentRuleResponse>
     */
    public CompletableFuture<DeleteHttpPunishmentRuleResponse> deleteHttpPunishmentRuleAsync(
        DeleteHttpPunishmentRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpPunishmentRule);
    }

    /**
     * 删除攻击惩罚规则
     *
     * 删除攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPunishmentRuleRequest 请求对象
     * @return AsyncInvoker<DeleteHttpPunishmentRuleRequest, DeleteHttpPunishmentRuleResponse>
     */
    public AsyncInvoker<DeleteHttpPunishmentRuleRequest, DeleteHttpPunishmentRuleResponse> deleteHttpPunishmentRuleAsyncInvoker(
        DeleteHttpPunishmentRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpPunishmentRule, hcClient);
    }

    /**
     * 重置误报屏蔽规则
     *
     * 重置误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetHttpIgnoreRuleRequest 请求对象
     * @return CompletableFuture<ResetHttpIgnoreRuleResponse>
     */
    public CompletableFuture<ResetHttpIgnoreRuleResponse> resetHttpIgnoreRuleAsync(ResetHttpIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.resetHttpIgnoreRule);
    }

    /**
     * 重置误报屏蔽规则
     *
     * 重置误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetHttpIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<ResetHttpIgnoreRuleRequest, ResetHttpIgnoreRuleResponse>
     */
    public AsyncInvoker<ResetHttpIgnoreRuleRequest, ResetHttpIgnoreRuleResponse> resetHttpIgnoreRuleAsyncInvoker(
        ResetHttpIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.resetHttpIgnoreRule, hcClient);
    }

    /**
     * 查询精准防护规则
     *
     * 查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAccessControlRuleRequest 请求对象
     * @return CompletableFuture<ShowHttpAccessControlRuleResponse>
     */
    public CompletableFuture<ShowHttpAccessControlRuleResponse> showHttpAccessControlRuleAsync(
        ShowHttpAccessControlRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpAccessControlRule);
    }

    /**
     * 查询精准防护规则
     *
     * 查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAccessControlRuleRequest 请求对象
     * @return AsyncInvoker<ShowHttpAccessControlRuleRequest, ShowHttpAccessControlRuleResponse>
     */
    public AsyncInvoker<ShowHttpAccessControlRuleRequest, ShowHttpAccessControlRuleResponse> showHttpAccessControlRuleAsyncInvoker(
        ShowHttpAccessControlRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpAccessControlRule, hcClient);
    }

    /**
     * 查询精准防护规则列表
     *
     * 查询精准防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAccessControlRulesRequest 请求对象
     * @return CompletableFuture<ShowHttpAccessControlRulesResponse>
     */
    public CompletableFuture<ShowHttpAccessControlRulesResponse> showHttpAccessControlRulesAsync(
        ShowHttpAccessControlRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpAccessControlRules);
    }

    /**
     * 查询精准防护规则列表
     *
     * 查询精准防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAccessControlRulesRequest 请求对象
     * @return AsyncInvoker<ShowHttpAccessControlRulesRequest, ShowHttpAccessControlRulesResponse>
     */
    public AsyncInvoker<ShowHttpAccessControlRulesRequest, ShowHttpAccessControlRulesResponse> showHttpAccessControlRulesAsyncInvoker(
        ShowHttpAccessControlRulesRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpAccessControlRules, hcClient);
    }

    /**
     * 查询HTTP攻击分布数据
     *
     * 查询HTTP攻击分布数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackDistributionStatsRequest 请求对象
     * @return CompletableFuture<ShowHttpAttackDistributionStatsResponse>
     */
    public CompletableFuture<ShowHttpAttackDistributionStatsResponse> showHttpAttackDistributionStatsAsync(
        ShowHttpAttackDistributionStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpAttackDistributionStats);
    }

    /**
     * 查询HTTP攻击分布数据
     *
     * 查询HTTP攻击分布数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackDistributionStatsRequest 请求对象
     * @return AsyncInvoker<ShowHttpAttackDistributionStatsRequest, ShowHttpAttackDistributionStatsResponse>
     */
    public AsyncInvoker<ShowHttpAttackDistributionStatsRequest, ShowHttpAttackDistributionStatsResponse> showHttpAttackDistributionStatsAsyncInvoker(
        ShowHttpAttackDistributionStatsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpAttackDistributionStats, hcClient);
    }

    /**
     * 查询HTTP攻击统计时间线数据
     *
     * 查询HTTP攻击统计时间线数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackTimelineStatsRequest 请求对象
     * @return CompletableFuture<ShowHttpAttackTimelineStatsResponse>
     */
    public CompletableFuture<ShowHttpAttackTimelineStatsResponse> showHttpAttackTimelineStatsAsync(
        ShowHttpAttackTimelineStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpAttackTimelineStats);
    }

    /**
     * 查询HTTP攻击统计时间线数据
     *
     * 查询HTTP攻击统计时间线数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackTimelineStatsRequest 请求对象
     * @return AsyncInvoker<ShowHttpAttackTimelineStatsRequest, ShowHttpAttackTimelineStatsResponse>
     */
    public AsyncInvoker<ShowHttpAttackTimelineStatsRequest, ShowHttpAttackTimelineStatsResponse> showHttpAttackTimelineStatsAsyncInvoker(
        ShowHttpAttackTimelineStatsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpAttackTimelineStats, hcClient);
    }

    /**
     * 查询HTTP攻击TOP数据
     *
     * 查询HTTP攻击TOP数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackTopStatsRequest 请求对象
     * @return CompletableFuture<ShowHttpAttackTopStatsResponse>
     */
    public CompletableFuture<ShowHttpAttackTopStatsResponse> showHttpAttackTopStatsAsync(
        ShowHttpAttackTopStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpAttackTopStats);
    }

    /**
     * 查询HTTP攻击TOP数据
     *
     * 查询HTTP攻击TOP数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpAttackTopStatsRequest 请求对象
     * @return AsyncInvoker<ShowHttpAttackTopStatsRequest, ShowHttpAttackTopStatsResponse>
     */
    public AsyncInvoker<ShowHttpAttackTopStatsRequest, ShowHttpAttackTopStatsResponse> showHttpAttackTopStatsAsyncInvoker(
        ShowHttpAttackTopStatsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpAttackTopStats, hcClient);
    }

    /**
     * 查询地理位置规则
     *
     * 查询地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpGeoIpRuleRequest 请求对象
     * @return CompletableFuture<ShowHttpGeoIpRuleResponse>
     */
    public CompletableFuture<ShowHttpGeoIpRuleResponse> showHttpGeoIpRuleAsync(ShowHttpGeoIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpGeoIpRule);
    }

    /**
     * 查询地理位置规则
     *
     * 查询地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpGeoIpRuleRequest 请求对象
     * @return AsyncInvoker<ShowHttpGeoIpRuleRequest, ShowHttpGeoIpRuleResponse>
     */
    public AsyncInvoker<ShowHttpGeoIpRuleRequest, ShowHttpGeoIpRuleResponse> showHttpGeoIpRuleAsyncInvoker(
        ShowHttpGeoIpRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpGeoIpRule, hcClient);
    }

    /**
     * 查询地理位置规则列表
     *
     * 查询地理位置规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpGeoIpRulesRequest 请求对象
     * @return CompletableFuture<ShowHttpGeoIpRulesResponse>
     */
    public CompletableFuture<ShowHttpGeoIpRulesResponse> showHttpGeoIpRulesAsync(ShowHttpGeoIpRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpGeoIpRules);
    }

    /**
     * 查询地理位置规则列表
     *
     * 查询地理位置规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpGeoIpRulesRequest 请求对象
     * @return AsyncInvoker<ShowHttpGeoIpRulesRequest, ShowHttpGeoIpRulesResponse>
     */
    public AsyncInvoker<ShowHttpGeoIpRulesRequest, ShowHttpGeoIpRulesResponse> showHttpGeoIpRulesAsyncInvoker(
        ShowHttpGeoIpRulesRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpGeoIpRules, hcClient);
    }

    /**
     * 查询误报屏蔽规则
     *
     * 查询误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIgnoreRuleRequest 请求对象
     * @return CompletableFuture<ShowHttpIgnoreRuleResponse>
     */
    public CompletableFuture<ShowHttpIgnoreRuleResponse> showHttpIgnoreRuleAsync(ShowHttpIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpIgnoreRule);
    }

    /**
     * 查询误报屏蔽规则
     *
     * 查询误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<ShowHttpIgnoreRuleRequest, ShowHttpIgnoreRuleResponse>
     */
    public AsyncInvoker<ShowHttpIgnoreRuleRequest, ShowHttpIgnoreRuleResponse> showHttpIgnoreRuleAsyncInvoker(
        ShowHttpIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpIgnoreRule, hcClient);
    }

    /**
     * 查询误报屏蔽规则列表
     *
     * 查询误报屏蔽规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIgnoreRulesRequest 请求对象
     * @return CompletableFuture<ShowHttpIgnoreRulesResponse>
     */
    public CompletableFuture<ShowHttpIgnoreRulesResponse> showHttpIgnoreRulesAsync(ShowHttpIgnoreRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpIgnoreRules);
    }

    /**
     * 查询误报屏蔽规则列表
     *
     * 查询误报屏蔽规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIgnoreRulesRequest 请求对象
     * @return AsyncInvoker<ShowHttpIgnoreRulesRequest, ShowHttpIgnoreRulesResponse>
     */
    public AsyncInvoker<ShowHttpIgnoreRulesRequest, ShowHttpIgnoreRulesResponse> showHttpIgnoreRulesAsyncInvoker(
        ShowHttpIgnoreRulesRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpIgnoreRules, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPoliciesRequest 请求对象
     * @return CompletableFuture<ShowHttpPoliciesResponse>
     */
    public CompletableFuture<ShowHttpPoliciesResponse> showHttpPoliciesAsync(ShowHttpPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpPolicies);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPoliciesRequest 请求对象
     * @return AsyncInvoker<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse>
     */
    public AsyncInvoker<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> showHttpPoliciesAsyncInvoker(
        ShowHttpPoliciesRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpPolicies, hcClient);
    }

    /**
     * 查询防护策略
     *
     * 查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPolicyRequest 请求对象
     * @return CompletableFuture<ShowHttpPolicyResponse>
     */
    public CompletableFuture<ShowHttpPolicyResponse> showHttpPolicyAsync(ShowHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpPolicy);
    }

    /**
     * 查询防护策略
     *
     * 查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPolicyRequest 请求对象
     * @return AsyncInvoker<ShowHttpPolicyRequest, ShowHttpPolicyResponse>
     */
    public AsyncInvoker<ShowHttpPolicyRequest, ShowHttpPolicyResponse> showHttpPolicyAsyncInvoker(
        ShowHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpPolicy, hcClient);
    }

    /**
     * 查询攻击惩罚规则
     *
     * 查询攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPunishmentRuleRequest 请求对象
     * @return CompletableFuture<ShowHttpPunishmentRuleResponse>
     */
    public CompletableFuture<ShowHttpPunishmentRuleResponse> showHttpPunishmentRuleAsync(
        ShowHttpPunishmentRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpPunishmentRule);
    }

    /**
     * 查询攻击惩罚规则
     *
     * 查询攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPunishmentRuleRequest 请求对象
     * @return AsyncInvoker<ShowHttpPunishmentRuleRequest, ShowHttpPunishmentRuleResponse>
     */
    public AsyncInvoker<ShowHttpPunishmentRuleRequest, ShowHttpPunishmentRuleResponse> showHttpPunishmentRuleAsyncInvoker(
        ShowHttpPunishmentRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpPunishmentRule, hcClient);
    }

    /**
     * 查询攻击惩罚规则列表
     *
     * 查询攻击惩罚规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPunishmentRulesRequest 请求对象
     * @return CompletableFuture<ShowHttpPunishmentRulesResponse>
     */
    public CompletableFuture<ShowHttpPunishmentRulesResponse> showHttpPunishmentRulesAsync(
        ShowHttpPunishmentRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpPunishmentRules);
    }

    /**
     * 查询攻击惩罚规则列表
     *
     * 查询攻击惩罚规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPunishmentRulesRequest 请求对象
     * @return AsyncInvoker<ShowHttpPunishmentRulesRequest, ShowHttpPunishmentRulesResponse>
     */
    public AsyncInvoker<ShowHttpPunishmentRulesRequest, ShowHttpPunishmentRulesResponse> showHttpPunishmentRulesAsyncInvoker(
        ShowHttpPunishmentRulesRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpPunishmentRules, hcClient);
    }

    /**
     * 更新精准防护规则
     *
     * 更新精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpAccessControlRuleRequest 请求对象
     * @return CompletableFuture<UpdateHttpAccessControlRuleResponse>
     */
    public CompletableFuture<UpdateHttpAccessControlRuleResponse> updateHttpAccessControlRuleAsync(
        UpdateHttpAccessControlRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpAccessControlRule);
    }

    /**
     * 更新精准防护规则
     *
     * 更新精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpAccessControlRuleRequest 请求对象
     * @return AsyncInvoker<UpdateHttpAccessControlRuleRequest, UpdateHttpAccessControlRuleResponse>
     */
    public AsyncInvoker<UpdateHttpAccessControlRuleRequest, UpdateHttpAccessControlRuleResponse> updateHttpAccessControlRuleAsyncInvoker(
        UpdateHttpAccessControlRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpAccessControlRule, hcClient);
    }

    /**
     * 更新地理位置规则
     *
     * 更新地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpGeoIpRuleRequest 请求对象
     * @return CompletableFuture<UpdateHttpGeoIpRuleResponse>
     */
    public CompletableFuture<UpdateHttpGeoIpRuleResponse> updateHttpGeoIpRuleAsync(UpdateHttpGeoIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpGeoIpRule);
    }

    /**
     * 更新地理位置规则
     *
     * 更新地理位置规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpGeoIpRuleRequest 请求对象
     * @return AsyncInvoker<UpdateHttpGeoIpRuleRequest, UpdateHttpGeoIpRuleResponse>
     */
    public AsyncInvoker<UpdateHttpGeoIpRuleRequest, UpdateHttpGeoIpRuleResponse> updateHttpGeoIpRuleAsyncInvoker(
        UpdateHttpGeoIpRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpGeoIpRule, hcClient);
    }

    /**
     * 更新误报屏蔽规则
     *
     * 更新误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpIgnoreRuleRequest 请求对象
     * @return CompletableFuture<UpdateHttpIgnoreRuleResponse>
     */
    public CompletableFuture<UpdateHttpIgnoreRuleResponse> updateHttpIgnoreRuleAsync(
        UpdateHttpIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpIgnoreRule);
    }

    /**
     * 更新误报屏蔽规则
     *
     * 更新误报屏蔽规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<UpdateHttpIgnoreRuleRequest, UpdateHttpIgnoreRuleResponse>
     */
    public AsyncInvoker<UpdateHttpIgnoreRuleRequest, UpdateHttpIgnoreRuleResponse> updateHttpIgnoreRuleAsyncInvoker(
        UpdateHttpIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpIgnoreRule, hcClient);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRequest 请求对象
     * @return CompletableFuture<UpdateHttpPolicyResponse>
     */
    public CompletableFuture<UpdateHttpPolicyResponse> updateHttpPolicyAsync(UpdateHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpPolicy);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse>
     */
    public AsyncInvoker<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> updateHttpPolicyAsyncInvoker(
        UpdateHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpPolicy, hcClient);
    }

    /**
     * 更新防护策略规则开关
     *
     * 更新防护策略规则开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRuleStatusRequest 请求对象
     * @return CompletableFuture<UpdateHttpPolicyRuleStatusResponse>
     */
    public CompletableFuture<UpdateHttpPolicyRuleStatusResponse> updateHttpPolicyRuleStatusAsync(
        UpdateHttpPolicyRuleStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpPolicyRuleStatus);
    }

    /**
     * 更新防护策略规则开关
     *
     * 更新防护策略规则开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRuleStatusRequest 请求对象
     * @return AsyncInvoker<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse>
     */
    public AsyncInvoker<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> updateHttpPolicyRuleStatusAsyncInvoker(
        UpdateHttpPolicyRuleStatusRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpPolicyRuleStatus, hcClient);
    }

    /**
     * 更新攻击惩罚规则
     *
     * 更新攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPunishmentRuleRequest 请求对象
     * @return CompletableFuture<UpdateHttpPunishmentRuleResponse>
     */
    public CompletableFuture<UpdateHttpPunishmentRuleResponse> updateHttpPunishmentRuleAsync(
        UpdateHttpPunishmentRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpPunishmentRule);
    }

    /**
     * 更新攻击惩罚规则
     *
     * 更新攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPunishmentRuleRequest 请求对象
     * @return AsyncInvoker<UpdateHttpPunishmentRuleRequest, UpdateHttpPunishmentRuleResponse>
     */
    public AsyncInvoker<UpdateHttpPunishmentRuleRequest, UpdateHttpPunishmentRuleResponse> updateHttpPunishmentRuleAsyncInvoker(
        UpdateHttpPunishmentRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpPunishmentRule, hcClient);
    }

    /**
     * 创建cc规则
     *
     * 创建cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpCcRuleRequest 请求对象
     * @return CompletableFuture<CreateHttpCcRuleResponse>
     */
    public CompletableFuture<CreateHttpCcRuleResponse> createHttpCcRuleAsync(CreateHttpCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpCcRule);
    }

    /**
     * 创建cc规则
     *
     * 创建cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpCcRuleRequest 请求对象
     * @return AsyncInvoker<CreateHttpCcRuleRequest, CreateHttpCcRuleResponse>
     */
    public AsyncInvoker<CreateHttpCcRuleRequest, CreateHttpCcRuleResponse> createHttpCcRuleAsyncInvoker(
        CreateHttpCcRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpCcRule, hcClient);
    }

    /**
     * 删除cc规则
     *
     * 删除cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpCcRuleRequest 请求对象
     * @return CompletableFuture<DeleteHttpCcRuleResponse>
     */
    public CompletableFuture<DeleteHttpCcRuleResponse> deleteHttpCcRuleAsync(DeleteHttpCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpCcRule);
    }

    /**
     * 删除cc规则
     *
     * 删除cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpCcRuleRequest 请求对象
     * @return AsyncInvoker<DeleteHttpCcRuleRequest, DeleteHttpCcRuleResponse>
     */
    public AsyncInvoker<DeleteHttpCcRuleRequest, DeleteHttpCcRuleResponse> deleteHttpCcRuleAsyncInvoker(
        DeleteHttpCcRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpCcRule, hcClient);
    }

    /**
     * 查询cc规则
     *
     * 查询cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpCcRuleRequest 请求对象
     * @return CompletableFuture<ShowHttpCcRuleResponse>
     */
    public CompletableFuture<ShowHttpCcRuleResponse> showHttpCcRuleAsync(ShowHttpCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpCcRule);
    }

    /**
     * 查询cc规则
     *
     * 查询cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpCcRuleRequest 请求对象
     * @return AsyncInvoker<ShowHttpCcRuleRequest, ShowHttpCcRuleResponse>
     */
    public AsyncInvoker<ShowHttpCcRuleRequest, ShowHttpCcRuleResponse> showHttpCcRuleAsyncInvoker(
        ShowHttpCcRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpCcRule, hcClient);
    }

    /**
     * 查询cc规则列表
     *
     * 查询cc规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpCcRulesRequest 请求对象
     * @return CompletableFuture<ShowHttpCcRulesResponse>
     */
    public CompletableFuture<ShowHttpCcRulesResponse> showHttpCcRulesAsync(ShowHttpCcRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpCcRules);
    }

    /**
     * 查询cc规则列表
     *
     * 查询cc规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpCcRulesRequest 请求对象
     * @return AsyncInvoker<ShowHttpCcRulesRequest, ShowHttpCcRulesResponse>
     */
    public AsyncInvoker<ShowHttpCcRulesRequest, ShowHttpCcRulesResponse> showHttpCcRulesAsyncInvoker(
        ShowHttpCcRulesRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpCcRules, hcClient);
    }

    /**
     * 更新cc规则
     *
     * 更新cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpCcRuleRequest 请求对象
     * @return CompletableFuture<UpdateHttpCcRuleResponse>
     */
    public CompletableFuture<UpdateHttpCcRuleResponse> updateHttpCcRuleAsync(UpdateHttpCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpCcRule);
    }

    /**
     * 更新cc规则
     *
     * 更新cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpCcRuleRequest 请求对象
     * @return AsyncInvoker<UpdateHttpCcRuleRequest, UpdateHttpCcRuleResponse>
     */
    public AsyncInvoker<UpdateHttpCcRuleRequest, UpdateHttpCcRuleResponse> updateHttpCcRuleAsyncInvoker(
        UpdateHttpCcRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpCcRule, hcClient);
    }

    /**
     * 创建IP黑白名单规则
     *
     * 创建IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpBlockTrustIpRuleRequest 请求对象
     * @return CompletableFuture<CreateHttpBlockTrustIpRuleResponse>
     */
    public CompletableFuture<CreateHttpBlockTrustIpRuleResponse> createHttpBlockTrustIpRuleAsync(
        CreateHttpBlockTrustIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpBlockTrustIpRule);
    }

    /**
     * 创建IP黑白名单规则
     *
     * 创建IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpBlockTrustIpRuleRequest 请求对象
     * @return AsyncInvoker<CreateHttpBlockTrustIpRuleRequest, CreateHttpBlockTrustIpRuleResponse>
     */
    public AsyncInvoker<CreateHttpBlockTrustIpRuleRequest, CreateHttpBlockTrustIpRuleResponse> createHttpBlockTrustIpRuleAsyncInvoker(
        CreateHttpBlockTrustIpRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpBlockTrustIpRule, hcClient);
    }

    /**
     * 删除IP黑白名单规则
     *
     * 删除IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpBlockTrustIpRuleRequest 请求对象
     * @return CompletableFuture<DeleteHttpBlockTrustIpRuleResponse>
     */
    public CompletableFuture<DeleteHttpBlockTrustIpRuleResponse> deleteHttpBlockTrustIpRuleAsync(
        DeleteHttpBlockTrustIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpBlockTrustIpRule);
    }

    /**
     * 删除IP黑白名单规则
     *
     * 删除IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpBlockTrustIpRuleRequest 请求对象
     * @return AsyncInvoker<DeleteHttpBlockTrustIpRuleRequest, DeleteHttpBlockTrustIpRuleResponse>
     */
    public AsyncInvoker<DeleteHttpBlockTrustIpRuleRequest, DeleteHttpBlockTrustIpRuleResponse> deleteHttpBlockTrustIpRuleAsyncInvoker(
        DeleteHttpBlockTrustIpRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpBlockTrustIpRule, hcClient);
    }

    /**
     * 查询IP黑白名单规则
     *
     * 查询IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpBlockTrustIpRuleRequest 请求对象
     * @return CompletableFuture<ShowHttpBlockTrustIpRuleResponse>
     */
    public CompletableFuture<ShowHttpBlockTrustIpRuleResponse> showHttpBlockTrustIpRuleAsync(
        ShowHttpBlockTrustIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpBlockTrustIpRule);
    }

    /**
     * 查询IP黑白名单规则
     *
     * 查询IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpBlockTrustIpRuleRequest 请求对象
     * @return AsyncInvoker<ShowHttpBlockTrustIpRuleRequest, ShowHttpBlockTrustIpRuleResponse>
     */
    public AsyncInvoker<ShowHttpBlockTrustIpRuleRequest, ShowHttpBlockTrustIpRuleResponse> showHttpBlockTrustIpRuleAsyncInvoker(
        ShowHttpBlockTrustIpRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpBlockTrustIpRule, hcClient);
    }

    /**
     * 查询IP黑白名单规则列表
     *
     * 查询IP黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpBlockTrustIpRulesRequest 请求对象
     * @return CompletableFuture<ShowHttpBlockTrustIpRulesResponse>
     */
    public CompletableFuture<ShowHttpBlockTrustIpRulesResponse> showHttpBlockTrustIpRulesAsync(
        ShowHttpBlockTrustIpRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpBlockTrustIpRules);
    }

    /**
     * 查询IP黑白名单规则列表
     *
     * 查询IP黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpBlockTrustIpRulesRequest 请求对象
     * @return AsyncInvoker<ShowHttpBlockTrustIpRulesRequest, ShowHttpBlockTrustIpRulesResponse>
     */
    public AsyncInvoker<ShowHttpBlockTrustIpRulesRequest, ShowHttpBlockTrustIpRulesResponse> showHttpBlockTrustIpRulesAsyncInvoker(
        ShowHttpBlockTrustIpRulesRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpBlockTrustIpRules, hcClient);
    }

    /**
     * 更新IP黑白名单规则
     *
     * 更新IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpBlockTrustIpRuleRequest 请求对象
     * @return CompletableFuture<UpdateHttpBlockTrustIpRuleResponse>
     */
    public CompletableFuture<UpdateHttpBlockTrustIpRuleResponse> updateHttpBlockTrustIpRuleAsync(
        UpdateHttpBlockTrustIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpBlockTrustIpRule);
    }

    /**
     * 更新IP黑白名单规则
     *
     * 更新IP黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpBlockTrustIpRuleRequest 请求对象
     * @return AsyncInvoker<UpdateHttpBlockTrustIpRuleRequest, UpdateHttpBlockTrustIpRuleResponse>
     */
    public AsyncInvoker<UpdateHttpBlockTrustIpRuleRequest, UpdateHttpBlockTrustIpRuleResponse> updateHttpBlockTrustIpRuleAsyncInvoker(
        UpdateHttpBlockTrustIpRuleRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpBlockTrustIpRule, hcClient);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpIpGroupRequest 请求对象
     * @return CompletableFuture<CreateHttpIpGroupResponse>
     */
    public CompletableFuture<CreateHttpIpGroupResponse> createHttpIpGroupAsync(CreateHttpIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpIpGroup);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpIpGroupRequest 请求对象
     * @return AsyncInvoker<CreateHttpIpGroupRequest, CreateHttpIpGroupResponse>
     */
    public AsyncInvoker<CreateHttpIpGroupRequest, CreateHttpIpGroupResponse> createHttpIpGroupAsyncInvoker(
        CreateHttpIpGroupRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpIpGroup, hcClient);
    }

    /**
     * 删除IP地址组
     *
     * 删除IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpIpGroupRequest 请求对象
     * @return CompletableFuture<DeleteHttpIpGroupResponse>
     */
    public CompletableFuture<DeleteHttpIpGroupResponse> deleteHttpIpGroupAsync(DeleteHttpIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpIpGroup);
    }

    /**
     * 删除IP地址组
     *
     * 删除IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpIpGroupRequest 请求对象
     * @return AsyncInvoker<DeleteHttpIpGroupRequest, DeleteHttpIpGroupResponse>
     */
    public AsyncInvoker<DeleteHttpIpGroupRequest, DeleteHttpIpGroupResponse> deleteHttpIpGroupAsyncInvoker(
        DeleteHttpIpGroupRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpIpGroup, hcClient);
    }

    /**
     * 查询IP地址组
     *
     * 查询IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIpGroupRequest 请求对象
     * @return CompletableFuture<ShowHttpIpGroupResponse>
     */
    public CompletableFuture<ShowHttpIpGroupResponse> showHttpIpGroupAsync(ShowHttpIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpIpGroup);
    }

    /**
     * 查询IP地址组
     *
     * 查询IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIpGroupRequest 请求对象
     * @return AsyncInvoker<ShowHttpIpGroupRequest, ShowHttpIpGroupResponse>
     */
    public AsyncInvoker<ShowHttpIpGroupRequest, ShowHttpIpGroupResponse> showHttpIpGroupAsyncInvoker(
        ShowHttpIpGroupRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpIpGroup, hcClient);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIpGroupsRequest 请求对象
     * @return CompletableFuture<ShowHttpIpGroupsResponse>
     */
    public CompletableFuture<ShowHttpIpGroupsResponse> showHttpIpGroupsAsync(ShowHttpIpGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpIpGroups);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpIpGroupsRequest 请求对象
     * @return AsyncInvoker<ShowHttpIpGroupsRequest, ShowHttpIpGroupsResponse>
     */
    public AsyncInvoker<ShowHttpIpGroupsRequest, ShowHttpIpGroupsResponse> showHttpIpGroupsAsyncInvoker(
        ShowHttpIpGroupsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpIpGroups, hcClient);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpIpGroupRequest 请求对象
     * @return CompletableFuture<UpdateHttpIpGroupResponse>
     */
    public CompletableFuture<UpdateHttpIpGroupResponse> updateHttpIpGroupAsync(UpdateHttpIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpIpGroup);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpIpGroupRequest 请求对象
     * @return AsyncInvoker<UpdateHttpIpGroupRequest, UpdateHttpIpGroupResponse>
     */
    public AsyncInvoker<UpdateHttpIpGroupRequest, UpdateHttpIpGroupResponse> updateHttpIpGroupAsyncInvoker(
        UpdateHttpIpGroupRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpIpGroup, hcClient);
    }

}

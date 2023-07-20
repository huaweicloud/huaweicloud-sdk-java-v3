package com.huaweicloud.sdk.tics.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.tics.v1.model.ListAgentsRequest;
import com.huaweicloud.sdk.tics.v1.model.ListAgentsResponse;
import com.huaweicloud.sdk.tics.v1.model.ListAuditInfoRequest;
import com.huaweicloud.sdk.tics.v1.model.ListAuditInfoResponse;
import com.huaweicloud.sdk.tics.v1.model.ListFlJobRequest;
import com.huaweicloud.sdk.tics.v1.model.ListFlJobResponse;
import com.huaweicloud.sdk.tics.v1.model.ListInstanceHistoryRequest;
import com.huaweicloud.sdk.tics.v1.model.ListInstanceHistoryResponse;
import com.huaweicloud.sdk.tics.v1.model.ListLeagueDatasetsRequest;
import com.huaweicloud.sdk.tics.v1.model.ListLeagueDatasetsResponse;
import com.huaweicloud.sdk.tics.v1.model.ListLeaguesRequest;
import com.huaweicloud.sdk.tics.v1.model.ListLeaguesResponse;
import com.huaweicloud.sdk.tics.v1.model.ListNodesRequest;
import com.huaweicloud.sdk.tics.v1.model.ListNodesResponse;
import com.huaweicloud.sdk.tics.v1.model.ListNoticesRequest;
import com.huaweicloud.sdk.tics.v1.model.ListNoticesResponse;
import com.huaweicloud.sdk.tics.v1.model.ListPartnersRequest;
import com.huaweicloud.sdk.tics.v1.model.ListPartnersResponse;
import com.huaweicloud.sdk.tics.v1.model.ListSqlJobRequest;
import com.huaweicloud.sdk.tics.v1.model.ListSqlJobResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowAgentDetailRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowAgentDetailResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowDatasetStatisticsRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowDatasetStatisticsResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowInstanceReportRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowInstanceReportResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowJobInstanceDagRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowJobInstanceDagResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowJobStatisticsRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowJobStatisticsResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowLeagueRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowLeagueResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowOverviewRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowOverviewResponse;
import com.huaweicloud.sdk.tics.v1.model.ShowPartnerStatisticsRequest;
import com.huaweicloud.sdk.tics.v1.model.ShowPartnerStatisticsResponse;
import com.huaweicloud.sdk.tics.v1.model.UpdateLeagueRequest;
import com.huaweicloud.sdk.tics.v1.model.UpdateLeagueResponse;

import java.util.concurrent.CompletableFuture;

public class TicsAsyncClient {

    protected HcClient hcClient;

    public TicsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TicsAsyncClient> newBuilder() {
        ClientBuilder<TicsAsyncClient> clientBuilder = new ClientBuilder<>(TicsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 获取计算节点列表
     *
     * 功能描述：用户可以使用该接口获取可信节点信息列表。支持节点名称与联盟名称的模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgentsRequest 请求对象
     * @return CompletableFuture<ListAgentsResponse>
     */
    public CompletableFuture<ListAgentsResponse> listAgentsAsync(ListAgentsRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listAgents);
    }

    /**
     * 获取计算节点列表
     *
     * 功能描述：用户可以使用该接口获取可信节点信息列表。支持节点名称与联盟名称的模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgentsRequest 请求对象
     * @return AsyncInvoker<ListAgentsRequest, ListAgentsResponse>
     */
    public AsyncInvoker<ListAgentsRequest, ListAgentsResponse> listAgentsAsyncInvoker(ListAgentsRequest request) {
        return new AsyncInvoker<ListAgentsRequest, ListAgentsResponse>(request, TicsMeta.listAgents, hcClient);
    }

    /**
     * 查询审计日志
     *
     * 查询审计日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditInfoRequest 请求对象
     * @return CompletableFuture<ListAuditInfoResponse>
     */
    public CompletableFuture<ListAuditInfoResponse> listAuditInfoAsync(ListAuditInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listAuditInfo);
    }

    /**
     * 查询审计日志
     *
     * 查询审计日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditInfoRequest 请求对象
     * @return AsyncInvoker<ListAuditInfoRequest, ListAuditInfoResponse>
     */
    public AsyncInvoker<ListAuditInfoRequest, ListAuditInfoResponse> listAuditInfoAsyncInvoker(
        ListAuditInfoRequest request) {
        return new AsyncInvoker<ListAuditInfoRequest, ListAuditInfoResponse>(request, TicsMeta.listAuditInfo, hcClient);
    }

    /**
     * 查询联邦学习作业列表
     *
     * 查询联邦学习作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlJobRequest 请求对象
     * @return CompletableFuture<ListFlJobResponse>
     */
    public CompletableFuture<ListFlJobResponse> listFlJobAsync(ListFlJobRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listFlJob);
    }

    /**
     * 查询联邦学习作业列表
     *
     * 查询联邦学习作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlJobRequest 请求对象
     * @return AsyncInvoker<ListFlJobRequest, ListFlJobResponse>
     */
    public AsyncInvoker<ListFlJobRequest, ListFlJobResponse> listFlJobAsyncInvoker(ListFlJobRequest request) {
        return new AsyncInvoker<ListFlJobRequest, ListFlJobResponse>(request, TicsMeta.listFlJob, hcClient);
    }

    /**
     * 查询作业的历史实例列表
     *
     * 查询作业的历史实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceHistoryRequest 请求对象
     * @return CompletableFuture<ListInstanceHistoryResponse>
     */
    public CompletableFuture<ListInstanceHistoryResponse> listInstanceHistoryAsync(ListInstanceHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listInstanceHistory);
    }

    /**
     * 查询作业的历史实例列表
     *
     * 查询作业的历史实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceHistoryRequest 请求对象
     * @return AsyncInvoker<ListInstanceHistoryRequest, ListInstanceHistoryResponse>
     */
    public AsyncInvoker<ListInstanceHistoryRequest, ListInstanceHistoryResponse> listInstanceHistoryAsyncInvoker(
        ListInstanceHistoryRequest request) {
        return new AsyncInvoker<ListInstanceHistoryRequest, ListInstanceHistoryResponse>(request,
            TicsMeta.listInstanceHistory, hcClient);
    }

    /**
     * 查询联盟已注册数据集列表
     *
     * 功能描述：用户可以使用该接口查询联盟已注册数据集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLeagueDatasetsRequest 请求对象
     * @return CompletableFuture<ListLeagueDatasetsResponse>
     */
    public CompletableFuture<ListLeagueDatasetsResponse> listLeagueDatasetsAsync(ListLeagueDatasetsRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listLeagueDatasets);
    }

    /**
     * 查询联盟已注册数据集列表
     *
     * 功能描述：用户可以使用该接口查询联盟已注册数据集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLeagueDatasetsRequest 请求对象
     * @return AsyncInvoker<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse>
     */
    public AsyncInvoker<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse> listLeagueDatasetsAsyncInvoker(
        ListLeagueDatasetsRequest request) {
        return new AsyncInvoker<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse>(request,
            TicsMeta.listLeagueDatasets, hcClient);
    }

    /**
     * 获取联盟列表
     *
     * 功能描述：用户可以使用该接口获取联盟列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLeaguesRequest 请求对象
     * @return CompletableFuture<ListLeaguesResponse>
     */
    public CompletableFuture<ListLeaguesResponse> listLeaguesAsync(ListLeaguesRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listLeagues);
    }

    /**
     * 获取联盟列表
     *
     * 功能描述：用户可以使用该接口获取联盟列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLeaguesRequest 请求对象
     * @return AsyncInvoker<ListLeaguesRequest, ListLeaguesResponse>
     */
    public AsyncInvoker<ListLeaguesRequest, ListLeaguesResponse> listLeaguesAsyncInvoker(ListLeaguesRequest request) {
        return new AsyncInvoker<ListLeaguesRequest, ListLeaguesResponse>(request, TicsMeta.listLeagues, hcClient);
    }

    /**
     * 查询联盟节点列表
     *
     * 功能描述：用户可以使用该接口查询联盟可信节点（包含聚合节点和计算节点）列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodesRequest 请求对象
     * @return CompletableFuture<ListNodesResponse>
     */
    public CompletableFuture<ListNodesResponse> listNodesAsync(ListNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listNodes);
    }

    /**
     * 查询联盟节点列表
     *
     * 功能描述：用户可以使用该接口查询联盟可信节点（包含聚合节点和计算节点）列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodesRequest 请求对象
     * @return AsyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public AsyncInvoker<ListNodesRequest, ListNodesResponse> listNodesAsyncInvoker(ListNodesRequest request) {
        return new AsyncInvoker<ListNodesRequest, ListNodesResponse>(request, TicsMeta.listNodes, hcClient);
    }

    /**
     * 查询通知管理列表
     *
     * 功能描述：用户可以使用该接口查询通知管理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNoticesRequest 请求对象
     * @return CompletableFuture<ListNoticesResponse>
     */
    public CompletableFuture<ListNoticesResponse> listNoticesAsync(ListNoticesRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listNotices);
    }

    /**
     * 查询通知管理列表
     *
     * 功能描述：用户可以使用该接口查询通知管理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNoticesRequest 请求对象
     * @return AsyncInvoker<ListNoticesRequest, ListNoticesResponse>
     */
    public AsyncInvoker<ListNoticesRequest, ListNoticesResponse> listNoticesAsyncInvoker(ListNoticesRequest request) {
        return new AsyncInvoker<ListNoticesRequest, ListNoticesResponse>(request, TicsMeta.listNotices, hcClient);
    }

    /**
     * 获取联盟组员信息
     *
     * 功能描述：用户可以使用该接口获取联盟组员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnersRequest 请求对象
     * @return CompletableFuture<ListPartnersResponse>
     */
    public CompletableFuture<ListPartnersResponse> listPartnersAsync(ListPartnersRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listPartners);
    }

    /**
     * 获取联盟组员信息
     *
     * 功能描述：用户可以使用该接口获取联盟组员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartnersRequest 请求对象
     * @return AsyncInvoker<ListPartnersRequest, ListPartnersResponse>
     */
    public AsyncInvoker<ListPartnersRequest, ListPartnersResponse> listPartnersAsyncInvoker(
        ListPartnersRequest request) {
        return new AsyncInvoker<ListPartnersRequest, ListPartnersResponse>(request, TicsMeta.listPartners, hcClient);
    }

    /**
     * 查询联邦分析作业列表
     *
     * 查询联邦分析作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlJobRequest 请求对象
     * @return CompletableFuture<ListSqlJobResponse>
     */
    public CompletableFuture<ListSqlJobResponse> listSqlJobAsync(ListSqlJobRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.listSqlJob);
    }

    /**
     * 查询联邦分析作业列表
     *
     * 查询联邦分析作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlJobRequest 请求对象
     * @return AsyncInvoker<ListSqlJobRequest, ListSqlJobResponse>
     */
    public AsyncInvoker<ListSqlJobRequest, ListSqlJobResponse> listSqlJobAsyncInvoker(ListSqlJobRequest request) {
        return new AsyncInvoker<ListSqlJobRequest, ListSqlJobResponse>(request, TicsMeta.listSqlJob, hcClient);
    }

    /**
     * 获取计算节点详情信息
     *
     * 功能描述：用户可以使用该接口获取单个可信计算节点详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgentDetailRequest 请求对象
     * @return CompletableFuture<ShowAgentDetailResponse>
     */
    public CompletableFuture<ShowAgentDetailResponse> showAgentDetailAsync(ShowAgentDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.showAgentDetail);
    }

    /**
     * 获取计算节点详情信息
     *
     * 功能描述：用户可以使用该接口获取单个可信计算节点详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgentDetailRequest 请求对象
     * @return AsyncInvoker<ShowAgentDetailRequest, ShowAgentDetailResponse>
     */
    public AsyncInvoker<ShowAgentDetailRequest, ShowAgentDetailResponse> showAgentDetailAsyncInvoker(
        ShowAgentDetailRequest request) {
        return new AsyncInvoker<ShowAgentDetailRequest, ShowAgentDetailResponse>(request, TicsMeta.showAgentDetail,
            hcClient);
    }

    /**
     * 数据集统计
     *
     * 用户可以使用该接口进行联盟数据集统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasetStatisticsRequest 请求对象
     * @return CompletableFuture<ShowDatasetStatisticsResponse>
     */
    public CompletableFuture<ShowDatasetStatisticsResponse> showDatasetStatisticsAsync(
        ShowDatasetStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.showDatasetStatistics);
    }

    /**
     * 数据集统计
     *
     * 用户可以使用该接口进行联盟数据集统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasetStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse>
     */
    public AsyncInvoker<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse> showDatasetStatisticsAsyncInvoker(
        ShowDatasetStatisticsRequest request) {
        return new AsyncInvoker<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse>(request,
            TicsMeta.showDatasetStatistics, hcClient);
    }

    /**
     * 查询实例执行报告
     *
     * 查询实例执行报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceReportRequest 请求对象
     * @return CompletableFuture<ShowInstanceReportResponse>
     */
    public CompletableFuture<ShowInstanceReportResponse> showInstanceReportAsync(ShowInstanceReportRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.showInstanceReport);
    }

    /**
     * 查询实例执行报告
     *
     * 查询实例执行报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceReportRequest 请求对象
     * @return AsyncInvoker<ShowInstanceReportRequest, ShowInstanceReportResponse>
     */
    public AsyncInvoker<ShowInstanceReportRequest, ShowInstanceReportResponse> showInstanceReportAsyncInvoker(
        ShowInstanceReportRequest request) {
        return new AsyncInvoker<ShowInstanceReportRequest, ShowInstanceReportResponse>(request,
            TicsMeta.showInstanceReport, hcClient);
    }

    /**
     * 获取实例执行图
     *
     * 获取实例执行图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobInstanceDagRequest 请求对象
     * @return CompletableFuture<ShowJobInstanceDagResponse>
     */
    public CompletableFuture<ShowJobInstanceDagResponse> showJobInstanceDagAsync(ShowJobInstanceDagRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.showJobInstanceDag);
    }

    /**
     * 获取实例执行图
     *
     * 获取实例执行图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobInstanceDagRequest 请求对象
     * @return AsyncInvoker<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse>
     */
    public AsyncInvoker<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse> showJobInstanceDagAsyncInvoker(
        ShowJobInstanceDagRequest request) {
        return new AsyncInvoker<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse>(request,
            TicsMeta.showJobInstanceDag, hcClient);
    }

    /**
     * 作业统计
     *
     * 功能描述：用户可以使用该接口进行联盟作业统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatisticsRequest 请求对象
     * @return CompletableFuture<ShowJobStatisticsResponse>
     */
    public CompletableFuture<ShowJobStatisticsResponse> showJobStatisticsAsync(ShowJobStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.showJobStatistics);
    }

    /**
     * 作业统计
     *
     * 功能描述：用户可以使用该接口进行联盟作业统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowJobStatisticsRequest, ShowJobStatisticsResponse>
     */
    public AsyncInvoker<ShowJobStatisticsRequest, ShowJobStatisticsResponse> showJobStatisticsAsyncInvoker(
        ShowJobStatisticsRequest request) {
        return new AsyncInvoker<ShowJobStatisticsRequest, ShowJobStatisticsResponse>(request,
            TicsMeta.showJobStatistics, hcClient);
    }

    /**
     * 获取联盟详细信息
     *
     * 功能描述：用户可以使用该接口获取联盟详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLeagueRequest 请求对象
     * @return CompletableFuture<ShowLeagueResponse>
     */
    public CompletableFuture<ShowLeagueResponse> showLeagueAsync(ShowLeagueRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.showLeague);
    }

    /**
     * 获取联盟详细信息
     *
     * 功能描述：用户可以使用该接口获取联盟详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLeagueRequest 请求对象
     * @return AsyncInvoker<ShowLeagueRequest, ShowLeagueResponse>
     */
    public AsyncInvoker<ShowLeagueRequest, ShowLeagueResponse> showLeagueAsyncInvoker(ShowLeagueRequest request) {
        return new AsyncInvoker<ShowLeagueRequest, ShowLeagueResponse>(request, TicsMeta.showLeague, hcClient);
    }

    /**
     * 查询租户下统计信息
     *
     * 查询当前租户的联盟及代理统计数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOverviewRequest 请求对象
     * @return CompletableFuture<ShowOverviewResponse>
     */
    public CompletableFuture<ShowOverviewResponse> showOverviewAsync(ShowOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.showOverview);
    }

    /**
     * 查询租户下统计信息
     *
     * 查询当前租户的联盟及代理统计数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOverviewRequest 请求对象
     * @return AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse>
     */
    public AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewAsyncInvoker(
        ShowOverviewRequest request) {
        return new AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse>(request, TicsMeta.showOverview, hcClient);
    }

    /**
     * 合作方统计
     *
     * 功能描述：用户可以使用该接口进行联盟合作方统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartnerStatisticsRequest 请求对象
     * @return CompletableFuture<ShowPartnerStatisticsResponse>
     */
    public CompletableFuture<ShowPartnerStatisticsResponse> showPartnerStatisticsAsync(
        ShowPartnerStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.showPartnerStatistics);
    }

    /**
     * 合作方统计
     *
     * 功能描述：用户可以使用该接口进行联盟合作方统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartnerStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowPartnerStatisticsRequest, ShowPartnerStatisticsResponse>
     */
    public AsyncInvoker<ShowPartnerStatisticsRequest, ShowPartnerStatisticsResponse> showPartnerStatisticsAsyncInvoker(
        ShowPartnerStatisticsRequest request) {
        return new AsyncInvoker<ShowPartnerStatisticsRequest, ShowPartnerStatisticsResponse>(request,
            TicsMeta.showPartnerStatistics, hcClient);
    }

    /**
     * 更新联盟信息
     *
     * 功能描述：用户可以使用接口更新联盟信息（包含联盟描述，联盟版本，隐私保护等级，查分隐私开关）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLeagueRequest 请求对象
     * @return CompletableFuture<UpdateLeagueResponse>
     */
    public CompletableFuture<UpdateLeagueResponse> updateLeagueAsync(UpdateLeagueRequest request) {
        return hcClient.asyncInvokeHttp(request, TicsMeta.updateLeague);
    }

    /**
     * 更新联盟信息
     *
     * 功能描述：用户可以使用接口更新联盟信息（包含联盟描述，联盟版本，隐私保护等级，查分隐私开关）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLeagueRequest 请求对象
     * @return AsyncInvoker<UpdateLeagueRequest, UpdateLeagueResponse>
     */
    public AsyncInvoker<UpdateLeagueRequest, UpdateLeagueResponse> updateLeagueAsyncInvoker(
        UpdateLeagueRequest request) {
        return new AsyncInvoker<UpdateLeagueRequest, UpdateLeagueResponse>(request, TicsMeta.updateLeague, hcClient);
    }

}

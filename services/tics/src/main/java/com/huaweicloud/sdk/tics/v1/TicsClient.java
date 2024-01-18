package com.huaweicloud.sdk.tics.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class TicsClient {

    protected HcClient hcClient;

    public TicsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TicsClient> newBuilder() {
        ClientBuilder<TicsClient> clientBuilder = new ClientBuilder<>(TicsClient::new);
        return clientBuilder;
    }

    /**
     * 获取计算节点列表
     *
     * 功能描述：用户可以使用该接口获取可信节点信息列表。支持节点名称与联盟名称的模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentsRequest 请求对象
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgents(ListAgentsRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listAgents);
    }

    /**
     * 获取计算节点列表
     *
     * 功能描述：用户可以使用该接口获取可信节点信息列表。支持节点名称与联盟名称的模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentsRequest 请求对象
     * @return SyncInvoker<ListAgentsRequest, ListAgentsResponse>
     */
    public SyncInvoker<ListAgentsRequest, ListAgentsResponse> listAgentsInvoker(ListAgentsRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listAgents, hcClient);
    }

    /**
     * 查询审计日志
     *
     * 查询审计日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInfoRequest 请求对象
     * @return ListAuditInfoResponse
     */
    public ListAuditInfoResponse listAuditInfo(ListAuditInfoRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listAuditInfo);
    }

    /**
     * 查询审计日志
     *
     * 查询审计日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInfoRequest 请求对象
     * @return SyncInvoker<ListAuditInfoRequest, ListAuditInfoResponse>
     */
    public SyncInvoker<ListAuditInfoRequest, ListAuditInfoResponse> listAuditInfoInvoker(ListAuditInfoRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listAuditInfo, hcClient);
    }

    /**
     * 查询联邦学习作业列表
     *
     * 查询联邦学习作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlJobRequest 请求对象
     * @return ListFlJobResponse
     */
    public ListFlJobResponse listFlJob(ListFlJobRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listFlJob);
    }

    /**
     * 查询联邦学习作业列表
     *
     * 查询联邦学习作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlJobRequest 请求对象
     * @return SyncInvoker<ListFlJobRequest, ListFlJobResponse>
     */
    public SyncInvoker<ListFlJobRequest, ListFlJobResponse> listFlJobInvoker(ListFlJobRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listFlJob, hcClient);
    }

    /**
     * 查询作业的历史实例列表
     *
     * 查询作业的历史实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceHistoryRequest 请求对象
     * @return ListInstanceHistoryResponse
     */
    public ListInstanceHistoryResponse listInstanceHistory(ListInstanceHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listInstanceHistory);
    }

    /**
     * 查询作业的历史实例列表
     *
     * 查询作业的历史实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceHistoryRequest 请求对象
     * @return SyncInvoker<ListInstanceHistoryRequest, ListInstanceHistoryResponse>
     */
    public SyncInvoker<ListInstanceHistoryRequest, ListInstanceHistoryResponse> listInstanceHistoryInvoker(
        ListInstanceHistoryRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listInstanceHistory, hcClient);
    }

    /**
     * 查询联盟已注册数据集列表
     *
     * 功能描述：用户可以使用该接口查询联盟已注册数据集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLeagueDatasetsRequest 请求对象
     * @return ListLeagueDatasetsResponse
     */
    public ListLeagueDatasetsResponse listLeagueDatasets(ListLeagueDatasetsRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listLeagueDatasets);
    }

    /**
     * 查询联盟已注册数据集列表
     *
     * 功能描述：用户可以使用该接口查询联盟已注册数据集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLeagueDatasetsRequest 请求对象
     * @return SyncInvoker<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse>
     */
    public SyncInvoker<ListLeagueDatasetsRequest, ListLeagueDatasetsResponse> listLeagueDatasetsInvoker(
        ListLeagueDatasetsRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listLeagueDatasets, hcClient);
    }

    /**
     * 获取联盟列表
     *
     * 功能描述：用户可以使用该接口获取联盟列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLeaguesRequest 请求对象
     * @return ListLeaguesResponse
     */
    public ListLeaguesResponse listLeagues(ListLeaguesRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listLeagues);
    }

    /**
     * 获取联盟列表
     *
     * 功能描述：用户可以使用该接口获取联盟列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLeaguesRequest 请求对象
     * @return SyncInvoker<ListLeaguesRequest, ListLeaguesResponse>
     */
    public SyncInvoker<ListLeaguesRequest, ListLeaguesResponse> listLeaguesInvoker(ListLeaguesRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listLeagues, hcClient);
    }

    /**
     * 查询联盟节点列表
     *
     * 功能描述：用户可以使用该接口查询联盟可信节点（包含聚合节点和计算节点）列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listNodes);
    }

    /**
     * 查询联盟节点列表
     *
     * 功能描述：用户可以使用该接口查询联盟可信节点（包含聚合节点和计算节点）列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return SyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listNodes, hcClient);
    }

    /**
     * 查询通知管理列表
     *
     * 功能描述：用户可以使用该接口查询通知管理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticesRequest 请求对象
     * @return ListNoticesResponse
     */
    public ListNoticesResponse listNotices(ListNoticesRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listNotices);
    }

    /**
     * 查询通知管理列表
     *
     * 功能描述：用户可以使用该接口查询通知管理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticesRequest 请求对象
     * @return SyncInvoker<ListNoticesRequest, ListNoticesResponse>
     */
    public SyncInvoker<ListNoticesRequest, ListNoticesResponse> listNoticesInvoker(ListNoticesRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listNotices, hcClient);
    }

    /**
     * 获取联盟组员信息
     *
     * 功能描述：用户可以使用该接口获取联盟组员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPartnersRequest 请求对象
     * @return ListPartnersResponse
     */
    public ListPartnersResponse listPartners(ListPartnersRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listPartners);
    }

    /**
     * 获取联盟组员信息
     *
     * 功能描述：用户可以使用该接口获取联盟组员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPartnersRequest 请求对象
     * @return SyncInvoker<ListPartnersRequest, ListPartnersResponse>
     */
    public SyncInvoker<ListPartnersRequest, ListPartnersResponse> listPartnersInvoker(ListPartnersRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listPartners, hcClient);
    }

    /**
     * 查询联邦分析作业列表
     *
     * 查询联邦分析作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlJobRequest 请求对象
     * @return ListSqlJobResponse
     */
    public ListSqlJobResponse listSqlJob(ListSqlJobRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.listSqlJob);
    }

    /**
     * 查询联邦分析作业列表
     *
     * 查询联邦分析作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlJobRequest 请求对象
     * @return SyncInvoker<ListSqlJobRequest, ListSqlJobResponse>
     */
    public SyncInvoker<ListSqlJobRequest, ListSqlJobResponse> listSqlJobInvoker(ListSqlJobRequest request) {
        return new SyncInvoker<>(request, TicsMeta.listSqlJob, hcClient);
    }

    /**
     * 获取计算节点详情信息
     *
     * 功能描述：用户可以使用该接口获取单个可信计算节点详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDetailRequest 请求对象
     * @return ShowAgentDetailResponse
     */
    public ShowAgentDetailResponse showAgentDetail(ShowAgentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.showAgentDetail);
    }

    /**
     * 获取计算节点详情信息
     *
     * 功能描述：用户可以使用该接口获取单个可信计算节点详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDetailRequest 请求对象
     * @return SyncInvoker<ShowAgentDetailRequest, ShowAgentDetailResponse>
     */
    public SyncInvoker<ShowAgentDetailRequest, ShowAgentDetailResponse> showAgentDetailInvoker(
        ShowAgentDetailRequest request) {
        return new SyncInvoker<>(request, TicsMeta.showAgentDetail, hcClient);
    }

    /**
     * 数据集统计
     *
     * 用户可以使用该接口进行联盟数据集统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatasetStatisticsRequest 请求对象
     * @return ShowDatasetStatisticsResponse
     */
    public ShowDatasetStatisticsResponse showDatasetStatistics(ShowDatasetStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.showDatasetStatistics);
    }

    /**
     * 数据集统计
     *
     * 用户可以使用该接口进行联盟数据集统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatasetStatisticsRequest 请求对象
     * @return SyncInvoker<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse>
     */
    public SyncInvoker<ShowDatasetStatisticsRequest, ShowDatasetStatisticsResponse> showDatasetStatisticsInvoker(
        ShowDatasetStatisticsRequest request) {
        return new SyncInvoker<>(request, TicsMeta.showDatasetStatistics, hcClient);
    }

    /**
     * 查询实例执行报告
     *
     * 查询实例执行报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceReportRequest 请求对象
     * @return ShowInstanceReportResponse
     */
    public ShowInstanceReportResponse showInstanceReport(ShowInstanceReportRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.showInstanceReport);
    }

    /**
     * 查询实例执行报告
     *
     * 查询实例执行报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceReportRequest 请求对象
     * @return SyncInvoker<ShowInstanceReportRequest, ShowInstanceReportResponse>
     */
    public SyncInvoker<ShowInstanceReportRequest, ShowInstanceReportResponse> showInstanceReportInvoker(
        ShowInstanceReportRequest request) {
        return new SyncInvoker<>(request, TicsMeta.showInstanceReport, hcClient);
    }

    /**
     * 获取实例执行图
     *
     * 获取实例执行图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInstanceDagRequest 请求对象
     * @return ShowJobInstanceDagResponse
     */
    public ShowJobInstanceDagResponse showJobInstanceDag(ShowJobInstanceDagRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.showJobInstanceDag);
    }

    /**
     * 获取实例执行图
     *
     * 获取实例执行图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInstanceDagRequest 请求对象
     * @return SyncInvoker<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse>
     */
    public SyncInvoker<ShowJobInstanceDagRequest, ShowJobInstanceDagResponse> showJobInstanceDagInvoker(
        ShowJobInstanceDagRequest request) {
        return new SyncInvoker<>(request, TicsMeta.showJobInstanceDag, hcClient);
    }

    /**
     * 作业统计
     *
     * 功能描述：用户可以使用该接口进行联盟作业统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatisticsRequest 请求对象
     * @return ShowJobStatisticsResponse
     */
    public ShowJobStatisticsResponse showJobStatistics(ShowJobStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.showJobStatistics);
    }

    /**
     * 作业统计
     *
     * 功能描述：用户可以使用该接口进行联盟作业统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatisticsRequest 请求对象
     * @return SyncInvoker<ShowJobStatisticsRequest, ShowJobStatisticsResponse>
     */
    public SyncInvoker<ShowJobStatisticsRequest, ShowJobStatisticsResponse> showJobStatisticsInvoker(
        ShowJobStatisticsRequest request) {
        return new SyncInvoker<>(request, TicsMeta.showJobStatistics, hcClient);
    }

    /**
     * 获取联盟详细信息
     *
     * 功能描述：用户可以使用该接口获取联盟详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLeagueRequest 请求对象
     * @return ShowLeagueResponse
     */
    public ShowLeagueResponse showLeague(ShowLeagueRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.showLeague);
    }

    /**
     * 获取联盟详细信息
     *
     * 功能描述：用户可以使用该接口获取联盟详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLeagueRequest 请求对象
     * @return SyncInvoker<ShowLeagueRequest, ShowLeagueResponse>
     */
    public SyncInvoker<ShowLeagueRequest, ShowLeagueResponse> showLeagueInvoker(ShowLeagueRequest request) {
        return new SyncInvoker<>(request, TicsMeta.showLeague, hcClient);
    }

    /**
     * 查询租户下统计信息
     *
     * 查询当前租户的联盟及代理统计数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOverviewRequest 请求对象
     * @return ShowOverviewResponse
     */
    public ShowOverviewResponse showOverview(ShowOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.showOverview);
    }

    /**
     * 查询租户下统计信息
     *
     * 查询当前租户的联盟及代理统计数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOverviewRequest 请求对象
     * @return SyncInvoker<ShowOverviewRequest, ShowOverviewResponse>
     */
    public SyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewInvoker(ShowOverviewRequest request) {
        return new SyncInvoker<>(request, TicsMeta.showOverview, hcClient);
    }

    /**
     * 合作方统计
     *
     * 功能描述：用户可以使用该接口进行联盟合作方统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnerStatisticsRequest 请求对象
     * @return ShowPartnerStatisticsResponse
     */
    public ShowPartnerStatisticsResponse showPartnerStatistics(ShowPartnerStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.showPartnerStatistics);
    }

    /**
     * 合作方统计
     *
     * 功能描述：用户可以使用该接口进行联盟合作方统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnerStatisticsRequest 请求对象
     * @return SyncInvoker<ShowPartnerStatisticsRequest, ShowPartnerStatisticsResponse>
     */
    public SyncInvoker<ShowPartnerStatisticsRequest, ShowPartnerStatisticsResponse> showPartnerStatisticsInvoker(
        ShowPartnerStatisticsRequest request) {
        return new SyncInvoker<>(request, TicsMeta.showPartnerStatistics, hcClient);
    }

    /**
     * 更新联盟信息
     *
     * 功能描述：用户可以使用接口更新联盟信息（包含联盟描述，联盟版本，隐私保护等级，查分隐私开关）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLeagueRequest 请求对象
     * @return UpdateLeagueResponse
     */
    public UpdateLeagueResponse updateLeague(UpdateLeagueRequest request) {
        return hcClient.syncInvokeHttp(request, TicsMeta.updateLeague);
    }

    /**
     * 更新联盟信息
     *
     * 功能描述：用户可以使用接口更新联盟信息（包含联盟描述，联盟版本，隐私保护等级，查分隐私开关）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLeagueRequest 请求对象
     * @return SyncInvoker<UpdateLeagueRequest, UpdateLeagueResponse>
     */
    public SyncInvoker<UpdateLeagueRequest, UpdateLeagueResponse> updateLeagueInvoker(UpdateLeagueRequest request) {
        return new SyncInvoker<>(request, TicsMeta.updateLeague, hcClient);
    }

}

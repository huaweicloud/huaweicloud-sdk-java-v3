package com.huaweicloud.sdk.tics.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.tics.v1.model.*;

public class TicsClient {

    protected HcClient hcClient;

    public TicsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TicsClient> newBuilder() {
        return new ClientBuilder<>(TicsClient::new);
    }

    /**
     * 获取计算节点列表
     *
     * 功能描述：用户可以使用该接口获取可信节点信息列表。支持节点名称与联盟名称的模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgentsRequest 请求对象
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
     * @param ListAgentsRequest 请求对象
     * @return SyncInvoker<ListAgentsRequest, ListAgentsResponse>
     */
    public SyncInvoker<ListAgentsRequest, ListAgentsResponse> listAgentsInvoker(ListAgentsRequest request) {
        return new SyncInvoker<ListAgentsRequest, ListAgentsResponse>(request, TicsMeta.listAgents, hcClient);
    }

    /**
     * 获取联盟列表
     *
     * 功能描述：用户可以使用该接口获取联盟列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLeaguesRequest 请求对象
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
     * @param ListLeaguesRequest 请求对象
     * @return SyncInvoker<ListLeaguesRequest, ListLeaguesResponse>
     */
    public SyncInvoker<ListLeaguesRequest, ListLeaguesResponse> listLeaguesInvoker(ListLeaguesRequest request) {
        return new SyncInvoker<ListLeaguesRequest, ListLeaguesResponse>(request, TicsMeta.listLeagues, hcClient);
    }

    /**
     * 查询通知管理列表
     *
     * 功能描述：用户可以使用该接口查询通知管理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNoticesRequest 请求对象
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
     * @param ListNoticesRequest 请求对象
     * @return SyncInvoker<ListNoticesRequest, ListNoticesResponse>
     */
    public SyncInvoker<ListNoticesRequest, ListNoticesResponse> listNoticesInvoker(ListNoticesRequest request) {
        return new SyncInvoker<ListNoticesRequest, ListNoticesResponse>(request, TicsMeta.listNotices, hcClient);
    }

    /**
     * 查询租户下统计信息
     *
     * 查询当前租户的联盟及代理统计数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOverviewRequest 请求对象
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
     * @param ShowOverviewRequest 请求对象
     * @return SyncInvoker<ShowOverviewRequest, ShowOverviewResponse>
     */
    public SyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewInvoker(ShowOverviewRequest request) {
        return new SyncInvoker<ShowOverviewRequest, ShowOverviewResponse>(request, TicsMeta.showOverview, hcClient);
    }

}

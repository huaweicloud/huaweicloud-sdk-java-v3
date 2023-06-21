package com.huaweicloud.sdk.tics.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.tics.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class TicsAsyncClient {

    protected HcClient hcClient;

    public TicsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TicsAsyncClient> newBuilder() {
        return new ClientBuilder<>(TicsAsyncClient::new);
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

}

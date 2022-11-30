package com.huaweicloud.sdk.ies.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ies.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class IesAsyncClient {

    protected HcClient hcClient;

    public IesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IesAsyncClient> newBuilder() {
        return new ClientBuilder<>(IesAsyncClient::new, "GlobalCredentials");
    }

    /**
     * 创建边缘小站
     *
     * 创建边缘小站。
     * - 一个边缘小站关联一个华为云指定的区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeSiteRequest 请求对象
     * @return CompletableFuture<CreateEdgeSiteResponse>
     */
    public CompletableFuture<CreateEdgeSiteResponse> createEdgeSiteAsync(CreateEdgeSiteRequest request) {
        return hcClient.asyncInvokeHttp(request, IesMeta.createEdgeSite);
    }

    /**
     * 创建边缘小站
     *
     * 创建边缘小站。
     * - 一个边缘小站关联一个华为云指定的区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeSiteRequest 请求对象
     * @return AsyncInvoker<CreateEdgeSiteRequest, CreateEdgeSiteResponse>
     */
    public AsyncInvoker<CreateEdgeSiteRequest, CreateEdgeSiteResponse> createEdgeSiteAsyncInvoker(
        CreateEdgeSiteRequest request) {
        return new AsyncInvoker<CreateEdgeSiteRequest, CreateEdgeSiteResponse>(request, IesMeta.createEdgeSite,
            hcClient);
    }

    /**
     * 删除边缘小站
     *
     * 删除指定的边缘小站。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeSiteRequest 请求对象
     * @return CompletableFuture<DeleteEdgeSiteResponse>
     */
    public CompletableFuture<DeleteEdgeSiteResponse> deleteEdgeSiteAsync(DeleteEdgeSiteRequest request) {
        return hcClient.asyncInvokeHttp(request, IesMeta.deleteEdgeSite);
    }

    /**
     * 删除边缘小站
     *
     * 删除指定的边缘小站。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeSiteRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse>
     */
    public AsyncInvoker<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse> deleteEdgeSiteAsyncInvoker(
        DeleteEdgeSiteRequest request) {
        return new AsyncInvoker<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse>(request, IesMeta.deleteEdgeSite,
            hcClient);
    }

    /**
     * 查询边缘小站列表
     *
     * 查询边缘小站列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSitesRequest 请求对象
     * @return CompletableFuture<ListEdgeSitesResponse>
     */
    public CompletableFuture<ListEdgeSitesResponse> listEdgeSitesAsync(ListEdgeSitesRequest request) {
        return hcClient.asyncInvokeHttp(request, IesMeta.listEdgeSites);
    }

    /**
     * 查询边缘小站列表
     *
     * 查询边缘小站列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSitesRequest 请求对象
     * @return AsyncInvoker<ListEdgeSitesRequest, ListEdgeSitesResponse>
     */
    public AsyncInvoker<ListEdgeSitesRequest, ListEdgeSitesResponse> listEdgeSitesAsyncInvoker(
        ListEdgeSitesRequest request) {
        return new AsyncInvoker<ListEdgeSitesRequest, ListEdgeSitesResponse>(request, IesMeta.listEdgeSites, hcClient);
    }

    /**
     * 查询边缘小站详情
     *
     * 查询边缘小站详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeSiteRequest 请求对象
     * @return CompletableFuture<ShowEdgeSiteResponse>
     */
    public CompletableFuture<ShowEdgeSiteResponse> showEdgeSiteAsync(ShowEdgeSiteRequest request) {
        return hcClient.asyncInvokeHttp(request, IesMeta.showEdgeSite);
    }

    /**
     * 查询边缘小站详情
     *
     * 查询边缘小站详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeSiteRequest 请求对象
     * @return AsyncInvoker<ShowEdgeSiteRequest, ShowEdgeSiteResponse>
     */
    public AsyncInvoker<ShowEdgeSiteRequest, ShowEdgeSiteResponse> showEdgeSiteAsyncInvoker(
        ShowEdgeSiteRequest request) {
        return new AsyncInvoker<ShowEdgeSiteRequest, ShowEdgeSiteResponse>(request, IesMeta.showEdgeSite, hcClient);
    }

    /**
     * 更新边缘小站
     *
     * 更新边缘小站。
     * - 允许更新边缘小站描述或场地信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeSiteRequest 请求对象
     * @return CompletableFuture<UpdateEdgeSiteResponse>
     */
    public CompletableFuture<UpdateEdgeSiteResponse> updateEdgeSiteAsync(UpdateEdgeSiteRequest request) {
        return hcClient.asyncInvokeHttp(request, IesMeta.updateEdgeSite);
    }

    /**
     * 更新边缘小站
     *
     * 更新边缘小站。
     * - 允许更新边缘小站描述或场地信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeSiteRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse>
     */
    public AsyncInvoker<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse> updateEdgeSiteAsyncInvoker(
        UpdateEdgeSiteRequest request) {
        return new AsyncInvoker<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse>(request, IesMeta.updateEdgeSite,
            hcClient);
    }

    /**
     * 查看站点容量信息
     *
     * 查看站点容量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSiteMetricsRequest 请求对象
     * @return CompletableFuture<ListEdgeSiteMetricsResponse>
     */
    public CompletableFuture<ListEdgeSiteMetricsResponse> listEdgeSiteMetricsAsync(ListEdgeSiteMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, IesMeta.listEdgeSiteMetrics);
    }

    /**
     * 查看站点容量信息
     *
     * 查看站点容量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSiteMetricsRequest 请求对象
     * @return AsyncInvoker<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse>
     */
    public AsyncInvoker<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse> listEdgeSiteMetricsAsyncInvoker(
        ListEdgeSiteMetricsRequest request) {
        return new AsyncInvoker<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse>(request,
            IesMeta.listEdgeSiteMetrics, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询租户资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, IesMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询租户资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, IesMeta.listQuotas, hcClient);
    }

    /**
     * 查询支持的区域列表
     *
     * 查询支持智能边缘小站接入的华为云区域（region）列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSupportedRegionsRequest 请求对象
     * @return CompletableFuture<ListSupportedRegionsResponse>
     */
    public CompletableFuture<ListSupportedRegionsResponse> listSupportedRegionsAsync(
        ListSupportedRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IesMeta.listSupportedRegions);
    }

    /**
     * 查询支持的区域列表
     *
     * 查询支持智能边缘小站接入的华为云区域（region）列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSupportedRegionsRequest 请求对象
     * @return AsyncInvoker<ListSupportedRegionsRequest, ListSupportedRegionsResponse>
     */
    public AsyncInvoker<ListSupportedRegionsRequest, ListSupportedRegionsResponse> listSupportedRegionsAsyncInvoker(
        ListSupportedRegionsRequest request) {
        return new AsyncInvoker<ListSupportedRegionsRequest, ListSupportedRegionsResponse>(request,
            IesMeta.listSupportedRegions, hcClient);
    }

}

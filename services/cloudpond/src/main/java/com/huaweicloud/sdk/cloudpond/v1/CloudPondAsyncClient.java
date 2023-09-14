package com.huaweicloud.sdk.cloudpond.v1;

import com.huaweicloud.sdk.cloudpond.v1.model.CreateEdgeSiteRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.CreateEdgeSiteResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.DeleteEdgeSiteRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.DeleteEdgeSiteResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListEdgeSiteMetricsRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListEdgeSiteMetricsResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListEdgeSitesRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListEdgeSitesResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListRacksRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListRacksResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListStoragePoolsRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListStoragePoolsResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ListSupportedRegionsRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ListSupportedRegionsResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowEdgeSiteRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowEdgeSiteResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowRackRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowRackResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowStoragePoolRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.ShowStoragePoolResponse;
import com.huaweicloud.sdk.cloudpond.v1.model.UpdateEdgeSiteRequest;
import com.huaweicloud.sdk.cloudpond.v1.model.UpdateEdgeSiteResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudPondAsyncClient {

    protected HcClient hcClient;

    public CloudPondAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudPondAsyncClient> newBuilder() {
        ClientBuilder<CloudPondAsyncClient> clientBuilder =
            new ClientBuilder<>(CloudPondAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
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
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.createEdgeSite);
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
        return new AsyncInvoker<CreateEdgeSiteRequest, CreateEdgeSiteResponse>(request, CloudPondMeta.createEdgeSite,
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
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.deleteEdgeSite);
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
        return new AsyncInvoker<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse>(request, CloudPondMeta.deleteEdgeSite,
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
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listEdgeSites);
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
        return new AsyncInvoker<ListEdgeSitesRequest, ListEdgeSitesResponse>(request, CloudPondMeta.listEdgeSites,
            hcClient);
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
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.showEdgeSite);
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
        return new AsyncInvoker<ShowEdgeSiteRequest, ShowEdgeSiteResponse>(request, CloudPondMeta.showEdgeSite,
            hcClient);
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
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.updateEdgeSite);
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
        return new AsyncInvoker<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse>(request, CloudPondMeta.updateEdgeSite,
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
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listEdgeSiteMetrics);
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
            CloudPondMeta.listEdgeSiteMetrics, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listQuotas);
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
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, CloudPondMeta.listQuotas, hcClient);
    }

    /**
     * 查询机柜列表
     *
     * 查询机柜列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRacksRequest 请求对象
     * @return CompletableFuture<ListRacksResponse>
     */
    public CompletableFuture<ListRacksResponse> listRacksAsync(ListRacksRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listRacks);
    }

    /**
     * 查询机柜列表
     *
     * 查询机柜列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRacksRequest 请求对象
     * @return AsyncInvoker<ListRacksRequest, ListRacksResponse>
     */
    public AsyncInvoker<ListRacksRequest, ListRacksResponse> listRacksAsyncInvoker(ListRacksRequest request) {
        return new AsyncInvoker<ListRacksRequest, ListRacksResponse>(request, CloudPondMeta.listRacks, hcClient);
    }

    /**
     * 查询机柜详情
     *
     * 查询机柜详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRackRequest 请求对象
     * @return CompletableFuture<ShowRackResponse>
     */
    public CompletableFuture<ShowRackResponse> showRackAsync(ShowRackRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.showRack);
    }

    /**
     * 查询机柜详情
     *
     * 查询机柜详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRackRequest 请求对象
     * @return AsyncInvoker<ShowRackRequest, ShowRackResponse>
     */
    public AsyncInvoker<ShowRackRequest, ShowRackResponse> showRackAsyncInvoker(ShowRackRequest request) {
        return new AsyncInvoker<ShowRackRequest, ShowRackResponse>(request, CloudPondMeta.showRack, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listSupportedRegions);
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
            CloudPondMeta.listSupportedRegions, hcClient);
    }

    /**
     * 查询存储池列表
     *
     * 查询存储池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoragePoolsRequest 请求对象
     * @return CompletableFuture<ListStoragePoolsResponse>
     */
    public CompletableFuture<ListStoragePoolsResponse> listStoragePoolsAsync(ListStoragePoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listStoragePools);
    }

    /**
     * 查询存储池列表
     *
     * 查询存储池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoragePoolsRequest 请求对象
     * @return AsyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse>
     */
    public AsyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse> listStoragePoolsAsyncInvoker(
        ListStoragePoolsRequest request) {
        return new AsyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse>(request,
            CloudPondMeta.listStoragePools, hcClient);
    }

    /**
     * 查询存储池详情
     *
     * 查询存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStoragePoolRequest 请求对象
     * @return CompletableFuture<ShowStoragePoolResponse>
     */
    public CompletableFuture<ShowStoragePoolResponse> showStoragePoolAsync(ShowStoragePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.showStoragePool);
    }

    /**
     * 查询存储池详情
     *
     * 查询存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStoragePoolRequest 请求对象
     * @return AsyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse>
     */
    public AsyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse> showStoragePoolAsyncInvoker(
        ShowStoragePoolRequest request) {
        return new AsyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse>(request, CloudPondMeta.showStoragePool,
            hcClient);
    }

}

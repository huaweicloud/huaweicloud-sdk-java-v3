package com.huaweicloud.sdk.ies.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ies.v1.model.*;

public class IesClient {

    protected HcClient hcClient;

    public IesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IesClient> newBuilder() {
        return new ClientBuilder<>(IesClient::new, "GlobalCredentials");
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
     * @return CreateEdgeSiteResponse
     */
    public CreateEdgeSiteResponse createEdgeSite(CreateEdgeSiteRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.createEdgeSite);
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
     * @return SyncInvoker<CreateEdgeSiteRequest, CreateEdgeSiteResponse>
     */
    public SyncInvoker<CreateEdgeSiteRequest, CreateEdgeSiteResponse> createEdgeSiteInvoker(
        CreateEdgeSiteRequest request) {
        return new SyncInvoker<CreateEdgeSiteRequest, CreateEdgeSiteResponse>(request, IesMeta.createEdgeSite,
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
     * @return DeleteEdgeSiteResponse
     */
    public DeleteEdgeSiteResponse deleteEdgeSite(DeleteEdgeSiteRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.deleteEdgeSite);
    }

    /**
     * 删除边缘小站
     *
     * 删除指定的边缘小站。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeSiteRequest 请求对象
     * @return SyncInvoker<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse>
     */
    public SyncInvoker<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse> deleteEdgeSiteInvoker(
        DeleteEdgeSiteRequest request) {
        return new SyncInvoker<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse>(request, IesMeta.deleteEdgeSite,
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
     * @return ListEdgeSitesResponse
     */
    public ListEdgeSitesResponse listEdgeSites(ListEdgeSitesRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.listEdgeSites);
    }

    /**
     * 查询边缘小站列表
     *
     * 查询边缘小站列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSitesRequest 请求对象
     * @return SyncInvoker<ListEdgeSitesRequest, ListEdgeSitesResponse>
     */
    public SyncInvoker<ListEdgeSitesRequest, ListEdgeSitesResponse> listEdgeSitesInvoker(ListEdgeSitesRequest request) {
        return new SyncInvoker<ListEdgeSitesRequest, ListEdgeSitesResponse>(request, IesMeta.listEdgeSites, hcClient);
    }

    /**
     * 查询边缘小站详情
     *
     * 查询边缘小站详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeSiteRequest 请求对象
     * @return ShowEdgeSiteResponse
     */
    public ShowEdgeSiteResponse showEdgeSite(ShowEdgeSiteRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.showEdgeSite);
    }

    /**
     * 查询边缘小站详情
     *
     * 查询边缘小站详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeSiteRequest 请求对象
     * @return SyncInvoker<ShowEdgeSiteRequest, ShowEdgeSiteResponse>
     */
    public SyncInvoker<ShowEdgeSiteRequest, ShowEdgeSiteResponse> showEdgeSiteInvoker(ShowEdgeSiteRequest request) {
        return new SyncInvoker<ShowEdgeSiteRequest, ShowEdgeSiteResponse>(request, IesMeta.showEdgeSite, hcClient);
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
     * @return UpdateEdgeSiteResponse
     */
    public UpdateEdgeSiteResponse updateEdgeSite(UpdateEdgeSiteRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.updateEdgeSite);
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
     * @return SyncInvoker<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse>
     */
    public SyncInvoker<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse> updateEdgeSiteInvoker(
        UpdateEdgeSiteRequest request) {
        return new SyncInvoker<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse>(request, IesMeta.updateEdgeSite,
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
     * @return ListEdgeSiteMetricsResponse
     */
    public ListEdgeSiteMetricsResponse listEdgeSiteMetrics(ListEdgeSiteMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.listEdgeSiteMetrics);
    }

    /**
     * 查看站点容量信息
     *
     * 查看站点容量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSiteMetricsRequest 请求对象
     * @return SyncInvoker<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse>
     */
    public SyncInvoker<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse> listEdgeSiteMetricsInvoker(
        ListEdgeSiteMetricsRequest request) {
        return new SyncInvoker<ListEdgeSiteMetricsRequest, ListEdgeSiteMetricsResponse>(request,
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
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询租户资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, IesMeta.listQuotas, hcClient);
    }

    /**
     * 查询机柜列表
     *
     * 查询机柜列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRacksRequest 请求对象
     * @return ListRacksResponse
     */
    public ListRacksResponse listRacks(ListRacksRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.listRacks);
    }

    /**
     * 查询机柜列表
     *
     * 查询机柜列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRacksRequest 请求对象
     * @return SyncInvoker<ListRacksRequest, ListRacksResponse>
     */
    public SyncInvoker<ListRacksRequest, ListRacksResponse> listRacksInvoker(ListRacksRequest request) {
        return new SyncInvoker<ListRacksRequest, ListRacksResponse>(request, IesMeta.listRacks, hcClient);
    }

    /**
     * 查询机柜详情
     *
     * 查询机柜详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRackRequest 请求对象
     * @return ShowRackResponse
     */
    public ShowRackResponse showRack(ShowRackRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.showRack);
    }

    /**
     * 查询机柜详情
     *
     * 查询机柜详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRackRequest 请求对象
     * @return SyncInvoker<ShowRackRequest, ShowRackResponse>
     */
    public SyncInvoker<ShowRackRequest, ShowRackResponse> showRackInvoker(ShowRackRequest request) {
        return new SyncInvoker<ShowRackRequest, ShowRackResponse>(request, IesMeta.showRack, hcClient);
    }

    /**
     * 查询支持的区域列表
     *
     * 查询支持智能边缘小站接入的华为云区域（region）列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSupportedRegionsRequest 请求对象
     * @return ListSupportedRegionsResponse
     */
    public ListSupportedRegionsResponse listSupportedRegions(ListSupportedRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.listSupportedRegions);
    }

    /**
     * 查询支持的区域列表
     *
     * 查询支持智能边缘小站接入的华为云区域（region）列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSupportedRegionsRequest 请求对象
     * @return SyncInvoker<ListSupportedRegionsRequest, ListSupportedRegionsResponse>
     */
    public SyncInvoker<ListSupportedRegionsRequest, ListSupportedRegionsResponse> listSupportedRegionsInvoker(
        ListSupportedRegionsRequest request) {
        return new SyncInvoker<ListSupportedRegionsRequest, ListSupportedRegionsResponse>(request,
            IesMeta.listSupportedRegions, hcClient);
    }

    /**
     * 查询存储池列表
     *
     * 查询存储池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoragePoolsRequest 请求对象
     * @return ListStoragePoolsResponse
     */
    public ListStoragePoolsResponse listStoragePools(ListStoragePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.listStoragePools);
    }

    /**
     * 查询存储池列表
     *
     * 查询存储池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoragePoolsRequest 请求对象
     * @return SyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse>
     */
    public SyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse> listStoragePoolsInvoker(
        ListStoragePoolsRequest request) {
        return new SyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse>(request, IesMeta.listStoragePools,
            hcClient);
    }

    /**
     * 查询存储池详情
     *
     * 查询存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStoragePoolRequest 请求对象
     * @return ShowStoragePoolResponse
     */
    public ShowStoragePoolResponse showStoragePool(ShowStoragePoolRequest request) {
        return hcClient.syncInvokeHttp(request, IesMeta.showStoragePool);
    }

    /**
     * 查询存储池详情
     *
     * 查询存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStoragePoolRequest 请求对象
     * @return SyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse>
     */
    public SyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse> showStoragePoolInvoker(
        ShowStoragePoolRequest request) {
        return new SyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse>(request, IesMeta.showStoragePool,
            hcClient);
    }

}

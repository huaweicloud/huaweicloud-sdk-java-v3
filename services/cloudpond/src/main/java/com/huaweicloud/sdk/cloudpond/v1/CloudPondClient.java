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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudPondClient {

    protected HcClient hcClient;

    public CloudPondClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudPondClient> newBuilder() {
        ClientBuilder<CloudPondClient> clientBuilder = new ClientBuilder<>(CloudPondClient::new, "GlobalCredentials");
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
     * @return CreateEdgeSiteResponse
     */
    public CreateEdgeSiteResponse createEdgeSite(CreateEdgeSiteRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.createEdgeSite);
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
        return new SyncInvoker<CreateEdgeSiteRequest, CreateEdgeSiteResponse>(request, CloudPondMeta.createEdgeSite,
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
        return hcClient.syncInvokeHttp(request, CloudPondMeta.deleteEdgeSite);
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
        return new SyncInvoker<DeleteEdgeSiteRequest, DeleteEdgeSiteResponse>(request, CloudPondMeta.deleteEdgeSite,
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
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listEdgeSites);
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
        return new SyncInvoker<ListEdgeSitesRequest, ListEdgeSitesResponse>(request, CloudPondMeta.listEdgeSites,
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
     * @return ShowEdgeSiteResponse
     */
    public ShowEdgeSiteResponse showEdgeSite(ShowEdgeSiteRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.showEdgeSite);
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
        return new SyncInvoker<ShowEdgeSiteRequest, ShowEdgeSiteResponse>(request, CloudPondMeta.showEdgeSite,
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
     * @return UpdateEdgeSiteResponse
     */
    public UpdateEdgeSiteResponse updateEdgeSite(UpdateEdgeSiteRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.updateEdgeSite);
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
        return new SyncInvoker<UpdateEdgeSiteRequest, UpdateEdgeSiteResponse>(request, CloudPondMeta.updateEdgeSite,
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
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listEdgeSiteMetrics);
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
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listQuotas);
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
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, CloudPondMeta.listQuotas, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listRacks);
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
        return new SyncInvoker<ListRacksRequest, ListRacksResponse>(request, CloudPondMeta.listRacks, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPondMeta.showRack);
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
        return new SyncInvoker<ShowRackRequest, ShowRackResponse>(request, CloudPondMeta.showRack, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listSupportedRegions);
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
     * @return ListStoragePoolsResponse
     */
    public ListStoragePoolsResponse listStoragePools(ListStoragePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listStoragePools);
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
        return new SyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse>(request,
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
     * @return ShowStoragePoolResponse
     */
    public ShowStoragePoolResponse showStoragePool(ShowStoragePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.showStoragePool);
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
        return new SyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse>(request, CloudPondMeta.showStoragePool,
            hcClient);
    }

}

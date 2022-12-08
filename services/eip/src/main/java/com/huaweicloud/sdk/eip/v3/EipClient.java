package com.huaweicloud.sdk.eip.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eip.v3.model.*;

public class EipClient {

    protected HcClient hcClient;

    public EipClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipClient> newBuilder() {
        return new ClientBuilder<>(EipClient::new);
    }

    /**
     * 查询公共池列表
     *
     * 查询公共池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommonPoolsRequest 请求对象
     * @return ListCommonPoolsResponse
     */
    public ListCommonPoolsResponse listCommonPools(ListCommonPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listCommonPools);
    }

    /**
     * 查询公共池列表
     *
     * 查询公共池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommonPoolsRequest 请求对象
     * @return SyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse>
     */
    public SyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse> listCommonPoolsInvoker(
        ListCommonPoolsRequest request) {
        return new SyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse>(request, EipMeta.listCommonPools,
            hcClient);
    }

    /**
     * 查询公共池分组列表
     *
     * 查询公共池分组列表，包含名称和位置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicBorderGroupsRequest 请求对象
     * @return ListPublicBorderGroupsResponse
     */
    public ListPublicBorderGroupsResponse listPublicBorderGroups(ListPublicBorderGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicBorderGroups);
    }

    /**
     * 查询公共池分组列表
     *
     * 查询公共池分组列表，包含名称和位置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicBorderGroupsRequest 请求对象
     * @return SyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse>
     */
    public SyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse> listPublicBorderGroupsInvoker(
        ListPublicBorderGroupsRequest request) {
        return new SyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse>(request,
            EipMeta.listPublicBorderGroups, hcClient);
    }

    /**
     * 查询公网IP池列表
     *
     * 全量查询公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipPoolRequest 请求对象
     * @return ListPublicipPoolResponse
     */
    public ListPublicipPoolResponse listPublicipPool(ListPublicipPoolRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicipPool);
    }

    /**
     * 查询公网IP池列表
     *
     * 全量查询公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipPoolRequest 请求对象
     * @return SyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse>
     */
    public SyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse> listPublicipPoolInvoker(
        ListPublicipPoolRequest request) {
        return new SyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse>(request, EipMeta.listPublicipPool,
            hcClient);
    }

    /**
     * 查询指定租户下的共享带宽类型列表
     *
     * 查询指定租户下的共享带宽类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareBandwidthTypesRequest 请求对象
     * @return ListShareBandwidthTypesResponse
     */
    public ListShareBandwidthTypesResponse listShareBandwidthTypes(ListShareBandwidthTypesRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listShareBandwidthTypes);
    }

    /**
     * 查询指定租户下的共享带宽类型列表
     *
     * 查询指定租户下的共享带宽类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareBandwidthTypesRequest 请求对象
     * @return SyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse>
     */
    public SyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> listShareBandwidthTypesInvoker(
        ListShareBandwidthTypesRequest request) {
        return new SyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse>(request,
            EipMeta.listShareBandwidthTypes, hcClient);
    }

    /**
     * 查询公网IP池详情
     *
     * 查询公网IP池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipPoolRequest 请求对象
     * @return ShowPublicipPoolResponse
     */
    public ShowPublicipPoolResponse showPublicipPool(ShowPublicipPoolRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicipPool);
    }

    /**
     * 查询公网IP池详情
     *
     * 查询公网IP池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipPoolRequest 请求对象
     * @return SyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse>
     */
    public SyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse> showPublicipPoolInvoker(
        ShowPublicipPoolRequest request) {
        return new SyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse>(request, EipMeta.showPublicipPool,
            hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePublicipsRequest 请求对象
     * @return AssociatePublicipsResponse
     */
    public AssociatePublicipsResponse associatePublicips(AssociatePublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.associatePublicips);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePublicipsRequest 请求对象
     * @return SyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse>
     */
    public SyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse> associatePublicipsInvoker(
        AssociatePublicipsRequest request) {
        return new SyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse>(request,
            EipMeta.associatePublicips, hcClient);
    }

    /**
     * 查询弹性公网IP可用数
     *
     * IP池用于查询公网可用ip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountEipAvailableResourcesRequest 请求对象
     * @return CountEipAvailableResourcesResponse
     */
    public CountEipAvailableResourcesResponse countEipAvailableResources(CountEipAvailableResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.countEipAvailableResources);
    }

    /**
     * 查询弹性公网IP可用数
     *
     * IP池用于查询公网可用ip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountEipAvailableResourcesRequest 请求对象
     * @return SyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse>
     */
    public SyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse> countEipAvailableResourcesInvoker(
        CountEipAvailableResourcesRequest request) {
        return new SyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse>(request,
            EipMeta.countEipAvailableResources, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociatePublicipsRequest 请求对象
     * @return DisassociatePublicipsResponse
     */
    public DisassociatePublicipsResponse disassociatePublicips(DisassociatePublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.disassociatePublicips);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociatePublicipsRequest 请求对象
     * @return SyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse>
     */
    public SyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse> disassociatePublicipsInvoker(
        DisassociatePublicipsRequest request) {
        return new SyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse>(request,
            EipMeta.disassociatePublicips, hcClient);
    }

    /**
     * 全量查询弹性公网IP列表
     *
     * 查询弹性公网IP列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipsRequest 请求对象
     * @return ListPublicipsResponse
     */
    public ListPublicipsResponse listPublicips(ListPublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicips);
    }

    /**
     * 全量查询弹性公网IP列表
     *
     * 查询弹性公网IP列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipsRequest 请求对象
     * @return SyncInvoker<ListPublicipsRequest, ListPublicipsResponse>
     */
    public SyncInvoker<ListPublicipsRequest, ListPublicipsResponse> listPublicipsInvoker(ListPublicipsRequest request) {
        return new SyncInvoker<ListPublicipsRequest, ListPublicipsResponse>(request, EipMeta.listPublicips, hcClient);
    }

    /**
     * 查询弹性公网IP详情
     *
     * 查询弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipRequest 请求对象
     * @return ShowPublicipResponse
     */
    public ShowPublicipResponse showPublicip(ShowPublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicip);
    }

    /**
     * 查询弹性公网IP详情
     *
     * 查询弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipRequest 请求对象
     * @return SyncInvoker<ShowPublicipRequest, ShowPublicipResponse>
     */
    public SyncInvoker<ShowPublicipRequest, ShowPublicipResponse> showPublicipInvoker(ShowPublicipRequest request) {
        return new SyncInvoker<ShowPublicipRequest, ShowPublicipResponse>(request, EipMeta.showPublicip, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssociatePublicipRequest 请求对象
     * @return UpdateAssociatePublicipResponse
     */
    public UpdateAssociatePublicipResponse updateAssociatePublicip(UpdateAssociatePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updateAssociatePublicip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssociatePublicipRequest 请求对象
     * @return SyncInvoker<UpdateAssociatePublicipRequest, UpdateAssociatePublicipResponse>
     */
    public SyncInvoker<UpdateAssociatePublicipRequest, UpdateAssociatePublicipResponse> updateAssociatePublicipInvoker(
        UpdateAssociatePublicipRequest request) {
        return new SyncInvoker<UpdateAssociatePublicipRequest, UpdateAssociatePublicipResponse>(request,
            EipMeta.updateAssociatePublicip, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDisassociatePublicipRequest 请求对象
     * @return UpdateDisassociatePublicipResponse
     */
    public UpdateDisassociatePublicipResponse updateDisassociatePublicip(UpdateDisassociatePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updateDisassociatePublicip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDisassociatePublicipRequest 请求对象
     * @return SyncInvoker<UpdateDisassociatePublicipRequest, UpdateDisassociatePublicipResponse>
     */
    public SyncInvoker<UpdateDisassociatePublicipRequest, UpdateDisassociatePublicipResponse> updateDisassociatePublicipInvoker(
        UpdateDisassociatePublicipRequest request) {
        return new SyncInvoker<UpdateDisassociatePublicipRequest, UpdateDisassociatePublicipResponse>(request,
            EipMeta.updateDisassociatePublicip, hcClient);
    }

}

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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询指定租户下的共享带宽类型列表
     *
     * 查询指定租户下的共享带宽类型列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询公网IP池列表
     *
     * 全量查询公网IP池列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 全量查询弹性公网IP列表
     *
     * 查询弹性公网IP列表信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicipRequest 请求对象
     * @return SyncInvoker<ShowPublicipRequest, ShowPublicipResponse>
     */
    public SyncInvoker<ShowPublicipRequest, ShowPublicipResponse> showPublicipInvoker(ShowPublicipRequest request) {
        return new SyncInvoker<ShowPublicipRequest, ShowPublicipResponse>(request, EipMeta.showPublicip, hcClient);
    }

    /**
     * 查询公网IP池详情
     *
     * 查询公网IP池详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicipPoolRequest 请求对象
     * @return SyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse>
     */
    public SyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse> showPublicipPoolInvoker(
        ShowPublicipPoolRequest request) {
        return new SyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse>(request, EipMeta.showPublicipPool,
            hcClient);
    }

}

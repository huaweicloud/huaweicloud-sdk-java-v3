package com.huaweicloud.sdk.eip.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eip.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class EipAsyncClient {

    protected HcClient hcClient;

    public EipAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipAsyncClient> newBuilder() {
        return new ClientBuilder<>(EipAsyncClient::new);
    }

    /**
     * 查询公共池列表
     *
     * 查询公共池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommonPoolsRequest 请求对象
     * @return CompletableFuture<ListCommonPoolsResponse>
     */
    public CompletableFuture<ListCommonPoolsResponse> listCommonPoolsAsync(ListCommonPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listCommonPools);
    }

    /**
     * 查询公共池列表
     *
     * 查询公共池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommonPoolsRequest 请求对象
     * @return AsyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse>
     */
    public AsyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse> listCommonPoolsAsyncInvoker(
        ListCommonPoolsRequest request) {
        return new AsyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse>(request, EipMeta.listCommonPools,
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
     * @return CompletableFuture<ListPublicBorderGroupsResponse>
     */
    public CompletableFuture<ListPublicBorderGroupsResponse> listPublicBorderGroupsAsync(
        ListPublicBorderGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicBorderGroups);
    }

    /**
     * 查询公共池分组列表
     *
     * 查询公共池分组列表，包含名称和位置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicBorderGroupsRequest 请求对象
     * @return AsyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse>
     */
    public AsyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse> listPublicBorderGroupsAsyncInvoker(
        ListPublicBorderGroupsRequest request) {
        return new AsyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse>(request,
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
     * @return CompletableFuture<ListPublicipPoolResponse>
     */
    public CompletableFuture<ListPublicipPoolResponse> listPublicipPoolAsync(ListPublicipPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicipPool);
    }

    /**
     * 查询公网IP池列表
     *
     * 全量查询公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipPoolRequest 请求对象
     * @return AsyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse>
     */
    public AsyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse> listPublicipPoolAsyncInvoker(
        ListPublicipPoolRequest request) {
        return new AsyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse>(request, EipMeta.listPublicipPool,
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
     * @return CompletableFuture<ListShareBandwidthTypesResponse>
     */
    public CompletableFuture<ListShareBandwidthTypesResponse> listShareBandwidthTypesAsync(
        ListShareBandwidthTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listShareBandwidthTypes);
    }

    /**
     * 查询指定租户下的共享带宽类型列表
     *
     * 查询指定租户下的共享带宽类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareBandwidthTypesRequest 请求对象
     * @return AsyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse>
     */
    public AsyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> listShareBandwidthTypesAsyncInvoker(
        ListShareBandwidthTypesRequest request) {
        return new AsyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse>(request,
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
     * @return CompletableFuture<ShowPublicipPoolResponse>
     */
    public CompletableFuture<ShowPublicipPoolResponse> showPublicipPoolAsync(ShowPublicipPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicipPool);
    }

    /**
     * 查询公网IP池详情
     *
     * 查询公网IP池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipPoolRequest 请求对象
     * @return AsyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse>
     */
    public AsyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse> showPublicipPoolAsyncInvoker(
        ShowPublicipPoolRequest request) {
        return new AsyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse>(request, EipMeta.showPublicipPool,
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
     * @return CompletableFuture<AssociatePublicipsResponse>
     */
    public CompletableFuture<AssociatePublicipsResponse> associatePublicipsAsync(AssociatePublicipsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.associatePublicips);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePublicipsRequest 请求对象
     * @return AsyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse>
     */
    public AsyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse> associatePublicipsAsyncInvoker(
        AssociatePublicipsRequest request) {
        return new AsyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse>(request,
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
     * @return CompletableFuture<CountEipAvailableResourcesResponse>
     */
    public CompletableFuture<CountEipAvailableResourcesResponse> countEipAvailableResourcesAsync(
        CountEipAvailableResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.countEipAvailableResources);
    }

    /**
     * 查询弹性公网IP可用数
     *
     * IP池用于查询公网可用ip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountEipAvailableResourcesRequest 请求对象
     * @return AsyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse>
     */
    public AsyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse> countEipAvailableResourcesAsyncInvoker(
        CountEipAvailableResourcesRequest request) {
        return new AsyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse>(request,
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
     * @return CompletableFuture<DisassociatePublicipsResponse>
     */
    public CompletableFuture<DisassociatePublicipsResponse> disassociatePublicipsAsync(
        DisassociatePublicipsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.disassociatePublicips);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociatePublicipsRequest 请求对象
     * @return AsyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse>
     */
    public AsyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse> disassociatePublicipsAsyncInvoker(
        DisassociatePublicipsRequest request) {
        return new AsyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse>(request,
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
     * @return CompletableFuture<ListPublicipsResponse>
     */
    public CompletableFuture<ListPublicipsResponse> listPublicipsAsync(ListPublicipsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicips);
    }

    /**
     * 全量查询弹性公网IP列表
     *
     * 查询弹性公网IP列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipsRequest 请求对象
     * @return AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse>
     */
    public AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse> listPublicipsAsyncInvoker(
        ListPublicipsRequest request) {
        return new AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse>(request, EipMeta.listPublicips, hcClient);
    }

    /**
     * 查询弹性公网IP详情
     *
     * 查询弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipRequest 请求对象
     * @return CompletableFuture<ShowPublicipResponse>
     */
    public CompletableFuture<ShowPublicipResponse> showPublicipAsync(ShowPublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicip);
    }

    /**
     * 查询弹性公网IP详情
     *
     * 查询弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipRequest 请求对象
     * @return AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse>
     */
    public AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse> showPublicipAsyncInvoker(
        ShowPublicipRequest request) {
        return new AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse>(request, EipMeta.showPublicip, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssociatePublicipRequest 请求对象
     * @return CompletableFuture<UpdateAssociatePublicipResponse>
     */
    public CompletableFuture<UpdateAssociatePublicipResponse> updateAssociatePublicipAsync(
        UpdateAssociatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updateAssociatePublicip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssociatePublicipRequest 请求对象
     * @return AsyncInvoker<UpdateAssociatePublicipRequest, UpdateAssociatePublicipResponse>
     */
    public AsyncInvoker<UpdateAssociatePublicipRequest, UpdateAssociatePublicipResponse> updateAssociatePublicipAsyncInvoker(
        UpdateAssociatePublicipRequest request) {
        return new AsyncInvoker<UpdateAssociatePublicipRequest, UpdateAssociatePublicipResponse>(request,
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
     * @return CompletableFuture<UpdateDisassociatePublicipResponse>
     */
    public CompletableFuture<UpdateDisassociatePublicipResponse> updateDisassociatePublicipAsync(
        UpdateDisassociatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updateDisassociatePublicip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDisassociatePublicipRequest 请求对象
     * @return AsyncInvoker<UpdateDisassociatePublicipRequest, UpdateDisassociatePublicipResponse>
     */
    public AsyncInvoker<UpdateDisassociatePublicipRequest, UpdateDisassociatePublicipResponse> updateDisassociatePublicipAsyncInvoker(
        UpdateDisassociatePublicipRequest request) {
        return new AsyncInvoker<UpdateDisassociatePublicipRequest, UpdateDisassociatePublicipResponse>(request,
            EipMeta.updateDisassociatePublicip, hcClient);
    }

}

package com.huaweicloud.sdk.eip.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eip.v3.model.AssociatePublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.AssociatePublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.AttachBatchPublicIpRequest;
import com.huaweicloud.sdk.eip.v3.model.AttachBatchPublicIpResponse;
import com.huaweicloud.sdk.eip.v3.model.AttachShareBandwidthRequest;
import com.huaweicloud.sdk.eip.v3.model.AttachShareBandwidthResponse;
import com.huaweicloud.sdk.eip.v3.model.CountEipAvailableResourcesRequest;
import com.huaweicloud.sdk.eip.v3.model.CountEipAvailableResourcesResponse;
import com.huaweicloud.sdk.eip.v3.model.DetachBatchPublicIpRequest;
import com.huaweicloud.sdk.eip.v3.model.DetachBatchPublicIpResponse;
import com.huaweicloud.sdk.eip.v3.model.DetachShareBandwidthRequest;
import com.huaweicloud.sdk.eip.v3.model.DetachShareBandwidthResponse;
import com.huaweicloud.sdk.eip.v3.model.DisableNat64Request;
import com.huaweicloud.sdk.eip.v3.model.DisableNat64Response;
import com.huaweicloud.sdk.eip.v3.model.DisassociatePublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.DisassociatePublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.EnableNat64Request;
import com.huaweicloud.sdk.eip.v3.model.EnableNat64Response;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthRequest;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthResponse;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthsLimitRequest;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthsLimitResponse;
import com.huaweicloud.sdk.eip.v3.model.ListCommonPoolsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListCommonPoolsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListEipBandwidthsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListEipBandwidthsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicBorderGroupsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicBorderGroupsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipPoolRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipPoolResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListShareBandwidthTypesRequest;
import com.huaweicloud.sdk.eip.v3.model.ListShareBandwidthTypesResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipResponse;
import com.huaweicloud.sdk.eip.v3.model.UpdateAssociatePublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.UpdateAssociatePublicipResponse;
import com.huaweicloud.sdk.eip.v3.model.UpdateDisassociatePublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.UpdateDisassociatePublicipResponse;
import com.huaweicloud.sdk.eip.v3.model.UpdatePublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.UpdatePublicipResponse;

import java.util.concurrent.CompletableFuture;

public class EipAsyncClient {

    protected HcClient hcClient;

    public EipAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipAsyncClient> newBuilder() {
        ClientBuilder<EipAsyncClient> clientBuilder = new ClientBuilder<>(EipAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthRequest 请求对象
     * @return CompletableFuture<ListBandwidthResponse>
     */
    public CompletableFuture<ListBandwidthResponse> listBandwidthAsync(ListBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listBandwidth);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthRequest 请求对象
     * @return AsyncInvoker<ListBandwidthRequest, ListBandwidthResponse>
     */
    public AsyncInvoker<ListBandwidthRequest, ListBandwidthResponse> listBandwidthAsyncInvoker(
        ListBandwidthRequest request) {
        return new AsyncInvoker<ListBandwidthRequest, ListBandwidthResponse>(request, EipMeta.listBandwidth, hcClient);
    }

    /**
     * 查看租户带宽限制
     *
     * 获取EIP带宽限制列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthsLimitRequest 请求对象
     * @return CompletableFuture<ListBandwidthsLimitResponse>
     */
    public CompletableFuture<ListBandwidthsLimitResponse> listBandwidthsLimitAsync(ListBandwidthsLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listBandwidthsLimit);
    }

    /**
     * 查看租户带宽限制
     *
     * 获取EIP带宽限制列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthsLimitRequest 请求对象
     * @return AsyncInvoker<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse>
     */
    public AsyncInvoker<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse> listBandwidthsLimitAsyncInvoker(
        ListBandwidthsLimitRequest request) {
        return new AsyncInvoker<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse>(request,
            EipMeta.listBandwidthsLimit, hcClient);
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
     * 查询带宽列表
     *
     * 查询带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipBandwidthsRequest 请求对象
     * @return CompletableFuture<ListEipBandwidthsResponse>
     */
    public CompletableFuture<ListEipBandwidthsResponse> listEipBandwidthsAsync(ListEipBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listEipBandwidths);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipBandwidthsRequest 请求对象
     * @return AsyncInvoker<ListEipBandwidthsRequest, ListEipBandwidthsResponse>
     */
    public AsyncInvoker<ListEipBandwidthsRequest, ListEipBandwidthsResponse> listEipBandwidthsAsyncInvoker(
        ListEipBandwidthsRequest request) {
        return new AsyncInvoker<ListEipBandwidthsRequest, ListEipBandwidthsResponse>(request, EipMeta.listEipBandwidths,
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
     * 共享带宽批量加入弹性公网IP
     *
     * 共享带宽批量加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachBatchPublicIpRequest 请求对象
     * @return CompletableFuture<AttachBatchPublicIpResponse>
     */
    public CompletableFuture<AttachBatchPublicIpResponse> attachBatchPublicIpAsync(AttachBatchPublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.attachBatchPublicIp);
    }

    /**
     * 共享带宽批量加入弹性公网IP
     *
     * 共享带宽批量加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachBatchPublicIpRequest 请求对象
     * @return AsyncInvoker<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse>
     */
    public AsyncInvoker<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse> attachBatchPublicIpAsyncInvoker(
        AttachBatchPublicIpRequest request) {
        return new AsyncInvoker<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse>(request,
            EipMeta.attachBatchPublicIp, hcClient);
    }

    /**
     * 共享带宽加入弹性公网IP
     *
     * 共享带宽加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachShareBandwidthRequest 请求对象
     * @return CompletableFuture<AttachShareBandwidthResponse>
     */
    public CompletableFuture<AttachShareBandwidthResponse> attachShareBandwidthAsync(
        AttachShareBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.attachShareBandwidth);
    }

    /**
     * 共享带宽加入弹性公网IP
     *
     * 共享带宽加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachShareBandwidthRequest 请求对象
     * @return AsyncInvoker<AttachShareBandwidthRequest, AttachShareBandwidthResponse>
     */
    public AsyncInvoker<AttachShareBandwidthRequest, AttachShareBandwidthResponse> attachShareBandwidthAsyncInvoker(
        AttachShareBandwidthRequest request) {
        return new AsyncInvoker<AttachShareBandwidthRequest, AttachShareBandwidthResponse>(request,
            EipMeta.attachShareBandwidth, hcClient);
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
     * 共享带宽批量移出弹性公网IP
     *
     * 共享带宽批量移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachBatchPublicIpRequest 请求对象
     * @return CompletableFuture<DetachBatchPublicIpResponse>
     */
    public CompletableFuture<DetachBatchPublicIpResponse> detachBatchPublicIpAsync(DetachBatchPublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.detachBatchPublicIp);
    }

    /**
     * 共享带宽批量移出弹性公网IP
     *
     * 共享带宽批量移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachBatchPublicIpRequest 请求对象
     * @return AsyncInvoker<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse>
     */
    public AsyncInvoker<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse> detachBatchPublicIpAsyncInvoker(
        DetachBatchPublicIpRequest request) {
        return new AsyncInvoker<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse>(request,
            EipMeta.detachBatchPublicIp, hcClient);
    }

    /**
     * 共享带宽移出弹性公网IP
     *
     * 共享带宽移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachShareBandwidthRequest 请求对象
     * @return CompletableFuture<DetachShareBandwidthResponse>
     */
    public CompletableFuture<DetachShareBandwidthResponse> detachShareBandwidthAsync(
        DetachShareBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.detachShareBandwidth);
    }

    /**
     * 共享带宽移出弹性公网IP
     *
     * 共享带宽移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachShareBandwidthRequest 请求对象
     * @return AsyncInvoker<DetachShareBandwidthRequest, DetachShareBandwidthResponse>
     */
    public AsyncInvoker<DetachShareBandwidthRequest, DetachShareBandwidthResponse> detachShareBandwidthAsyncInvoker(
        DetachShareBandwidthRequest request) {
        return new AsyncInvoker<DetachShareBandwidthRequest, DetachShareBandwidthResponse>(request,
            EipMeta.detachShareBandwidth, hcClient);
    }

    /**
     * 弹性公网IP关闭NAT64
     *
     * 弹性公网IP关闭NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableNat64Request 请求对象
     * @return CompletableFuture<DisableNat64Response>
     */
    public CompletableFuture<DisableNat64Response> disableNat64Async(DisableNat64Request request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.disableNat64);
    }

    /**
     * 弹性公网IP关闭NAT64
     *
     * 弹性公网IP关闭NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableNat64Request 请求对象
     * @return AsyncInvoker<DisableNat64Request, DisableNat64Response>
     */
    public AsyncInvoker<DisableNat64Request, DisableNat64Response> disableNat64AsyncInvoker(
        DisableNat64Request request) {
        return new AsyncInvoker<DisableNat64Request, DisableNat64Response>(request, EipMeta.disableNat64, hcClient);
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
     * 弹性公网IP开启NAT64
     *
     * 弹性公网IP开启NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableNat64Request 请求对象
     * @return CompletableFuture<EnableNat64Response>
     */
    public CompletableFuture<EnableNat64Response> enableNat64Async(EnableNat64Request request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.enableNat64);
    }

    /**
     * 弹性公网IP开启NAT64
     *
     * 弹性公网IP开启NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableNat64Request 请求对象
     * @return AsyncInvoker<EnableNat64Request, EnableNat64Response>
     */
    public AsyncInvoker<EnableNat64Request, EnableNat64Response> enableNat64AsyncInvoker(EnableNat64Request request) {
        return new AsyncInvoker<EnableNat64Request, EnableNat64Response>(request, EipMeta.enableNat64, hcClient);
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

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicipRequest 请求对象
     * @return CompletableFuture<UpdatePublicipResponse>
     */
    public CompletableFuture<UpdatePublicipResponse> updatePublicipAsync(UpdatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updatePublicip);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicipRequest 请求对象
     * @return AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse>
     */
    public AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicipAsyncInvoker(
        UpdatePublicipRequest request) {
        return new AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse>(request, EipMeta.updatePublicip,
            hcClient);
    }

}

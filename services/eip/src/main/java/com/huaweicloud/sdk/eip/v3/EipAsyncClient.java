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
import com.huaweicloud.sdk.eip.v3.model.CreateTenantVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.CreateTenantVpcIgwResponse;
import com.huaweicloud.sdk.eip.v3.model.DeleteTenantVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.DeleteTenantVpcIgwResponse;
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
import com.huaweicloud.sdk.eip.v3.model.ListProjectGeipBindingsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListProjectGeipBindingsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicBorderGroupsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicBorderGroupsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipPoolRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipPoolResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListShareBandwidthTypesRequest;
import com.huaweicloud.sdk.eip.v3.model.ListShareBandwidthTypesResponse;
import com.huaweicloud.sdk.eip.v3.model.ListTenantVpcIgwsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListTenantVpcIgwsResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowInternalVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowInternalVpcIgwResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolTypesRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolTypesResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipResponse;
import com.huaweicloud.sdk.eip.v3.model.UpdatePublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.UpdatePublicipResponse;
import com.huaweicloud.sdk.eip.v3.model.UpdateTenantVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.UpdateTenantVpcIgwResponse;

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
     * @param request ListBandwidthRequest 请求对象
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
     * @param request ListBandwidthRequest 请求对象
     * @return AsyncInvoker<ListBandwidthRequest, ListBandwidthResponse>
     */
    public AsyncInvoker<ListBandwidthRequest, ListBandwidthResponse> listBandwidthAsyncInvoker(
        ListBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listBandwidth, hcClient);
    }

    /**
     * 查看租户带宽限制
     *
     * 获取EIP带宽限制列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthsLimitRequest 请求对象
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
     * @param request ListBandwidthsLimitRequest 请求对象
     * @return AsyncInvoker<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse>
     */
    public AsyncInvoker<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse> listBandwidthsLimitAsyncInvoker(
        ListBandwidthsLimitRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listBandwidthsLimit, hcClient);
    }

    /**
     * 查询公共池列表
     *
     * 查询公共池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommonPoolsRequest 请求对象
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
     * @param request ListCommonPoolsRequest 请求对象
     * @return AsyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse>
     */
    public AsyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse> listCommonPoolsAsyncInvoker(
        ListCommonPoolsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listCommonPools, hcClient);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipBandwidthsRequest 请求对象
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
     * @param request ListEipBandwidthsRequest 请求对象
     * @return AsyncInvoker<ListEipBandwidthsRequest, ListEipBandwidthsResponse>
     */
    public AsyncInvoker<ListEipBandwidthsRequest, ListEipBandwidthsResponse> listEipBandwidthsAsyncInvoker(
        ListEipBandwidthsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listEipBandwidths, hcClient);
    }

    /**
     * 查询公共池分组列表
     *
     * 查询公共池分组列表，包含名称和位置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicBorderGroupsRequest 请求对象
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
     * @param request ListPublicBorderGroupsRequest 请求对象
     * @return AsyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse>
     */
    public AsyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse> listPublicBorderGroupsAsyncInvoker(
        ListPublicBorderGroupsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listPublicBorderGroups, hcClient);
    }

    /**
     * 查询公网IP池列表
     *
     * 全量查询公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipPoolRequest 请求对象
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
     * @param request ListPublicipPoolRequest 请求对象
     * @return AsyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse>
     */
    public AsyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse> listPublicipPoolAsyncInvoker(
        ListPublicipPoolRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listPublicipPool, hcClient);
    }

    /**
     * 查询指定租户下的共享带宽类型列表
     *
     * 查询指定租户下的共享带宽类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareBandwidthTypesRequest 请求对象
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
     * @param request ListShareBandwidthTypesRequest 请求对象
     * @return AsyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse>
     */
    public AsyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> listShareBandwidthTypesAsyncInvoker(
        ListShareBandwidthTypesRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listShareBandwidthTypes, hcClient);
    }

    /**
     * 查询公网IP池详情
     *
     * 查询公网IP池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipPoolRequest 请求对象
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
     * @param request ShowPublicipPoolRequest 请求对象
     * @return AsyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse>
     */
    public AsyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse> showPublicipPoolAsyncInvoker(
        ShowPublicipPoolRequest request) {
        return new AsyncInvoker<>(request, EipMeta.showPublicipPool, hcClient);
    }

    /**
     * 查询公网IP池类型
     *
     * 查询公网IP池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipPoolTypesRequest 请求对象
     * @return CompletableFuture<ShowPublicipPoolTypesResponse>
     */
    public CompletableFuture<ShowPublicipPoolTypesResponse> showPublicipPoolTypesAsync(
        ShowPublicipPoolTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicipPoolTypes);
    }

    /**
     * 查询公网IP池类型
     *
     * 查询公网IP池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipPoolTypesRequest 请求对象
     * @return AsyncInvoker<ShowPublicipPoolTypesRequest, ShowPublicipPoolTypesResponse>
     */
    public AsyncInvoker<ShowPublicipPoolTypesRequest, ShowPublicipPoolTypesResponse> showPublicipPoolTypesAsyncInvoker(
        ShowPublicipPoolTypesRequest request) {
        return new AsyncInvoker<>(request, EipMeta.showPublicipPoolTypes, hcClient);
    }

    /**
     * 查询GEIP与实例绑定关系的租户列表
     *
     * 查询GEIP与实例绑定关系的租户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectGeipBindingsRequest 请求对象
     * @return CompletableFuture<ListProjectGeipBindingsResponse>
     */
    public CompletableFuture<ListProjectGeipBindingsResponse> listProjectGeipBindingsAsync(
        ListProjectGeipBindingsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listProjectGeipBindings);
    }

    /**
     * 查询GEIP与实例绑定关系的租户列表
     *
     * 查询GEIP与实例绑定关系的租户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectGeipBindingsRequest 请求对象
     * @return AsyncInvoker<ListProjectGeipBindingsRequest, ListProjectGeipBindingsResponse>
     */
    public AsyncInvoker<ListProjectGeipBindingsRequest, ListProjectGeipBindingsResponse> listProjectGeipBindingsAsyncInvoker(
        ListProjectGeipBindingsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listProjectGeipBindings, hcClient);
    }

    /**
     * 创建虚拟igw
     *
     * 创建虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTenantVpcIgwRequest 请求对象
     * @return CompletableFuture<CreateTenantVpcIgwResponse>
     */
    public CompletableFuture<CreateTenantVpcIgwResponse> createTenantVpcIgwAsync(CreateTenantVpcIgwRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createTenantVpcIgw);
    }

    /**
     * 创建虚拟igw
     *
     * 创建虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTenantVpcIgwRequest 请求对象
     * @return AsyncInvoker<CreateTenantVpcIgwRequest, CreateTenantVpcIgwResponse>
     */
    public AsyncInvoker<CreateTenantVpcIgwRequest, CreateTenantVpcIgwResponse> createTenantVpcIgwAsyncInvoker(
        CreateTenantVpcIgwRequest request) {
        return new AsyncInvoker<>(request, EipMeta.createTenantVpcIgw, hcClient);
    }

    /**
     * 删除虚拟igw
     *
     * 删除虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantVpcIgwRequest 请求对象
     * @return CompletableFuture<DeleteTenantVpcIgwResponse>
     */
    public CompletableFuture<DeleteTenantVpcIgwResponse> deleteTenantVpcIgwAsync(DeleteTenantVpcIgwRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deleteTenantVpcIgw);
    }

    /**
     * 删除虚拟igw
     *
     * 删除虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantVpcIgwRequest 请求对象
     * @return AsyncInvoker<DeleteTenantVpcIgwRequest, DeleteTenantVpcIgwResponse>
     */
    public AsyncInvoker<DeleteTenantVpcIgwRequest, DeleteTenantVpcIgwResponse> deleteTenantVpcIgwAsyncInvoker(
        DeleteTenantVpcIgwRequest request) {
        return new AsyncInvoker<>(request, EipMeta.deleteTenantVpcIgw, hcClient);
    }

    /**
     * 查询指定租户下的虚拟igw列表
     *
     * 查询指定租户下的虚拟igw列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantVpcIgwsRequest 请求对象
     * @return CompletableFuture<ListTenantVpcIgwsResponse>
     */
    public CompletableFuture<ListTenantVpcIgwsResponse> listTenantVpcIgwsAsync(ListTenantVpcIgwsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listTenantVpcIgws);
    }

    /**
     * 查询指定租户下的虚拟igw列表
     *
     * 查询指定租户下的虚拟igw列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantVpcIgwsRequest 请求对象
     * @return AsyncInvoker<ListTenantVpcIgwsRequest, ListTenantVpcIgwsResponse>
     */
    public AsyncInvoker<ListTenantVpcIgwsRequest, ListTenantVpcIgwsResponse> listTenantVpcIgwsAsyncInvoker(
        ListTenantVpcIgwsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listTenantVpcIgws, hcClient);
    }

    /**
     * 查询虚拟igw详情
     *
     * 查询虚拟igw详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternalVpcIgwRequest 请求对象
     * @return CompletableFuture<ShowInternalVpcIgwResponse>
     */
    public CompletableFuture<ShowInternalVpcIgwResponse> showInternalVpcIgwAsync(ShowInternalVpcIgwRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showInternalVpcIgw);
    }

    /**
     * 查询虚拟igw详情
     *
     * 查询虚拟igw详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternalVpcIgwRequest 请求对象
     * @return AsyncInvoker<ShowInternalVpcIgwRequest, ShowInternalVpcIgwResponse>
     */
    public AsyncInvoker<ShowInternalVpcIgwRequest, ShowInternalVpcIgwResponse> showInternalVpcIgwAsyncInvoker(
        ShowInternalVpcIgwRequest request) {
        return new AsyncInvoker<>(request, EipMeta.showInternalVpcIgw, hcClient);
    }

    /**
     * 修改虚拟igw
     *
     * 修改虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantVpcIgwRequest 请求对象
     * @return CompletableFuture<UpdateTenantVpcIgwResponse>
     */
    public CompletableFuture<UpdateTenantVpcIgwResponse> updateTenantVpcIgwAsync(UpdateTenantVpcIgwRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updateTenantVpcIgw);
    }

    /**
     * 修改虚拟igw
     *
     * 修改虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantVpcIgwRequest 请求对象
     * @return AsyncInvoker<UpdateTenantVpcIgwRequest, UpdateTenantVpcIgwResponse>
     */
    public AsyncInvoker<UpdateTenantVpcIgwRequest, UpdateTenantVpcIgwResponse> updateTenantVpcIgwAsyncInvoker(
        UpdateTenantVpcIgwRequest request) {
        return new AsyncInvoker<>(request, EipMeta.updateTenantVpcIgw, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociatePublicipsRequest 请求对象
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
     * @param request AssociatePublicipsRequest 请求对象
     * @return AsyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse>
     */
    public AsyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse> associatePublicipsAsyncInvoker(
        AssociatePublicipsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.associatePublicips, hcClient);
    }

    /**
     * 共享带宽批量加入弹性公网IP
     *
     * 共享带宽批量加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachBatchPublicIpRequest 请求对象
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
     * @param request AttachBatchPublicIpRequest 请求对象
     * @return AsyncInvoker<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse>
     */
    public AsyncInvoker<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse> attachBatchPublicIpAsyncInvoker(
        AttachBatchPublicIpRequest request) {
        return new AsyncInvoker<>(request, EipMeta.attachBatchPublicIp, hcClient);
    }

    /**
     * 共享带宽加入弹性公网IP
     *
     * 共享带宽加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachShareBandwidthRequest 请求对象
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
     * @param request AttachShareBandwidthRequest 请求对象
     * @return AsyncInvoker<AttachShareBandwidthRequest, AttachShareBandwidthResponse>
     */
    public AsyncInvoker<AttachShareBandwidthRequest, AttachShareBandwidthResponse> attachShareBandwidthAsyncInvoker(
        AttachShareBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.attachShareBandwidth, hcClient);
    }

    /**
     * 查询弹性公网IP可用数
     *
     * IP池用于查询公网可用ip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountEipAvailableResourcesRequest 请求对象
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
     * @param request CountEipAvailableResourcesRequest 请求对象
     * @return AsyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse>
     */
    public AsyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse> countEipAvailableResourcesAsyncInvoker(
        CountEipAvailableResourcesRequest request) {
        return new AsyncInvoker<>(request, EipMeta.countEipAvailableResources, hcClient);
    }

    /**
     * 共享带宽批量移出弹性公网IP
     *
     * 共享带宽批量移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachBatchPublicIpRequest 请求对象
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
     * @param request DetachBatchPublicIpRequest 请求对象
     * @return AsyncInvoker<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse>
     */
    public AsyncInvoker<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse> detachBatchPublicIpAsyncInvoker(
        DetachBatchPublicIpRequest request) {
        return new AsyncInvoker<>(request, EipMeta.detachBatchPublicIp, hcClient);
    }

    /**
     * 共享带宽移出弹性公网IP
     *
     * 共享带宽移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachShareBandwidthRequest 请求对象
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
     * @param request DetachShareBandwidthRequest 请求对象
     * @return AsyncInvoker<DetachShareBandwidthRequest, DetachShareBandwidthResponse>
     */
    public AsyncInvoker<DetachShareBandwidthRequest, DetachShareBandwidthResponse> detachShareBandwidthAsyncInvoker(
        DetachShareBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.detachShareBandwidth, hcClient);
    }

    /**
     * 弹性公网IP关闭NAT64
     *
     * 弹性公网IP关闭NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableNat64Request 请求对象
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
     * @param request DisableNat64Request 请求对象
     * @return AsyncInvoker<DisableNat64Request, DisableNat64Response>
     */
    public AsyncInvoker<DisableNat64Request, DisableNat64Response> disableNat64AsyncInvoker(
        DisableNat64Request request) {
        return new AsyncInvoker<>(request, EipMeta.disableNat64, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociatePublicipsRequest 请求对象
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
     * @param request DisassociatePublicipsRequest 请求对象
     * @return AsyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse>
     */
    public AsyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse> disassociatePublicipsAsyncInvoker(
        DisassociatePublicipsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.disassociatePublicips, hcClient);
    }

    /**
     * 弹性公网IP开启NAT64
     *
     * 弹性公网IP开启NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableNat64Request 请求对象
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
     * @param request EnableNat64Request 请求对象
     * @return AsyncInvoker<EnableNat64Request, EnableNat64Response>
     */
    public AsyncInvoker<EnableNat64Request, EnableNat64Response> enableNat64AsyncInvoker(EnableNat64Request request) {
        return new AsyncInvoker<>(request, EipMeta.enableNat64, hcClient);
    }

    /**
     * 全量查询弹性公网IP列表
     *
     * 查询弹性公网IP列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipsRequest 请求对象
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
     * @param request ListPublicipsRequest 请求对象
     * @return AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse>
     */
    public AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse> listPublicipsAsyncInvoker(
        ListPublicipsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listPublicips, hcClient);
    }

    /**
     * 查询弹性公网IP详情
     *
     * 查询弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipRequest 请求对象
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
     * @param request ShowPublicipRequest 请求对象
     * @return AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse>
     */
    public AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse> showPublicipAsyncInvoker(
        ShowPublicipRequest request) {
        return new AsyncInvoker<>(request, EipMeta.showPublicip, hcClient);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicipRequest 请求对象
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
     * @param request UpdatePublicipRequest 请求对象
     * @return AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse>
     */
    public AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicipAsyncInvoker(
        UpdatePublicipRequest request) {
        return new AsyncInvoker<>(request, EipMeta.updatePublicip, hcClient);
    }

}

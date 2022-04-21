package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eip.v2.model.*;

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
     * 共享带宽插入弹性公网IP
     *
     * 共享带宽插入弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddPublicipsIntoSharedBandwidthRequest 请求对象
     * @return CompletableFuture<AddPublicipsIntoSharedBandwidthResponse>
     */
    public CompletableFuture<AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidthAsync(
        AddPublicipsIntoSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.addPublicipsIntoSharedBandwidth);
    }

    /**
     * 共享带宽插入弹性公网IP
     *
     * 共享带宽插入弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddPublicipsIntoSharedBandwidthRequest 请求对象
     * @return AsyncInvoker<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse>
     */
    public AsyncInvoker<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidthAsyncInvoker(
        AddPublicipsIntoSharedBandwidthRequest request) {
        return new AsyncInvoker<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse>(
            request, EipMeta.addPublicipsIntoSharedBandwidth, hcClient);
    }

    /**
     * 批量创建共享带宽
     *
     * 批量创建共享带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateSharedBandwidthsRequest 请求对象
     * @return CompletableFuture<BatchCreateSharedBandwidthsResponse>
     */
    public CompletableFuture<BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidthsAsync(
        BatchCreateSharedBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchCreateSharedBandwidths);
    }

    /**
     * 批量创建共享带宽
     *
     * 批量创建共享带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateSharedBandwidthsRequest 请求对象
     * @return AsyncInvoker<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse>
     */
    public AsyncInvoker<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidthsAsyncInvoker(
        BatchCreateSharedBandwidthsRequest request) {
        return new AsyncInvoker<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse>(request,
            EipMeta.batchCreateSharedBandwidths, hcClient);
    }

    /**
     * 创建共享带宽
     *
     * 创建共享带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSharedBandwidthRequest 请求对象
     * @return CompletableFuture<CreateSharedBandwidthResponse>
     */
    public CompletableFuture<CreateSharedBandwidthResponse> createSharedBandwidthAsync(
        CreateSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createSharedBandwidth);
    }

    /**
     * 创建共享带宽
     *
     * 创建共享带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSharedBandwidthRequest 请求对象
     * @return AsyncInvoker<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse>
     */
    public AsyncInvoker<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> createSharedBandwidthAsyncInvoker(
        CreateSharedBandwidthRequest request) {
        return new AsyncInvoker<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse>(request,
            EipMeta.createSharedBandwidth, hcClient);
    }

    /**
     * 删除共享带宽
     *
     * 删除共享带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSharedBandwidthRequest 请求对象
     * @return CompletableFuture<DeleteSharedBandwidthResponse>
     */
    public CompletableFuture<DeleteSharedBandwidthResponse> deleteSharedBandwidthAsync(
        DeleteSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deleteSharedBandwidth);
    }

    /**
     * 删除共享带宽
     *
     * 删除共享带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSharedBandwidthRequest 请求对象
     * @return AsyncInvoker<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse>
     */
    public AsyncInvoker<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> deleteSharedBandwidthAsyncInvoker(
        DeleteSharedBandwidthRequest request) {
        return new AsyncInvoker<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse>(request,
            EipMeta.deleteSharedBandwidth, hcClient);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBandwidthsRequest 请求对象
     * @return CompletableFuture<ListBandwidthsResponse>
     */
    public CompletableFuture<ListBandwidthsResponse> listBandwidthsAsync(ListBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listBandwidths);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBandwidthsRequest 请求对象
     * @return AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>
     */
    public AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidthsAsyncInvoker(
        ListBandwidthsRequest request) {
        return new AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>(request, EipMeta.listBandwidths,
            hcClient);
    }

    /**
     * 查询配额接口
     *
     * 查询配额
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listQuotas);
    }

    /**
     * 查询配额接口
     *
     * 查询配额
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, EipMeta.listQuotas, hcClient);
    }

    /**
     * 共享带宽移除弹性公网IP
     *
     * 共享带宽移除弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RemovePublicipsFromSharedBandwidthRequest 请求对象
     * @return CompletableFuture<RemovePublicipsFromSharedBandwidthResponse>
     */
    public CompletableFuture<RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidthAsync(
        RemovePublicipsFromSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.removePublicipsFromSharedBandwidth);
    }

    /**
     * 共享带宽移除弹性公网IP
     *
     * 共享带宽移除弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RemovePublicipsFromSharedBandwidthRequest 请求对象
     * @return AsyncInvoker<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse>
     */
    public AsyncInvoker<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidthAsyncInvoker(
        RemovePublicipsFromSharedBandwidthRequest request) {
        return new AsyncInvoker<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse>(
            request, EipMeta.removePublicipsFromSharedBandwidth, hcClient);
    }

    /**
     * 查询带宽
     *
     * 查询带宽
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBandwidthRequest 请求对象
     * @return CompletableFuture<ShowBandwidthResponse>
     */
    public CompletableFuture<ShowBandwidthResponse> showBandwidthAsync(ShowBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showBandwidth);
    }

    /**
     * 查询带宽
     *
     * 查询带宽
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>
     */
    public AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidthAsyncInvoker(
        ShowBandwidthRequest request) {
        return new AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>(request, EipMeta.showBandwidth, hcClient);
    }

    /**
     * 更新带宽
     *
     * 更新带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthResponse>
     */
    public CompletableFuture<UpdateBandwidthResponse> updateBandwidthAsync(UpdateBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updateBandwidth);
    }

    /**
     * 更新带宽
     *
     * 更新带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>
     */
    public AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidthAsyncInvoker(
        UpdateBandwidthRequest request) {
        return new AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>(request, EipMeta.updateBandwidth,
            hcClient);
    }

    /**
     * 更新包周期带宽
     *
     * 更新带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrePaidBandwidthRequest 请求对象
     * @return CompletableFuture<UpdatePrePaidBandwidthResponse>
     */
    public CompletableFuture<UpdatePrePaidBandwidthResponse> updatePrePaidBandwidthAsync(
        UpdatePrePaidBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updatePrePaidBandwidth);
    }

    /**
     * 更新包周期带宽
     *
     * 更新带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrePaidBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse>
     */
    public AsyncInvoker<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> updatePrePaidBandwidthAsyncInvoker(
        UpdatePrePaidBandwidthRequest request) {
        return new AsyncInvoker<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse>(request,
            EipMeta.updatePrePaidBandwidth, hcClient);
    }

    /**
     * 批量创建弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量添加标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreatePublicipTagsRequest 请求对象
     * @return CompletableFuture<BatchCreatePublicipTagsResponse>
     */
    public CompletableFuture<BatchCreatePublicipTagsResponse> batchCreatePublicipTagsAsync(
        BatchCreatePublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchCreatePublicipTags);
    }

    /**
     * 批量创建弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量添加标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreatePublicipTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse>
     */
    public AsyncInvoker<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> batchCreatePublicipTagsAsyncInvoker(
        BatchCreatePublicipTagsRequest request) {
        return new AsyncInvoker<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse>(request,
            EipMeta.batchCreatePublicipTags, hcClient);
    }

    /**
     * 批量删除弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量删除标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeletePublicipTagsRequest 请求对象
     * @return CompletableFuture<BatchDeletePublicipTagsResponse>
     */
    public CompletableFuture<BatchDeletePublicipTagsResponse> batchDeletePublicipTagsAsync(
        BatchDeletePublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchDeletePublicipTags);
    }

    /**
     * 批量删除弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量删除标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeletePublicipTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse>
     */
    public AsyncInvoker<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> batchDeletePublicipTagsAsyncInvoker(
        BatchDeletePublicipTagsRequest request) {
        return new AsyncInvoker<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse>(request,
            EipMeta.batchDeletePublicipTags, hcClient);
    }

    /**
     * 申请包周期弹性公网IP
     *
     * 申请包年包月的弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrePaidPublicipRequest 请求对象
     * @return CompletableFuture<CreatePrePaidPublicipResponse>
     */
    public CompletableFuture<CreatePrePaidPublicipResponse> createPrePaidPublicipAsync(
        CreatePrePaidPublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPrePaidPublicip);
    }

    /**
     * 申请包周期弹性公网IP
     *
     * 申请包年包月的弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrePaidPublicipRequest 请求对象
     * @return AsyncInvoker<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse>
     */
    public AsyncInvoker<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> createPrePaidPublicipAsyncInvoker(
        CreatePrePaidPublicipRequest request) {
        return new AsyncInvoker<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse>(request,
            EipMeta.createPrePaidPublicip, hcClient);
    }

    /**
     * 申请弹性公网IP
     *
     * 申请弹性公网IP，支持IPv4和IPv6。
     *  弹性公网IP（Elastic IP）提供独立的公网IP资源，包括公网IP地址与公网出口带宽服务。可以与弹性云服务器、裸金属服务器、虚拟IP、弹性负载均衡、NAT网关等资源灵活地绑定及解绑。拥有多种灵活的计费方式，可以满足各种业务场景的需要。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePublicipRequest 请求对象
     * @return CompletableFuture<CreatePublicipResponse>
     */
    public CompletableFuture<CreatePublicipResponse> createPublicipAsync(CreatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPublicip);
    }

    /**
     * 申请弹性公网IP
     *
     * 申请弹性公网IP，支持IPv4和IPv6。
     *  弹性公网IP（Elastic IP）提供独立的公网IP资源，包括公网IP地址与公网出口带宽服务。可以与弹性云服务器、裸金属服务器、虚拟IP、弹性负载均衡、NAT网关等资源灵活地绑定及解绑。拥有多种灵活的计费方式，可以满足各种业务场景的需要。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePublicipRequest 请求对象
     * @return AsyncInvoker<CreatePublicipRequest, CreatePublicipResponse>
     */
    public AsyncInvoker<CreatePublicipRequest, CreatePublicipResponse> createPublicipAsyncInvoker(
        CreatePublicipRequest request) {
        return new AsyncInvoker<CreatePublicipRequest, CreatePublicipResponse>(request, EipMeta.createPublicip,
            hcClient);
    }

    /**
     * 创建弹性公网IP资源标签
     *
     * 给指定弹性IP资源实例增加标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePublicipTagRequest 请求对象
     * @return CompletableFuture<CreatePublicipTagResponse>
     */
    public CompletableFuture<CreatePublicipTagResponse> createPublicipTagAsync(CreatePublicipTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPublicipTag);
    }

    /**
     * 创建弹性公网IP资源标签
     *
     * 给指定弹性IP资源实例增加标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePublicipTagRequest 请求对象
     * @return AsyncInvoker<CreatePublicipTagRequest, CreatePublicipTagResponse>
     */
    public AsyncInvoker<CreatePublicipTagRequest, CreatePublicipTagResponse> createPublicipTagAsyncInvoker(
        CreatePublicipTagRequest request) {
        return new AsyncInvoker<CreatePublicipTagRequest, CreatePublicipTagResponse>(request, EipMeta.createPublicipTag,
            hcClient);
    }

    /**
     * 删除弹性公网IP
     *
     * 删除弹性公网IP,绑定状态eip不允许直接删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePublicipRequest 请求对象
     * @return CompletableFuture<DeletePublicipResponse>
     */
    public CompletableFuture<DeletePublicipResponse> deletePublicipAsync(DeletePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deletePublicip);
    }

    /**
     * 删除弹性公网IP
     *
     * 删除弹性公网IP,绑定状态eip不允许直接删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePublicipRequest 请求对象
     * @return AsyncInvoker<DeletePublicipRequest, DeletePublicipResponse>
     */
    public AsyncInvoker<DeletePublicipRequest, DeletePublicipResponse> deletePublicipAsyncInvoker(
        DeletePublicipRequest request) {
        return new AsyncInvoker<DeletePublicipRequest, DeletePublicipResponse>(request, EipMeta.deletePublicip,
            hcClient);
    }

    /**
     * 删除弹性公网IP的标签
     *
     * 删除指定弹性公网IP的标签信息。其中project_id是项目ID，publicip_id 是要操作的弹性公网IP的id。key是要删除标签的键。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePublicipTagRequest 请求对象
     * @return CompletableFuture<DeletePublicipTagResponse>
     */
    public CompletableFuture<DeletePublicipTagResponse> deletePublicipTagAsync(DeletePublicipTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deletePublicipTag);
    }

    /**
     * 删除弹性公网IP的标签
     *
     * 删除指定弹性公网IP的标签信息。其中project_id是项目ID，publicip_id 是要操作的弹性公网IP的id。key是要删除标签的键。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePublicipTagRequest 请求对象
     * @return AsyncInvoker<DeletePublicipTagRequest, DeletePublicipTagResponse>
     */
    public AsyncInvoker<DeletePublicipTagRequest, DeletePublicipTagResponse> deletePublicipTagAsyncInvoker(
        DeletePublicipTagRequest request) {
        return new AsyncInvoker<DeletePublicipTagRequest, DeletePublicipTagResponse>(request, EipMeta.deletePublicipTag,
            hcClient);
    }

    /**
     * 查询租户的弹性公网IP标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublicipTagsRequest 请求对象
     * @return CompletableFuture<ListPublicipTagsResponse>
     */
    public CompletableFuture<ListPublicipTagsResponse> listPublicipTagsAsync(ListPublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicipTags);
    }

    /**
     * 查询租户的弹性公网IP标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublicipTagsRequest 请求对象
     * @return AsyncInvoker<ListPublicipTagsRequest, ListPublicipTagsResponse>
     */
    public AsyncInvoker<ListPublicipTagsRequest, ListPublicipTagsResponse> listPublicipTagsAsyncInvoker(
        ListPublicipTagsRequest request) {
        return new AsyncInvoker<ListPublicipTagsRequest, ListPublicipTagsResponse>(request, EipMeta.listPublicipTags,
            hcClient);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 查询弹性公网IP列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublicipsRequest 请求对象
     * @return CompletableFuture<ListPublicipsResponse>
     */
    public CompletableFuture<ListPublicipsResponse> listPublicipsAsync(ListPublicipsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicips);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 查询弹性公网IP列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublicipsRequest 请求对象
     * @return AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse>
     */
    public AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse> listPublicipsAsyncInvoker(
        ListPublicipsRequest request) {
        return new AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse>(request, EipMeta.listPublicips, hcClient);
    }

    /**
     * 按标签查询弹性公网IP列表
     *
     * 使用标签过滤弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublicipsByTagsRequest 请求对象
     * @return CompletableFuture<ListPublicipsByTagsResponse>
     */
    public CompletableFuture<ListPublicipsByTagsResponse> listPublicipsByTagsAsync(ListPublicipsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicipsByTags);
    }

    /**
     * 按标签查询弹性公网IP列表
     *
     * 使用标签过滤弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublicipsByTagsRequest 请求对象
     * @return AsyncInvoker<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse>
     */
    public AsyncInvoker<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> listPublicipsByTagsAsyncInvoker(
        ListPublicipsByTagsRequest request) {
        return new AsyncInvoker<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse>(request,
            EipMeta.listPublicipsByTags, hcClient);
    }

    /**
     * 查询弹性公网IP
     *
     * 查询指定的弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicipRequest 请求对象
     * @return CompletableFuture<ShowPublicipResponse>
     */
    public CompletableFuture<ShowPublicipResponse> showPublicipAsync(ShowPublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicip);
    }

    /**
     * 查询弹性公网IP
     *
     * 查询指定的弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicipRequest 请求对象
     * @return AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse>
     */
    public AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse> showPublicipAsyncInvoker(
        ShowPublicipRequest request) {
        return new AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse>(request, EipMeta.showPublicip, hcClient);
    }

    /**
     * 查询弹性公网IP的标签
     *
     * 查询指定弹性IP实例的标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicipTagsRequest 请求对象
     * @return CompletableFuture<ShowPublicipTagsResponse>
     */
    public CompletableFuture<ShowPublicipTagsResponse> showPublicipTagsAsync(ShowPublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicipTags);
    }

    /**
     * 查询弹性公网IP的标签
     *
     * 查询指定弹性IP实例的标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicipTagsRequest 请求对象
     * @return AsyncInvoker<ShowPublicipTagsRequest, ShowPublicipTagsResponse>
     */
    public AsyncInvoker<ShowPublicipTagsRequest, ShowPublicipTagsResponse> showPublicipTagsAsyncInvoker(
        ShowPublicipTagsRequest request) {
        return new AsyncInvoker<ShowPublicipTagsRequest, ShowPublicipTagsResponse>(request, EipMeta.showPublicipTags,
            hcClient);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP，将弹性公网IP跟一个网卡绑定或者解绑定，转换IP地址版本类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新弹性公网IP，将弹性公网IP跟一个网卡绑定或者解绑定，转换IP地址版本类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicipRequest 请求对象
     * @return AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse>
     */
    public AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicipAsyncInvoker(
        UpdatePublicipRequest request) {
        return new AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse>(request, EipMeta.updatePublicip,
            hcClient);
    }

    /**
     * 创建浮动IP
     *
     * 创建浮动IP的外部网络UUID，请使用GET /v2.0/networks?router:external&#x3D;True或neutron net-external-list方式获取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronCreateFloatingIpResponse>
     */
    public CompletableFuture<NeutronCreateFloatingIpResponse> neutronCreateFloatingIpAsync(
        NeutronCreateFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronCreateFloatingIp);
    }

    /**
     * 创建浮动IP
     *
     * 创建浮动IP的外部网络UUID，请使用GET /v2.0/networks?router:external&#x3D;True或neutron net-external-list方式获取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateFloatingIpRequest 请求对象
     * @return AsyncInvoker<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse>
     */
    public AsyncInvoker<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> neutronCreateFloatingIpAsyncInvoker(
        NeutronCreateFloatingIpRequest request) {
        return new AsyncInvoker<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse>(request,
            EipMeta.neutronCreateFloatingIp, hcClient);
    }

    /**
     * 删除浮动IP
     *
     * 删除指定的浮动IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronDeleteFloatingIpResponse>
     */
    public CompletableFuture<NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIpAsync(
        NeutronDeleteFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronDeleteFloatingIp);
    }

    /**
     * 删除浮动IP
     *
     * 删除指定的浮动IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteFloatingIpRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse>
     */
    public AsyncInvoker<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIpAsyncInvoker(
        NeutronDeleteFloatingIpRequest request) {
        return new AsyncInvoker<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse>(request,
            EipMeta.neutronDeleteFloatingIp, hcClient);
    }

    /**
     * 查询浮动IP列表
     *
     * 查询提交请求的租户有权限操作的所有浮动IP地址。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListFloatingIpsRequest 请求对象
     * @return CompletableFuture<NeutronListFloatingIpsResponse>
     */
    public CompletableFuture<NeutronListFloatingIpsResponse> neutronListFloatingIpsAsync(
        NeutronListFloatingIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronListFloatingIps);
    }

    /**
     * 查询浮动IP列表
     *
     * 查询提交请求的租户有权限操作的所有浮动IP地址。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListFloatingIpsRequest 请求对象
     * @return AsyncInvoker<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse>
     */
    public AsyncInvoker<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> neutronListFloatingIpsAsyncInvoker(
        NeutronListFloatingIpsRequest request) {
        return new AsyncInvoker<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse>(request,
            EipMeta.neutronListFloatingIps, hcClient);
    }

    /**
     * 查询浮动IP
     *
     * 查询浮动IP详情，包括浮动IP状态，浮动IP所属路由器ID，浮动IP的外部网络ID等等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronShowFloatingIpResponse>
     */
    public CompletableFuture<NeutronShowFloatingIpResponse> neutronShowFloatingIpAsync(
        NeutronShowFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronShowFloatingIp);
    }

    /**
     * 查询浮动IP
     *
     * 查询浮动IP详情，包括浮动IP状态，浮动IP所属路由器ID，浮动IP的外部网络ID等等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowFloatingIpRequest 请求对象
     * @return AsyncInvoker<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse>
     */
    public AsyncInvoker<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> neutronShowFloatingIpAsyncInvoker(
        NeutronShowFloatingIpRequest request) {
        return new AsyncInvoker<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse>(request,
            EipMeta.neutronShowFloatingIp, hcClient);
    }

    /**
     * 更新浮动IP
     *
     * 更新浮动IP。
     *  更新时需在URL中给出浮动IP地址的ID。
     *  port_id 为空，则表示浮动IP从端口解绑。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronUpdateFloatingIpResponse>
     */
    public CompletableFuture<NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIpAsync(
        NeutronUpdateFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronUpdateFloatingIp);
    }

    /**
     * 更新浮动IP
     *
     * 更新浮动IP。
     *  更新时需在URL中给出浮动IP地址的ID。
     *  port_id 为空，则表示浮动IP从端口解绑。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateFloatingIpRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse>
     */
    public AsyncInvoker<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIpAsyncInvoker(
        NeutronUpdateFloatingIpRequest request) {
        return new AsyncInvoker<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse>(request,
            EipMeta.neutronUpdateFloatingIp, hcClient);
    }

}

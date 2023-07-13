package com.huaweicloud.sdk.deh.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.deh.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class DeHAsyncClient {

    protected HcClient hcClient;

    public DeHAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DeHAsyncClient> newBuilder() {
        return new ClientBuilder<>(DeHAsyncClient::new);
    }

    /**
     * 批量添加专属主机标签
     *
     * 为指定专属主机批量添加标签。
     * 
     * 标签管理服务（TMS）使用该接口批量添加专属主机的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDedicatedHostTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateDedicatedHostTagsResponse>
     */
    public CompletableFuture<BatchCreateDedicatedHostTagsResponse> batchCreateDedicatedHostTagsAsync(
        BatchCreateDedicatedHostTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.batchCreateDedicatedHostTags);
    }

    /**
     * 批量添加专属主机标签
     *
     * 为指定专属主机批量添加标签。
     * 
     * 标签管理服务（TMS）使用该接口批量添加专属主机的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDedicatedHostTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse>
     */
    public AsyncInvoker<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse> batchCreateDedicatedHostTagsAsyncInvoker(
        BatchCreateDedicatedHostTagsRequest request) {
        return new AsyncInvoker<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse>(request,
            DeHMeta.batchCreateDedicatedHostTags, hcClient);
    }

    /**
     * 批量删除专属主机标签
     *
     * 批量删除指定专属主机标签。
     * 
     * 标签管理服务（TMS）使用该接口批量删除专属主机的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDedicatedHostTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteDedicatedHostTagsResponse>
     */
    public CompletableFuture<BatchDeleteDedicatedHostTagsResponse> batchDeleteDedicatedHostTagsAsync(
        BatchDeleteDedicatedHostTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.batchDeleteDedicatedHostTags);
    }

    /**
     * 批量删除专属主机标签
     *
     * 批量删除指定专属主机标签。
     * 
     * 标签管理服务（TMS）使用该接口批量删除专属主机的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDedicatedHostTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse>
     */
    public AsyncInvoker<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse> batchDeleteDedicatedHostTagsAsyncInvoker(
        BatchDeleteDedicatedHostTagsRequest request) {
        return new AsyncInvoker<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse>(request,
            DeHMeta.batchDeleteDedicatedHostTags, hcClient);
    }

    /**
     * 分配专属主机
     *
     * 分配一台或多台专属主机，需要设置实例规格、所属AZ、数量等参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDedicatedHostRequest 请求对象
     * @return CompletableFuture<CreateDedicatedHostResponse>
     */
    public CompletableFuture<CreateDedicatedHostResponse> createDedicatedHostAsync(CreateDedicatedHostRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.createDedicatedHost);
    }

    /**
     * 分配专属主机
     *
     * 分配一台或多台专属主机，需要设置实例规格、所属AZ、数量等参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDedicatedHostRequest 请求对象
     * @return AsyncInvoker<CreateDedicatedHostRequest, CreateDedicatedHostResponse>
     */
    public AsyncInvoker<CreateDedicatedHostRequest, CreateDedicatedHostResponse> createDedicatedHostAsyncInvoker(
        CreateDedicatedHostRequest request) {
        return new AsyncInvoker<CreateDedicatedHostRequest, CreateDedicatedHostResponse>(request,
            DeHMeta.createDedicatedHost, hcClient);
    }

    /**
     * 释放专属主机
     *
     * 释放专属主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDedicatedHostRequest 请求对象
     * @return CompletableFuture<DeleteDedicatedHostResponse>
     */
    public CompletableFuture<DeleteDedicatedHostResponse> deleteDedicatedHostAsync(DeleteDedicatedHostRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.deleteDedicatedHost);
    }

    /**
     * 释放专属主机
     *
     * 释放专属主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDedicatedHostRequest 请求对象
     * @return AsyncInvoker<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse>
     */
    public AsyncInvoker<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse> deleteDedicatedHostAsyncInvoker(
        DeleteDedicatedHostRequest request) {
        return new AsyncInvoker<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse>(request,
            DeHMeta.deleteDedicatedHost, hcClient);
    }

    /**
     * 查询可用的专属主机类型
     *
     * 查询某一AZ内可用的专属主机类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostTypesRequest 请求对象
     * @return CompletableFuture<ListDedicatedHostTypesResponse>
     */
    public CompletableFuture<ListDedicatedHostTypesResponse> listDedicatedHostTypesAsync(
        ListDedicatedHostTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.listDedicatedHostTypes);
    }

    /**
     * 查询可用的专属主机类型
     *
     * 查询某一AZ内可用的专属主机类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostTypesRequest 请求对象
     * @return AsyncInvoker<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse>
     */
    public AsyncInvoker<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse> listDedicatedHostTypesAsyncInvoker(
        ListDedicatedHostTypesRequest request) {
        return new AsyncInvoker<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse>(request,
            DeHMeta.listDedicatedHostTypes, hcClient);
    }

    /**
     * 查询专属主机列表
     *
     * 通过该接口查询专属主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostsRequest 请求对象
     * @return CompletableFuture<ListDedicatedHostsResponse>
     */
    public CompletableFuture<ListDedicatedHostsResponse> listDedicatedHostsAsync(ListDedicatedHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.listDedicatedHosts);
    }

    /**
     * 查询专属主机列表
     *
     * 通过该接口查询专属主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostsRequest 请求对象
     * @return AsyncInvoker<ListDedicatedHostsRequest, ListDedicatedHostsResponse>
     */
    public AsyncInvoker<ListDedicatedHostsRequest, ListDedicatedHostsResponse> listDedicatedHostsAsyncInvoker(
        ListDedicatedHostsRequest request) {
        return new AsyncInvoker<ListDedicatedHostsRequest, ListDedicatedHostsResponse>(request,
            DeHMeta.listDedicatedHosts, hcClient);
    }

    /**
     * 按标签查询专属主机列表
     *
     * 使用标签过滤专属主机列表，并返回专属主机使用的所有标签。
     * 
     * 标签管理服务（TMS）使用该接口过滤专属主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostsByTagsRequest 请求对象
     * @return CompletableFuture<ListDedicatedHostsByTagsResponse>
     */
    public CompletableFuture<ListDedicatedHostsByTagsResponse> listDedicatedHostsByTagsAsync(
        ListDedicatedHostsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.listDedicatedHostsByTags);
    }

    /**
     * 按标签查询专属主机列表
     *
     * 使用标签过滤专属主机列表，并返回专属主机使用的所有标签。
     * 
     * 标签管理服务（TMS）使用该接口过滤专属主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostsByTagsRequest 请求对象
     * @return AsyncInvoker<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse>
     */
    public AsyncInvoker<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse> listDedicatedHostsByTagsAsyncInvoker(
        ListDedicatedHostsByTagsRequest request) {
        return new AsyncInvoker<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse>(request,
            DeHMeta.listDedicatedHostsByTags, hcClient);
    }

    /**
     * 查询专属主机上的云服务器
     *
     * 查询专属主机上已部署的云服务器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersDedicatedHostRequest 请求对象
     * @return CompletableFuture<ListServersDedicatedHostResponse>
     */
    public CompletableFuture<ListServersDedicatedHostResponse> listServersDedicatedHostAsync(
        ListServersDedicatedHostRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.listServersDedicatedHost);
    }

    /**
     * 查询专属主机上的云服务器
     *
     * 查询专属主机上已部署的云服务器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersDedicatedHostRequest 请求对象
     * @return AsyncInvoker<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse>
     */
    public AsyncInvoker<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse> listServersDedicatedHostAsyncInvoker(
        ListServersDedicatedHostRequest request) {
        return new AsyncInvoker<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse>(request,
            DeHMeta.listServersDedicatedHost, hcClient);
    }

    /**
     * 查询专属主机详情
     *
     * 查询某一台专属主机的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedHostRequest 请求对象
     * @return CompletableFuture<ShowDedicatedHostResponse>
     */
    public CompletableFuture<ShowDedicatedHostResponse> showDedicatedHostAsync(ShowDedicatedHostRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.showDedicatedHost);
    }

    /**
     * 查询专属主机详情
     *
     * 查询某一台专属主机的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedHostRequest 请求对象
     * @return AsyncInvoker<ShowDedicatedHostRequest, ShowDedicatedHostResponse>
     */
    public AsyncInvoker<ShowDedicatedHostRequest, ShowDedicatedHostResponse> showDedicatedHostAsyncInvoker(
        ShowDedicatedHostRequest request) {
        return new AsyncInvoker<ShowDedicatedHostRequest, ShowDedicatedHostResponse>(request, DeHMeta.showDedicatedHost,
            hcClient);
    }

    /**
     * 查询指定专属主机标签
     *
     * 查询指定专属主机的标签信息。
     * 
     * 标签管理服务（TMS）使用该接口查询指定专属主机的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedHostTagsRequest 请求对象
     * @return CompletableFuture<ShowDedicatedHostTagsResponse>
     */
    public CompletableFuture<ShowDedicatedHostTagsResponse> showDedicatedHostTagsAsync(
        ShowDedicatedHostTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.showDedicatedHostTags);
    }

    /**
     * 查询指定专属主机标签
     *
     * 查询指定专属主机的标签信息。
     * 
     * 标签管理服务（TMS）使用该接口查询指定专属主机的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedHostTagsRequest 请求对象
     * @return AsyncInvoker<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse>
     */
    public AsyncInvoker<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse> showDedicatedHostTagsAsyncInvoker(
        ShowDedicatedHostTagsRequest request) {
        return new AsyncInvoker<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse>(request,
            DeHMeta.showDedicatedHostTags, hcClient);
    }

    /**
     * 查询租户的专属主机配额
     *
     * 该接口用于查询租户的专属主机配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaSetsRequest 请求对象
     * @return CompletableFuture<ShowQuotaSetsResponse>
     */
    public CompletableFuture<ShowQuotaSetsResponse> showQuotaSetsAsync(ShowQuotaSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.showQuotaSets);
    }

    /**
     * 查询租户的专属主机配额
     *
     * 该接口用于查询租户的专属主机配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaSetsRequest 请求对象
     * @return AsyncInvoker<ShowQuotaSetsRequest, ShowQuotaSetsResponse>
     */
    public AsyncInvoker<ShowQuotaSetsRequest, ShowQuotaSetsResponse> showQuotaSetsAsyncInvoker(
        ShowQuotaSetsRequest request) {
        return new AsyncInvoker<ShowQuotaSetsRequest, ShowQuotaSetsResponse>(request, DeHMeta.showQuotaSets, hcClient);
    }

    /**
     * 更新专属主机属性
     *
     * 该接口用于变更专属主机的“auto_placement”和“name”属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDedicatedHostRequest 请求对象
     * @return CompletableFuture<UpdateDedicatedHostResponse>
     */
    public CompletableFuture<UpdateDedicatedHostResponse> updateDedicatedHostAsync(UpdateDedicatedHostRequest request) {
        return hcClient.asyncInvokeHttp(request, DeHMeta.updateDedicatedHost);
    }

    /**
     * 更新专属主机属性
     *
     * 该接口用于变更专属主机的“auto_placement”和“name”属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDedicatedHostRequest 请求对象
     * @return AsyncInvoker<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse>
     */
    public AsyncInvoker<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse> updateDedicatedHostAsyncInvoker(
        UpdateDedicatedHostRequest request) {
        return new AsyncInvoker<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse>(request,
            DeHMeta.updateDedicatedHost, hcClient);
    }

}

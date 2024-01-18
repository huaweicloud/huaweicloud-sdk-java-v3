package com.huaweicloud.sdk.deh.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.deh.v1.model.BatchCreateDedicatedHostTagsRequest;
import com.huaweicloud.sdk.deh.v1.model.BatchCreateDedicatedHostTagsResponse;
import com.huaweicloud.sdk.deh.v1.model.BatchDeleteDedicatedHostTagsRequest;
import com.huaweicloud.sdk.deh.v1.model.BatchDeleteDedicatedHostTagsResponse;
import com.huaweicloud.sdk.deh.v1.model.CreateDedicatedHostRequest;
import com.huaweicloud.sdk.deh.v1.model.CreateDedicatedHostResponse;
import com.huaweicloud.sdk.deh.v1.model.DeleteDedicatedHostRequest;
import com.huaweicloud.sdk.deh.v1.model.DeleteDedicatedHostResponse;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostTypesRequest;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostTypesResponse;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostsByTagsRequest;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostsByTagsResponse;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostsRequest;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostsResponse;
import com.huaweicloud.sdk.deh.v1.model.ListServersDedicatedHostRequest;
import com.huaweicloud.sdk.deh.v1.model.ListServersDedicatedHostResponse;
import com.huaweicloud.sdk.deh.v1.model.ShowDedicatedHostRequest;
import com.huaweicloud.sdk.deh.v1.model.ShowDedicatedHostResponse;
import com.huaweicloud.sdk.deh.v1.model.ShowDedicatedHostTagsRequest;
import com.huaweicloud.sdk.deh.v1.model.ShowDedicatedHostTagsResponse;
import com.huaweicloud.sdk.deh.v1.model.ShowQuotaSetsRequest;
import com.huaweicloud.sdk.deh.v1.model.ShowQuotaSetsResponse;
import com.huaweicloud.sdk.deh.v1.model.UpdateDedicatedHostRequest;
import com.huaweicloud.sdk.deh.v1.model.UpdateDedicatedHostResponse;

import java.util.concurrent.CompletableFuture;

public class DeHAsyncClient {

    protected HcClient hcClient;

    public DeHAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DeHAsyncClient> newBuilder() {
        ClientBuilder<DeHAsyncClient> clientBuilder = new ClientBuilder<>(DeHAsyncClient::new);
        return clientBuilder;
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
     * @param request BatchCreateDedicatedHostTagsRequest 请求对象
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
     * @param request BatchCreateDedicatedHostTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse>
     */
    public AsyncInvoker<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse> batchCreateDedicatedHostTagsAsyncInvoker(
        BatchCreateDedicatedHostTagsRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.batchCreateDedicatedHostTags, hcClient);
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
     * @param request BatchDeleteDedicatedHostTagsRequest 请求对象
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
     * @param request BatchDeleteDedicatedHostTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse>
     */
    public AsyncInvoker<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse> batchDeleteDedicatedHostTagsAsyncInvoker(
        BatchDeleteDedicatedHostTagsRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.batchDeleteDedicatedHostTags, hcClient);
    }

    /**
     * 分配专属主机
     *
     * 分配一台或多台专属主机，需要设置实例规格、所属AZ、数量等参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDedicatedHostRequest 请求对象
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
     * @param request CreateDedicatedHostRequest 请求对象
     * @return AsyncInvoker<CreateDedicatedHostRequest, CreateDedicatedHostResponse>
     */
    public AsyncInvoker<CreateDedicatedHostRequest, CreateDedicatedHostResponse> createDedicatedHostAsyncInvoker(
        CreateDedicatedHostRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.createDedicatedHost, hcClient);
    }

    /**
     * 释放专属主机
     *
     * 释放专属主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDedicatedHostRequest 请求对象
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
     * @param request DeleteDedicatedHostRequest 请求对象
     * @return AsyncInvoker<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse>
     */
    public AsyncInvoker<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse> deleteDedicatedHostAsyncInvoker(
        DeleteDedicatedHostRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.deleteDedicatedHost, hcClient);
    }

    /**
     * 查询可用的专属主机类型
     *
     * 查询某一AZ内可用的专属主机类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDedicatedHostTypesRequest 请求对象
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
     * @param request ListDedicatedHostTypesRequest 请求对象
     * @return AsyncInvoker<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse>
     */
    public AsyncInvoker<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse> listDedicatedHostTypesAsyncInvoker(
        ListDedicatedHostTypesRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.listDedicatedHostTypes, hcClient);
    }

    /**
     * 查询专属主机列表
     *
     * 通过该接口查询专属主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDedicatedHostsRequest 请求对象
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
     * @param request ListDedicatedHostsRequest 请求对象
     * @return AsyncInvoker<ListDedicatedHostsRequest, ListDedicatedHostsResponse>
     */
    public AsyncInvoker<ListDedicatedHostsRequest, ListDedicatedHostsResponse> listDedicatedHostsAsyncInvoker(
        ListDedicatedHostsRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.listDedicatedHosts, hcClient);
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
     * @param request ListDedicatedHostsByTagsRequest 请求对象
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
     * @param request ListDedicatedHostsByTagsRequest 请求对象
     * @return AsyncInvoker<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse>
     */
    public AsyncInvoker<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse> listDedicatedHostsByTagsAsyncInvoker(
        ListDedicatedHostsByTagsRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.listDedicatedHostsByTags, hcClient);
    }

    /**
     * 查询专属主机上的云服务器
     *
     * 查询专属主机上已部署的云服务器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersDedicatedHostRequest 请求对象
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
     * @param request ListServersDedicatedHostRequest 请求对象
     * @return AsyncInvoker<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse>
     */
    public AsyncInvoker<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse> listServersDedicatedHostAsyncInvoker(
        ListServersDedicatedHostRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.listServersDedicatedHost, hcClient);
    }

    /**
     * 查询专属主机详情
     *
     * 查询某一台专属主机的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDedicatedHostRequest 请求对象
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
     * @param request ShowDedicatedHostRequest 请求对象
     * @return AsyncInvoker<ShowDedicatedHostRequest, ShowDedicatedHostResponse>
     */
    public AsyncInvoker<ShowDedicatedHostRequest, ShowDedicatedHostResponse> showDedicatedHostAsyncInvoker(
        ShowDedicatedHostRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.showDedicatedHost, hcClient);
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
     * @param request ShowDedicatedHostTagsRequest 请求对象
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
     * @param request ShowDedicatedHostTagsRequest 请求对象
     * @return AsyncInvoker<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse>
     */
    public AsyncInvoker<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse> showDedicatedHostTagsAsyncInvoker(
        ShowDedicatedHostTagsRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.showDedicatedHostTags, hcClient);
    }

    /**
     * 查询租户的专属主机配额
     *
     * 该接口用于查询租户的专属主机配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaSetsRequest 请求对象
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
     * @param request ShowQuotaSetsRequest 请求对象
     * @return AsyncInvoker<ShowQuotaSetsRequest, ShowQuotaSetsResponse>
     */
    public AsyncInvoker<ShowQuotaSetsRequest, ShowQuotaSetsResponse> showQuotaSetsAsyncInvoker(
        ShowQuotaSetsRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.showQuotaSets, hcClient);
    }

    /**
     * 更新专属主机属性
     *
     * 该接口用于变更专属主机的“auto_placement”和“name”属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDedicatedHostRequest 请求对象
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
     * @param request UpdateDedicatedHostRequest 请求对象
     * @return AsyncInvoker<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse>
     */
    public AsyncInvoker<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse> updateDedicatedHostAsyncInvoker(
        UpdateDedicatedHostRequest request) {
        return new AsyncInvoker<>(request, DeHMeta.updateDedicatedHost, hcClient);
    }

}

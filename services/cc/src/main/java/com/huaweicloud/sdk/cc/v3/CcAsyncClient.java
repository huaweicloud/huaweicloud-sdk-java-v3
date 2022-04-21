package com.huaweicloud.sdk.cc.v3;

import com.huaweicloud.sdk.cc.v3.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CcAsyncClient {

    protected HcClient hcClient;

    public CcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CcAsyncClient> newBuilder() {
        return new ClientBuilder<>(CcAsyncClient::new, "GlobalCredentials");
    }

    /**
     * 创建云连接实例
     *
     * 创建云连接实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCloudConnectionRequest 请求对象
     * @return CompletableFuture<CreateCloudConnectionResponse>
     */
    public CompletableFuture<CreateCloudConnectionResponse> createCloudConnectionAsync(
        CreateCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createCloudConnection);
    }

    /**
     * 创建云连接实例
     *
     * 创建云连接实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCloudConnectionRequest 请求对象
     * @return AsyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse>
     */
    public AsyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse> createCloudConnectionAsyncInvoker(
        CreateCloudConnectionRequest request) {
        return new AsyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse>(request,
            CcMeta.createCloudConnection, hcClient);
    }

    /**
     * 创建网络实例
     *
     * 创建网络实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateNetworkInstanceRequest 请求对象
     * @return CompletableFuture<CreateNetworkInstanceResponse>
     */
    public CompletableFuture<CreateNetworkInstanceResponse> createNetworkInstanceAsync(
        CreateNetworkInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createNetworkInstance);
    }

    /**
     * 创建网络实例
     *
     * 创建网络实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateNetworkInstanceRequest 请求对象
     * @return AsyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse>
     */
    public AsyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> createNetworkInstanceAsyncInvoker(
        CreateNetworkInstanceRequest request) {
        return new AsyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse>(request,
            CcMeta.createNetworkInstance, hcClient);
    }

    /**
     * 删除云连接实例
     *
     * 删除云连接实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCloudConnectionRequest 请求对象
     * @return CompletableFuture<DeleteCloudConnectionResponse>
     */
    public CompletableFuture<DeleteCloudConnectionResponse> deleteCloudConnectionAsync(
        DeleteCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteCloudConnection);
    }

    /**
     * 删除云连接实例
     *
     * 删除云连接实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCloudConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse>
     */
    public AsyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> deleteCloudConnectionAsyncInvoker(
        DeleteCloudConnectionRequest request) {
        return new AsyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse>(request,
            CcMeta.deleteCloudConnection, hcClient);
    }

    /**
     * 删除网络实例
     *
     * 删除网络实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteNetworkInstanceRequest 请求对象
     * @return CompletableFuture<DeleteNetworkInstanceResponse>
     */
    public CompletableFuture<DeleteNetworkInstanceResponse> deleteNetworkInstanceAsync(
        DeleteNetworkInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteNetworkInstance);
    }

    /**
     * 删除网络实例
     *
     * 删除网络实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteNetworkInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse>
     */
    public AsyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> deleteNetworkInstanceAsyncInvoker(
        DeleteNetworkInstanceRequest request) {
        return new AsyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse>(request,
            CcMeta.deleteNetworkInstance, hcClient);
    }

    /**
     * 查询云连接路由条目列表
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCloudConnectionRoutesRequest 请求对象
     * @return CompletableFuture<ListCloudConnectionRoutesResponse>
     */
    public CompletableFuture<ListCloudConnectionRoutesResponse> listCloudConnectionRoutesAsync(
        ListCloudConnectionRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCloudConnectionRoutes);
    }

    /**
     * 查询云连接路由条目列表
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCloudConnectionRoutesRequest 请求对象
     * @return AsyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse>
     */
    public AsyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> listCloudConnectionRoutesAsyncInvoker(
        ListCloudConnectionRoutesRequest request) {
        return new AsyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse>(request,
            CcMeta.listCloudConnectionRoutes, hcClient);
    }

    /**
     * 查询云连接列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCloudConnectionsRequest 请求对象
     * @return CompletableFuture<ListCloudConnectionsResponse>
     */
    public CompletableFuture<ListCloudConnectionsResponse> listCloudConnectionsAsync(
        ListCloudConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCloudConnections);
    }

    /**
     * 查询云连接列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCloudConnectionsRequest 请求对象
     * @return AsyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse>
     */
    public AsyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse> listCloudConnectionsAsyncInvoker(
        ListCloudConnectionsRequest request) {
        return new AsyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse>(request,
            CcMeta.listCloudConnections, hcClient);
    }

    /**
     * 查询网络实例列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNetworkInstancesRequest 请求对象
     * @return CompletableFuture<ListNetworkInstancesResponse>
     */
    public CompletableFuture<ListNetworkInstancesResponse> listNetworkInstancesAsync(
        ListNetworkInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listNetworkInstances);
    }

    /**
     * 查询网络实例列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNetworkInstancesRequest 请求对象
     * @return AsyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse>
     */
    public AsyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse> listNetworkInstancesAsyncInvoker(
        ListNetworkInstancesRequest request) {
        return new AsyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse>(request,
            CcMeta.listNetworkInstances, hcClient);
    }

    /**
     * 查询云连接实例
     *
     * 查询云连接实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCloudConnectionRequest 请求对象
     * @return CompletableFuture<ShowCloudConnectionResponse>
     */
    public CompletableFuture<ShowCloudConnectionResponse> showCloudConnectionAsync(ShowCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showCloudConnection);
    }

    /**
     * 查询云连接实例
     *
     * 查询云连接实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCloudConnectionRequest 请求对象
     * @return AsyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse>
     */
    public AsyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse> showCloudConnectionAsyncInvoker(
        ShowCloudConnectionRequest request) {
        return new AsyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse>(request,
            CcMeta.showCloudConnection, hcClient);
    }

    /**
     * 查询云连接路由条目详情
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCloudConnectionRoutesRequest 请求对象
     * @return CompletableFuture<ShowCloudConnectionRoutesResponse>
     */
    public CompletableFuture<ShowCloudConnectionRoutesResponse> showCloudConnectionRoutesAsync(
        ShowCloudConnectionRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showCloudConnectionRoutes);
    }

    /**
     * 查询云连接路由条目详情
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCloudConnectionRoutesRequest 请求对象
     * @return AsyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse>
     */
    public AsyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> showCloudConnectionRoutesAsyncInvoker(
        ShowCloudConnectionRoutesRequest request) {
        return new AsyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse>(request,
            CcMeta.showCloudConnectionRoutes, hcClient);
    }

    /**
     * 查询网络实例
     *
     * 查询网络实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNetworkInstanceRequest 请求对象
     * @return CompletableFuture<ShowNetworkInstanceResponse>
     */
    public CompletableFuture<ShowNetworkInstanceResponse> showNetworkInstanceAsync(ShowNetworkInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showNetworkInstance);
    }

    /**
     * 查询网络实例
     *
     * 查询网络实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNetworkInstanceRequest 请求对象
     * @return AsyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse>
     */
    public AsyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> showNetworkInstanceAsyncInvoker(
        ShowNetworkInstanceRequest request) {
        return new AsyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse>(request,
            CcMeta.showNetworkInstance, hcClient);
    }

    /**
     * 更新云连接实例
     *
     * 更新云连接实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCloudConnectionRequest 请求对象
     * @return CompletableFuture<UpdateCloudConnectionResponse>
     */
    public CompletableFuture<UpdateCloudConnectionResponse> updateCloudConnectionAsync(
        UpdateCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateCloudConnection);
    }

    /**
     * 更新云连接实例
     *
     * 更新云连接实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCloudConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse>
     */
    public AsyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> updateCloudConnectionAsyncInvoker(
        UpdateCloudConnectionRequest request) {
        return new AsyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse>(request,
            CcMeta.updateCloudConnection, hcClient);
    }

    /**
     * 更新网络实例
     *
     * 更新网络实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateNetworkInstanceRequest 请求对象
     * @return CompletableFuture<UpdateNetworkInstanceResponse>
     */
    public CompletableFuture<UpdateNetworkInstanceResponse> updateNetworkInstanceAsync(
        UpdateNetworkInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateNetworkInstance);
    }

    /**
     * 更新网络实例
     *
     * 更新网络实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateNetworkInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse>
     */
    public AsyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> updateNetworkInstanceAsyncInvoker(
        UpdateNetworkInstanceRequest request) {
        return new AsyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse>(request,
            CcMeta.updateNetworkInstance, hcClient);
    }

}

package com.huaweicloud.sdk.cc.v3;

import com.huaweicloud.sdk.cc.v3.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CcClient {

    protected HcClient hcClient;

    public CcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CcClient> newBuilder() {
        return new ClientBuilder<>(CcClient::new, "GlobalCredentials");
    }

    /** 创建云连接实例 创建云连接实例。
     *
     * @param CreateCloudConnectionRequest 请求对象
     * @return CreateCloudConnectionResponse */
    public CreateCloudConnectionResponse createCloudConnection(CreateCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createCloudConnection);
    }

    /** 创建云连接实例 创建云连接实例。
     *
     * @param CreateCloudConnectionRequest 请求对象
     * @return SyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse> */
    public SyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse> createCloudConnectionInvoker(
        CreateCloudConnectionRequest request) {
        return new SyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse>(request,
            CcMeta.createCloudConnection, hcClient);
    }

    /** 创建网络实例 创建网络实例。
     *
     * @param CreateNetworkInstanceRequest 请求对象
     * @return CreateNetworkInstanceResponse */
    public CreateNetworkInstanceResponse createNetworkInstance(CreateNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createNetworkInstance);
    }

    /** 创建网络实例 创建网络实例。
     *
     * @param CreateNetworkInstanceRequest 请求对象
     * @return SyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> */
    public SyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> createNetworkInstanceInvoker(
        CreateNetworkInstanceRequest request) {
        return new SyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse>(request,
            CcMeta.createNetworkInstance, hcClient);
    }

    /** 删除云连接实例 删除云连接实例。
     *
     * @param DeleteCloudConnectionRequest 请求对象
     * @return DeleteCloudConnectionResponse */
    public DeleteCloudConnectionResponse deleteCloudConnection(DeleteCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteCloudConnection);
    }

    /** 删除云连接实例 删除云连接实例。
     *
     * @param DeleteCloudConnectionRequest 请求对象
     * @return SyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> */
    public SyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> deleteCloudConnectionInvoker(
        DeleteCloudConnectionRequest request) {
        return new SyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse>(request,
            CcMeta.deleteCloudConnection, hcClient);
    }

    /** 删除网络实例 删除网络实例。
     *
     * @param DeleteNetworkInstanceRequest 请求对象
     * @return DeleteNetworkInstanceResponse */
    public DeleteNetworkInstanceResponse deleteNetworkInstance(DeleteNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteNetworkInstance);
    }

    /** 删除网络实例 删除网络实例。
     *
     * @param DeleteNetworkInstanceRequest 请求对象
     * @return SyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> */
    public SyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> deleteNetworkInstanceInvoker(
        DeleteNetworkInstanceRequest request) {
        return new SyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse>(request,
            CcMeta.deleteNetworkInstance, hcClient);
    }

    /** 查询云连接路由条目列表 查询云连接路由条目列表。 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     *
     * @param ListCloudConnectionRoutesRequest 请求对象
     * @return ListCloudConnectionRoutesResponse */
    public ListCloudConnectionRoutesResponse listCloudConnectionRoutes(ListCloudConnectionRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCloudConnectionRoutes);
    }

    /** 查询云连接路由条目列表 查询云连接路由条目列表。 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     *
     * @param ListCloudConnectionRoutesRequest 请求对象
     * @return SyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> */
    public SyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> listCloudConnectionRoutesInvoker(
        ListCloudConnectionRoutesRequest request) {
        return new SyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse>(request,
            CcMeta.listCloudConnectionRoutes, hcClient);
    }

    /** 查询云连接列表 查询云连接列表。 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     *
     * @param ListCloudConnectionsRequest 请求对象
     * @return ListCloudConnectionsResponse */
    public ListCloudConnectionsResponse listCloudConnections(ListCloudConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCloudConnections);
    }

    /** 查询云连接列表 查询云连接列表。 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     *
     * @param ListCloudConnectionsRequest 请求对象
     * @return SyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse> */
    public SyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse> listCloudConnectionsInvoker(
        ListCloudConnectionsRequest request) {
        return new SyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse>(request,
            CcMeta.listCloudConnections, hcClient);
    }

    /** 查询网络实例列表 查询云连接列表。 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     *
     * @param ListNetworkInstancesRequest 请求对象
     * @return ListNetworkInstancesResponse */
    public ListNetworkInstancesResponse listNetworkInstances(ListNetworkInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listNetworkInstances);
    }

    /** 查询网络实例列表 查询云连接列表。 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     *
     * @param ListNetworkInstancesRequest 请求对象
     * @return SyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse> */
    public SyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse> listNetworkInstancesInvoker(
        ListNetworkInstancesRequest request) {
        return new SyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse>(request,
            CcMeta.listNetworkInstances, hcClient);
    }

    /** 查询云连接实例 查询云连接实例。
     *
     * @param ShowCloudConnectionRequest 请求对象
     * @return ShowCloudConnectionResponse */
    public ShowCloudConnectionResponse showCloudConnection(ShowCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showCloudConnection);
    }

    /** 查询云连接实例 查询云连接实例。
     *
     * @param ShowCloudConnectionRequest 请求对象
     * @return SyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse> */
    public SyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse> showCloudConnectionInvoker(
        ShowCloudConnectionRequest request) {
        return new SyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse>(request,
            CcMeta.showCloudConnection, hcClient);
    }

    /** 查询云连接路由条目详情 查询云连接路由条目列表。 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     *
     * @param ShowCloudConnectionRoutesRequest 请求对象
     * @return ShowCloudConnectionRoutesResponse */
    public ShowCloudConnectionRoutesResponse showCloudConnectionRoutes(ShowCloudConnectionRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showCloudConnectionRoutes);
    }

    /** 查询云连接路由条目详情 查询云连接路由条目列表。 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     *
     * @param ShowCloudConnectionRoutesRequest 请求对象
     * @return SyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> */
    public SyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> showCloudConnectionRoutesInvoker(
        ShowCloudConnectionRoutesRequest request) {
        return new SyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse>(request,
            CcMeta.showCloudConnectionRoutes, hcClient);
    }

    /** 查询网络实例 查询网络实例。
     *
     * @param ShowNetworkInstanceRequest 请求对象
     * @return ShowNetworkInstanceResponse */
    public ShowNetworkInstanceResponse showNetworkInstance(ShowNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showNetworkInstance);
    }

    /** 查询网络实例 查询网络实例。
     *
     * @param ShowNetworkInstanceRequest 请求对象
     * @return SyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> */
    public SyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> showNetworkInstanceInvoker(
        ShowNetworkInstanceRequest request) {
        return new SyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse>(request,
            CcMeta.showNetworkInstance, hcClient);
    }

    /** 更新云连接实例 更新云连接实例。
     *
     * @param UpdateCloudConnectionRequest 请求对象
     * @return UpdateCloudConnectionResponse */
    public UpdateCloudConnectionResponse updateCloudConnection(UpdateCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateCloudConnection);
    }

    /** 更新云连接实例 更新云连接实例。
     *
     * @param UpdateCloudConnectionRequest 请求对象
     * @return SyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> */
    public SyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> updateCloudConnectionInvoker(
        UpdateCloudConnectionRequest request) {
        return new SyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse>(request,
            CcMeta.updateCloudConnection, hcClient);
    }

    /** 更新网络实例 更新网络实例。
     *
     * @param UpdateNetworkInstanceRequest 请求对象
     * @return UpdateNetworkInstanceResponse */
    public UpdateNetworkInstanceResponse updateNetworkInstance(UpdateNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateNetworkInstance);
    }

    /** 更新网络实例 更新网络实例。
     *
     * @param UpdateNetworkInstanceRequest 请求对象
     * @return SyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> */
    public SyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> updateNetworkInstanceInvoker(
        UpdateNetworkInstanceRequest request) {
        return new SyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse>(request,
            CcMeta.updateNetworkInstance, hcClient);
    }

}

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

    /**
     * 创建授权
     *
     * 网络实例所属租户授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAuthorisationRequest 请求对象
     * @return CreateAuthorisationResponse
     */
    public CreateAuthorisationResponse createAuthorisation(CreateAuthorisationRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createAuthorisation);
    }

    /**
     * 创建授权
     *
     * 网络实例所属租户授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAuthorisationRequest 请求对象
     * @return SyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse>
     */
    public SyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse> createAuthorisationInvoker(
        CreateAuthorisationRequest request) {
        return new SyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse>(request,
            CcMeta.createAuthorisation, hcClient);
    }

    /**
     * 删除授权
     *
     * 网络实例所属租户取消授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuthorisationRequest 请求对象
     * @return DeleteAuthorisationResponse
     */
    public DeleteAuthorisationResponse deleteAuthorisation(DeleteAuthorisationRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteAuthorisation);
    }

    /**
     * 删除授权
     *
     * 网络实例所属租户取消授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuthorisationRequest 请求对象
     * @return SyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse>
     */
    public SyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse> deleteAuthorisationInvoker(
        DeleteAuthorisationRequest request) {
        return new SyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse>(request,
            CcMeta.deleteAuthorisation, hcClient);
    }

    /**
     * 查询授权列表
     *
     * 网络实例所属租户查看其已经授予其他租户的权限。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorisationsRequest 请求对象
     * @return ListAuthorisationsResponse
     */
    public ListAuthorisationsResponse listAuthorisations(ListAuthorisationsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listAuthorisations);
    }

    /**
     * 查询授权列表
     *
     * 网络实例所属租户查看其已经授予其他租户的权限。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorisationsRequest 请求对象
     * @return SyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse>
     */
    public SyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse> listAuthorisationsInvoker(
        ListAuthorisationsRequest request) {
        return new SyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse>(request,
            CcMeta.listAuthorisations, hcClient);
    }

    /**
     * 查询权限列表
     *
     * 云连接实例所属租户查询其可加载其他租户的网络实例权限。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionsRequest 请求对象
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissions(ListPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listPermissions);
    }

    /**
     * 查询权限列表
     *
     * 云连接实例所属租户查询其可加载其他租户的网络实例权限。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionsRequest 请求对象
     * @return SyncInvoker<ListPermissionsRequest, ListPermissionsResponse>
     */
    public SyncInvoker<ListPermissionsRequest, ListPermissionsResponse> listPermissionsInvoker(
        ListPermissionsRequest request) {
        return new SyncInvoker<ListPermissionsRequest, ListPermissionsResponse>(request, CcMeta.listPermissions,
            hcClient);
    }

    /**
     * 更新授权
     *
     * 更新授权实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuthorisationRequest 请求对象
     * @return UpdateAuthorisationResponse
     */
    public UpdateAuthorisationResponse updateAuthorisation(UpdateAuthorisationRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateAuthorisation);
    }

    /**
     * 更新授权
     *
     * 更新授权实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuthorisationRequest 请求对象
     * @return SyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse>
     */
    public SyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse> updateAuthorisationInvoker(
        UpdateAuthorisationRequest request) {
        return new SyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse>(request,
            CcMeta.updateAuthorisation, hcClient);
    }

    /**
     * 将带宽包实例绑定到云连接实例
     *
     * 将带宽包实例绑定到云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateBandwidthPackageRequest 请求对象
     * @return AssociateBandwidthPackageResponse
     */
    public AssociateBandwidthPackageResponse associateBandwidthPackage(AssociateBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.associateBandwidthPackage);
    }

    /**
     * 将带宽包实例绑定到云连接实例
     *
     * 将带宽包实例绑定到云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateBandwidthPackageRequest 请求对象
     * @return SyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse>
     */
    public SyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> associateBandwidthPackageInvoker(
        AssociateBandwidthPackageRequest request) {
        return new SyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse>(request,
            CcMeta.associateBandwidthPackage, hcClient);
    }

    /**
     * 创建带宽包实例
     *
     * 创建带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBandwidthPackageRequest 请求对象
     * @return CreateBandwidthPackageResponse
     */
    public CreateBandwidthPackageResponse createBandwidthPackage(CreateBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createBandwidthPackage);
    }

    /**
     * 创建带宽包实例
     *
     * 创建带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBandwidthPackageRequest 请求对象
     * @return SyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse>
     */
    public SyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> createBandwidthPackageInvoker(
        CreateBandwidthPackageRequest request) {
        return new SyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse>(request,
            CcMeta.createBandwidthPackage, hcClient);
    }

    /**
     * 删除带宽包实例
     *
     * 删除带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBandwidthPackageRequest 请求对象
     * @return DeleteBandwidthPackageResponse
     */
    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteBandwidthPackage);
    }

    /**
     * 删除带宽包实例
     *
     * 删除带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBandwidthPackageRequest 请求对象
     * @return SyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse>
     */
    public SyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> deleteBandwidthPackageInvoker(
        DeleteBandwidthPackageRequest request) {
        return new SyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse>(request,
            CcMeta.deleteBandwidthPackage, hcClient);
    }

    /**
     * 解除带宽包实例与云连接实例的绑定
     *
     * 解除带宽包实例与云连接实例的绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateBandwidthPackageRequest 请求对象
     * @return DisassociateBandwidthPackageResponse
     */
    public DisassociateBandwidthPackageResponse disassociateBandwidthPackage(
        DisassociateBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.disassociateBandwidthPackage);
    }

    /**
     * 解除带宽包实例与云连接实例的绑定
     *
     * 解除带宽包实例与云连接实例的绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateBandwidthPackageRequest 请求对象
     * @return SyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse>
     */
    public SyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> disassociateBandwidthPackageInvoker(
        DisassociateBandwidthPackageRequest request) {
        return new SyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse>(request,
            CcMeta.disassociateBandwidthPackage, hcClient);
    }

    /**
     * 查询带宽包列表
     *
     * 查询带宽包列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthPackagesRequest 请求对象
     * @return ListBandwidthPackagesResponse
     */
    public ListBandwidthPackagesResponse listBandwidthPackages(ListBandwidthPackagesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listBandwidthPackages);
    }

    /**
     * 查询带宽包列表
     *
     * 查询带宽包列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthPackagesRequest 请求对象
     * @return SyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse>
     */
    public SyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> listBandwidthPackagesInvoker(
        ListBandwidthPackagesRequest request) {
        return new SyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse>(request,
            CcMeta.listBandwidthPackages, hcClient);
    }

    /**
     * 查询带宽包实例
     *
     * 查询带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthPackageRequest 请求对象
     * @return ShowBandwidthPackageResponse
     */
    public ShowBandwidthPackageResponse showBandwidthPackage(ShowBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showBandwidthPackage);
    }

    /**
     * 查询带宽包实例
     *
     * 查询带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthPackageRequest 请求对象
     * @return SyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse>
     */
    public SyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> showBandwidthPackageInvoker(
        ShowBandwidthPackageRequest request) {
        return new SyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse>(request,
            CcMeta.showBandwidthPackage, hcClient);
    }

    /**
     * 更新带宽包实例
     *
     * 更新带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthPackageRequest 请求对象
     * @return UpdateBandwidthPackageResponse
     */
    public UpdateBandwidthPackageResponse updateBandwidthPackage(UpdateBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateBandwidthPackage);
    }

    /**
     * 更新带宽包实例
     *
     * 更新带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthPackageRequest 请求对象
     * @return SyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse>
     */
    public SyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> updateBandwidthPackageInvoker(
        UpdateBandwidthPackageRequest request) {
        return new SyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse>(request,
            CcMeta.updateBandwidthPackage, hcClient);
    }

    /**
     * 创建云连接实例
     *
     * 创建云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCloudConnectionRequest 请求对象
     * @return CreateCloudConnectionResponse
     */
    public CreateCloudConnectionResponse createCloudConnection(CreateCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createCloudConnection);
    }

    /**
     * 创建云连接实例
     *
     * 创建云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCloudConnectionRequest 请求对象
     * @return SyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse>
     */
    public SyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse> createCloudConnectionInvoker(
        CreateCloudConnectionRequest request) {
        return new SyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse>(request,
            CcMeta.createCloudConnection, hcClient);
    }

    /**
     * 删除云连接实例
     *
     * 删除云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCloudConnectionRequest 请求对象
     * @return DeleteCloudConnectionResponse
     */
    public DeleteCloudConnectionResponse deleteCloudConnection(DeleteCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteCloudConnection);
    }

    /**
     * 删除云连接实例
     *
     * 删除云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCloudConnectionRequest 请求对象
     * @return SyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse>
     */
    public SyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> deleteCloudConnectionInvoker(
        DeleteCloudConnectionRequest request) {
        return new SyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse>(request,
            CcMeta.deleteCloudConnection, hcClient);
    }

    /**
     * 查询云连接列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudConnectionsRequest 请求对象
     * @return ListCloudConnectionsResponse
     */
    public ListCloudConnectionsResponse listCloudConnections(ListCloudConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCloudConnections);
    }

    /**
     * 查询云连接列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudConnectionsRequest 请求对象
     * @return SyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse>
     */
    public SyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse> listCloudConnectionsInvoker(
        ListCloudConnectionsRequest request) {
        return new SyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse>(request,
            CcMeta.listCloudConnections, hcClient);
    }

    /**
     * 查询云连接实例
     *
     * 查询云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudConnectionRequest 请求对象
     * @return ShowCloudConnectionResponse
     */
    public ShowCloudConnectionResponse showCloudConnection(ShowCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showCloudConnection);
    }

    /**
     * 查询云连接实例
     *
     * 查询云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudConnectionRequest 请求对象
     * @return SyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse>
     */
    public SyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse> showCloudConnectionInvoker(
        ShowCloudConnectionRequest request) {
        return new SyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse>(request,
            CcMeta.showCloudConnection, hcClient);
    }

    /**
     * 更新云连接实例
     *
     * 更新云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCloudConnectionRequest 请求对象
     * @return UpdateCloudConnectionResponse
     */
    public UpdateCloudConnectionResponse updateCloudConnection(UpdateCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateCloudConnection);
    }

    /**
     * 更新云连接实例
     *
     * 更新云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCloudConnectionRequest 请求对象
     * @return SyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse>
     */
    public SyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> updateCloudConnectionInvoker(
        UpdateCloudConnectionRequest request) {
        return new SyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse>(request,
            CcMeta.updateCloudConnection, hcClient);
    }

    /**
     * 查询云连接路由条目列表
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudConnectionRoutesRequest 请求对象
     * @return ListCloudConnectionRoutesResponse
     */
    public ListCloudConnectionRoutesResponse listCloudConnectionRoutes(ListCloudConnectionRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCloudConnectionRoutes);
    }

    /**
     * 查询云连接路由条目列表
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudConnectionRoutesRequest 请求对象
     * @return SyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse>
     */
    public SyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> listCloudConnectionRoutesInvoker(
        ListCloudConnectionRoutesRequest request) {
        return new SyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse>(request,
            CcMeta.listCloudConnectionRoutes, hcClient);
    }

    /**
     * 查询云连接路由条目详情
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudConnectionRoutesRequest 请求对象
     * @return ShowCloudConnectionRoutesResponse
     */
    public ShowCloudConnectionRoutesResponse showCloudConnectionRoutes(ShowCloudConnectionRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showCloudConnectionRoutes);
    }

    /**
     * 查询云连接路由条目详情
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudConnectionRoutesRequest 请求对象
     * @return SyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse>
     */
    public SyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> showCloudConnectionRoutesInvoker(
        ShowCloudConnectionRoutesRequest request) {
        return new SyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse>(request,
            CcMeta.showCloudConnectionRoutes, hcClient);
    }

    /**
     * 创建域间带宽实例
     *
     * 创建域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInterRegionBandwidthRequest 请求对象
     * @return CreateInterRegionBandwidthResponse
     */
    public CreateInterRegionBandwidthResponse createInterRegionBandwidth(CreateInterRegionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createInterRegionBandwidth);
    }

    /**
     * 创建域间带宽实例
     *
     * 创建域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInterRegionBandwidthRequest 请求对象
     * @return SyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse>
     */
    public SyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> createInterRegionBandwidthInvoker(
        CreateInterRegionBandwidthRequest request) {
        return new SyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse>(request,
            CcMeta.createInterRegionBandwidth, hcClient);
    }

    /**
     * 删除域间带宽实例
     *
     * 删除域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInterRegionBandwidthRequest 请求对象
     * @return DeleteInterRegionBandwidthResponse
     */
    public DeleteInterRegionBandwidthResponse deleteInterRegionBandwidth(DeleteInterRegionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteInterRegionBandwidth);
    }

    /**
     * 删除域间带宽实例
     *
     * 删除域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInterRegionBandwidthRequest 请求对象
     * @return SyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse>
     */
    public SyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> deleteInterRegionBandwidthInvoker(
        DeleteInterRegionBandwidthRequest request) {
        return new SyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse>(request,
            CcMeta.deleteInterRegionBandwidth, hcClient);
    }

    /**
     * 查询域间带宽列表
     *
     * 查询域间带宽列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterRegionBandwidthsRequest 请求对象
     * @return ListInterRegionBandwidthsResponse
     */
    public ListInterRegionBandwidthsResponse listInterRegionBandwidths(ListInterRegionBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listInterRegionBandwidths);
    }

    /**
     * 查询域间带宽列表
     *
     * 查询域间带宽列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterRegionBandwidthsRequest 请求对象
     * @return SyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse>
     */
    public SyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> listInterRegionBandwidthsInvoker(
        ListInterRegionBandwidthsRequest request) {
        return new SyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse>(request,
            CcMeta.listInterRegionBandwidths, hcClient);
    }

    /**
     * 查询域间带宽实例
     *
     * 查询域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInterRegionBandwidthRequest 请求对象
     * @return ShowInterRegionBandwidthResponse
     */
    public ShowInterRegionBandwidthResponse showInterRegionBandwidth(ShowInterRegionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showInterRegionBandwidth);
    }

    /**
     * 查询域间带宽实例
     *
     * 查询域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInterRegionBandwidthRequest 请求对象
     * @return SyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse>
     */
    public SyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> showInterRegionBandwidthInvoker(
        ShowInterRegionBandwidthRequest request) {
        return new SyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse>(request,
            CcMeta.showInterRegionBandwidth, hcClient);
    }

    /**
     * 更新域间带宽实例
     *
     * 更新域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInterRegionBandwidthRequest 请求对象
     * @return UpdateInterRegionBandwidthResponse
     */
    public UpdateInterRegionBandwidthResponse updateInterRegionBandwidth(UpdateInterRegionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateInterRegionBandwidth);
    }

    /**
     * 更新域间带宽实例
     *
     * 更新域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInterRegionBandwidthRequest 请求对象
     * @return SyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse>
     */
    public SyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> updateInterRegionBandwidthInvoker(
        UpdateInterRegionBandwidthRequest request) {
        return new SyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse>(request,
            CcMeta.updateInterRegionBandwidth, hcClient);
    }

    /**
     * 创建网络实例
     *
     * 创建网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNetworkInstanceRequest 请求对象
     * @return CreateNetworkInstanceResponse
     */
    public CreateNetworkInstanceResponse createNetworkInstance(CreateNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createNetworkInstance);
    }

    /**
     * 创建网络实例
     *
     * 创建网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNetworkInstanceRequest 请求对象
     * @return SyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse>
     */
    public SyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> createNetworkInstanceInvoker(
        CreateNetworkInstanceRequest request) {
        return new SyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse>(request,
            CcMeta.createNetworkInstance, hcClient);
    }

    /**
     * 删除网络实例
     *
     * 删除网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNetworkInstanceRequest 请求对象
     * @return DeleteNetworkInstanceResponse
     */
    public DeleteNetworkInstanceResponse deleteNetworkInstance(DeleteNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteNetworkInstance);
    }

    /**
     * 删除网络实例
     *
     * 删除网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNetworkInstanceRequest 请求对象
     * @return SyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse>
     */
    public SyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> deleteNetworkInstanceInvoker(
        DeleteNetworkInstanceRequest request) {
        return new SyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse>(request,
            CcMeta.deleteNetworkInstance, hcClient);
    }

    /**
     * 查询网络实例列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNetworkInstancesRequest 请求对象
     * @return ListNetworkInstancesResponse
     */
    public ListNetworkInstancesResponse listNetworkInstances(ListNetworkInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listNetworkInstances);
    }

    /**
     * 查询网络实例列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNetworkInstancesRequest 请求对象
     * @return SyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse>
     */
    public SyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse> listNetworkInstancesInvoker(
        ListNetworkInstancesRequest request) {
        return new SyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse>(request,
            CcMeta.listNetworkInstances, hcClient);
    }

    /**
     * 查询网络实例
     *
     * 查询网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNetworkInstanceRequest 请求对象
     * @return ShowNetworkInstanceResponse
     */
    public ShowNetworkInstanceResponse showNetworkInstance(ShowNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showNetworkInstance);
    }

    /**
     * 查询网络实例
     *
     * 查询网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNetworkInstanceRequest 请求对象
     * @return SyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse>
     */
    public SyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> showNetworkInstanceInvoker(
        ShowNetworkInstanceRequest request) {
        return new SyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse>(request,
            CcMeta.showNetworkInstance, hcClient);
    }

    /**
     * 更新网络实例
     *
     * 更新网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNetworkInstanceRequest 请求对象
     * @return UpdateNetworkInstanceResponse
     */
    public UpdateNetworkInstanceResponse updateNetworkInstance(UpdateNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateNetworkInstance);
    }

    /**
     * 更新网络实例
     *
     * 更新网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNetworkInstanceRequest 请求对象
     * @return SyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse>
     */
    public SyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> updateNetworkInstanceInvoker(
        UpdateNetworkInstanceRequest request) {
        return new SyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse>(request,
            CcMeta.updateNetworkInstance, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, CcMeta.listQuotas, hcClient);
    }

    /**
     * 批量创建和删除资源标签
     *
     * 批量创建和删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeleteTagsRequest 请求对象
     * @return BatchCreateDeleteTagsResponse
     */
    public BatchCreateDeleteTagsResponse batchCreateDeleteTags(BatchCreateDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.batchCreateDeleteTags);
    }

    /**
     * 批量创建和删除资源标签
     *
     * 批量创建和删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse>
     */
    public SyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> batchCreateDeleteTagsInvoker(
        BatchCreateDeleteTagsRequest request) {
        return new SyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse>(request,
            CcMeta.batchCreateDeleteTags, hcClient);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createTag);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<CreateTagRequest, CreateTagResponse>(request, CcMeta.createTag, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, CcMeta.deleteTag, hcClient);
    }

    /**
     * 查询账户资源标签
     *
     * 查询账户资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainTagsRequest 请求对象
     * @return ListDomainTagsResponse
     */
    public ListDomainTagsResponse listDomainTags(ListDomainTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listDomainTags);
    }

    /**
     * 查询账户资源标签
     *
     * 查询账户资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainTagsRequest 请求对象
     * @return SyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse>
     */
    public SyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse> listDomainTagsInvoker(
        ListDomainTagsRequest request) {
        return new SyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse>(request, CcMeta.listDomainTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceByFilterTagRequest 请求对象
     * @return ListResourceByFilterTagResponse
     */
    public ListResourceByFilterTagResponse listResourceByFilterTag(ListResourceByFilterTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listResourceByFilterTag);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceByFilterTagRequest 请求对象
     * @return SyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse>
     */
    public SyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> listResourceByFilterTagInvoker(
        ListResourceByFilterTagRequest request) {
        return new SyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse>(request,
            CcMeta.listResourceByFilterTag, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<ListTagsRequest, ListTagsResponse>(request, CcMeta.listTags, hcClient);
    }

}

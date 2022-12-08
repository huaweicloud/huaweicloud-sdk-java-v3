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
     * 将带宽包实例关联到资源
     *
     * 将带宽包实例关联到资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateBandwidthPackageRequest 请求对象
     * @return CompletableFuture<AssociateBandwidthPackageResponse>
     */
    public CompletableFuture<AssociateBandwidthPackageResponse> associateBandwidthPackageAsync(
        AssociateBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.associateBandwidthPackage);
    }

    /**
     * 将带宽包实例关联到资源
     *
     * 将带宽包实例关联到资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse>
     */
    public AsyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> associateBandwidthPackageAsyncInvoker(
        AssociateBandwidthPackageRequest request) {
        return new AsyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse>(request,
            CcMeta.associateBandwidthPackage, hcClient);
    }

    /**
     * 批量创建和删除资源标签
     *
     * 批量创建和删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateDeleteTagsResponse>
     */
    public CompletableFuture<BatchCreateDeleteTagsResponse> batchCreateDeleteTagsAsync(
        BatchCreateDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.batchCreateDeleteTags);
    }

    /**
     * 批量创建和删除资源标签
     *
     * 批量创建和删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse>
     */
    public AsyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> batchCreateDeleteTagsAsyncInvoker(
        BatchCreateDeleteTagsRequest request) {
        return new AsyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse>(request,
            CcMeta.batchCreateDeleteTags, hcClient);
    }

    /**
     * 创建授权
     *
     * 网络实例所属租户授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAuthorisationRequest 请求对象
     * @return CompletableFuture<CreateAuthorisationResponse>
     */
    public CompletableFuture<CreateAuthorisationResponse> createAuthorisationAsync(CreateAuthorisationRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createAuthorisation);
    }

    /**
     * 创建授权
     *
     * 网络实例所属租户授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAuthorisationRequest 请求对象
     * @return AsyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse>
     */
    public AsyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse> createAuthorisationAsyncInvoker(
        CreateAuthorisationRequest request) {
        return new AsyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse>(request,
            CcMeta.createAuthorisation, hcClient);
    }

    /**
     * 创建带宽包实例
     *
     * 创建带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBandwidthPackageRequest 请求对象
     * @return CompletableFuture<CreateBandwidthPackageResponse>
     */
    public CompletableFuture<CreateBandwidthPackageResponse> createBandwidthPackageAsync(
        CreateBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createBandwidthPackage);
    }

    /**
     * 创建带宽包实例
     *
     * 创建带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse>
     */
    public AsyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> createBandwidthPackageAsyncInvoker(
        CreateBandwidthPackageRequest request) {
        return new AsyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse>(request,
            CcMeta.createBandwidthPackage, hcClient);
    }

    /**
     * 创建云连接实例
     *
     * 创建云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建域间带宽实例
     *
     * 创建域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInterRegionBandwidthRequest 请求对象
     * @return CompletableFuture<CreateInterRegionBandwidthResponse>
     */
    public CompletableFuture<CreateInterRegionBandwidthResponse> createInterRegionBandwidthAsync(
        CreateInterRegionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createInterRegionBandwidth);
    }

    /**
     * 创建域间带宽实例
     *
     * 创建域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInterRegionBandwidthRequest 请求对象
     * @return AsyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse>
     */
    public AsyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> createInterRegionBandwidthAsyncInvoker(
        CreateInterRegionBandwidthRequest request) {
        return new AsyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse>(request,
            CcMeta.createInterRegionBandwidth, hcClient);
    }

    /**
     * 创建网络实例
     *
     * 创建网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 添加资源标签
     *
     * 添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createTag);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<CreateTagRequest, CreateTagResponse>(request, CcMeta.createTag, hcClient);
    }

    /**
     * 删除授权
     *
     * 网络实例所属租户取消授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuthorisationRequest 请求对象
     * @return CompletableFuture<DeleteAuthorisationResponse>
     */
    public CompletableFuture<DeleteAuthorisationResponse> deleteAuthorisationAsync(DeleteAuthorisationRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteAuthorisation);
    }

    /**
     * 删除授权
     *
     * 网络实例所属租户取消授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuthorisationRequest 请求对象
     * @return AsyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse>
     */
    public AsyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse> deleteAuthorisationAsyncInvoker(
        DeleteAuthorisationRequest request) {
        return new AsyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse>(request,
            CcMeta.deleteAuthorisation, hcClient);
    }

    /**
     * 删除带宽包实例
     *
     * 删除带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBandwidthPackageRequest 请求对象
     * @return CompletableFuture<DeleteBandwidthPackageResponse>
     */
    public CompletableFuture<DeleteBandwidthPackageResponse> deleteBandwidthPackageAsync(
        DeleteBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteBandwidthPackage);
    }

    /**
     * 删除带宽包实例
     *
     * 删除带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse>
     */
    public AsyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> deleteBandwidthPackageAsyncInvoker(
        DeleteBandwidthPackageRequest request) {
        return new AsyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse>(request,
            CcMeta.deleteBandwidthPackage, hcClient);
    }

    /**
     * 删除云连接实例
     *
     * 删除云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除域间带宽实例
     *
     * 删除域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInterRegionBandwidthRequest 请求对象
     * @return CompletableFuture<DeleteInterRegionBandwidthResponse>
     */
    public CompletableFuture<DeleteInterRegionBandwidthResponse> deleteInterRegionBandwidthAsync(
        DeleteInterRegionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteInterRegionBandwidth);
    }

    /**
     * 删除域间带宽实例
     *
     * 删除域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInterRegionBandwidthRequest 请求对象
     * @return AsyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse>
     */
    public AsyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> deleteInterRegionBandwidthAsyncInvoker(
        DeleteInterRegionBandwidthRequest request) {
        return new AsyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse>(request,
            CcMeta.deleteInterRegionBandwidth, hcClient);
    }

    /**
     * 删除网络实例
     *
     * 删除网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, CcMeta.deleteTag, hcClient);
    }

    /**
     * 将带宽包实例与资源解关联
     *
     * 将带宽包实例与资源解关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateBandwidthPackageRequest 请求对象
     * @return CompletableFuture<DisassociateBandwidthPackageResponse>
     */
    public CompletableFuture<DisassociateBandwidthPackageResponse> disassociateBandwidthPackageAsync(
        DisassociateBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.disassociateBandwidthPackage);
    }

    /**
     * 将带宽包实例与资源解关联
     *
     * 将带宽包实例与资源解关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse>
     */
    public AsyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> disassociateBandwidthPackageAsyncInvoker(
        DisassociateBandwidthPackageRequest request) {
        return new AsyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse>(request,
            CcMeta.disassociateBandwidthPackage, hcClient);
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
     * @return CompletableFuture<ListAuthorisationsResponse>
     */
    public CompletableFuture<ListAuthorisationsResponse> listAuthorisationsAsync(ListAuthorisationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listAuthorisations);
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
     * @return AsyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse>
     */
    public AsyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse> listAuthorisationsAsyncInvoker(
        ListAuthorisationsRequest request) {
        return new AsyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse>(request,
            CcMeta.listAuthorisations, hcClient);
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
     * @return CompletableFuture<ListBandwidthPackagesResponse>
     */
    public CompletableFuture<ListBandwidthPackagesResponse> listBandwidthPackagesAsync(
        ListBandwidthPackagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listBandwidthPackages);
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
     * @return AsyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse>
     */
    public AsyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> listBandwidthPackagesAsyncInvoker(
        ListBandwidthPackagesRequest request) {
        return new AsyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse>(request,
            CcMeta.listBandwidthPackages, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询账户资源标签
     *
     * 查询账户资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainTagsRequest 请求对象
     * @return CompletableFuture<ListDomainTagsResponse>
     */
    public CompletableFuture<ListDomainTagsResponse> listDomainTagsAsync(ListDomainTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listDomainTags);
    }

    /**
     * 查询账户资源标签
     *
     * 查询账户资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainTagsRequest 请求对象
     * @return AsyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse>
     */
    public AsyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse> listDomainTagsAsyncInvoker(
        ListDomainTagsRequest request) {
        return new AsyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse>(request, CcMeta.listDomainTags,
            hcClient);
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
     * @return CompletableFuture<ListInterRegionBandwidthsResponse>
     */
    public CompletableFuture<ListInterRegionBandwidthsResponse> listInterRegionBandwidthsAsync(
        ListInterRegionBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listInterRegionBandwidths);
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
     * @return AsyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse>
     */
    public AsyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> listInterRegionBandwidthsAsyncInvoker(
        ListInterRegionBandwidthsRequest request) {
        return new AsyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse>(request,
            CcMeta.listInterRegionBandwidths, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询权限列表
     *
     * 云连接实例所属租户查询其可加载其他租户的网络实例权限。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionsRequest 请求对象
     * @return CompletableFuture<ListPermissionsResponse>
     */
    public CompletableFuture<ListPermissionsResponse> listPermissionsAsync(ListPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listPermissions);
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
     * @return AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse>
     */
    public AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse> listPermissionsAsyncInvoker(
        ListPermissionsRequest request) {
        return new AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse>(request, CcMeta.listPermissions,
            hcClient);
    }

    /**
     * 查询配额
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, CcMeta.listQuotas, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceByFilterTagRequest 请求对象
     * @return CompletableFuture<ListResourceByFilterTagResponse>
     */
    public CompletableFuture<ListResourceByFilterTagResponse> listResourceByFilterTagAsync(
        ListResourceByFilterTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listResourceByFilterTag);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceByFilterTagRequest 请求对象
     * @return AsyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse>
     */
    public AsyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> listResourceByFilterTagAsyncInvoker(
        ListResourceByFilterTagRequest request) {
        return new AsyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse>(request,
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
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, CcMeta.listTags, hcClient);
    }

    /**
     * 查询带宽包实例
     *
     * 查询带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthPackageRequest 请求对象
     * @return CompletableFuture<ShowBandwidthPackageResponse>
     */
    public CompletableFuture<ShowBandwidthPackageResponse> showBandwidthPackageAsync(
        ShowBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showBandwidthPackage);
    }

    /**
     * 查询带宽包实例
     *
     * 查询带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse>
     */
    public AsyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> showBandwidthPackageAsyncInvoker(
        ShowBandwidthPackageRequest request) {
        return new AsyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse>(request,
            CcMeta.showBandwidthPackage, hcClient);
    }

    /**
     * 查询云连接实例
     *
     * 查询云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询域间带宽实例
     *
     * 查询域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInterRegionBandwidthRequest 请求对象
     * @return CompletableFuture<ShowInterRegionBandwidthResponse>
     */
    public CompletableFuture<ShowInterRegionBandwidthResponse> showInterRegionBandwidthAsync(
        ShowInterRegionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showInterRegionBandwidth);
    }

    /**
     * 查询域间带宽实例
     *
     * 查询域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInterRegionBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse>
     */
    public AsyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> showInterRegionBandwidthAsyncInvoker(
        ShowInterRegionBandwidthRequest request) {
        return new AsyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse>(request,
            CcMeta.showInterRegionBandwidth, hcClient);
    }

    /**
     * 查询网络实例
     *
     * 查询网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 更新授权
     *
     * 更新授权实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuthorisationRequest 请求对象
     * @return CompletableFuture<UpdateAuthorisationResponse>
     */
    public CompletableFuture<UpdateAuthorisationResponse> updateAuthorisationAsync(UpdateAuthorisationRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateAuthorisation);
    }

    /**
     * 更新授权
     *
     * 更新授权实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuthorisationRequest 请求对象
     * @return AsyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse>
     */
    public AsyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse> updateAuthorisationAsyncInvoker(
        UpdateAuthorisationRequest request) {
        return new AsyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse>(request,
            CcMeta.updateAuthorisation, hcClient);
    }

    /**
     * 更新带宽包实例
     *
     * 更新带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthPackageRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthPackageResponse>
     */
    public CompletableFuture<UpdateBandwidthPackageResponse> updateBandwidthPackageAsync(
        UpdateBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateBandwidthPackage);
    }

    /**
     * 更新带宽包实例
     *
     * 更新带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse>
     */
    public AsyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> updateBandwidthPackageAsyncInvoker(
        UpdateBandwidthPackageRequest request) {
        return new AsyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse>(request,
            CcMeta.updateBandwidthPackage, hcClient);
    }

    /**
     * 更新云连接实例
     *
     * 更新云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 更新域间带宽实例
     *
     * 更新域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInterRegionBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateInterRegionBandwidthResponse>
     */
    public CompletableFuture<UpdateInterRegionBandwidthResponse> updateInterRegionBandwidthAsync(
        UpdateInterRegionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateInterRegionBandwidth);
    }

    /**
     * 更新域间带宽实例
     *
     * 更新域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInterRegionBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse>
     */
    public AsyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> updateInterRegionBandwidthAsyncInvoker(
        UpdateInterRegionBandwidthRequest request) {
        return new AsyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse>(request,
            CcMeta.updateInterRegionBandwidth, hcClient);
    }

    /**
     * 更新网络实例
     *
     * 更新网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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

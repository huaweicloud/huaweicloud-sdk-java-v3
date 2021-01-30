package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dws.v2.model.*;

public class DwsAsyncClient {
    protected HcClient hcClient;

    public DwsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DwsAsyncClient::new);
    }


    /**
     * 创建集群
     * 该接口用于创建集群
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createCluster);
    }

    /**
     * 创建集群
     * 该接口用于创建集群
     *
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, DwsMeta.createCluster, hcClient);
    }

    /**
     * 创建快照
     * 该接口用于为指定集群创建快照。
     *
     * @param CreateSnapshotRequest 请求对象
     * @return CompletableFuture<CreateSnapshotResponse>
     */
    public CompletableFuture<CreateSnapshotResponse> createSnapshotAsync(CreateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createSnapshot);
    }

    /**
     * 创建快照
     * 该接口用于为指定集群创建快照。
     *
     * @param CreateSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotAsyncInvoker(CreateSnapshotRequest request) {
        return new AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, DwsMeta.createSnapshot, hcClient);
    }

    /**
     * 删除集群
     * 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     *
     * @param DeleteClusterRequest 请求对象
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteCluster);
    }

    /**
     * 删除集群
     * 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     *
     * @param DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(DeleteClusterRequest request) {
        return new AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, DwsMeta.deleteCluster, hcClient);
    }

    /**
     * 删除快照
     * 该接口用于删除一个指定快照。
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotResponse>
     */
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshotAsync(DeleteSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.deleteSnapshot);
    }

    /**
     * 删除快照
     * 该接口用于删除一个指定快照。
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotAsyncInvoker(DeleteSnapshotRequest request) {
        return new AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, DwsMeta.deleteSnapshot, hcClient);
    }

    /**
     * 查询集群详情
     * 该接口用于查询集群详情
     *
     * @param ListClusterDetailsRequest 请求对象
     * @return CompletableFuture<ListClusterDetailsResponse>
     */
    public CompletableFuture<ListClusterDetailsResponse> listClusterDetailsAsync(ListClusterDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusterDetails);
    }

    /**
     * 查询集群详情
     * 该接口用于查询集群详情
     *
     * @param ListClusterDetailsRequest 请求对象
     * @return AsyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse>
     */
    public AsyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse> listClusterDetailsAsyncInvoker(ListClusterDetailsRequest request) {
        return new AsyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse>(request, DwsMeta.listClusterDetails, hcClient);
    }

    /**
     * 查询集群列表
     * 该接口用于查询并显示集群列表
     *
     * @param ListClustersRequest 请求对象
     * @return CompletableFuture<ListClustersResponse>
     */
    public CompletableFuture<ListClustersResponse> listClustersAsync(ListClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusters);
    }

    /**
     * 查询集群列表
     * 该接口用于查询并显示集群列表
     *
     * @param ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(ListClustersRequest request) {
        return new AsyncInvoker<ListClustersRequest, ListClustersResponse>(request, DwsMeta.listClusters, hcClient);
    }

    /**
     * 查询节点类型
     * 该接口用于查询所有DWS服务支持的节点类型。
     *
     * @param ListNodeTypesRequest 请求对象
     * @return CompletableFuture<ListNodeTypesResponse>
     */
    public CompletableFuture<ListNodeTypesResponse> listNodeTypesAsync(ListNodeTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listNodeTypes);
    }

    /**
     * 查询节点类型
     * 该接口用于查询所有DWS服务支持的节点类型。
     *
     * @param ListNodeTypesRequest 请求对象
     * @return AsyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse>
     */
    public AsyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse> listNodeTypesAsyncInvoker(ListNodeTypesRequest request) {
        return new AsyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse>(request, DwsMeta.listNodeTypes, hcClient);
    }

    /**
     * 查询快照详情
     * 该接口用于使用快照ID查询快照详情。
     *
     * @param ListSnapshotDetailsRequest 请求对象
     * @return CompletableFuture<ListSnapshotDetailsResponse>
     */
    public CompletableFuture<ListSnapshotDetailsResponse> listSnapshotDetailsAsync(ListSnapshotDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listSnapshotDetails);
    }

    /**
     * 查询快照详情
     * 该接口用于使用快照ID查询快照详情。
     *
     * @param ListSnapshotDetailsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse>
     */
    public AsyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> listSnapshotDetailsAsyncInvoker(ListSnapshotDetailsRequest request) {
        return new AsyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse>(request, DwsMeta.listSnapshotDetails, hcClient);
    }

    /**
     * 查询快照列表
     * 该接口用于查询快照列表。
     *
     * @param ListSnapshotsRequest 请求对象
     * @return CompletableFuture<ListSnapshotsResponse>
     */
    public CompletableFuture<ListSnapshotsResponse> listSnapshotsAsync(ListSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     * 该接口用于查询快照列表。
     *
     * @param ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(ListSnapshotsRequest request) {
        return new AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, DwsMeta.listSnapshots, hcClient);
    }

    /**
     * 重置密码
     * 
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.resetPassword);
    }

    /**
     * 重置密码
     * 
     *
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, DwsMeta.resetPassword, hcClient);
    }

    /**
     * 扩容集群调整集群大小
     * 此接口用于扩容集群调整集群大小。
     *
     * @param ResizeClusterRequest 请求对象
     * @return CompletableFuture<ResizeClusterResponse>
     */
    public CompletableFuture<ResizeClusterResponse> resizeClusterAsync(ResizeClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.resizeCluster);
    }

    /**
     * 扩容集群调整集群大小
     * 此接口用于扩容集群调整集群大小。
     *
     * @param ResizeClusterRequest 请求对象
     * @return AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse>
     */
    public AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse> resizeClusterAsyncInvoker(ResizeClusterRequest request) {
        return new AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse>(request, DwsMeta.resizeCluster, hcClient);
    }

    /**
     * 重启集群
     * 此接口用于重启集群。
     *
     * @param RestartClusterRequest 请求对象
     * @return CompletableFuture<RestartClusterResponse>
     */
    public CompletableFuture<RestartClusterResponse> restartClusterAsync(RestartClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restartCluster);
    }

    /**
     * 重启集群
     * 此接口用于重启集群。
     *
     * @param RestartClusterRequest 请求对象
     * @return AsyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public AsyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterAsyncInvoker(RestartClusterRequest request) {
        return new AsyncInvoker<RestartClusterRequest, RestartClusterResponse>(request, DwsMeta.restartCluster, hcClient);
    }

    /**
     * 恢复集群
     * 该接口用于使用快照恢复集群。
     *
     * @param RestoreClusterRequest 请求对象
     * @return CompletableFuture<RestoreClusterResponse>
     */
    public CompletableFuture<RestoreClusterResponse> restoreClusterAsync(RestoreClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restoreCluster);
    }

    /**
     * 恢复集群
     * 该接口用于使用快照恢复集群。
     *
     * @param RestoreClusterRequest 请求对象
     * @return AsyncInvoker<RestoreClusterRequest, RestoreClusterResponse>
     */
    public AsyncInvoker<RestoreClusterRequest, RestoreClusterResponse> restoreClusterAsyncInvoker(RestoreClusterRequest request) {
        return new AsyncInvoker<RestoreClusterRequest, RestoreClusterResponse>(request, DwsMeta.restoreCluster, hcClient);
    }

}
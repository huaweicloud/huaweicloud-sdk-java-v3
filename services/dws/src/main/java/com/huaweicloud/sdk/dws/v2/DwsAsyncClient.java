package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

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
     * 恢复集群
     * 该接口用于使用快照恢复集群。
     *
     * @param RestoreClusterRequest 请求对象
     * @return CompletableFuture<RestoreClusterResponse>
     */
    public CompletableFuture<RestoreClusterResponse> restoreClusterAsync(RestoreClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.restoreCluster);
    }

}
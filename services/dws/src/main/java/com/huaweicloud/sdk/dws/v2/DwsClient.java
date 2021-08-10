package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dws.v2.model.*;

public class DwsClient {

    protected HcClient hcClient;

    public DwsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwsClient> newBuilder() {
        return new ClientBuilder<>(DwsClient::new);
    }

    /** 创建集群 该接口用于创建集群
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createCluster);
    }

    /** 创建集群 该接口用于创建集群
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse> */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, DwsMeta.createCluster, hcClient);
    }

    /** 创建快照 该接口用于为指定集群创建快照。
     *
     * @param CreateSnapshotRequest 请求对象
     * @return CreateSnapshotResponse */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createSnapshot);
    }

    /** 创建快照 该接口用于为指定集群创建快照。
     *
     * @param CreateSnapshotRequest 请求对象
     * @return SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> */
    public SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotInvoker(
        CreateSnapshotRequest request) {
        return new SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, DwsMeta.createSnapshot,
            hcClient);
    }

    /** 删除集群 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteCluster);
    }

    /** 删除集群 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     *
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, DwsMeta.deleteCluster, hcClient);
    }

    /** 删除快照 该接口用于删除一个指定快照。
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return DeleteSnapshotResponse */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteSnapshot);
    }

    /** 删除快照 该接口用于删除一个指定快照。
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> */
    public SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotInvoker(
        DeleteSnapshotRequest request) {
        return new SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, DwsMeta.deleteSnapshot,
            hcClient);
    }

    /** 查询集群详情 该接口用于查询集群详情
     *
     * @param ListClusterDetailsRequest 请求对象
     * @return ListClusterDetailsResponse */
    public ListClusterDetailsResponse listClusterDetails(ListClusterDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterDetails);
    }

    /** 查询集群详情 该接口用于查询集群详情
     *
     * @param ListClusterDetailsRequest 请求对象
     * @return SyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse> */
    public SyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse> listClusterDetailsInvoker(
        ListClusterDetailsRequest request) {
        return new SyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse>(request,
            DwsMeta.listClusterDetails, hcClient);
    }

    /** 查询集群列表 该接口用于查询并显示集群列表
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusters);
    }

    /** 查询集群列表 该接口用于查询并显示集群列表
     *
     * @param ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse> */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, DwsMeta.listClusters, hcClient);
    }

    /** 查询节点类型 该接口用于查询所有DWS服务支持的节点类型。
     *
     * @param ListNodeTypesRequest 请求对象
     * @return ListNodeTypesResponse */
    public ListNodeTypesResponse listNodeTypes(ListNodeTypesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listNodeTypes);
    }

    /** 查询节点类型 该接口用于查询所有DWS服务支持的节点类型。
     *
     * @param ListNodeTypesRequest 请求对象
     * @return SyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse> */
    public SyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse> listNodeTypesInvoker(ListNodeTypesRequest request) {
        return new SyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse>(request, DwsMeta.listNodeTypes, hcClient);
    }

    /** 查询快照详情 该接口用于使用快照ID查询快照详情。
     *
     * @param ListSnapshotDetailsRequest 请求对象
     * @return ListSnapshotDetailsResponse */
    public ListSnapshotDetailsResponse listSnapshotDetails(ListSnapshotDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotDetails);
    }

    /** 查询快照详情 该接口用于使用快照ID查询快照详情。
     *
     * @param ListSnapshotDetailsRequest 请求对象
     * @return SyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> */
    public SyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> listSnapshotDetailsInvoker(
        ListSnapshotDetailsRequest request) {
        return new SyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse>(request,
            DwsMeta.listSnapshotDetails, hcClient);
    }

    /** 查询快照列表 该接口用于查询快照列表。
     *
     * @param ListSnapshotsRequest 请求对象
     * @return ListSnapshotsResponse */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshots);
    }

    /** 查询快照列表 该接口用于查询快照列表。
     *
     * @param ListSnapshotsRequest 请求对象
     * @return SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> */
    public SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsInvoker(ListSnapshotsRequest request) {
        return new SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, DwsMeta.listSnapshots, hcClient);
    }

    /** 重置密码
     * 
     *
     * @param ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.resetPassword);
    }

    /** 重置密码
     * 
     *
     * @param ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, DwsMeta.resetPassword, hcClient);
    }

    /** 扩容集群调整集群大小 此接口用于扩容集群调整集群大小。
     *
     * @param ResizeClusterRequest 请求对象
     * @return ResizeClusterResponse */
    public ResizeClusterResponse resizeCluster(ResizeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.resizeCluster);
    }

    /** 扩容集群调整集群大小 此接口用于扩容集群调整集群大小。
     *
     * @param ResizeClusterRequest 请求对象
     * @return SyncInvoker<ResizeClusterRequest, ResizeClusterResponse> */
    public SyncInvoker<ResizeClusterRequest, ResizeClusterResponse> resizeClusterInvoker(ResizeClusterRequest request) {
        return new SyncInvoker<ResizeClusterRequest, ResizeClusterResponse>(request, DwsMeta.resizeCluster, hcClient);
    }

    /** 重启集群 此接口用于重启集群。
     *
     * @param RestartClusterRequest 请求对象
     * @return RestartClusterResponse */
    public RestartClusterResponse restartCluster(RestartClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restartCluster);
    }

    /** 重启集群 此接口用于重启集群。
     *
     * @param RestartClusterRequest 请求对象
     * @return SyncInvoker<RestartClusterRequest, RestartClusterResponse> */
    public SyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterInvoker(
        RestartClusterRequest request) {
        return new SyncInvoker<RestartClusterRequest, RestartClusterResponse>(request, DwsMeta.restartCluster,
            hcClient);
    }

    /** 恢复集群 该接口用于使用快照恢复集群。
     *
     * @param RestoreClusterRequest 请求对象
     * @return RestoreClusterResponse */
    public RestoreClusterResponse restoreCluster(RestoreClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restoreCluster);
    }

    /** 恢复集群 该接口用于使用快照恢复集群。
     *
     * @param RestoreClusterRequest 请求对象
     * @return SyncInvoker<RestoreClusterRequest, RestoreClusterResponse> */
    public SyncInvoker<RestoreClusterRequest, RestoreClusterResponse> restoreClusterInvoker(
        RestoreClusterRequest request) {
        return new SyncInvoker<RestoreClusterRequest, RestoreClusterResponse>(request, DwsMeta.restoreCluster,
            hcClient);
    }

}

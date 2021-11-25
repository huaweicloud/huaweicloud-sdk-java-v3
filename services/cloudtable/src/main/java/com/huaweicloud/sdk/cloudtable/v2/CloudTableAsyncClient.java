package com.huaweicloud.sdk.cloudtable.v2;

import com.huaweicloud.sdk.cloudtable.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudTableAsyncClient {

    protected HcClient hcClient;

    public CloudTableAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudTableAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudTableAsyncClient::new);
    }

    /** 创建CloudTable集群 创建一个CloudTable集群。 使用接口前，您需要先获取如下资源信息。 - 通过VPC创建或查询VPC、子网 - 通过安全组创建或查询可用的security_group_id
     * 本接口是一个同步接口，当创建CloudTable集群成功后会返回集群id。
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse> */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.createCluster);
    }

    /** 创建CloudTable集群 创建一个CloudTable集群。 使用接口前，您需要先获取如下资源信息。 - 通过VPC创建或查询VPC、子网 - 通过安全组创建或查询可用的security_group_id
     * 本接口是一个同步接口，当创建CloudTable集群成功后会返回集群id。
     *
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse> */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CloudTableMeta.createCluster,
            hcClient);
    }

    /** 删除CloudTable指定集群 集群ID为集群唯一标识，根据集群ID删除指定集群。 如下状态的集群不允许删除： - 创建中 - 扩容中
     *
     * @param DeleteClusterRequest 请求对象
     * @return CompletableFuture<DeleteClusterResponse> */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.deleteCluster);
    }

    /** 删除CloudTable指定集群 集群ID为集群唯一标识，根据集群ID删除指定集群。 如下状态的集群不允许删除： - 创建中 - 扩容中
     *
     * @param DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CloudTableMeta.deleteCluster,
            hcClient);
    }

    /** 查询CloudTable集群列表 查看用户创建的集群列表信息。
     *
     * @param ListClustersRequest 请求对象
     * @return CompletableFuture<ListClustersResponse> */
    public CompletableFuture<ListClustersResponse> listClustersAsync(ListClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.listClusters);
    }

    /** 查询CloudTable集群列表 查看用户创建的集群列表信息。
     *
     * @param ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse> */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(
        ListClustersRequest request) {
        return new AsyncInvoker<ListClustersRequest, ListClustersResponse>(request, CloudTableMeta.listClusters,
            hcClient);
    }

    /** 查询CloudTable集群详情 通过集群ID唯一标识一个集群，根据集群ID查询特定CloudTable集群的详情信息。
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return CompletableFuture<ShowClusterDetailResponse> */
    public CompletableFuture<ShowClusterDetailResponse> showClusterDetailAsync(ShowClusterDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.showClusterDetail);
    }

    /** 查询CloudTable集群详情 通过集群ID唯一标识一个集群，根据集群ID查询特定CloudTable集群的详情信息。
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> */
    public AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailAsyncInvoker(
        ShowClusterDetailRequest request) {
        return new AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>(request,
            CloudTableMeta.showClusterDetail, hcClient);
    }

}
